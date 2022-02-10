// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.automanage.inputs;

import io.pulumi.core.internal.annotations.InputImport;
import java.lang.String;
import java.util.Objects;


public final class ConfigurationProfileAssignmentComplianceResponse extends io.pulumi.resources.InvokeArgs {

    public static final ConfigurationProfileAssignmentComplianceResponse Empty = new ConfigurationProfileAssignmentComplianceResponse();

    @InputImport(name="updateStatus", required=true)
    private final String updateStatus;

    public String getUpdateStatus() {
        return this.updateStatus;
    }

    public ConfigurationProfileAssignmentComplianceResponse(String updateStatus) {
        this.updateStatus = Objects.requireNonNull(updateStatus, "expected parameter 'updateStatus' to be non-null");
    }

    private ConfigurationProfileAssignmentComplianceResponse() {
        this.updateStatus = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ConfigurationProfileAssignmentComplianceResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String updateStatus;

        public Builder() {
    	      // Empty
        }

        public Builder(ConfigurationProfileAssignmentComplianceResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.updateStatus = defaults.updateStatus;
        }

        public Builder setUpdateStatus(String updateStatus) {
            this.updateStatus = Objects.requireNonNull(updateStatus);
            return this;
        }

        public ConfigurationProfileAssignmentComplianceResponse build() {
            return new ConfigurationProfileAssignmentComplianceResponse(updateStatus);
        }
    }
}