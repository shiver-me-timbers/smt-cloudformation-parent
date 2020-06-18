
package shiver.me.timbers.aws.iotevents;

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
 * DetectorModelAction
 * <p>
 * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iotevents-detectormodel-action.html
 * 
 */
@JsonInclude(JsonInclude.Include.NON_EMPTY)
@JsonPropertyOrder({
    "IotEvents",
    "Firehose",
    "IotTopicPublish",
    "DynamoDB",
    "DynamoDBv2",
    "IotSiteWise",
    "ResetTimer",
    "Sqs",
    "Sns",
    "SetTimer",
    "ClearTimer",
    "Lambda",
    "SetVariable"
})
public class DetectorModelAction implements Property<DetectorModelAction>
{

    /**
     * DetectorModelIotEvents
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iotevents-detectormodel-iotevents.html
     * 
     */
    @JsonProperty("IotEvents")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iotevents-detectormodel-iotevents.html")
    private Property<DetectorModelIotEvents> iotEvents;
    /**
     * DetectorModelFirehose
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iotevents-detectormodel-firehose.html
     * 
     */
    @JsonProperty("Firehose")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iotevents-detectormodel-firehose.html")
    private Property<DetectorModelFirehose> firehose;
    /**
     * DetectorModelIotTopicPublish
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iotevents-detectormodel-iottopicpublish.html
     * 
     */
    @JsonProperty("IotTopicPublish")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iotevents-detectormodel-iottopicpublish.html")
    private Property<DetectorModelIotTopicPublish> iotTopicPublish;
    /**
     * DetectorModelDynamoDB
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iotevents-detectormodel-dynamodb.html
     * 
     */
    @JsonProperty("DynamoDB")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iotevents-detectormodel-dynamodb.html")
    private Property<DetectorModelDynamoDB> dynamoDB;
    /**
     * DetectorModelDynamoDBv2
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iotevents-detectormodel-dynamodbv2.html
     * 
     */
    @JsonProperty("DynamoDBv2")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iotevents-detectormodel-dynamodbv2.html")
    private Property<DetectorModelDynamoDBv2> dynamoDBv2;
    /**
     * DetectorModelIotSiteWise
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iotevents-detectormodel-iotsitewise.html
     * 
     */
    @JsonProperty("IotSiteWise")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iotevents-detectormodel-iotsitewise.html")
    private Property<DetectorModelIotSiteWise> iotSiteWise;
    /**
     * DetectorModelResetTimer
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iotevents-detectormodel-resettimer.html
     * 
     */
    @JsonProperty("ResetTimer")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iotevents-detectormodel-resettimer.html")
    private Property<DetectorModelResetTimer> resetTimer;
    /**
     * DetectorModelSqs
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iotevents-detectormodel-sqs.html
     * 
     */
    @JsonProperty("Sqs")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iotevents-detectormodel-sqs.html")
    private Property<DetectorModelSqs> sqs;
    /**
     * DetectorModelSns
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iotevents-detectormodel-sns.html
     * 
     */
    @JsonProperty("Sns")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iotevents-detectormodel-sns.html")
    private Property<DetectorModelSns> sns;
    /**
     * DetectorModelSetTimer
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iotevents-detectormodel-settimer.html
     * 
     */
    @JsonProperty("SetTimer")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iotevents-detectormodel-settimer.html")
    private Property<DetectorModelSetTimer> setTimer;
    /**
     * DetectorModelClearTimer
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iotevents-detectormodel-cleartimer.html
     * 
     */
    @JsonProperty("ClearTimer")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iotevents-detectormodel-cleartimer.html")
    private Property<DetectorModelClearTimer> clearTimer;
    /**
     * DetectorModelLambda
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iotevents-detectormodel-lambda.html
     * 
     */
    @JsonProperty("Lambda")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iotevents-detectormodel-lambda.html")
    private Property<DetectorModelLambda> lambda;
    /**
     * DetectorModelSetVariable
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iotevents-detectormodel-setvariable.html
     * 
     */
    @JsonProperty("SetVariable")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iotevents-detectormodel-setvariable.html")
    private Property<DetectorModelSetVariable> setVariable;

    /**
     * DetectorModelIotEvents
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iotevents-detectormodel-iotevents.html
     * 
     */
    @JsonIgnore
    public Property<DetectorModelIotEvents> getIotEvents() {
        return iotEvents;
    }

    /**
     * DetectorModelIotEvents
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iotevents-detectormodel-iotevents.html
     * 
     */
    @JsonIgnore
    public void setIotEvents(Property<DetectorModelIotEvents> iotEvents) {
        this.iotEvents = iotEvents;
    }

    public DetectorModelAction withIotEvents(Property<DetectorModelIotEvents> iotEvents) {
        this.iotEvents = iotEvents;
        return this;
    }

