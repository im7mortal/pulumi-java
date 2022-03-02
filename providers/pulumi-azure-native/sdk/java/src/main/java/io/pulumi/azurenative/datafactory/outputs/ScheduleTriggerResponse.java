// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.datafactory.outputs;

import io.pulumi.azurenative.datafactory.outputs.ScheduleTriggerRecurrenceResponse;
import io.pulumi.azurenative.datafactory.outputs.TriggerPipelineReferenceResponse;
import io.pulumi.core.annotations.OutputCustomType;
import java.lang.Object;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class ScheduleTriggerResponse {
    /**
     * List of tags that can be used for describing the trigger.
     * 
     */
    private final @Nullable List<Object> annotations;
    /**
     * Trigger description.
     * 
     */
    private final @Nullable String description;
    /**
     * Pipelines that need to be started.
     * 
     */
    private final @Nullable List<TriggerPipelineReferenceResponse> pipelines;
    /**
     * Recurrence schedule configuration.
     * 
     */
    private final ScheduleTriggerRecurrenceResponse recurrence;
    /**
     * Indicates if trigger is running or not. Updated when Start/Stop APIs are called on the Trigger.
     * 
     */
    private final String runtimeState;
    /**
     * Trigger type.
     * Expected value is 'ScheduleTrigger'.
     * 
     */
    private final String type;

    @OutputCustomType.Constructor({"annotations","description","pipelines","recurrence","runtimeState","type"})
    private ScheduleTriggerResponse(
        @Nullable List<Object> annotations,
        @Nullable String description,
        @Nullable List<TriggerPipelineReferenceResponse> pipelines,
        ScheduleTriggerRecurrenceResponse recurrence,
        String runtimeState,
        String type) {
        this.annotations = annotations;
        this.description = description;
        this.pipelines = pipelines;
        this.recurrence = Objects.requireNonNull(recurrence);
        this.runtimeState = Objects.requireNonNull(runtimeState);
        this.type = Objects.requireNonNull(type);
    }

    /**
     * List of tags that can be used for describing the trigger.
     * 
    */
    public List<Object> getAnnotations() {
        return this.annotations == null ? List.of() : this.annotations;
    }
    /**
     * Trigger description.
     * 
    */
    public Optional<String> getDescription() {
        return Optional.ofNullable(this.description);
    }
    /**
     * Pipelines that need to be started.
     * 
    */
    public List<TriggerPipelineReferenceResponse> getPipelines() {
        return this.pipelines == null ? List.of() : this.pipelines;
    }
    /**
     * Recurrence schedule configuration.
     * 
    */
    public ScheduleTriggerRecurrenceResponse getRecurrence() {
        return this.recurrence;
    }
    /**
     * Indicates if trigger is running or not. Updated when Start/Stop APIs are called on the Trigger.
     * 
    */
    public String getRuntimeState() {
        return this.runtimeState;
    }
    /**
     * Trigger type.
     * Expected value is 'ScheduleTrigger'.
     * 
    */
    public String getType() {
        return this.type;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ScheduleTriggerResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable List<Object> annotations;
        private @Nullable String description;
        private @Nullable List<TriggerPipelineReferenceResponse> pipelines;
        private ScheduleTriggerRecurrenceResponse recurrence;
        private String runtimeState;
        private String type;

        public Builder() {
    	      // Empty
        }

        public Builder(ScheduleTriggerResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.annotations = defaults.annotations;
    	      this.description = defaults.description;
    	      this.pipelines = defaults.pipelines;
    	      this.recurrence = defaults.recurrence;
    	      this.runtimeState = defaults.runtimeState;
    	      this.type = defaults.type;
        }

        public Builder setAnnotations(@Nullable List<Object> annotations) {
            this.annotations = annotations;
            return this;
        }

        public Builder setDescription(@Nullable String description) {
            this.description = description;
            return this;
        }

        public Builder setPipelines(@Nullable List<TriggerPipelineReferenceResponse> pipelines) {
            this.pipelines = pipelines;
            return this;
        }

        public Builder setRecurrence(ScheduleTriggerRecurrenceResponse recurrence) {
            this.recurrence = Objects.requireNonNull(recurrence);
            return this;
        }

        public Builder setRuntimeState(String runtimeState) {
            this.runtimeState = Objects.requireNonNull(runtimeState);
            return this;
        }

        public Builder setType(String type) {
            this.type = Objects.requireNonNull(type);
            return this;
        }
        public ScheduleTriggerResponse build() {
            return new ScheduleTriggerResponse(annotations, description, pipelines, recurrence, runtimeState, type);
        }
    }
}
