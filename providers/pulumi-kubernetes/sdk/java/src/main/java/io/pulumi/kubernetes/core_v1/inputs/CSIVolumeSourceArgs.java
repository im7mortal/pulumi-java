// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.kubernetes.core_v1.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import io.pulumi.core.internal.Codegen;
import io.pulumi.kubernetes.core_v1.inputs.LocalObjectReferenceArgs;
import java.lang.Boolean;
import java.lang.String;
import java.util.Map;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * Represents a source location of a volume to mount, managed by an external CSI driver
 * 
 */
public final class CSIVolumeSourceArgs extends io.pulumi.resources.ResourceArgs {

    public static final CSIVolumeSourceArgs Empty = new CSIVolumeSourceArgs();

    /**
     * Driver is the name of the CSI driver that handles this volume. Consult with your admin for the correct name as registered in the cluster.
     * 
     */
    @Import(name="driver", required=true)
      private final Output<String> driver;

    public Output<String> driver() {
        return this.driver;
    }

    /**
     * Filesystem type to mount. Ex. "ext4", "xfs", "ntfs". If not provided, the empty value is passed to the associated CSI driver which will determine the default filesystem to apply.
     * 
     */
    @Import(name="fsType")
      private final @Nullable Output<String> fsType;

    public Output<String> fsType() {
        return this.fsType == null ? Codegen.empty() : this.fsType;
    }

    /**
     * NodePublishSecretRef is a reference to the secret object containing sensitive information to pass to the CSI driver to complete the CSI NodePublishVolume and NodeUnpublishVolume calls. This field is optional, and  may be empty if no secret is required. If the secret object contains more than one secret, all secret references are passed.
     * 
     */
    @Import(name="nodePublishSecretRef")
      private final @Nullable Output<LocalObjectReferenceArgs> nodePublishSecretRef;

    public Output<LocalObjectReferenceArgs> nodePublishSecretRef() {
        return this.nodePublishSecretRef == null ? Codegen.empty() : this.nodePublishSecretRef;
    }

    /**
     * Specifies a read-only configuration for the volume. Defaults to false (read/write).
     * 
     */
    @Import(name="readOnly")
      private final @Nullable Output<Boolean> readOnly;

    public Output<Boolean> readOnly() {
        return this.readOnly == null ? Codegen.empty() : this.readOnly;
    }

    /**
     * VolumeAttributes stores driver-specific properties that are passed to the CSI driver. Consult your driver's documentation for supported values.
     * 
     */
    @Import(name="volumeAttributes")
      private final @Nullable Output<Map<String,String>> volumeAttributes;

    public Output<Map<String,String>> volumeAttributes() {
        return this.volumeAttributes == null ? Codegen.empty() : this.volumeAttributes;
    }

    public CSIVolumeSourceArgs(
        Output<String> driver,
        @Nullable Output<String> fsType,
        @Nullable Output<LocalObjectReferenceArgs> nodePublishSecretRef,
        @Nullable Output<Boolean> readOnly,
        @Nullable Output<Map<String,String>> volumeAttributes) {
        this.driver = Objects.requireNonNull(driver, "expected parameter 'driver' to be non-null");
        this.fsType = fsType;
        this.nodePublishSecretRef = nodePublishSecretRef;
        this.readOnly = readOnly;
        this.volumeAttributes = volumeAttributes;
    }

    private CSIVolumeSourceArgs() {
        this.driver = Codegen.empty();
        this.fsType = Codegen.empty();
        this.nodePublishSecretRef = Codegen.empty();
        this.readOnly = Codegen.empty();
        this.volumeAttributes = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(CSIVolumeSourceArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Output<String> driver;
        private @Nullable Output<String> fsType;
        private @Nullable Output<LocalObjectReferenceArgs> nodePublishSecretRef;
        private @Nullable Output<Boolean> readOnly;
        private @Nullable Output<Map<String,String>> volumeAttributes;

        public Builder() {
    	      // Empty
        }

        public Builder(CSIVolumeSourceArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.driver = defaults.driver;
    	      this.fsType = defaults.fsType;
    	      this.nodePublishSecretRef = defaults.nodePublishSecretRef;
    	      this.readOnly = defaults.readOnly;
    	      this.volumeAttributes = defaults.volumeAttributes;
        }

        public Builder driver(Output<String> driver) {
            this.driver = Objects.requireNonNull(driver);
            return this;
        }
        public Builder driver(String driver) {
            this.driver = Output.of(Objects.requireNonNull(driver));
            return this;
        }
        public Builder fsType(@Nullable Output<String> fsType) {
            this.fsType = fsType;
            return this;
        }
        public Builder fsType(@Nullable String fsType) {
            this.fsType = Codegen.ofNullable(fsType);
            return this;
        }
        public Builder nodePublishSecretRef(@Nullable Output<LocalObjectReferenceArgs> nodePublishSecretRef) {
            this.nodePublishSecretRef = nodePublishSecretRef;
            return this;
        }
        public Builder nodePublishSecretRef(@Nullable LocalObjectReferenceArgs nodePublishSecretRef) {
            this.nodePublishSecretRef = Codegen.ofNullable(nodePublishSecretRef);
            return this;
        }
        public Builder readOnly(@Nullable Output<Boolean> readOnly) {
            this.readOnly = readOnly;
            return this;
        }
        public Builder readOnly(@Nullable Boolean readOnly) {
            this.readOnly = Codegen.ofNullable(readOnly);
            return this;
        }
        public Builder volumeAttributes(@Nullable Output<Map<String,String>> volumeAttributes) {
            this.volumeAttributes = volumeAttributes;
            return this;
        }
        public Builder volumeAttributes(@Nullable Map<String,String> volumeAttributes) {
            this.volumeAttributes = Codegen.ofNullable(volumeAttributes);
            return this;
        }        public CSIVolumeSourceArgs build() {
            return new CSIVolumeSourceArgs(driver, fsType, nodePublishSecretRef, readOnly, volumeAttributes);
        }
    }
}
