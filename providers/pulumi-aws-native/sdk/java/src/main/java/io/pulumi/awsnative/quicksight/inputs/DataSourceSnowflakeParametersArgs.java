// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.quicksight.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.internal.annotations.InputImport;
import java.lang.String;
import java.util.Objects;


/**
 * <p>Snowflake parameters.</p>
 * 
 */
public final class DataSourceSnowflakeParametersArgs extends io.pulumi.resources.ResourceArgs {

    public static final DataSourceSnowflakeParametersArgs Empty = new DataSourceSnowflakeParametersArgs();

    /**
     * <p>Database.</p>
     * 
     */
    @InputImport(name="database", required=true)
    private final Input<String> database;

    public Input<String> getDatabase() {
        return this.database;
    }

    /**
     * <p>Host.</p>
     * 
     */
    @InputImport(name="host", required=true)
    private final Input<String> host;

    public Input<String> getHost() {
        return this.host;
    }

    /**
     * <p>Warehouse.</p>
     * 
     */
    @InputImport(name="warehouse", required=true)
    private final Input<String> warehouse;

    public Input<String> getWarehouse() {
        return this.warehouse;
    }

    public DataSourceSnowflakeParametersArgs(
        Input<String> database,
        Input<String> host,
        Input<String> warehouse) {
        this.database = Objects.requireNonNull(database, "expected parameter 'database' to be non-null");
        this.host = Objects.requireNonNull(host, "expected parameter 'host' to be non-null");
        this.warehouse = Objects.requireNonNull(warehouse, "expected parameter 'warehouse' to be non-null");
    }

    private DataSourceSnowflakeParametersArgs() {
        this.database = Input.empty();
        this.host = Input.empty();
        this.warehouse = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(DataSourceSnowflakeParametersArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Input<String> database;
        private Input<String> host;
        private Input<String> warehouse;

        public Builder() {
    	      // Empty
        }

        public Builder(DataSourceSnowflakeParametersArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.database = defaults.database;
    	      this.host = defaults.host;
    	      this.warehouse = defaults.warehouse;
        }

        public Builder setDatabase(Input<String> database) {
            this.database = Objects.requireNonNull(database);
            return this;
        }

        public Builder setDatabase(String database) {
            this.database = Input.of(Objects.requireNonNull(database));
            return this;
        }

        public Builder setHost(Input<String> host) {
            this.host = Objects.requireNonNull(host);
            return this;
        }

        public Builder setHost(String host) {
            this.host = Input.of(Objects.requireNonNull(host));
            return this;
        }

        public Builder setWarehouse(Input<String> warehouse) {
            this.warehouse = Objects.requireNonNull(warehouse);
            return this;
        }

        public Builder setWarehouse(String warehouse) {
            this.warehouse = Input.of(Objects.requireNonNull(warehouse));
            return this;
        }

        public DataSourceSnowflakeParametersArgs build() {
            return new DataSourceSnowflakeParametersArgs(database, host, warehouse);
        }
    }
}