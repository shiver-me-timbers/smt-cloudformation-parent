
package aws.iot;

import aws.Property;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyDescription;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;
import org.apache.commons.lang.builder.ToStringBuilder;


/**
 * Action
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
    "IotAnalytics",
    "Kinesis",
    "Lambda",
    "Republish",
    "S3",
    "Sns",
    "Sqs",
    "StepFunctions"
})
public class Action implements Property<Action>
{

    /**
     * CloudwatchAlarmAction
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iot-topicrule-cloudwatchalarmaction.html
     * 
     */
    @JsonProperty("CloudwatchAlarm")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iot-topicrule-cloudwatchalarmaction.html")
    private Property<CloudwatchAlarmAction> cloudwatchAlarm;
    /**
     * CloudwatchMetricAction
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iot-topicrule-cloudwatchmetricaction.html
     * 
     */
    @JsonProperty("CloudwatchMetric")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iot-topicrule-cloudwatchmetricaction.html")
    private Property<CloudwatchMetricAction> cloudwatchMetric;
    /**
     * DynamoDBAction
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iot-topicrule-dynamodbaction.html
     * 
     */
    @JsonProperty("DynamoDB")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iot-topicrule-dynamodbaction.html")
    private Property<DynamoDBAction> dynamoDB;
    /**
     * DynamoDBv2Action
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iot-topicrule-dynamodbv2action.html
     * 
     */
    @JsonProperty("DynamoDBv2")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iot-topicrule-dynamodbv2action.html")
    private Property<DynamoDBv2Action> dynamoDBv2;
    /**
     * ElasticsearchAction
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iot-topicrule-elasticsearchaction.html
     * 
     */
    @JsonProperty("Elasticsearch")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iot-topicrule-elasticsearchaction.html")
    private Property<ElasticsearchAction> elasticsearch;
    /**
     * FirehoseAction
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iot-topicrule-firehoseaction.html
     * 
     */
    @JsonProperty("Firehose")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iot-topicrule-firehoseaction.html")
    private Property<FirehoseAction> firehose;
    /**
     * IotAnalyticsAction
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iot-topicrule-iotanalyticsaction.html
     * 
     */
    @JsonProperty("IotAnalytics")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iot-topicrule-iotanalyticsaction.html")
    private Property<IotAnalyticsAction> iotAnalytics;
    /**
     * KinesisAction
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iot-topicrule-kinesisaction.html
     * 
     */
    @JsonProperty("Kinesis")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iot-topicrule-kinesisaction.html")
    private Property<KinesisAction> kinesis;
    /**
     * LambdaAction
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iot-topicrule-lambdaaction.html
     * 
     */
    @JsonProperty("Lambda")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iot-topicrule-lambdaaction.html")
    private Property<LambdaAction> lambda;
    /**
     * RepublishAction
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iot-topicrule-republishaction.html
     * 
     */
    @JsonProperty("Republish")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iot-topicrule-republishaction.html")
    private Property<RepublishAction> republish;
    /**
     * S3Action
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iot-topicrule-s3action.html
     * 
     */
    @JsonProperty("S3")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iot-topicrule-s3action.html")
    private Property<S3Action> s3;
    /**
     * SnsAction
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iot-topicrule-snsaction.html
     * 
     */
    @JsonProperty("Sns")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iot-topicrule-snsaction.html")
    private Property<SnsAction> sns;
    /**
     * SqsAction
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iot-topicrule-sqsaction.html
     * 
     */
    @JsonProperty("Sqs")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iot-topicrule-sqsaction.html")
    private Property<SqsAction> sqs;
    /**
     * StepFunctionsAction
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iot-topicrule-stepfunctionsaction.html
     * 
     */
    @JsonProperty("StepFunctions")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iot-topicrule-stepfunctionsaction.html")
    private Property<StepFunctionsAction> stepFunctions;

    /**
     * CloudwatchAlarmAction
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iot-topicrule-cloudwatchalarmaction.html
     * 
     */
    @JsonIgnore
    public Property<CloudwatchAlarmAction> getCloudwatchAlarm() {
        return cloudwatchAlarm;
    }

    /**
     * CloudwatchAlarmAction
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iot-topicrule-cloudwatchalarmaction.html
     * 
     */
    @JsonIgnore
    public void setCloudwatchAlarm(Property<CloudwatchAlarmAction> cloudwatchAlarm) {
        this.cloudwatchAlarm = cloudwatchAlarm;
    }

    public Action withCloudwatchAlarm(Property<CloudwatchAlarmAction> cloudwatchAlarm) {
        this.cloudwatchAlarm = cloudwatchAlarm;
        return this;
    }

    /**
     * CloudwatchMetricAction
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iot-topicrule-cloudwatchmetricaction.html
     * 
     */
    @JsonIgnore
    public Property<CloudwatchMetricAction> getCloudwatchMetric() {
        return cloudwatchMetric;
    }

    /**
     * CloudwatchMetricAction
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iot-topicrule-cloudwatchmetricaction.html
     * 
     */
    @JsonIgnore
    public void setCloudwatchMetric(Property<CloudwatchMetricAction> cloudwatchMetric) {
        this.cloudwatchMetric = cloudwatchMetric;
    }

    public Action withCloudwatchMetric(Property<CloudwatchMetricAction> cloudwatchMetric) {
        this.cloudwatchMetric = cloudwatchMetric;
        return this;
    }

    /**
     * DynamoDBAction
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iot-topicrule-dynamodbaction.html
     * 
     */
    @JsonIgnore
    public Property<DynamoDBAction> getDynamoDB() {
        return dynamoDB;
    }

    /**
     * DynamoDBAction
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iot-topicrule-dynamodbaction.html
     * 
     */
    @JsonIgnore
    public void setDynamoDB(Property<DynamoDBAction> dynamoDB) {
        this.dynamoDB = dynamoDB;
    }

    public Action withDynamoDB(Property<DynamoDBAction> dynamoDB) {
        this.dynamoDB = dynamoDB;
        return this;
    }

    /**
     * DynamoDBv2Action
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iot-topicrule-dynamodbv2action.html
     * 
     */
    @JsonIgnore
    public Property<DynamoDBv2Action> getDynamoDBv2() {
        return dynamoDBv2;
    }

    /**
     * DynamoDBv2Action
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iot-topicrule-dynamodbv2action.html
     * 
     */
    @JsonIgnore
    public void setDynamoDBv2(Property<DynamoDBv2Action> dynamoDBv2) {
        this.dynamoDBv2 = dynamoDBv2;
    }

    public Action withDynamoDBv2(Property<DynamoDBv2Action> dynamoDBv2) {
        this.dynamoDBv2 = dynamoDBv2;
        return this;
    }

    /**
     * ElasticsearchAction
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iot-topicrule-elasticsearchaction.html
     * 
     */
    @JsonIgnore
    public Property<ElasticsearchAction> getElasticsearch() {
        return elasticsearch;
    }

    /**
     * ElasticsearchAction
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iot-topicrule-elasticsearchaction.html
     * 
     */
    @JsonIgnore
    public void setElasticsearch(Property<ElasticsearchAction> elasticsearch) {
        this.elasticsearch = elasticsearch;
    }

    public Action withElasticsearch(Property<ElasticsearchAction> elasticsearch) {
        this.elasticsearch = elasticsearch;
        return this;
    }

    /**
     * FirehoseAction
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iot-topicrule-firehoseaction.html
     * 
     */
    @JsonIgnore
    public Property<FirehoseAction> getFirehose() {
        return firehose;
    }

    /**
     * FirehoseAction
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iot-topicrule-firehoseaction.html
     * 
     */
    @JsonIgnore
    public void setFirehose(Property<FirehoseAction> firehose) {
        this.firehose = firehose;
    }

    public Action withFirehose(Property<FirehoseAction> firehose) {
        this.firehose = firehose;
        return this;
    }

    /**
     * IotAnalyticsAction
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iot-topicrule-iotanalyticsaction.html
     * 
     */
    @JsonIgnore
    public Property<IotAnalyticsAction> getIotAnalytics() {
        return iotAnalytics;
    }

    /**
     * IotAnalyticsAction
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iot-topicrule-iotanalyticsaction.html
     * 
     */
    @JsonIgnore
    public void setIotAnalytics(Property<IotAnalyticsAction> iotAnalytics) {
        this.iotAnalytics = iotAnalytics;
    }

    public Action withIotAnalytics(Property<IotAnalyticsAction> iotAnalytics) {
        this.iotAnalytics = iotAnalytics;
        return this;
    }

    /**
     * KinesisAction
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iot-topicrule-kinesisaction.html
     * 
     */
    @JsonIgnore
    public Property<KinesisAction> getKinesis() {
        return kinesis;
    }

    /**
     * KinesisAction
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iot-topicrule-kinesisaction.html
     * 
     */
    @JsonIgnore
    public void setKinesis(Property<KinesisAction> kinesis) {
        this.kinesis = kinesis;
    }

    public Action withKinesis(Property<KinesisAction> kinesis) {
        this.kinesis = kinesis;
        return this;
    }

    /**
     * LambdaAction
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iot-topicrule-lambdaaction.html
     * 
     */
    @JsonIgnore
    public Property<LambdaAction> getLambda() {
        return lambda;
    }

    /**
     * LambdaAction
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iot-topicrule-lambdaaction.html
     * 
     */
    @JsonIgnore
    public void setLambda(Property<LambdaAction> lambda) {
        this.lambda = lambda;
    }

    public Action withLambda(Property<LambdaAction> lambda) {
        this.lambda = lambda;
        return this;
    }

    /**
     * RepublishAction
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iot-topicrule-republishaction.html
     * 
     */
    @JsonIgnore
    public Property<RepublishAction> getRepublish() {
        return republish;
    }

    /**
     * RepublishAction
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iot-topicrule-republishaction.html
     * 
     */
    @JsonIgnore
    public void setRepublish(Property<RepublishAction> republish) {
        this.republish = republish;
    }

    public Action withRepublish(Property<RepublishAction> republish) {
        this.republish = republish;
        return this;
    }

    /**
     * S3Action
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iot-topicrule-s3action.html
     * 
     */
    @JsonIgnore
    public Property<S3Action> getS3() {
        return s3;
    }

    /**
     * S3Action
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iot-topicrule-s3action.html
     * 
     */
    @JsonIgnore
    public void setS3(Property<S3Action> s3) {
        this.s3 = s3;
    }

    public Action withS3(Property<S3Action> s3) {
        this.s3 = s3;
        return this;
    }

    /**
     * SnsAction
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iot-topicrule-snsaction.html
     * 
     */
    @JsonIgnore
    public Property<SnsAction> getSns() {
        return sns;
    }

    /**
     * SnsAction
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iot-topicrule-snsaction.html
     * 
     */
    @JsonIgnore
    public void setSns(Property<SnsAction> sns) {
        this.sns = sns;
    }

    public Action withSns(Property<SnsAction> sns) {
        this.sns = sns;
        return this;
    }

    /**
     * SqsAction
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iot-topicrule-sqsaction.html
     * 
     */
    @JsonIgnore
    public Property<SqsAction> getSqs() {
        return sqs;
    }

    /**
     * SqsAction
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iot-topicrule-sqsaction.html
     * 
     */
    @JsonIgnore
    public void setSqs(Property<SqsAction> sqs) {
        this.sqs = sqs;
    }

    public Action withSqs(Property<SqsAction> sqs) {
        this.sqs = sqs;
        return this;
    }

    /**
     * StepFunctionsAction
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iot-topicrule-stepfunctionsaction.html
     * 
     */
    @JsonIgnore
    public Property<StepFunctionsAction> getStepFunctions() {
        return stepFunctions;
    }

    /**
     * StepFunctionsAction
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iot-topicrule-stepfunctionsaction.html
     * 
     */
    @JsonIgnore
    public void setStepFunctions(Property<StepFunctionsAction> stepFunctions) {
        this.stepFunctions = stepFunctions;
    }

    public Action withStepFunctions(Property<StepFunctionsAction> stepFunctions) {
        this.stepFunctions = stepFunctions;
        return this;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this).append("cloudwatchAlarm", cloudwatchAlarm).append("cloudwatchMetric", cloudwatchMetric).append("dynamoDB", dynamoDB).append("dynamoDBv2", dynamoDBv2).append("elasticsearch", elasticsearch).append("firehose", firehose).append("iotAnalytics", iotAnalytics).append("kinesis", kinesis).append("lambda", lambda).append("republish", republish).append("s3", s3).append("sns", sns).append("sqs", sqs).append("stepFunctions", stepFunctions).toString();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(s3).append(firehose).append(dynamoDBv2).append(stepFunctions).append(kinesis).append(dynamoDB).append(iotAnalytics).append(lambda).append(elasticsearch).append(republish).append(sqs).append(cloudwatchAlarm).append(sns).append(cloudwatchMetric).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof Action) == false) {
            return false;
        }
        Action rhs = ((Action) other);
        return new EqualsBuilder().append(s3, rhs.s3).append(firehose, rhs.firehose).append(dynamoDBv2, rhs.dynamoDBv2).append(stepFunctions, rhs.stepFunctions).append(kinesis, rhs.kinesis).append(dynamoDB, rhs.dynamoDB).append(iotAnalytics, rhs.iotAnalytics).append(lambda, rhs.lambda).append(elasticsearch, rhs.elasticsearch).append(republish, rhs.republish).append(sqs, rhs.sqs).append(cloudwatchAlarm, rhs.cloudwatchAlarm).append(sns, rhs.sns).append(cloudwatchMetric, rhs.cloudwatchMetric).isEquals();
    }

}
