
package aws.iot;

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
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "CloudwatchAlarm",
    "CloudwatchMetric",
    "DynamoDB",
    "DynamoDBv2",
    "Elasticsearch",
    "Firehose",
    "Kinesis",
    "Lambda",
    "Republish",
    "S3",
    "Sns",
    "Sqs"
})
public class Action {

    /**
     * CloudwatchAlarmAction
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iot-topicrule-cloudwatchalarmaction.html
     * 
     */
    @JsonProperty("CloudwatchAlarm")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iot-topicrule-cloudwatchalarmaction.html")
    private CloudwatchAlarmAction cloudwatchAlarm;
    /**
     * CloudwatchMetricAction
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iot-topicrule-cloudwatchmetricaction.html
     * 
     */
    @JsonProperty("CloudwatchMetric")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iot-topicrule-cloudwatchmetricaction.html")
    private CloudwatchMetricAction cloudwatchMetric;
    /**
     * DynamoDBAction
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iot-topicrule-dynamodbaction.html
     * 
     */
    @JsonProperty("DynamoDB")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iot-topicrule-dynamodbaction.html")
    private DynamoDBAction dynamoDB;
    /**
     * DynamoDBv2Action
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iot-topicrule-dynamodbv2action.html
     * 
     */
    @JsonProperty("DynamoDBv2")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iot-topicrule-dynamodbv2action.html")
    private DynamoDBv2Action dynamoDBv2;
    /**
     * ElasticsearchAction
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iot-topicrule-elasticsearchaction.html
     * 
     */
    @JsonProperty("Elasticsearch")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iot-topicrule-elasticsearchaction.html")
    private ElasticsearchAction elasticsearch;
    /**
     * FirehoseAction
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iot-topicrule-firehoseaction.html
     * 
     */
    @JsonProperty("Firehose")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iot-topicrule-firehoseaction.html")
    private FirehoseAction firehose;
    /**
     * KinesisAction
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iot-topicrule-kinesisaction.html
     * 
     */
    @JsonProperty("Kinesis")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iot-topicrule-kinesisaction.html")
    private KinesisAction kinesis;
    /**
     * LambdaAction
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iot-topicrule-lambdaaction.html
     * 
     */
    @JsonProperty("Lambda")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iot-topicrule-lambdaaction.html")
    private LambdaAction lambda;
    /**
     * RepublishAction
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iot-topicrule-republishaction.html
     * 
     */
    @JsonProperty("Republish")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iot-topicrule-republishaction.html")
    private RepublishAction republish;
    /**
     * S3Action
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iot-topicrule-s3action.html
     * 
     */
    @JsonProperty("S3")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iot-topicrule-s3action.html")
    private S3Action s3;
    /**
     * SnsAction
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iot-topicrule-snsaction.html
     * 
     */
    @JsonProperty("Sns")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iot-topicrule-snsaction.html")
    private SnsAction sns;
    /**
     * SqsAction
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iot-topicrule-sqsaction.html
     * 
     */
    @JsonProperty("Sqs")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iot-topicrule-sqsaction.html")
    private SqsAction sqs;

    /**
     * CloudwatchAlarmAction
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iot-topicrule-cloudwatchalarmaction.html
     * 
     */
    public CloudwatchAlarmAction getCloudwatchAlarm() {
        return cloudwatchAlarm;
    }

    /**
     * CloudwatchAlarmAction
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iot-topicrule-cloudwatchalarmaction.html
     * 
     */
    public void setCloudwatchAlarm(CloudwatchAlarmAction cloudwatchAlarm) {
        this.cloudwatchAlarm = cloudwatchAlarm;
    }

    public Action withCloudwatchAlarm(CloudwatchAlarmAction cloudwatchAlarm) {
        this.cloudwatchAlarm = cloudwatchAlarm;
        return this;
    }

    /**
     * CloudwatchMetricAction
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iot-topicrule-cloudwatchmetricaction.html
     * 
     */
    public CloudwatchMetricAction getCloudwatchMetric() {
        return cloudwatchMetric;
    }

    /**
     * CloudwatchMetricAction
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iot-topicrule-cloudwatchmetricaction.html
     * 
     */
    public void setCloudwatchMetric(CloudwatchMetricAction cloudwatchMetric) {
        this.cloudwatchMetric = cloudwatchMetric;
    }

    public Action withCloudwatchMetric(CloudwatchMetricAction cloudwatchMetric) {
        this.cloudwatchMetric = cloudwatchMetric;
        return this;
    }

    /**
     * DynamoDBAction
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iot-topicrule-dynamodbaction.html
     * 
     */
    public DynamoDBAction getDynamoDB() {
        return dynamoDB;
    }

    /**
     * DynamoDBAction
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iot-topicrule-dynamodbaction.html
     * 
     */
    public void setDynamoDB(DynamoDBAction dynamoDB) {
        this.dynamoDB = dynamoDB;
    }

    public Action withDynamoDB(DynamoDBAction dynamoDB) {
        this.dynamoDB = dynamoDB;
        return this;
    }

    /**
     * DynamoDBv2Action
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iot-topicrule-dynamodbv2action.html
     * 
     */
    public DynamoDBv2Action getDynamoDBv2() {
        return dynamoDBv2;
    }

