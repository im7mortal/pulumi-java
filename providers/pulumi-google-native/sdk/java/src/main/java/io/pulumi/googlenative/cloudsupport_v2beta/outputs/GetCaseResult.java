// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.cloudsupport_v2beta.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import io.pulumi.googlenative.cloudsupport_v2beta.outputs.ActorResponse;
import io.pulumi.googlenative.cloudsupport_v2beta.outputs.CaseClassificationResponse;
import java.lang.Boolean;
import java.lang.String;
import java.util.List;
import java.util.Objects;

@OutputCustomType
public final class GetCaseResult {
    /**
     * The issue classification applicable to this case.
     * 
     */
    private final CaseClassificationResponse classification;
    /**
     * The time this case was created.
     * 
     */
    private final String createTime;
    /**
     * The user who created the case. Note: The name and email will be obfuscated if the case was created by Google Support.
     * 
     */
    private final ActorResponse creator;
    /**
     * A broad description of the issue.
     * 
     */
    private final String description;
    /**
     * The short summary of the issue reported in this case.
     * 
     */
    private final String displayName;
    /**
     * Whether the case is currently escalated.
     * 
     */
    private final Boolean escalated;
    /**
     * The resource name for the case.
     * 
     */
    private final String name;
    /**
     * The priority of this case. If this is set, do not set severity.
     * 
     */
    private final String priority;
    /**
     * The current status of the support case.
     * 
     */
    private final String state;
    /**
     * The email addresses to receive updates on this case.
     * 
     */
    private final List<String> subscriberEmailAddresses;
    /**
     * Whether this case was created for internal API testing and should not be acted on by the support team.
     * 
     */
    private final Boolean testCase;
    /**
     * The timezone of the user who created the support case. It should be in a format IANA recognizes: https://www.iana.org/time-zones. There is no additional validation done by the API.
     * 
     */
    private final String timeZone;
    /**
     * The time this case was last updated.
     * 
     */
    private final String updateTime;

    @OutputCustomType.Constructor({"classification","createTime","creator","description","displayName","escalated","name","priority","state","subscriberEmailAddresses","testCase","timeZone","updateTime"})
    private GetCaseResult(
        CaseClassificationResponse classification,
        String createTime,
        ActorResponse creator,
        String description,
        String displayName,
        Boolean escalated,
        String name,
        String priority,
        String state,
        List<String> subscriberEmailAddresses,
        Boolean testCase,
        String timeZone,
        String updateTime) {
        this.classification = Objects.requireNonNull(classification);
        this.createTime = Objects.requireNonNull(createTime);
        this.creator = Objects.requireNonNull(creator);
        this.description = Objects.requireNonNull(description);
        this.displayName = Objects.requireNonNull(displayName);
        this.escalated = Objects.requireNonNull(escalated);
        this.name = Objects.requireNonNull(name);
        this.priority = Objects.requireNonNull(priority);
        this.state = Objects.requireNonNull(state);
        this.subscriberEmailAddresses = Objects.requireNonNull(subscriberEmailAddresses);
        this.testCase = Objects.requireNonNull(testCase);
        this.timeZone = Objects.requireNonNull(timeZone);
        this.updateTime = Objects.requireNonNull(updateTime);
    }

