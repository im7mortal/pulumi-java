// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.migrate.outputs;

import io.pulumi.azurenative.migrate.outputs.MigrateProjectPropertiesResponse;
import io.pulumi.azurenative.migrate.outputs.MigrateProjectResponseTags;
import io.pulumi.core.annotations.OutputCustomType;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class GetMigrateProjectResult {
    /**
     * Gets or sets the eTag for concurrency control.
     * 
     */
    private final @Nullable String eTag;
    /**
     * Gets the relative URL to get this migrate project.
     * 
     */
    private final String id;
    /**
     * Gets or sets the Azure location in which migrate project is created.
     * 
     */
    private final @Nullable String location;
    /**
     * Gets the name of the migrate project.
     * 
     */
    private final String name;
    /**
     * Gets or sets the nested properties.
     * 
     */
    private final MigrateProjectPropertiesResponse properties;
    /**
     * Gets or sets the tags.
     * 
     */
    private final @Nullable MigrateProjectResponseTags tags;
    /**
     * Handled by resource provider. Type = Microsoft.Migrate/MigrateProject.
     * 
     */
    private final String type;

    @OutputCustomType.Constructor({"eTag","id","location","name","properties","tags","type"})
    private GetMigrateProjectResult(
        @Nullable String eTag,
        String id,
        @Nullable String location,
        String name,
        MigrateProjectPropertiesResponse properties,
        @Nullable MigrateProjectResponseTags tags,
        String type) {
        this.eTag = eTag;
        this.id = Objects.requireNonNull(id);
        this.location = location;
        this.name = Objects.requireNonNull(name);
        this.properties = Objects.requireNonNull(properties);
        this.tags = tags;
        this.type = Objects.requireNonNull(type);
    }

    /**
     * Gets or sets the eTag for concurrency control.
     * 
    */
    public Optional<String> getETag() {
        return Optional.ofNullable(this.eTag);
    }
    /**
     * Gets the relative URL to get this migrate project.
     * 
    */
    public String getId() {
        return this.id;
    }
    /**
     * Gets or sets the Azure location in which migrate project is created.
     * 
    */
    public Optional<String> getLocation() {
        return Optional.ofNullable(this.location);
    }
    /**
     * Gets the name of the migrate project.
     * 
    */
    public String getName() {
        return this.name;
    }
    /**
     * Gets or sets the nested properties.
     * 
    */
    public MigrateProjectPropertiesResponse getProperties() {
        return this.properties;
    }
    /**
     * Gets or sets the tags.
     * 
    */
    public Optional<MigrateProjectResponseTags> getTags() {
        return Optional.ofNullable(this.tags);
    }
    /**
     * Handled by resource provider. Type = Microsoft.Migrate/MigrateProject.
     * 
    */
    public String getType() {
        return this.type;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetMigrateProjectResult defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String eTag;
        private String id;
        private @Nullable String location;
        private String name;
        private MigrateProjectPropertiesResponse properties;
        private @Nullable MigrateProjectResponseTags tags;
        private String type;

        public Builder() {
    	      // Empty
        }

        public Builder(GetMigrateProjectResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.eTag = defaults.eTag;
    	      this.id = defaults.id;
    	      this.location = defaults.location;
    	      this.name = defaults.name;
    	      this.properties = defaults.properties;
    	      this.tags = defaults.tags;
    	      this.type = defaults.type;
        }

        public Builder setETag(@Nullable String eTag) {
            this.eTag = eTag;
            return this;
        }

        public Builder setId(String id) {
            this.id = Objects.requireNonNull(id);
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

        public Builder setProperties(MigrateProjectPropertiesResponse properties) {
            this.properties = Objects.requireNonNull(properties);
            return this;
        }

        public Builder setTags(@Nullable MigrateProjectResponseTags tags) {
            this.tags = tags;
            return this;
        }

        public Builder setType(String type) {
            this.type = Objects.requireNonNull(type);
            return this;
        }
        public GetMigrateProjectResult build() {
            return new GetMigrateProjectResult(eTag, id, location, name, properties, tags, type);
        }
    }
}
