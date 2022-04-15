// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.kubernetes.core_v1.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import io.pulumi.core.internal.Codegen;
import io.pulumi.kubernetes.core_v1.inputs.ObjectReferenceArgs;
import java.lang.Boolean;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * Represents a StorageOS persistent volume resource.
 * 
 */
public final class StorageOSPersistentVolumeSourceArgs extends io.pulumi.resources.ResourceArgs {

    public static final StorageOSPersistentVolumeSourceArgs Empty = new StorageOSPersistentVolumeSourceArgs();

    /**
     * Filesystem type to mount. Must be a filesystem type supported by the host operating system. Ex. "ext4", "xfs", "ntfs". Implicitly inferred to be "ext4" if unspecified.
     * 
     */
    @Import(name="fsType")
      private final @Nullable Output<String> fsType;

    public Output<String> fsType() {
        return this.fsType == null ? Codegen.empty() : this.fsType;
    }

    /**
     * Defaults to false (read/write). ReadOnly here will force the ReadOnly setting in VolumeMounts.
     * 
     */
    @Import(name="readOnly")
      private final @Nullable Output<Boolean> readOnly;

    public Output<Boolean> readOnly() {
        return this.readOnly == null ? Codegen.empty() : this.readOnly;
    }

    /**
     * SecretRef specifies the secret to use for obtaining the StorageOS API credentials.  If not specified, default values will be attempted.
     * 
     */
    @Import(name="secretRef")
      private final @Nullable Output<ObjectReferenceArgs> secretRef;

    public Output<ObjectReferenceArgs> secretRef() {
        return this.secretRef == null ? Codegen.empty() : this.secretRef;
    }

    /**
     * VolumeName is the human-readable name of the StorageOS volume.  Volume names are only unique within a namespace.
     * 
     */
    @Import(name="volumeName")
      private final @Nullable Output<String> volumeName;

    public Output<String> volumeName() {
        return this.volumeName == null ? Codegen.empty() : this.volumeName;
    }

    /**
     * VolumeNamespace specifies the scope of the volume within StorageOS.  If no namespace is specified then the Pod's namespace will be used.  This allows the Kubernetes name scoping to be mirrored within StorageOS for tighter integration. Set VolumeName to any name to override the default behaviour. Set to "default" if you are not using namespaces within StorageOS. Namespaces that do not pre-exist within StorageOS will be created.
     * 
     */
    @Import(name="volumeNamespace")
      private final @Nullable Output<String> volumeNamespace;

    public Output<String> volumeNamespace() {
        return this.volumeNamespace == null ? Codegen.empty() : this.volumeNamespace;
    }

    public StorageOSPersistentVolumeSourceArgs(
        @Nullable Output<String> fsType,
        @Nullable Output<Boolean> readOnly,
        @Nullable Output<ObjectReferenceArgs> secretRef,
        @Nullable Output<String> volumeName,
        @Nullable Output<String> volumeNamespace) {
        this.fsType = fsType;
        this.readOnly = readOnly;
        this.secretRef = secretRef;
        this.volumeName = volumeName;
        this.volumeNamespace = volumeNamespace;
    }

    private StorageOSPersistentVolumeSourceArgs() {
        this.fsType = Codegen.empty();
        this.readOnly = Codegen.empty();
        this.secretRef = Codegen.empty();
        this.volumeName = Codegen.empty();
        this.volumeNamespace = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(StorageOSPersistentVolumeSourceArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<String> fsType;
        private @Nullable Output<Boolean> readOnly;
        private @Nullable Output<ObjectReferenceArgs> secretRef;
        private @Nullable Output<String> volumeName;
        private @Nullable Output<String> volumeNamespace;

        public Builder() {
    	      // Empty
        }

        public Builder(StorageOSPersistentVolumeSourceArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.fsType = defaults.fsType;
    	      this.readOnly = defaults.readOnly;
    	      this.secretRef = defaults.secretRef;
    	      this.volumeName = defaults.volumeName;
    	      this.volumeNamespace = defaults.volumeNamespace;
        }

        public Builder fsType(@Nullable Output<String> fsType) {
            this.fsType = fsType;
            return this;
        }
        public Builder fsType(@Nullable String fsType) {
            this.fsType = Codegen.ofNullable(fsType);
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
        public Builder secretRef(@Nullable Output<ObjectReferenceArgs> secretRef) {
            this.secretRef = secretRef;
            return this;
        }
        public Builder secretRef(@Nullable ObjectReferenceArgs secretRef) {
            this.secretRef = Codegen.ofNullable(secretRef);
            return this;
        }
        public Builder volumeName(@Nullable Output<String> volumeName) {
            this.volumeName = volumeName;
            return this;
        }
        public Builder volumeName(@Nullable String volumeName) {
            this.volumeName = Codegen.ofNullable(volumeName);
            return this;
        }
        public Builder volumeNamespace(@Nullable Output<String> volumeNamespace) {
            this.volumeNamespace = volumeNamespace;
            return this;
        }
        public Builder volumeNamespace(@Nullable String volumeNamespace) {
            this.volumeNamespace = Codegen.ofNullable(volumeNamespace);
            return this;
        }        public StorageOSPersistentVolumeSourceArgs build() {
            return new StorageOSPersistentVolumeSourceArgs(fsType, readOnly, secretRef, volumeName, volumeNamespace);
        }
    }
}
