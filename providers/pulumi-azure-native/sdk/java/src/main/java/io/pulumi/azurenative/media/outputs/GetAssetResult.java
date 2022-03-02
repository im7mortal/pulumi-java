// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.media.outputs;

import io.pulumi.azurenative.media.outputs.SystemDataResponse;
import io.pulumi.core.annotations.OutputCustomType;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class GetAssetResult {
    /**
     * The alternate ID of the Asset.
     * 
     */
    private final @Nullable String alternateId;
    /**
     * The Asset ID.
     * 
     */
    private final String assetId;
    /**
     * The name of the asset blob container.
     * 
     */
    private final @Nullable String container;
    /**
     * The creation date of the Asset.
     * 
     */
    private final String created;
    /**
     * The Asset description.
     * 
     */
    private final @Nullable String description;
    /**
     * Fully qualified resource ID for the resource. Ex - /subscriptions/{subscriptionId}/resourceGroups/{resourceGroupName}/providers/{resourceProviderNamespace}/{resourceType}/{resourceName}
     * 
     */
    private final String id;
    /**
     * The last modified date of the Asset.
     * 
     */
    private final String lastModified;
    /**
     * The name of the resource
     * 
     */
    private final String name;
    /**
     * The name of the storage account.
     * 
     */
    private final @Nullable String storageAccountName;
    /**
     * The Asset encryption format. One of None or MediaStorageEncryption.
     * 
     */
    private final String storageEncryptionFormat;
    /**
     * The system metadata relating to this resource.
     * 
     */
    private final SystemDataResponse systemData;
    /**
     * The type of the resource. E.g. "Microsoft.Compute/virtualMachines" or "Microsoft.Storage/storageAccounts"
     * 
     */
    private final String type;

    @OutputCustomType.Constructor({"alternateId","assetId","container","created","description","id","lastModified","name","storageAccountName","storageEncryptionFormat","systemData","type"})
    private GetAssetResult(
        @Nullable String alternateId,
        String assetId,
        @Nullable String container,
        String created,
        @Nullable String description,
        String id,
        String lastModified,
        String name,
        @Nullable String storageAccountName,
        String storageEncryptionFormat,
        SystemDataResponse systemData,
        String type) {
        this.alternateId = alternateId;
        this.assetId = Objects.requireNonNull(assetId);
        this.container = container;
        this.created = Objects.requireNonNull(created);
        this.description = description;
        this.id = Objects.requireNonNull(id);
        this.lastModified = Objects.requireNonNull(lastModified);
        this.name = Objects.requireNonNull(name);
        this.storageAccountName = storageAccountName;
        this.storageEncryptionFormat = Objects.requireNonNull(storageEncryptionFormat);
        this.systemData = Objects.requireNonNull(systemData);
        this.type = Objects.requireNonNull(type);
    }

    /**
     * The alternate ID of the Asset.
     * 
    */
    public Optional<String> getAlternateId() {
        return Optional.ofNullable(this.alternateId);
    }
    /**
     * The Asset ID.
     * 
    */
    public String getAssetId() {
        return this.assetId;
    }
    /**
     * The name of the asset blob container.
     * 
    */
    public Optional<String> getContainer() {
        return Optional.ofNullable(this.container);
    }
    /**
     * The creation date of the Asset.
     * 
    */
    public String getCreated() {
        return this.created;
    }
    /**
     * The Asset description.
     * 
    */
    public Optional<String> getDescription() {
        return Optional.ofNullable(this.description);
    }
    /**
     * Fully qualified resource ID for the resource. Ex - /subscriptions/{subscriptionId}/resourceGroups/{resourceGroupName}/providers/{resourceProviderNamespace}/{resourceType}/{resourceName}
     * 
    */
    public String getId() {
        return this.id;
    }
    /**
     * The last modified date of the Asset.
     * 
    */
    public String getLastModified() {
        return this.lastModified;
    }
    /**
     * The name of the resource
     * 
    */
    public String getName() {
        return this.name;
    }
    /**
     * The name of the storage account.
     * 
    */
    public Optional<String> getStorageAccountName() {
        return Optional.ofNullable(this.storageAccountName);
    }
    /**
     * The Asset encryption format. One of None or MediaStorageEncryption.
     * 
    */
    public String getStorageEncryptionFormat() {
        return this.storageEncryptionFormat;
    }
    /**
     * The system metadata relating to this resource.
     * 
    */
    public SystemDataResponse getSystemData() {
        return this.systemData;
    }
    /**
     * The type of the resource. E.g. "Microsoft.Compute/virtualMachines" or "Microsoft.Storage/storageAccounts"
     * 
    */
    public String getType() {
        return this.type;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetAssetResult defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String alternateId;
        private String assetId;
        private @Nullable String container;
        private String created;
        private @Nullable String description;
        private String id;
        private String lastModified;
        private String name;
        private @Nullable String storageAccountName;
        private String storageEncryptionFormat;
        private SystemDataResponse systemData;
        private String type;

        public Builder() {
    	      // Empty
        }

        public Builder(GetAssetResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.alternateId = defaults.alternateId;
    	      this.assetId = defaults.assetId;
    	      this.container = defaults.container;
    	      this.created = defaults.created;
    	      this.description = defaults.description;
    	      this.id = defaults.id;
    	      this.lastModified = defaults.lastModified;
    	      this.name = defaults.name;
    	      this.storageAccountName = defaults.storageAccountName;
    	      this.storageEncryptionFormat = defaults.storageEncryptionFormat;
    	      this.systemData = defaults.systemData;
    	      this.type = defaults.type;
        }

        public Builder setAlternateId(@Nullable String alternateId) {
            this.alternateId = alternateId;
            return this;
        }

        public Builder setAssetId(String assetId) {
            this.assetId = Objects.requireNonNull(assetId);
            return this;
        }

        public Builder setContainer(@Nullable String container) {
            this.container = container;
            return this;
        }

        public Builder setCreated(String created) {
            this.created = Objects.requireNonNull(created);
            return this;
        }

        public Builder setDescription(@Nullable String description) {
            this.description = description;
            return this;
        }

        public Builder setId(String id) {
            this.id = Objects.requireNonNull(id);
            return this;
        }

        public Builder setLastModified(String lastModified) {
            this.lastModified = Objects.requireNonNull(lastModified);
            return this;
        }

        public Builder setName(String name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }

        public Builder setStorageAccountName(@Nullable String storageAccountName) {
            this.storageAccountName = storageAccountName;
            return this;
        }

        public Builder setStorageEncryptionFormat(String storageEncryptionFormat) {
            this.storageEncryptionFormat = Objects.requireNonNull(storageEncryptionFormat);
            return this;
        }

        public Builder setSystemData(SystemDataResponse systemData) {
            this.systemData = Objects.requireNonNull(systemData);
            return this;
        }

        public Builder setType(String type) {
            this.type = Objects.requireNonNull(type);
            return this;
        }
        public GetAssetResult build() {
            return new GetAssetResult(alternateId, assetId, container, created, description, id, lastModified, name, storageAccountName, storageEncryptionFormat, systemData, type);
        }
    }
}
