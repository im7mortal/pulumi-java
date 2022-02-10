// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.datamigration.inputs;

import io.pulumi.azurenative.datamigration.inputs.OrphanedUserInfoResponse;
import io.pulumi.azurenative.datamigration.inputs.ReportableExceptionResponse;
import io.pulumi.azurenative.datamigration.inputs.StartMigrationScenarioServerRoleResultResponse;
import io.pulumi.core.internal.annotations.InputImport;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Objects;


public final class MigrateSqlServerSqlMITaskOutputMigrationLevelResponse extends io.pulumi.resources.InvokeArgs {

    public static final MigrateSqlServerSqlMITaskOutputMigrationLevelResponse Empty = new MigrateSqlServerSqlMITaskOutputMigrationLevelResponse();

    @InputImport(name="agentJobs", required=true)
    private final Map<String,String> agentJobs;

    public Map<String,String> getAgentJobs() {
        return this.agentJobs;
    }

    @InputImport(name="databases", required=true)
    private final Map<String,String> databases;

    public Map<String,String> getDatabases() {
        return this.databases;
    }

    @InputImport(name="endedOn", required=true)
    private final String endedOn;

    public String getEndedOn() {
        return this.endedOn;
    }

    @InputImport(name="exceptionsAndWarnings", required=true)
    private final List<ReportableExceptionResponse> exceptionsAndWarnings;

    public List<ReportableExceptionResponse> getExceptionsAndWarnings() {
        return this.exceptionsAndWarnings;
    }

    @InputImport(name="id", required=true)
    private final String id;

    public String getId() {
        return this.id;
    }

    @InputImport(name="logins", required=true)
    private final Map<String,String> logins;

    public Map<String,String> getLogins() {
        return this.logins;
    }

    @InputImport(name="message", required=true)
    private final String message;

    public String getMessage() {
        return this.message;
    }

    @InputImport(name="orphanedUsersInfo", required=true)
    private final List<OrphanedUserInfoResponse> orphanedUsersInfo;

    public List<OrphanedUserInfoResponse> getOrphanedUsersInfo() {
        return this.orphanedUsersInfo;
    }

    @InputImport(name="resultType", required=true)
    private final String resultType;

    public String getResultType() {
        return this.resultType;
    }

    @InputImport(name="serverRoleResults", required=true)
    private final Map<String,StartMigrationScenarioServerRoleResultResponse> serverRoleResults;

    public Map<String,StartMigrationScenarioServerRoleResultResponse> getServerRoleResults() {
        return this.serverRoleResults;
    }

    @InputImport(name="sourceServerBrandVersion", required=true)
    private final String sourceServerBrandVersion;

    public String getSourceServerBrandVersion() {
        return this.sourceServerBrandVersion;
    }

    @InputImport(name="sourceServerVersion", required=true)
    private final String sourceServerVersion;

    public String getSourceServerVersion() {
        return this.sourceServerVersion;
    }

    @InputImport(name="startedOn", required=true)
    private final String startedOn;

    public String getStartedOn() {
        return this.startedOn;
    }

    @InputImport(name="state", required=true)
    private final String state;

    public String getState() {
        return this.state;
    }

    @InputImport(name="status", required=true)
    private final String status;

    public String getStatus() {
        return this.status;
    }

    @InputImport(name="targetServerBrandVersion", required=true)
    private final String targetServerBrandVersion;

    public String getTargetServerBrandVersion() {
        return this.targetServerBrandVersion;
    }

    @InputImport(name="targetServerVersion", required=true)
    private final String targetServerVersion;

    public String getTargetServerVersion() {
        return this.targetServerVersion;
    }

