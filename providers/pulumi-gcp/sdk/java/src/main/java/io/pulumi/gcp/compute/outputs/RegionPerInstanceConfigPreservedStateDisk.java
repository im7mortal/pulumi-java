// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.compute.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class RegionPerInstanceConfigPreservedStateDisk {
    /**
     * A value that prescribes what should happen to the stateful disk when the VM instance is deleted.
     * The available options are `NEVER` and `ON_PERMANENT_INSTANCE_DELETION`.
     * `NEVER` - detach the disk when the VM is deleted, but do not delete the disk.
     * `ON_PERMANENT_INSTANCE_DELETION` will delete the stateful disk when the VM is permanently
     * deleted from the instance group.
     * Default value is `NEVER`.
     * Possible values are `NEVER` and `ON_PERMANENT_INSTANCE_DELETION`.
     * 
     */
    private final @Nullable String deleteRule;
    /**
     * A unique device name that is reflected into the /dev/ tree of a Linux operating system running within the instance.
     * 
     */
    private final String deviceName;
    /**
     * The mode of the disk.
     * Default value is `READ_WRITE`.
     * Possible values are `READ_ONLY` and `READ_WRITE`.
     * 
     */
    private final @Nullable String mode;
    /**
     * The URI of an existing persistent disk to attach under the specified device-name in the format
     * `projects/project-id/zones/zone/disks/disk-name`.
     * 
     */
    private final String source;

    @OutputCustomType.Constructor({"deleteRule","deviceName","mode","source"})
    private RegionPerInstanceConfigPreservedStateDisk(
        @Nullable String deleteRule,
        String deviceName,
        @Nullable String mode,
        String source) {
        this.deleteRule = deleteRule;
        this.deviceName = Objects.requireNonNull(deviceName);
        this.mode = mode;
        this.source = Objects.requireNonNull(source);
    }

    /**
     * A value that prescribes what should happen to the stateful disk when the VM instance is deleted.
     * The available options are `NEVER` and `ON_PERMANENT_INSTANCE_DELETION`.
     * `NEVER` - detach the disk when the VM is deleted, but do not delete the disk.
     * `ON_PERMANENT_INSTANCE_DELETION` will delete the stateful disk when the VM is permanently
     * deleted from the instance group.
     * Default value is `NEVER`.
     * Possible values are `NEVER` and `ON_PERMANENT_INSTANCE_DELETION`.
     * 
    */
    public Optional<String> getDeleteRule() {
        return Optional.ofNullable(this.deleteRule);
    }
    /**
     * A unique device name that is reflected into the /dev/ tree of a Linux operating system running within the instance.
     * 
    */
    public String getDeviceName() {
        return this.deviceName;
    }
    /**
     * The mode of the disk.
     * Default value is `READ_WRITE`.
     * Possible values are `READ_ONLY` and `READ_WRITE`.
     * 
    */
    public Optional<String> getMode() {
        return Optional.ofNullable(this.mode);
    }
    /**
     * The URI of an existing persistent disk to attach under the specified device-name in the format
     * `projects/project-id/zones/zone/disks/disk-name`.
     * 
    */
    public String getSource() {
        return this.source;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(RegionPerInstanceConfigPreservedStateDisk defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String deleteRule;
        private String deviceName;
        private @Nullable String mode;
        private String source;

        public Builder() {
    	      // Empty
        }

        public Builder(RegionPerInstanceConfigPreservedStateDisk defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.deleteRule = defaults.deleteRule;
    	      this.deviceName = defaults.deviceName;
    	      this.mode = defaults.mode;
    	      this.source = defaults.source;
        }

        public Builder setDeleteRule(@Nullable String deleteRule) {
            this.deleteRule = deleteRule;
            return this;
        }

        public Builder setDeviceName(String deviceName) {
            this.deviceName = Objects.requireNonNull(deviceName);
            return this;
        }

        public Builder setMode(@Nullable String mode) {
            this.mode = mode;
            return this;
        }

        public Builder setSource(String source) {
            this.source = Objects.requireNonNull(source);
            return this;
        }
        public RegionPerInstanceConfigPreservedStateDisk build() {
            return new RegionPerInstanceConfigPreservedStateDisk(deleteRule, deviceName, mode, source);
        }
    }
}
