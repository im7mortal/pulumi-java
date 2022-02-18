// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.iotevents.inputs;

import io.pulumi.awsnative.iotevents.inputs.DetectorModelAction;
import io.pulumi.core.internal.annotations.InputImport;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * Specifies the `actions` to be performed when the `condition` evaluates to `TRUE`.
 * 
 */
public final class DetectorModelEvent extends io.pulumi.resources.InvokeArgs {

    public static final DetectorModelEvent Empty = new DetectorModelEvent();

    /**
     * The actions to be performed.
     * 
     */
    @InputImport(name="actions")
    private final @Nullable List<DetectorModelAction> actions;

    public List<DetectorModelAction> getActions() {
        return this.actions == null ? List.of() : this.actions;
    }

    /**
     * The Boolean expression that, when `TRUE`, causes the `actions` to be performed. If not present, the `actions` are performed (=`TRUE`). If the expression result is not a `Boolean` value, the `actions` are not performed (=`FALSE`).
     * 
     */
    @InputImport(name="condition")
    private final @Nullable String condition;

    public Optional<String> getCondition() {
        return this.condition == null ? Optional.empty() : Optional.ofNullable(this.condition);
    }

    /**
     * The name of the event.
     * 
     */
    @InputImport(name="eventName", required=true)
    private final String eventName;

    public String getEventName() {
        return this.eventName;
    }

    public DetectorModelEvent(
        @Nullable List<DetectorModelAction> actions,
        @Nullable String condition,
        String eventName) {
        this.actions = actions;
        this.condition = condition;
        this.eventName = Objects.requireNonNull(eventName, "expected parameter 'eventName' to be non-null");
    }

    private DetectorModelEvent() {
        this.actions = List.of();
        this.condition = null;
        this.eventName = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(DetectorModelEvent defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable List<DetectorModelAction> actions;
        private @Nullable String condition;
        private String eventName;

        public Builder() {
    	      // Empty
        }

        public Builder(DetectorModelEvent defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.actions = defaults.actions;
    	      this.condition = defaults.condition;
    	      this.eventName = defaults.eventName;
        }

        public Builder setActions(@Nullable List<DetectorModelAction> actions) {
            this.actions = actions;
            return this;
        }

        public Builder setCondition(@Nullable String condition) {
            this.condition = condition;
            return this;
        }

        public Builder setEventName(String eventName) {
            this.eventName = Objects.requireNonNull(eventName);
            return this;
        }

        public DetectorModelEvent build() {
            return new DetectorModelEvent(actions, condition, eventName);
        }
    }
}