    /**
     * DynamoDBv2Action
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iot-topicrule-dynamodbv2action.html
     * 
     */
    public void setDynamoDBv2(DynamoDBv2Action dynamoDBv2) {
        this.dynamoDBv2 = dynamoDBv2;
    }

    public Action withDynamoDBv2(DynamoDBv2Action dynamoDBv2) {
        this.dynamoDBv2 = dynamoDBv2;
        return this;
    }

    /**
     * ElasticsearchAction
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iot-topicrule-elasticsearchaction.html
     * 
     */
    public ElasticsearchAction getElasticsearch() {
        return elasticsearch;
    }

    /**
     * ElasticsearchAction
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iot-topicrule-elasticsearchaction.html
     * 
     */
    public void setElasticsearch(ElasticsearchAction elasticsearch) {
        this.elasticsearch = elasticsearch;
    }

    public Action withElasticsearch(ElasticsearchAction elasticsearch) {
        this.elasticsearch = elasticsearch;
        return this;
    }

    /**
     * FirehoseAction
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iot-topicrule-firehoseaction.html
     * 
     */
    public FirehoseAction getFirehose() {
        return firehose;
    }

    /**
     * FirehoseAction
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iot-topicrule-firehoseaction.html
     * 
     */
    public void setFirehose(FirehoseAction firehose) {
        this.firehose = firehose;
    }

    public Action withFirehose(FirehoseAction firehose) {
        this.firehose = firehose;
        return this;
    }

    /**
     * KinesisAction
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iot-topicrule-kinesisaction.html
     * 
     */
    public KinesisAction getKinesis() {
        return kinesis;
    }

    /**
     * KinesisAction
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iot-topicrule-kinesisaction.html
     * 
     */
    public void setKinesis(KinesisAction kinesis) {
        this.kinesis = kinesis;
    }

    public Action withKinesis(KinesisAction kinesis) {
        this.kinesis = kinesis;
        return this;
    }

    /**
     * LambdaAction
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iot-topicrule-lambdaaction.html
     * 
     */
    public LambdaAction getLambda() {
        return lambda;
    }

    /**
     * LambdaAction
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iot-topicrule-lambdaaction.html
     * 
     */
    public void setLambda(LambdaAction lambda) {
        this.lambda = lambda;
    }

    public Action withLambda(LambdaAction lambda) {
        this.lambda = lambda;
        return this;
    }

    /**
     * RepublishAction
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iot-topicrule-republishaction.html
     * 
     */
    public RepublishAction getRepublish() {
        return republish;
    }

    /**
     * RepublishAction
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iot-topicrule-republishaction.html
     * 
     */
    public void setRepublish(RepublishAction republish) {
        this.republish = republish;
    }

    public Action withRepublish(RepublishAction republish) {
        this.republish = republish;
        return this;
    }

    /**
     * S3Action
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iot-topicrule-s3action.html
     * 
     */
    public S3Action getS3() {
        return s3;
    }

    /**
     * S3Action
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iot-topicrule-s3action.html
     * 
     */
    public void setS3(S3Action s3) {
        this.s3 = s3;
    }

    public Action withS3(S3Action s3) {
        this.s3 = s3;
        return this;
    }

    /**
     * SnsAction
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iot-topicrule-snsaction.html
     * 
     */
    public SnsAction getSns() {
        return sns;
    }

    /**
     * SnsAction
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iot-topicrule-snsaction.html
     * 
     */
    public void setSns(SnsAction sns) {
        this.sns = sns;
    }

    public Action withSns(SnsAction sns) {
        this.sns = sns;
        return this;
    }

    /**
     * SqsAction
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iot-topicrule-sqsaction.html
     * 
     */
    public SqsAction getSqs() {
        return sqs;
    }

    /**
     * SqsAction
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iot-topicrule-sqsaction.html
     * 
     */
    public void setSqs(SqsAction sqs) {
        this.sqs = sqs;
    }

    public Action withSqs(SqsAction sqs) {
        this.sqs = sqs;
        return this;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this).append("cloudwatchAlarm", cloudwatchAlarm).append("cloudwatchMetric", cloudwatchMetric).append("dynamoDB", dynamoDB).append("dynamoDBv2", dynamoDBv2).append("elasticsearch", elasticsearch).append("firehose", firehose).append("kinesis", kinesis).append("lambda", lambda).append("republish", republish).append("s3", s3).append("sns", sns).append("sqs", sqs).toString();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(s3).append(firehose).append(dynamoDBv2).append(kinesis).append(dynamoDB).append(lambda).append(elasticsearch).append(republish).append(sqs).append(cloudwatchAlarm).append(sns).append(cloudwatchMetric).toHashCode();
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
        return new EqualsBuilder().append(s3, rhs.s3).append(firehose, rhs.firehose).append(dynamoDBv2, rhs.dynamoDBv2).append(kinesis, rhs.kinesis).append(dynamoDB, rhs.dynamoDB).append(lambda, rhs.lambda).append(elasticsearch, rhs.elasticsearch).append(republish, rhs.republish).append(sqs, rhs.sqs).append(cloudwatchAlarm, rhs.cloudwatchAlarm).append(sns, rhs.sns).append(cloudwatchMetric, rhs.cloudwatchMetric).isEquals();
    }

}
