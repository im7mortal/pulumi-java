// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.kubernetes.apps_v1.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class StatefulSetPersistentVolumeClaimRetentionPolicy {
    /**
     * WhenDeleted specifies what happens to PVCs created from StatefulSet VolumeClaimTemplates when the StatefulSet is deleted. The default policy of `Retain` causes PVCs to not be affected by StatefulSet deletion. The `Delete` policy causes those PVCs to be deleted.
     * 
     */
    private final @Nullable String whenDeleted;
    /**
     * WhenScaled specifies what happens to PVCs created from StatefulSet VolumeClaimTemplates when the StatefulSet is scaled down. The default policy of `Retain` causes PVCs to not be affected by a scaledown. The `Delete` policy causes the associated PVCs for any excess pods above the replica count to be deleted.
     * 
     */
    private final @Nullable String whenScaled;

    @OutputCustomType.Constructor({"whenDeleted","whenScaled"})
    private StatefulSetPersistentVolumeClaimRetentionPolicy(
        @Nullable String whenDeleted,
        @Nullable String whenScaled) {
        this.whenDeleted = whenDeleted;
        this.whenScaled = whenScaled;
    }

    /**
     * WhenDeleted specifies what happens to PVCs created from StatefulSet VolumeClaimTemplates when the StatefulSet is deleted. The default policy of `Retain` causes PVCs to not be affected by StatefulSet deletion. The `Delete` policy causes those PVCs to be deleted.
     * 
     */
    public Optional<String> getWhenDeleted() {
        return Optional.ofNullable(this.whenDeleted);
    }
    /**
     * WhenScaled specifies what happens to PVCs created from StatefulSet VolumeClaimTemplates when the StatefulSet is scaled down. The default policy of `Retain` causes PVCs to not be affected by a scaledown. The `Delete` policy causes the associated PVCs for any excess pods above the replica count to be deleted.
     * 
     */
    public Optional<String> getWhenScaled() {
        return Optional.ofNullable(this.whenScaled);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(StatefulSetPersistentVolumeClaimRetentionPolicy defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String whenDeleted;
        private @Nullable String whenScaled;

        public Builder() {
    	      // Empty
        }

        public Builder(StatefulSetPersistentVolumeClaimRetentionPolicy defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.whenDeleted = defaults.whenDeleted;
    	      this.whenScaled = defaults.whenScaled;
        }

        public Builder setWhenDeleted(@Nullable String whenDeleted) {
            this.whenDeleted = whenDeleted;
            return this;
        }

        public Builder setWhenScaled(@Nullable String whenScaled) {
            this.whenScaled = whenScaled;
            return this;
        }

        public StatefulSetPersistentVolumeClaimRetentionPolicy build() {
            return new StatefulSetPersistentVolumeClaimRetentionPolicy(whenDeleted, whenScaled);
        }
    }
}
