// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.compute.outputs;

import io.pulumi.azurenative.compute.outputs.LoadBalancerFrontendIPConfigurationPropertiesResponse;
import io.pulumi.core.annotations.OutputCustomType;
import java.lang.String;
import java.util.Objects;

@OutputCustomType
public final class LoadBalancerFrontendIPConfigurationResponse {
    /**
     * The name of the resource that is unique within the set of frontend IP configurations used by the load balancer. This name can be used to access the resource.
     * 
     */
    private final String name;
    /**
     * Properties of load balancer frontend ip configuration.
     * 
     */
    private final LoadBalancerFrontendIPConfigurationPropertiesResponse properties;

    @OutputCustomType.Constructor({"name","properties"})
    private LoadBalancerFrontendIPConfigurationResponse(
        String name,
        LoadBalancerFrontendIPConfigurationPropertiesResponse properties) {
        this.name = Objects.requireNonNull(name);
        this.properties = Objects.requireNonNull(properties);
    }

    /**
     * The name of the resource that is unique within the set of frontend IP configurations used by the load balancer. This name can be used to access the resource.
     * 
    */
    public String getName() {
        return this.name;
    }
    /**
     * Properties of load balancer frontend ip configuration.
     * 
    */
    public LoadBalancerFrontendIPConfigurationPropertiesResponse getProperties() {
        return this.properties;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(LoadBalancerFrontendIPConfigurationResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String name;
        private LoadBalancerFrontendIPConfigurationPropertiesResponse properties;

        public Builder() {
    	      // Empty
        }

        public Builder(LoadBalancerFrontendIPConfigurationResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.name = defaults.name;
    	      this.properties = defaults.properties;
        }

        public Builder setName(String name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }

        public Builder setProperties(LoadBalancerFrontendIPConfigurationPropertiesResponse properties) {
            this.properties = Objects.requireNonNull(properties);
            return this;
        }
        public LoadBalancerFrontendIPConfigurationResponse build() {
            return new LoadBalancerFrontendIPConfigurationResponse(name, properties);
        }
    }
}
