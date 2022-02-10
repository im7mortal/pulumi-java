// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.virtualmachineimages.outputs;

import io.pulumi.core.internal.annotations.OutputCustomType;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class VirtualNetworkConfigResponse {
    private final @Nullable String subnetId;

    @OutputCustomType.Constructor({"subnetId"})
    private VirtualNetworkConfigResponse(@Nullable String subnetId) {
        this.subnetId = subnetId;
    }

    public Optional<String> getSubnetId() {
        return Optional.ofNullable(this.subnetId);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(VirtualNetworkConfigResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String subnetId;

        public Builder() {
    	      // Empty
        }

        public Builder(VirtualNetworkConfigResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.subnetId = defaults.subnetId;
        }

        public Builder setSubnetId(@Nullable String subnetId) {
            this.subnetId = subnetId;
            return this;
        }

        public VirtualNetworkConfigResponse build() {
            return new VirtualNetworkConfigResponse(subnetId);
        }
    }
}