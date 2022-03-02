// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.recoveryservices.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class LogSchedulePolicyResponse {
    /**
     * Frequency of the log schedule operation of this policy in minutes.
     * 
     */
    private final @Nullable Integer scheduleFrequencyInMins;
    /**
     * This property will be used as the discriminator for deciding the specific types in the polymorphic chain of types.
     * Expected value is 'LogSchedulePolicy'.
     * 
     */
    private final String schedulePolicyType;

    @OutputCustomType.Constructor({"scheduleFrequencyInMins","schedulePolicyType"})
    private LogSchedulePolicyResponse(
        @Nullable Integer scheduleFrequencyInMins,
        String schedulePolicyType) {
        this.scheduleFrequencyInMins = scheduleFrequencyInMins;
        this.schedulePolicyType = Objects.requireNonNull(schedulePolicyType);
    }

    /**
     * Frequency of the log schedule operation of this policy in minutes.
     * 
    */
    public Optional<Integer> getScheduleFrequencyInMins() {
        return Optional.ofNullable(this.scheduleFrequencyInMins);
    }
    /**
     * This property will be used as the discriminator for deciding the specific types in the polymorphic chain of types.
     * Expected value is 'LogSchedulePolicy'.
     * 
    */
    public String getSchedulePolicyType() {
        return this.schedulePolicyType;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(LogSchedulePolicyResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Integer scheduleFrequencyInMins;
        private String schedulePolicyType;

        public Builder() {
    	      // Empty
        }

        public Builder(LogSchedulePolicyResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.scheduleFrequencyInMins = defaults.scheduleFrequencyInMins;
    	      this.schedulePolicyType = defaults.schedulePolicyType;
        }

        public Builder setScheduleFrequencyInMins(@Nullable Integer scheduleFrequencyInMins) {
            this.scheduleFrequencyInMins = scheduleFrequencyInMins;
            return this;
        }

        public Builder setSchedulePolicyType(String schedulePolicyType) {
            this.schedulePolicyType = Objects.requireNonNull(schedulePolicyType);
            return this;
        }
        public LogSchedulePolicyResponse build() {
            return new LogSchedulePolicyResponse(scheduleFrequencyInMins, schedulePolicyType);
        }
    }
}
