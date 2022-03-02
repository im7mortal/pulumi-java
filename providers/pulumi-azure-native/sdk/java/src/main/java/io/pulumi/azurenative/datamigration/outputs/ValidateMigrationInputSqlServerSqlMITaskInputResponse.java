// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.datamigration.outputs;

import io.pulumi.azurenative.datamigration.outputs.BlobShareResponse;
import io.pulumi.azurenative.datamigration.outputs.FileShareResponse;
import io.pulumi.azurenative.datamigration.outputs.MigrateSqlServerSqlMIDatabaseInputResponse;
import io.pulumi.azurenative.datamigration.outputs.SqlConnectionInfoResponse;
import io.pulumi.core.annotations.OutputCustomType;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class ValidateMigrationInputSqlServerSqlMITaskInputResponse {
    /**
     * SAS URI of Azure Storage Account Container to be used for storing backup files.
     * 
     */
    private final BlobShareResponse backupBlobShare;
    /**
     * Backup file share information for all selected databases.
     * 
     */
    private final @Nullable FileShareResponse backupFileShare;
    /**
     * Backup Mode to specify whether to use existing backup or create new backup.
     * 
     */
    private final @Nullable String backupMode;
    /**
     * Databases to migrate
     * 
     */
    private final List<MigrateSqlServerSqlMIDatabaseInputResponse> selectedDatabases;
    /**
     * Logins to migrate
     * 
     */
    private final @Nullable List<String> selectedLogins;
    /**
     * Information for connecting to source
     * 
     */
    private final SqlConnectionInfoResponse sourceConnectionInfo;
    /**
     * Information for connecting to target
     * 
     */
    private final SqlConnectionInfoResponse targetConnectionInfo;

    @OutputCustomType.Constructor({"backupBlobShare","backupFileShare","backupMode","selectedDatabases","selectedLogins","sourceConnectionInfo","targetConnectionInfo"})
    private ValidateMigrationInputSqlServerSqlMITaskInputResponse(
        BlobShareResponse backupBlobShare,
        @Nullable FileShareResponse backupFileShare,
        @Nullable String backupMode,
        List<MigrateSqlServerSqlMIDatabaseInputResponse> selectedDatabases,
        @Nullable List<String> selectedLogins,
        SqlConnectionInfoResponse sourceConnectionInfo,
        SqlConnectionInfoResponse targetConnectionInfo) {
        this.backupBlobShare = Objects.requireNonNull(backupBlobShare);
        this.backupFileShare = backupFileShare;
        this.backupMode = backupMode;
        this.selectedDatabases = Objects.requireNonNull(selectedDatabases);
        this.selectedLogins = selectedLogins;
        this.sourceConnectionInfo = Objects.requireNonNull(sourceConnectionInfo);
        this.targetConnectionInfo = Objects.requireNonNull(targetConnectionInfo);
    }

    /**
     * SAS URI of Azure Storage Account Container to be used for storing backup files.
     * 
    */
    public BlobShareResponse getBackupBlobShare() {
        return this.backupBlobShare;
    }
    /**
     * Backup file share information for all selected databases.
     * 
    */
    public Optional<FileShareResponse> getBackupFileShare() {
        return Optional.ofNullable(this.backupFileShare);
    }
    /**
     * Backup Mode to specify whether to use existing backup or create new backup.
     * 
    */
    public Optional<String> getBackupMode() {
        return Optional.ofNullable(this.backupMode);
    }
    /**
     * Databases to migrate
     * 
    */
    public List<MigrateSqlServerSqlMIDatabaseInputResponse> getSelectedDatabases() {
        return this.selectedDatabases;
    }
    /**
     * Logins to migrate
     * 
    */
    public List<String> getSelectedLogins() {
        return this.selectedLogins == null ? List.of() : this.selectedLogins;
    }
    /**
     * Information for connecting to source
     * 
    */
    public SqlConnectionInfoResponse getSourceConnectionInfo() {
        return this.sourceConnectionInfo;
    }
    /**
     * Information for connecting to target
     * 
    */
    public SqlConnectionInfoResponse getTargetConnectionInfo() {
        return this.targetConnectionInfo;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ValidateMigrationInputSqlServerSqlMITaskInputResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private BlobShareResponse backupBlobShare;
        private @Nullable FileShareResponse backupFileShare;
        private @Nullable String backupMode;
        private List<MigrateSqlServerSqlMIDatabaseInputResponse> selectedDatabases;
        private @Nullable List<String> selectedLogins;
        private SqlConnectionInfoResponse sourceConnectionInfo;
        private SqlConnectionInfoResponse targetConnectionInfo;

        public Builder() {
    	      // Empty
        }

        public Builder(ValidateMigrationInputSqlServerSqlMITaskInputResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.backupBlobShare = defaults.backupBlobShare;
    	      this.backupFileShare = defaults.backupFileShare;
    	      this.backupMode = defaults.backupMode;
    	      this.selectedDatabases = defaults.selectedDatabases;
    	      this.selectedLogins = defaults.selectedLogins;
    	      this.sourceConnectionInfo = defaults.sourceConnectionInfo;
    	      this.targetConnectionInfo = defaults.targetConnectionInfo;
        }

        public Builder setBackupBlobShare(BlobShareResponse backupBlobShare) {
            this.backupBlobShare = Objects.requireNonNull(backupBlobShare);
            return this;
        }

        public Builder setBackupFileShare(@Nullable FileShareResponse backupFileShare) {
            this.backupFileShare = backupFileShare;
            return this;
        }

        public Builder setBackupMode(@Nullable String backupMode) {
            this.backupMode = backupMode;
            return this;
        }

        public Builder setSelectedDatabases(List<MigrateSqlServerSqlMIDatabaseInputResponse> selectedDatabases) {
            this.selectedDatabases = Objects.requireNonNull(selectedDatabases);
            return this;
        }

        public Builder setSelectedLogins(@Nullable List<String> selectedLogins) {
            this.selectedLogins = selectedLogins;
            return this;
        }

        public Builder setSourceConnectionInfo(SqlConnectionInfoResponse sourceConnectionInfo) {
            this.sourceConnectionInfo = Objects.requireNonNull(sourceConnectionInfo);
            return this;
        }

        public Builder setTargetConnectionInfo(SqlConnectionInfoResponse targetConnectionInfo) {
            this.targetConnectionInfo = Objects.requireNonNull(targetConnectionInfo);
            return this;
        }
        public ValidateMigrationInputSqlServerSqlMITaskInputResponse build() {
            return new ValidateMigrationInputSqlServerSqlMITaskInputResponse(backupBlobShare, backupFileShare, backupMode, selectedDatabases, selectedLogins, sourceConnectionInfo, targetConnectionInfo);
        }
    }
}
