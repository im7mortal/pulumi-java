// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.documentdb.outputs;

import io.pulumi.azurenative.documentdb.outputs.GraphResourceGetPropertiesResponseOptions;
import io.pulumi.azurenative.documentdb.outputs.GraphResourceGetPropertiesResponseResource;
import io.pulumi.azurenative.documentdb.outputs.ManagedServiceIdentityResponse;
import io.pulumi.core.annotations.OutputCustomType;
import java.lang.String;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class GetGraphResourceGraphResult {
    /**
     * The unique resource identifier of the ARM resource.
     * 
     */
    private final String id;
    /**
     * Identity for the resource.
     * 
     */
    private final @Nullable ManagedServiceIdentityResponse identity;
    /**
     * The location of the resource group to which the resource belongs.
     * 
     */
    private final @Nullable String location;
    /**
     * The name of the ARM resource.
     * 
     */
    private final String name;
    private final @Nullable GraphResourceGetPropertiesResponseOptions options;
    private final @Nullable GraphResourceGetPropertiesResponseResource resource;
    /**
     * Tags are a list of key-value pairs that describe the resource. These tags can be used in viewing and grouping this resource (across resource groups). A maximum of 15 tags can be provided for a resource. Each tag must have a key no greater than 128 characters and value no greater than 256 characters. For example, the default experience for a template type is set with "defaultExperience": "Cassandra". Current "defaultExperience" values also include "Table", "Graph", "DocumentDB", and "MongoDB".
     * 
     */
    private final @Nullable Map<String,String> tags;
    /**
     * The type of Azure resource.
     * 
     */
    private final String type;

    @OutputCustomType.Constructor({"id","identity","location","name","options","resource","tags","type"})
    private GetGraphResourceGraphResult(
        String id,
        @Nullable ManagedServiceIdentityResponse identity,
        @Nullable String location,
        String name,
        @Nullable GraphResourceGetPropertiesResponseOptions options,
        @Nullable GraphResourceGetPropertiesResponseResource resource,
        @Nullable Map<String,String> tags,
        String type) {
        this.id = Objects.requireNonNull(id);
        this.identity = identity;
        this.location = location;
        this.name = Objects.requireNonNull(name);
        this.options = options;
        this.resource = resource;
        this.tags = tags;
        this.type = Objects.requireNonNull(type);
    }

    /**
     * The unique resource identifier of the ARM resource.
     * 
    */
    public String getId() {
        return this.id;
    }
    /**
     * Identity for the resource.
     * 
    */
    public Optional<ManagedServiceIdentityResponse> getIdentity() {
        return Optional.ofNullable(this.identity);
    }
    /**
     * The location of the resource group to which the resource belongs.
     * 
    */
    public Optional<String> getLocation() {
        return Optional.ofNullable(this.location);
    }
    /**
     * The name of the ARM resource.
     * 
    */
    public String getName() {
        return this.name;
    }
    public Optional<GraphResourceGetPropertiesResponseOptions> getOptions() {
        return Optional.ofNullable(this.options);
    }
    public Optional<GraphResourceGetPropertiesResponseResource> getResource() {
        return Optional.ofNullable(this.resource);
    }
    /**
     * Tags are a list of key-value pairs that describe the resource. These tags can be used in viewing and grouping this resource (across resource groups). A maximum of 15 tags can be provided for a resource. Each tag must have a key no greater than 128 characters and value no greater than 256 characters. For example, the default experience for a template type is set with "defaultExperience": "Cassandra". Current "defaultExperience" values also include "Table", "Graph", "DocumentDB", and "MongoDB".
     * 
    */
    public Map<String,String> getTags() {
        return this.tags == null ? Map.of() : this.tags;
    }
    /**
     * The type of Azure resource.
     * 
    */
    public String getType() {
        return this.type;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetGraphResourceGraphResult defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String id;
        private @Nullable ManagedServiceIdentityResponse identity;
        private @Nullable String location;
        private String name;
        private @Nullable GraphResourceGetPropertiesResponseOptions options;
        private @Nullable GraphResourceGetPropertiesResponseResource resource;
        private @Nullable Map<String,String> tags;
        private String type;

        public Builder() {
    	      // Empty
        }

        public Builder(GetGraphResourceGraphResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.id = defaults.id;
    	      this.identity = defaults.identity;
    	      this.location = defaults.location;
    	      this.name = defaults.name;
    	      this.options = defaults.options;
    	      this.resource = defaults.resource;
    	      this.tags = defaults.tags;
    	      this.type = defaults.type;
        }

        public Builder setId(String id) {
            this.id = Objects.requireNonNull(id);
            return this;
        }

        public Builder setIdentity(@Nullable ManagedServiceIdentityResponse identity) {
            this.identity = identity;
            return this;
        }

        public Builder setLocation(@Nullable String location) {
            this.location = location;
            return this;
        }

        public Builder setName(String name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }

        public Builder setOptions(@Nullable GraphResourceGetPropertiesResponseOptions options) {
            this.options = options;
            return this;
        }

        public Builder setResource(@Nullable GraphResourceGetPropertiesResponseResource resource) {
            this.resource = resource;
            return this;
        }

        public Builder setTags(@Nullable Map<String,String> tags) {
            this.tags = tags;
            return this;
        }

        public Builder setType(String type) {
            this.type = Objects.requireNonNull(type);
            return this;
        }
        public GetGraphResourceGraphResult build() {
            return new GetGraphResourceGraphResult(id, identity, location, name, options, resource, tags, type);
        }
    }
}
