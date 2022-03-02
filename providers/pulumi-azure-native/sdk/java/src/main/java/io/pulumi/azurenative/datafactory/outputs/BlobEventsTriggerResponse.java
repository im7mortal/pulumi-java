// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.datafactory.outputs;

import io.pulumi.azurenative.datafactory.outputs.TriggerPipelineReferenceResponse;
import io.pulumi.core.annotations.OutputCustomType;
import java.lang.Boolean;
import java.lang.Object;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class BlobEventsTriggerResponse {
    /**
     * List of tags that can be used for describing the trigger.
     * 
     */
    private final @Nullable List<Object> annotations;
    /**
     * The blob path must begin with the pattern provided for trigger to fire. For example, '/records/blobs/december/' will only fire the trigger for blobs in the december folder under the records container. At least one of these must be provided: blobPathBeginsWith, blobPathEndsWith.
     * 
     */
    private final @Nullable String blobPathBeginsWith;
    /**
     * The blob path must end with the pattern provided for trigger to fire. For example, 'december/boxes.csv' will only fire the trigger for blobs named boxes in a december folder. At least one of these must be provided: blobPathBeginsWith, blobPathEndsWith.
     * 
     */
    private final @Nullable String blobPathEndsWith;
    /**
     * Trigger description.
     * 
     */
    private final @Nullable String description;
    /**
     * The type of events that cause this trigger to fire.
     * 
     */
    private final List<String> events;
    /**
     * If set to true, blobs with zero bytes will be ignored.
     * 
     */
    private final @Nullable Boolean ignoreEmptyBlobs;
    /**
     * Pipelines that need to be started.
     * 
     */
    private final @Nullable List<TriggerPipelineReferenceResponse> pipelines;
    /**
     * Indicates if trigger is running or not. Updated when Start/Stop APIs are called on the Trigger.
     * 
     */
    private final String runtimeState;
    /**
     * The ARM resource ID of the Storage Account.
     * 
     */
    private final String scope;
    /**
     * Trigger type.
     * Expected value is 'BlobEventsTrigger'.
     * 
     */
    private final String type;

    @OutputCustomType.Constructor({"annotations","blobPathBeginsWith","blobPathEndsWith","description","events","ignoreEmptyBlobs","pipelines","runtimeState","scope","type"})
    private BlobEventsTriggerResponse(
        @Nullable List<Object> annotations,
        @Nullable String blobPathBeginsWith,
        @Nullable String blobPathEndsWith,
        @Nullable String description,
        List<String> events,
        @Nullable Boolean ignoreEmptyBlobs,
        @Nullable List<TriggerPipelineReferenceResponse> pipelines,
        String runtimeState,
        String scope,
        String type) {
        this.annotations = annotations;
        this.blobPathBeginsWith = blobPathBeginsWith;
        this.blobPathEndsWith = blobPathEndsWith;
        this.description = description;
        this.events = Objects.requireNonNull(events);
        this.ignoreEmptyBlobs = ignoreEmptyBlobs;
        this.pipelines = pipelines;
        this.runtimeState = Objects.requireNonNull(runtimeState);
        this.scope = Objects.requireNonNull(scope);
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
     * The blob path must begin with the pattern provided for trigger to fire. For example, '/records/blobs/december/' will only fire the trigger for blobs in the december folder under the records container. At least one of these must be provided: blobPathBeginsWith, blobPathEndsWith.
     * 
    */
    public Optional<String> getBlobPathBeginsWith() {
        return Optional.ofNullable(this.blobPathBeginsWith);
    }
    /**
     * The blob path must end with the pattern provided for trigger to fire. For example, 'december/boxes.csv' will only fire the trigger for blobs named boxes in a december folder. At least one of these must be provided: blobPathBeginsWith, blobPathEndsWith.
     * 
    */
    public Optional<String> getBlobPathEndsWith() {
        return Optional.ofNullable(this.blobPathEndsWith);
    }
    /**
     * Trigger description.
     * 
    */
    public Optional<String> getDescription() {
        return Optional.ofNullable(this.description);
    }
    /**
     * The type of events that cause this trigger to fire.
     * 
    */
    public List<String> getEvents() {
        return this.events;
    }
    /**
     * If set to true, blobs with zero bytes will be ignored.
     * 
    */
    public Optional<Boolean> getIgnoreEmptyBlobs() {
        return Optional.ofNullable(this.ignoreEmptyBlobs);
    }
    /**
     * Pipelines that need to be started.
     * 
    */
    public List<TriggerPipelineReferenceResponse> getPipelines() {
        return this.pipelines == null ? List.of() : this.pipelines;
    }
    /**
     * Indicates if trigger is running or not. Updated when Start/Stop APIs are called on the Trigger.
     * 
    */
    public String getRuntimeState() {
        return this.runtimeState;
    }
    /**
     * The ARM resource ID of the Storage Account.
     * 
    */
    public String getScope() {
        return this.scope;
    }
    /**
     * Trigger type.
     * Expected value is 'BlobEventsTrigger'.
     * 
    */
    public String getType() {
        return this.type;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(BlobEventsTriggerResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable List<Object> annotations;
        private @Nullable String blobPathBeginsWith;
        private @Nullable String blobPathEndsWith;
        private @Nullable String description;
        private List<String> events;
        private @Nullable Boolean ignoreEmptyBlobs;
        private @Nullable List<TriggerPipelineReferenceResponse> pipelines;
        private String runtimeState;
        private String scope;
        private String type;

        public Builder() {
    	      // Empty
        }

        public Builder(BlobEventsTriggerResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.annotations = defaults.annotations;
    	      this.blobPathBeginsWith = defaults.blobPathBeginsWith;
    	      this.blobPathEndsWith = defaults.blobPathEndsWith;
    	      this.description = defaults.description;
    	      this.events = defaults.events;
    	      this.ignoreEmptyBlobs = defaults.ignoreEmptyBlobs;
    	      this.pipelines = defaults.pipelines;
    	      this.runtimeState = defaults.runtimeState;
    	      this.scope = defaults.scope;
    	      this.type = defaults.type;
        }

        public Builder setAnnotations(@Nullable List<Object> annotations) {
            this.annotations = annotations;
            return this;
        }

        public Builder setBlobPathBeginsWith(@Nullable String blobPathBeginsWith) {
            this.blobPathBeginsWith = blobPathBeginsWith;
            return this;
        }

        public Builder setBlobPathEndsWith(@Nullable String blobPathEndsWith) {
            this.blobPathEndsWith = blobPathEndsWith;
            return this;
        }

        public Builder setDescription(@Nullable String description) {
            this.description = description;
            return this;
        }

        public Builder setEvents(List<String> events) {
            this.events = Objects.requireNonNull(events);
            return this;
        }

        public Builder setIgnoreEmptyBlobs(@Nullable Boolean ignoreEmptyBlobs) {
            this.ignoreEmptyBlobs = ignoreEmptyBlobs;
            return this;
        }

        public Builder setPipelines(@Nullable List<TriggerPipelineReferenceResponse> pipelines) {
            this.pipelines = pipelines;
            return this;
        }

        public Builder setRuntimeState(String runtimeState) {
            this.runtimeState = Objects.requireNonNull(runtimeState);
            return this;
        }

        public Builder setScope(String scope) {
            this.scope = Objects.requireNonNull(scope);
            return this;
        }

        public Builder setType(String type) {
            this.type = Objects.requireNonNull(type);
            return this;
        }
        public BlobEventsTriggerResponse build() {
            return new BlobEventsTriggerResponse(annotations, blobPathBeginsWith, blobPathEndsWith, description, events, ignoreEmptyBlobs, pipelines, runtimeState, scope, type);
        }
    }
}
