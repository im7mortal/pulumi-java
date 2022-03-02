// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.kubernetes.batch_v1beta1.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import io.pulumi.kubernetes.batch_v1beta1.outputs.JobTemplateSpec;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class CronJobSpec {
    /**
     * Specifies how to treat concurrent executions of a Job. Valid values are: - "Allow" (default): allows CronJobs to run concurrently; - "Forbid": forbids concurrent runs, skipping next run if previous run hasn't finished yet; - "Replace": cancels currently running job and replaces it with a new one
     * 
     */
    private final @Nullable String concurrencyPolicy;
    /**
     * The number of failed finished jobs to retain. This is a pointer to distinguish between explicit zero and not specified. Defaults to 1.
     * 
     */
    private final @Nullable Integer failedJobsHistoryLimit;
    /**
     * Specifies the job that will be created when executing a CronJob.
     * 
     */
    private final JobTemplateSpec jobTemplate;
    /**
     * The schedule in Cron format, see https://en.wikipedia.org/wiki/Cron.
     * 
     */
    private final String schedule;
    /**
     * Optional deadline in seconds for starting the job if it misses scheduled time for any reason.  Missed jobs executions will be counted as failed ones.
     * 
     */
    private final @Nullable Integer startingDeadlineSeconds;
    /**
     * The number of successful finished jobs to retain. This is a pointer to distinguish between explicit zero and not specified. Defaults to 3.
     * 
     */
    private final @Nullable Integer successfulJobsHistoryLimit;
    /**
     * This flag tells the controller to suspend subsequent executions, it does not apply to already started executions.  Defaults to false.
     * 
     */
    private final @Nullable Boolean suspend;

    @OutputCustomType.Constructor({"concurrencyPolicy","failedJobsHistoryLimit","jobTemplate","schedule","startingDeadlineSeconds","successfulJobsHistoryLimit","suspend"})
    private CronJobSpec(
        @Nullable String concurrencyPolicy,
        @Nullable Integer failedJobsHistoryLimit,
        JobTemplateSpec jobTemplate,
        String schedule,
        @Nullable Integer startingDeadlineSeconds,
        @Nullable Integer successfulJobsHistoryLimit,
        @Nullable Boolean suspend) {
        this.concurrencyPolicy = concurrencyPolicy;
        this.failedJobsHistoryLimit = failedJobsHistoryLimit;
        this.jobTemplate = Objects.requireNonNull(jobTemplate);
        this.schedule = Objects.requireNonNull(schedule);
        this.startingDeadlineSeconds = startingDeadlineSeconds;
        this.successfulJobsHistoryLimit = successfulJobsHistoryLimit;
        this.suspend = suspend;
    }

    /**
     * Specifies how to treat concurrent executions of a Job. Valid values are: - "Allow" (default): allows CronJobs to run concurrently; - "Forbid": forbids concurrent runs, skipping next run if previous run hasn't finished yet; - "Replace": cancels currently running job and replaces it with a new one
     * 
    */
    public Optional<String> getConcurrencyPolicy() {
        return Optional.ofNullable(this.concurrencyPolicy);
    }
    /**
     * The number of failed finished jobs to retain. This is a pointer to distinguish between explicit zero and not specified. Defaults to 1.
     * 
    */
    public Optional<Integer> getFailedJobsHistoryLimit() {
        return Optional.ofNullable(this.failedJobsHistoryLimit);
    }
    /**
     * Specifies the job that will be created when executing a CronJob.
     * 
    */
    public JobTemplateSpec getJobTemplate() {
        return this.jobTemplate;
    }
    /**
     * The schedule in Cron format, see https://en.wikipedia.org/wiki/Cron.
     * 
    */
    public String getSchedule() {
        return this.schedule;
    }
    /**
     * Optional deadline in seconds for starting the job if it misses scheduled time for any reason.  Missed jobs executions will be counted as failed ones.
     * 
    */
    public Optional<Integer> getStartingDeadlineSeconds() {
        return Optional.ofNullable(this.startingDeadlineSeconds);
    }
    /**
     * The number of successful finished jobs to retain. This is a pointer to distinguish between explicit zero and not specified. Defaults to 3.
     * 
    */
    public Optional<Integer> getSuccessfulJobsHistoryLimit() {
        return Optional.ofNullable(this.successfulJobsHistoryLimit);
    }
    /**
     * This flag tells the controller to suspend subsequent executions, it does not apply to already started executions.  Defaults to false.
     * 
    */
    public Optional<Boolean> getSuspend() {
        return Optional.ofNullable(this.suspend);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(CronJobSpec defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String concurrencyPolicy;
        private @Nullable Integer failedJobsHistoryLimit;
        private JobTemplateSpec jobTemplate;
        private String schedule;
        private @Nullable Integer startingDeadlineSeconds;
        private @Nullable Integer successfulJobsHistoryLimit;
        private @Nullable Boolean suspend;

        public Builder() {
    	      // Empty
        }

        public Builder(CronJobSpec defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.concurrencyPolicy = defaults.concurrencyPolicy;
    	      this.failedJobsHistoryLimit = defaults.failedJobsHistoryLimit;
    	      this.jobTemplate = defaults.jobTemplate;
    	      this.schedule = defaults.schedule;
    	      this.startingDeadlineSeconds = defaults.startingDeadlineSeconds;
    	      this.successfulJobsHistoryLimit = defaults.successfulJobsHistoryLimit;
    	      this.suspend = defaults.suspend;
        }

        public Builder setConcurrencyPolicy(@Nullable String concurrencyPolicy) {
            this.concurrencyPolicy = concurrencyPolicy;
            return this;
        }

        public Builder setFailedJobsHistoryLimit(@Nullable Integer failedJobsHistoryLimit) {
            this.failedJobsHistoryLimit = failedJobsHistoryLimit;
            return this;
        }

        public Builder setJobTemplate(JobTemplateSpec jobTemplate) {
            this.jobTemplate = Objects.requireNonNull(jobTemplate);
            return this;
        }

        public Builder setSchedule(String schedule) {
            this.schedule = Objects.requireNonNull(schedule);
            return this;
        }

        public Builder setStartingDeadlineSeconds(@Nullable Integer startingDeadlineSeconds) {
            this.startingDeadlineSeconds = startingDeadlineSeconds;
            return this;
        }

        public Builder setSuccessfulJobsHistoryLimit(@Nullable Integer successfulJobsHistoryLimit) {
            this.successfulJobsHistoryLimit = successfulJobsHistoryLimit;
            return this;
        }

        public Builder setSuspend(@Nullable Boolean suspend) {
            this.suspend = suspend;
            return this;
        }
        public CronJobSpec build() {
            return new CronJobSpec(concurrencyPolicy, failedJobsHistoryLimit, jobTemplate, schedule, startingDeadlineSeconds, successfulJobsHistoryLimit, suspend);
        }
    }
}
