// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.compute_alpha.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;

@OutputCustomType
public final class ResourcePolicyHourlyCycleResponse {
    /**
     * [Output only] Duration of the time window, automatically chosen to be smallest possible in the given scenario.
     * 
     */
    private final String duration;
    /**
     * Defines a schedule with units measured in hours. The value determines how many hours pass between the start of each cycle.
     * 
     */
    private final Integer hoursInCycle;
    /**
     * Time within the window to start the operations. It must be in format "HH:MM", where HH : [00-23] and MM : [00-00] GMT.
     * 
     */
    private final String startTime;

    @OutputCustomType.Constructor({"duration","hoursInCycle","startTime"})
    private ResourcePolicyHourlyCycleResponse(
        String duration,
        Integer hoursInCycle,
        String startTime) {
        this.duration = Objects.requireNonNull(duration);
        this.hoursInCycle = Objects.requireNonNull(hoursInCycle);
        this.startTime = Objects.requireNonNull(startTime);
    }

    /**
     * [Output only] Duration of the time window, automatically chosen to be smallest possible in the given scenario.
     * 
    */
    public String getDuration() {
        return this.duration;
    }
    /**
     * Defines a schedule with units measured in hours. The value determines how many hours pass between the start of each cycle.
     * 
    */
    public Integer getHoursInCycle() {
        return this.hoursInCycle;
    }
    /**
     * Time within the window to start the operations. It must be in format "HH:MM", where HH : [00-23] and MM : [00-00] GMT.
     * 
    */
    public String getStartTime() {
        return this.startTime;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ResourcePolicyHourlyCycleResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String duration;
        private Integer hoursInCycle;
        private String startTime;

        public Builder() {
    	      // Empty
        }

        public Builder(ResourcePolicyHourlyCycleResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.duration = defaults.duration;
    	      this.hoursInCycle = defaults.hoursInCycle;
    	      this.startTime = defaults.startTime;
        }

        public Builder setDuration(String duration) {
            this.duration = Objects.requireNonNull(duration);
            return this;
        }

        public Builder setHoursInCycle(Integer hoursInCycle) {
            this.hoursInCycle = Objects.requireNonNull(hoursInCycle);
            return this;
        }

        public Builder setStartTime(String startTime) {
            this.startTime = Objects.requireNonNull(startTime);
            return this;
        }
        public ResourcePolicyHourlyCycleResponse build() {
            return new ResourcePolicyHourlyCycleResponse(duration, hoursInCycle, startTime);
        }
    }
}
