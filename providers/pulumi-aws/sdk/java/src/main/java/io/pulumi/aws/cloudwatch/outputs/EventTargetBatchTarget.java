// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.cloudwatch.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class EventTargetBatchTarget {
    /**
     * The size of the array, if this is an array batch job. Valid values are integers between 2 and 10,000.
     * 
     */
    private final @Nullable Integer arraySize;
    /**
     * The number of times to attempt to retry, if the job fails. Valid values are 1 to 10.
     * 
     */
    private final @Nullable Integer jobAttempts;
    /**
     * The ARN or name of the job definition to use if the event target is an AWS Batch job. This job definition must already exist.
     * 
     */
    private final String jobDefinition;
    /**
     * The name to use for this execution of the job, if the target is an AWS Batch job.
     * 
     */
    private final String jobName;

    @OutputCustomType.Constructor({"arraySize","jobAttempts","jobDefinition","jobName"})
    private EventTargetBatchTarget(
        @Nullable Integer arraySize,
        @Nullable Integer jobAttempts,
        String jobDefinition,
        String jobName) {
        this.arraySize = arraySize;
        this.jobAttempts = jobAttempts;
        this.jobDefinition = Objects.requireNonNull(jobDefinition);
        this.jobName = Objects.requireNonNull(jobName);
    }

    /**
     * The size of the array, if this is an array batch job. Valid values are integers between 2 and 10,000.
     * 
    */
    public Optional<Integer> getArraySize() {
        return Optional.ofNullable(this.arraySize);
    }
    /**
     * The number of times to attempt to retry, if the job fails. Valid values are 1 to 10.
     * 
    */
    public Optional<Integer> getJobAttempts() {
        return Optional.ofNullable(this.jobAttempts);
    }
    /**
     * The ARN or name of the job definition to use if the event target is an AWS Batch job. This job definition must already exist.
     * 
    */
    public String getJobDefinition() {
        return this.jobDefinition;
    }
    /**
     * The name to use for this execution of the job, if the target is an AWS Batch job.
     * 
    */
    public String getJobName() {
        return this.jobName;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(EventTargetBatchTarget defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Integer arraySize;
        private @Nullable Integer jobAttempts;
        private String jobDefinition;
        private String jobName;

        public Builder() {
    	      // Empty
        }

        public Builder(EventTargetBatchTarget defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.arraySize = defaults.arraySize;
    	      this.jobAttempts = defaults.jobAttempts;
    	      this.jobDefinition = defaults.jobDefinition;
    	      this.jobName = defaults.jobName;
        }

        public Builder setArraySize(@Nullable Integer arraySize) {
            this.arraySize = arraySize;
            return this;
        }

        public Builder setJobAttempts(@Nullable Integer jobAttempts) {
            this.jobAttempts = jobAttempts;
            return this;
        }

        public Builder setJobDefinition(String jobDefinition) {
            this.jobDefinition = Objects.requireNonNull(jobDefinition);
            return this;
        }

        public Builder setJobName(String jobName) {
            this.jobName = Objects.requireNonNull(jobName);
            return this;
        }
        public EventTargetBatchTarget build() {
            return new EventTargetBatchTarget(arraySize, jobAttempts, jobDefinition, jobName);
        }
    }
}
