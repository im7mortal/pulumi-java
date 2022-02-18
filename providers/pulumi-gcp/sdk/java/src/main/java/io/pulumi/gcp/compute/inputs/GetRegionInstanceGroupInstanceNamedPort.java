// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.compute.inputs;

import io.pulumi.core.internal.annotations.InputImport;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;


public final class GetRegionInstanceGroupInstanceNamedPort extends io.pulumi.resources.InvokeArgs {

    public static final GetRegionInstanceGroupInstanceNamedPort Empty = new GetRegionInstanceGroupInstanceNamedPort();

    /**
     * The name of the instance group.  One of `name` or `self_link` must be provided.
     * 
     */
    @InputImport(name="name", required=true)
    private final String name;

    public String getName() {
        return this.name;
    }

    /**
     * Integer port number
     * 
     */
    @InputImport(name="port", required=true)
    private final Integer port;

    public Integer getPort() {
        return this.port;
    }

    public GetRegionInstanceGroupInstanceNamedPort(
        String name,
        Integer port) {
        this.name = Objects.requireNonNull(name, "expected parameter 'name' to be non-null");
        this.port = Objects.requireNonNull(port, "expected parameter 'port' to be non-null");
    }

    private GetRegionInstanceGroupInstanceNamedPort() {
        this.name = null;
        this.port = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetRegionInstanceGroupInstanceNamedPort defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String name;
        private Integer port;

        public Builder() {
    	      // Empty
        }

        public Builder(GetRegionInstanceGroupInstanceNamedPort defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.name = defaults.name;
    	      this.port = defaults.port;
        }

        public Builder setName(String name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }

        public Builder setPort(Integer port) {
            this.port = Objects.requireNonNull(port);
            return this;
        }

        public GetRegionInstanceGroupInstanceNamedPort build() {
            return new GetRegionInstanceGroupInstanceNamedPort(name, port);
        }
    }
}