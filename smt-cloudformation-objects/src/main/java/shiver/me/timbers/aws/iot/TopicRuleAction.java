
package shiver.me.timbers.aws.iot;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyDescription;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;
import org.apache.commons.lang.builder.ToStringBuilder;
import shiver.me.timbers.aws.Property;


/**
 * TopicRuleAction
 * <p>
 * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iot-topicrule-action.html
 * 
 */
@JsonInclude(JsonInclude.Include.NON_EMPTY)
@JsonPropertyOrder({
    "CloudwatchAlarm",
    "CloudwatchMetric",
    "DynamoDB",
    "DynamoDBv2",
    "Elasticsearch",
    "Firehose",
    "Http",
    "IotAnalytics",
    "IotEvents",
    "IotSiteWise",
    "Kinesis",
    "Lambda",
    "Republish",
    "S3",
    "Sns",
    "Sqs",
    "StepFunctions"
})
public class TopicRuleAction implements Property<TopicRuleAction>
{

    /**
     * TopicRuleCloudwatchAlarmAction
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iot-topicrule-cloudwatchalarmaction.html
     * 
     */
    @JsonProperty("CloudwatchAlarm")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iot-topicrule-cloudwatchalarmaction.html")
    private Property<TopicRuleCloudwatchAlarmAction> cloudwatchAlarm;
    /**
     * TopicRuleCloudwatchMetricAction
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iot-topicrule-cloudwatchmetricaction.html
     * 
     */
    @JsonProperty("CloudwatchMetric")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iot-topicrule-cloudwatchmetricaction.html")
    private Property<TopicRuleCloudwatchMetricAction> cloudwatchMetric;
    /**
     * TopicRuleDynamoDBAction
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iot-topicrule-dynamodbaction.html
     * 
     */
    @JsonProperty("DynamoDB")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iot-topicrule-dynamodbaction.html")
    private Property<TopicRuleDynamoDBAction> dynamoDB;
    /**
     * TopicRuleDynamoDBv2Action
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iot-topicrule-dynamodbv2action.html
     * 
     */
    @JsonProperty("DynamoDBv2")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iot-topicrule-dynamodbv2action.html")
    private Property<TopicRuleDynamoDBv2Action> dynamoDBv2;
    /**
     * TopicRuleElasticsearchAction
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iot-topicrule-elasticsearchaction.html
     * 
     */
    @JsonProperty("Elasticsearch")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iot-topicrule-elasticsearchaction.html")
    private Property<TopicRuleElasticsearchAction> elasticsearch;
    /**
     * TopicRuleFirehoseAction
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iot-topicrule-firehoseaction.html
     * 
     */
    @JsonProperty("Firehose")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iot-topicrule-firehoseaction.html")
    private Property<TopicRuleFirehoseAction> firehose;
    /**
     * TopicRuleHttpAction
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iot-topicrule-httpaction.html
     * 
     */
    @JsonProperty("Http")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iot-topicrule-httpaction.html")
    private Property<TopicRuleHttpAction> http;
    /**
     * TopicRuleIotAnalyticsAction
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iot-topicrule-iotanalyticsaction.html
     * 
     */
    @JsonProperty("IotAnalytics")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iot-topicrule-iotanalyticsaction.html")
    private Property<TopicRuleIotAnalyticsAction> iotAnalytics;
    /**
     * TopicRuleIotEventsAction
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iot-topicrule-ioteventsaction.html
     * 
     */
    @JsonProperty("IotEvents")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iot-topicrule-ioteventsaction.html")
    private Property<TopicRuleIotEventsAction> iotEvents;
    /**
     * TopicRuleIotSiteWiseAction
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iot-topicrule-iotsitewiseaction.html
     * 
     */
    @JsonProperty("IotSiteWise")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iot-topicrule-iotsitewiseaction.html")
    private Property<TopicRuleIotSiteWiseAction> iotSiteWise;
    /**
     * TopicRuleKinesisAction
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iot-topicrule-kinesisaction.html
     * 
     */
    @JsonProperty("Kinesis")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iot-topicrule-kinesisaction.html")
    private Property<TopicRuleKinesisAction> kinesis;
    /**
     * TopicRuleLambdaAction
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iot-topicrule-lambdaaction.html
     * 
     */
    @JsonProperty("Lambda")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iot-topicrule-lambdaaction.html")
    private Property<TopicRuleLambdaAction> lambda;
    /**
     * TopicRuleRepublishAction
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iot-topicrule-republishaction.html
     * 
     */
    @JsonProperty("Republish")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iot-topicrule-republishaction.html")
    private Property<TopicRuleRepublishAction> republish;
    /**
     * TopicRuleS3Action
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iot-topicrule-s3action.html
     * 
     */
    @JsonProperty("S3")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iot-topicrule-s3action.html")
    private Property<TopicRuleS3Action> s3;
    /**
     * TopicRuleSnsAction
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iot-topicrule-snsaction.html
     * 
     */
    @JsonProperty("Sns")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iot-topicrule-snsaction.html")
    private Property<TopicRuleSnsAction> sns;
    /**
     * TopicRuleSqsAction
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iot-topicrule-sqsaction.html
     * 
     */
    @JsonProperty("Sqs")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iot-topicrule-sqsaction.html")
    private Property<TopicRuleSqsAction> sqs;
    /**
     * TopicRuleStepFunctionsAction
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iot-topicrule-stepfunctionsaction.html
     * 
     */
    @JsonProperty("StepFunctions")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iot-topicrule-stepfunctionsaction.html")
    private Property<TopicRuleStepFunctionsAction> stepFunctions;

