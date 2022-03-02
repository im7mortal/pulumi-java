// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.metastore_v1alpha.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import java.lang.String;
import java.util.Objects;

@OutputCustomType
public final class RestoreResponse {
    /**
     * The relative resource name of the metastore service backup to restore from, in the following form:projects/{project_id}/locations/{location_id}/services/{service_id}/backups/{backup_id}.
     * 
     */
    private final String backup;
    /**
     * The restore details containing the revision of the service to be restored to, in format of JSON.
     * 
     */
    private final String details;
    /**
     * The time when the restore ended.
     * 
     */
    private final String endTime;
    /**
     * The time when the restore started.
     * 
     */
    private final String startTime;
    /**
     * The current state of the restore.
     * 
     */
    private final String state;
    /**
     * The type of restore.
     * 
     */
    private final String type;

    @OutputCustomType.Constructor({"backup","details","endTime","startTime","state","type"})
    private RestoreResponse(
        String backup,
        String details,
        String endTime,
        String startTime,
        String state,
        String type) {
        this.backup = Objects.requireNonNull(backup);
        this.details = Objects.requireNonNull(details);
        this.endTime = Objects.requireNonNull(endTime);
        this.startTime = Objects.requireNonNull(startTime);
        this.state = Objects.requireNonNull(state);
        this.type = Objects.requireNonNull(type);
    }

    /**
     * The relative resource name of the metastore service backup to restore from, in the following form:projects/{project_id}/locations/{location_id}/services/{service_id}/backups/{backup_id}.
     * 
    */
    public String getBackup() {
        return this.backup;
    }
    /**
     * The restore details containing the revision of the service to be restored to, in format of JSON.
     * 
    */
    public String getDetails() {
        return this.details;
    }
    /**
     * The time when the restore ended.
     * 
    */
    public String getEndTime() {
        return this.endTime;
    }
    /**
     * The time when the restore started.
     * 
    */
    public String getStartTime() {
        return this.startTime;
    }
    /**
     * The current state of the restore.
     * 
    */
    public String getState() {
        return this.state;
    }
    /**
     * The type of restore.
     * 
    */
    public String getType() {
        return this.type;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(RestoreResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String backup;
        private String details;
        private String endTime;
        private String startTime;
        private String state;
        private String type;

        public Builder() {
    	      // Empty
        }

        public Builder(RestoreResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.backup = defaults.backup;
    	      this.details = defaults.details;
    	      this.endTime = defaults.endTime;
    	      this.startTime = defaults.startTime;
    	      this.state = defaults.state;
    	      this.type = defaults.type;
        }

        public Builder setBackup(String backup) {
            this.backup = Objects.requireNonNull(backup);
            return this;
        }

        public Builder setDetails(String details) {
            this.details = Objects.requireNonNull(details);
            return this;
        }

        public Builder setEndTime(String endTime) {
            this.endTime = Objects.requireNonNull(endTime);
            return this;
        }

        public Builder setStartTime(String startTime) {
            this.startTime = Objects.requireNonNull(startTime);
            return this;
        }

        public Builder setState(String state) {
            this.state = Objects.requireNonNull(state);
            return this;
        }

        public Builder setType(String type) {
            this.type = Objects.requireNonNull(type);
            return this;
        }
        public RestoreResponse build() {
            return new RestoreResponse(backup, details, endTime, startTime, state, type);
        }
    }
}