    public MigrateSqlServerSqlMITaskOutputMigrationLevelResponse(
        Map<String,String> agentJobs,
        Map<String,String> databases,
        String endedOn,
        List<ReportableExceptionResponse> exceptionsAndWarnings,
        String id,
        Map<String,String> logins,
        String message,
        List<OrphanedUserInfoResponse> orphanedUsersInfo,
        String resultType,
        Map<String,StartMigrationScenarioServerRoleResultResponse> serverRoleResults,
        String sourceServerBrandVersion,
        String sourceServerVersion,
        String startedOn,
        String state,
        String status,
        String targetServerBrandVersion,
        String targetServerVersion) {
        this.agentJobs = Objects.requireNonNull(agentJobs, "expected parameter 'agentJobs' to be non-null");
        this.databases = Objects.requireNonNull(databases, "expected parameter 'databases' to be non-null");
        this.endedOn = Objects.requireNonNull(endedOn, "expected parameter 'endedOn' to be non-null");
        this.exceptionsAndWarnings = Objects.requireNonNull(exceptionsAndWarnings, "expected parameter 'exceptionsAndWarnings' to be non-null");
        this.id = Objects.requireNonNull(id, "expected parameter 'id' to be non-null");
        this.logins = Objects.requireNonNull(logins, "expected parameter 'logins' to be non-null");
        this.message = Objects.requireNonNull(message, "expected parameter 'message' to be non-null");
        this.orphanedUsersInfo = Objects.requireNonNull(orphanedUsersInfo, "expected parameter 'orphanedUsersInfo' to be non-null");
        this.resultType = Objects.requireNonNull(resultType, "expected parameter 'resultType' to be non-null");
        this.serverRoleResults = Objects.requireNonNull(serverRoleResults, "expected parameter 'serverRoleResults' to be non-null");
        this.sourceServerBrandVersion = Objects.requireNonNull(sourceServerBrandVersion, "expected parameter 'sourceServerBrandVersion' to be non-null");
        this.sourceServerVersion = Objects.requireNonNull(sourceServerVersion, "expected parameter 'sourceServerVersion' to be non-null");
        this.startedOn = Objects.requireNonNull(startedOn, "expected parameter 'startedOn' to be non-null");
        this.state = Objects.requireNonNull(state, "expected parameter 'state' to be non-null");
        this.status = Objects.requireNonNull(status, "expected parameter 'status' to be non-null");
        this.targetServerBrandVersion = Objects.requireNonNull(targetServerBrandVersion, "expected parameter 'targetServerBrandVersion' to be non-null");
        this.targetServerVersion = Objects.requireNonNull(targetServerVersion, "expected parameter 'targetServerVersion' to be non-null");
    }

