// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.cloudfront.outputs;

import io.pulumi.aws.cloudfront.outputs.CachePolicyParametersInCacheKeyAndForwardedToOriginCookiesConfigCookies;
import io.pulumi.core.annotations.OutputCustomType;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class CachePolicyParametersInCacheKeyAndForwardedToOriginCookiesConfig {
    /**
     * Determines whether any cookies in viewer requests are included in the cache key and automatically included in requests that CloudFront sends to the origin. Valid values are `none`, `whitelist`, `allExcept`, `all`.
     * 
     */
    private final String cookieBehavior;
    /**
     * Object that contains a list of cookie names. See Items for more information.
     * 
     */
    private final @Nullable CachePolicyParametersInCacheKeyAndForwardedToOriginCookiesConfigCookies cookies;

    @OutputCustomType.Constructor({"cookieBehavior","cookies"})
    private CachePolicyParametersInCacheKeyAndForwardedToOriginCookiesConfig(
        String cookieBehavior,
        @Nullable CachePolicyParametersInCacheKeyAndForwardedToOriginCookiesConfigCookies cookies) {
        this.cookieBehavior = Objects.requireNonNull(cookieBehavior);
        this.cookies = cookies;
    }

    /**
     * Determines whether any cookies in viewer requests are included in the cache key and automatically included in requests that CloudFront sends to the origin. Valid values are `none`, `whitelist`, `allExcept`, `all`.
     * 
    */
    public String getCookieBehavior() {
        return this.cookieBehavior;
    }
    /**
     * Object that contains a list of cookie names. See Items for more information.
     * 
    */
    public Optional<CachePolicyParametersInCacheKeyAndForwardedToOriginCookiesConfigCookies> getCookies() {
        return Optional.ofNullable(this.cookies);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(CachePolicyParametersInCacheKeyAndForwardedToOriginCookiesConfig defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String cookieBehavior;
        private @Nullable CachePolicyParametersInCacheKeyAndForwardedToOriginCookiesConfigCookies cookies;

        public Builder() {
    	      // Empty
        }

        public Builder(CachePolicyParametersInCacheKeyAndForwardedToOriginCookiesConfig defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.cookieBehavior = defaults.cookieBehavior;
    	      this.cookies = defaults.cookies;
        }

        public Builder setCookieBehavior(String cookieBehavior) {
            this.cookieBehavior = Objects.requireNonNull(cookieBehavior);
            return this;
        }

        public Builder setCookies(@Nullable CachePolicyParametersInCacheKeyAndForwardedToOriginCookiesConfigCookies cookies) {
            this.cookies = cookies;
            return this;
        }
        public CachePolicyParametersInCacheKeyAndForwardedToOriginCookiesConfig build() {
            return new CachePolicyParametersInCacheKeyAndForwardedToOriginCookiesConfig(cookieBehavior, cookies);
        }
    }
}
