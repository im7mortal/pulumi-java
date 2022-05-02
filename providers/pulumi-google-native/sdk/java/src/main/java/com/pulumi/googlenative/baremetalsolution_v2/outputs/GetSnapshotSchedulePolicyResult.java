// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.baremetalsolution_v2.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.googlenative.baremetalsolution_v2.outputs.ScheduleResponse;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Objects;

@CustomType
public final class GetSnapshotSchedulePolicyResult {
    /**
     * @return The description of the snapshot schedule policy.
     * 
     */
    private final String description;
    /**
     * @return Labels as key value pairs.
     * 
     */
    private final Map<String,String> labels;
    /**
     * @return The name of the snapshot schedule policy.
     * 
     */
    private final String name;
    /**
     * @return The snapshot schedules contained in this policy. You can specify a maximum of 5 schedules.
     * 
     */
    private final List<ScheduleResponse> schedules;
    /**
     * @return The state of the snapshot schedule policy.
     * 
     */
    private final String state;

    @CustomType.Constructor
    private GetSnapshotSchedulePolicyResult(
        @CustomType.Parameter("description") String description,
        @CustomType.Parameter("labels") Map<String,String> labels,
        @CustomType.Parameter("name") String name,
        @CustomType.Parameter("schedules") List<ScheduleResponse> schedules,
        @CustomType.Parameter("state") String state) {
        this.description = description;
        this.labels = labels;
        this.name = name;
        this.schedules = schedules;
        this.state = state;
    }

    /**
     * @return The description of the snapshot schedule policy.
     * 
     */
    public String description() {
        return this.description;
    }
    /**
     * @return Labels as key value pairs.
     * 
     */
    public Map<String,String> labels() {
        return this.labels;
    }
    /**
     * @return The name of the snapshot schedule policy.
     * 
     */
    public String name() {
        return this.name;
    }
    /**
     * @return The snapshot schedules contained in this policy. You can specify a maximum of 5 schedules.
     * 
     */
    public List<ScheduleResponse> schedules() {
        return this.schedules;
    }
    /**
     * @return The state of the snapshot schedule policy.
     * 
     */
    public String state() {
        return this.state;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetSnapshotSchedulePolicyResult defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String description;
        private Map<String,String> labels;
        private String name;
        private List<ScheduleResponse> schedules;
        private String state;

        public Builder() {
    	      // Empty
        }

        public Builder(GetSnapshotSchedulePolicyResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.description = defaults.description;
    	      this.labels = defaults.labels;
    	      this.name = defaults.name;
    	      this.schedules = defaults.schedules;
    	      this.state = defaults.state;
        }

        public Builder description(String description) {
            this.description = Objects.requireNonNull(description);
            return this;
        }
        public Builder labels(Map<String,String> labels) {
            this.labels = Objects.requireNonNull(labels);
            return this;
        }
        public Builder name(String name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }
        public Builder schedules(List<ScheduleResponse> schedules) {
            this.schedules = Objects.requireNonNull(schedules);
            return this;
        }
        public Builder schedules(ScheduleResponse... schedules) {
            return schedules(List.of(schedules));
        }
        public Builder state(String state) {
            this.state = Objects.requireNonNull(state);
            return this;
        }        public GetSnapshotSchedulePolicyResult build() {
            return new GetSnapshotSchedulePolicyResult(description, labels, name, schedules, state);
        }
    }
}
