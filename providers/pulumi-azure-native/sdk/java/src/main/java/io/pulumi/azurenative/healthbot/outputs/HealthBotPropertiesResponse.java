// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.healthbot.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import java.lang.String;
import java.util.Objects;

@OutputCustomType
public final class HealthBotPropertiesResponse {
    /**
     * The link.
     * 
     */
    private final String botManagementPortalLink;
    /**
     * The provisioning state of the Healthbot resource.
     * 
     */
    private final String provisioningState;

    @OutputCustomType.Constructor({"botManagementPortalLink","provisioningState"})
    private HealthBotPropertiesResponse(
        String botManagementPortalLink,
        String provisioningState) {
        this.botManagementPortalLink = Objects.requireNonNull(botManagementPortalLink);
        this.provisioningState = Objects.requireNonNull(provisioningState);
    }

    /**
     * The link.
     * 
    */
    public String getBotManagementPortalLink() {
        return this.botManagementPortalLink;
    }
    /**
     * The provisioning state of the Healthbot resource.
     * 
    */
    public String getProvisioningState() {
        return this.provisioningState;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(HealthBotPropertiesResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String botManagementPortalLink;
        private String provisioningState;

        public Builder() {
    	      // Empty
        }

        public Builder(HealthBotPropertiesResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.botManagementPortalLink = defaults.botManagementPortalLink;
    	      this.provisioningState = defaults.provisioningState;
        }

        public Builder setBotManagementPortalLink(String botManagementPortalLink) {
            this.botManagementPortalLink = Objects.requireNonNull(botManagementPortalLink);
            return this;
        }

        public Builder setProvisioningState(String provisioningState) {
            this.provisioningState = Objects.requireNonNull(provisioningState);
            return this;
        }
        public HealthBotPropertiesResponse build() {
            return new HealthBotPropertiesResponse(botManagementPortalLink, provisioningState);
        }
    }
}
