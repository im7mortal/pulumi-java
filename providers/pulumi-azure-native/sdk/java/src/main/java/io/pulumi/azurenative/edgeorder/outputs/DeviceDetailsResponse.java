// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.edgeorder.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import java.lang.String;
import java.util.Objects;

@OutputCustomType
public final class DeviceDetailsResponse {
    /**
     * Management Resource Id
     * 
     */
    private final String managementResourceId;
    /**
     * Management Resource Tenant ID
     * 
     */
    private final String managementResourceTenantId;
    /**
     * device serial number
     * 
     */
    private final String serialNumber;

    @OutputCustomType.Constructor({"managementResourceId","managementResourceTenantId","serialNumber"})
    private DeviceDetailsResponse(
        String managementResourceId,
        String managementResourceTenantId,
        String serialNumber) {
        this.managementResourceId = Objects.requireNonNull(managementResourceId);
        this.managementResourceTenantId = Objects.requireNonNull(managementResourceTenantId);
        this.serialNumber = Objects.requireNonNull(serialNumber);
    }

    /**
     * Management Resource Id
     * 
    */
    public String getManagementResourceId() {
        return this.managementResourceId;
    }
    /**
     * Management Resource Tenant ID
     * 
    */
    public String getManagementResourceTenantId() {
        return this.managementResourceTenantId;
    }
    /**
     * device serial number
     * 
    */
    public String getSerialNumber() {
        return this.serialNumber;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(DeviceDetailsResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String managementResourceId;
        private String managementResourceTenantId;
        private String serialNumber;

        public Builder() {
    	      // Empty
        }

        public Builder(DeviceDetailsResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.managementResourceId = defaults.managementResourceId;
    	      this.managementResourceTenantId = defaults.managementResourceTenantId;
    	      this.serialNumber = defaults.serialNumber;
        }

        public Builder setManagementResourceId(String managementResourceId) {
            this.managementResourceId = Objects.requireNonNull(managementResourceId);
            return this;
        }

        public Builder setManagementResourceTenantId(String managementResourceTenantId) {
            this.managementResourceTenantId = Objects.requireNonNull(managementResourceTenantId);
            return this;
        }

        public Builder setSerialNumber(String serialNumber) {
            this.serialNumber = Objects.requireNonNull(serialNumber);
            return this;
        }
        public DeviceDetailsResponse build() {
            return new DeviceDetailsResponse(managementResourceId, managementResourceTenantId, serialNumber);
        }
    }
}
