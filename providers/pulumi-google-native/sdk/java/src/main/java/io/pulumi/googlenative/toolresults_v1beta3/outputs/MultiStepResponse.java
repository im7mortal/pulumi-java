// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.toolresults_v1beta3.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import io.pulumi.googlenative.toolresults_v1beta3.outputs.PrimaryStepResponse;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;

@OutputCustomType
public final class MultiStepResponse {
    /**
     * Unique int given to each step. Ranges from 0(inclusive) to total number of steps(exclusive). The primary step is 0.
     * 
     */
    private final Integer multistepNumber;
    /**
     * Present if it is a primary (original) step.
     * 
     */
    private final PrimaryStepResponse primaryStep;
    /**
     * Step Id of the primary (original) step, which might be this step.
     * 
     */
    private final String primaryStepId;

    @OutputCustomType.Constructor({"multistepNumber","primaryStep","primaryStepId"})
    private MultiStepResponse(
        Integer multistepNumber,
        PrimaryStepResponse primaryStep,
        String primaryStepId) {
        this.multistepNumber = Objects.requireNonNull(multistepNumber);
        this.primaryStep = Objects.requireNonNull(primaryStep);
        this.primaryStepId = Objects.requireNonNull(primaryStepId);
    }

    /**
     * Unique int given to each step. Ranges from 0(inclusive) to total number of steps(exclusive). The primary step is 0.
     * 
    */
    public Integer getMultistepNumber() {
        return this.multistepNumber;
    }
    /**
     * Present if it is a primary (original) step.
     * 
    */
    public PrimaryStepResponse getPrimaryStep() {
        return this.primaryStep;
    }
    /**
     * Step Id of the primary (original) step, which might be this step.
     * 
    */
    public String getPrimaryStepId() {
        return this.primaryStepId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(MultiStepResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Integer multistepNumber;
        private PrimaryStepResponse primaryStep;
        private String primaryStepId;

        public Builder() {
    	      // Empty
        }

        public Builder(MultiStepResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.multistepNumber = defaults.multistepNumber;
    	      this.primaryStep = defaults.primaryStep;
    	      this.primaryStepId = defaults.primaryStepId;
        }

        public Builder setMultistepNumber(Integer multistepNumber) {
            this.multistepNumber = Objects.requireNonNull(multistepNumber);
            return this;
        }

        public Builder setPrimaryStep(PrimaryStepResponse primaryStep) {
            this.primaryStep = Objects.requireNonNull(primaryStep);
            return this;
        }

        public Builder setPrimaryStepId(String primaryStepId) {
            this.primaryStepId = Objects.requireNonNull(primaryStepId);
            return this;
        }
        public MultiStepResponse build() {
            return new MultiStepResponse(multistepNumber, primaryStep, primaryStepId);
        }
    }
}