    /**
     * TopicRuleCloudwatchAlarmAction
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iot-topicrule-cloudwatchalarmaction.html
     * 
     */
    @JsonIgnore
    public Property<TopicRuleCloudwatchAlarmAction> getCloudwatchAlarm() {
        return cloudwatchAlarm;
    }

    /**
     * TopicRuleCloudwatchAlarmAction
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iot-topicrule-cloudwatchalarmaction.html
     * 
     */
    @JsonIgnore
    public void setCloudwatchAlarm(Property<TopicRuleCloudwatchAlarmAction> cloudwatchAlarm) {
        this.cloudwatchAlarm = cloudwatchAlarm;
    }

    public TopicRuleAction withCloudwatchAlarm(Property<TopicRuleCloudwatchAlarmAction> cloudwatchAlarm) {
        this.cloudwatchAlarm = cloudwatchAlarm;
        return this;
    }

    /**
     * TopicRuleCloudwatchMetricAction
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iot-topicrule-cloudwatchmetricaction.html
     * 
     */
    @JsonIgnore
    public Property<TopicRuleCloudwatchMetricAction> getCloudwatchMetric() {
        return cloudwatchMetric;
    }

    /**
     * TopicRuleCloudwatchMetricAction
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iot-topicrule-cloudwatchmetricaction.html
     * 
     */
    @JsonIgnore
    public void setCloudwatchMetric(Property<TopicRuleCloudwatchMetricAction> cloudwatchMetric) {
        this.cloudwatchMetric = cloudwatchMetric;
    }

    public TopicRuleAction withCloudwatchMetric(Property<TopicRuleCloudwatchMetricAction> cloudwatchMetric) {
        this.cloudwatchMetric = cloudwatchMetric;
        return this;
    }

    /**
     * TopicRuleDynamoDBAction
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iot-topicrule-dynamodbaction.html
     * 
     */
    @JsonIgnore
    public Property<TopicRuleDynamoDBAction> getDynamoDB() {
        return dynamoDB;
    }

    /**
     * TopicRuleDynamoDBAction
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iot-topicrule-dynamodbaction.html
     * 
     */
    @JsonIgnore
    public void setDynamoDB(Property<TopicRuleDynamoDBAction> dynamoDB) {
        this.dynamoDB = dynamoDB;
    }

    public TopicRuleAction withDynamoDB(Property<TopicRuleDynamoDBAction> dynamoDB) {
        this.dynamoDB = dynamoDB;
        return this;
    }

    /**
     * TopicRuleDynamoDBv2Action
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iot-topicrule-dynamodbv2action.html
     * 
     */
    @JsonIgnore
    public Property<TopicRuleDynamoDBv2Action> getDynamoDBv2() {
        return dynamoDBv2;
    }

    /**
     * TopicRuleDynamoDBv2Action
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iot-topicrule-dynamodbv2action.html
     * 
     */
    @JsonIgnore
    public void setDynamoDBv2(Property<TopicRuleDynamoDBv2Action> dynamoDBv2) {
        this.dynamoDBv2 = dynamoDBv2;
    }

    public TopicRuleAction withDynamoDBv2(Property<TopicRuleDynamoDBv2Action> dynamoDBv2) {
        this.dynamoDBv2 = dynamoDBv2;
        return this;
    }

    /**
     * TopicRuleElasticsearchAction
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iot-topicrule-elasticsearchaction.html
     * 
     */
    @JsonIgnore
    public Property<TopicRuleElasticsearchAction> getElasticsearch() {
        return elasticsearch;
    }

    /**
     * TopicRuleElasticsearchAction
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iot-topicrule-elasticsearchaction.html
     * 
     */
    @JsonIgnore
    public void setElasticsearch(Property<TopicRuleElasticsearchAction> elasticsearch) {
        this.elasticsearch = elasticsearch;
    }

    public TopicRuleAction withElasticsearch(Property<TopicRuleElasticsearchAction> elasticsearch) {
        this.elasticsearch = elasticsearch;
        return this;
    }

