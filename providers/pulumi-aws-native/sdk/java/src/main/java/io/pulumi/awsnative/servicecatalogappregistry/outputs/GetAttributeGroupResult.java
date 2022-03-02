// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.servicecatalogappregistry.outputs;

import io.pulumi.awsnative.servicecatalogappregistry.outputs.AttributeGroupTags;
import io.pulumi.core.annotations.OutputCustomType;
import java.lang.Object;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class GetAttributeGroupResult {
    private final @Nullable String arn;
    private final @Nullable Object attributes;
    /**
     * The description of the attribute group.
     * 
     */
    private final @Nullable String description;
    private final @Nullable String id;
    /**
     * The name of the attribute group.
     * 
     */
    private final @Nullable String name;
    private final @Nullable AttributeGroupTags tags;

    @OutputCustomType.Constructor({"arn","attributes","description","id","name","tags"})
    private GetAttributeGroupResult(
        @Nullable String arn,
        @Nullable Object attributes,
        @Nullable String description,
        @Nullable String id,
        @Nullable String name,
        @Nullable AttributeGroupTags tags) {
        this.arn = arn;
        this.attributes = attributes;
        this.description = description;
        this.id = id;
        this.name = name;
        this.tags = tags;
    }

    public Optional<String> getArn() {
        return Optional.ofNullable(this.arn);
    }
    public Optional<Object> getAttributes() {
        return Optional.ofNullable(this.attributes);
    }
    /**
     * The description of the attribute group.
     * 
    */
    public Optional<String> getDescription() {
        return Optional.ofNullable(this.description);
    }
    public Optional<String> getId() {
        return Optional.ofNullable(this.id);
    }
    /**
     * The name of the attribute group.
     * 
    */
    public Optional<String> getName() {
        return Optional.ofNullable(this.name);
    }
    public Optional<AttributeGroupTags> getTags() {
        return Optional.ofNullable(this.tags);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetAttributeGroupResult defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String arn;
        private @Nullable Object attributes;
        private @Nullable String description;
        private @Nullable String id;
        private @Nullable String name;
        private @Nullable AttributeGroupTags tags;

        public Builder() {
    	      // Empty
        }

        public Builder(GetAttributeGroupResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.arn = defaults.arn;
    	      this.attributes = defaults.attributes;
    	      this.description = defaults.description;
    	      this.id = defaults.id;
    	      this.name = defaults.name;
    	      this.tags = defaults.tags;
        }

        public Builder setArn(@Nullable String arn) {
            this.arn = arn;
            return this;
        }

        public Builder setAttributes(@Nullable Object attributes) {
            this.attributes = attributes;
            return this;
        }

        public Builder setDescription(@Nullable String description) {
            this.description = description;
            return this;
        }

        public Builder setId(@Nullable String id) {
            this.id = id;
            return this;
        }

        public Builder setName(@Nullable String name) {
            this.name = name;
            return this;
        }

        public Builder setTags(@Nullable AttributeGroupTags tags) {
            this.tags = tags;
            return this;
        }
        public GetAttributeGroupResult build() {
            return new GetAttributeGroupResult(arn, attributes, description, id, name, tags);
        }
    }
}
