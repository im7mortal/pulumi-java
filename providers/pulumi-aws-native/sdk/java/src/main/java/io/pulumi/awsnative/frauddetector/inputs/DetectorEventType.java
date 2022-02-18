// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.frauddetector.inputs;

import io.pulumi.awsnative.frauddetector.inputs.DetectorEntityType;
import io.pulumi.awsnative.frauddetector.inputs.DetectorEventVariable;
import io.pulumi.awsnative.frauddetector.inputs.DetectorLabel;
import io.pulumi.awsnative.frauddetector.inputs.DetectorTag;
import io.pulumi.core.internal.annotations.InputImport;
import java.lang.Boolean;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class DetectorEventType extends io.pulumi.resources.InvokeArgs {

    public static final DetectorEventType Empty = new DetectorEventType();

    /**
     * The ARN of the event type.
     * 
     */
    @InputImport(name="arn")
    private final @Nullable String arn;

    public Optional<String> getArn() {
        return this.arn == null ? Optional.empty() : Optional.ofNullable(this.arn);
    }

    /**
     * The time when the event type was created.
     * 
     */
    @InputImport(name="createdTime")
    private final @Nullable String createdTime;

    public Optional<String> getCreatedTime() {
        return this.createdTime == null ? Optional.empty() : Optional.ofNullable(this.createdTime);
    }

    /**
     * The description of the event type.
     * 
     */
    @InputImport(name="description")
    private final @Nullable String description;

    public Optional<String> getDescription() {
        return this.description == null ? Optional.empty() : Optional.ofNullable(this.description);
    }

    @InputImport(name="entityTypes")
    private final @Nullable List<DetectorEntityType> entityTypes;

    public List<DetectorEntityType> getEntityTypes() {
        return this.entityTypes == null ? List.of() : this.entityTypes;
    }

    @InputImport(name="eventVariables")
    private final @Nullable List<DetectorEventVariable> eventVariables;

    public List<DetectorEventVariable> getEventVariables() {
        return this.eventVariables == null ? List.of() : this.eventVariables;
    }

    @InputImport(name="inline")
    private final @Nullable Boolean inline;

    public Optional<Boolean> getInline() {
        return this.inline == null ? Optional.empty() : Optional.ofNullable(this.inline);
    }

    @InputImport(name="labels")
    private final @Nullable List<DetectorLabel> labels;

    public List<DetectorLabel> getLabels() {
        return this.labels == null ? List.of() : this.labels;
    }

    /**
     * The time when the event type was last updated.
     * 
     */
    @InputImport(name="lastUpdatedTime")
    private final @Nullable String lastUpdatedTime;

    public Optional<String> getLastUpdatedTime() {
        return this.lastUpdatedTime == null ? Optional.empty() : Optional.ofNullable(this.lastUpdatedTime);
    }

    /**
     * The name for the event type
     * 
     */
    @InputImport(name="name")
    private final @Nullable String name;

    public Optional<String> getName() {
        return this.name == null ? Optional.empty() : Optional.ofNullable(this.name);
    }

    /**
     * Tags associated with this event type.
     * 
     */
    @InputImport(name="tags")
    private final @Nullable List<DetectorTag> tags;

    public List<DetectorTag> getTags() {
        return this.tags == null ? List.of() : this.tags;
    }

    public DetectorEventType(
        @Nullable String arn,
        @Nullable String createdTime,
        @Nullable String description,
        @Nullable List<DetectorEntityType> entityTypes,
        @Nullable List<DetectorEventVariable> eventVariables,
        @Nullable Boolean inline,
        @Nullable List<DetectorLabel> labels,
        @Nullable String lastUpdatedTime,
        @Nullable String name,
        @Nullable List<DetectorTag> tags) {
        this.arn = arn;
        this.createdTime = createdTime;
        this.description = description;
        this.entityTypes = entityTypes;
        this.eventVariables = eventVariables;
        this.inline = inline;
        this.labels = labels;
        this.lastUpdatedTime = lastUpdatedTime;
        this.name = name;
        this.tags = tags;
    }

    private DetectorEventType() {
        this.arn = null;
        this.createdTime = null;
        this.description = null;
        this.entityTypes = List.of();
        this.eventVariables = List.of();
        this.inline = null;
        this.labels = List.of();
        this.lastUpdatedTime = null;
        this.name = null;
        this.tags = List.of();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(DetectorEventType defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String arn;
        private @Nullable String createdTime;
        private @Nullable String description;
        private @Nullable List<DetectorEntityType> entityTypes;
        private @Nullable List<DetectorEventVariable> eventVariables;
        private @Nullable Boolean inline;
        private @Nullable List<DetectorLabel> labels;
        private @Nullable String lastUpdatedTime;
        private @Nullable String name;
        private @Nullable List<DetectorTag> tags;

        public Builder() {
    	      // Empty
        }

        public Builder(DetectorEventType defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.arn = defaults.arn;
    	      this.createdTime = defaults.createdTime;
    	      this.description = defaults.description;
    	      this.entityTypes = defaults.entityTypes;
    	      this.eventVariables = defaults.eventVariables;
    	      this.inline = defaults.inline;
    	      this.labels = defaults.labels;
    	      this.lastUpdatedTime = defaults.lastUpdatedTime;
    	      this.name = defaults.name;
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

        public Builder setEntityTypes(@Nullable List<DetectorEntityType> entityTypes) {
            this.entityTypes = entityTypes;
            return this;
        }

        public Builder setEventVariables(@Nullable List<DetectorEventVariable> eventVariables) {
            this.eventVariables = eventVariables;
            return this;
        }

        public Builder setInline(@Nullable Boolean inline) {
            this.inline = inline;
            return this;
        }

        public Builder setLabels(@Nullable List<DetectorLabel> labels) {
            this.labels = labels;
            return this;
        }

        public Builder setLastUpdatedTime(@Nullable String lastUpdatedTime) {
            this.lastUpdatedTime = lastUpdatedTime;
            return this;
        }

        public Builder setName(@Nullable String name) {
            this.name = name;
            return this;
        }

        public Builder setTags(@Nullable List<DetectorTag> tags) {
            this.tags = tags;
            return this;
        }

        public DetectorEventType build() {
            return new DetectorEventType(arn, createdTime, description, entityTypes, eventVariables, inline, labels, lastUpdatedTime, name, tags);
        }
    }
}