    /**
     * TopicRuleFirehoseAction
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iot-topicrule-firehoseaction.html
     * 
     */
    @JsonIgnore
    public Property<TopicRuleFirehoseAction> getFirehose() {
        return firehose;
    }

    /**
     * TopicRuleFirehoseAction
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iot-topicrule-firehoseaction.html
     * 
     */
    @JsonIgnore
    public void setFirehose(Property<TopicRuleFirehoseAction> firehose) {
        this.firehose = firehose;
    }

    public TopicRuleAction withFirehose(Property<TopicRuleFirehoseAction> firehose) {
        this.firehose = firehose;
        return this;
    }

    /**
     * TopicRuleHttpAction
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iot-topicrule-httpaction.html
     * 
     */
    @JsonIgnore
    public Property<TopicRuleHttpAction> getHttp() {
        return http;
    }

    /**
     * TopicRuleHttpAction
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iot-topicrule-httpaction.html
     * 
     */
    @JsonIgnore
    public void setHttp(Property<TopicRuleHttpAction> http) {
        this.http = http;
    }

    public TopicRuleAction withHttp(Property<TopicRuleHttpAction> http) {
        this.http = http;
        return this;
    }

    /**
     * TopicRuleIotAnalyticsAction
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iot-topicrule-iotanalyticsaction.html
     * 
     */
    @JsonIgnore
    public Property<TopicRuleIotAnalyticsAction> getIotAnalytics() {
        return iotAnalytics;
    }

    /**
     * TopicRuleIotAnalyticsAction
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iot-topicrule-iotanalyticsaction.html
     * 
     */
    @JsonIgnore
    public void setIotAnalytics(Property<TopicRuleIotAnalyticsAction> iotAnalytics) {
        this.iotAnalytics = iotAnalytics;
    }

    public TopicRuleAction withIotAnalytics(Property<TopicRuleIotAnalyticsAction> iotAnalytics) {
        this.iotAnalytics = iotAnalytics;
        return this;
    }

    /**
     * TopicRuleIotEventsAction
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iot-topicrule-ioteventsaction.html
     * 
     */
    @JsonIgnore
    public Property<TopicRuleIotEventsAction> getIotEvents() {
        return iotEvents;
    }

    /**
     * TopicRuleIotEventsAction
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iot-topicrule-ioteventsaction.html
     * 
     */
    @JsonIgnore
    public void setIotEvents(Property<TopicRuleIotEventsAction> iotEvents) {
        this.iotEvents = iotEvents;
    }

    public TopicRuleAction withIotEvents(Property<TopicRuleIotEventsAction> iotEvents) {
        this.iotEvents = iotEvents;
        return this;
    }

    /**
     * TopicRuleIotSiteWiseAction
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iot-topicrule-iotsitewiseaction.html
     * 
     */
    @JsonIgnore
    public Property<TopicRuleIotSiteWiseAction> getIotSiteWise() {
        return iotSiteWise;
    }

    /**
     * TopicRuleIotSiteWiseAction
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iot-topicrule-iotsitewiseaction.html
     * 
     */
    @JsonIgnore
    public void setIotSiteWise(Property<TopicRuleIotSiteWiseAction> iotSiteWise) {
        this.iotSiteWise = iotSiteWise;
    }

    public TopicRuleAction withIotSiteWise(Property<TopicRuleIotSiteWiseAction> iotSiteWise) {
        this.iotSiteWise = iotSiteWise;
        return this;
    }

    /**
     * TopicRuleKinesisAction
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iot-topicrule-kinesisaction.html
     * 
     */
    @JsonIgnore
    public Property<TopicRuleKinesisAction> getKinesis() {
        return kinesis;
    }

    /**
     * TopicRuleKinesisAction
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iot-topicrule-kinesisaction.html
     * 
     */
    @JsonIgnore
    public void setKinesis(Property<TopicRuleKinesisAction> kinesis) {
        this.kinesis = kinesis;
    }

    public TopicRuleAction withKinesis(Property<TopicRuleKinesisAction> kinesis) {
        this.kinesis = kinesis;
        return this;
    }

    /**
     * TopicRuleLambdaAction
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iot-topicrule-lambdaaction.html
     * 
     */
    @JsonIgnore
    public Property<TopicRuleLambdaAction> getLambda() {
        return lambda;
    }

    /**
     * TopicRuleLambdaAction
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iot-topicrule-lambdaaction.html
     * 
     */
    @JsonIgnore
    public void setLambda(Property<TopicRuleLambdaAction> lambda) {
        this.lambda = lambda;
    }

    public TopicRuleAction withLambda(Property<TopicRuleLambdaAction> lambda) {
        this.lambda = lambda;
        return this;
    }

    /**
     * TopicRuleRepublishAction
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iot-topicrule-republishaction.html
     * 
     */
    @JsonIgnore
    public Property<TopicRuleRepublishAction> getRepublish() {
        return republish;
    }

