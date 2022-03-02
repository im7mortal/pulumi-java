// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.datamigration.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;

@OutputCustomType
public final class MigrateSqlServerSqlMISyncTaskOutputMigrationLevelResponse {
    /**
     * Count of databases
     * 
     */
    private final Integer databaseCount;
    /**
     * Number of database level errors
     * 
     */
    private final Integer databaseErrorCount;
    /**
     * Migration end time
     * 
     */
    private final String endedOn;
    /**
     * Result identifier
     * 
     */
    private final String id;
    /**
     * Result type
     * Expected value is 'MigrationLevelOutput'.
     * 
     */
    private final String resultType;
    /**
     * Source server brand version
     * 
     */
    private final String sourceServerBrandVersion;
    /**
     * Source server name
     * 
     */
    private final String sourceServerName;
    /**
     * Source server version
     * 
     */
    private final String sourceServerVersion;
    /**
     * Migration start time
     * 
     */
    private final String startedOn;
    /**
     * Current state of migration
     * 
     */
    private final String state;
    /**
     * Target server brand version
     * 
     */
    private final String targetServerBrandVersion;
    /**
     * Target server name
     * 
     */
    private final String targetServerName;
    /**
     * Target server version
     * 
     */
    private final String targetServerVersion;

    @OutputCustomType.Constructor({"databaseCount","databaseErrorCount","endedOn","id","resultType","sourceServerBrandVersion","sourceServerName","sourceServerVersion","startedOn","state","targetServerBrandVersion","targetServerName","targetServerVersion"})
    private MigrateSqlServerSqlMISyncTaskOutputMigrationLevelResponse(
        Integer databaseCount,
        Integer databaseErrorCount,
        String endedOn,
        String id,
        String resultType,
        String sourceServerBrandVersion,
        String sourceServerName,
        String sourceServerVersion,
        String startedOn,
        String state,
        String targetServerBrandVersion,
        String targetServerName,
        String targetServerVersion) {
        this.databaseCount = Objects.requireNonNull(databaseCount);
        this.databaseErrorCount = Objects.requireNonNull(databaseErrorCount);
        this.endedOn = Objects.requireNonNull(endedOn);
        this.id = Objects.requireNonNull(id);
        this.resultType = Objects.requireNonNull(resultType);
        this.sourceServerBrandVersion = Objects.requireNonNull(sourceServerBrandVersion);
        this.sourceServerName = Objects.requireNonNull(sourceServerName);
        this.sourceServerVersion = Objects.requireNonNull(sourceServerVersion);
        this.startedOn = Objects.requireNonNull(startedOn);
        this.state = Objects.requireNonNull(state);
        this.targetServerBrandVersion = Objects.requireNonNull(targetServerBrandVersion);
        this.targetServerName = Objects.requireNonNull(targetServerName);
        this.targetServerVersion = Objects.requireNonNull(targetServerVersion);
    }

