// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.sqlvirtualmachine.inputs;

import io.pulumi.core.internal.annotations.InputImport;
import java.lang.String;
import java.util.Objects;


public final class GetAvailabilityGroupListenerArgs extends io.pulumi.resources.InvokeArgs {

    public static final GetAvailabilityGroupListenerArgs Empty = new GetAvailabilityGroupListenerArgs();

    @InputImport(name="availabilityGroupListenerName", required=true)
    private final String availabilityGroupListenerName;

    public String getAvailabilityGroupListenerName() {
        return this.availabilityGroupListenerName;
    }

    @InputImport(name="resourceGroupName", required=true)
    private final String resourceGroupName;

    public String getResourceGroupName() {
        return this.resourceGroupName;
    }

    @InputImport(name="sqlVirtualMachineGroupName", required=true)
    private final String sqlVirtualMachineGroupName;

    public String getSqlVirtualMachineGroupName() {
        return this.sqlVirtualMachineGroupName;
    }

    public GetAvailabilityGroupListenerArgs(
        String availabilityGroupListenerName,
        String resourceGroupName,
        String sqlVirtualMachineGroupName) {
        this.availabilityGroupListenerName = Objects.requireNonNull(availabilityGroupListenerName, "expected parameter 'availabilityGroupListenerName' to be non-null");
        this.resourceGroupName = Objects.requireNonNull(resourceGroupName, "expected parameter 'resourceGroupName' to be non-null");
        this.sqlVirtualMachineGroupName = Objects.requireNonNull(sqlVirtualMachineGroupName, "expected parameter 'sqlVirtualMachineGroupName' to be non-null");
    }

    private GetAvailabilityGroupListenerArgs() {
        this.availabilityGroupListenerName = null;
        this.resourceGroupName = null;
        this.sqlVirtualMachineGroupName = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetAvailabilityGroupListenerArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String availabilityGroupListenerName;
        private String resourceGroupName;
        private String sqlVirtualMachineGroupName;

        public Builder() {
    	      // Empty
        }

        public Builder(GetAvailabilityGroupListenerArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.availabilityGroupListenerName = defaults.availabilityGroupListenerName;
    	      this.resourceGroupName = defaults.resourceGroupName;
    	      this.sqlVirtualMachineGroupName = defaults.sqlVirtualMachineGroupName;
        }

        public Builder setAvailabilityGroupListenerName(String availabilityGroupListenerName) {
            this.availabilityGroupListenerName = Objects.requireNonNull(availabilityGroupListenerName);
            return this;
        }

        public Builder setResourceGroupName(String resourceGroupName) {
            this.resourceGroupName = Objects.requireNonNull(resourceGroupName);
            return this;
        }

        public Builder setSqlVirtualMachineGroupName(String sqlVirtualMachineGroupName) {
            this.sqlVirtualMachineGroupName = Objects.requireNonNull(sqlVirtualMachineGroupName);
            return this;
        }

        public GetAvailabilityGroupListenerArgs build() {
            return new GetAvailabilityGroupListenerArgs(availabilityGroupListenerName, resourceGroupName, sqlVirtualMachineGroupName);
        }
    }
}