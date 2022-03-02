// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.virtualmachineimages.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class ImageTemplateLastRunStatusResponse {
    /**
     * End time of the last run (UTC)
     * 
     */
    private final @Nullable String endTime;
    /**
     * Verbose information about the last run state
     * 
     */
    private final @Nullable String message;
    /**
     * State of the last run
     * 
     */
    private final @Nullable String runState;
    /**
     * Sub-state of the last run
     * 
     */
    private final @Nullable String runSubState;
    /**
     * Start time of the last run (UTC)
     * 
     */
    private final @Nullable String startTime;

    @OutputCustomType.Constructor({"endTime","message","runState","runSubState","startTime"})
    private ImageTemplateLastRunStatusResponse(
        @Nullable String endTime,
        @Nullable String message,
        @Nullable String runState,
        @Nullable String runSubState,
        @Nullable String startTime) {
        this.endTime = endTime;
        this.message = message;
        this.runState = runState;
        this.runSubState = runSubState;
        this.startTime = startTime;
    }

    /**
     * End time of the last run (UTC)
     * 
    */
    public Optional<String> getEndTime() {
        return Optional.ofNullable(this.endTime);
    }
    /**
     * Verbose information about the last run state
     * 
    */
    public Optional<String> getMessage() {
        return Optional.ofNullable(this.message);
    }
    /**
     * State of the last run
     * 
    */
    public Optional<String> getRunState() {
        return Optional.ofNullable(this.runState);
    }
    /**
     * Sub-state of the last run
     * 
    */
    public Optional<String> getRunSubState() {
        return Optional.ofNullable(this.runSubState);
    }
    /**
     * Start time of the last run (UTC)
     * 
    */
    public Optional<String> getStartTime() {
        return Optional.ofNullable(this.startTime);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ImageTemplateLastRunStatusResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String endTime;
        private @Nullable String message;
        private @Nullable String runState;
        private @Nullable String runSubState;
        private @Nullable String startTime;

        public Builder() {
    	      // Empty
        }

        public Builder(ImageTemplateLastRunStatusResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.endTime = defaults.endTime;
    	      this.message = defaults.message;
    	      this.runState = defaults.runState;
    	      this.runSubState = defaults.runSubState;
    	      this.startTime = defaults.startTime;
        }

        public Builder setEndTime(@Nullable String endTime) {
            this.endTime = endTime;
            return this;
        }

        public Builder setMessage(@Nullable String message) {
            this.message = message;
            return this;
        }

        public Builder setRunState(@Nullable String runState) {
            this.runState = runState;
            return this;
        }

        public Builder setRunSubState(@Nullable String runSubState) {
            this.runSubState = runSubState;
            return this;
        }

        public Builder setStartTime(@Nullable String startTime) {
            this.startTime = startTime;
            return this;
        }
        public ImageTemplateLastRunStatusResponse build() {
            return new ImageTemplateLastRunStatusResponse(endTime, message, runState, runSubState, startTime);
        }
    }
}
