// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.datamigration.outputs;

import io.pulumi.azurenative.datamigration.outputs.AzureActiveDirectoryAppResponse;
import io.pulumi.azurenative.datamigration.outputs.FileShareResponse;
import io.pulumi.azurenative.datamigration.outputs.MiSqlConnectionInfoResponse;
import io.pulumi.azurenative.datamigration.outputs.MigrateSqlServerSqlMIDatabaseInputResponse;
import io.pulumi.azurenative.datamigration.outputs.SqlConnectionInfoResponse;
import io.pulumi.core.annotations.OutputCustomType;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class MigrateSqlServerSqlMISyncTaskInputResponse {
    /**
     * Azure Active Directory Application the DMS instance will use to connect to the target instance of Azure SQL Database Managed Instance and the Azure Storage Account
     * 
     */
    private final AzureActiveDirectoryAppResponse azureApp;
    /**
     * Backup file share information for all selected databases.
     * 
     */
    private final @Nullable FileShareResponse backupFileShare;
    /**
     * Databases to migrate
     * 
     */
    private final List<MigrateSqlServerSqlMIDatabaseInputResponse> selectedDatabases;
    /**
     * Connection information for source SQL Server
     * 
     */
    private final SqlConnectionInfoResponse sourceConnectionInfo;
    /**
     * Fully qualified resourceId of storage
     * 
     */
    private final String storageResourceId;
    /**
     * Connection information for Azure SQL Database Managed Instance
     * 
     */
    private final MiSqlConnectionInfoResponse targetConnectionInfo;

    @OutputCustomType.Constructor({"azureApp","backupFileShare","selectedDatabases","sourceConnectionInfo","storageResourceId","targetConnectionInfo"})
    private MigrateSqlServerSqlMISyncTaskInputResponse(
        AzureActiveDirectoryAppResponse azureApp,
        @Nullable FileShareResponse backupFileShare,
        List<MigrateSqlServerSqlMIDatabaseInputResponse> selectedDatabases,
        SqlConnectionInfoResponse sourceConnectionInfo,
        String storageResourceId,
        MiSqlConnectionInfoResponse targetConnectionInfo) {
        this.azureApp = Objects.requireNonNull(azureApp);
        this.backupFileShare = backupFileShare;
        this.selectedDatabases = Objects.requireNonNull(selectedDatabases);
        this.sourceConnectionInfo = Objects.requireNonNull(sourceConnectionInfo);
        this.storageResourceId = Objects.requireNonNull(storageResourceId);
        this.targetConnectionInfo = Objects.requireNonNull(targetConnectionInfo);
    }

    /**
     * Azure Active Directory Application the DMS instance will use to connect to the target instance of Azure SQL Database Managed Instance and the Azure Storage Account
     * 
    */
    public AzureActiveDirectoryAppResponse getAzureApp() {
        return this.azureApp;
    }
    /**
     * Backup file share information for all selected databases.
     * 
    */
    public Optional<FileShareResponse> getBackupFileShare() {
        return Optional.ofNullable(this.backupFileShare);
    }
    /**
     * Databases to migrate
     * 
    */
    public List<MigrateSqlServerSqlMIDatabaseInputResponse> getSelectedDatabases() {
        return this.selectedDatabases;
    }
    /**
     * Connection information for source SQL Server
     * 
    */
    public SqlConnectionInfoResponse getSourceConnectionInfo() {
        return this.sourceConnectionInfo;
    }
    /**
     * Fully qualified resourceId of storage
     * 
    */
    public String getStorageResourceId() {
        return this.storageResourceId;
    }
    /**
     * Connection information for Azure SQL Database Managed Instance
     * 
    */
    public MiSqlConnectionInfoResponse getTargetConnectionInfo() {
        return this.targetConnectionInfo;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(MigrateSqlServerSqlMISyncTaskInputResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private AzureActiveDirectoryAppResponse azureApp;
        private @Nullable FileShareResponse backupFileShare;
        private List<MigrateSqlServerSqlMIDatabaseInputResponse> selectedDatabases;
        private SqlConnectionInfoResponse sourceConnectionInfo;
        private String storageResourceId;
        private MiSqlConnectionInfoResponse targetConnectionInfo;

        public Builder() {
    	      // Empty
        }

        public Builder(MigrateSqlServerSqlMISyncTaskInputResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.azureApp = defaults.azureApp;
    	      this.backupFileShare = defaults.backupFileShare;
    	      this.selectedDatabases = defaults.selectedDatabases;
    	      this.sourceConnectionInfo = defaults.sourceConnectionInfo;
    	      this.storageResourceId = defaults.storageResourceId;
    	      this.targetConnectionInfo = defaults.targetConnectionInfo;
        }

        public Builder setAzureApp(AzureActiveDirectoryAppResponse azureApp) {
            this.azureApp = Objects.requireNonNull(azureApp);
            return this;
        }

        public Builder setBackupFileShare(@Nullable FileShareResponse backupFileShare) {
            this.backupFileShare = backupFileShare;
            return this;
        }

        public Builder setSelectedDatabases(List<MigrateSqlServerSqlMIDatabaseInputResponse> selectedDatabases) {
            this.selectedDatabases = Objects.requireNonNull(selectedDatabases);
            return this;
        }

        public Builder setSourceConnectionInfo(SqlConnectionInfoResponse sourceConnectionInfo) {
            this.sourceConnectionInfo = Objects.requireNonNull(sourceConnectionInfo);
            return this;
        }

        public Builder setStorageResourceId(String storageResourceId) {
            this.storageResourceId = Objects.requireNonNull(storageResourceId);
            return this;
        }

        public Builder setTargetConnectionInfo(MiSqlConnectionInfoResponse targetConnectionInfo) {
            this.targetConnectionInfo = Objects.requireNonNull(targetConnectionInfo);
            return this;
        }
        public MigrateSqlServerSqlMISyncTaskInputResponse build() {
            return new MigrateSqlServerSqlMISyncTaskInputResponse(azureApp, backupFileShare, selectedDatabases, sourceConnectionInfo, storageResourceId, targetConnectionInfo);
        }
    }
}
