// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.s3.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class BucketCorsRule {
    /**
     * Specifies which headers are allowed.
     * 
     */
    private final @Nullable List<String> allowedHeaders;
    /**
     * Specifies which methods are allowed. Can be `GET`, `PUT`, `POST`, `DELETE` or `HEAD`.
     * 
     */
    private final List<String> allowedMethods;
    /**
     * Specifies which origins are allowed.
     * 
     */
    private final List<String> allowedOrigins;
    /**
     * Specifies expose header in the response.
     * 
     */
    private final @Nullable List<String> exposeHeaders;
    /**
     * Specifies time in seconds that browser can cache the response for a preflight request.
     * 
     */
    private final @Nullable Integer maxAgeSeconds;

    @OutputCustomType.Constructor({"allowedHeaders","allowedMethods","allowedOrigins","exposeHeaders","maxAgeSeconds"})
    private BucketCorsRule(
        @Nullable List<String> allowedHeaders,
        List<String> allowedMethods,
        List<String> allowedOrigins,
        @Nullable List<String> exposeHeaders,
        @Nullable Integer maxAgeSeconds) {
        this.allowedHeaders = allowedHeaders;
        this.allowedMethods = Objects.requireNonNull(allowedMethods);
        this.allowedOrigins = Objects.requireNonNull(allowedOrigins);
        this.exposeHeaders = exposeHeaders;
        this.maxAgeSeconds = maxAgeSeconds;
    }

    /**
     * Specifies which headers are allowed.
     * 
    */
    public List<String> getAllowedHeaders() {
        return this.allowedHeaders == null ? List.of() : this.allowedHeaders;
    }
    /**
     * Specifies which methods are allowed. Can be `GET`, `PUT`, `POST`, `DELETE` or `HEAD`.
     * 
    */
    public List<String> getAllowedMethods() {
        return this.allowedMethods;
    }
    /**
     * Specifies which origins are allowed.
     * 
    */
    public List<String> getAllowedOrigins() {
        return this.allowedOrigins;
    }
    /**
     * Specifies expose header in the response.
     * 
    */
    public List<String> getExposeHeaders() {
        return this.exposeHeaders == null ? List.of() : this.exposeHeaders;
    }
    /**
     * Specifies time in seconds that browser can cache the response for a preflight request.
     * 
    */
    public Optional<Integer> getMaxAgeSeconds() {
        return Optional.ofNullable(this.maxAgeSeconds);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(BucketCorsRule defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable List<String> allowedHeaders;
        private List<String> allowedMethods;
        private List<String> allowedOrigins;
        private @Nullable List<String> exposeHeaders;
        private @Nullable Integer maxAgeSeconds;

        public Builder() {
    	      // Empty
        }

        public Builder(BucketCorsRule defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.allowedHeaders = defaults.allowedHeaders;
    	      this.allowedMethods = defaults.allowedMethods;
    	      this.allowedOrigins = defaults.allowedOrigins;
    	      this.exposeHeaders = defaults.exposeHeaders;
    	      this.maxAgeSeconds = defaults.maxAgeSeconds;
        }

        public Builder setAllowedHeaders(@Nullable List<String> allowedHeaders) {
            this.allowedHeaders = allowedHeaders;
            return this;
        }

        public Builder setAllowedMethods(List<String> allowedMethods) {
            this.allowedMethods = Objects.requireNonNull(allowedMethods);
            return this;
        }

        public Builder setAllowedOrigins(List<String> allowedOrigins) {
            this.allowedOrigins = Objects.requireNonNull(allowedOrigins);
            return this;
        }

        public Builder setExposeHeaders(@Nullable List<String> exposeHeaders) {
            this.exposeHeaders = exposeHeaders;
            return this;
        }

        public Builder setMaxAgeSeconds(@Nullable Integer maxAgeSeconds) {
            this.maxAgeSeconds = maxAgeSeconds;
            return this;
        }
        public BucketCorsRule build() {
            return new BucketCorsRule(allowedHeaders, allowedMethods, allowedOrigins, exposeHeaders, maxAgeSeconds);
        }
    }
}
