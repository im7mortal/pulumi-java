// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.bigtableadmin_v2.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import java.lang.Integer;
import java.util.Objects;

@OutputCustomType
public final class AutoscalingLimitsResponse {
    /**
     * Maximum number of nodes to scale up to.
     * 
     */
    private final Integer maxServeNodes;
    /**
     * Minimum number of nodes to scale down to.
     * 
     */
    private final Integer minServeNodes;

    @OutputCustomType.Constructor({"maxServeNodes","minServeNodes"})
    private AutoscalingLimitsResponse(
        Integer maxServeNodes,
        Integer minServeNodes) {
        this.maxServeNodes = Objects.requireNonNull(maxServeNodes);
        this.minServeNodes = Objects.requireNonNull(minServeNodes);
    }

    /**
     * Maximum number of nodes to scale up to.
     * 
    */
    public Integer getMaxServeNodes() {
        return this.maxServeNodes;
    }
    /**
     * Minimum number of nodes to scale down to.
     * 
    */
    public Integer getMinServeNodes() {
        return this.minServeNodes;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(AutoscalingLimitsResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Integer maxServeNodes;
        private Integer minServeNodes;

        public Builder() {
    	      // Empty
        }

        public Builder(AutoscalingLimitsResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.maxServeNodes = defaults.maxServeNodes;
    	      this.minServeNodes = defaults.minServeNodes;
        }

        public Builder setMaxServeNodes(Integer maxServeNodes) {
            this.maxServeNodes = Objects.requireNonNull(maxServeNodes);
            return this;
        }

        public Builder setMinServeNodes(Integer minServeNodes) {
            this.minServeNodes = Objects.requireNonNull(minServeNodes);
            return this;
        }
        public AutoscalingLimitsResponse build() {
            return new AutoscalingLimitsResponse(maxServeNodes, minServeNodes);
        }
    }
}
