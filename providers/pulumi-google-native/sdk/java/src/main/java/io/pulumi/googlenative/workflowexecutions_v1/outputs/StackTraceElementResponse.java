// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.workflowexecutions_v1.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import io.pulumi.googlenative.workflowexecutions_v1.outputs.PositionResponse;
import java.lang.String;
import java.util.Objects;

@OutputCustomType
public final class StackTraceElementResponse {
    /**
     * The source position information of the stack trace element.
     * 
     */
    private final PositionResponse position;
    /**
     * The routine where the error occurred.
     * 
     */
    private final String routine;
    /**
     * The step the error occurred at.
     * 
     */
    private final String step;

    @OutputCustomType.Constructor({"position","routine","step"})
    private StackTraceElementResponse(
        PositionResponse position,
        String routine,
        String step) {
        this.position = Objects.requireNonNull(position);
        this.routine = Objects.requireNonNull(routine);
        this.step = Objects.requireNonNull(step);
    }

    /**
     * The source position information of the stack trace element.
     * 
    */
    public PositionResponse getPosition() {
        return this.position;
    }
    /**
     * The routine where the error occurred.
     * 
    */
    public String getRoutine() {
        return this.routine;
    }
    /**
     * The step the error occurred at.
     * 
    */
    public String getStep() {
        return this.step;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(StackTraceElementResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private PositionResponse position;
        private String routine;
        private String step;

        public Builder() {
    	      // Empty
        }

        public Builder(StackTraceElementResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.position = defaults.position;
    	      this.routine = defaults.routine;
    	      this.step = defaults.step;
        }

        public Builder setPosition(PositionResponse position) {
            this.position = Objects.requireNonNull(position);
            return this;
        }

        public Builder setRoutine(String routine) {
            this.routine = Objects.requireNonNull(routine);
            return this;
        }

        public Builder setStep(String step) {
            this.step = Objects.requireNonNull(step);
            return this;
        }
        public StackTraceElementResponse build() {
            return new StackTraceElementResponse(position, routine, step);
        }
    }
}
