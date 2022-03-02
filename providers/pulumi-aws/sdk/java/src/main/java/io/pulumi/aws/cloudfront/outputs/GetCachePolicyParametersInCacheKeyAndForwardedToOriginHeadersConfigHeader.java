// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.cloudfront.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import java.lang.String;
import java.util.List;
import java.util.Objects;

@OutputCustomType
public final class GetCachePolicyParametersInCacheKeyAndForwardedToOriginHeadersConfigHeader {
    /**
     * A list of item names (`cookies`, `headers`, or `query_strings`).
     * 
     */
    private final List<String> items;

    @OutputCustomType.Constructor({"items"})
    private GetCachePolicyParametersInCacheKeyAndForwardedToOriginHeadersConfigHeader(List<String> items) {
        this.items = Objects.requireNonNull(items);
    }

    /**
     * A list of item names (`cookies`, `headers`, or `query_strings`).
     * 
    */
    public List<String> getItems() {
        return this.items;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetCachePolicyParametersInCacheKeyAndForwardedToOriginHeadersConfigHeader defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private List<String> items;

        public Builder() {
    	      // Empty
        }

        public Builder(GetCachePolicyParametersInCacheKeyAndForwardedToOriginHeadersConfigHeader defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.items = defaults.items;
        }

        public Builder setItems(List<String> items) {
            this.items = Objects.requireNonNull(items);
            return this;
        }
        public GetCachePolicyParametersInCacheKeyAndForwardedToOriginHeadersConfigHeader build() {
            return new GetCachePolicyParametersInCacheKeyAndForwardedToOriginHeadersConfigHeader(items);
        }
    }
}
