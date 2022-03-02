// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.kubernetes.core_v1.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import io.pulumi.kubernetes.core_v1.outputs.PersistentVolumeClaimSpec;
import io.pulumi.kubernetes.meta_v1.outputs.ObjectMeta;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class PersistentVolumeClaimTemplate {
    /**
     * May contain labels and annotations that will be copied into the PVC when creating it. No other fields are allowed and will be rejected during validation.
     * 
     */
    private final @Nullable ObjectMeta metadata;
    /**
     * The specification for the PersistentVolumeClaim. The entire content is copied unchanged into the PVC that gets created from this template. The same fields as in a PersistentVolumeClaim are also valid here.
     * 
     */
    private final PersistentVolumeClaimSpec spec;

    @OutputCustomType.Constructor({"metadata","spec"})
    private PersistentVolumeClaimTemplate(
        @Nullable ObjectMeta metadata,
        PersistentVolumeClaimSpec spec) {
        this.metadata = metadata;
        this.spec = Objects.requireNonNull(spec);
    }

    /**
     * May contain labels and annotations that will be copied into the PVC when creating it. No other fields are allowed and will be rejected during validation.
     * 
    */
    public Optional<ObjectMeta> getMetadata() {
        return Optional.ofNullable(this.metadata);
    }
    /**
     * The specification for the PersistentVolumeClaim. The entire content is copied unchanged into the PVC that gets created from this template. The same fields as in a PersistentVolumeClaim are also valid here.
     * 
    */
    public PersistentVolumeClaimSpec getSpec() {
        return this.spec;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(PersistentVolumeClaimTemplate defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable ObjectMeta metadata;
        private PersistentVolumeClaimSpec spec;

        public Builder() {
    	      // Empty
        }

        public Builder(PersistentVolumeClaimTemplate defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.metadata = defaults.metadata;
    	      this.spec = defaults.spec;
        }

        public Builder setMetadata(@Nullable ObjectMeta metadata) {
            this.metadata = metadata;
            return this;
        }

        public Builder setSpec(PersistentVolumeClaimSpec spec) {
            this.spec = Objects.requireNonNull(spec);
            return this;
        }
        public PersistentVolumeClaimTemplate build() {
            return new PersistentVolumeClaimTemplate(metadata, spec);
        }
    }
}
