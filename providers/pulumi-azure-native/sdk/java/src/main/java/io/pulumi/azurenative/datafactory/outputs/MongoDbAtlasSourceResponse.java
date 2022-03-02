// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.datafactory.outputs;

import io.pulumi.azurenative.datafactory.outputs.MongoDbCursorMethodsPropertiesResponse;
import io.pulumi.core.annotations.OutputCustomType;
import java.lang.Object;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class MongoDbAtlasSourceResponse {
    /**
     * Specifies the additional columns to be added to source data. Type: array of objects(AdditionalColumns) (or Expression with resultType array of objects).
     * 
     */
    private final @Nullable Object additionalColumns;
    /**
     * Specifies the number of documents to return in each batch of the response from MongoDB Atlas instance. In most cases, modifying the batch size will not affect the user or the application. This property's main purpose is to avoid hit the limitation of response size. Type: integer (or Expression with resultType integer).
     * 
     */
    private final @Nullable Object batchSize;
    /**
     * Cursor methods for Mongodb query
     * 
     */
    private final @Nullable MongoDbCursorMethodsPropertiesResponse cursorMethods;
    /**
     * If true, disable data store metrics collection. Default is false. Type: boolean (or Expression with resultType boolean).
     * 
     */
    private final @Nullable Object disableMetricsCollection;
    /**
     * Specifies selection filter using query operators. To return all documents in a collection, omit this parameter or pass an empty document ({}). Type: string (or Expression with resultType string).
     * 
     */
    private final @Nullable Object filter;
    /**
     * The maximum concurrent connection count for the source data store. Type: integer (or Expression with resultType integer).
     * 
     */
    private final @Nullable Object maxConcurrentConnections;
    /**
     * Query timeout. Type: string (or Expression with resultType string), pattern: ((\d+)\.)?(\d\d):(60|([0-5][0-9])):(60|([0-5][0-9])).
     * 
     */
    private final @Nullable Object queryTimeout;
    /**
     * Source retry count. Type: integer (or Expression with resultType integer).
     * 
     */
    private final @Nullable Object sourceRetryCount;
    /**
     * Source retry wait. Type: string (or Expression with resultType string), pattern: ((\d+)\.)?(\d\d):(60|([0-5][0-9])):(60|([0-5][0-9])).
     * 
     */
    private final @Nullable Object sourceRetryWait;
    /**
     * Copy source type.
     * Expected value is 'MongoDbAtlasSource'.
     * 
     */
    private final String type;

    @OutputCustomType.Constructor({"additionalColumns","batchSize","cursorMethods","disableMetricsCollection","filter","maxConcurrentConnections","queryTimeout","sourceRetryCount","sourceRetryWait","type"})
    private MongoDbAtlasSourceResponse(
        @Nullable Object additionalColumns,
        @Nullable Object batchSize,
        @Nullable MongoDbCursorMethodsPropertiesResponse cursorMethods,
        @Nullable Object disableMetricsCollection,
        @Nullable Object filter,
        @Nullable Object maxConcurrentConnections,
        @Nullable Object queryTimeout,
        @Nullable Object sourceRetryCount,
        @Nullable Object sourceRetryWait,
        String type) {
        this.additionalColumns = additionalColumns;
        this.batchSize = batchSize;
        this.cursorMethods = cursorMethods;
        this.disableMetricsCollection = disableMetricsCollection;
        this.filter = filter;
        this.maxConcurrentConnections = maxConcurrentConnections;
        this.queryTimeout = queryTimeout;
        this.sourceRetryCount = sourceRetryCount;
        this.sourceRetryWait = sourceRetryWait;
        this.type = Objects.requireNonNull(type);
    }

    /**
     * Specifies the additional columns to be added to source data. Type: array of objects(AdditionalColumns) (or Expression with resultType array of objects).
     * 
    */
    public Optional<Object> getAdditionalColumns() {
        return Optional.ofNullable(this.additionalColumns);
    }
    /**
     * Specifies the number of documents to return in each batch of the response from MongoDB Atlas instance. In most cases, modifying the batch size will not affect the user or the application. This property's main purpose is to avoid hit the limitation of response size. Type: integer (or Expression with resultType integer).
     * 
    */
    public Optional<Object> getBatchSize() {
        return Optional.ofNullable(this.batchSize);
    }
    /**
     * Cursor methods for Mongodb query
     * 
    */
    public Optional<MongoDbCursorMethodsPropertiesResponse> getCursorMethods() {
        return Optional.ofNullable(this.cursorMethods);
    }
    /**
     * If true, disable data store metrics collection. Default is false. Type: boolean (or Expression with resultType boolean).
     * 
    */
    public Optional<Object> getDisableMetricsCollection() {
        return Optional.ofNullable(this.disableMetricsCollection);
    }
    /**
     * Specifies selection filter using query operators. To return all documents in a collection, omit this parameter or pass an empty document ({}). Type: string (or Expression with resultType string).
     * 
    */
    public Optional<Object> getFilter() {
        return Optional.ofNullable(this.filter);
    }
    /**
     * The maximum concurrent connection count for the source data store. Type: integer (or Expression with resultType integer).
     * 
    */
    public Optional<Object> getMaxConcurrentConnections() {
        return Optional.ofNullable(this.maxConcurrentConnections);
    }
    /**
     * Query timeout. Type: string (or Expression with resultType string), pattern: ((\d+)\.)?(\d\d):(60|([0-5][0-9])):(60|([0-5][0-9])).
     * 
    */
    public Optional<Object> getQueryTimeout() {
        return Optional.ofNullable(this.queryTimeout);
    }
    /**
     * Source retry count. Type: integer (or Expression with resultType integer).
     * 
    */
    public Optional<Object> getSourceRetryCount() {
        return Optional.ofNullable(this.sourceRetryCount);
    }
    /**
     * Source retry wait. Type: string (or Expression with resultType string), pattern: ((\d+)\.)?(\d\d):(60|([0-5][0-9])):(60|([0-5][0-9])).
     * 
    */
    public Optional<Object> getSourceRetryWait() {
        return Optional.ofNullable(this.sourceRetryWait);
    }
    /**
     * Copy source type.
     * Expected value is 'MongoDbAtlasSource'.
     * 
    */
    public String getType() {
        return this.type;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(MongoDbAtlasSourceResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Object additionalColumns;
        private @Nullable Object batchSize;
        private @Nullable MongoDbCursorMethodsPropertiesResponse cursorMethods;
        private @Nullable Object disableMetricsCollection;
        private @Nullable Object filter;
        private @Nullable Object maxConcurrentConnections;
        private @Nullable Object queryTimeout;
        private @Nullable Object sourceRetryCount;
        private @Nullable Object sourceRetryWait;
        private String type;

        public Builder() {
    	      // Empty
        }

        public Builder(MongoDbAtlasSourceResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.additionalColumns = defaults.additionalColumns;
    	      this.batchSize = defaults.batchSize;
    	      this.cursorMethods = defaults.cursorMethods;
    	      this.disableMetricsCollection = defaults.disableMetricsCollection;
    	      this.filter = defaults.filter;
    	      this.maxConcurrentConnections = defaults.maxConcurrentConnections;
    	      this.queryTimeout = defaults.queryTimeout;
    	      this.sourceRetryCount = defaults.sourceRetryCount;
    	      this.sourceRetryWait = defaults.sourceRetryWait;
    	      this.type = defaults.type;
        }

        public Builder setAdditionalColumns(@Nullable Object additionalColumns) {
            this.additionalColumns = additionalColumns;
            return this;
        }

        public Builder setBatchSize(@Nullable Object batchSize) {
            this.batchSize = batchSize;
            return this;
        }

        public Builder setCursorMethods(@Nullable MongoDbCursorMethodsPropertiesResponse cursorMethods) {
            this.cursorMethods = cursorMethods;
            return this;
        }

        public Builder setDisableMetricsCollection(@Nullable Object disableMetricsCollection) {
            this.disableMetricsCollection = disableMetricsCollection;
            return this;
        }

        public Builder setFilter(@Nullable Object filter) {
            this.filter = filter;
            return this;
        }

        public Builder setMaxConcurrentConnections(@Nullable Object maxConcurrentConnections) {
            this.maxConcurrentConnections = maxConcurrentConnections;
            return this;
        }

        public Builder setQueryTimeout(@Nullable Object queryTimeout) {
            this.queryTimeout = queryTimeout;
            return this;
        }

        public Builder setSourceRetryCount(@Nullable Object sourceRetryCount) {
            this.sourceRetryCount = sourceRetryCount;
            return this;
        }

        public Builder setSourceRetryWait(@Nullable Object sourceRetryWait) {
            this.sourceRetryWait = sourceRetryWait;
            return this;
        }

        public Builder setType(String type) {
            this.type = Objects.requireNonNull(type);
            return this;
        }
        public MongoDbAtlasSourceResponse build() {
            return new MongoDbAtlasSourceResponse(additionalColumns, batchSize, cursorMethods, disableMetricsCollection, filter, maxConcurrentConnections, queryTimeout, sourceRetryCount, sourceRetryWait, type);
        }
    }
}