    /**
     * Count of databases
     * 
    */
    public Integer getDatabaseCount() {
        return this.databaseCount;
    }
    /**
     * Number of database level errors
     * 
    */
    public Integer getDatabaseErrorCount() {
        return this.databaseErrorCount;
    }
    /**
     * Migration end time
     * 
    */
    public String getEndedOn() {
        return this.endedOn;
    }
    /**
     * Result identifier
     * 
    */
    public String getId() {
        return this.id;
    }
    /**
     * Result type
     * Expected value is 'MigrationLevelOutput'.
     * 
    */
    public String getResultType() {
        return this.resultType;
    }
    /**
     * Source server brand version
     * 
    */
    public String getSourceServerBrandVersion() {
        return this.sourceServerBrandVersion;
    }
    /**
     * Source server name
     * 
    */
    public String getSourceServerName() {
        return this.sourceServerName;
    }
    /**
     * Source server version
     * 
    */
    public String getSourceServerVersion() {
        return this.sourceServerVersion;
    }
    /**
     * Migration start time
     * 
    */
    public String getStartedOn() {
        return this.startedOn;
    }
    /**
     * Current state of migration
     * 
    */
    public String getState() {
        return this.state;
    }
    /**
     * Target server brand version
     * 
    */
    public String getTargetServerBrandVersion() {
        return this.targetServerBrandVersion;
    }
    /**
     * Target server name
     * 
    */
    public String getTargetServerName() {
        return this.targetServerName;
    }
    /**
     * Target server version
     * 
    */
    public String getTargetServerVersion() {
        return this.targetServerVersion;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(MigrateSqlServerSqlMISyncTaskOutputMigrationLevelResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Integer databaseCount;
        private Integer databaseErrorCount;
        private String endedOn;
        private String id;
        private String resultType;
        private String sourceServerBrandVersion;
        private String sourceServerName;
        private String sourceServerVersion;
        private String startedOn;
        private String state;
        private String targetServerBrandVersion;
        private String targetServerName;
        private String targetServerVersion;

        public Builder() {
    	      // Empty
        }

        public Builder(MigrateSqlServerSqlMISyncTaskOutputMigrationLevelResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.databaseCount = defaults.databaseCount;
    	      this.databaseErrorCount = defaults.databaseErrorCount;
    	      this.endedOn = defaults.endedOn;
    	      this.id = defaults.id;
    	      this.resultType = defaults.resultType;
    	      this.sourceServerBrandVersion = defaults.sourceServerBrandVersion;
    	      this.sourceServerName = defaults.sourceServerName;
    	      this.sourceServerVersion = defaults.sourceServerVersion;
    	      this.startedOn = defaults.startedOn;
    	      this.state = defaults.state;
    	      this.targetServerBrandVersion = defaults.targetServerBrandVersion;
    	      this.targetServerName = defaults.targetServerName;
    	      this.targetServerVersion = defaults.targetServerVersion;
        }

        public Builder setDatabaseCount(Integer databaseCount) {
            this.databaseCount = Objects.requireNonNull(databaseCount);
            return this;
        }

        public Builder setDatabaseErrorCount(Integer databaseErrorCount) {
            this.databaseErrorCount = Objects.requireNonNull(databaseErrorCount);
            return this;
        }

        public Builder setEndedOn(String endedOn) {
            this.endedOn = Objects.requireNonNull(endedOn);
            return this;
        }

        public Builder setId(String id) {
            this.id = Objects.requireNonNull(id);
            return this;
        }

        public Builder setResultType(String resultType) {
            this.resultType = Objects.requireNonNull(resultType);
            return this;
        }

        public Builder setSourceServerBrandVersion(String sourceServerBrandVersion) {
            this.sourceServerBrandVersion = Objects.requireNonNull(sourceServerBrandVersion);
            return this;
        }

        public Builder setSourceServerName(String sourceServerName) {
            this.sourceServerName = Objects.requireNonNull(sourceServerName);
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

        public Builder setTargetServerBrandVersion(String targetServerBrandVersion) {
            this.targetServerBrandVersion = Objects.requireNonNull(targetServerBrandVersion);
            return this;
        }

        public Builder setTargetServerName(String targetServerName) {
            this.targetServerName = Objects.requireNonNull(targetServerName);
            return this;
        }

        public Builder setTargetServerVersion(String targetServerVersion) {
            this.targetServerVersion = Objects.requireNonNull(targetServerVersion);
            return this;
        }
        public MigrateSqlServerSqlMISyncTaskOutputMigrationLevelResponse build() {
            return new MigrateSqlServerSqlMISyncTaskOutputMigrationLevelResponse(databaseCount, databaseErrorCount, endedOn, id, resultType, sourceServerBrandVersion, sourceServerName, sourceServerVersion, startedOn, state, targetServerBrandVersion, targetServerName, targetServerVersion);
        }
    }
}
