// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.iotsecurity.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import java.lang.String;
import java.util.Objects;

@OutputCustomType
public final class DefenderSettingsPropertiesResponseMdeIntegration {
    /**
     * Integration status
     * 
     */
    private final String status;

    @OutputCustomType.Constructor({"status"})
    private DefenderSettingsPropertiesResponseMdeIntegration(String status) {
        this.status = Objects.requireNonNull(status);
    }

    /**
     * Integration status
     * 
    */
    public String getStatus() {
        return this.status;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(DefenderSettingsPropertiesResponseMdeIntegration defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String status;

        public Builder() {
    	      // Empty
        }

        public Builder(DefenderSettingsPropertiesResponseMdeIntegration defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.status = defaults.status;
        }

        public Builder setStatus(String status) {
            this.status = Objects.requireNonNull(status);
            return this;
        }
        public DefenderSettingsPropertiesResponseMdeIntegration build() {
            return new DefenderSettingsPropertiesResponseMdeIntegration(status);
        }
    }
}
