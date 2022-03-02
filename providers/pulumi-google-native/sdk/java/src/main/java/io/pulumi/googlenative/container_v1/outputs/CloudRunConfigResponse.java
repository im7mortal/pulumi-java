// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.container_v1.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import java.lang.Boolean;
import java.lang.String;
import java.util.Objects;

@OutputCustomType
public final class CloudRunConfigResponse {
    /**
     * Whether Cloud Run addon is enabled for this cluster.
     * 
     */
    private final Boolean disabled;
    /**
     * Which load balancer type is installed for Cloud Run.
     * 
     */
    private final String loadBalancerType;

    @OutputCustomType.Constructor({"disabled","loadBalancerType"})
    private CloudRunConfigResponse(
        Boolean disabled,
        String loadBalancerType) {
        this.disabled = Objects.requireNonNull(disabled);
        this.loadBalancerType = Objects.requireNonNull(loadBalancerType);
    }

    /**
     * Whether Cloud Run addon is enabled for this cluster.
     * 
    */
    public Boolean getDisabled() {
        return this.disabled;
    }
    /**
     * Which load balancer type is installed for Cloud Run.
     * 
    */
    public String getLoadBalancerType() {
        return this.loadBalancerType;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(CloudRunConfigResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Boolean disabled;
        private String loadBalancerType;

        public Builder() {
    	      // Empty
        }

        public Builder(CloudRunConfigResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.disabled = defaults.disabled;
    	      this.loadBalancerType = defaults.loadBalancerType;
        }

        public Builder setDisabled(Boolean disabled) {
            this.disabled = Objects.requireNonNull(disabled);
            return this;
        }

        public Builder setLoadBalancerType(String loadBalancerType) {
            this.loadBalancerType = Objects.requireNonNull(loadBalancerType);
            return this;
        }
        public CloudRunConfigResponse build() {
            return new CloudRunConfigResponse(disabled, loadBalancerType);
        }
    }
}
