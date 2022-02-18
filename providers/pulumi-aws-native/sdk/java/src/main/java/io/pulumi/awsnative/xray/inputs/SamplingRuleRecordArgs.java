// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.xray.inputs;

import io.pulumi.awsnative.xray.inputs.SamplingRuleArgs;
import io.pulumi.core.Input;
import io.pulumi.core.internal.annotations.InputImport;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


public final class SamplingRuleRecordArgs extends io.pulumi.resources.ResourceArgs {

    public static final SamplingRuleRecordArgs Empty = new SamplingRuleRecordArgs();

    /**
     * When the rule was created, in Unix time seconds.
     * 
     */
    @InputImport(name="createdAt")
    private final @Nullable Input<String> createdAt;

    public Input<String> getCreatedAt() {
        return this.createdAt == null ? Input.empty() : this.createdAt;
    }

    /**
     * When the rule was modified, in Unix time seconds.
     * 
     */
    @InputImport(name="modifiedAt")
    private final @Nullable Input<String> modifiedAt;

    public Input<String> getModifiedAt() {
        return this.modifiedAt == null ? Input.empty() : this.modifiedAt;
    }

    @InputImport(name="samplingRule")
    private final @Nullable Input<SamplingRuleArgs> samplingRule;

    public Input<SamplingRuleArgs> getSamplingRule() {
        return this.samplingRule == null ? Input.empty() : this.samplingRule;
    }

    public SamplingRuleRecordArgs(
        @Nullable Input<String> createdAt,
        @Nullable Input<String> modifiedAt,
        @Nullable Input<SamplingRuleArgs> samplingRule) {
        this.createdAt = createdAt;
        this.modifiedAt = modifiedAt;
        this.samplingRule = samplingRule;
    }

    private SamplingRuleRecordArgs() {
        this.createdAt = Input.empty();
        this.modifiedAt = Input.empty();
        this.samplingRule = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(SamplingRuleRecordArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<String> createdAt;
        private @Nullable Input<String> modifiedAt;
        private @Nullable Input<SamplingRuleArgs> samplingRule;

        public Builder() {
    	      // Empty
        }

        public Builder(SamplingRuleRecordArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.createdAt = defaults.createdAt;
    	      this.modifiedAt = defaults.modifiedAt;
    	      this.samplingRule = defaults.samplingRule;
        }

        public Builder setCreatedAt(@Nullable Input<String> createdAt) {
            this.createdAt = createdAt;
            return this;
        }

        public Builder setCreatedAt(@Nullable String createdAt) {
            this.createdAt = Input.ofNullable(createdAt);
            return this;
        }

        public Builder setModifiedAt(@Nullable Input<String> modifiedAt) {
            this.modifiedAt = modifiedAt;
            return this;
        }

        public Builder setModifiedAt(@Nullable String modifiedAt) {
            this.modifiedAt = Input.ofNullable(modifiedAt);
            return this;
        }

        public Builder setSamplingRule(@Nullable Input<SamplingRuleArgs> samplingRule) {
            this.samplingRule = samplingRule;
            return this;
        }

        public Builder setSamplingRule(@Nullable SamplingRuleArgs samplingRule) {
            this.samplingRule = Input.ofNullable(samplingRule);
            return this;
        }

        public SamplingRuleRecordArgs build() {
            return new SamplingRuleRecordArgs(createdAt, modifiedAt, samplingRule);
        }
    }
}