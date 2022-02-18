// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.apigateway;

import io.pulumi.awsnative.apigateway.inputs.UsagePlanApiStageArgs;
import io.pulumi.awsnative.apigateway.inputs.UsagePlanQuotaSettingsArgs;
import io.pulumi.awsnative.apigateway.inputs.UsagePlanTagArgs;
import io.pulumi.awsnative.apigateway.inputs.UsagePlanThrottleSettingsArgs;
import io.pulumi.core.Input;
import io.pulumi.core.internal.annotations.InputImport;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;


public final class UsagePlanArgs extends io.pulumi.resources.ResourceArgs {

    public static final UsagePlanArgs Empty = new UsagePlanArgs();

    /**
     * The API stages to associate with this usage plan.
     * 
     */
    @InputImport(name="apiStages")
    private final @Nullable Input<List<UsagePlanApiStageArgs>> apiStages;

    public Input<List<UsagePlanApiStageArgs>> getApiStages() {
        return this.apiStages == null ? Input.empty() : this.apiStages;
    }

    /**
     * A description of the usage plan.
     * 
     */
    @InputImport(name="description")
    private final @Nullable Input<String> description;

    public Input<String> getDescription() {
        return this.description == null ? Input.empty() : this.description;
    }

    /**
     * Configures the number of requests that users can make within a given interval.
     * 
     */
    @InputImport(name="quota")
    private final @Nullable Input<UsagePlanQuotaSettingsArgs> quota;

    public Input<UsagePlanQuotaSettingsArgs> getQuota() {
        return this.quota == null ? Input.empty() : this.quota;
    }

    /**
     * An array of arbitrary tags (key-value pairs) to associate with the usage plan.
     * 
     */
    @InputImport(name="tags")
    private final @Nullable Input<List<UsagePlanTagArgs>> tags;

    public Input<List<UsagePlanTagArgs>> getTags() {
        return this.tags == null ? Input.empty() : this.tags;
    }

    /**
     * Configures the overall request rate (average requests per second) and burst capacity.
     * 
     */
    @InputImport(name="throttle")
    private final @Nullable Input<UsagePlanThrottleSettingsArgs> throttle;

    public Input<UsagePlanThrottleSettingsArgs> getThrottle() {
        return this.throttle == null ? Input.empty() : this.throttle;
    }

    /**
     * A name for the usage plan.
     * 
     */
    @InputImport(name="usagePlanName")
    private final @Nullable Input<String> usagePlanName;

    public Input<String> getUsagePlanName() {
        return this.usagePlanName == null ? Input.empty() : this.usagePlanName;
    }

    public UsagePlanArgs(
        @Nullable Input<List<UsagePlanApiStageArgs>> apiStages,
        @Nullable Input<String> description,
        @Nullable Input<UsagePlanQuotaSettingsArgs> quota,
        @Nullable Input<List<UsagePlanTagArgs>> tags,
        @Nullable Input<UsagePlanThrottleSettingsArgs> throttle,
        @Nullable Input<String> usagePlanName) {
        this.apiStages = apiStages;
        this.description = description;
        this.quota = quota;
        this.tags = tags;
        this.throttle = throttle;
        this.usagePlanName = usagePlanName;
    }

    private UsagePlanArgs() {
        this.apiStages = Input.empty();
        this.description = Input.empty();
        this.quota = Input.empty();
        this.tags = Input.empty();
        this.throttle = Input.empty();
        this.usagePlanName = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(UsagePlanArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<List<UsagePlanApiStageArgs>> apiStages;
        private @Nullable Input<String> description;
        private @Nullable Input<UsagePlanQuotaSettingsArgs> quota;
        private @Nullable Input<List<UsagePlanTagArgs>> tags;
        private @Nullable Input<UsagePlanThrottleSettingsArgs> throttle;
        private @Nullable Input<String> usagePlanName;

        public Builder() {
    	      // Empty
        }

        public Builder(UsagePlanArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.apiStages = defaults.apiStages;
    	      this.description = defaults.description;
    	      this.quota = defaults.quota;
    	      this.tags = defaults.tags;
    	      this.throttle = defaults.throttle;
    	      this.usagePlanName = defaults.usagePlanName;
        }

        public Builder setApiStages(@Nullable Input<List<UsagePlanApiStageArgs>> apiStages) {
            this.apiStages = apiStages;
            return this;
        }

        public Builder setApiStages(@Nullable List<UsagePlanApiStageArgs> apiStages) {
            this.apiStages = Input.ofNullable(apiStages);
            return this;
        }

        public Builder setDescription(@Nullable Input<String> description) {
            this.description = description;
            return this;
        }

        public Builder setDescription(@Nullable String description) {
            this.description = Input.ofNullable(description);
            return this;
        }

        public Builder setQuota(@Nullable Input<UsagePlanQuotaSettingsArgs> quota) {
            this.quota = quota;
            return this;
        }

        public Builder setQuota(@Nullable UsagePlanQuotaSettingsArgs quota) {
            this.quota = Input.ofNullable(quota);
            return this;
        }

        public Builder setTags(@Nullable Input<List<UsagePlanTagArgs>> tags) {
            this.tags = tags;
            return this;
        }

        public Builder setTags(@Nullable List<UsagePlanTagArgs> tags) {
            this.tags = Input.ofNullable(tags);
            return this;
        }

        public Builder setThrottle(@Nullable Input<UsagePlanThrottleSettingsArgs> throttle) {
            this.throttle = throttle;
            return this;
        }

        public Builder setThrottle(@Nullable UsagePlanThrottleSettingsArgs throttle) {
            this.throttle = Input.ofNullable(throttle);
            return this;
        }

        public Builder setUsagePlanName(@Nullable Input<String> usagePlanName) {
            this.usagePlanName = usagePlanName;
            return this;
        }

        public Builder setUsagePlanName(@Nullable String usagePlanName) {
            this.usagePlanName = Input.ofNullable(usagePlanName);
            return this;
        }

        public UsagePlanArgs build() {
            return new UsagePlanArgs(apiStages, description, quota, tags, throttle, usagePlanName);
        }
    }
}
