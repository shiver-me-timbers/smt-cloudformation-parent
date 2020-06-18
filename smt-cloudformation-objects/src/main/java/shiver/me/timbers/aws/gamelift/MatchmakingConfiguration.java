
package shiver.me.timbers.aws.gamelift;

import java.util.ArrayList;
import java.util.List;
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
 * MatchmakingConfiguration
 * <p>
 * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-gamelift-matchmakingconfiguration.html
 * 
 */
@JsonInclude(JsonInclude.Include.NON_EMPTY)
@JsonPropertyOrder({
    "GameProperties",
    "GameSessionData",
    "Description",
    "AcceptanceTimeoutSeconds",
    "NotificationTarget",
    "CustomEventData",
    "Name",
    "AdditionalPlayerCount",
    "BackfillMode",
    "RequestTimeoutSeconds",
    "AcceptanceRequired",
    "RuleSetName",
    "GameSessionQueueArns"
})
public class MatchmakingConfiguration {

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-gamelift-matchmakingconfiguration.html#cfn-gamelift-matchmakingconfiguration-gameproperties
     * 
     */
    @JsonProperty("GameProperties")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-gamelift-matchmakingconfiguration.html#cfn-gamelift-matchmakingconfiguration-gameproperties")
    private List<Property<MatchmakingConfigurationGameProperty>> gameProperties = new ArrayList<Property<MatchmakingConfigurationGameProperty>>();
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-gamelift-matchmakingconfiguration.html#cfn-gamelift-matchmakingconfiguration-gamesessiondata
     * 
     */
    @JsonProperty("GameSessionData")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-gamelift-matchmakingconfiguration.html#cfn-gamelift-matchmakingconfiguration-gamesessiondata")
    private CharSequence gameSessionData;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-gamelift-matchmakingconfiguration.html#cfn-gamelift-matchmakingconfiguration-description
     * 
     */
    @JsonProperty("Description")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-gamelift-matchmakingconfiguration.html#cfn-gamelift-matchmakingconfiguration-description")
    private CharSequence description;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-gamelift-matchmakingconfiguration.html#cfn-gamelift-matchmakingconfiguration-acceptancetimeoutseconds
     * 
     */
    @JsonProperty("AcceptanceTimeoutSeconds")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-gamelift-matchmakingconfiguration.html#cfn-gamelift-matchmakingconfiguration-acceptancetimeoutseconds")
    private Number acceptanceTimeoutSeconds;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-gamelift-matchmakingconfiguration.html#cfn-gamelift-matchmakingconfiguration-notificationtarget
     * 
     */
    @JsonProperty("NotificationTarget")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-gamelift-matchmakingconfiguration.html#cfn-gamelift-matchmakingconfiguration-notificationtarget")
    private CharSequence notificationTarget;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-gamelift-matchmakingconfiguration.html#cfn-gamelift-matchmakingconfiguration-customeventdata
     * 
     */
    @JsonProperty("CustomEventData")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-gamelift-matchmakingconfiguration.html#cfn-gamelift-matchmakingconfiguration-customeventdata")
    private CharSequence customEventData;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-gamelift-matchmakingconfiguration.html#cfn-gamelift-matchmakingconfiguration-name
     * 
     */
    @JsonProperty("Name")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-gamelift-matchmakingconfiguration.html#cfn-gamelift-matchmakingconfiguration-name")
    private CharSequence name;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-gamelift-matchmakingconfiguration.html#cfn-gamelift-matchmakingconfiguration-additionalplayercount
     * 
     */
    @JsonProperty("AdditionalPlayerCount")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-gamelift-matchmakingconfiguration.html#cfn-gamelift-matchmakingconfiguration-additionalplayercount")
    private Number additionalPlayerCount;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-gamelift-matchmakingconfiguration.html#cfn-gamelift-matchmakingconfiguration-backfillmode
     * 
     */
    @JsonProperty("BackfillMode")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-gamelift-matchmakingconfiguration.html#cfn-gamelift-matchmakingconfiguration-backfillmode")
    private CharSequence backfillMode;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-gamelift-matchmakingconfiguration.html#cfn-gamelift-matchmakingconfiguration-requesttimeoutseconds
     * 
     */
    @JsonProperty("RequestTimeoutSeconds")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-gamelift-matchmakingconfiguration.html#cfn-gamelift-matchmakingconfiguration-requesttimeoutseconds")
    private Number requestTimeoutSeconds;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-gamelift-matchmakingconfiguration.html#cfn-gamelift-matchmakingconfiguration-acceptancerequired
     * 
     */
    @JsonProperty("AcceptanceRequired")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-gamelift-matchmakingconfiguration.html#cfn-gamelift-matchmakingconfiguration-acceptancerequired")
    private CharSequence acceptanceRequired;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-gamelift-matchmakingconfiguration.html#cfn-gamelift-matchmakingconfiguration-rulesetname
     * 
     */
    @JsonProperty("RuleSetName")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-gamelift-matchmakingconfiguration.html#cfn-gamelift-matchmakingconfiguration-rulesetname")
    private CharSequence ruleSetName;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-gamelift-matchmakingconfiguration.html#cfn-gamelift-matchmakingconfiguration-gamesessionqueuearns
     * 
     */
    @JsonProperty("GameSessionQueueArns")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-gamelift-matchmakingconfiguration.html#cfn-gamelift-matchmakingconfiguration-gamesessionqueuearns")
    private List<CharSequence> gameSessionQueueArns = new ArrayList<CharSequence>();

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-gamelift-matchmakingconfiguration.html#cfn-gamelift-matchmakingconfiguration-gameproperties
     * 
     */
    @JsonIgnore
    public List<Property<MatchmakingConfigurationGameProperty>> getGameProperties() {
        return gameProperties;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-gamelift-matchmakingconfiguration.html#cfn-gamelift-matchmakingconfiguration-gameproperties
     * 
     */
    @JsonIgnore
    public void setGameProperties(List<Property<MatchmakingConfigurationGameProperty>> gameProperties) {
        this.gameProperties = gameProperties;
    }

    public MatchmakingConfiguration withGameProperties(List<Property<MatchmakingConfigurationGameProperty>> gameProperties) {
        this.gameProperties = gameProperties;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-gamelift-matchmakingconfiguration.html#cfn-gamelift-matchmakingconfiguration-gamesessiondata
     * 
     */
    @JsonIgnore
    public CharSequence getGameSessionData() {
        return gameSessionData;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-gamelift-matchmakingconfiguration.html#cfn-gamelift-matchmakingconfiguration-gamesessiondata
     * 
     */
    @JsonIgnore
    public void setGameSessionData(CharSequence gameSessionData) {
        this.gameSessionData = gameSessionData;
    }

    public MatchmakingConfiguration withGameSessionData(CharSequence gameSessionData) {
        this.gameSessionData = gameSessionData;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-gamelift-matchmakingconfiguration.html#cfn-gamelift-matchmakingconfiguration-description
     * 
     */
    @JsonIgnore
    public CharSequence getDescription() {
        return description;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-gamelift-matchmakingconfiguration.html#cfn-gamelift-matchmakingconfiguration-description
     * 
     */
    @JsonIgnore
    public void setDescription(CharSequence description) {
        this.description = description;
    }

    public MatchmakingConfiguration withDescription(CharSequence description) {
        this.description = description;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-gamelift-matchmakingconfiguration.html#cfn-gamelift-matchmakingconfiguration-acceptancetimeoutseconds
     * 
     */
    @JsonIgnore
    public Number getAcceptanceTimeoutSeconds() {
        return acceptanceTimeoutSeconds;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-gamelift-matchmakingconfiguration.html#cfn-gamelift-matchmakingconfiguration-acceptancetimeoutseconds
     * 
     */
    @JsonIgnore
    public void setAcceptanceTimeoutSeconds(Number acceptanceTimeoutSeconds) {
        this.acceptanceTimeoutSeconds = acceptanceTimeoutSeconds;
    }

    public MatchmakingConfiguration withAcceptanceTimeoutSeconds(Number acceptanceTimeoutSeconds) {
        this.acceptanceTimeoutSeconds = acceptanceTimeoutSeconds;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-gamelift-matchmakingconfiguration.html#cfn-gamelift-matchmakingconfiguration-notificationtarget
     * 
     */
    @JsonIgnore
    public CharSequence getNotificationTarget() {
        return notificationTarget;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-gamelift-matchmakingconfiguration.html#cfn-gamelift-matchmakingconfiguration-notificationtarget
     * 
     */
    @JsonIgnore
    public void setNotificationTarget(CharSequence notificationTarget) {
        this.notificationTarget = notificationTarget;
    }

    public MatchmakingConfiguration withNotificationTarget(CharSequence notificationTarget) {
        this.notificationTarget = notificationTarget;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-gamelift-matchmakingconfiguration.html#cfn-gamelift-matchmakingconfiguration-customeventdata
     * 
     */
    @JsonIgnore
    public CharSequence getCustomEventData() {
        return customEventData;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-gamelift-matchmakingconfiguration.html#cfn-gamelift-matchmakingconfiguration-customeventdata
     * 
     */
    @JsonIgnore
    public void setCustomEventData(CharSequence customEventData) {
        this.customEventData = customEventData;
    }

    public MatchmakingConfiguration withCustomEventData(CharSequence customEventData) {
        this.customEventData = customEventData;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-gamelift-matchmakingconfiguration.html#cfn-gamelift-matchmakingconfiguration-name
     * 
     */
    @JsonIgnore
    public CharSequence getName() {
        return name;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-gamelift-matchmakingconfiguration.html#cfn-gamelift-matchmakingconfiguration-name
     * 
     */
    @JsonIgnore
    public void setName(CharSequence name) {
        this.name = name;
    }

    public MatchmakingConfiguration withName(CharSequence name) {
        this.name = name;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-gamelift-matchmakingconfiguration.html#cfn-gamelift-matchmakingconfiguration-additionalplayercount
     * 
     */
    @JsonIgnore
    public Number getAdditionalPlayerCount() {
        return additionalPlayerCount;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-gamelift-matchmakingconfiguration.html#cfn-gamelift-matchmakingconfiguration-additionalplayercount
     * 
     */
    @JsonIgnore
    public void setAdditionalPlayerCount(Number additionalPlayerCount) {
        this.additionalPlayerCount = additionalPlayerCount;
    }

    public MatchmakingConfiguration withAdditionalPlayerCount(Number additionalPlayerCount) {
        this.additionalPlayerCount = additionalPlayerCount;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-gamelift-matchmakingconfiguration.html#cfn-gamelift-matchmakingconfiguration-backfillmode
     * 
     */
    @JsonIgnore
    public CharSequence getBackfillMode() {
        return backfillMode;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-gamelift-matchmakingconfiguration.html#cfn-gamelift-matchmakingconfiguration-backfillmode
     * 
     */
    @JsonIgnore
    public void setBackfillMode(CharSequence backfillMode) {
        this.backfillMode = backfillMode;
    }

    public MatchmakingConfiguration withBackfillMode(CharSequence backfillMode) {
        this.backfillMode = backfillMode;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-gamelift-matchmakingconfiguration.html#cfn-gamelift-matchmakingconfiguration-requesttimeoutseconds
     * 
     */
    @JsonIgnore
    public Number getRequestTimeoutSeconds() {
        return requestTimeoutSeconds;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-gamelift-matchmakingconfiguration.html#cfn-gamelift-matchmakingconfiguration-requesttimeoutseconds
     * 
     */
    @JsonIgnore
    public void setRequestTimeoutSeconds(Number requestTimeoutSeconds) {
        this.requestTimeoutSeconds = requestTimeoutSeconds;
    }

    public MatchmakingConfiguration withRequestTimeoutSeconds(Number requestTimeoutSeconds) {
        this.requestTimeoutSeconds = requestTimeoutSeconds;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-gamelift-matchmakingconfiguration.html#cfn-gamelift-matchmakingconfiguration-acceptancerequired
     * 
     */
    @JsonIgnore
    public CharSequence getAcceptanceRequired() {
        return acceptanceRequired;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-gamelift-matchmakingconfiguration.html#cfn-gamelift-matchmakingconfiguration-acceptancerequired
     * 
     */
    @JsonIgnore
    public void setAcceptanceRequired(CharSequence acceptanceRequired) {
        this.acceptanceRequired = acceptanceRequired;
    }

    public MatchmakingConfiguration withAcceptanceRequired(CharSequence acceptanceRequired) {
        this.acceptanceRequired = acceptanceRequired;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-gamelift-matchmakingconfiguration.html#cfn-gamelift-matchmakingconfiguration-rulesetname
     * 
     */
    @JsonIgnore
    public CharSequence getRuleSetName() {
        return ruleSetName;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-gamelift-matchmakingconfiguration.html#cfn-gamelift-matchmakingconfiguration-rulesetname
     * 
     */
    @JsonIgnore
    public void setRuleSetName(CharSequence ruleSetName) {
        this.ruleSetName = ruleSetName;
    }

    public MatchmakingConfiguration withRuleSetName(CharSequence ruleSetName) {
        this.ruleSetName = ruleSetName;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-gamelift-matchmakingconfiguration.html#cfn-gamelift-matchmakingconfiguration-gamesessionqueuearns
     * 
     */
    @JsonIgnore
    public List<CharSequence> getGameSessionQueueArns() {
        return gameSessionQueueArns;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-gamelift-matchmakingconfiguration.html#cfn-gamelift-matchmakingconfiguration-gamesessionqueuearns
     * 
     */
    @JsonIgnore
    public void setGameSessionQueueArns(List<CharSequence> gameSessionQueueArns) {
        this.gameSessionQueueArns = gameSessionQueueArns;
    }

    public MatchmakingConfiguration withGameSessionQueueArns(List<CharSequence> gameSessionQueueArns) {
        this.gameSessionQueueArns = gameSessionQueueArns;
        return this;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this).append("gameProperties", gameProperties).append("gameSessionData", gameSessionData).append("description", description).append("acceptanceTimeoutSeconds", acceptanceTimeoutSeconds).append("notificationTarget", notificationTarget).append("customEventData", customEventData).append("name", name).append("additionalPlayerCount", additionalPlayerCount).append("backfillMode", backfillMode).append("requestTimeoutSeconds", requestTimeoutSeconds).append("acceptanceRequired", acceptanceRequired).append("ruleSetName", ruleSetName).append("gameSessionQueueArns", gameSessionQueueArns).toString();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(acceptanceRequired).append(description).append(notificationTarget).append(acceptanceTimeoutSeconds).append(additionalPlayerCount).append(gameSessionData).append(requestTimeoutSeconds).append(ruleSetName).append(name).append(customEventData).append(gameProperties).append(gameSessionQueueArns).append(backfillMode).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof MatchmakingConfiguration) == false) {
            return false;
        }
        MatchmakingConfiguration rhs = ((MatchmakingConfiguration) other);
        return new EqualsBuilder().append(acceptanceRequired, rhs.acceptanceRequired).append(description, rhs.description).append(notificationTarget, rhs.notificationTarget).append(acceptanceTimeoutSeconds, rhs.acceptanceTimeoutSeconds).append(additionalPlayerCount, rhs.additionalPlayerCount).append(gameSessionData, rhs.gameSessionData).append(requestTimeoutSeconds, rhs.requestTimeoutSeconds).append(ruleSetName, rhs.ruleSetName).append(name, rhs.name).append(customEventData, rhs.customEventData).append(gameProperties, rhs.gameProperties).append(gameSessionQueueArns, rhs.gameSessionQueueArns).append(backfillMode, rhs.backfillMode).isEquals();
    }

}
