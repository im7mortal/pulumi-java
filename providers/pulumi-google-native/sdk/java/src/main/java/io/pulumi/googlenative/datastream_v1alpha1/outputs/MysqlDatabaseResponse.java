// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.datastream_v1alpha1.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import io.pulumi.googlenative.datastream_v1alpha1.outputs.MysqlTableResponse;
import java.lang.String;
import java.util.List;
import java.util.Objects;

@OutputCustomType
public final class MysqlDatabaseResponse {
    /**
     * Database name.
     * 
     */
    private final String databaseName;
    /**
     * Tables in the database.
     * 
     */
    private final List<MysqlTableResponse> mysqlTables;

    @OutputCustomType.Constructor({"databaseName","mysqlTables"})
    private MysqlDatabaseResponse(
        String databaseName,
        List<MysqlTableResponse> mysqlTables) {
        this.databaseName = Objects.requireNonNull(databaseName);
        this.mysqlTables = Objects.requireNonNull(mysqlTables);
    }

    /**
     * Database name.
     * 
    */
    public String getDatabaseName() {
        return this.databaseName;
    }
    /**
     * Tables in the database.
     * 
    */
    public List<MysqlTableResponse> getMysqlTables() {
        return this.mysqlTables;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(MysqlDatabaseResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String databaseName;
        private List<MysqlTableResponse> mysqlTables;

        public Builder() {
    	      // Empty
        }

        public Builder(MysqlDatabaseResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.databaseName = defaults.databaseName;
    	      this.mysqlTables = defaults.mysqlTables;
        }

        public Builder setDatabaseName(String databaseName) {
            this.databaseName = Objects.requireNonNull(databaseName);
            return this;
        }

        public Builder setMysqlTables(List<MysqlTableResponse> mysqlTables) {
            this.mysqlTables = Objects.requireNonNull(mysqlTables);
            return this;
        }
        public MysqlDatabaseResponse build() {
            return new MysqlDatabaseResponse(databaseName, mysqlTables);
        }
    }
}
