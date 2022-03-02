// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.container_v1beta1.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import java.lang.Boolean;
import java.util.Objects;

@OutputCustomType
public final class HttpLoadBalancingResponse {
    /**
     * Whether the HTTP Load Balancing controller is enabled in the cluster. When enabled, it runs a small pod in the cluster that manages the load balancers.
     * 
     */
    private final Boolean disabled;

    @OutputCustomType.Constructor({"disabled"})
    private HttpLoadBalancingResponse(Boolean disabled) {
        this.disabled = Objects.requireNonNull(disabled);
    }

    /**
     * Whether the HTTP Load Balancing controller is enabled in the cluster. When enabled, it runs a small pod in the cluster that manages the load balancers.
     * 
    */
    public Boolean getDisabled() {
        return this.disabled;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(HttpLoadBalancingResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Boolean disabled;

        public Builder() {
    	      // Empty
        }

        public Builder(HttpLoadBalancingResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.disabled = defaults.disabled;
        }

        public Builder setDisabled(Boolean disabled) {
            this.disabled = Objects.requireNonNull(disabled);
            return this;
        }
        public HttpLoadBalancingResponse build() {
            return new HttpLoadBalancingResponse(disabled);
        }
    }
}
