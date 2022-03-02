// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.quicksight.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import java.lang.Double;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class DataSourceRedshiftParameters {
    /**
     * <p>Cluster ID. This field can be blank if the <code>Host</code> and <code>Port</code> are
     *             provided.</p>
     * 
     */
    private final @Nullable String clusterId;
    /**
     * <p>Database.</p>
     * 
     */
    private final String database;
    /**
     * <p>Host. This field can be blank if <code>ClusterId</code> is provided.</p>
     * 
     */
    private final @Nullable String host;
    /**
     * <p>Port. This field can be blank if the <code>ClusterId</code> is provided.</p>
     * 
     */
    private final @Nullable Double port;

    @OutputCustomType.Constructor({"clusterId","database","host","port"})
    private DataSourceRedshiftParameters(
        @Nullable String clusterId,
        String database,
        @Nullable String host,
        @Nullable Double port) {
        this.clusterId = clusterId;
        this.database = Objects.requireNonNull(database);
        this.host = host;
        this.port = port;
    }

    /**
     * <p>Cluster ID. This field can be blank if the <code>Host</code> and <code>Port</code> are
     *             provided.</p>
     * 
    */
    public Optional<String> getClusterId() {
        return Optional.ofNullable(this.clusterId);
    }
    /**
     * <p>Database.</p>
     * 
    */
    public String getDatabase() {
        return this.database;
    }
    /**
     * <p>Host. This field can be blank if <code>ClusterId</code> is provided.</p>
     * 
    */
    public Optional<String> getHost() {
        return Optional.ofNullable(this.host);
    }
    /**
     * <p>Port. This field can be blank if the <code>ClusterId</code> is provided.</p>
     * 
    */
    public Optional<Double> getPort() {
        return Optional.ofNullable(this.port);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(DataSourceRedshiftParameters defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String clusterId;
        private String database;
        private @Nullable String host;
        private @Nullable Double port;

        public Builder() {
    	      // Empty
        }

        public Builder(DataSourceRedshiftParameters defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.clusterId = defaults.clusterId;
    	      this.database = defaults.database;
    	      this.host = defaults.host;
    	      this.port = defaults.port;
        }

        public Builder setClusterId(@Nullable String clusterId) {
            this.clusterId = clusterId;
            return this;
        }

        public Builder setDatabase(String database) {
            this.database = Objects.requireNonNull(database);
            return this;
        }

        public Builder setHost(@Nullable String host) {
            this.host = host;
            return this;
        }

        public Builder setPort(@Nullable Double port) {
            this.port = port;
            return this;
        }
        public DataSourceRedshiftParameters build() {
            return new DataSourceRedshiftParameters(clusterId, database, host, port);
        }
    }
}
