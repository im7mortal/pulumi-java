// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.kubernetes.storage.k8s.io_v1beta1.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import io.pulumi.kubernetes.core_v1.outputs.PersistentVolumeSpec;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class VolumeAttachmentSource {
    /**
     * inlineVolumeSpec contains all the information necessary to attach a persistent volume defined by a pod's inline VolumeSource. This field is populated only for the CSIMigration feature. It contains translated fields from a pod's inline VolumeSource to a PersistentVolumeSpec. This field is alpha-level and is only honored by servers that enabled the CSIMigration feature.
     * 
     */
    private final @Nullable PersistentVolumeSpec inlineVolumeSpec;
    /**
     * Name of the persistent volume to attach.
     * 
     */
    private final @Nullable String persistentVolumeName;

    @OutputCustomType.Constructor({"inlineVolumeSpec","persistentVolumeName"})
    private VolumeAttachmentSource(
        @Nullable PersistentVolumeSpec inlineVolumeSpec,
        @Nullable String persistentVolumeName) {
        this.inlineVolumeSpec = inlineVolumeSpec;
        this.persistentVolumeName = persistentVolumeName;
    }

    /**
     * inlineVolumeSpec contains all the information necessary to attach a persistent volume defined by a pod's inline VolumeSource. This field is populated only for the CSIMigration feature. It contains translated fields from a pod's inline VolumeSource to a PersistentVolumeSpec. This field is alpha-level and is only honored by servers that enabled the CSIMigration feature.
     * 
    */
    public Optional<PersistentVolumeSpec> getInlineVolumeSpec() {
        return Optional.ofNullable(this.inlineVolumeSpec);
    }
    /**
     * Name of the persistent volume to attach.
     * 
    */
    public Optional<String> getPersistentVolumeName() {
        return Optional.ofNullable(this.persistentVolumeName);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(VolumeAttachmentSource defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable PersistentVolumeSpec inlineVolumeSpec;
        private @Nullable String persistentVolumeName;

        public Builder() {
    	      // Empty
        }

        public Builder(VolumeAttachmentSource defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.inlineVolumeSpec = defaults.inlineVolumeSpec;
    	      this.persistentVolumeName = defaults.persistentVolumeName;
        }

        public Builder setInlineVolumeSpec(@Nullable PersistentVolumeSpec inlineVolumeSpec) {
            this.inlineVolumeSpec = inlineVolumeSpec;
            return this;
        }

        public Builder setPersistentVolumeName(@Nullable String persistentVolumeName) {
            this.persistentVolumeName = persistentVolumeName;
            return this;
        }
        public VolumeAttachmentSource build() {
            return new VolumeAttachmentSource(inlineVolumeSpec, persistentVolumeName);
        }
    }
}
