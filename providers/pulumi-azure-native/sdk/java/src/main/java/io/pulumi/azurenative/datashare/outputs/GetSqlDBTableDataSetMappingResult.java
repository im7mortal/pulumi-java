// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.datashare.outputs;

import io.pulumi.azurenative.datashare.outputs.SystemDataResponse;
import io.pulumi.core.annotations.OutputCustomType;
import java.lang.String;
import java.util.Objects;

@OutputCustomType
public final class GetSqlDBTableDataSetMappingResult {
    /**
     * The id of the source data set.
     * 
     */
    private final String dataSetId;
    /**
     * Gets the status of the data set mapping.
     * 
     */
    private final String dataSetMappingStatus;
    /**
     * DatabaseName name of the sink data set
     * 
     */
    private final String databaseName;
    /**
     * The resource id of the azure resource
     * 
     */
    private final String id;
    /**
     * Kind of data set mapping.
     * Expected value is 'SqlDBTable'.
     * 
     */
    private final String kind;
    /**
     * Name of the azure resource
     * 
     */
    private final String name;
    /**
     * Provisioning state of the data set mapping.
     * 
     */
    private final String provisioningState;
    /**
     * Schema of the table. Default value is dbo.
     * 
     */
    private final String schemaName;
    /**
     * Resource id of SQL server
     * 
     */
    private final String sqlServerResourceId;
    /**
     * System Data of the Azure resource.
     * 
     */
    private final SystemDataResponse systemData;
    /**
     * SQL DB table name.
     * 
     */
    private final String tableName;
    /**
     * Type of the azure resource
     * 
     */
    private final String type;

    @OutputCustomType.Constructor({"dataSetId","dataSetMappingStatus","databaseName","id","kind","name","provisioningState","schemaName","sqlServerResourceId","systemData","tableName","type"})
    private GetSqlDBTableDataSetMappingResult(
        String dataSetId,
        String dataSetMappingStatus,
        String databaseName,
        String id,
        String kind,
        String name,
        String provisioningState,
        String schemaName,
        String sqlServerResourceId,
        SystemDataResponse systemData,
        String tableName,
        String type) {
        this.dataSetId = Objects.requireNonNull(dataSetId);
        this.dataSetMappingStatus = Objects.requireNonNull(dataSetMappingStatus);
        this.databaseName = Objects.requireNonNull(databaseName);
        this.id = Objects.requireNonNull(id);
        this.kind = Objects.requireNonNull(kind);
        this.name = Objects.requireNonNull(name);
        this.provisioningState = Objects.requireNonNull(provisioningState);
        this.schemaName = Objects.requireNonNull(schemaName);
        this.sqlServerResourceId = Objects.requireNonNull(sqlServerResourceId);
        this.systemData = Objects.requireNonNull(systemData);
        this.tableName = Objects.requireNonNull(tableName);
        this.type = Objects.requireNonNull(type);
    }

    /**
     * The id of the source data set.
     * 
    */
    public String getDataSetId() {
        return this.dataSetId;
    }
    /**
     * Gets the status of the data set mapping.
     * 
    */
    public String getDataSetMappingStatus() {
        return this.dataSetMappingStatus;
    }
    /**
     * DatabaseName name of the sink data set
     * 
    */
    public String getDatabaseName() {
        return this.databaseName;
    }
    /**
     * The resource id of the azure resource
     * 
    */
    public String getId() {
        return this.id;
    }
    /**
     * Kind of data set mapping.
     * Expected value is 'SqlDBTable'.
     * 
    */
    public String getKind() {
        return this.kind;
    }
    /**
     * Name of the azure resource
     * 
    */
    public String getName() {
        return this.name;
    }
    /**
     * Provisioning state of the data set mapping.
     * 
    */
    public String getProvisioningState() {
        return this.provisioningState;
    }
    /**
     * Schema of the table. Default value is dbo.
     * 
    */
    public String getSchemaName() {
        return this.schemaName;
    }
    /**
     * Resource id of SQL server
     * 
    */
    public String getSqlServerResourceId() {
        return this.sqlServerResourceId;
    }
    /**
     * System Data of the Azure resource.
     * 
    */
    public SystemDataResponse getSystemData() {
        return this.systemData;
    }
    /**
     * SQL DB table name.
     * 
    */
    public String getTableName() {
        return this.tableName;
    }
    /**
     * Type of the azure resource
     * 
    */
    public String getType() {
        return this.type;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetSqlDBTableDataSetMappingResult defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String dataSetId;
        private String dataSetMappingStatus;
        private String databaseName;
        private String id;
        private String kind;
        private String name;
        private String provisioningState;
        private String schemaName;
        private String sqlServerResourceId;
        private SystemDataResponse systemData;
        private String tableName;
        private String type;

        public Builder() {
    	      // Empty
        }

        public Builder(GetSqlDBTableDataSetMappingResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.dataSetId = defaults.dataSetId;
    	      this.dataSetMappingStatus = defaults.dataSetMappingStatus;
    	      this.databaseName = defaults.databaseName;
    	      this.id = defaults.id;
    	      this.kind = defaults.kind;
    	      this.name = defaults.name;
    	      this.provisioningState = defaults.provisioningState;
    	      this.schemaName = defaults.schemaName;
    	      this.sqlServerResourceId = defaults.sqlServerResourceId;
    	      this.systemData = defaults.systemData;
    	      this.tableName = defaults.tableName;
    	      this.type = defaults.type;
        }

        public Builder setDataSetId(String dataSetId) {
            this.dataSetId = Objects.requireNonNull(dataSetId);
            return this;
        }

        public Builder setDataSetMappingStatus(String dataSetMappingStatus) {
            this.dataSetMappingStatus = Objects.requireNonNull(dataSetMappingStatus);
            return this;
        }

        public Builder setDatabaseName(String databaseName) {
            this.databaseName = Objects.requireNonNull(databaseName);
            return this;
        }

        public Builder setId(String id) {
            this.id = Objects.requireNonNull(id);
            return this;
        }

        public Builder setKind(String kind) {
            this.kind = Objects.requireNonNull(kind);
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

        public Builder setSchemaName(String schemaName) {
            this.schemaName = Objects.requireNonNull(schemaName);
            return this;
        }

        public Builder setSqlServerResourceId(String sqlServerResourceId) {
            this.sqlServerResourceId = Objects.requireNonNull(sqlServerResourceId);
            return this;
        }

        public Builder setSystemData(SystemDataResponse systemData) {
            this.systemData = Objects.requireNonNull(systemData);
            return this;
        }

        public Builder setTableName(String tableName) {
            this.tableName = Objects.requireNonNull(tableName);
            return this;
        }

        public Builder setType(String type) {
            this.type = Objects.requireNonNull(type);
            return this;
        }
        public GetSqlDBTableDataSetMappingResult build() {
            return new GetSqlDBTableDataSetMappingResult(dataSetId, dataSetMappingStatus, databaseName, id, kind, name, provisioningState, schemaName, sqlServerResourceId, systemData, tableName, type);
        }
    }
}
