// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.datamigration.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import java.lang.String;
import java.util.Map;
import java.util.Objects;

@OutputCustomType
public final class ConnectToTargetSqlDbTaskOutputResponse {
    /**
     * Source databases as a map from database name to database id
     * 
     */
    private final Map<String,String> databases;
    /**
     * Result identifier
     * 
     */
    private final String id;
    /**
     * Target server brand version
     * 
     */
    private final String targetServerBrandVersion;
    /**
     * Version of the target server
     * 
     */
    private final String targetServerVersion;

    @OutputCustomType.Constructor({"databases","id","targetServerBrandVersion","targetServerVersion"})
    private ConnectToTargetSqlDbTaskOutputResponse(
        Map<String,String> databases,
        String id,
        String targetServerBrandVersion,
        String targetServerVersion) {
        this.databases = Objects.requireNonNull(databases);
        this.id = Objects.requireNonNull(id);
        this.targetServerBrandVersion = Objects.requireNonNull(targetServerBrandVersion);
        this.targetServerVersion = Objects.requireNonNull(targetServerVersion);
    }

    /**
     * Source databases as a map from database name to database id
     * 
    */
    public Map<String,String> getDatabases() {
        return this.databases;
    }
    /**
     * Result identifier
     * 
    */
    public String getId() {
        return this.id;
    }
    /**
     * Target server brand version
     * 
    */
    public String getTargetServerBrandVersion() {
        return this.targetServerBrandVersion;
    }
    /**
     * Version of the target server
     * 
    */
    public String getTargetServerVersion() {
        return this.targetServerVersion;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ConnectToTargetSqlDbTaskOutputResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Map<String,String> databases;
        private String id;
        private String targetServerBrandVersion;
        private String targetServerVersion;

        public Builder() {
    	      // Empty
        }

        public Builder(ConnectToTargetSqlDbTaskOutputResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.databases = defaults.databases;
    	      this.id = defaults.id;
    	      this.targetServerBrandVersion = defaults.targetServerBrandVersion;
    	      this.targetServerVersion = defaults.targetServerVersion;
        }

        public Builder setDatabases(Map<String,String> databases) {
            this.databases = Objects.requireNonNull(databases);
            return this;
        }

        public Builder setId(String id) {
            this.id = Objects.requireNonNull(id);
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
        public ConnectToTargetSqlDbTaskOutputResponse build() {
            return new ConnectToTargetSqlDbTaskOutputResponse(databases, id, targetServerBrandVersion, targetServerVersion);
        }
    }
}
