// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.iot.inputs;

import io.pulumi.awsnative.iot.enums.JobTemplateJobRetryFailureType;
import io.pulumi.core.Input;
import io.pulumi.core.internal.annotations.InputImport;
import java.lang.Integer;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * Specifies how many times a failure type should be retried.
 * 
 */
public final class JobTemplateRetryCriteriaArgs extends io.pulumi.resources.ResourceArgs {

    public static final JobTemplateRetryCriteriaArgs Empty = new JobTemplateRetryCriteriaArgs();

    @InputImport(name="failureType")
    private final @Nullable Input<JobTemplateJobRetryFailureType> failureType;

    public Input<JobTemplateJobRetryFailureType> getFailureType() {
        return this.failureType == null ? Input.empty() : this.failureType;
    }

    @InputImport(name="numberOfRetries")
    private final @Nullable Input<Integer> numberOfRetries;

    public Input<Integer> getNumberOfRetries() {
        return this.numberOfRetries == null ? Input.empty() : this.numberOfRetries;
    }

    public JobTemplateRetryCriteriaArgs(
        @Nullable Input<JobTemplateJobRetryFailureType> failureType,
        @Nullable Input<Integer> numberOfRetries) {
        this.failureType = failureType;
        this.numberOfRetries = numberOfRetries;
    }

    private JobTemplateRetryCriteriaArgs() {
        this.failureType = Input.empty();
        this.numberOfRetries = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(JobTemplateRetryCriteriaArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<JobTemplateJobRetryFailureType> failureType;
        private @Nullable Input<Integer> numberOfRetries;

        public Builder() {
    	      // Empty
        }

        public Builder(JobTemplateRetryCriteriaArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.failureType = defaults.failureType;
    	      this.numberOfRetries = defaults.numberOfRetries;
        }

        public Builder setFailureType(@Nullable Input<JobTemplateJobRetryFailureType> failureType) {
            this.failureType = failureType;
            return this;
        }

        public Builder setFailureType(@Nullable JobTemplateJobRetryFailureType failureType) {
            this.failureType = Input.ofNullable(failureType);
            return this;
        }

        public Builder setNumberOfRetries(@Nullable Input<Integer> numberOfRetries) {
            this.numberOfRetries = numberOfRetries;
            return this;
        }

        public Builder setNumberOfRetries(@Nullable Integer numberOfRetries) {
            this.numberOfRetries = Input.ofNullable(numberOfRetries);
            return this;
        }

        public JobTemplateRetryCriteriaArgs build() {
            return new JobTemplateRetryCriteriaArgs(failureType, numberOfRetries);
        }
    }
}
