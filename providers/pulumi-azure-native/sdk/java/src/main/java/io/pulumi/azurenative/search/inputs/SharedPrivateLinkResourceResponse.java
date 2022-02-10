// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.search.inputs;

import io.pulumi.azurenative.search.inputs.SharedPrivateLinkResourcePropertiesResponse;
import io.pulumi.core.internal.annotations.InputImport;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class SharedPrivateLinkResourceResponse extends io.pulumi.resources.InvokeArgs {

    public static final SharedPrivateLinkResourceResponse Empty = new SharedPrivateLinkResourceResponse();

    @InputImport(name="id", required=true)
    private final String id;

    public String getId() {
        return this.id;
    }

    @InputImport(name="name", required=true)
    private final String name;

    public String getName() {
        return this.name;
    }

    @InputImport(name="properties")
    private final @Nullable SharedPrivateLinkResourcePropertiesResponse properties;

    public Optional<SharedPrivateLinkResourcePropertiesResponse> getProperties() {
        return this.properties == null ? Optional.empty() : Optional.ofNullable(this.properties);
    }

    @InputImport(name="type", required=true)
    private final String type;

    public String getType() {
        return this.type;
    }

    public SharedPrivateLinkResourceResponse(
        String id,
        String name,
        @Nullable SharedPrivateLinkResourcePropertiesResponse properties,
        String type) {
        this.id = Objects.requireNonNull(id, "expected parameter 'id' to be non-null");
        this.name = Objects.requireNonNull(name, "expected parameter 'name' to be non-null");
        this.properties = properties;
        this.type = Objects.requireNonNull(type, "expected parameter 'type' to be non-null");
    }

    private SharedPrivateLinkResourceResponse() {
        this.id = null;
        this.name = null;
        this.properties = null;
        this.type = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(SharedPrivateLinkResourceResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String id;
        private String name;
        private @Nullable SharedPrivateLinkResourcePropertiesResponse properties;
        private String type;

        public Builder() {
    	      // Empty
        }

        public Builder(SharedPrivateLinkResourceResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.id = defaults.id;
    	      this.name = defaults.name;
    	      this.properties = defaults.properties;
    	      this.type = defaults.type;
        }

        public Builder setId(String id) {
            this.id = Objects.requireNonNull(id);
            return this;
        }

        public Builder setName(String name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }

        public Builder setProperties(@Nullable SharedPrivateLinkResourcePropertiesResponse properties) {
            this.properties = properties;
            return this;
        }

        public Builder setType(String type) {
            this.type = Objects.requireNonNull(type);
            return this;
        }

        public SharedPrivateLinkResourceResponse build() {
            return new SharedPrivateLinkResourceResponse(id, name, properties, type);
        }
    }
}