// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.deploymentmanager_alpha.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import io.pulumi.googlenative.deploymentmanager_alpha.outputs.MethodMapResponse;
import io.pulumi.googlenative.deploymentmanager_alpha.outputs.OptionsResponse;
import java.lang.String;
import java.util.Objects;

@OutputCustomType
public final class CollectionOverrideResponse {
    /**
     * The collection that identifies this resource within its service.
     * 
     */
    private final String collection;
    /**
     * Custom verb method mappings to support unordered list API mappings.
     * 
     */
    private final MethodMapResponse methodMap;
    /**
     * The options to apply to this resource-level override
     * 
     */
    private final OptionsResponse options;

    @OutputCustomType.Constructor({"collection","methodMap","options"})
    private CollectionOverrideResponse(
        String collection,
        MethodMapResponse methodMap,
        OptionsResponse options) {
        this.collection = Objects.requireNonNull(collection);
        this.methodMap = Objects.requireNonNull(methodMap);
        this.options = Objects.requireNonNull(options);
    }

    /**
     * The collection that identifies this resource within its service.
     * 
    */
    public String getCollection() {
        return this.collection;
    }
    /**
     * Custom verb method mappings to support unordered list API mappings.
     * 
    */
    public MethodMapResponse getMethodMap() {
        return this.methodMap;
    }
    /**
     * The options to apply to this resource-level override
     * 
    */
    public OptionsResponse getOptions() {
        return this.options;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(CollectionOverrideResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String collection;
        private MethodMapResponse methodMap;
        private OptionsResponse options;

        public Builder() {
    	      // Empty
        }

        public Builder(CollectionOverrideResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.collection = defaults.collection;
    	      this.methodMap = defaults.methodMap;
    	      this.options = defaults.options;
        }

        public Builder setCollection(String collection) {
            this.collection = Objects.requireNonNull(collection);
            return this;
        }

        public Builder setMethodMap(MethodMapResponse methodMap) {
            this.methodMap = Objects.requireNonNull(methodMap);
            return this;
        }

        public Builder setOptions(OptionsResponse options) {
            this.options = Objects.requireNonNull(options);
            return this;
        }
        public CollectionOverrideResponse build() {
            return new CollectionOverrideResponse(collection, methodMap, options);
        }
    }
}
