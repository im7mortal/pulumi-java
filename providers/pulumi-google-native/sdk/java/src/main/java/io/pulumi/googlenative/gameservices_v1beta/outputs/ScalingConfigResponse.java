// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.gameservices_v1beta.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import io.pulumi.googlenative.gameservices_v1beta.outputs.LabelSelectorResponse;
import io.pulumi.googlenative.gameservices_v1beta.outputs.ScheduleResponse;
import java.lang.String;
import java.util.List;
import java.util.Objects;

@OutputCustomType
public final class ScalingConfigResponse {
    /**
     * Agones fleet autoscaler spec. Example spec: https://agones.dev/site/docs/reference/fleetautoscaler/
     * 
     */
    private final String fleetAutoscalerSpec;
    /**
     * The name of the Scaling Config
     * 
     */
    private final String name;
    /**
     * The schedules to which this Scaling Config applies.
     * 
     */
    private final List<ScheduleResponse> schedules;
    /**
     * Labels used to identify the game server clusters to which this Agones scaling config applies. A game server cluster is subject to this Agones scaling config if its labels match any of the selector entries.
     * 
     */
    private final List<LabelSelectorResponse> selectors;

    @OutputCustomType.Constructor({"fleetAutoscalerSpec","name","schedules","selectors"})
    private ScalingConfigResponse(
        String fleetAutoscalerSpec,
        String name,
        List<ScheduleResponse> schedules,
        List<LabelSelectorResponse> selectors) {
        this.fleetAutoscalerSpec = Objects.requireNonNull(fleetAutoscalerSpec);
        this.name = Objects.requireNonNull(name);
        this.schedules = Objects.requireNonNull(schedules);
        this.selectors = Objects.requireNonNull(selectors);
    }

    /**
     * Agones fleet autoscaler spec. Example spec: https://agones.dev/site/docs/reference/fleetautoscaler/
     * 
    */
    public String getFleetAutoscalerSpec() {
        return this.fleetAutoscalerSpec;
    }
    /**
     * The name of the Scaling Config
     * 
    */
    public String getName() {
        return this.name;
    }
    /**
     * The schedules to which this Scaling Config applies.
     * 
    */
    public List<ScheduleResponse> getSchedules() {
        return this.schedules;
    }
    /**
     * Labels used to identify the game server clusters to which this Agones scaling config applies. A game server cluster is subject to this Agones scaling config if its labels match any of the selector entries.
     * 
    */
    public List<LabelSelectorResponse> getSelectors() {
        return this.selectors;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ScalingConfigResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String fleetAutoscalerSpec;
        private String name;
        private List<ScheduleResponse> schedules;
        private List<LabelSelectorResponse> selectors;

        public Builder() {
    	      // Empty
        }

        public Builder(ScalingConfigResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.fleetAutoscalerSpec = defaults.fleetAutoscalerSpec;
    	      this.name = defaults.name;
    	      this.schedules = defaults.schedules;
    	      this.selectors = defaults.selectors;
        }

        public Builder setFleetAutoscalerSpec(String fleetAutoscalerSpec) {
            this.fleetAutoscalerSpec = Objects.requireNonNull(fleetAutoscalerSpec);
            return this;
        }

        public Builder setName(String name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }

        public Builder setSchedules(List<ScheduleResponse> schedules) {
            this.schedules = Objects.requireNonNull(schedules);
            return this;
        }

        public Builder setSelectors(List<LabelSelectorResponse> selectors) {
            this.selectors = Objects.requireNonNull(selectors);
            return this;
        }
        public ScalingConfigResponse build() {
            return new ScalingConfigResponse(fleetAutoscalerSpec, name, schedules, selectors);
        }
    }
}
