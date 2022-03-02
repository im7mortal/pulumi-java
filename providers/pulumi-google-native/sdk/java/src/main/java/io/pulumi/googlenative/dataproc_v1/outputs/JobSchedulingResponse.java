// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.dataproc_v1.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import java.lang.Integer;
import java.util.Objects;

@OutputCustomType
public final class JobSchedulingResponse {
    /**
     * Optional. Maximum number of times per hour a driver may be restarted as a result of driver exiting with non-zero code before job is reported failed.A job may be reported as thrashing if driver exits with non-zero code 4 times within 10 minute window.Maximum value is 10.Note: Currently, this restartable job option is not supported in Dataproc workflow template (https://cloud.google.com/dataproc/docs/concepts/workflows/using-workflows#adding_jobs_to_a_template) jobs.
     * 
     */
    private final Integer maxFailuresPerHour;
    /**
     * Optional. Maximum number of times in total a driver may be restarted as a result of driver exiting with non-zero code before job is reported failed. Maximum value is 240.Note: Currently, this restartable job option is not supported in Dataproc workflow template (https://cloud.google.com/dataproc/docs/concepts/workflows/using-workflows#adding_jobs_to_a_template) jobs.
     * 
     */
    private final Integer maxFailuresTotal;

    @OutputCustomType.Constructor({"maxFailuresPerHour","maxFailuresTotal"})
    private JobSchedulingResponse(
        Integer maxFailuresPerHour,
        Integer maxFailuresTotal) {
        this.maxFailuresPerHour = Objects.requireNonNull(maxFailuresPerHour);
        this.maxFailuresTotal = Objects.requireNonNull(maxFailuresTotal);
    }

    /**
     * Optional. Maximum number of times per hour a driver may be restarted as a result of driver exiting with non-zero code before job is reported failed.A job may be reported as thrashing if driver exits with non-zero code 4 times within 10 minute window.Maximum value is 10.Note: Currently, this restartable job option is not supported in Dataproc workflow template (https://cloud.google.com/dataproc/docs/concepts/workflows/using-workflows#adding_jobs_to_a_template) jobs.
     * 
    */
    public Integer getMaxFailuresPerHour() {
        return this.maxFailuresPerHour;
    }
    /**
     * Optional. Maximum number of times in total a driver may be restarted as a result of driver exiting with non-zero code before job is reported failed. Maximum value is 240.Note: Currently, this restartable job option is not supported in Dataproc workflow template (https://cloud.google.com/dataproc/docs/concepts/workflows/using-workflows#adding_jobs_to_a_template) jobs.
     * 
    */
    public Integer getMaxFailuresTotal() {
        return this.maxFailuresTotal;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(JobSchedulingResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Integer maxFailuresPerHour;
        private Integer maxFailuresTotal;

        public Builder() {
    	      // Empty
        }

        public Builder(JobSchedulingResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.maxFailuresPerHour = defaults.maxFailuresPerHour;
    	      this.maxFailuresTotal = defaults.maxFailuresTotal;
        }

        public Builder setMaxFailuresPerHour(Integer maxFailuresPerHour) {
            this.maxFailuresPerHour = Objects.requireNonNull(maxFailuresPerHour);
            return this;
        }

        public Builder setMaxFailuresTotal(Integer maxFailuresTotal) {
            this.maxFailuresTotal = Objects.requireNonNull(maxFailuresTotal);
            return this;
        }
        public JobSchedulingResponse build() {
            return new JobSchedulingResponse(maxFailuresPerHour, maxFailuresTotal);
        }
    }
}
