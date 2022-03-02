// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.compute_beta.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;

@OutputCustomType
public final class SubsettingResponse {
    private final String policy;
    /**
     * The number of backends per backend group assigned to each proxy instance or each service mesh client. An input parameter to the `CONSISTENT_HASH_SUBSETTING` algorithm. Can only be set if `policy` is set to `CONSISTENT_HASH_SUBSETTING`. Can only be set if load balancing scheme is `INTERNAL_MANAGED` or `INTERNAL_SELF_MANAGED`. `subset_size` is optional for Internal HTTP(S) load balancing and required for Traffic Director. If you do not provide this value, Cloud Load Balancing will calculate it dynamically to optimize the number of proxies/clients visible to each backend and vice versa. Must be greater than 0. If `subset_size` is larger than the number of backends/endpoints, then subsetting is disabled.
     * 
     */
    private final Integer subsetSize;

    @OutputCustomType.Constructor({"policy","subsetSize"})
    private SubsettingResponse(
        String policy,
        Integer subsetSize) {
        this.policy = Objects.requireNonNull(policy);
        this.subsetSize = Objects.requireNonNull(subsetSize);
    }

    public String getPolicy() {
        return this.policy;
    }
    /**
     * The number of backends per backend group assigned to each proxy instance or each service mesh client. An input parameter to the `CONSISTENT_HASH_SUBSETTING` algorithm. Can only be set if `policy` is set to `CONSISTENT_HASH_SUBSETTING`. Can only be set if load balancing scheme is `INTERNAL_MANAGED` or `INTERNAL_SELF_MANAGED`. `subset_size` is optional for Internal HTTP(S) load balancing and required for Traffic Director. If you do not provide this value, Cloud Load Balancing will calculate it dynamically to optimize the number of proxies/clients visible to each backend and vice versa. Must be greater than 0. If `subset_size` is larger than the number of backends/endpoints, then subsetting is disabled.
     * 
    */
    public Integer getSubsetSize() {
        return this.subsetSize;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(SubsettingResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String policy;
        private Integer subsetSize;

        public Builder() {
    	      // Empty
        }

        public Builder(SubsettingResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.policy = defaults.policy;
    	      this.subsetSize = defaults.subsetSize;
        }

        public Builder setPolicy(String policy) {
            this.policy = Objects.requireNonNull(policy);
            return this;
        }

        public Builder setSubsetSize(Integer subsetSize) {
            this.subsetSize = Objects.requireNonNull(subsetSize);
            return this;
        }
        public SubsettingResponse build() {
            return new SubsettingResponse(policy, subsetSize);
        }
    }
}
