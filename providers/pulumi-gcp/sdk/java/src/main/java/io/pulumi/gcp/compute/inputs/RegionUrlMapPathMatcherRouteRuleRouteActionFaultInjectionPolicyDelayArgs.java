// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.compute.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.internal.annotations.InputImport;
import io.pulumi.gcp.compute.inputs.RegionUrlMapPathMatcherRouteRuleRouteActionFaultInjectionPolicyDelayFixedDelayArgs;
import java.lang.Double;
import java.util.Objects;
import javax.annotation.Nullable;


public final class RegionUrlMapPathMatcherRouteRuleRouteActionFaultInjectionPolicyDelayArgs extends io.pulumi.resources.ResourceArgs {

    public static final RegionUrlMapPathMatcherRouteRuleRouteActionFaultInjectionPolicyDelayArgs Empty = new RegionUrlMapPathMatcherRouteRuleRouteActionFaultInjectionPolicyDelayArgs();

    /**
     * Specifies the value of the fixed delay interval.
     * Structure is documented below.
     * 
     */
    @InputImport(name="fixedDelay")
    private final @Nullable Input<RegionUrlMapPathMatcherRouteRuleRouteActionFaultInjectionPolicyDelayFixedDelayArgs> fixedDelay;

    public Input<RegionUrlMapPathMatcherRouteRuleRouteActionFaultInjectionPolicyDelayFixedDelayArgs> getFixedDelay() {
        return this.fixedDelay == null ? Input.empty() : this.fixedDelay;
    }

    /**
     * The percentage of traffic (connections/operations/requests) on which delay will
     * be introduced as part of fault injection. The value must be between 0.0 and
     * 100.0 inclusive.
     * 
     */
    @InputImport(name="percentage")
    private final @Nullable Input<Double> percentage;

    public Input<Double> getPercentage() {
        return this.percentage == null ? Input.empty() : this.percentage;
    }

    public RegionUrlMapPathMatcherRouteRuleRouteActionFaultInjectionPolicyDelayArgs(
        @Nullable Input<RegionUrlMapPathMatcherRouteRuleRouteActionFaultInjectionPolicyDelayFixedDelayArgs> fixedDelay,
        @Nullable Input<Double> percentage) {
        this.fixedDelay = fixedDelay;
        this.percentage = percentage;
    }

    private RegionUrlMapPathMatcherRouteRuleRouteActionFaultInjectionPolicyDelayArgs() {
        this.fixedDelay = Input.empty();
        this.percentage = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(RegionUrlMapPathMatcherRouteRuleRouteActionFaultInjectionPolicyDelayArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<RegionUrlMapPathMatcherRouteRuleRouteActionFaultInjectionPolicyDelayFixedDelayArgs> fixedDelay;
        private @Nullable Input<Double> percentage;

        public Builder() {
    	      // Empty
        }

        public Builder(RegionUrlMapPathMatcherRouteRuleRouteActionFaultInjectionPolicyDelayArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.fixedDelay = defaults.fixedDelay;
    	      this.percentage = defaults.percentage;
        }

        public Builder setFixedDelay(@Nullable Input<RegionUrlMapPathMatcherRouteRuleRouteActionFaultInjectionPolicyDelayFixedDelayArgs> fixedDelay) {
            this.fixedDelay = fixedDelay;
            return this;
        }

        public Builder setFixedDelay(@Nullable RegionUrlMapPathMatcherRouteRuleRouteActionFaultInjectionPolicyDelayFixedDelayArgs fixedDelay) {
            this.fixedDelay = Input.ofNullable(fixedDelay);
            return this;
        }

        public Builder setPercentage(@Nullable Input<Double> percentage) {
            this.percentage = percentage;
            return this;
        }

        public Builder setPercentage(@Nullable Double percentage) {
            this.percentage = Input.ofNullable(percentage);
            return this;
        }

        public RegionUrlMapPathMatcherRouteRuleRouteActionFaultInjectionPolicyDelayArgs build() {
            return new RegionUrlMapPathMatcherRouteRuleRouteActionFaultInjectionPolicyDelayArgs(fixedDelay, percentage);
        }
    }
}