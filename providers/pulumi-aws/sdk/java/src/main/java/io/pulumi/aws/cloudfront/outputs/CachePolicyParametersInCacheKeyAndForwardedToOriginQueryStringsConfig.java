// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.cloudfront.outputs;

import io.pulumi.aws.cloudfront.outputs.CachePolicyParametersInCacheKeyAndForwardedToOriginQueryStringsConfigQueryStrings;
import io.pulumi.core.annotations.OutputCustomType;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class CachePolicyParametersInCacheKeyAndForwardedToOriginQueryStringsConfig {
    /**
     * Determines whether any URL query strings in viewer requests are included in the cache key and automatically included in requests that CloudFront sends to the origin. Valid values are `none`, `whitelist`, `allExcept`, `all`.
     * 
     */
    private final String queryStringBehavior;
    /**
     * Object that contains a list of query string names. See Items for more information.
     * 
     */
    private final @Nullable CachePolicyParametersInCacheKeyAndForwardedToOriginQueryStringsConfigQueryStrings queryStrings;

    @OutputCustomType.Constructor({"queryStringBehavior","queryStrings"})
    private CachePolicyParametersInCacheKeyAndForwardedToOriginQueryStringsConfig(
        String queryStringBehavior,
        @Nullable CachePolicyParametersInCacheKeyAndForwardedToOriginQueryStringsConfigQueryStrings queryStrings) {
        this.queryStringBehavior = Objects.requireNonNull(queryStringBehavior);
        this.queryStrings = queryStrings;
    }

    /**
     * Determines whether any URL query strings in viewer requests are included in the cache key and automatically included in requests that CloudFront sends to the origin. Valid values are `none`, `whitelist`, `allExcept`, `all`.
     * 
    */
    public String getQueryStringBehavior() {
        return this.queryStringBehavior;
    }
    /**
     * Object that contains a list of query string names. See Items for more information.
     * 
    */
    public Optional<CachePolicyParametersInCacheKeyAndForwardedToOriginQueryStringsConfigQueryStrings> getQueryStrings() {
        return Optional.ofNullable(this.queryStrings);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(CachePolicyParametersInCacheKeyAndForwardedToOriginQueryStringsConfig defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String queryStringBehavior;
        private @Nullable CachePolicyParametersInCacheKeyAndForwardedToOriginQueryStringsConfigQueryStrings queryStrings;

        public Builder() {
    	      // Empty
        }

        public Builder(CachePolicyParametersInCacheKeyAndForwardedToOriginQueryStringsConfig defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.queryStringBehavior = defaults.queryStringBehavior;
    	      this.queryStrings = defaults.queryStrings;
        }

        public Builder setQueryStringBehavior(String queryStringBehavior) {
            this.queryStringBehavior = Objects.requireNonNull(queryStringBehavior);
            return this;
        }

        public Builder setQueryStrings(@Nullable CachePolicyParametersInCacheKeyAndForwardedToOriginQueryStringsConfigQueryStrings queryStrings) {
            this.queryStrings = queryStrings;
            return this;
        }
        public CachePolicyParametersInCacheKeyAndForwardedToOriginQueryStringsConfig build() {
            return new CachePolicyParametersInCacheKeyAndForwardedToOriginQueryStringsConfig(queryStringBehavior, queryStrings);
        }
    }
}
