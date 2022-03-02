// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.compute.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class InstanceGroupManagerStatefulDisk {
    /**
     * , A value that prescribes what should happen to the stateful disk when the VM instance is deleted. The available options are `NEVER` and `ON_PERMANENT_INSTANCE_DELETION`. `NEVER` - detach the disk when the VM is deleted, but do not delete the disk. `ON_PERMANENT_INSTANCE_DELETION` will delete the stateful disk when the VM is permanently deleted from the instance group. The default is `NEVER`.
     * 
     */
    private final @Nullable String deleteRule;
    /**
     * , The device name of the disk to be attached.
     * 
     */
    private final String deviceName;

    @OutputCustomType.Constructor({"deleteRule","deviceName"})
    private InstanceGroupManagerStatefulDisk(
        @Nullable String deleteRule,
        String deviceName) {
        this.deleteRule = deleteRule;
        this.deviceName = Objects.requireNonNull(deviceName);
    }

    /**
     * , A value that prescribes what should happen to the stateful disk when the VM instance is deleted. The available options are `NEVER` and `ON_PERMANENT_INSTANCE_DELETION`. `NEVER` - detach the disk when the VM is deleted, but do not delete the disk. `ON_PERMANENT_INSTANCE_DELETION` will delete the stateful disk when the VM is permanently deleted from the instance group. The default is `NEVER`.
     * 
    */
    public Optional<String> getDeleteRule() {
        return Optional.ofNullable(this.deleteRule);
    }
    /**
     * , The device name of the disk to be attached.
     * 
    */
    public String getDeviceName() {
        return this.deviceName;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(InstanceGroupManagerStatefulDisk defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String deleteRule;
        private String deviceName;

        public Builder() {
    	      // Empty
        }

        public Builder(InstanceGroupManagerStatefulDisk defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.deleteRule = defaults.deleteRule;
    	      this.deviceName = defaults.deviceName;
        }

        public Builder setDeleteRule(@Nullable String deleteRule) {
            this.deleteRule = deleteRule;
            return this;
        }

        public Builder setDeviceName(String deviceName) {
            this.deviceName = Objects.requireNonNull(deviceName);
            return this;
        }
        public InstanceGroupManagerStatefulDisk build() {
            return new InstanceGroupManagerStatefulDisk(deleteRule, deviceName);
        }
    }
}
