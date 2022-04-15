// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.kubernetes.events.k8s.io_v1beta1.outputs;

import io.pulumi.core.annotations.CustomType;
import io.pulumi.kubernetes.core_v1.outputs.EventSource;
import io.pulumi.kubernetes.core_v1.outputs.ObjectReference;
import io.pulumi.kubernetes.events.k8s.io_v1beta1.outputs.EventSeries;
import io.pulumi.kubernetes.meta_v1.outputs.ObjectMeta;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class Event {
    /**
     * action is what action was taken/failed regarding to the regarding object. It is machine-readable. This field can have at most 128 characters.
     * 
     */
    private final @Nullable String action;
    /**
     * APIVersion defines the versioned schema of this representation of an object. Servers should convert recognized schemas to the latest internal value, and may reject unrecognized values. More info: https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#resources
     * 
     */
    private final @Nullable String apiVersion;
    /**
     * deprecatedCount is the deprecated field assuring backward compatibility with core.v1 Event type.
     * 
     */
    private final @Nullable Integer deprecatedCount;
    /**
     * deprecatedFirstTimestamp is the deprecated field assuring backward compatibility with core.v1 Event type.
     * 
     */
    private final @Nullable String deprecatedFirstTimestamp;
    /**
     * deprecatedLastTimestamp is the deprecated field assuring backward compatibility with core.v1 Event type.
     * 
     */
    private final @Nullable String deprecatedLastTimestamp;
    /**
     * deprecatedSource is the deprecated field assuring backward compatibility with core.v1 Event type.
     * 
     */
    private final @Nullable EventSource deprecatedSource;
    /**
     * eventTime is the time when this Event was first observed. It is required.
     * 
     */
    private final String eventTime;
    /**
     * Kind is a string value representing the REST resource this object represents. Servers may infer this from the endpoint the client submits requests to. Cannot be updated. In CamelCase. More info: https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#types-kinds
     * 
     */
    private final @Nullable String kind;
    /**
     * Standard object's metadata. More info: https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#metadata
     * 
     */
    private final @Nullable ObjectMeta metadata;
    /**
     * note is a human-readable description of the status of this operation. Maximal length of the note is 1kB, but libraries should be prepared to handle values up to 64kB.
     * 
     */
    private final @Nullable String note;
    /**
     * reason is why the action was taken. It is human-readable. This field can have at most 128 characters.
     * 
     */
    private final @Nullable String reason;
    /**
     * regarding contains the object this Event is about. In most cases it's an Object reporting controller implements, e.g. ReplicaSetController implements ReplicaSets and this event is emitted because it acts on some changes in a ReplicaSet object.
     * 
     */
    private final @Nullable ObjectReference regarding;
    /**
     * related is the optional secondary object for more complex actions. E.g. when regarding object triggers a creation or deletion of related object.
     * 
     */
    private final @Nullable ObjectReference related;
    /**
     * reportingController is the name of the controller that emitted this Event, e.g. `kubernetes.io/kubelet`. This field cannot be empty for new Events.
     * 
     */
    private final @Nullable String reportingController;
    /**
     * reportingInstance is the ID of the controller instance, e.g. `kubelet-xyzf`. This field cannot be empty for new Events and it can have at most 128 characters.
     * 
     */
    private final @Nullable String reportingInstance;
    /**
     * series is data about the Event series this event represents or nil if it's a singleton Event.
     * 
     */
    private final @Nullable EventSeries series;
    /**
     * type is the type of this event (Normal, Warning), new types could be added in the future. It is machine-readable.
     * 
     */
    private final @Nullable String type;

    @CustomType.Constructor
    private Event(
        @CustomType.Parameter("action") @Nullable String action,
        @CustomType.Parameter("apiVersion") @Nullable String apiVersion,
        @CustomType.Parameter("deprecatedCount") @Nullable Integer deprecatedCount,
        @CustomType.Parameter("deprecatedFirstTimestamp") @Nullable String deprecatedFirstTimestamp,
        @CustomType.Parameter("deprecatedLastTimestamp") @Nullable String deprecatedLastTimestamp,
        @CustomType.Parameter("deprecatedSource") @Nullable EventSource deprecatedSource,
        @CustomType.Parameter("eventTime") String eventTime,
        @CustomType.Parameter("kind") @Nullable String kind,
        @CustomType.Parameter("metadata") @Nullable ObjectMeta metadata,
        @CustomType.Parameter("note") @Nullable String note,
        @CustomType.Parameter("reason") @Nullable String reason,
        @CustomType.Parameter("regarding") @Nullable ObjectReference regarding,
        @CustomType.Parameter("related") @Nullable ObjectReference related,
        @CustomType.Parameter("reportingController") @Nullable String reportingController,
        @CustomType.Parameter("reportingInstance") @Nullable String reportingInstance,
        @CustomType.Parameter("series") @Nullable EventSeries series,
        @CustomType.Parameter("type") @Nullable String type) {
        this.action = action;
        this.apiVersion = apiVersion;
        this.deprecatedCount = deprecatedCount;
        this.deprecatedFirstTimestamp = deprecatedFirstTimestamp;
        this.deprecatedLastTimestamp = deprecatedLastTimestamp;
        this.deprecatedSource = deprecatedSource;
        this.eventTime = eventTime;
        this.kind = kind;
        this.metadata = metadata;
        this.note = note;
        this.reason = reason;
        this.regarding = regarding;
        this.related = related;
        this.reportingController = reportingController;
        this.reportingInstance = reportingInstance;
        this.series = series;
        this.type = type;
    }

    /**
     * action is what action was taken/failed regarding to the regarding object. It is machine-readable. This field can have at most 128 characters.
     * 
    */
    public Optional<String> action() {
        return Optional.ofNullable(this.action);
    }
    /**
     * APIVersion defines the versioned schema of this representation of an object. Servers should convert recognized schemas to the latest internal value, and may reject unrecognized values. More info: https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#resources
     * 
    */
    public Optional<String> apiVersion() {
        return Optional.ofNullable(this.apiVersion);
    }
    /**
     * deprecatedCount is the deprecated field assuring backward compatibility with core.v1 Event type.
     * 
    */
    public Optional<Integer> deprecatedCount() {
        return Optional.ofNullable(this.deprecatedCount);
    }
    /**
     * deprecatedFirstTimestamp is the deprecated field assuring backward compatibility with core.v1 Event type.
     * 
    */
    public Optional<String> deprecatedFirstTimestamp() {
        return Optional.ofNullable(this.deprecatedFirstTimestamp);
    }
    /**
     * deprecatedLastTimestamp is the deprecated field assuring backward compatibility with core.v1 Event type.
     * 
    */
    public Optional<String> deprecatedLastTimestamp() {
        return Optional.ofNullable(this.deprecatedLastTimestamp);
    }
    /**
     * deprecatedSource is the deprecated field assuring backward compatibility with core.v1 Event type.
     * 
    */
    public Optional<EventSource> deprecatedSource() {
        return Optional.ofNullable(this.deprecatedSource);
    }
    /**
     * eventTime is the time when this Event was first observed. It is required.
     * 
    */
    public String eventTime() {
        return this.eventTime;
    }
    /**
     * Kind is a string value representing the REST resource this object represents. Servers may infer this from the endpoint the client submits requests to. Cannot be updated. In CamelCase. More info: https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#types-kinds
     * 
    */
    public Optional<String> kind() {
        return Optional.ofNullable(this.kind);
    }
    /**
     * Standard object's metadata. More info: https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#metadata
     * 
    */
    public Optional<ObjectMeta> metadata() {
        return Optional.ofNullable(this.metadata);
    }
    /**
     * note is a human-readable description of the status of this operation. Maximal length of the note is 1kB, but libraries should be prepared to handle values up to 64kB.
     * 
    */
    public Optional<String> note() {
        return Optional.ofNullable(this.note);
    }
    /**
     * reason is why the action was taken. It is human-readable. This field can have at most 128 characters.
     * 
    */
    public Optional<String> reason() {
        return Optional.ofNullable(this.reason);
    }
    /**
     * regarding contains the object this Event is about. In most cases it's an Object reporting controller implements, e.g. ReplicaSetController implements ReplicaSets and this event is emitted because it acts on some changes in a ReplicaSet object.
     * 
    */
    public Optional<ObjectReference> regarding() {
        return Optional.ofNullable(this.regarding);
    }
    /**
     * related is the optional secondary object for more complex actions. E.g. when regarding object triggers a creation or deletion of related object.
     * 
    */
    public Optional<ObjectReference> related() {
        return Optional.ofNullable(this.related);
    }
    /**
     * reportingController is the name of the controller that emitted this Event, e.g. `kubernetes.io/kubelet`. This field cannot be empty for new Events.
     * 
    */
    public Optional<String> reportingController() {
        return Optional.ofNullable(this.reportingController);
    }
    /**
     * reportingInstance is the ID of the controller instance, e.g. `kubelet-xyzf`. This field cannot be empty for new Events and it can have at most 128 characters.
     * 
    */
    public Optional<String> reportingInstance() {
        return Optional.ofNullable(this.reportingInstance);
    }
    /**
     * series is data about the Event series this event represents or nil if it's a singleton Event.
     * 
    */
    public Optional<EventSeries> series() {
        return Optional.ofNullable(this.series);
    }
    /**
     * type is the type of this event (Normal, Warning), new types could be added in the future. It is machine-readable.
     * 
    */
    public Optional<String> type() {
        return Optional.ofNullable(this.type);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(Event defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String action;
        private @Nullable String apiVersion;
        private @Nullable Integer deprecatedCount;
        private @Nullable String deprecatedFirstTimestamp;
        private @Nullable String deprecatedLastTimestamp;
        private @Nullable EventSource deprecatedSource;
        private String eventTime;
        private @Nullable String kind;
        private @Nullable ObjectMeta metadata;
        private @Nullable String note;
        private @Nullable String reason;
        private @Nullable ObjectReference regarding;
        private @Nullable ObjectReference related;
        private @Nullable String reportingController;
        private @Nullable String reportingInstance;
        private @Nullable EventSeries series;
        private @Nullable String type;

        public Builder() {
    	      // Empty
        }

        public Builder(Event defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.action = defaults.action;
    	      this.apiVersion = defaults.apiVersion;
    	      this.deprecatedCount = defaults.deprecatedCount;
    	      this.deprecatedFirstTimestamp = defaults.deprecatedFirstTimestamp;
    	      this.deprecatedLastTimestamp = defaults.deprecatedLastTimestamp;
    	      this.deprecatedSource = defaults.deprecatedSource;
    	      this.eventTime = defaults.eventTime;
    	      this.kind = defaults.kind;
    	      this.metadata = defaults.metadata;
    	      this.note = defaults.note;
    	      this.reason = defaults.reason;
    	      this.regarding = defaults.regarding;
    	      this.related = defaults.related;
    	      this.reportingController = defaults.reportingController;
    	      this.reportingInstance = defaults.reportingInstance;
    	      this.series = defaults.series;
    	      this.type = defaults.type;
        }

        public Builder action(@Nullable String action) {
            this.action = action;
            return this;
        }
        public Builder apiVersion(@Nullable String apiVersion) {
            this.apiVersion = apiVersion;
            return this;
        }
        public Builder deprecatedCount(@Nullable Integer deprecatedCount) {
            this.deprecatedCount = deprecatedCount;
            return this;
        }
        public Builder deprecatedFirstTimestamp(@Nullable String deprecatedFirstTimestamp) {
            this.deprecatedFirstTimestamp = deprecatedFirstTimestamp;
            return this;
        }
        public Builder deprecatedLastTimestamp(@Nullable String deprecatedLastTimestamp) {
            this.deprecatedLastTimestamp = deprecatedLastTimestamp;
            return this;
        }
        public Builder deprecatedSource(@Nullable EventSource deprecatedSource) {
            this.deprecatedSource = deprecatedSource;
            return this;
        }
        public Builder eventTime(String eventTime) {
            this.eventTime = Objects.requireNonNull(eventTime);
            return this;
        }
        public Builder kind(@Nullable String kind) {
            this.kind = kind;
            return this;
        }
        public Builder metadata(@Nullable ObjectMeta metadata) {
            this.metadata = metadata;
            return this;
        }
        public Builder note(@Nullable String note) {
            this.note = note;
            return this;
        }
        public Builder reason(@Nullable String reason) {
            this.reason = reason;
            return this;
        }
        public Builder regarding(@Nullable ObjectReference regarding) {
            this.regarding = regarding;
            return this;
        }
        public Builder related(@Nullable ObjectReference related) {
            this.related = related;
            return this;
        }
        public Builder reportingController(@Nullable String reportingController) {
            this.reportingController = reportingController;
            return this;
        }
        public Builder reportingInstance(@Nullable String reportingInstance) {
            this.reportingInstance = reportingInstance;
            return this;
        }
        public Builder series(@Nullable EventSeries series) {
            this.series = series;
            return this;
        }
        public Builder type(@Nullable String type) {
            this.type = type;
            return this;
        }        public Event build() {
            return new Event(action, apiVersion, deprecatedCount, deprecatedFirstTimestamp, deprecatedLastTimestamp, deprecatedSource, eventTime, kind, metadata, note, reason, regarding, related, reportingController, reportingInstance, series, type);
        }
    }
}
