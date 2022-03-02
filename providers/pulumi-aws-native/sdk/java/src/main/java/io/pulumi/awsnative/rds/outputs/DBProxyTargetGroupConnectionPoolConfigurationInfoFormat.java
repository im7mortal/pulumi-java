// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.rds.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class DBProxyTargetGroupConnectionPoolConfigurationInfoFormat {
    /**
     * The number of seconds for a proxy to wait for a connection to become available in the connection pool.
     * 
     */
    private final @Nullable Integer connectionBorrowTimeout;
    /**
     * One or more SQL statements for the proxy to run when opening each new database connection.
     * 
     */
    private final @Nullable String initQuery;
    /**
     * The maximum size of the connection pool for each target in a target group.
     * 
     */
    private final @Nullable Integer maxConnectionsPercent;
    /**
     * Controls how actively the proxy closes idle database connections in the connection pool.
     * 
     */
    private final @Nullable Integer maxIdleConnectionsPercent;
    /**
     * Each item in the list represents a class of SQL operations that normally cause all later statements in a session using a proxy to be pinned to the same underlying database connection.
     * 
     */
    private final @Nullable List<String> sessionPinningFilters;

    @OutputCustomType.Constructor({"connectionBorrowTimeout","initQuery","maxConnectionsPercent","maxIdleConnectionsPercent","sessionPinningFilters"})
    private DBProxyTargetGroupConnectionPoolConfigurationInfoFormat(
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

    /**
     * The number of seconds for a proxy to wait for a connection to become available in the connection pool.
     * 
    */
    public Optional<Integer> getConnectionBorrowTimeout() {
        return Optional.ofNullable(this.connectionBorrowTimeout);
    }
    /**
     * One or more SQL statements for the proxy to run when opening each new database connection.
     * 
    */
    public Optional<String> getInitQuery() {
        return Optional.ofNullable(this.initQuery);
    }
    /**
     * The maximum size of the connection pool for each target in a target group.
     * 
    */
    public Optional<Integer> getMaxConnectionsPercent() {
        return Optional.ofNullable(this.maxConnectionsPercent);
    }
    /**
     * Controls how actively the proxy closes idle database connections in the connection pool.
     * 
    */
    public Optional<Integer> getMaxIdleConnectionsPercent() {
        return Optional.ofNullable(this.maxIdleConnectionsPercent);
    }
    /**
     * Each item in the list represents a class of SQL operations that normally cause all later statements in a session using a proxy to be pinned to the same underlying database connection.
     * 
    */
    public List<String> getSessionPinningFilters() {
        return this.sessionPinningFilters == null ? List.of() : this.sessionPinningFilters;
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
