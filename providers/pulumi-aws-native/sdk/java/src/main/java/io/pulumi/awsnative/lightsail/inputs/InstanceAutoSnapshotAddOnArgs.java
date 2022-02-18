// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.lightsail.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.internal.annotations.InputImport;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * An object that represents additional parameters when enabling or modifying the automatic snapshot add-on
 * 
 */
public final class InstanceAutoSnapshotAddOnArgs extends io.pulumi.resources.ResourceArgs {

    public static final InstanceAutoSnapshotAddOnArgs Empty = new InstanceAutoSnapshotAddOnArgs();

    /**
     * The daily time when an automatic snapshot will be created.
     * 
     */
    @InputImport(name="snapshotTimeOfDay")
    private final @Nullable Input<String> snapshotTimeOfDay;

    public Input<String> getSnapshotTimeOfDay() {
        return this.snapshotTimeOfDay == null ? Input.empty() : this.snapshotTimeOfDay;
    }

    public InstanceAutoSnapshotAddOnArgs(@Nullable Input<String> snapshotTimeOfDay) {
        this.snapshotTimeOfDay = snapshotTimeOfDay;
    }

    private InstanceAutoSnapshotAddOnArgs() {
        this.snapshotTimeOfDay = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(InstanceAutoSnapshotAddOnArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<String> snapshotTimeOfDay;

        public Builder() {
    	      // Empty
        }

        public Builder(InstanceAutoSnapshotAddOnArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.snapshotTimeOfDay = defaults.snapshotTimeOfDay;
        }

        public Builder setSnapshotTimeOfDay(@Nullable Input<String> snapshotTimeOfDay) {
            this.snapshotTimeOfDay = snapshotTimeOfDay;
            return this;
        }

        public Builder setSnapshotTimeOfDay(@Nullable String snapshotTimeOfDay) {
            this.snapshotTimeOfDay = Input.ofNullable(snapshotTimeOfDay);
            return this;
        }

        public InstanceAutoSnapshotAddOnArgs build() {
            return new InstanceAutoSnapshotAddOnArgs(snapshotTimeOfDay);
        }
    }
}
