// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.machinelearningcompute.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import java.lang.String;
import java.util.Objects;

@OutputCustomType
public final class ServicePrincipalPropertiesResponse {
    /**
     * The service principal client ID
     * 
     */
    private final String clientId;
    /**
     * The service principal secret. This is not returned in response of GET/PUT on the resource. To see this please call listKeys.
     * 
     */
    private final String secret;

    @OutputCustomType.Constructor({"clientId","secret"})
    private ServicePrincipalPropertiesResponse(
        String clientId,
        String secret) {
        this.clientId = Objects.requireNonNull(clientId);
        this.secret = Objects.requireNonNull(secret);
    }

    /**
     * The service principal client ID
     * 
    */
    public String getClientId() {
        return this.clientId;
    }
    /**
     * The service principal secret. This is not returned in response of GET/PUT on the resource. To see this please call listKeys.
     * 
    */
    public String getSecret() {
        return this.secret;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ServicePrincipalPropertiesResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String clientId;
        private String secret;

        public Builder() {
    	      // Empty
        }

        public Builder(ServicePrincipalPropertiesResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.clientId = defaults.clientId;
    	      this.secret = defaults.secret;
        }

        public Builder setClientId(String clientId) {
            this.clientId = Objects.requireNonNull(clientId);
            return this;
        }

        public Builder setSecret(String secret) {
            this.secret = Objects.requireNonNull(secret);
            return this;
        }
        public ServicePrincipalPropertiesResponse build() {
            return new ServicePrincipalPropertiesResponse(clientId, secret);
        }
    }
}