    private MigrateSqlServerSqlMITaskOutputMigrationLevelResponse() {
        this.agentJobs = Map.of();
        this.databases = Map.of();
        this.endedOn = null;
        this.exceptionsAndWarnings = List.of();
        this.id = null;
        this.logins = Map.of();
        this.message = null;
        this.orphanedUsersInfo = List.of();
        this.resultType = null;
        this.serverRoleResults = Map.of();
        this.sourceServerBrandVersion = null;
        this.sourceServerVersion = null;
        this.startedOn = null;
        this.state = null;
        this.status = null;
        this.targetServerBrandVersion = null;
        this.targetServerVersion = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(MigrateSqlServerSqlMITaskOutputMigrationLevelResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Map<String,String> agentJobs;
        private Map<String,String> databases;
        private String endedOn;
        private List<ReportableExceptionResponse> exceptionsAndWarnings;
        private String id;
        private Map<String,String> logins;
        private String message;
        private List<OrphanedUserInfoResponse> orphanedUsersInfo;
        private String resultType;
        private Map<String,StartMigrationScenarioServerRoleResultResponse> serverRoleResults;
        private String sourceServerBrandVersion;
        private String sourceServerVersion;
        private String startedOn;
        private String state;
        private String status;
        private String targetServerBrandVersion;
        private String targetServerVersion;

        public Builder() {
    	      // Empty
        }

        public Builder(MigrateSqlServerSqlMITaskOutputMigrationLevelResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.agentJobs = defaults.agentJobs;
    	      this.databases = defaults.databases;
    	      this.endedOn = defaults.endedOn;
    	      this.exceptionsAndWarnings = defaults.exceptionsAndWarnings;
    	      this.id = defaults.id;
    	      this.logins = defaults.logins;
    	      this.message = defaults.message;
    	      this.orphanedUsersInfo = defaults.orphanedUsersInfo;
    	      this.resultType = defaults.resultType;
    	      this.serverRoleResults = defaults.serverRoleResults;
    	      this.sourceServerBrandVersion = defaults.sourceServerBrandVersion;
    	      this.sourceServerVersion = defaults.sourceServerVersion;
    	      this.startedOn = defaults.startedOn;
    	      this.state = defaults.state;
    	      this.status = defaults.status;
    	      this.targetServerBrandVersion = defaults.targetServerBrandVersion;
    	      this.targetServerVersion = defaults.targetServerVersion;
        }

        public Builder setAgentJobs(Map<String,String> agentJobs) {
            this.agentJobs = Objects.requireNonNull(agentJobs);
            return this;
        }

        public Builder setDatabases(Map<String,String> databases) {
            this.databases = Objects.requireNonNull(databases);
            return this;
        }

        public Builder setEndedOn(String endedOn) {
            this.endedOn = Objects.requireNonNull(endedOn);
            return this;
        }

        public Builder setExceptionsAndWarnings(List<ReportableExceptionResponse> exceptionsAndWarnings) {
            this.exceptionsAndWarnings = Objects.requireNonNull(exceptionsAndWarnings);
            return this;
        }

        public Builder setId(String id) {
            this.id = Objects.requireNonNull(id);
            return this;
        }

        public Builder setLogins(Map<String,String> logins) {
            this.logins = Objects.requireNonNull(logins);
            return this;
        }

        public Builder setMessage(String message) {
            this.message = Objects.requireNonNull(message);
            return this;
        }

        public Builder setOrphanedUsersInfo(List<OrphanedUserInfoResponse> orphanedUsersInfo) {
            this.orphanedUsersInfo = Objects.requireNonNull(orphanedUsersInfo);
            return this;
        }

        public Builder setResultType(String resultType) {
            this.resultType = Objects.requireNonNull(resultType);
            return this;
        }

        public Builder setServerRoleResults(Map<String,StartMigrationScenarioServerRoleResultResponse> serverRoleResults) {
            this.serverRoleResults = Objects.requireNonNull(serverRoleResults);
            return this;
        }

        public Builder setSourceServerBrandVersion(String sourceServerBrandVersion) {
            this.sourceServerBrandVersion = Objects.requireNonNull(sourceServerBrandVersion);
            return this;
        }

        public Builder setSourceServerVersion(String sourceServerVersion) {
            this.sourceServerVersion = Objects.requireNonNull(sourceServerVersion);
            return this;
        }

        public Builder setStartedOn(String startedOn) {
            this.startedOn = Objects.requireNonNull(startedOn);
            return this;
        }

        public Builder setState(String state) {
            this.state = Objects.requireNonNull(state);
            return this;
        }

        public Builder setStatus(String status) {
            this.status = Objects.requireNonNull(status);
            return this;
        }

        public Builder setTargetServerBrandVersion(String targetServerBrandVersion) {
            this.targetServerBrandVersion = Objects.requireNonNull(targetServerBrandVersion);
            return this;
        }

        public Builder setTargetServerVersion(String targetServerVersion) {
            this.targetServerVersion = Objects.requireNonNull(targetServerVersion);
            return this;
        }

        public MigrateSqlServerSqlMITaskOutputMigrationLevelResponse build() {
            return new MigrateSqlServerSqlMITaskOutputMigrationLevelResponse(agentJobs, databases, endedOn, exceptionsAndWarnings, id, logins, message, orphanedUsersInfo, resultType, serverRoleResults, sourceServerBrandVersion, sourceServerVersion, startedOn, state, status, targetServerBrandVersion, targetServerVersion);
        }
    }
}