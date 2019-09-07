<!---
Copyright 2015 Karl Bennett

Licensed under the Apache License, Version 2.0 (the "License");
you may not use this file except in compliance with the License.
You may obtain a copy of the License at

    http://www.apache.org/licenses/LICENSE-2.0

Unless required by applicable law or agreed to in writing, software
distributed under the License is distributed on an "AS IS" BASIS,
WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
See the License for the specific language governing permissions and
limitations under the License.
-->
smt-cloudformation-parent
===========
[![Build Status](https://travis-ci.org/shiver-me-timbers/smt-cloudformation-parent.svg)](https://travis-ci.org/shiver-me-timbers/smt-cloudformation-parent)
[![Coverage Status](https://coveralls.io/repos/shiver-me-timbers/smt-cloudformation-parent/badge.svg?branch=master&service=github)](https://coveralls.io/github/shiver-me-timbers/smt-cloudformation-parent?branch=master)
[![Maven Central](https://maven-badges.herokuapp.com/maven-central/com.github.shiver-me-timbers.aws.cloudformation/smt-cloudformation-parent/badge.svg)](https://maven-badges.herokuapp.com/maven-central/com.github.shiver-me-timbers.aws.cloudformation/smt-cloudformation-parent/)

## What

This library is a complete mapping of the [AWS CloudFormation Resource Specification](https://d1uauaxba7bl26.cloudfront.net/latest/gzip/CloudFormationResourceSpecification.json)
into Java objects. The objects have been generated directly from the specification so should be a direct one to one 
mapping.

## Why

CloudFormation templates can be rather difficult to create because of the need to go back and forth from the template 
and the resource documentation. Also small syntax mistakes will not be found until the template is run which is a slow 
feedback loop.

Having all the CloudFormation constructs mapped into type safe Java objects allows the resources to have a level of self 
documentation and much easier discovery through IDE autocompletion. It also provides realtime validation through the 
type safety of the Java objects.

Lastly, the objects can be used to create higher order constructs that can be shared and reused as Java libraries. This 
improves the maintenance of your templates as they can be simplified by encapsulating their complexity into simpler 
reusable components.

## How

All the objects in this library can be serialised using the [Jackson JSON library](https://github.com/FasterXML/jackson), 
including the 
[Intrinsic Functions](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/intrinsic-function-reference.html).

So all that is required is to create a new [Template](smt-cloudformation-objects/src/main/java/aws/Template.java) object 
and populate it with the details and resources you need.

### Creating a Template object

A simple way to create new template object is to extend the `Template` class. The following class can be serialised to 
JSON with the Jackson library and it will produce a valid CloudFormation template. 

```java
import aws.Output;
import aws.Parameter;
import aws.Template;
import aws.s3.Bucket;
import aws.s3.BucketResource;

import static aws.fn.Functions.fnGetAtt;
import static aws.s3.BucketAttributes.ARN;
import static aws.s3.BucketAttributes.DOMAIN_NAME;
import static aws.s3.BucketAttributes.WEBSITE_URL;

public class S3Template extends Template {

    public S3Template() {
        final Parameter name = new Parameter("Name");
        final BucketResource bucket = new BucketResource("S3Bucket");
        withParameters(name);
        withResources(bucket.withProperties(
            new Bucket().withBucketName(name.ref())
        ));
        withOutputs(
            new Output("BucketName").withValue(bucket.ref()),
            new Output("BucketDomainName").withValue(fnGetAtt(bucket, DOMAIN_NAME)),
            new Output("BucketWebsiteUrl").withValue(fnGetAtt(bucket, WEBSITE_URL)),
            new Output("BucketArn").withValue(fnGetAtt(bucket, ARN))
        );
    }
} 
```

### Intrinsic Functions

All of the CloudFormation [Intrinsic Functions](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/intrinsic-function-reference.html)
have also been mapped exception for [Transform](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/intrinsic-function-reference-transform.html).
Transform hasn't been mapped because the functionality it provides can now be solved through Java and this library 
instead. If at any time new functions are added and you find that they are not supported by this library please raise an 
issue.

#### Fn::Base64

```java
aws.fn.Functions.fnBase64("some string")
```

#### Fn::Cidr

```java
aws.fn.Functions.fnCidr("192.168.0.0/24", "6", "5")
```

#### Condition Functions

```java
import aws.Condition;
import aws.Parameter;
import aws.Template;
import aws.s3.Bucket;
import aws.s3.BucketResource;

import static aws.fn.Functions.fnEquals;
import static aws.fn.Functions.fnIf;

public class S3Template extends Template {

    public S3Template() {
        final Parameter name = new Parameter("Name");
        final Condition notNamed = new Condition("NotNamed", fnEquals(name.ref(), ""));
        final BucketResource bucket = new BucketResource("S3Bucket");
        withParameters(name);
        withConditions(notNamed);
        withResources(bucket.withProperties(
            new Bucket().withBucketName(
                fnIf(notNamed, "DefaultName", name.ref())
            )
        ));
    }
}
```

#### Fn::FindInMap

```java
import aws.Parameter;
import aws.Template;
import aws.s3.Bucket;
import aws.s3.BucketResource;

import java.util.HashMap;
import java.util.Map;

import static aws.fn.Functions.fnFindInMap;
import static aws.fn.Functions.ref;
import static java.util.Collections.singletonMap;

public class S3Template extends Template {

    public S3Template() {
        final Parameter name = new Parameter("Name");
        final BucketResource bucket = new BucketResource("S3Bucket");
        withParameters(name);
        withMappings(new HashMap<String, Map<String, Map<String, String>>>() {{
            put("BucketNames", new HashMap<String, Map<String, String>>() {{
                put("ap-southeast-2", singletonMap("Name", "AuBucket"));
                put("us-east-1", singletonMap("Name", "UsBucket"));
            }});
        }});
        withResources(bucket.withProperties(
            new Bucket().withBucketName(fnFindInMap("BucketNames", ref("AWS::Region"), "Name"))
        ));
    }
}
```

#### Fn::GetAtt

```java
aws.fn.Functions.fnGetAtt(new BucketResource("S3Bucket"), BucketAttributes.ARN)
```

#### Fn::GetAZs

```java
aws.fn.Functions.fnGetAZs(aws.fn.Functions.ref("AWS::Region"))
```

#### Fn::ImportValue

```java
aws.fn.Functions.fnImportValue("ExportedValue")
```

#### Fn::Join

```java
aws.fn.Functions.fnJoin(":", "a", "b", "c")
```

#### Fn::Select

```java
aws.fn.Functions.fnSelect(1, "apples", "grapes", "oranges", "mangoes")
```

#### Fn::Split

```java
aws.fn.Functions.fnSplit("|", "a|b|c")
```

#### Fn::Sub

```java
aws.fn.Functions.fnSub("www.${Domain}", singletonMap("Domain", ref("RootDomainName")))
```

#### Ref

```java
aws.fn.Functions.ref("AWS::Region")
```

### Idiosyncrasies

The primitive property types have been mapped in a way that you may not expect, they are as follows:
```
String -> java.lang.CharSequence
Integer, Double -> java.lang.Number
Boolean -> java.lang.CharSequence
```

This mapping is to allow the use of Intrinsic Functions in the values of primitive properties. Unfortunately the 
`java.lang.Boolean` type is final so cannot be extended, this means `Boolean` values must be set with strings. 