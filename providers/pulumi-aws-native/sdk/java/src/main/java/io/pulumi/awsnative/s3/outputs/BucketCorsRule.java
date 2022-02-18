// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.s3.outputs;

import io.pulumi.awsnative.s3.enums.BucketCorsRuleAllowedMethodsItem;
import io.pulumi.core.internal.annotations.OutputCustomType;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class BucketCorsRule {
    /**
     * Headers that are specified in the Access-Control-Request-Headers header.
     * 
     */
    private final @Nullable List<String> allowedHeaders;
    /**
     * An HTTP method that you allow the origin to execute.
     * 
     */
    private final List<BucketCorsRuleAllowedMethodsItem> allowedMethods;
    /**
     * One or more origins you want customers to be able to access the bucket from.
     * 
     */
    private final List<String> allowedOrigins;
    /**
     * One or more headers in the response that you want customers to be able to access from their applications (for example, from a JavaScript XMLHttpRequest object).
     * 
     */
    private final @Nullable List<String> exposedHeaders;
    /**
     * A unique identifier for this rule.
     * 
     */
    private final @Nullable String id;
    /**
     * The time in seconds that your browser is to cache the preflight response for the specified resource.
     * 
     */
    private final @Nullable Integer maxAge;

    @OutputCustomType.Constructor({"allowedHeaders","allowedMethods","allowedOrigins","exposedHeaders","id","maxAge"})
    private BucketCorsRule(
        @Nullable List<String> allowedHeaders,
        List<BucketCorsRuleAllowedMethodsItem> allowedMethods,
        List<String> allowedOrigins,
        @Nullable List<String> exposedHeaders,
        @Nullable String id,
        @Nullable Integer maxAge) {
        this.allowedHeaders = allowedHeaders;
        this.allowedMethods = Objects.requireNonNull(allowedMethods);
        this.allowedOrigins = Objects.requireNonNull(allowedOrigins);
        this.exposedHeaders = exposedHeaders;
        this.id = id;
        this.maxAge = maxAge;
    }

    /**
     * Headers that are specified in the Access-Control-Request-Headers header.
     * 
     */
    public List<String> getAllowedHeaders() {
        return this.allowedHeaders == null ? List.of() : this.allowedHeaders;
    }
    /**
     * An HTTP method that you allow the origin to execute.
     * 
     */
    public List<BucketCorsRuleAllowedMethodsItem> getAllowedMethods() {
        return this.allowedMethods;
    }
    /**
     * One or more origins you want customers to be able to access the bucket from.
     * 
     */
    public List<String> getAllowedOrigins() {
        return this.allowedOrigins;
    }
    /**
     * One or more headers in the response that you want customers to be able to access from their applications (for example, from a JavaScript XMLHttpRequest object).
     * 
     */
    public List<String> getExposedHeaders() {
        return this.exposedHeaders == null ? List.of() : this.exposedHeaders;
    }
    /**
     * A unique identifier for this rule.
     * 
     */
    public Optional<String> getId() {
        return Optional.ofNullable(this.id);
    }
    /**
     * The time in seconds that your browser is to cache the preflight response for the specified resource.
     * 
     */
    public Optional<Integer> getMaxAge() {
        return Optional.ofNullable(this.maxAge);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(BucketCorsRule defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable List<String> allowedHeaders;
        private List<BucketCorsRuleAllowedMethodsItem> allowedMethods;
        private List<String> allowedOrigins;
        private @Nullable List<String> exposedHeaders;
        private @Nullable String id;
        private @Nullable Integer maxAge;

        public Builder() {
    	      // Empty
        }

        public Builder(BucketCorsRule defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.allowedHeaders = defaults.allowedHeaders;
    	      this.allowedMethods = defaults.allowedMethods;
    	      this.allowedOrigins = defaults.allowedOrigins;
    	      this.exposedHeaders = defaults.exposedHeaders;
    	      this.id = defaults.id;
    	      this.maxAge = defaults.maxAge;
        }

        public Builder setAllowedHeaders(@Nullable List<String> allowedHeaders) {
            this.allowedHeaders = allowedHeaders;
            return this;
        }

        public Builder setAllowedMethods(List<BucketCorsRuleAllowedMethodsItem> allowedMethods) {
            this.allowedMethods = Objects.requireNonNull(allowedMethods);
            return this;
        }

        public Builder setAllowedOrigins(List<String> allowedOrigins) {
            this.allowedOrigins = Objects.requireNonNull(allowedOrigins);
            return this;
        }

        public Builder setExposedHeaders(@Nullable List<String> exposedHeaders) {
            this.exposedHeaders = exposedHeaders;
            return this;
        }

        public Builder setId(@Nullable String id) {
            this.id = id;
            return this;
        }

        public Builder setMaxAge(@Nullable Integer maxAge) {
            this.maxAge = maxAge;
            return this;
        }

        public BucketCorsRule build() {
            return new BucketCorsRule(allowedHeaders, allowedMethods, allowedOrigins, exposedHeaders, id, maxAge);
        }
    }
}
