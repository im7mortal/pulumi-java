// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.rds.inputs;

import io.pulumi.core.internal.annotations.InputImport;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class DBProxyTargetGroupConnectionPoolConfigurationInfoFormat extends io.pulumi.resources.InvokeArgs {

    public static final DBProxyTargetGroupConnectionPoolConfigurationInfoFormat Empty = new DBProxyTargetGroupConnectionPoolConfigurationInfoFormat();

    /**
     * The number of seconds for a proxy to wait for a connection to become available in the connection pool.
     * 
     */
    @InputImport(name="connectionBorrowTimeout")
    private final @Nullable Integer connectionBorrowTimeout;

    public Optional<Integer> getConnectionBorrowTimeout() {
        return this.connectionBorrowTimeout == null ? Optional.empty() : Optional.ofNullable(this.connectionBorrowTimeout);
    }

    /**
     * One or more SQL statements for the proxy to run when opening each new database connection.
     * 
     */
    @InputImport(name="initQuery")
    private final @Nullable String initQuery;

    public Optional<String> getInitQuery() {
        return this.initQuery == null ? Optional.empty() : Optional.ofNullable(this.initQuery);
    }

    /**
     * The maximum size of the connection pool for each target in a target group.
     * 
     */
    @InputImport(name="maxConnectionsPercent")
    private final @Nullable Integer maxConnectionsPercent;

    public Optional<Integer> getMaxConnectionsPercent() {
        return this.maxConnectionsPercent == null ? Optional.empty() : Optional.ofNullable(this.maxConnectionsPercent);
    }

    /**
     * Controls how actively the proxy closes idle database connections in the connection pool.
     * 
     */
    @InputImport(name="maxIdleConnectionsPercent")
    private final @Nullable Integer maxIdleConnectionsPercent;

    public Optional<Integer> getMaxIdleConnectionsPercent() {
        return this.maxIdleConnectionsPercent == null ? Optional.empty() : Optional.ofNullable(this.maxIdleConnectionsPercent);
    }

    /**
     * Each item in the list represents a class of SQL operations that normally cause all later statements in a session using a proxy to be pinned to the same underlying database connection.
     * 
     */
    @InputImport(name="sessionPinningFilters")
    private final @Nullable List<String> sessionPinningFilters;

    public List<String> getSessionPinningFilters() {
        return this.sessionPinningFilters == null ? List.of() : this.sessionPinningFilters;
    }

    public DBProxyTargetGroupConnectionPoolConfigurationInfoFormat(
        @Nullable Integer connectionBorrowTimeout,
        @Nullable String initQuery,
        @Nullable Integer maxConnectionsPercent,
        @Nullable Integer maxIdleConnectionsPercent,
        @Nullable List<String> sessionPinningFilters) {
        this.connectionBorrowTimeout = connectionBorrowTimeout;
        this.initQuery = initQuery;
        this.maxConnectionsPercent = maxConnectionsPercent;
        this.maxIdleConnectionsPercent = maxIdleConnectionsPercent;
        this.sessionPinningFilters = sessionPinningFilters;
    }

    private DBProxyTargetGroupConnectionPoolConfigurationInfoFormat() {
        this.connectionBorrowTimeout = null;
        this.initQuery = null;
        this.maxConnectionsPercent = null;
        this.maxIdleConnectionsPercent = null;
        this.sessionPinningFilters = List.of();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(DBProxyTargetGroupConnectionPoolConfigurationInfoFormat defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Integer connectionBorrowTimeout;
        private @Nullable String initQuery;
        private @Nullable Integer maxConnectionsPercent;
        private @Nullable Integer maxIdleConnectionsPercent;
        private @Nullable List<String> sessionPinningFilters;

        public Builder() {
    	      // Empty
        }

        public Builder(DBProxyTargetGroupConnectionPoolConfigurationInfoFormat defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.connectionBorrowTimeout = defaults.connectionBorrowTimeout;
    	      this.initQuery = defaults.initQuery;
    	      this.maxConnectionsPercent = defaults.maxConnectionsPercent;
    	      this.maxIdleConnectionsPercent = defaults.maxIdleConnectionsPercent;
    	      this.sessionPinningFilters = defaults.sessionPinningFilters;
        }

        public Builder setConnectionBorrowTimeout(@Nullable Integer connectionBorrowTimeout) {
            this.connectionBorrowTimeout = connectionBorrowTimeout;
            return this;
        }

        public Builder setInitQuery(@Nullable String initQuery) {
            this.initQuery = initQuery;
            return this;
        }

        public Builder setMaxConnectionsPercent(@Nullable Integer maxConnectionsPercent) {
            this.maxConnectionsPercent = maxConnectionsPercent;
            return this;
        }

        public Builder setMaxIdleConnectionsPercent(@Nullable Integer maxIdleConnectionsPercent) {
            this.maxIdleConnectionsPercent = maxIdleConnectionsPercent;
            return this;
        }

        public Builder setSessionPinningFilters(@Nullable List<String> sessionPinningFilters) {
            this.sessionPinningFilters = sessionPinningFilters;
            return this;
        }

        public DBProxyTargetGroupConnectionPoolConfigurationInfoFormat build() {
            return new DBProxyTargetGroupConnectionPoolConfigurationInfoFormat(connectionBorrowTimeout, initQuery, maxConnectionsPercent, maxIdleConnectionsPercent, sessionPinningFilters);
        }
    }
}
