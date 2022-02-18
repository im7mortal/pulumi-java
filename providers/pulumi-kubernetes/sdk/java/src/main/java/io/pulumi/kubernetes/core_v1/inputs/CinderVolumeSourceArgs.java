// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.kubernetes.core_v1.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import io.pulumi.kubernetes.core_v1.inputs.LocalObjectReferenceArgs;
import java.lang.Boolean;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * Represents a cinder volume resource in Openstack. A Cinder volume must exist before mounting to a container. The volume must also be in the same region as the kubelet. Cinder volumes support ownership management and SELinux relabeling.
 * 
 */
public final class CinderVolumeSourceArgs extends io.pulumi.resources.ResourceArgs {

    public static final CinderVolumeSourceArgs Empty = new CinderVolumeSourceArgs();

    /**
     * Filesystem type to mount. Must be a filesystem type supported by the host operating system. Examples: "ext4", "xfs", "ntfs". Implicitly inferred to be "ext4" if unspecified. More info: https://examples.k8s.io/mysql-cinder-pd/README.md
     * 
     */
    @InputImport(name="fsType")
    private final @Nullable Input<String> fsType;

    public Input<String> getFsType() {
        return this.fsType == null ? Input.empty() : this.fsType;
    }

    /**
     * Optional: Defaults to false (read/write). ReadOnly here will force the ReadOnly setting in VolumeMounts. More info: https://examples.k8s.io/mysql-cinder-pd/README.md
     * 
     */
    @InputImport(name="readOnly")
    private final @Nullable Input<Boolean> readOnly;

    public Input<Boolean> getReadOnly() {
        return this.readOnly == null ? Input.empty() : this.readOnly;
    }

    /**
     * Optional: points to a secret object containing parameters used to connect to OpenStack.
     * 
     */
    @InputImport(name="secretRef")
    private final @Nullable Input<LocalObjectReferenceArgs> secretRef;

    public Input<LocalObjectReferenceArgs> getSecretRef() {
        return this.secretRef == null ? Input.empty() : this.secretRef;
    }

    /**
     * volume id used to identify the volume in cinder. More info: https://examples.k8s.io/mysql-cinder-pd/README.md
     * 
     */
    @InputImport(name="volumeID", required=true)
    private final Input<String> volumeID;

    public Input<String> getVolumeID() {
        return this.volumeID;
    }

    public CinderVolumeSourceArgs(
        @Nullable Input<String> fsType,
        @Nullable Input<Boolean> readOnly,
        @Nullable Input<LocalObjectReferenceArgs> secretRef,
        Input<String> volumeID) {
        this.fsType = fsType;
        this.readOnly = readOnly;
        this.secretRef = secretRef;
        this.volumeID = Objects.requireNonNull(volumeID, "expected parameter 'volumeID' to be non-null");
    }

    private CinderVolumeSourceArgs() {
        this.fsType = Input.empty();
        this.readOnly = Input.empty();
        this.secretRef = Input.empty();
        this.volumeID = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(CinderVolumeSourceArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<String> fsType;
        private @Nullable Input<Boolean> readOnly;
        private @Nullable Input<LocalObjectReferenceArgs> secretRef;
        private Input<String> volumeID;

        public Builder() {
    	      // Empty
        }

        public Builder(CinderVolumeSourceArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.fsType = defaults.fsType;
    	      this.readOnly = defaults.readOnly;
    	      this.secretRef = defaults.secretRef;
    	      this.volumeID = defaults.volumeID;
        }

        public Builder setFsType(@Nullable Input<String> fsType) {
            this.fsType = fsType;
            return this;
        }

        public Builder setFsType(@Nullable String fsType) {
            this.fsType = Input.ofNullable(fsType);
            return this;
        }

        public Builder setReadOnly(@Nullable Input<Boolean> readOnly) {
            this.readOnly = readOnly;
            return this;
        }

        public Builder setReadOnly(@Nullable Boolean readOnly) {
            this.readOnly = Input.ofNullable(readOnly);
            return this;
        }

        public Builder setSecretRef(@Nullable Input<LocalObjectReferenceArgs> secretRef) {
            this.secretRef = secretRef;
            return this;
        }

        public Builder setSecretRef(@Nullable LocalObjectReferenceArgs secretRef) {
            this.secretRef = Input.ofNullable(secretRef);
            return this;
        }

        public Builder setVolumeID(Input<String> volumeID) {
            this.volumeID = Objects.requireNonNull(volumeID);
            return this;
        }

        public Builder setVolumeID(String volumeID) {
            this.volumeID = Input.of(Objects.requireNonNull(volumeID));
            return this;
        }

        public CinderVolumeSourceArgs build() {
            return new CinderVolumeSourceArgs(fsType, readOnly, secretRef, volumeID);
        }
    }
}
