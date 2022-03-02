// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.containerregistry.outputs;

import io.pulumi.azurenative.containerregistry.outputs.SourcePropertiesResponse;
import io.pulumi.core.annotations.OutputCustomType;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class SourceTriggerResponse {
    /**
     * The name of the trigger.
     * 
     */
    private final String name;
    /**
     * The properties that describes the source(code) for the task.
     * 
     */
    private final SourcePropertiesResponse sourceRepository;
    /**
     * The source event corresponding to the trigger.
     * 
     */
    private final List<String> sourceTriggerEvents;
    /**
     * The current status of trigger.
     * 
     */
    private final @Nullable String status;

    @OutputCustomType.Constructor({"name","sourceRepository","sourceTriggerEvents","status"})
    private SourceTriggerResponse(
        String name,
        SourcePropertiesResponse sourceRepository,
        List<String> sourceTriggerEvents,
        @Nullable String status) {
        this.name = Objects.requireNonNull(name);
        this.sourceRepository = Objects.requireNonNull(sourceRepository);
        this.sourceTriggerEvents = Objects.requireNonNull(sourceTriggerEvents);
        this.status = status;
    }

    /**
     * The name of the trigger.
     * 
    */
    public String getName() {
        return this.name;
    }
    /**
     * The properties that describes the source(code) for the task.
     * 
    */
    public SourcePropertiesResponse getSourceRepository() {
        return this.sourceRepository;
    }
    /**
     * The source event corresponding to the trigger.
     * 
    */
    public List<String> getSourceTriggerEvents() {
        return this.sourceTriggerEvents;
    }
    /**
     * The current status of trigger.
     * 
    */
    public Optional<String> getStatus() {
        return Optional.ofNullable(this.status);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(SourceTriggerResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String name;
        private SourcePropertiesResponse sourceRepository;
        private List<String> sourceTriggerEvents;
        private @Nullable String status;

        public Builder() {
    	      // Empty
        }

        public Builder(SourceTriggerResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.name = defaults.name;
    	      this.sourceRepository = defaults.sourceRepository;
    	      this.sourceTriggerEvents = defaults.sourceTriggerEvents;
    	      this.status = defaults.status;
        }

        public Builder setName(String name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }

        public Builder setSourceRepository(SourcePropertiesResponse sourceRepository) {
            this.sourceRepository = Objects.requireNonNull(sourceRepository);
            return this;
        }

        public Builder setSourceTriggerEvents(List<String> sourceTriggerEvents) {
            this.sourceTriggerEvents = Objects.requireNonNull(sourceTriggerEvents);
            return this;
        }

        public Builder setStatus(@Nullable String status) {
            this.status = status;
            return this;
        }
        public SourceTriggerResponse build() {
            return new SourceTriggerResponse(name, sourceRepository, sourceTriggerEvents, status);
        }
    }
}
