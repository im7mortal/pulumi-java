// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.frauddetector.outputs;

import io.pulumi.awsnative.frauddetector.outputs.EntityTypeTag;
import io.pulumi.core.annotations.OutputCustomType;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class GetEntityTypeResult {
    /**
     * The entity type ARN.
     * 
     */
    private final @Nullable String arn;
    /**
     * The timestamp when the entity type was created.
     * 
     */
    private final @Nullable String createdTime;
    /**
     * The entity type description.
     * 
     */
    private final @Nullable String description;
    /**
     * The timestamp when the entity type was last updated.
     * 
     */
    private final @Nullable String lastUpdatedTime;
    /**
     * Tags associated with this entity type.
     * 
     */
    private final @Nullable List<EntityTypeTag> tags;

    @OutputCustomType.Constructor({"arn","createdTime","description","lastUpdatedTime","tags"})
    private GetEntityTypeResult(
        @Nullable String arn,
        @Nullable String createdTime,
        @Nullable String description,
        @Nullable String lastUpdatedTime,
        @Nullable List<EntityTypeTag> tags) {
        this.arn = arn;
        this.createdTime = createdTime;
        this.description = description;
        this.lastUpdatedTime = lastUpdatedTime;
        this.tags = tags;
    }

    /**
     * The entity type ARN.
     * 
    */
    public Optional<String> getArn() {
        return Optional.ofNullable(this.arn);
    }
    /**
     * The timestamp when the entity type was created.
     * 
    */
    public Optional<String> getCreatedTime() {
        return Optional.ofNullable(this.createdTime);
    }
    /**
     * The entity type description.
     * 
    */
    public Optional<String> getDescription() {
        return Optional.ofNullable(this.description);
    }
    /**
     * The timestamp when the entity type was last updated.
     * 
    */
    public Optional<String> getLastUpdatedTime() {
        return Optional.ofNullable(this.lastUpdatedTime);
    }
    /**
     * Tags associated with this entity type.
     * 
    */
    public List<EntityTypeTag> getTags() {
        return this.tags == null ? List.of() : this.tags;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetEntityTypeResult defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String arn;
        private @Nullable String createdTime;
        private @Nullable String description;
        private @Nullable String lastUpdatedTime;
        private @Nullable List<EntityTypeTag> tags;

        public Builder() {
    	      // Empty
        }

        public Builder(GetEntityTypeResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.arn = defaults.arn;
    	      this.createdTime = defaults.createdTime;
    	      this.description = defaults.description;
    	      this.lastUpdatedTime = defaults.lastUpdatedTime;
    	      this.tags = defaults.tags;
        }

        public Builder setArn(@Nullable String arn) {
            this.arn = arn;
            return this;
        }

        public Builder setCreatedTime(@Nullable String createdTime) {
            this.createdTime = createdTime;
            return this;
        }

        public Builder setDescription(@Nullable String description) {
            this.description = description;
            return this;
        }

        public Builder setLastUpdatedTime(@Nullable String lastUpdatedTime) {
            this.lastUpdatedTime = lastUpdatedTime;
            return this;
        }

        public Builder setTags(@Nullable List<EntityTypeTag> tags) {
            this.tags = tags;
            return this;
        }
        public GetEntityTypeResult build() {
            return new GetEntityTypeResult(arn, createdTime, description, lastUpdatedTime, tags);
        }
    }
}