    /**
     * TopicRuleRepublishAction
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iot-topicrule-republishaction.html
     * 
     */
    @JsonIgnore
    public void setRepublish(Property<TopicRuleRepublishAction> republish) {
        this.republish = republish;
    }

    public TopicRuleAction withRepublish(Property<TopicRuleRepublishAction> republish) {
        this.republish = republish;
        return this;
    }

    /**
     * TopicRuleS3Action
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iot-topicrule-s3action.html
     * 
     */
    @JsonIgnore
    public Property<TopicRuleS3Action> getS3() {
        return s3;
    }

    /**
     * TopicRuleS3Action
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iot-topicrule-s3action.html
     * 
     */
    @JsonIgnore
    public void setS3(Property<TopicRuleS3Action> s3) {
        this.s3 = s3;
    }

    public TopicRuleAction withS3(Property<TopicRuleS3Action> s3) {
        this.s3 = s3;
        return this;
    }

    /**
     * TopicRuleSnsAction
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iot-topicrule-snsaction.html
     * 
     */
    @JsonIgnore
    public Property<TopicRuleSnsAction> getSns() {
        return sns;
    }

    /**
     * TopicRuleSnsAction
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iot-topicrule-snsaction.html
     * 
     */
    @JsonIgnore
    public void setSns(Property<TopicRuleSnsAction> sns) {
        this.sns = sns;
    }

    public TopicRuleAction withSns(Property<TopicRuleSnsAction> sns) {
        this.sns = sns;
        return this;
    }

    /**
     * TopicRuleSqsAction
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iot-topicrule-sqsaction.html
     * 
     */
    @JsonIgnore
    public Property<TopicRuleSqsAction> getSqs() {
        return sqs;
    }

    /**
     * TopicRuleSqsAction
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iot-topicrule-sqsaction.html
     * 
     */
    @JsonIgnore
    public void setSqs(Property<TopicRuleSqsAction> sqs) {
        this.sqs = sqs;
    }

    public TopicRuleAction withSqs(Property<TopicRuleSqsAction> sqs) {
        this.sqs = sqs;
        return this;
    }

    /**
     * TopicRuleStepFunctionsAction
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iot-topicrule-stepfunctionsaction.html
     * 
     */
    @JsonIgnore
    public Property<TopicRuleStepFunctionsAction> getStepFunctions() {
        return stepFunctions;
    }

    /**
     * TopicRuleStepFunctionsAction
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iot-topicrule-stepfunctionsaction.html
     * 
     */
    @JsonIgnore
    public void setStepFunctions(Property<TopicRuleStepFunctionsAction> stepFunctions) {
        this.stepFunctions = stepFunctions;
    }

    public TopicRuleAction withStepFunctions(Property<TopicRuleStepFunctionsAction> stepFunctions) {
        this.stepFunctions = stepFunctions;
        return this;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this).append("cloudwatchAlarm", cloudwatchAlarm).append("cloudwatchMetric", cloudwatchMetric).append("dynamoDB", dynamoDB).append("dynamoDBv2", dynamoDBv2).append("elasticsearch", elasticsearch).append("firehose", firehose).append("http", http).append("iotAnalytics", iotAnalytics).append("iotEvents", iotEvents).append("iotSiteWise", iotSiteWise).append("kinesis", kinesis).append("lambda", lambda).append("republish", republish).append("s3", s3).append("sns", sns).append("sqs", sqs).append("stepFunctions", stepFunctions).toString();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(s3).append(firehose).append(dynamoDBv2).append(stepFunctions).append(kinesis).append(dynamoDB).append(iotAnalytics).append(lambda).append(elasticsearch).append(iotEvents).append(republish).append(sqs).append(cloudwatchAlarm).append(http).append(sns).append(iotSiteWise).append(cloudwatchMetric).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof TopicRuleAction) == false) {
            return false;
        }
        TopicRuleAction rhs = ((TopicRuleAction) other);
        return new EqualsBuilder().append(s3, rhs.s3).append(firehose, rhs.firehose).append(dynamoDBv2, rhs.dynamoDBv2).append(stepFunctions, rhs.stepFunctions).append(kinesis, rhs.kinesis).append(dynamoDB, rhs.dynamoDB).append(iotAnalytics, rhs.iotAnalytics).append(lambda, rhs.lambda).append(elasticsearch, rhs.elasticsearch).append(iotEvents, rhs.iotEvents).append(republish, rhs.republish).append(sqs, rhs.sqs).append(cloudwatchAlarm, rhs.cloudwatchAlarm).append(http, rhs.http).append(sns, rhs.sns).append(iotSiteWise, rhs.iotSiteWise).append(cloudwatchMetric, rhs.cloudwatchMetric).isEquals();
    }

}
