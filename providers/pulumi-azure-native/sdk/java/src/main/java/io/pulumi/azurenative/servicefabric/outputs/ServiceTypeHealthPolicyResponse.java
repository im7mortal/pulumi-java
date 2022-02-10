// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.servicefabric.outputs;

import io.pulumi.core.internal.annotations.OutputCustomType;
import java.lang.Integer;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class ServiceTypeHealthPolicyResponse {
    private final @Nullable Integer maxPercentUnhealthyServices;

    @OutputCustomType.Constructor({"maxPercentUnhealthyServices"})
    private ServiceTypeHealthPolicyResponse(@Nullable Integer maxPercentUnhealthyServices) {
        this.maxPercentUnhealthyServices = maxPercentUnhealthyServices;
    }

    public Optional<Integer> getMaxPercentUnhealthyServices() {
        return Optional.ofNullable(this.maxPercentUnhealthyServices);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ServiceTypeHealthPolicyResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Integer maxPercentUnhealthyServices;

        public Builder() {
    	      // Empty
        }

        public Builder(ServiceTypeHealthPolicyResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.maxPercentUnhealthyServices = defaults.maxPercentUnhealthyServices;
        }

        public Builder setMaxPercentUnhealthyServices(@Nullable Integer maxPercentUnhealthyServices) {
            this.maxPercentUnhealthyServices = maxPercentUnhealthyServices;
            return this;
        }

        public ServiceTypeHealthPolicyResponse build() {
            return new ServiceTypeHealthPolicyResponse(maxPercentUnhealthyServices);
        }
    }
}