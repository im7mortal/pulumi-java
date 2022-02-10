// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.compute_alpha.outputs;

import io.pulumi.core.internal.annotations.OutputCustomType;
import io.pulumi.googlenative.compute_alpha.outputs.AllocationSpecificSKUAllocationReservedInstancePropertiesResponse;
import java.lang.String;
import java.util.Objects;

@OutputCustomType
public final class FutureReservationSpecificSKUPropertiesResponse {
    private final AllocationSpecificSKUAllocationReservedInstancePropertiesResponse instanceProperties;
    private final String totalCount;

    @OutputCustomType.Constructor({"instanceProperties","totalCount"})
    private FutureReservationSpecificSKUPropertiesResponse(
        AllocationSpecificSKUAllocationReservedInstancePropertiesResponse instanceProperties,
        String totalCount) {
        this.instanceProperties = Objects.requireNonNull(instanceProperties);
        this.totalCount = Objects.requireNonNull(totalCount);
    }

    public AllocationSpecificSKUAllocationReservedInstancePropertiesResponse getInstanceProperties() {
        return this.instanceProperties;
    }
    public String getTotalCount() {
        return this.totalCount;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(FutureReservationSpecificSKUPropertiesResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private AllocationSpecificSKUAllocationReservedInstancePropertiesResponse instanceProperties;
        private String totalCount;

        public Builder() {
    	      // Empty
        }

        public Builder(FutureReservationSpecificSKUPropertiesResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.instanceProperties = defaults.instanceProperties;
    	      this.totalCount = defaults.totalCount;
        }

        public Builder setInstanceProperties(AllocationSpecificSKUAllocationReservedInstancePropertiesResponse instanceProperties) {
            this.instanceProperties = Objects.requireNonNull(instanceProperties);
            return this;
        }

        public Builder setTotalCount(String totalCount) {
            this.totalCount = Objects.requireNonNull(totalCount);
            return this;
        }

        public FutureReservationSpecificSKUPropertiesResponse build() {
            return new FutureReservationSpecificSKUPropertiesResponse(instanceProperties, totalCount);
        }
    }
}