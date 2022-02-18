// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.frauddetector.outputs;

import io.pulumi.awsnative.frauddetector.enums.DetectorRuleExecutionMode;
import io.pulumi.awsnative.frauddetector.enums.DetectorVersionStatus;
import io.pulumi.awsnative.frauddetector.outputs.DetectorEventType;
import io.pulumi.awsnative.frauddetector.outputs.DetectorModel;
import io.pulumi.awsnative.frauddetector.outputs.DetectorRule;
import io.pulumi.awsnative.frauddetector.outputs.DetectorTag;
import io.pulumi.core.internal.annotations.OutputCustomType;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class GetDetectorResult {
    /**
     * The ARN of the detector.
     * 
     */
    private final @Nullable String arn;
    /**
     * The models to associate with this detector.
     * 
     */
    private final @Nullable List<DetectorModel> associatedModels;
    /**
     * The time when the detector was created.
     * 
     */
    private final @Nullable String createdTime;
    /**
     * The description of the detector.
     * 
     */
    private final @Nullable String description;
    /**
     * The active version ID of the detector
     * 
     */
    private final @Nullable String detectorVersionId;
    /**
     * The desired detector version status for the detector
     * 
     */
    private final @Nullable DetectorVersionStatus detectorVersionStatus;
    /**
     * The event type to associate this detector with.
     * 
     */
    private final @Nullable DetectorEventType eventType;
    /**
     * The time when the detector was last updated.
     * 
     */
    private final @Nullable String lastUpdatedTime;
    private final @Nullable DetectorRuleExecutionMode ruleExecutionMode;
    private final @Nullable List<DetectorRule> rules;
    /**
     * Tags associated with this detector.
     * 
     */
    private final @Nullable List<DetectorTag> tags;

    @OutputCustomType.Constructor({"arn","associatedModels","createdTime","description","detectorVersionId","detectorVersionStatus","eventType","lastUpdatedTime","ruleExecutionMode","rules","tags"})
    private GetDetectorResult(
        @Nullable String arn,
        @Nullable List<DetectorModel> associatedModels,
        @Nullable String createdTime,
        @Nullable String description,
        @Nullable String detectorVersionId,
        @Nullable DetectorVersionStatus detectorVersionStatus,
        @Nullable DetectorEventType eventType,
        @Nullable String lastUpdatedTime,
        @Nullable DetectorRuleExecutionMode ruleExecutionMode,
        @Nullable List<DetectorRule> rules,
        @Nullable List<DetectorTag> tags) {
        this.arn = arn;
        this.associatedModels = associatedModels;
        this.createdTime = createdTime;
        this.description = description;
        this.detectorVersionId = detectorVersionId;
        this.detectorVersionStatus = detectorVersionStatus;
        this.eventType = eventType;
        this.lastUpdatedTime = lastUpdatedTime;
        this.ruleExecutionMode = ruleExecutionMode;
        this.rules = rules;
        this.tags = tags;
    }

    /**
     * The ARN of the detector.
     * 
     */
    public Optional<String> getArn() {
        return Optional.ofNullable(this.arn);
    }
    /**
     * The models to associate with this detector.
     * 
     */
    public List<DetectorModel> getAssociatedModels() {
        return this.associatedModels == null ? List.of() : this.associatedModels;
    }
    /**
     * The time when the detector was created.
     * 
     */
    public Optional<String> getCreatedTime() {
        return Optional.ofNullable(this.createdTime);
    }
    /**
     * The description of the detector.
     * 
     */
    public Optional<String> getDescription() {
        return Optional.ofNullable(this.description);
    }
    /**
     * The active version ID of the detector
     * 
     */
    public Optional<String> getDetectorVersionId() {
        return Optional.ofNullable(this.detectorVersionId);
    }
    /**
     * The desired detector version status for the detector
     * 
     */
    public Optional<DetectorVersionStatus> getDetectorVersionStatus() {
        return Optional.ofNullable(this.detectorVersionStatus);
    }
    /**
     * The event type to associate this detector with.
     * 
     */
    public Optional<DetectorEventType> getEventType() {
        return Optional.ofNullable(this.eventType);
    }
    /**
     * The time when the detector was last updated.
     * 
     */
    public Optional<String> getLastUpdatedTime() {
        return Optional.ofNullable(this.lastUpdatedTime);
    }
    public Optional<DetectorRuleExecutionMode> getRuleExecutionMode() {
        return Optional.ofNullable(this.ruleExecutionMode);
    }
    public List<DetectorRule> getRules() {
        return this.rules == null ? List.of() : this.rules;
    }
    /**
     * Tags associated with this detector.
     * 
     */
    public List<DetectorTag> getTags() {
        return this.tags == null ? List.of() : this.tags;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetDetectorResult defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String arn;
        private @Nullable List<DetectorModel> associatedModels;
        private @Nullable String createdTime;
        private @Nullable String description;
        private @Nullable String detectorVersionId;
        private @Nullable DetectorVersionStatus detectorVersionStatus;
        private @Nullable DetectorEventType eventType;
        private @Nullable String lastUpdatedTime;
        private @Nullable DetectorRuleExecutionMode ruleExecutionMode;
        private @Nullable List<DetectorRule> rules;
        private @Nullable List<DetectorTag> tags;

        public Builder() {
    	      // Empty
        }

        public Builder(GetDetectorResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.arn = defaults.arn;
    	      this.associatedModels = defaults.associatedModels;
    	      this.createdTime = defaults.createdTime;
    	      this.description = defaults.description;
    	      this.detectorVersionId = defaults.detectorVersionId;
    	      this.detectorVersionStatus = defaults.detectorVersionStatus;
    	      this.eventType = defaults.eventType;
    	      this.lastUpdatedTime = defaults.lastUpdatedTime;
    	      this.ruleExecutionMode = defaults.ruleExecutionMode;
    	      this.rules = defaults.rules;
    	      this.tags = defaults.tags;
        }

        public Builder setArn(@Nullable String arn) {
            this.arn = arn;
            return this;
        }

        public Builder setAssociatedModels(@Nullable List<DetectorModel> associatedModels) {
            this.associatedModels = associatedModels;
            return this;
        }

        public Builder setCreatedTime(@Nullable String createdTime) {
            this.createdTime = createdTime;
            return this;
        }

        public Builder setDescription(@Nullable String description) {
            this.description = description;
            return this;
        }

        public Builder setDetectorVersionId(@Nullable String detectorVersionId) {
            this.detectorVersionId = detectorVersionId;
            return this;
        }

        public Builder setDetectorVersionStatus(@Nullable DetectorVersionStatus detectorVersionStatus) {
            this.detectorVersionStatus = detectorVersionStatus;
            return this;
        }

        public Builder setEventType(@Nullable DetectorEventType eventType) {
            this.eventType = eventType;
            return this;
        }

        public Builder setLastUpdatedTime(@Nullable String lastUpdatedTime) {
            this.lastUpdatedTime = lastUpdatedTime;
            return this;
        }

        public Builder setRuleExecutionMode(@Nullable DetectorRuleExecutionMode ruleExecutionMode) {
            this.ruleExecutionMode = ruleExecutionMode;
            return this;
        }

        public Builder setRules(@Nullable List<DetectorRule> rules) {
            this.rules = rules;
            return this;
        }

        public Builder setTags(@Nullable List<DetectorTag> tags) {
            this.tags = tags;
            return this;
        }

        public GetDetectorResult build() {
            return new GetDetectorResult(arn, associatedModels, createdTime, description, detectorVersionId, detectorVersionStatus, eventType, lastUpdatedTime, ruleExecutionMode, rules, tags);
        }
    }
}
