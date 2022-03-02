// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.cloudsearch_v1.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import io.pulumi.googlenative.cloudsearch_v1.outputs.FilterResponse;
import java.lang.String;
import java.util.Objects;

@OutputCustomType
public final class FilterOptionsResponse {
    /**
     * Generic filter to restrict the search, such as `lang:en`, `site:xyz`.
     * 
     */
    private final FilterResponse filter;
    /**
     * If object_type is set, only objects of that type are returned. This should correspond to the name of the object that was registered within the definition of schema. The maximum length is 256 characters.
     * 
     */
    private final String objectType;

    @OutputCustomType.Constructor({"filter","objectType"})
    private FilterOptionsResponse(
        FilterResponse filter,
        String objectType) {
        this.filter = Objects.requireNonNull(filter);
        this.objectType = Objects.requireNonNull(objectType);
    }

    /**
     * Generic filter to restrict the search, such as `lang:en`, `site:xyz`.
     * 
    */
    public FilterResponse getFilter() {
        return this.filter;
    }
    /**
     * If object_type is set, only objects of that type are returned. This should correspond to the name of the object that was registered within the definition of schema. The maximum length is 256 characters.
     * 
    */
    public String getObjectType() {
        return this.objectType;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(FilterOptionsResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private FilterResponse filter;
        private String objectType;

        public Builder() {
    	      // Empty
        }

        public Builder(FilterOptionsResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.filter = defaults.filter;
    	      this.objectType = defaults.objectType;
        }

        public Builder setFilter(FilterResponse filter) {
            this.filter = Objects.requireNonNull(filter);
            return this;
        }

        public Builder setObjectType(String objectType) {
            this.objectType = Objects.requireNonNull(objectType);
            return this;
        }
        public FilterOptionsResponse build() {
            return new FilterOptionsResponse(filter, objectType);
        }
    }
}