    /**
     * The issue classification applicable to this case.
     * 
    */
    public CaseClassificationResponse getClassification() {
        return this.classification;
    }
    /**
     * The time this case was created.
     * 
    */
    public String getCreateTime() {
        return this.createTime;
    }
    /**
     * The user who created the case. Note: The name and email will be obfuscated if the case was created by Google Support.
     * 
    */
    public ActorResponse getCreator() {
        return this.creator;
    }
    /**
     * A broad description of the issue.
     * 
    */
    public String getDescription() {
        return this.description;
    }
    /**
     * The short summary of the issue reported in this case.
     * 
    */
    public String getDisplayName() {
        return this.displayName;
    }
    /**
     * Whether the case is currently escalated.
     * 
    */
    public Boolean getEscalated() {
        return this.escalated;
    }
    /**
     * The resource name for the case.
     * 
    */
    public String getName() {
        return this.name;
    }
    /**
     * The priority of this case. If this is set, do not set severity.
     * 
    */
    public String getPriority() {
        return this.priority;
    }
    /**
     * The current status of the support case.
     * 
    */
    public String getState() {
        return this.state;
    }
    /**
     * The email addresses to receive updates on this case.
     * 
    */
    public List<String> getSubscriberEmailAddresses() {
        return this.subscriberEmailAddresses;
    }
    /**
     * Whether this case was created for internal API testing and should not be acted on by the support team.
     * 
    */
    public Boolean getTestCase() {
        return this.testCase;
    }
    /**
     * The timezone of the user who created the support case. It should be in a format IANA recognizes: https://www.iana.org/time-zones. There is no additional validation done by the API.
     * 
    */
    public String getTimeZone() {
        return this.timeZone;
    }
    /**
     * The time this case was last updated.
     * 
    */
    public String getUpdateTime() {
        return this.updateTime;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetCaseResult defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private CaseClassificationResponse classification;
        private String createTime;
        private ActorResponse creator;
        private String description;
        private String displayName;
        private Boolean escalated;
        private String name;
        private String priority;
        private String state;
        private List<String> subscriberEmailAddresses;
        private Boolean testCase;
        private String timeZone;
        private String updateTime;

        public Builder() {
    	      // Empty
        }

        public Builder(GetCaseResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.classification = defaults.classification;
    	      this.createTime = defaults.createTime;
    	      this.creator = defaults.creator;
    	      this.description = defaults.description;
    	      this.displayName = defaults.displayName;
    	      this.escalated = defaults.escalated;
    	      this.name = defaults.name;
    	      this.priority = defaults.priority;
    	      this.state = defaults.state;
    	      this.subscriberEmailAddresses = defaults.subscriberEmailAddresses;
    	      this.testCase = defaults.testCase;
    	      this.timeZone = defaults.timeZone;
    	      this.updateTime = defaults.updateTime;
        }

        public Builder setClassification(CaseClassificationResponse classification) {
            this.classification = Objects.requireNonNull(classification);
            return this;
        }

        public Builder setCreateTime(String createTime) {
            this.createTime = Objects.requireNonNull(createTime);
            return this;
        }

        public Builder setCreator(ActorResponse creator) {
            this.creator = Objects.requireNonNull(creator);
            return this;
        }

        public Builder setDescription(String description) {
            this.description = Objects.requireNonNull(description);
            return this;
        }

        public Builder setDisplayName(String displayName) {
            this.displayName = Objects.requireNonNull(displayName);
            return this;
        }

        public Builder setEscalated(Boolean escalated) {
            this.escalated = Objects.requireNonNull(escalated);
            return this;
        }

        public Builder setName(String name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }

        public Builder setPriority(String priority) {
            this.priority = Objects.requireNonNull(priority);
            return this;
        }

        public Builder setState(String state) {
            this.state = Objects.requireNonNull(state);
            return this;
        }

        public Builder setSubscriberEmailAddresses(List<String> subscriberEmailAddresses) {
            this.subscriberEmailAddresses = Objects.requireNonNull(subscriberEmailAddresses);
            return this;
        }

        public Builder setTestCase(Boolean testCase) {
            this.testCase = Objects.requireNonNull(testCase);
            return this;
        }

        public Builder setTimeZone(String timeZone) {
            this.timeZone = Objects.requireNonNull(timeZone);
            return this;
        }

        public Builder setUpdateTime(String updateTime) {
            this.updateTime = Objects.requireNonNull(updateTime);
            return this;
        }
        public GetCaseResult build() {
            return new GetCaseResult(classification, createTime, creator, description, displayName, escalated, name, priority, state, subscriberEmailAddresses, testCase, timeZone, updateTime);
        }
    }
}
