// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.compute.outputs;

import io.pulumi.azurenative.compute.outputs.RestorePointSourceVMDataDiskResponse;
import io.pulumi.azurenative.compute.outputs.RestorePointSourceVMOSDiskResponse;
import io.pulumi.core.internal.annotations.OutputCustomType;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class RestorePointSourceVMStorageProfileResponse {
    private final @Nullable List<RestorePointSourceVMDataDiskResponse> dataDisks;
    private final @Nullable RestorePointSourceVMOSDiskResponse osDisk;

    @OutputCustomType.Constructor({"dataDisks","osDisk"})
    private RestorePointSourceVMStorageProfileResponse(
        @Nullable List<RestorePointSourceVMDataDiskResponse> dataDisks,
        @Nullable RestorePointSourceVMOSDiskResponse osDisk) {
        this.dataDisks = dataDisks;
        this.osDisk = osDisk;
    }

    public List<RestorePointSourceVMDataDiskResponse> getDataDisks() {
        return this.dataDisks == null ? List.of() : this.dataDisks;
    }
    public Optional<RestorePointSourceVMOSDiskResponse> getOsDisk() {
        return Optional.ofNullable(this.osDisk);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(RestorePointSourceVMStorageProfileResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable List<RestorePointSourceVMDataDiskResponse> dataDisks;
        private @Nullable RestorePointSourceVMOSDiskResponse osDisk;

        public Builder() {
    	      // Empty
        }

        public Builder(RestorePointSourceVMStorageProfileResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.dataDisks = defaults.dataDisks;
    	      this.osDisk = defaults.osDisk;
        }

        public Builder setDataDisks(@Nullable List<RestorePointSourceVMDataDiskResponse> dataDisks) {
            this.dataDisks = dataDisks;
            return this;
        }

        public Builder setOsDisk(@Nullable RestorePointSourceVMOSDiskResponse osDisk) {
            this.osDisk = osDisk;
            return this;
        }

        public RestorePointSourceVMStorageProfileResponse build() {
            return new RestorePointSourceVMStorageProfileResponse(dataDisks, osDisk);
        }
    }
}