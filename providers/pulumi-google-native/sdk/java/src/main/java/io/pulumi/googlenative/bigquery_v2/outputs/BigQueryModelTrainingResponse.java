// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.bigquery_v2.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;

@OutputCustomType
public final class BigQueryModelTrainingResponse {
    /**
     * [Output-only, Beta] Index of current ML training iteration. Updated during create model query job to show job progress.
     * 
     */
    private final Integer currentIteration;
    /**
     * [Output-only, Beta] Expected number of iterations for the create model query job specified as num_iterations in the input query. The actual total number of iterations may be less than this number due to early stop.
     * 
     */
    private final String expectedTotalIterations;

    @OutputCustomType.Constructor({"currentIteration","expectedTotalIterations"})
    private BigQueryModelTrainingResponse(
        Integer currentIteration,
        String expectedTotalIterations) {
        this.currentIteration = Objects.requireNonNull(currentIteration);
        this.expectedTotalIterations = Objects.requireNonNull(expectedTotalIterations);
    }

    /**
     * [Output-only, Beta] Index of current ML training iteration. Updated during create model query job to show job progress.
     * 
    */
    public Integer getCurrentIteration() {
        return this.currentIteration;
    }
    /**
     * [Output-only, Beta] Expected number of iterations for the create model query job specified as num_iterations in the input query. The actual total number of iterations may be less than this number due to early stop.
     * 
    */
    public String getExpectedTotalIterations() {
        return this.expectedTotalIterations;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(BigQueryModelTrainingResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Integer currentIteration;
        private String expectedTotalIterations;

        public Builder() {
    	      // Empty
        }

        public Builder(BigQueryModelTrainingResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.currentIteration = defaults.currentIteration;
    	      this.expectedTotalIterations = defaults.expectedTotalIterations;
        }

        public Builder setCurrentIteration(Integer currentIteration) {
            this.currentIteration = Objects.requireNonNull(currentIteration);
            return this;
        }

        public Builder setExpectedTotalIterations(String expectedTotalIterations) {
            this.expectedTotalIterations = Objects.requireNonNull(expectedTotalIterations);
            return this;
        }
        public BigQueryModelTrainingResponse build() {
            return new BigQueryModelTrainingResponse(currentIteration, expectedTotalIterations);
        }
    }
}