    /**
     * DetectorModelFirehose
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iotevents-detectormodel-firehose.html
     * 
     */
    @JsonIgnore
    public Property<DetectorModelFirehose> getFirehose() {
        return firehose;
    }

    /**
     * DetectorModelFirehose
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iotevents-detectormodel-firehose.html
     * 
     */
    @JsonIgnore
    public void setFirehose(Property<DetectorModelFirehose> firehose) {
        this.firehose = firehose;
    }

    public DetectorModelAction withFirehose(Property<DetectorModelFirehose> firehose) {
        this.firehose = firehose;
        return this;
    }

    /**
     * DetectorModelIotTopicPublish
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iotevents-detectormodel-iottopicpublish.html
     * 
     */
    @JsonIgnore
    public Property<DetectorModelIotTopicPublish> getIotTopicPublish() {
        return iotTopicPublish;
    }

    /**
     * DetectorModelIotTopicPublish
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iotevents-detectormodel-iottopicpublish.html
     * 
     */
    @JsonIgnore
    public void setIotTopicPublish(Property<DetectorModelIotTopicPublish> iotTopicPublish) {
        this.iotTopicPublish = iotTopicPublish;
    }

    public DetectorModelAction withIotTopicPublish(Property<DetectorModelIotTopicPublish> iotTopicPublish) {
        this.iotTopicPublish = iotTopicPublish;
        return this;
    }

    /**
     * DetectorModelDynamoDB
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iotevents-detectormodel-dynamodb.html
     * 
     */
    @JsonIgnore
    public Property<DetectorModelDynamoDB> getDynamoDB() {
        return dynamoDB;
    }

    /**
     * DetectorModelDynamoDB
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iotevents-detectormodel-dynamodb.html
     * 
     */
    @JsonIgnore
    public void setDynamoDB(Property<DetectorModelDynamoDB> dynamoDB) {
        this.dynamoDB = dynamoDB;
    }

    public DetectorModelAction withDynamoDB(Property<DetectorModelDynamoDB> dynamoDB) {
        this.dynamoDB = dynamoDB;
        return this;
    }

    /**
     * DetectorModelDynamoDBv2
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iotevents-detectormodel-dynamodbv2.html
     * 
     */
    @JsonIgnore
    public Property<DetectorModelDynamoDBv2> getDynamoDBv2() {
        return dynamoDBv2;
    }

    /**
     * DetectorModelDynamoDBv2
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iotevents-detectormodel-dynamodbv2.html
     * 
     */
    @JsonIgnore
    public void setDynamoDBv2(Property<DetectorModelDynamoDBv2> dynamoDBv2) {
        this.dynamoDBv2 = dynamoDBv2;
    }

    public DetectorModelAction withDynamoDBv2(Property<DetectorModelDynamoDBv2> dynamoDBv2) {
        this.dynamoDBv2 = dynamoDBv2;
        return this;
    }

    /**
     * DetectorModelIotSiteWise
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iotevents-detectormodel-iotsitewise.html
     * 
     */
    @JsonIgnore
    public Property<DetectorModelIotSiteWise> getIotSiteWise() {
        return iotSiteWise;
    }

    /**
     * DetectorModelIotSiteWise
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iotevents-detectormodel-iotsitewise.html
     * 
     */
    @JsonIgnore
    public void setIotSiteWise(Property<DetectorModelIotSiteWise> iotSiteWise) {
        this.iotSiteWise = iotSiteWise;
    }

    public DetectorModelAction withIotSiteWise(Property<DetectorModelIotSiteWise> iotSiteWise) {
        this.iotSiteWise = iotSiteWise;
        return this;
    }

    /**
     * DetectorModelResetTimer
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iotevents-detectormodel-resettimer.html
     * 
     */
    @JsonIgnore
    public Property<DetectorModelResetTimer> getResetTimer() {
        return resetTimer;
    }

    /**
     * DetectorModelResetTimer
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iotevents-detectormodel-resettimer.html
     * 
     */
    @JsonIgnore
    public void setResetTimer(Property<DetectorModelResetTimer> resetTimer) {
        this.resetTimer = resetTimer;
    }

    public DetectorModelAction withResetTimer(Property<DetectorModelResetTimer> resetTimer) {
        this.resetTimer = resetTimer;
        return this;
    }

    /**
     * DetectorModelSqs
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iotevents-detectormodel-sqs.html
     * 
     */
    @JsonIgnore
    public Property<DetectorModelSqs> getSqs() {
        return sqs;
    }

    /**
     * DetectorModelSqs
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iotevents-detectormodel-sqs.html
     * 
     */
    @JsonIgnore
    public void setSqs(Property<DetectorModelSqs> sqs) {
        this.sqs = sqs;
    }

