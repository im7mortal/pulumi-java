// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.cloudfront.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;

@OutputCustomType
public final class CachePolicyParametersInCacheKeyAndForwardedToOriginHeadersConfigHeaders {
    /**
     * A list of item names (cookies, headers, or query strings).
     * 
     */
    private final @Nullable List<String> items;

    @OutputCustomType.Constructor({"items"})
    private CachePolicyParametersInCacheKeyAndForwardedToOriginHeadersConfigHeaders(@Nullable List<String> items) {
        this.items = items;
    }

    /**
     * A list of item names (cookies, headers, or query strings).
     * 
    */
    public List<String> getItems() {
        return this.items == null ? List.of() : this.items;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(CachePolicyParametersInCacheKeyAndForwardedToOriginHeadersConfigHeaders defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable List<String> items;

        public Builder() {
    	      // Empty
        }

        public Builder(CachePolicyParametersInCacheKeyAndForwardedToOriginHeadersConfigHeaders defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.items = defaults.items;
        }

        public Builder setItems(@Nullable List<String> items) {
            this.items = items;
            return this;
        }
        public CachePolicyParametersInCacheKeyAndForwardedToOriginHeadersConfigHeaders build() {
            return new CachePolicyParametersInCacheKeyAndForwardedToOriginHeadersConfigHeaders(items);
        }
    }
}
