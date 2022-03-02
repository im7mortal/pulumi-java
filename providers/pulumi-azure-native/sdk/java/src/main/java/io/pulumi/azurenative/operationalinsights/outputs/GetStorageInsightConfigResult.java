// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.operationalinsights.outputs;

import io.pulumi.azurenative.operationalinsights.outputs.StorageAccountResponse;
import io.pulumi.azurenative.operationalinsights.outputs.StorageInsightStatusResponse;
import io.pulumi.core.annotations.OutputCustomType;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class GetStorageInsightConfigResult {
    /**
     * The names of the blob containers that the workspace should read
     * 
     */
    private final @Nullable List<String> containers;
    /**
     * The ETag of the storage insight.
     * 
     */
    private final @Nullable String eTag;
    /**
     * Fully qualified resource ID for the resource. Ex - /subscriptions/{subscriptionId}/resourceGroups/{resourceGroupName}/providers/{resourceProviderNamespace}/{resourceType}/{resourceName}
     * 
     */
    private final String id;
    /**
     * The name of the resource
     * 
     */
    private final String name;
    /**
     * The status of the storage insight
     * 
     */
    private final StorageInsightStatusResponse status;
    /**
     * The storage account connection details
     * 
     */
    private final StorageAccountResponse storageAccount;
    /**
     * The names of the Azure tables that the workspace should read
     * 
     */
    private final @Nullable List<String> tables;
    /**
     * Resource tags.
     * 
     */
    private final @Nullable Map<String,String> tags;
    /**
     * The type of the resource. E.g. "Microsoft.Compute/virtualMachines" or "Microsoft.Storage/storageAccounts"
     * 
     */
    private final String type;

    @OutputCustomType.Constructor({"containers","eTag","id","name","status","storageAccount","tables","tags","type"})
    private GetStorageInsightConfigResult(
        @Nullable List<String> containers,
        @Nullable String eTag,
        String id,
        String name,
        StorageInsightStatusResponse status,
        StorageAccountResponse storageAccount,
        @Nullable List<String> tables,
        @Nullable Map<String,String> tags,
        String type) {
        this.containers = containers;
        this.eTag = eTag;
        this.id = Objects.requireNonNull(id);
        this.name = Objects.requireNonNull(name);
        this.status = Objects.requireNonNull(status);
        this.storageAccount = Objects.requireNonNull(storageAccount);
        this.tables = tables;
        this.tags = tags;
        this.type = Objects.requireNonNull(type);
    }

    /**
     * The names of the blob containers that the workspace should read
     * 
    */
    public List<String> getContainers() {
        return this.containers == null ? List.of() : this.containers;
    }
    /**
     * The ETag of the storage insight.
     * 
    */
    public Optional<String> getETag() {
        return Optional.ofNullable(this.eTag);
    }
    /**
     * Fully qualified resource ID for the resource. Ex - /subscriptions/{subscriptionId}/resourceGroups/{resourceGroupName}/providers/{resourceProviderNamespace}/{resourceType}/{resourceName}
     * 
    */
    public String getId() {
        return this.id;
    }
    /**
     * The name of the resource
     * 
    */
    public String getName() {
        return this.name;
    }
    /**
     * The status of the storage insight
     * 
    */
    public StorageInsightStatusResponse getStatus() {
        return this.status;
    }
    /**
     * The storage account connection details
     * 
    */
    public StorageAccountResponse getStorageAccount() {
        return this.storageAccount;
    }
    /**
     * The names of the Azure tables that the workspace should read
     * 
    */
    public List<String> getTables() {
        return this.tables == null ? List.of() : this.tables;
    }
    /**
     * Resource tags.
     * 
    */
    public Map<String,String> getTags() {
        return this.tags == null ? Map.of() : this.tags;
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

    public static Builder builder(GetStorageInsightConfigResult defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable List<String> containers;
        private @Nullable String eTag;
        private String id;
        private String name;
        private StorageInsightStatusResponse status;
        private StorageAccountResponse storageAccount;
        private @Nullable List<String> tables;
        private @Nullable Map<String,String> tags;
        private String type;

        public Builder() {
    	      // Empty
        }

        public Builder(GetStorageInsightConfigResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.containers = defaults.containers;
    	      this.eTag = defaults.eTag;
    	      this.id = defaults.id;
    	      this.name = defaults.name;
    	      this.status = defaults.status;
    	      this.storageAccount = defaults.storageAccount;
    	      this.tables = defaults.tables;
    	      this.tags = defaults.tags;
    	      this.type = defaults.type;
        }

        public Builder setContainers(@Nullable List<String> containers) {
            this.containers = containers;
            return this;
        }

        public Builder setETag(@Nullable String eTag) {
            this.eTag = eTag;
            return this;
        }

        public Builder setId(String id) {
            this.id = Objects.requireNonNull(id);
            return this;
        }

        public Builder setName(String name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }

        public Builder setStatus(StorageInsightStatusResponse status) {
            this.status = Objects.requireNonNull(status);
            return this;
        }

        public Builder setStorageAccount(StorageAccountResponse storageAccount) {
            this.storageAccount = Objects.requireNonNull(storageAccount);
            return this;
        }

        public Builder setTables(@Nullable List<String> tables) {
            this.tables = tables;
            return this;
        }

        public Builder setTags(@Nullable Map<String,String> tags) {
            this.tags = tags;
            return this;
        }

        public Builder setType(String type) {
            this.type = Objects.requireNonNull(type);
            return this;
        }
        public GetStorageInsightConfigResult build() {
            return new GetStorageInsightConfigResult(containers, eTag, id, name, status, storageAccount, tables, tags, type);
        }
    }
}