    public DetectorModelAction withSqs(Property<DetectorModelSqs> sqs) {
        this.sqs = sqs;
        return this;
    }

    /**
     * DetectorModelSns
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iotevents-detectormodel-sns.html
     * 
     */
    @JsonIgnore
    public Property<DetectorModelSns> getSns() {
        return sns;
    }

    /**
     * DetectorModelSns
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iotevents-detectormodel-sns.html
     * 
     */
    @JsonIgnore
    public void setSns(Property<DetectorModelSns> sns) {
        this.sns = sns;
    }

    public DetectorModelAction withSns(Property<DetectorModelSns> sns) {
        this.sns = sns;
        return this;
    }

    /**
     * DetectorModelSetTimer
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iotevents-detectormodel-settimer.html
     * 
     */
    @JsonIgnore
    public Property<DetectorModelSetTimer> getSetTimer() {
        return setTimer;
    }

    /**
     * DetectorModelSetTimer
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iotevents-detectormodel-settimer.html
     * 
     */
    @JsonIgnore
    public void setSetTimer(Property<DetectorModelSetTimer> setTimer) {
        this.setTimer = setTimer;
    }

    public DetectorModelAction withSetTimer(Property<DetectorModelSetTimer> setTimer) {
        this.setTimer = setTimer;
        return this;
    }

    /**
     * DetectorModelClearTimer
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iotevents-detectormodel-cleartimer.html
     * 
     */
    @JsonIgnore
    public Property<DetectorModelClearTimer> getClearTimer() {
        return clearTimer;
    }

    /**
     * DetectorModelClearTimer
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iotevents-detectormodel-cleartimer.html
     * 
     */
    @JsonIgnore
    public void setClearTimer(Property<DetectorModelClearTimer> clearTimer) {
        this.clearTimer = clearTimer;
    }

    public DetectorModelAction withClearTimer(Property<DetectorModelClearTimer> clearTimer) {
        this.clearTimer = clearTimer;
        return this;
    }

    /**
     * DetectorModelLambda
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iotevents-detectormodel-lambda.html
     * 
     */
    @JsonIgnore
    public Property<DetectorModelLambda> getLambda() {
        return lambda;
    }

    /**
     * DetectorModelLambda
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iotevents-detectormodel-lambda.html
     * 
     */
    @JsonIgnore
    public void setLambda(Property<DetectorModelLambda> lambda) {
        this.lambda = lambda;
    }

    public DetectorModelAction withLambda(Property<DetectorModelLambda> lambda) {
        this.lambda = lambda;
        return this;
    }

    /**
     * DetectorModelSetVariable
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iotevents-detectormodel-setvariable.html
     * 
     */
    @JsonIgnore
    public Property<DetectorModelSetVariable> getSetVariable() {
        return setVariable;
    }

    /**
     * DetectorModelSetVariable
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iotevents-detectormodel-setvariable.html
     * 
     */
    @JsonIgnore
    public void setSetVariable(Property<DetectorModelSetVariable> setVariable) {
        this.setVariable = setVariable;
    }

    public DetectorModelAction withSetVariable(Property<DetectorModelSetVariable> setVariable) {
        this.setVariable = setVariable;
        return this;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this).append("iotEvents", iotEvents).append("firehose", firehose).append("iotTopicPublish", iotTopicPublish).append("dynamoDB", dynamoDB).append("dynamoDBv2", dynamoDBv2).append("iotSiteWise", iotSiteWise).append("resetTimer", resetTimer).append("sqs", sqs).append("sns", sns).append("setTimer", setTimer).append("clearTimer", clearTimer).append("lambda", lambda).append("setVariable", setVariable).toString();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(firehose).append(resetTimer).append(dynamoDBv2).append(setVariable).append(clearTimer).append(dynamoDB).append(lambda).append(iotEvents).append(sqs).append(sns).append(iotTopicPublish).append(iotSiteWise).append(setTimer).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof DetectorModelAction) == false) {
            return false;
        }
        DetectorModelAction rhs = ((DetectorModelAction) other);
        return new EqualsBuilder().append(firehose, rhs.firehose).append(resetTimer, rhs.resetTimer).append(dynamoDBv2, rhs.dynamoDBv2).append(setVariable, rhs.setVariable).append(clearTimer, rhs.clearTimer).append(dynamoDB, rhs.dynamoDB).append(lambda, rhs.lambda).append(iotEvents, rhs.iotEvents).append(sqs, rhs.sqs).append(sns, rhs.sns).append(iotTopicPublish, rhs.iotTopicPublish).append(iotSiteWise, rhs.iotSiteWise).append(setTimer, rhs.setTimer).isEquals();
    }

}
