// *** WARNING: this file was generated by test. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.registrygeoreplication;

import io.pulumi.azurenative.resources.ResourceGroup;
import io.pulumi.core.Input;
import io.pulumi.core.internal.annotations.InputImport;
import java.util.Objects;


public final class RegistryGeoReplicationArgs extends io.pulumi.resources.ResourceArgs {

    public static final RegistryGeoReplicationArgs Empty = new RegistryGeoReplicationArgs();

    @InputImport(name="resourceGroup", required=true)
    private final Input<ResourceGroup> resourceGroup;

    public Input<ResourceGroup> getResourceGroup() {
        return this.resourceGroup;
    }

    public RegistryGeoReplicationArgs(Input<ResourceGroup> resourceGroup) {
        this.resourceGroup = Objects.requireNonNull(resourceGroup, "expected parameter 'resourceGroup' to be non-null");
    }

    private RegistryGeoReplicationArgs() {
        this.resourceGroup = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(RegistryGeoReplicationArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Input<ResourceGroup> resourceGroup;

        public Builder() {
    	      // Empty
        }

        public Builder(RegistryGeoReplicationArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.resourceGroup = defaults.resourceGroup;
        }

        public Builder setResourceGroup(Input<ResourceGroup> resourceGroup) {
            this.resourceGroup = Objects.requireNonNull(resourceGroup);
            return this;
        }

        public Builder setResourceGroup(ResourceGroup resourceGroup) {
            this.resourceGroup = Input.of(Objects.requireNonNull(resourceGroup));
            return this;
        }

        public RegistryGeoReplicationArgs build() {
            return new RegistryGeoReplicationArgs(resourceGroup);
        }
    }
}
