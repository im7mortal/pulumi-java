// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.quicksight.inputs;

import io.pulumi.awsnative.quicksight.enums.DashboardBehavior;
import io.pulumi.core.Input;
import io.pulumi.core.internal.annotations.InputImport;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * <p>Export to .csv option.</p>
 * 
 */
public final class DashboardExportToCSVOptionArgs extends io.pulumi.resources.ResourceArgs {

    public static final DashboardExportToCSVOptionArgs Empty = new DashboardExportToCSVOptionArgs();

    @InputImport(name="availabilityStatus")
    private final @Nullable Input<DashboardBehavior> availabilityStatus;

    public Input<DashboardBehavior> getAvailabilityStatus() {
        return this.availabilityStatus == null ? Input.empty() : this.availabilityStatus;
    }

    public DashboardExportToCSVOptionArgs(@Nullable Input<DashboardBehavior> availabilityStatus) {
        this.availabilityStatus = availabilityStatus;
    }

    private DashboardExportToCSVOptionArgs() {
        this.availabilityStatus = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(DashboardExportToCSVOptionArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<DashboardBehavior> availabilityStatus;

        public Builder() {
    	      // Empty
        }

        public Builder(DashboardExportToCSVOptionArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.availabilityStatus = defaults.availabilityStatus;
        }

        public Builder setAvailabilityStatus(@Nullable Input<DashboardBehavior> availabilityStatus) {
            this.availabilityStatus = availabilityStatus;
            return this;
        }

        public Builder setAvailabilityStatus(@Nullable DashboardBehavior availabilityStatus) {
            this.availabilityStatus = Input.ofNullable(availabilityStatus);
            return this;
        }

        public DashboardExportToCSVOptionArgs build() {
            return new DashboardExportToCSVOptionArgs(availabilityStatus);
        }
    }
}
