// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.frauddetector;

import io.pulumi.awsnative.frauddetector.inputs.EventTypeEntityTypeArgs;
import io.pulumi.awsnative.frauddetector.inputs.EventTypeEventVariableArgs;
import io.pulumi.awsnative.frauddetector.inputs.EventTypeLabelArgs;
import io.pulumi.awsnative.frauddetector.inputs.EventTypeTagArgs;
import io.pulumi.core.Input;
import io.pulumi.core.internal.annotations.InputImport;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;


public final class EventTypeArgs extends io.pulumi.resources.ResourceArgs {

    public static final EventTypeArgs Empty = new EventTypeArgs();

    /**
     * The description of the event type.
     * 
     */
    @InputImport(name="description")
    private final @Nullable Input<String> description;

    public Input<String> getDescription() {
        return this.description == null ? Input.empty() : this.description;
    }

    @InputImport(name="entityTypes", required=true)
    private final Input<List<EventTypeEntityTypeArgs>> entityTypes;

    public Input<List<EventTypeEntityTypeArgs>> getEntityTypes() {
        return this.entityTypes;
    }

    @InputImport(name="eventVariables", required=true)
    private final Input<List<EventTypeEventVariableArgs>> eventVariables;

    public Input<List<EventTypeEventVariableArgs>> getEventVariables() {
        return this.eventVariables;
    }

    @InputImport(name="labels", required=true)
    private final Input<List<EventTypeLabelArgs>> labels;

    public Input<List<EventTypeLabelArgs>> getLabels() {
        return this.labels;
    }

    /**
     * The name for the event type
     * 
     */
    @InputImport(name="name")
    private final @Nullable Input<String> name;

    public Input<String> getName() {
        return this.name == null ? Input.empty() : this.name;
    }

    /**
     * Tags associated with this event type.
     * 
     */
    @InputImport(name="tags")
    private final @Nullable Input<List<EventTypeTagArgs>> tags;

    public Input<List<EventTypeTagArgs>> getTags() {
        return this.tags == null ? Input.empty() : this.tags;
    }

    public EventTypeArgs(
        @Nullable Input<String> description,
        Input<List<EventTypeEntityTypeArgs>> entityTypes,
        Input<List<EventTypeEventVariableArgs>> eventVariables,
        Input<List<EventTypeLabelArgs>> labels,
        @Nullable Input<String> name,
        @Nullable Input<List<EventTypeTagArgs>> tags) {
        this.description = description;
        this.entityTypes = Objects.requireNonNull(entityTypes, "expected parameter 'entityTypes' to be non-null");
        this.eventVariables = Objects.requireNonNull(eventVariables, "expected parameter 'eventVariables' to be non-null");
        this.labels = Objects.requireNonNull(labels, "expected parameter 'labels' to be non-null");
        this.name = name;
        this.tags = tags;
    }

    private EventTypeArgs() {
        this.description = Input.empty();
        this.entityTypes = Input.empty();
        this.eventVariables = Input.empty();
        this.labels = Input.empty();
        this.name = Input.empty();
        this.tags = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(EventTypeArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<String> description;
        private Input<List<EventTypeEntityTypeArgs>> entityTypes;
        private Input<List<EventTypeEventVariableArgs>> eventVariables;
        private Input<List<EventTypeLabelArgs>> labels;
        private @Nullable Input<String> name;
        private @Nullable Input<List<EventTypeTagArgs>> tags;

        public Builder() {
    	      // Empty
        }

        public Builder(EventTypeArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.description = defaults.description;
    	      this.entityTypes = defaults.entityTypes;
    	      this.eventVariables = defaults.eventVariables;
    	      this.labels = defaults.labels;
    	      this.name = defaults.name;
    	      this.tags = defaults.tags;
        }

        public Builder setDescription(@Nullable Input<String> description) {
            this.description = description;
            return this;
        }

        public Builder setDescription(@Nullable String description) {
            this.description = Input.ofNullable(description);
            return this;
        }

        public Builder setEntityTypes(Input<List<EventTypeEntityTypeArgs>> entityTypes) {
            this.entityTypes = Objects.requireNonNull(entityTypes);
            return this;
        }

        public Builder setEntityTypes(List<EventTypeEntityTypeArgs> entityTypes) {
            this.entityTypes = Input.of(Objects.requireNonNull(entityTypes));
            return this;
        }

        public Builder setEventVariables(Input<List<EventTypeEventVariableArgs>> eventVariables) {
            this.eventVariables = Objects.requireNonNull(eventVariables);
            return this;
        }

        public Builder setEventVariables(List<EventTypeEventVariableArgs> eventVariables) {
            this.eventVariables = Input.of(Objects.requireNonNull(eventVariables));
            return this;
        }

        public Builder setLabels(Input<List<EventTypeLabelArgs>> labels) {
            this.labels = Objects.requireNonNull(labels);
            return this;
        }

        public Builder setLabels(List<EventTypeLabelArgs> labels) {
            this.labels = Input.of(Objects.requireNonNull(labels));
            return this;
        }

        public Builder setName(@Nullable Input<String> name) {
            this.name = name;
            return this;
        }

        public Builder setName(@Nullable String name) {
            this.name = Input.ofNullable(name);
            return this;
        }

        public Builder setTags(@Nullable Input<List<EventTypeTagArgs>> tags) {
            this.tags = tags;
            return this;
        }

        public Builder setTags(@Nullable List<EventTypeTagArgs> tags) {
            this.tags = Input.ofNullable(tags);
            return this;
        }

        public EventTypeArgs build() {
            return new EventTypeArgs(description, entityTypes, eventVariables, labels, name, tags);
        }
    }
}
