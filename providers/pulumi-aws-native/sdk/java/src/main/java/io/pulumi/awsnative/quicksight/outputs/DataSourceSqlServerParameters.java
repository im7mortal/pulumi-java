// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.quicksight.outputs;

import io.pulumi.core.internal.annotations.OutputCustomType;
import java.lang.Double;
import java.lang.String;
import java.util.Objects;

@OutputCustomType
public final class DataSourceSqlServerParameters {
    /**
     * <p>Database.</p>
     * 
     */
    private final String database;
    /**
     * <p>Host.</p>
     * 
     */
    private final String host;
    /**
     * <p>Port.</p>
     * 
     */
    private final Double port;

    @OutputCustomType.Constructor({"database","host","port"})
    private DataSourceSqlServerParameters(
        String database,
        String host,
        Double port) {
        this.database = Objects.requireNonNull(database);
        this.host = Objects.requireNonNull(host);
        this.port = Objects.requireNonNull(port);
    }

    /**
     * <p>Database.</p>
     * 
     */
    public String getDatabase() {
        return this.database;
    }
    /**
     * <p>Host.</p>
     * 
     */
    public String getHost() {
        return this.host;
    }
    /**
     * <p>Port.</p>
     * 
     */
    public Double getPort() {
        return this.port;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(DataSourceSqlServerParameters defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String database;
        private String host;
        private Double port;

        public Builder() {
    	      // Empty
        }

        public Builder(DataSourceSqlServerParameters defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.database = defaults.database;
    	      this.host = defaults.host;
    	      this.port = defaults.port;
        }

        public Builder setDatabase(String database) {
            this.database = Objects.requireNonNull(database);
            return this;
        }

        public Builder setHost(String host) {
            this.host = Objects.requireNonNull(host);
            return this;
        }

        public Builder setPort(Double port) {
            this.port = Objects.requireNonNull(port);
            return this;
        }

        public DataSourceSqlServerParameters build() {
            return new DataSourceSqlServerParameters(database, host, port);
        }
    }
}
