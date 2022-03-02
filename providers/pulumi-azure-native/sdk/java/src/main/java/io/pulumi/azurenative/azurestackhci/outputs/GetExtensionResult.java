// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.azurestackhci.outputs;

import io.pulumi.azurenative.azurestackhci.outputs.PerNodeExtensionStateResponse;
import io.pulumi.core.annotations.OutputCustomType;
import java.lang.Boolean;
import java.lang.Object;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class GetExtensionResult {
    /**
     * Aggregate state of Arc Extensions across the nodes in this HCI cluster.
     * 
     */
    private final String aggregateState;
    /**
     * Indicates whether the extension should use a newer minor version if one is available at deployment time. Once deployed, however, the extension will not upgrade minor versions unless redeployed, even with this property set to true.
     * 
     */
    private final @Nullable Boolean autoUpgradeMinorVersion;
    /**
     * The timestamp of resource creation (UTC).
     * 
     */
    private final @Nullable String createdAt;
    /**
     * The identity that created the resource.
     * 
     */
    private final @Nullable String createdBy;
    /**
     * The type of identity that created the resource.
     * 
     */
    private final @Nullable String createdByType;
    /**
     * How the extension handler should be forced to update even if the extension configuration has not changed.
     * 
     */
    private final @Nullable String forceUpdateTag;
    /**
     * Fully qualified resource ID for the resource. Ex - /subscriptions/{subscriptionId}/resourceGroups/{resourceGroupName}/providers/{resourceProviderNamespace}/{resourceType}/{resourceName}
     * 
     */
    private final String id;
    /**
     * The timestamp of resource last modification (UTC)
     * 
     */
    private final @Nullable String lastModifiedAt;
    /**
     * The identity that last modified the resource.
     * 
     */
    private final @Nullable String lastModifiedBy;
    /**
     * The type of identity that last modified the resource.
     * 
     */
    private final @Nullable String lastModifiedByType;
    /**
     * The name of the resource
     * 
     */
    private final String name;
    /**
     * State of Arc Extension in each of the nodes.
     * 
     */
    private final List<PerNodeExtensionStateResponse> perNodeExtensionDetails;
    /**
     * Protected settings (may contain secrets).
     * 
     */
    private final @Nullable Object protectedSettings;
    /**
     * Provisioning state of the Extension proxy resource.
     * 
     */
    private final String provisioningState;
    /**
     * The name of the extension handler publisher.
     * 
     */
    private final @Nullable String publisher;
    /**
     * Json formatted public settings for the extension.
     * 
     */
    private final @Nullable Object settings;
    /**
     * The type of the resource. E.g. "Microsoft.Compute/virtualMachines" or "Microsoft.Storage/storageAccounts"
     * 
     */
    private final String type;
    /**
     * Specifies the version of the script handler.
     * 
     */
    private final @Nullable String typeHandlerVersion;

    @OutputCustomType.Constructor({"aggregateState","autoUpgradeMinorVersion","createdAt","createdBy","createdByType","forceUpdateTag","id","lastModifiedAt","lastModifiedBy","lastModifiedByType","name","perNodeExtensionDetails","protectedSettings","provisioningState","publisher","settings","type","typeHandlerVersion"})
    private GetExtensionResult(
        String aggregateState,
        @Nullable Boolean autoUpgradeMinorVersion,
        @Nullable String createdAt,
        @Nullable String createdBy,
        @Nullable String createdByType,
        @Nullable String forceUpdateTag,
        String id,
        @Nullable String lastModifiedAt,
        @Nullable String lastModifiedBy,
        @Nullable String lastModifiedByType,
        String name,
        List<PerNodeExtensionStateResponse> perNodeExtensionDetails,
        @Nullable Object protectedSettings,
        String provisioningState,
        @Nullable String publisher,
        @Nullable Object settings,
        String type,
        @Nullable String typeHandlerVersion) {
        this.aggregateState = Objects.requireNonNull(aggregateState);
        this.autoUpgradeMinorVersion = autoUpgradeMinorVersion;
        this.createdAt = createdAt;
        this.createdBy = createdBy;
        this.createdByType = createdByType;
        this.forceUpdateTag = forceUpdateTag;
        this.id = Objects.requireNonNull(id);
        this.lastModifiedAt = lastModifiedAt;
        this.lastModifiedBy = lastModifiedBy;
        this.lastModifiedByType = lastModifiedByType;
        this.name = Objects.requireNonNull(name);
        this.perNodeExtensionDetails = Objects.requireNonNull(perNodeExtensionDetails);
        this.protectedSettings = protectedSettings;
        this.provisioningState = Objects.requireNonNull(provisioningState);
        this.publisher = publisher;
        this.settings = settings;
        this.type = Objects.requireNonNull(type);
        this.typeHandlerVersion = typeHandlerVersion;
    }

    /**
     * Aggregate state of Arc Extensions across the nodes in this HCI cluster.
     * 
    */
    public String getAggregateState() {
        return this.aggregateState;
    }
    /**
     * Indicates whether the extension should use a newer minor version if one is available at deployment time. Once deployed, however, the extension will not upgrade minor versions unless redeployed, even with this property set to true.
     * 
    */
    public Optional<Boolean> getAutoUpgradeMinorVersion() {
        return Optional.ofNullable(this.autoUpgradeMinorVersion);
    }
    /**
     * The timestamp of resource creation (UTC).
     * 
    */
    public Optional<String> getCreatedAt() {
        return Optional.ofNullable(this.createdAt);
    }
    /**
     * The identity that created the resource.
     * 
    */
    public Optional<String> getCreatedBy() {
        return Optional.ofNullable(this.createdBy);
    }
    /**
     * The type of identity that created the resource.
     * 
    */
    public Optional<String> getCreatedByType() {
        return Optional.ofNullable(this.createdByType);
    }
    /**
     * How the extension handler should be forced to update even if the extension configuration has not changed.
     * 
    */
    public Optional<String> getForceUpdateTag() {
        return Optional.ofNullable(this.forceUpdateTag);
    }
    /**
     * Fully qualified resource ID for the resource. Ex - /subscriptions/{subscriptionId}/resourceGroups/{resourceGroupName}/providers/{resourceProviderNamespace}/{resourceType}/{resourceName}
     * 
    */
    public String getId() {
        return this.id;
    }
    /**
     * The timestamp of resource last modification (UTC)
     * 
    */
    public Optional<String> getLastModifiedAt() {
        return Optional.ofNullable(this.lastModifiedAt);
    }
    /**
     * The identity that last modified the resource.
     * 
    */
    public Optional<String> getLastModifiedBy() {
        return Optional.ofNullable(this.lastModifiedBy);
    }
    /**
     * The type of identity that last modified the resource.
     * 
    */
    public Optional<String> getLastModifiedByType() {
        return Optional.ofNullable(this.lastModifiedByType);
    }
    /**
     * The name of the resource
     * 
    */
    public String getName() {
        return this.name;
    }
    /**
     * State of Arc Extension in each of the nodes.
     * 
    */
    public List<PerNodeExtensionStateResponse> getPerNodeExtensionDetails() {
        return this.perNodeExtensionDetails;
    }
    /**
     * Protected settings (may contain secrets).
     * 
    */
    public Optional<Object> getProtectedSettings() {
        return Optional.ofNullable(this.protectedSettings);
    }
    /**
     * Provisioning state of the Extension proxy resource.
     * 
    */
    public String getProvisioningState() {
        return this.provisioningState;
    }
    /**
     * The name of the extension handler publisher.
     * 
    */
    public Optional<String> getPublisher() {
        return Optional.ofNullable(this.publisher);
    }
    /**
     * Json formatted public settings for the extension.
     * 
    */
    public Optional<Object> getSettings() {
        return Optional.ofNullable(this.settings);
    }
    /**
     * The type of the resource. E.g. "Microsoft.Compute/virtualMachines" or "Microsoft.Storage/storageAccounts"
     * 
    */
    public String getType() {
        return this.type;
    }
    /**
     * Specifies the version of the script handler.
     * 
    */
    public Optional<String> getTypeHandlerVersion() {
        return Optional.ofNullable(this.typeHandlerVersion);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetExtensionResult defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String aggregateState;
        private @Nullable Boolean autoUpgradeMinorVersion;
        private @Nullable String createdAt;
        private @Nullable String createdBy;
        private @Nullable String createdByType;
        private @Nullable String forceUpdateTag;
        private String id;
        private @Nullable String lastModifiedAt;
        private @Nullable String lastModifiedBy;
        private @Nullable String lastModifiedByType;
        private String name;
        private List<PerNodeExtensionStateResponse> perNodeExtensionDetails;
        private @Nullable Object protectedSettings;
        private String provisioningState;
        private @Nullable String publisher;
        private @Nullable Object settings;
        private String type;
        private @Nullable String typeHandlerVersion;

        public Builder() {
    	      // Empty
        }

        public Builder(GetExtensionResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.aggregateState = defaults.aggregateState;
    	      this.autoUpgradeMinorVersion = defaults.autoUpgradeMinorVersion;
    	      this.createdAt = defaults.createdAt;
    	      this.createdBy = defaults.createdBy;
    	      this.createdByType = defaults.createdByType;
    	      this.forceUpdateTag = defaults.forceUpdateTag;
    	      this.id = defaults.id;
    	      this.lastModifiedAt = defaults.lastModifiedAt;
    	      this.lastModifiedBy = defaults.lastModifiedBy;
    	      this.lastModifiedByType = defaults.lastModifiedByType;
    	      this.name = defaults.name;
    	      this.perNodeExtensionDetails = defaults.perNodeExtensionDetails;
    	      this.protectedSettings = defaults.protectedSettings;
    	      this.provisioningState = defaults.provisioningState;
    	      this.publisher = defaults.publisher;
    	      this.settings = defaults.settings;
    	      this.type = defaults.type;
    	      this.typeHandlerVersion = defaults.typeHandlerVersion;
        }

        public Builder setAggregateState(String aggregateState) {
            this.aggregateState = Objects.requireNonNull(aggregateState);
            return this;
        }

        public Builder setAutoUpgradeMinorVersion(@Nullable Boolean autoUpgradeMinorVersion) {
            this.autoUpgradeMinorVersion = autoUpgradeMinorVersion;
            return this;
        }

        public Builder setCreatedAt(@Nullable String createdAt) {
            this.createdAt = createdAt;
            return this;
        }

        public Builder setCreatedBy(@Nullable String createdBy) {
            this.createdBy = createdBy;
            return this;
        }

        public Builder setCreatedByType(@Nullable String createdByType) {
            this.createdByType = createdByType;
            return this;
        }

        public Builder setForceUpdateTag(@Nullable String forceUpdateTag) {
            this.forceUpdateTag = forceUpdateTag;
            return this;
        }

        public Builder setId(String id) {
            this.id = Objects.requireNonNull(id);
            return this;
        }

        public Builder setLastModifiedAt(@Nullable String lastModifiedAt) {
            this.lastModifiedAt = lastModifiedAt;
            return this;
        }

        public Builder setLastModifiedBy(@Nullable String lastModifiedBy) {
            this.lastModifiedBy = lastModifiedBy;
            return this;
        }

        public Builder setLastModifiedByType(@Nullable String lastModifiedByType) {
            this.lastModifiedByType = lastModifiedByType;
            return this;
        }

        public Builder setName(String name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }

        public Builder setPerNodeExtensionDetails(List<PerNodeExtensionStateResponse> perNodeExtensionDetails) {
            this.perNodeExtensionDetails = Objects.requireNonNull(perNodeExtensionDetails);
            return this;
        }

        public Builder setProtectedSettings(@Nullable Object protectedSettings) {
            this.protectedSettings = protectedSettings;
            return this;
        }

        public Builder setProvisioningState(String provisioningState) {
            this.provisioningState = Objects.requireNonNull(provisioningState);
            return this;
        }

        public Builder setPublisher(@Nullable String publisher) {
            this.publisher = publisher;
            return this;
        }

        public Builder setSettings(@Nullable Object settings) {
            this.settings = settings;
            return this;
        }

        public Builder setType(String type) {
            this.type = Objects.requireNonNull(type);
            return this;
        }

        public Builder setTypeHandlerVersion(@Nullable String typeHandlerVersion) {
            this.typeHandlerVersion = typeHandlerVersion;
            return this;
        }
        public GetExtensionResult build() {
            return new GetExtensionResult(aggregateState, autoUpgradeMinorVersion, createdAt, createdBy, createdByType, forceUpdateTag, id, lastModifiedAt, lastModifiedBy, lastModifiedByType, name, perNodeExtensionDetails, protectedSettings, provisioningState, publisher, settings, type, typeHandlerVersion);
        }
    }
}
