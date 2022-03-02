// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.ml_v1.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import java.lang.Integer;
import java.util.Objects;

@OutputCustomType
public final class GoogleCloudMlV1__SampledShapleyAttributionResponse {
    /**
     * The number of feature permutations to consider when approximating the Shapley values.
     * 
     */
    private final Integer numPaths;

    @OutputCustomType.Constructor({"numPaths"})
    private GoogleCloudMlV1__SampledShapleyAttributionResponse(Integer numPaths) {
        this.numPaths = Objects.requireNonNull(numPaths);
    }

    /**
     * The number of feature permutations to consider when approximating the Shapley values.
     * 
    */
    public Integer getNumPaths() {
        return this.numPaths;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GoogleCloudMlV1__SampledShapleyAttributionResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Integer numPaths;

        public Builder() {
    	      // Empty
        }

        public Builder(GoogleCloudMlV1__SampledShapleyAttributionResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.numPaths = defaults.numPaths;
        }

        public Builder setNumPaths(Integer numPaths) {
            this.numPaths = Objects.requireNonNull(numPaths);
            return this;
        }
        public GoogleCloudMlV1__SampledShapleyAttributionResponse build() {
            return new GoogleCloudMlV1__SampledShapleyAttributionResponse(numPaths);
        }
    }
}
