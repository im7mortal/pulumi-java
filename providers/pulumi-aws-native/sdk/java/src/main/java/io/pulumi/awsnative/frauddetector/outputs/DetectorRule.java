// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.frauddetector.outputs;

import io.pulumi.awsnative.frauddetector.enums.DetectorRuleLanguage;
import io.pulumi.awsnative.frauddetector.outputs.DetectorOutcome;
import io.pulumi.awsnative.frauddetector.outputs.DetectorTag;
import io.pulumi.core.internal.annotations.OutputCustomType;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class DetectorRule {
    private final @Nullable String arn;
    /**
     * The time when the event type was created.
     * 
     */
    private final @Nullable String createdTime;
    /**
     * The description.
     * 
     */
    private final @Nullable String description;
    private final @Nullable String detectorId;
    private final @Nullable String expression;
    private final @Nullable DetectorRuleLanguage language;
    /**
     * The time when the event type was last updated.
     * 
     */
    private final @Nullable String lastUpdatedTime;
    private final @Nullable List<DetectorOutcome> outcomes;
    private final @Nullable String ruleId;
    private final @Nullable String ruleVersion;
    /**
     * Tags associated with this event type.
     * 
     */
    private final @Nullable List<DetectorTag> tags;

    @OutputCustomType.Constructor({"arn","createdTime","description","detectorId","expression","language","lastUpdatedTime","outcomes","ruleId","ruleVersion","tags"})
    private DetectorRule(
        @Nullable String arn,
        @Nullable String createdTime,
        @Nullable String description,
        @Nullable String detectorId,
        @Nullable String expression,
        @Nullable DetectorRuleLanguage language,
        @Nullable String lastUpdatedTime,
        @Nullable List<DetectorOutcome> outcomes,
        @Nullable String ruleId,
        @Nullable String ruleVersion,
        @Nullable List<DetectorTag> tags) {
        this.arn = arn;
        this.createdTime = createdTime;
        this.description = description;
        this.detectorId = detectorId;
        this.expression = expression;
        this.language = language;
        this.lastUpdatedTime = lastUpdatedTime;
        this.outcomes = outcomes;
        this.ruleId = ruleId;
        this.ruleVersion = ruleVersion;
        this.tags = tags;
    }

    public Optional<String> getArn() {
        return Optional.ofNullable(this.arn);
    }
    /**
     * The time when the event type was created.
     * 
     */
    public Optional<String> getCreatedTime() {
        return Optional.ofNullable(this.createdTime);
    }
    /**
     * The description.
     * 
     */
    public Optional<String> getDescription() {
        return Optional.ofNullable(this.description);
    }
    public Optional<String> getDetectorId() {
        return Optional.ofNullable(this.detectorId);
    }
    public Optional<String> getExpression() {
        return Optional.ofNullable(this.expression);
    }
    public Optional<DetectorRuleLanguage> getLanguage() {
        return Optional.ofNullable(this.language);
    }
    /**
     * The time when the event type was last updated.
     * 
     */
    public Optional<String> getLastUpdatedTime() {
        return Optional.ofNullable(this.lastUpdatedTime);
    }
    public List<DetectorOutcome> getOutcomes() {
        return this.outcomes == null ? List.of() : this.outcomes;
    }
    public Optional<String> getRuleId() {
        return Optional.ofNullable(this.ruleId);
    }
    public Optional<String> getRuleVersion() {
        return Optional.ofNullable(this.ruleVersion);
    }
    /**
     * Tags associated with this event type.
     * 
     */
    public List<DetectorTag> getTags() {
        return this.tags == null ? List.of() : this.tags;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(DetectorRule defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String arn;
        private @Nullable String createdTime;
        private @Nullable String description;
        private @Nullable String detectorId;
        private @Nullable String expression;
        private @Nullable DetectorRuleLanguage language;
        private @Nullable String lastUpdatedTime;
        private @Nullable List<DetectorOutcome> outcomes;
        private @Nullable String ruleId;
        private @Nullable String ruleVersion;
        private @Nullable List<DetectorTag> tags;

        public Builder() {
    	      // Empty
        }

        public Builder(DetectorRule defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.arn = defaults.arn;
    	      this.createdTime = defaults.createdTime;
    	      this.description = defaults.description;
    	      this.detectorId = defaults.detectorId;
    	      this.expression = defaults.expression;
    	      this.language = defaults.language;
    	      this.lastUpdatedTime = defaults.lastUpdatedTime;
    	      this.outcomes = defaults.outcomes;
    	      this.ruleId = defaults.ruleId;
    	      this.ruleVersion = defaults.ruleVersion;
    	      this.tags = defaults.tags;
        }

        public Builder setArn(@Nullable String arn) {
            this.arn = arn;
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

        public Builder setDetectorId(@Nullable String detectorId) {
            this.detectorId = detectorId;
            return this;
        }

        public Builder setExpression(@Nullable String expression) {
            this.expression = expression;
            return this;
        }

        public Builder setLanguage(@Nullable DetectorRuleLanguage language) {
            this.language = language;
            return this;
        }

        public Builder setLastUpdatedTime(@Nullable String lastUpdatedTime) {
            this.lastUpdatedTime = lastUpdatedTime;
            return this;
        }

        public Builder setOutcomes(@Nullable List<DetectorOutcome> outcomes) {
            this.outcomes = outcomes;
            return this;
        }

        public Builder setRuleId(@Nullable String ruleId) {
            this.ruleId = ruleId;
            return this;
        }

        public Builder setRuleVersion(@Nullable String ruleVersion) {
            this.ruleVersion = ruleVersion;
            return this;
        }

        public Builder setTags(@Nullable List<DetectorTag> tags) {
            this.tags = tags;
            return this;
        }

        public DetectorRule build() {
            return new DetectorRule(arn, createdTime, description, detectorId, expression, language, lastUpdatedTime, outcomes, ruleId, ruleVersion, tags);
        }
    }
}
