// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.quantum.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class ProviderResponse {
    /**
     * The provider's marketplace application display name.
     * 
     */
    private final @Nullable String applicationName;
    /**
     * A Uri identifying the specific instance of this provider.
     * 
     */
    private final @Nullable String instanceUri;
    /**
     * Unique id of this provider.
     * 
     */
    private final @Nullable String providerId;
    /**
     * The sku associated with pricing information for this provider.
     * 
     */
    private final @Nullable String providerSku;
    /**
     * Provisioning status field
     * 
     */
    private final @Nullable String provisioningState;
    /**
     * Id to track resource usage for the provider.
     * 
     */
    private final @Nullable String resourceUsageId;

    @OutputCustomType.Constructor({"applicationName","instanceUri","providerId","providerSku","provisioningState","resourceUsageId"})
    private ProviderResponse(
        @Nullable String applicationName,
        @Nullable String instanceUri,
        @Nullable String providerId,
        @Nullable String providerSku,
        @Nullable String provisioningState,
        @Nullable String resourceUsageId) {
        this.applicationName = applicationName;
        this.instanceUri = instanceUri;
        this.providerId = providerId;
        this.providerSku = providerSku;
        this.provisioningState = provisioningState;
        this.resourceUsageId = resourceUsageId;
    }

    /**
     * The provider's marketplace application display name.
     * 
    */
    public Optional<String> getApplicationName() {
        return Optional.ofNullable(this.applicationName);
    }
    /**
     * A Uri identifying the specific instance of this provider.
     * 
    */
    public Optional<String> getInstanceUri() {
        return Optional.ofNullable(this.instanceUri);
    }
    /**
     * Unique id of this provider.
     * 
    */
    public Optional<String> getProviderId() {
        return Optional.ofNullable(this.providerId);
    }
    /**
     * The sku associated with pricing information for this provider.
     * 
    */
    public Optional<String> getProviderSku() {
        return Optional.ofNullable(this.providerSku);
    }
    /**
     * Provisioning status field
     * 
    */
    public Optional<String> getProvisioningState() {
        return Optional.ofNullable(this.provisioningState);
    }
    /**
     * Id to track resource usage for the provider.
     * 
    */
    public Optional<String> getResourceUsageId() {
        return Optional.ofNullable(this.resourceUsageId);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ProviderResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String applicationName;
        private @Nullable String instanceUri;
        private @Nullable String providerId;
        private @Nullable String providerSku;
        private @Nullable String provisioningState;
        private @Nullable String resourceUsageId;

        public Builder() {
    	      // Empty
        }

        public Builder(ProviderResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.applicationName = defaults.applicationName;
    	      this.instanceUri = defaults.instanceUri;
    	      this.providerId = defaults.providerId;
    	      this.providerSku = defaults.providerSku;
    	      this.provisioningState = defaults.provisioningState;
    	      this.resourceUsageId = defaults.resourceUsageId;
        }

        public Builder setApplicationName(@Nullable String applicationName) {
            this.applicationName = applicationName;
            return this;
        }

        public Builder setInstanceUri(@Nullable String instanceUri) {
            this.instanceUri = instanceUri;
            return this;
        }

        public Builder setProviderId(@Nullable String providerId) {
            this.providerId = providerId;
            return this;
        }

        public Builder setProviderSku(@Nullable String providerSku) {
            this.providerSku = providerSku;
            return this;
        }

        public Builder setProvisioningState(@Nullable String provisioningState) {
            this.provisioningState = provisioningState;
            return this;
        }

        public Builder setResourceUsageId(@Nullable String resourceUsageId) {
            this.resourceUsageId = resourceUsageId;
            return this;
        }
        public ProviderResponse build() {
            return new ProviderResponse(applicationName, instanceUri, providerId, providerSku, provisioningState, resourceUsageId);
        }
    }
}
