// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.mixedreality.outputs;

import io.pulumi.azurenative.mixedreality.outputs.IdentityResponse;
import io.pulumi.azurenative.mixedreality.outputs.SkuResponse;
import io.pulumi.azurenative.mixedreality.outputs.SystemDataResponse;
import io.pulumi.core.annotations.OutputCustomType;
import java.lang.String;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class GetSpatialAnchorsAccountResult {
    /**
     * Correspond domain name of certain Spatial Anchors Account
     * 
     */
    private final String accountDomain;
    /**
     * unique id of certain account.
     * 
     */
    private final String accountId;
    /**
     * Fully qualified resource ID for the resource. Ex - /subscriptions/{subscriptionId}/resourceGroups/{resourceGroupName}/providers/{resourceProviderNamespace}/{resourceType}/{resourceName}
     * 
     */
    private final String id;
    /**
     * The identity associated with this account
     * 
     */
    private final @Nullable IdentityResponse identity;
    /**
     * The kind of account, if supported
     * 
     */
    private final @Nullable SkuResponse kind;
    /**
     * The geo-location where the resource lives
     * 
     */
    private final String location;
    /**
     * The name of the resource
     * 
     */
    private final String name;
    /**
     * The plan associated with this account
     * 
     */
    private final @Nullable IdentityResponse plan;
    /**
     * The sku associated with this account
     * 
     */
    private final @Nullable SkuResponse sku;
    /**
     * The name of the storage account associated with this accountId
     * 
     */
    private final @Nullable String storageAccountName;
    /**
     * System metadata for this account
     * 
     */
    private final SystemDataResponse systemData;
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

    @OutputCustomType.Constructor({"accountDomain","accountId","id","identity","kind","location","name","plan","sku","storageAccountName","systemData","tags","type"})
    private GetSpatialAnchorsAccountResult(
        String accountDomain,
        String accountId,
        String id,
        @Nullable IdentityResponse identity,
        @Nullable SkuResponse kind,
        String location,
        String name,
        @Nullable IdentityResponse plan,
        @Nullable SkuResponse sku,
        @Nullable String storageAccountName,
        SystemDataResponse systemData,
        @Nullable Map<String,String> tags,
        String type) {
        this.accountDomain = Objects.requireNonNull(accountDomain);
        this.accountId = Objects.requireNonNull(accountId);
        this.id = Objects.requireNonNull(id);
        this.identity = identity;
        this.kind = kind;
        this.location = Objects.requireNonNull(location);
        this.name = Objects.requireNonNull(name);
        this.plan = plan;
        this.sku = sku;
        this.storageAccountName = storageAccountName;
        this.systemData = Objects.requireNonNull(systemData);
        this.tags = tags;
        this.type = Objects.requireNonNull(type);
    }

    /**
     * Correspond domain name of certain Spatial Anchors Account
     * 
    */
    public String getAccountDomain() {
        return this.accountDomain;
    }
    /**
     * unique id of certain account.
     * 
    */
    public String getAccountId() {
        return this.accountId;
    }
    /**
     * Fully qualified resource ID for the resource. Ex - /subscriptions/{subscriptionId}/resourceGroups/{resourceGroupName}/providers/{resourceProviderNamespace}/{resourceType}/{resourceName}
     * 
    */
    public String getId() {
        return this.id;
    }
    /**
     * The identity associated with this account
     * 
    */
    public Optional<IdentityResponse> getIdentity() {
        return Optional.ofNullable(this.identity);
    }
    /**
     * The kind of account, if supported
     * 
    */
    public Optional<SkuResponse> getKind() {
        return Optional.ofNullable(this.kind);
    }
    /**
     * The geo-location where the resource lives
     * 
    */
    public String getLocation() {
        return this.location;
    }
    /**
     * The name of the resource
     * 
    */
    public String getName() {
        return this.name;
    }
    /**
     * The plan associated with this account
     * 
    */
    public Optional<IdentityResponse> getPlan() {
        return Optional.ofNullable(this.plan);
    }
    /**
     * The sku associated with this account
     * 
    */
    public Optional<SkuResponse> getSku() {
        return Optional.ofNullable(this.sku);
    }
    /**
     * The name of the storage account associated with this accountId
     * 
    */
    public Optional<String> getStorageAccountName() {
        return Optional.ofNullable(this.storageAccountName);
    }
    /**
     * System metadata for this account
     * 
    */
    public SystemDataResponse getSystemData() {
        return this.systemData;
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

    public static Builder builder(GetSpatialAnchorsAccountResult defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String accountDomain;
        private String accountId;
        private String id;
        private @Nullable IdentityResponse identity;
        private @Nullable SkuResponse kind;
        private String location;
        private String name;
        private @Nullable IdentityResponse plan;
        private @Nullable SkuResponse sku;
        private @Nullable String storageAccountName;
        private SystemDataResponse systemData;
        private @Nullable Map<String,String> tags;
        private String type;

        public Builder() {
    	      // Empty
        }

        public Builder(GetSpatialAnchorsAccountResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.accountDomain = defaults.accountDomain;
    	      this.accountId = defaults.accountId;
    	      this.id = defaults.id;
    	      this.identity = defaults.identity;
    	      this.kind = defaults.kind;
    	      this.location = defaults.location;
    	      this.name = defaults.name;
    	      this.plan = defaults.plan;
    	      this.sku = defaults.sku;
    	      this.storageAccountName = defaults.storageAccountName;
    	      this.systemData = defaults.systemData;
    	      this.tags = defaults.tags;
    	      this.type = defaults.type;
        }

        public Builder setAccountDomain(String accountDomain) {
            this.accountDomain = Objects.requireNonNull(accountDomain);
            return this;
        }

        public Builder setAccountId(String accountId) {
            this.accountId = Objects.requireNonNull(accountId);
            return this;
        }

        public Builder setId(String id) {
            this.id = Objects.requireNonNull(id);
            return this;
        }

        public Builder setIdentity(@Nullable IdentityResponse identity) {
            this.identity = identity;
            return this;
        }

        public Builder setKind(@Nullable SkuResponse kind) {
            this.kind = kind;
            return this;
        }

        public Builder setLocation(String location) {
            this.location = Objects.requireNonNull(location);
            return this;
        }

        public Builder setName(String name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }

        public Builder setPlan(@Nullable IdentityResponse plan) {
            this.plan = plan;
            return this;
        }

        public Builder setSku(@Nullable SkuResponse sku) {
            this.sku = sku;
            return this;
        }

        public Builder setStorageAccountName(@Nullable String storageAccountName) {
            this.storageAccountName = storageAccountName;
            return this;
        }

        public Builder setSystemData(SystemDataResponse systemData) {
            this.systemData = Objects.requireNonNull(systemData);
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
        public GetSpatialAnchorsAccountResult build() {
            return new GetSpatialAnchorsAccountResult(accountDomain, accountId, id, identity, kind, location, name, plan, sku, storageAccountName, systemData, tags, type);
        }
    }
}
