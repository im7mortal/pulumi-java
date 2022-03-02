// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.compute.outputs;

import io.pulumi.azurenative.compute.outputs.AvailablePatchSummaryResponse;
import io.pulumi.azurenative.compute.outputs.InstanceViewStatusResponse;
import io.pulumi.azurenative.compute.outputs.LastPatchInstallationSummaryResponse;
import io.pulumi.core.annotations.OutputCustomType;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class VirtualMachinePatchStatusResponse {
    /**
     * The available patch summary of the latest assessment operation for the virtual machine.
     * 
     */
    private final @Nullable AvailablePatchSummaryResponse availablePatchSummary;
    /**
     * The enablement status of the specified patchMode
     * 
     */
    private final List<InstanceViewStatusResponse> configurationStatuses;
    /**
     * The installation summary of the latest installation operation for the virtual machine.
     * 
     */
    private final @Nullable LastPatchInstallationSummaryResponse lastPatchInstallationSummary;

    @OutputCustomType.Constructor({"availablePatchSummary","configurationStatuses","lastPatchInstallationSummary"})
    private VirtualMachinePatchStatusResponse(
        @Nullable AvailablePatchSummaryResponse availablePatchSummary,
        List<InstanceViewStatusResponse> configurationStatuses,
        @Nullable LastPatchInstallationSummaryResponse lastPatchInstallationSummary) {
        this.availablePatchSummary = availablePatchSummary;
        this.configurationStatuses = Objects.requireNonNull(configurationStatuses);
        this.lastPatchInstallationSummary = lastPatchInstallationSummary;
    }

    /**
     * The available patch summary of the latest assessment operation for the virtual machine.
     * 
    */
    public Optional<AvailablePatchSummaryResponse> getAvailablePatchSummary() {
        return Optional.ofNullable(this.availablePatchSummary);
    }
    /**
     * The enablement status of the specified patchMode
     * 
    */
    public List<InstanceViewStatusResponse> getConfigurationStatuses() {
        return this.configurationStatuses;
    }
    /**
     * The installation summary of the latest installation operation for the virtual machine.
     * 
    */
    public Optional<LastPatchInstallationSummaryResponse> getLastPatchInstallationSummary() {
        return Optional.ofNullable(this.lastPatchInstallationSummary);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(VirtualMachinePatchStatusResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable AvailablePatchSummaryResponse availablePatchSummary;
        private List<InstanceViewStatusResponse> configurationStatuses;
        private @Nullable LastPatchInstallationSummaryResponse lastPatchInstallationSummary;

        public Builder() {
    	      // Empty
        }

        public Builder(VirtualMachinePatchStatusResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.availablePatchSummary = defaults.availablePatchSummary;
    	      this.configurationStatuses = defaults.configurationStatuses;
    	      this.lastPatchInstallationSummary = defaults.lastPatchInstallationSummary;
        }

        public Builder setAvailablePatchSummary(@Nullable AvailablePatchSummaryResponse availablePatchSummary) {
            this.availablePatchSummary = availablePatchSummary;
            return this;
        }

        public Builder setConfigurationStatuses(List<InstanceViewStatusResponse> configurationStatuses) {
            this.configurationStatuses = Objects.requireNonNull(configurationStatuses);
            return this;
        }

        public Builder setLastPatchInstallationSummary(@Nullable LastPatchInstallationSummaryResponse lastPatchInstallationSummary) {
            this.lastPatchInstallationSummary = lastPatchInstallationSummary;
            return this;
        }
        public VirtualMachinePatchStatusResponse build() {
            return new VirtualMachinePatchStatusResponse(availablePatchSummary, configurationStatuses, lastPatchInstallationSummary);
        }
    }
}
