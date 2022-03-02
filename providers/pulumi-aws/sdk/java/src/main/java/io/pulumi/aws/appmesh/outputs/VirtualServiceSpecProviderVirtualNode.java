// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.appmesh.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import java.lang.String;
import java.util.Objects;

@OutputCustomType
public final class VirtualServiceSpecProviderVirtualNode {
    /**
     * The name of the virtual node that is acting as a service provider. Must be between 1 and 255 characters in length.
     * 
     */
    private final String virtualNodeName;

    @OutputCustomType.Constructor({"virtualNodeName"})
    private VirtualServiceSpecProviderVirtualNode(String virtualNodeName) {
        this.virtualNodeName = Objects.requireNonNull(virtualNodeName);
    }

    /**
     * The name of the virtual node that is acting as a service provider. Must be between 1 and 255 characters in length.
     * 
    */
    public String getVirtualNodeName() {
        return this.virtualNodeName;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(VirtualServiceSpecProviderVirtualNode defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String virtualNodeName;

        public Builder() {
    	      // Empty
        }

        public Builder(VirtualServiceSpecProviderVirtualNode defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.virtualNodeName = defaults.virtualNodeName;
        }

        public Builder setVirtualNodeName(String virtualNodeName) {
            this.virtualNodeName = Objects.requireNonNull(virtualNodeName);
            return this;
        }
        public VirtualServiceSpecProviderVirtualNode build() {
            return new VirtualServiceSpecProviderVirtualNode(virtualNodeName);
        }
    }
}
