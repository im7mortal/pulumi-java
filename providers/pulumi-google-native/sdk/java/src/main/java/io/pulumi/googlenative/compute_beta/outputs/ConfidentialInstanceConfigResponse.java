// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.compute_beta.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import java.lang.Boolean;
import java.util.Objects;

@OutputCustomType
public final class ConfidentialInstanceConfigResponse {
    /**
     * Defines whether the instance should have confidential compute enabled.
     * 
     */
    private final Boolean enableConfidentialCompute;

    @OutputCustomType.Constructor({"enableConfidentialCompute"})
    private ConfidentialInstanceConfigResponse(Boolean enableConfidentialCompute) {
        this.enableConfidentialCompute = Objects.requireNonNull(enableConfidentialCompute);
    }

    /**
     * Defines whether the instance should have confidential compute enabled.
     * 
    */
    public Boolean getEnableConfidentialCompute() {
        return this.enableConfidentialCompute;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ConfidentialInstanceConfigResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Boolean enableConfidentialCompute;

        public Builder() {
    	      // Empty
        }

        public Builder(ConfidentialInstanceConfigResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.enableConfidentialCompute = defaults.enableConfidentialCompute;
        }

        public Builder setEnableConfidentialCompute(Boolean enableConfidentialCompute) {
            this.enableConfidentialCompute = Objects.requireNonNull(enableConfidentialCompute);
            return this;
        }
        public ConfidentialInstanceConfigResponse build() {
            return new ConfidentialInstanceConfigResponse(enableConfidentialCompute);
        }
    }
}
