// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.alertsmanagement.outputs;

import io.pulumi.azurenative.alertsmanagement.outputs.SuppressionScheduleResponse;
import io.pulumi.core.annotations.OutputCustomType;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class SuppressionConfigResponse {
    /**
     * Specifies when the suppression should be applied
     * 
     */
    private final String recurrenceType;
    /**
     * suppression schedule configuration
     * 
     */
    private final @Nullable SuppressionScheduleResponse schedule;

    @OutputCustomType.Constructor({"recurrenceType","schedule"})
    private SuppressionConfigResponse(
        String recurrenceType,
        @Nullable SuppressionScheduleResponse schedule) {
        this.recurrenceType = Objects.requireNonNull(recurrenceType);
        this.schedule = schedule;
    }

    /**
     * Specifies when the suppression should be applied
     * 
    */
    public String getRecurrenceType() {
        return this.recurrenceType;
    }
    /**
     * suppression schedule configuration
     * 
    */
    public Optional<SuppressionScheduleResponse> getSchedule() {
        return Optional.ofNullable(this.schedule);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(SuppressionConfigResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String recurrenceType;
        private @Nullable SuppressionScheduleResponse schedule;

        public Builder() {
    	      // Empty
        }

        public Builder(SuppressionConfigResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.recurrenceType = defaults.recurrenceType;
    	      this.schedule = defaults.schedule;
        }

        public Builder setRecurrenceType(String recurrenceType) {
            this.recurrenceType = Objects.requireNonNull(recurrenceType);
            return this;
        }

        public Builder setSchedule(@Nullable SuppressionScheduleResponse schedule) {
            this.schedule = schedule;
            return this;
        }
        public SuppressionConfigResponse build() {
            return new SuppressionConfigResponse(recurrenceType, schedule);
        }
    }
}
