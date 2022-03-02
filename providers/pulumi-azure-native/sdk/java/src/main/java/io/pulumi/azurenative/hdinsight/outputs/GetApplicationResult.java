// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.hdinsight.outputs;

import io.pulumi.azurenative.hdinsight.outputs.ApplicationPropertiesResponse;
import io.pulumi.core.annotations.OutputCustomType;
import java.lang.String;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class GetApplicationResult {
    /**
     * The ETag for the application
     * 
     */
    private final @Nullable String etag;
    /**
     * Fully qualified resource Id for the resource.
     * 
     */
    private final String id;
    /**
     * The name of the resource
     * 
     */
    private final String name;
    /**
     * The properties of the application.
     * 
     */
    private final ApplicationPropertiesResponse properties;
    /**
     * The tags for the application.
     * 
     */
    private final @Nullable Map<String,String> tags;
    /**
     * The type of the resource.
     * 
     */
    private final String type;

    @OutputCustomType.Constructor({"etag","id","name","properties","tags","type"})
    private GetApplicationResult(
        @Nullable String etag,
        String id,
        String name,
        ApplicationPropertiesResponse properties,
        @Nullable Map<String,String> tags,
        String type) {
        this.etag = etag;
        this.id = Objects.requireNonNull(id);
        this.name = Objects.requireNonNull(name);
        this.properties = Objects.requireNonNull(properties);
        this.tags = tags;
        this.type = Objects.requireNonNull(type);
    }

    /**
     * The ETag for the application
     * 
    */
    public Optional<String> getEtag() {
        return Optional.ofNullable(this.etag);
    }
    /**
     * Fully qualified resource Id for the resource.
     * 
    */
    public String getId() {
        return this.id;
    }
    /**
     * The name of the resource
     * 
    */
    public String getName() {
        return this.name;
    }
    /**
     * The properties of the application.
     * 
    */
    public ApplicationPropertiesResponse getProperties() {
        return this.properties;
    }
    /**
     * The tags for the application.
     * 
    */
    public Map<String,String> getTags() {
        return this.tags == null ? Map.of() : this.tags;
    }
    /**
     * The type of the resource.
     * 
    */
    public String getType() {
        return this.type;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetApplicationResult defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String etag;
        private String id;
        private String name;
        private ApplicationPropertiesResponse properties;
        private @Nullable Map<String,String> tags;
        private String type;

        public Builder() {
    	      // Empty
        }

        public Builder(GetApplicationResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.etag = defaults.etag;
    	      this.id = defaults.id;
    	      this.name = defaults.name;
    	      this.properties = defaults.properties;
    	      this.tags = defaults.tags;
    	      this.type = defaults.type;
        }

        public Builder setEtag(@Nullable String etag) {
            this.etag = etag;
            return this;
        }

        public Builder setId(String id) {
            this.id = Objects.requireNonNull(id);
            return this;
        }

        public Builder setName(String name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }

        public Builder setProperties(ApplicationPropertiesResponse properties) {
            this.properties = Objects.requireNonNull(properties);
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
        public GetApplicationResult build() {
            return new GetApplicationResult(etag, id, name, properties, tags, type);
        }
    }
}
