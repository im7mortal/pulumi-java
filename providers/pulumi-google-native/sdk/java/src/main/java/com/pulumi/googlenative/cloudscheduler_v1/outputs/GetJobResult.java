// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.cloudscheduler_v1.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.googlenative.cloudscheduler_v1.outputs.AppEngineHttpTargetResponse;
import com.pulumi.googlenative.cloudscheduler_v1.outputs.HttpTargetResponse;
import com.pulumi.googlenative.cloudscheduler_v1.outputs.PubsubTargetResponse;
import com.pulumi.googlenative.cloudscheduler_v1.outputs.RetryConfigResponse;
import com.pulumi.googlenative.cloudscheduler_v1.outputs.StatusResponse;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class GetJobResult {
    /**
     * @return App Engine HTTP target.
     * 
     */
    private final AppEngineHttpTargetResponse appEngineHttpTarget;
    /**
     * @return The deadline for job attempts. If the request handler does not respond by this deadline then the request is cancelled and the attempt is marked as a `DEADLINE_EXCEEDED` failure. The failed attempt can be viewed in execution logs. Cloud Scheduler will retry the job according to the RetryConfig. The allowed duration for this deadline is: * For HTTP targets, between 15 seconds and 30 minutes. * For App Engine HTTP targets, between 15 seconds and 24 hours 15 seconds.
     * 
     */
    private final String attemptDeadline;
    /**
     * @return Optionally caller-specified in CreateJob or UpdateJob. A human-readable description for the job. This string must not contain more than 500 characters.
     * 
     */
    private final String description;
    /**
     * @return HTTP target.
     * 
     */
    private final HttpTargetResponse httpTarget;
    /**
     * @return The time the last job attempt started.
     * 
     */
    private final String lastAttemptTime;
    /**
     * @return Optionally caller-specified in CreateJob, after which it becomes output only. The job name. For example: `projects/PROJECT_ID/locations/LOCATION_ID/jobs/JOB_ID`. * `PROJECT_ID` can contain letters ([A-Za-z]), numbers ([0-9]), hyphens (-), colons (:), or periods (.). For more information, see [Identifying projects](https://cloud.google.com/resource-manager/docs/creating-managing-projects#identifying_projects) * `LOCATION_ID` is the canonical ID for the job&#39;s location. The list of available locations can be obtained by calling ListLocations. For more information, see https://cloud.google.com/about/locations/. * `JOB_ID` can contain only letters ([A-Za-z]), numbers ([0-9]), hyphens (-), or underscores (_). The maximum length is 500 characters.
     * 
     */
    private final String name;
    /**
     * @return Pub/Sub target.
     * 
     */
    private final PubsubTargetResponse pubsubTarget;
    /**
     * @return Settings that determine the retry behavior.
     * 
     */
    private final RetryConfigResponse retryConfig;
    /**
     * @return Required, except when used with UpdateJob. Describes the schedule on which the job will be executed. The schedule can be either of the following types: * [Crontab](https://en.wikipedia.org/wiki/Cron#Overview) * English-like [schedule](https://cloud.google.com/scheduler/docs/configuring/cron-job-schedules) As a general rule, execution `n + 1` of a job will not begin until execution `n` has finished. Cloud Scheduler will never allow two simultaneously outstanding executions. For example, this implies that if the `n+1`th execution is scheduled to run at 16:00 but the `n`th execution takes until 16:15, the `n+1`th execution will not start until `16:15`. A scheduled start time will be delayed if the previous execution has not ended when its scheduled time occurs. If retry_count &gt; 0 and a job attempt fails, the job will be tried a total of retry_count times, with exponential backoff, until the next scheduled start time.
     * 
     */
    private final String schedule;
    /**
     * @return The next time the job is scheduled. Note that this may be a retry of a previously failed attempt or the next execution time according to the schedule.
     * 
     */
    private final String scheduleTime;
    /**
     * @return State of the job.
     * 
     */
    private final String state;
    /**
     * @return The response from the target for the last attempted execution.
     * 
     */
    private final StatusResponse status;
    /**
     * @return Specifies the time zone to be used in interpreting schedule. The value of this field must be a time zone name from the [tz database](http://en.wikipedia.org/wiki/Tz_database). Note that some time zones include a provision for daylight savings time. The rules for daylight saving time are determined by the chosen tz. For UTC use the string &#34;utc&#34;. If a time zone is not specified, the default will be in UTC (also known as GMT).
     * 
     */
    private final String timeZone;
    /**
     * @return The creation time of the job.
     * 
     */
    private final String userUpdateTime;

    @CustomType.Constructor
    private GetJobResult(
        @CustomType.Parameter("appEngineHttpTarget") AppEngineHttpTargetResponse appEngineHttpTarget,
        @CustomType.Parameter("attemptDeadline") String attemptDeadline,
        @CustomType.Parameter("description") String description,
        @CustomType.Parameter("httpTarget") HttpTargetResponse httpTarget,
        @CustomType.Parameter("lastAttemptTime") String lastAttemptTime,
        @CustomType.Parameter("name") String name,
        @CustomType.Parameter("pubsubTarget") PubsubTargetResponse pubsubTarget,
        @CustomType.Parameter("retryConfig") RetryConfigResponse retryConfig,
        @CustomType.Parameter("schedule") String schedule,
        @CustomType.Parameter("scheduleTime") String scheduleTime,
        @CustomType.Parameter("state") String state,
        @CustomType.Parameter("status") StatusResponse status,
        @CustomType.Parameter("timeZone") String timeZone,
        @CustomType.Parameter("userUpdateTime") String userUpdateTime) {
        this.appEngineHttpTarget = appEngineHttpTarget;
        this.attemptDeadline = attemptDeadline;
        this.description = description;
        this.httpTarget = httpTarget;
        this.lastAttemptTime = lastAttemptTime;
        this.name = name;
        this.pubsubTarget = pubsubTarget;
        this.retryConfig = retryConfig;
        this.schedule = schedule;
        this.scheduleTime = scheduleTime;
        this.state = state;
        this.status = status;
        this.timeZone = timeZone;
        this.userUpdateTime = userUpdateTime;
    }

    /**
     * @return App Engine HTTP target.
     * 
     */
    public AppEngineHttpTargetResponse appEngineHttpTarget() {
        return this.appEngineHttpTarget;
    }
    /**
     * @return The deadline for job attempts. If the request handler does not respond by this deadline then the request is cancelled and the attempt is marked as a `DEADLINE_EXCEEDED` failure. The failed attempt can be viewed in execution logs. Cloud Scheduler will retry the job according to the RetryConfig. The allowed duration for this deadline is: * For HTTP targets, between 15 seconds and 30 minutes. * For App Engine HTTP targets, between 15 seconds and 24 hours 15 seconds.
     * 
     */
    public String attemptDeadline() {
        return this.attemptDeadline;
    }
    /**
     * @return Optionally caller-specified in CreateJob or UpdateJob. A human-readable description for the job. This string must not contain more than 500 characters.
     * 
     */
    public String description() {
        return this.description;
    }
    /**
     * @return HTTP target.
     * 
     */
    public HttpTargetResponse httpTarget() {
        return this.httpTarget;
    }
    /**
     * @return The time the last job attempt started.
     * 
     */
    public String lastAttemptTime() {
        return this.lastAttemptTime;
    }
    /**
     * @return Optionally caller-specified in CreateJob, after which it becomes output only. The job name. For example: `projects/PROJECT_ID/locations/LOCATION_ID/jobs/JOB_ID`. * `PROJECT_ID` can contain letters ([A-Za-z]), numbers ([0-9]), hyphens (-), colons (:), or periods (.). For more information, see [Identifying projects](https://cloud.google.com/resource-manager/docs/creating-managing-projects#identifying_projects) * `LOCATION_ID` is the canonical ID for the job&#39;s location. The list of available locations can be obtained by calling ListLocations. For more information, see https://cloud.google.com/about/locations/. * `JOB_ID` can contain only letters ([A-Za-z]), numbers ([0-9]), hyphens (-), or underscores (_). The maximum length is 500 characters.
     * 
     */
    public String name() {
        return this.name;
    }
    /**
     * @return Pub/Sub target.
     * 
     */
    public PubsubTargetResponse pubsubTarget() {
        return this.pubsubTarget;
    }
    /**
     * @return Settings that determine the retry behavior.
     * 
     */
    public RetryConfigResponse retryConfig() {
        return this.retryConfig;
    }
    /**
     * @return Required, except when used with UpdateJob. Describes the schedule on which the job will be executed. The schedule can be either of the following types: * [Crontab](https://en.wikipedia.org/wiki/Cron#Overview) * English-like [schedule](https://cloud.google.com/scheduler/docs/configuring/cron-job-schedules) As a general rule, execution `n + 1` of a job will not begin until execution `n` has finished. Cloud Scheduler will never allow two simultaneously outstanding executions. For example, this implies that if the `n+1`th execution is scheduled to run at 16:00 but the `n`th execution takes until 16:15, the `n+1`th execution will not start until `16:15`. A scheduled start time will be delayed if the previous execution has not ended when its scheduled time occurs. If retry_count &gt; 0 and a job attempt fails, the job will be tried a total of retry_count times, with exponential backoff, until the next scheduled start time.
     * 
     */
    public String schedule() {
        return this.schedule;
    }
    /**
     * @return The next time the job is scheduled. Note that this may be a retry of a previously failed attempt or the next execution time according to the schedule.
     * 
     */
    public String scheduleTime() {
        return this.scheduleTime;
    }
    /**
     * @return State of the job.
     * 
     */
    public String state() {
        return this.state;
    }
    /**
     * @return The response from the target for the last attempted execution.
     * 
     */
    public StatusResponse status() {
        return this.status;
    }
    /**
     * @return Specifies the time zone to be used in interpreting schedule. The value of this field must be a time zone name from the [tz database](http://en.wikipedia.org/wiki/Tz_database). Note that some time zones include a provision for daylight savings time. The rules for daylight saving time are determined by the chosen tz. For UTC use the string &#34;utc&#34;. If a time zone is not specified, the default will be in UTC (also known as GMT).
     * 
     */
    public String timeZone() {
        return this.timeZone;
    }
    /**
     * @return The creation time of the job.
     * 
     */
    public String userUpdateTime() {
        return this.userUpdateTime;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetJobResult defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private AppEngineHttpTargetResponse appEngineHttpTarget;
        private String attemptDeadline;
        private String description;
        private HttpTargetResponse httpTarget;
        private String lastAttemptTime;
        private String name;
        private PubsubTargetResponse pubsubTarget;
        private RetryConfigResponse retryConfig;
        private String schedule;
        private String scheduleTime;
        private String state;
        private StatusResponse status;
        private String timeZone;
        private String userUpdateTime;

        public Builder() {
    	      // Empty
        }

        public Builder(GetJobResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.appEngineHttpTarget = defaults.appEngineHttpTarget;
    	      this.attemptDeadline = defaults.attemptDeadline;
    	      this.description = defaults.description;
    	      this.httpTarget = defaults.httpTarget;
    	      this.lastAttemptTime = defaults.lastAttemptTime;
    	      this.name = defaults.name;
    	      this.pubsubTarget = defaults.pubsubTarget;
    	      this.retryConfig = defaults.retryConfig;
    	      this.schedule = defaults.schedule;
    	      this.scheduleTime = defaults.scheduleTime;
    	      this.state = defaults.state;
    	      this.status = defaults.status;
    	      this.timeZone = defaults.timeZone;
    	      this.userUpdateTime = defaults.userUpdateTime;
        }

        public Builder appEngineHttpTarget(AppEngineHttpTargetResponse appEngineHttpTarget) {
            this.appEngineHttpTarget = Objects.requireNonNull(appEngineHttpTarget);
            return this;
        }
        public Builder attemptDeadline(String attemptDeadline) {
            this.attemptDeadline = Objects.requireNonNull(attemptDeadline);
            return this;
        }
        public Builder description(String description) {
            this.description = Objects.requireNonNull(description);
            return this;
        }
        public Builder httpTarget(HttpTargetResponse httpTarget) {
            this.httpTarget = Objects.requireNonNull(httpTarget);
            return this;
        }
        public Builder lastAttemptTime(String lastAttemptTime) {
            this.lastAttemptTime = Objects.requireNonNull(lastAttemptTime);
            return this;
        }
        public Builder name(String name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }
        public Builder pubsubTarget(PubsubTargetResponse pubsubTarget) {
            this.pubsubTarget = Objects.requireNonNull(pubsubTarget);
            return this;
        }
        public Builder retryConfig(RetryConfigResponse retryConfig) {
            this.retryConfig = Objects.requireNonNull(retryConfig);
            return this;
        }
        public Builder schedule(String schedule) {
            this.schedule = Objects.requireNonNull(schedule);
            return this;
        }
        public Builder scheduleTime(String scheduleTime) {
            this.scheduleTime = Objects.requireNonNull(scheduleTime);
            return this;
        }
        public Builder state(String state) {
            this.state = Objects.requireNonNull(state);
            return this;
        }
        public Builder status(StatusResponse status) {
            this.status = Objects.requireNonNull(status);
            return this;
        }
        public Builder timeZone(String timeZone) {
            this.timeZone = Objects.requireNonNull(timeZone);
            return this;
        }
        public Builder userUpdateTime(String userUpdateTime) {
            this.userUpdateTime = Objects.requireNonNull(userUpdateTime);
            return this;
        }        public GetJobResult build() {
            return new GetJobResult(appEngineHttpTarget, attemptDeadline, description, httpTarget, lastAttemptTime, name, pubsubTarget, retryConfig, schedule, scheduleTime, state, status, timeZone, userUpdateTime);
        }
    }
}
