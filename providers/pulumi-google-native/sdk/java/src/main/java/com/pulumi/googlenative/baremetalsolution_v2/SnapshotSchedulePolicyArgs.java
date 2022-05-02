// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.baremetalsolution_v2;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.googlenative.baremetalsolution_v2.enums.SnapshotSchedulePolicyState;
import com.pulumi.googlenative.baremetalsolution_v2.inputs.ScheduleArgs;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class SnapshotSchedulePolicyArgs extends com.pulumi.resources.ResourceArgs {

    public static final SnapshotSchedulePolicyArgs Empty = new SnapshotSchedulePolicyArgs();

    /**
     * The description of the snapshot schedule policy.
     * 
     */
    @Import(name="description")
    private @Nullable Output<String> description;

    /**
     * @return The description of the snapshot schedule policy.
     * 
     */
    public Optional<Output<String>> description() {
        return Optional.ofNullable(this.description);
    }

    /**
     * An identifier for the snapshot schedule policy, generated by the backend.
     * 
     */
    @Import(name="id")
    private @Nullable Output<String> id;

    /**
     * @return An identifier for the snapshot schedule policy, generated by the backend.
     * 
     */
    public Optional<Output<String>> id() {
        return Optional.ofNullable(this.id);
    }

    /**
     * Labels as key value pairs.
     * 
     */
    @Import(name="labels")
    private @Nullable Output<Map<String,String>> labels;

    /**
     * @return Labels as key value pairs.
     * 
     */
    public Optional<Output<Map<String,String>>> labels() {
        return Optional.ofNullable(this.labels);
    }

    @Import(name="location")
    private @Nullable Output<String> location;

    public Optional<Output<String>> location() {
        return Optional.ofNullable(this.location);
    }

    @Import(name="project")
    private @Nullable Output<String> project;

    public Optional<Output<String>> project() {
        return Optional.ofNullable(this.project);
    }

    /**
     * The snapshot schedules contained in this policy. You can specify a maximum of 5 schedules.
     * 
     */
    @Import(name="schedules")
    private @Nullable Output<List<ScheduleArgs>> schedules;

    /**
     * @return The snapshot schedules contained in this policy. You can specify a maximum of 5 schedules.
     * 
     */
    public Optional<Output<List<ScheduleArgs>>> schedules() {
        return Optional.ofNullable(this.schedules);
    }

    /**
     * Required. Snapshot policy ID
     * 
     */
    @Import(name="snapshotSchedulePolicyId", required=true)
    private Output<String> snapshotSchedulePolicyId;

    /**
     * @return Required. Snapshot policy ID
     * 
     */
    public Output<String> snapshotSchedulePolicyId() {
        return this.snapshotSchedulePolicyId;
    }

    /**
     * The state of the snapshot schedule policy.
     * 
     */
    @Import(name="state")
    private @Nullable Output<SnapshotSchedulePolicyState> state;

    /**
     * @return The state of the snapshot schedule policy.
     * 
     */
    public Optional<Output<SnapshotSchedulePolicyState>> state() {
        return Optional.ofNullable(this.state);
    }

    private SnapshotSchedulePolicyArgs() {}

    private SnapshotSchedulePolicyArgs(SnapshotSchedulePolicyArgs $) {
        this.description = $.description;
        this.id = $.id;
        this.labels = $.labels;
        this.location = $.location;
        this.project = $.project;
        this.schedules = $.schedules;
        this.snapshotSchedulePolicyId = $.snapshotSchedulePolicyId;
        this.state = $.state;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(SnapshotSchedulePolicyArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private SnapshotSchedulePolicyArgs $;

        public Builder() {
            $ = new SnapshotSchedulePolicyArgs();
        }

        public Builder(SnapshotSchedulePolicyArgs defaults) {
            $ = new SnapshotSchedulePolicyArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param description The description of the snapshot schedule policy.
         * 
         * @return builder
         * 
         */
        public Builder description(@Nullable Output<String> description) {
            $.description = description;
            return this;
        }

        /**
         * @param description The description of the snapshot schedule policy.
         * 
         * @return builder
         * 
         */
        public Builder description(String description) {
            return description(Output.of(description));
        }

        /**
         * @param id An identifier for the snapshot schedule policy, generated by the backend.
         * 
         * @return builder
         * 
         */
        public Builder id(@Nullable Output<String> id) {
            $.id = id;
            return this;
        }

        /**
         * @param id An identifier for the snapshot schedule policy, generated by the backend.
         * 
         * @return builder
         * 
         */
        public Builder id(String id) {
            return id(Output.of(id));
        }

        /**
         * @param labels Labels as key value pairs.
         * 
         * @return builder
         * 
         */
        public Builder labels(@Nullable Output<Map<String,String>> labels) {
            $.labels = labels;
            return this;
        }

        /**
         * @param labels Labels as key value pairs.
         * 
         * @return builder
         * 
         */
        public Builder labels(Map<String,String> labels) {
            return labels(Output.of(labels));
        }

        public Builder location(@Nullable Output<String> location) {
            $.location = location;
            return this;
        }

        public Builder location(String location) {
            return location(Output.of(location));
        }

        public Builder project(@Nullable Output<String> project) {
            $.project = project;
            return this;
        }

        public Builder project(String project) {
            return project(Output.of(project));
        }

        /**
         * @param schedules The snapshot schedules contained in this policy. You can specify a maximum of 5 schedules.
         * 
         * @return builder
         * 
         */
        public Builder schedules(@Nullable Output<List<ScheduleArgs>> schedules) {
            $.schedules = schedules;
            return this;
        }

        /**
         * @param schedules The snapshot schedules contained in this policy. You can specify a maximum of 5 schedules.
         * 
         * @return builder
         * 
         */
        public Builder schedules(List<ScheduleArgs> schedules) {
            return schedules(Output.of(schedules));
        }

        /**
         * @param schedules The snapshot schedules contained in this policy. You can specify a maximum of 5 schedules.
         * 
         * @return builder
         * 
         */
        public Builder schedules(ScheduleArgs... schedules) {
            return schedules(List.of(schedules));
        }

        /**
         * @param snapshotSchedulePolicyId Required. Snapshot policy ID
         * 
         * @return builder
         * 
         */
        public Builder snapshotSchedulePolicyId(Output<String> snapshotSchedulePolicyId) {
            $.snapshotSchedulePolicyId = snapshotSchedulePolicyId;
            return this;
        }

        /**
         * @param snapshotSchedulePolicyId Required. Snapshot policy ID
         * 
         * @return builder
         * 
         */
        public Builder snapshotSchedulePolicyId(String snapshotSchedulePolicyId) {
            return snapshotSchedulePolicyId(Output.of(snapshotSchedulePolicyId));
        }

        /**
         * @param state The state of the snapshot schedule policy.
         * 
         * @return builder
         * 
         */
        public Builder state(@Nullable Output<SnapshotSchedulePolicyState> state) {
            $.state = state;
            return this;
        }

        /**
         * @param state The state of the snapshot schedule policy.
         * 
         * @return builder
         * 
         */
        public Builder state(SnapshotSchedulePolicyState state) {
            return state(Output.of(state));
        }

        public SnapshotSchedulePolicyArgs build() {
            $.snapshotSchedulePolicyId = Objects.requireNonNull($.snapshotSchedulePolicyId, "expected parameter 'snapshotSchedulePolicyId' to be non-null");
            return $;
        }
    }

}
