// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.logic.outputs;

import io.pulumi.azurenative.logic.outputs.IpAddressRangeResponse;
import io.pulumi.azurenative.logic.outputs.OpenAuthenticationAccessPoliciesResponse;
import io.pulumi.core.annotations.OutputCustomType;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class FlowAccessControlConfigurationPolicyResponse {
    /**
     * The allowed caller IP address ranges.
     * 
     */
    private final @Nullable List<IpAddressRangeResponse> allowedCallerIpAddresses;
    /**
     * The authentication policies for workflow.
     * 
     */
    private final @Nullable OpenAuthenticationAccessPoliciesResponse openAuthenticationPolicies;

    @OutputCustomType.Constructor({"allowedCallerIpAddresses","openAuthenticationPolicies"})
    private FlowAccessControlConfigurationPolicyResponse(
        @Nullable List<IpAddressRangeResponse> allowedCallerIpAddresses,
        @Nullable OpenAuthenticationAccessPoliciesResponse openAuthenticationPolicies) {
        this.allowedCallerIpAddresses = allowedCallerIpAddresses;
        this.openAuthenticationPolicies = openAuthenticationPolicies;
    }

    /**
     * The allowed caller IP address ranges.
     * 
    */
    public List<IpAddressRangeResponse> getAllowedCallerIpAddresses() {
        return this.allowedCallerIpAddresses == null ? List.of() : this.allowedCallerIpAddresses;
    }
    /**
     * The authentication policies for workflow.
     * 
    */
    public Optional<OpenAuthenticationAccessPoliciesResponse> getOpenAuthenticationPolicies() {
        return Optional.ofNullable(this.openAuthenticationPolicies);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(FlowAccessControlConfigurationPolicyResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable List<IpAddressRangeResponse> allowedCallerIpAddresses;
        private @Nullable OpenAuthenticationAccessPoliciesResponse openAuthenticationPolicies;

        public Builder() {
    	      // Empty
        }

        public Builder(FlowAccessControlConfigurationPolicyResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.allowedCallerIpAddresses = defaults.allowedCallerIpAddresses;
    	      this.openAuthenticationPolicies = defaults.openAuthenticationPolicies;
        }

        public Builder setAllowedCallerIpAddresses(@Nullable List<IpAddressRangeResponse> allowedCallerIpAddresses) {
            this.allowedCallerIpAddresses = allowedCallerIpAddresses;
            return this;
        }

        public Builder setOpenAuthenticationPolicies(@Nullable OpenAuthenticationAccessPoliciesResponse openAuthenticationPolicies) {
            this.openAuthenticationPolicies = openAuthenticationPolicies;
            return this;
        }
        public FlowAccessControlConfigurationPolicyResponse build() {
            return new FlowAccessControlConfigurationPolicyResponse(allowedCallerIpAddresses, openAuthenticationPolicies);
        }
    }
}
