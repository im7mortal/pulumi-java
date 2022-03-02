// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.synapse.outputs;

import io.pulumi.azurenative.synapse.outputs.SystemDataResponse;
import io.pulumi.azurenative.synapse.outputs.TableLevelSharingPropertiesResponse;
import io.pulumi.core.annotations.OutputCustomType;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class GetKustoPoolAttachedDatabaseConfigurationResult {
    /**
     * The list of databases from the clusterResourceId which are currently attached to the kusto pool.
     * 
     */
    private final List<String> attachedDatabaseNames;
    /**
     * The name of the database which you would like to attach, use * if you want to follow all current and future databases.
     * 
     */
    private final String databaseName;
    /**
     * The default principals modification kind
     * 
     */
    private final String defaultPrincipalsModificationKind;
    /**
     * Fully qualified resource ID for the resource. Ex - /subscriptions/{subscriptionId}/resourceGroups/{resourceGroupName}/providers/{resourceProviderNamespace}/{resourceType}/{resourceName}
     * 
     */
    private final String id;
    /**
     * The resource id of the kusto pool where the databases you would like to attach reside.
     * 
     */
    private final String kustoPoolResourceId;
    /**
     * Resource location.
     * 
     */
    private final @Nullable String location;
    /**
     * The name of the resource
     * 
     */
    private final String name;
    /**
     * The provisioned state of the resource.
     * 
     */
    private final String provisioningState;
    /**
     * Azure Resource Manager metadata containing createdBy and modifiedBy information.
     * 
     */
    private final SystemDataResponse systemData;
    /**
     * Table level sharing specifications
     * 
     */
    private final @Nullable TableLevelSharingPropertiesResponse tableLevelSharingProperties;
    /**
     * The type of the resource. E.g. "Microsoft.Compute/virtualMachines" or "Microsoft.Storage/storageAccounts"
     * 
     */
    private final String type;

    @OutputCustomType.Constructor({"attachedDatabaseNames","databaseName","defaultPrincipalsModificationKind","id","kustoPoolResourceId","location","name","provisioningState","systemData","tableLevelSharingProperties","type"})
    private GetKustoPoolAttachedDatabaseConfigurationResult(
        List<String> attachedDatabaseNames,
        String databaseName,
        String defaultPrincipalsModificationKind,
        String id,
        String kustoPoolResourceId,
        @Nullable String location,
        String name,
        String provisioningState,
        SystemDataResponse systemData,
        @Nullable TableLevelSharingPropertiesResponse tableLevelSharingProperties,
        String type) {
        this.attachedDatabaseNames = Objects.requireNonNull(attachedDatabaseNames);
        this.databaseName = Objects.requireNonNull(databaseName);
        this.defaultPrincipalsModificationKind = Objects.requireNonNull(defaultPrincipalsModificationKind);
        this.id = Objects.requireNonNull(id);
        this.kustoPoolResourceId = Objects.requireNonNull(kustoPoolResourceId);
        this.location = location;
        this.name = Objects.requireNonNull(name);
        this.provisioningState = Objects.requireNonNull(provisioningState);
        this.systemData = Objects.requireNonNull(systemData);
        this.tableLevelSharingProperties = tableLevelSharingProperties;
        this.type = Objects.requireNonNull(type);
    }

    /**
     * The list of databases from the clusterResourceId which are currently attached to the kusto pool.
     * 
    */
    public List<String> getAttachedDatabaseNames() {
        return this.attachedDatabaseNames;
    }
    /**
     * The name of the database which you would like to attach, use * if you want to follow all current and future databases.
     * 
    */
    public String getDatabaseName() {
        return this.databaseName;
    }
    /**
     * The default principals modification kind
     * 
    */
    public String getDefaultPrincipalsModificationKind() {
        return this.defaultPrincipalsModificationKind;
    }
    /**
     * Fully qualified resource ID for the resource. Ex - /subscriptions/{subscriptionId}/resourceGroups/{resourceGroupName}/providers/{resourceProviderNamespace}/{resourceType}/{resourceName}
     * 
    */
    public String getId() {
        return this.id;
    }
    /**
     * The resource id of the kusto pool where the databases you would like to attach reside.
     * 
    */
    public String getKustoPoolResourceId() {
        return this.kustoPoolResourceId;
    }
    /**
     * Resource location.
     * 
    */
    public Optional<String> getLocation() {
        return Optional.ofNullable(this.location);
    }
    /**
     * The name of the resource
     * 
    */
    public String getName() {
        return this.name;
    }
    /**
     * The provisioned state of the resource.
     * 
    */
    public String getProvisioningState() {
        return this.provisioningState;
    }
    /**
     * Azure Resource Manager metadata containing createdBy and modifiedBy information.
     * 
    */
    public SystemDataResponse getSystemData() {
        return this.systemData;
    }
    /**
     * Table level sharing specifications
     * 
    */
    public Optional<TableLevelSharingPropertiesResponse> getTableLevelSharingProperties() {
        return Optional.ofNullable(this.tableLevelSharingProperties);
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

    public static Builder builder(GetKustoPoolAttachedDatabaseConfigurationResult defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private List<String> attachedDatabaseNames;
        private String databaseName;
        private String defaultPrincipalsModificationKind;
        private String id;
        private String kustoPoolResourceId;
        private @Nullable String location;
        private String name;
        private String provisioningState;
        private SystemDataResponse systemData;
        private @Nullable TableLevelSharingPropertiesResponse tableLevelSharingProperties;
        private String type;

        public Builder() {
    	      // Empty
        }

        public Builder(GetKustoPoolAttachedDatabaseConfigurationResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.attachedDatabaseNames = defaults.attachedDatabaseNames;
    	      this.databaseName = defaults.databaseName;
    	      this.defaultPrincipalsModificationKind = defaults.defaultPrincipalsModificationKind;
    	      this.id = defaults.id;
    	      this.kustoPoolResourceId = defaults.kustoPoolResourceId;
    	      this.location = defaults.location;
    	      this.name = defaults.name;
    	      this.provisioningState = defaults.provisioningState;
    	      this.systemData = defaults.systemData;
    	      this.tableLevelSharingProperties = defaults.tableLevelSharingProperties;
    	      this.type = defaults.type;
        }

        public Builder setAttachedDatabaseNames(List<String> attachedDatabaseNames) {
            this.attachedDatabaseNames = Objects.requireNonNull(attachedDatabaseNames);
            return this;
        }

        public Builder setDatabaseName(String databaseName) {
            this.databaseName = Objects.requireNonNull(databaseName);
            return this;
        }

        public Builder setDefaultPrincipalsModificationKind(String defaultPrincipalsModificationKind) {
            this.defaultPrincipalsModificationKind = Objects.requireNonNull(defaultPrincipalsModificationKind);
            return this;
        }

        public Builder setId(String id) {
            this.id = Objects.requireNonNull(id);
            return this;
        }

        public Builder setKustoPoolResourceId(String kustoPoolResourceId) {
            this.kustoPoolResourceId = Objects.requireNonNull(kustoPoolResourceId);
            return this;
        }

        public Builder setLocation(@Nullable String location) {
            this.location = location;
            return this;
        }

        public Builder setName(String name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }

        public Builder setProvisioningState(String provisioningState) {
            this.provisioningState = Objects.requireNonNull(provisioningState);
            return this;
        }

        public Builder setSystemData(SystemDataResponse systemData) {
            this.systemData = Objects.requireNonNull(systemData);
            return this;
        }

        public Builder setTableLevelSharingProperties(@Nullable TableLevelSharingPropertiesResponse tableLevelSharingProperties) {
            this.tableLevelSharingProperties = tableLevelSharingProperties;
            return this;
        }

        public Builder setType(String type) {
            this.type = Objects.requireNonNull(type);
            return this;
        }
        public GetKustoPoolAttachedDatabaseConfigurationResult build() {
            return new GetKustoPoolAttachedDatabaseConfigurationResult(attachedDatabaseNames, databaseName, defaultPrincipalsModificationKind, id, kustoPoolResourceId, location, name, provisioningState, systemData, tableLevelSharingProperties, type);
        }
    }
}
