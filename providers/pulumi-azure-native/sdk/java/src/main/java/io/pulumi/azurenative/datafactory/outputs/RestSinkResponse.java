// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.datafactory.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import java.lang.Object;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class RestSinkResponse {
    /**
     * The additional HTTP headers in the request to the RESTful API. Type: string (or Expression with resultType string).
     * 
     */
    private final @Nullable Object additionalHeaders;
    /**
     * If true, disable data store metrics collection. Default is false. Type: boolean (or Expression with resultType boolean).
     * 
     */
    private final @Nullable Object disableMetricsCollection;
    /**
     * Http Compression Type to Send data in compressed format with Optimal Compression Level, Default is None. And The Only Supported option is Gzip.
     * 
     */
    private final @Nullable Object httpCompressionType;
    /**
     * The timeout (TimeSpan) to get an HTTP response. It is the timeout to get a response, not the timeout to read response data. Default value: 00:01:40. Type: string (or Expression with resultType string), pattern: ((\d+)\.)?(\d\d):(60|([0-5][0-9])):(60|([0-5][0-9])).
     * 
     */
    private final @Nullable Object httpRequestTimeout;
    /**
     * The maximum concurrent connection count for the sink data store. Type: integer (or Expression with resultType integer).
     * 
     */
    private final @Nullable Object maxConcurrentConnections;
    /**
     * The time to await before sending next request, in milliseconds
     * 
     */
    private final @Nullable Object requestInterval;
    /**
     * The HTTP method used to call the RESTful API. The default is POST. Type: string (or Expression with resultType string).
     * 
     */
    private final @Nullable Object requestMethod;
    /**
     * Sink retry count. Type: integer (or Expression with resultType integer).
     * 
     */
    private final @Nullable Object sinkRetryCount;
    /**
     * Sink retry wait. Type: string (or Expression with resultType string), pattern: ((\d+)\.)?(\d\d):(60|([0-5][0-9])):(60|([0-5][0-9])).
     * 
     */
    private final @Nullable Object sinkRetryWait;
    /**
     * Copy sink type.
     * Expected value is 'RestSink'.
     * 
     */
    private final String type;
    /**
     * Write batch size. Type: integer (or Expression with resultType integer), minimum: 0.
     * 
     */
    private final @Nullable Object writeBatchSize;
    /**
     * Write batch timeout. Type: string (or Expression with resultType string), pattern: ((\d+)\.)?(\d\d):(60|([0-5][0-9])):(60|([0-5][0-9])).
     * 
     */
    private final @Nullable Object writeBatchTimeout;

    @OutputCustomType.Constructor({"additionalHeaders","disableMetricsCollection","httpCompressionType","httpRequestTimeout","maxConcurrentConnections","requestInterval","requestMethod","sinkRetryCount","sinkRetryWait","type","writeBatchSize","writeBatchTimeout"})
    private RestSinkResponse(
        @Nullable Object additionalHeaders,
        @Nullable Object disableMetricsCollection,
        @Nullable Object httpCompressionType,
        @Nullable Object httpRequestTimeout,
        @Nullable Object maxConcurrentConnections,
        @Nullable Object requestInterval,
        @Nullable Object requestMethod,
        @Nullable Object sinkRetryCount,
        @Nullable Object sinkRetryWait,
        String type,
        @Nullable Object writeBatchSize,
        @Nullable Object writeBatchTimeout) {
        this.additionalHeaders = additionalHeaders;
        this.disableMetricsCollection = disableMetricsCollection;
        this.httpCompressionType = httpCompressionType;
        this.httpRequestTimeout = httpRequestTimeout;
        this.maxConcurrentConnections = maxConcurrentConnections;
        this.requestInterval = requestInterval;
        this.requestMethod = requestMethod;
        this.sinkRetryCount = sinkRetryCount;
        this.sinkRetryWait = sinkRetryWait;
        this.type = Objects.requireNonNull(type);
        this.writeBatchSize = writeBatchSize;
        this.writeBatchTimeout = writeBatchTimeout;
    }

    /**
     * The additional HTTP headers in the request to the RESTful API. Type: string (or Expression with resultType string).
     * 
    */
    public Optional<Object> getAdditionalHeaders() {
        return Optional.ofNullable(this.additionalHeaders);
    }
    /**
     * If true, disable data store metrics collection. Default is false. Type: boolean (or Expression with resultType boolean).
     * 
    */
    public Optional<Object> getDisableMetricsCollection() {
        return Optional.ofNullable(this.disableMetricsCollection);
    }
    /**
     * Http Compression Type to Send data in compressed format with Optimal Compression Level, Default is None. And The Only Supported option is Gzip.
     * 
    */
    public Optional<Object> getHttpCompressionType() {
        return Optional.ofNullable(this.httpCompressionType);
    }
    /**
     * The timeout (TimeSpan) to get an HTTP response. It is the timeout to get a response, not the timeout to read response data. Default value: 00:01:40. Type: string (or Expression with resultType string), pattern: ((\d+)\.)?(\d\d):(60|([0-5][0-9])):(60|([0-5][0-9])).
     * 
    */
    public Optional<Object> getHttpRequestTimeout() {
        return Optional.ofNullable(this.httpRequestTimeout);
    }
    /**
     * The maximum concurrent connection count for the sink data store. Type: integer (or Expression with resultType integer).
     * 
    */
    public Optional<Object> getMaxConcurrentConnections() {
        return Optional.ofNullable(this.maxConcurrentConnections);
    }
    /**
     * The time to await before sending next request, in milliseconds
     * 
    */
    public Optional<Object> getRequestInterval() {
        return Optional.ofNullable(this.requestInterval);
    }
    /**
     * The HTTP method used to call the RESTful API. The default is POST. Type: string (or Expression with resultType string).
     * 
    */
    public Optional<Object> getRequestMethod() {
        return Optional.ofNullable(this.requestMethod);
    }
    /**
     * Sink retry count. Type: integer (or Expression with resultType integer).
     * 
    */
    public Optional<Object> getSinkRetryCount() {
        return Optional.ofNullable(this.sinkRetryCount);
    }
    /**
     * Sink retry wait. Type: string (or Expression with resultType string), pattern: ((\d+)\.)?(\d\d):(60|([0-5][0-9])):(60|([0-5][0-9])).
     * 
    */
    public Optional<Object> getSinkRetryWait() {
        return Optional.ofNullable(this.sinkRetryWait);
    }
    /**
     * Copy sink type.
     * Expected value is 'RestSink'.
     * 
    */
    public String getType() {
        return this.type;
    }
    /**
     * Write batch size. Type: integer (or Expression with resultType integer), minimum: 0.
     * 
    */
    public Optional<Object> getWriteBatchSize() {
        return Optional.ofNullable(this.writeBatchSize);
    }
    /**
     * Write batch timeout. Type: string (or Expression with resultType string), pattern: ((\d+)\.)?(\d\d):(60|([0-5][0-9])):(60|([0-5][0-9])).
     * 
    */
    public Optional<Object> getWriteBatchTimeout() {
        return Optional.ofNullable(this.writeBatchTimeout);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(RestSinkResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Object additionalHeaders;
        private @Nullable Object disableMetricsCollection;
        private @Nullable Object httpCompressionType;
        private @Nullable Object httpRequestTimeout;
        private @Nullable Object maxConcurrentConnections;
        private @Nullable Object requestInterval;
        private @Nullable Object requestMethod;
        private @Nullable Object sinkRetryCount;
        private @Nullable Object sinkRetryWait;
        private String type;
        private @Nullable Object writeBatchSize;
        private @Nullable Object writeBatchTimeout;

        public Builder() {
    	      // Empty
        }

        public Builder(RestSinkResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.additionalHeaders = defaults.additionalHeaders;
    	      this.disableMetricsCollection = defaults.disableMetricsCollection;
    	      this.httpCompressionType = defaults.httpCompressionType;
    	      this.httpRequestTimeout = defaults.httpRequestTimeout;
    	      this.maxConcurrentConnections = defaults.maxConcurrentConnections;
    	      this.requestInterval = defaults.requestInterval;
    	      this.requestMethod = defaults.requestMethod;
    	      this.sinkRetryCount = defaults.sinkRetryCount;
    	      this.sinkRetryWait = defaults.sinkRetryWait;
    	      this.type = defaults.type;
    	      this.writeBatchSize = defaults.writeBatchSize;
    	      this.writeBatchTimeout = defaults.writeBatchTimeout;
        }

        public Builder setAdditionalHeaders(@Nullable Object additionalHeaders) {
            this.additionalHeaders = additionalHeaders;
            return this;
        }

        public Builder setDisableMetricsCollection(@Nullable Object disableMetricsCollection) {
            this.disableMetricsCollection = disableMetricsCollection;
            return this;
        }

        public Builder setHttpCompressionType(@Nullable Object httpCompressionType) {
            this.httpCompressionType = httpCompressionType;
            return this;
        }

        public Builder setHttpRequestTimeout(@Nullable Object httpRequestTimeout) {
            this.httpRequestTimeout = httpRequestTimeout;
            return this;
        }

        public Builder setMaxConcurrentConnections(@Nullable Object maxConcurrentConnections) {
            this.maxConcurrentConnections = maxConcurrentConnections;
            return this;
        }

        public Builder setRequestInterval(@Nullable Object requestInterval) {
            this.requestInterval = requestInterval;
            return this;
        }

        public Builder setRequestMethod(@Nullable Object requestMethod) {
            this.requestMethod = requestMethod;
            return this;
        }

        public Builder setSinkRetryCount(@Nullable Object sinkRetryCount) {
            this.sinkRetryCount = sinkRetryCount;
            return this;
        }

        public Builder setSinkRetryWait(@Nullable Object sinkRetryWait) {
            this.sinkRetryWait = sinkRetryWait;
            return this;
        }

        public Builder setType(String type) {
            this.type = Objects.requireNonNull(type);
            return this;
        }

        public Builder setWriteBatchSize(@Nullable Object writeBatchSize) {
            this.writeBatchSize = writeBatchSize;
            return this;
        }

        public Builder setWriteBatchTimeout(@Nullable Object writeBatchTimeout) {
            this.writeBatchTimeout = writeBatchTimeout;
            return this;
        }
        public RestSinkResponse build() {
            return new RestSinkResponse(additionalHeaders, disableMetricsCollection, httpCompressionType, httpRequestTimeout, maxConcurrentConnections, requestInterval, requestMethod, sinkRetryCount, sinkRetryWait, type, writeBatchSize, writeBatchTimeout);
        }
    }
}
