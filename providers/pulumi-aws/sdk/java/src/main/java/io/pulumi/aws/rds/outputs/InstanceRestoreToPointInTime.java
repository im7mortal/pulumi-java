// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.rds.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import java.lang.Boolean;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class InstanceRestoreToPointInTime {
    /**
     * The date and time to restore from. Value must be a time in Universal Coordinated Time (UTC) format and must be before the latest restorable time for the DB instance. Cannot be specified with `use_latest_restorable_time`.
     * 
     */
    private final @Nullable String restoreTime;
    /**
     * The identifier of the source DB instance from which to restore. Must match the identifier of an existing DB instance. Required if `source_dbi_resource_id` is not specified.
     * 
     */
    private final @Nullable String sourceDbInstanceIdentifier;
    /**
     * The resource ID of the source DB instance from which to restore. Required if `source_db_instance_identifier` is not specified.
     * 
     */
    private final @Nullable String sourceDbiResourceId;
    /**
     * A boolean value that indicates whether the DB instance is restored from the latest backup time. Defaults to `false`. Cannot be specified with `restore_time`.
     * 
     */
    private final @Nullable Boolean useLatestRestorableTime;

    @OutputCustomType.Constructor({"restoreTime","sourceDbInstanceIdentifier","sourceDbiResourceId","useLatestRestorableTime"})
    private InstanceRestoreToPointInTime(
        @Nullable String restoreTime,
        @Nullable String sourceDbInstanceIdentifier,
        @Nullable String sourceDbiResourceId,
        @Nullable Boolean useLatestRestorableTime) {
        this.restoreTime = restoreTime;
        this.sourceDbInstanceIdentifier = sourceDbInstanceIdentifier;
        this.sourceDbiResourceId = sourceDbiResourceId;
        this.useLatestRestorableTime = useLatestRestorableTime;
    }

    /**
     * The date and time to restore from. Value must be a time in Universal Coordinated Time (UTC) format and must be before the latest restorable time for the DB instance. Cannot be specified with `use_latest_restorable_time`.
     * 
    */
    public Optional<String> getRestoreTime() {
        return Optional.ofNullable(this.restoreTime);
    }
    /**
     * The identifier of the source DB instance from which to restore. Must match the identifier of an existing DB instance. Required if `source_dbi_resource_id` is not specified.
     * 
    */
    public Optional<String> getSourceDbInstanceIdentifier() {
        return Optional.ofNullable(this.sourceDbInstanceIdentifier);
    }
    /**
     * The resource ID of the source DB instance from which to restore. Required if `source_db_instance_identifier` is not specified.
     * 
    */
    public Optional<String> getSourceDbiResourceId() {
        return Optional.ofNullable(this.sourceDbiResourceId);
    }
    /**
     * A boolean value that indicates whether the DB instance is restored from the latest backup time. Defaults to `false`. Cannot be specified with `restore_time`.
     * 
    */
    public Optional<Boolean> getUseLatestRestorableTime() {
        return Optional.ofNullable(this.useLatestRestorableTime);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(InstanceRestoreToPointInTime defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String restoreTime;
        private @Nullable String sourceDbInstanceIdentifier;
        private @Nullable String sourceDbiResourceId;
        private @Nullable Boolean useLatestRestorableTime;

        public Builder() {
    	      // Empty
        }

        public Builder(InstanceRestoreToPointInTime defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.restoreTime = defaults.restoreTime;
    	      this.sourceDbInstanceIdentifier = defaults.sourceDbInstanceIdentifier;
    	      this.sourceDbiResourceId = defaults.sourceDbiResourceId;
    	      this.useLatestRestorableTime = defaults.useLatestRestorableTime;
        }

        public Builder setRestoreTime(@Nullable String restoreTime) {
            this.restoreTime = restoreTime;
            return this;
        }

        public Builder setSourceDbInstanceIdentifier(@Nullable String sourceDbInstanceIdentifier) {
            this.sourceDbInstanceIdentifier = sourceDbInstanceIdentifier;
            return this;
        }

        public Builder setSourceDbiResourceId(@Nullable String sourceDbiResourceId) {
            this.sourceDbiResourceId = sourceDbiResourceId;
            return this;
        }

        public Builder setUseLatestRestorableTime(@Nullable Boolean useLatestRestorableTime) {
            this.useLatestRestorableTime = useLatestRestorableTime;
            return this;
        }
        public InstanceRestoreToPointInTime build() {
            return new InstanceRestoreToPointInTime(restoreTime, sourceDbInstanceIdentifier, sourceDbiResourceId, useLatestRestorableTime);
        }
    }
}
