// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.iotevents.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class DetectorModelSetTimer {
    /**
     * The duration of the timer, in seconds. You can use a string expression that includes numbers, variables (`$variable.<variable-name>`), and input values (`$input.<input-name>.<path-to-datum>`) as the duration. The range of the duration is `1-31622400` seconds. To ensure accuracy, the minimum duration is `60` seconds. The evaluated result of the duration is rounded down to the nearest whole number.
     * 
     */
    private final @Nullable String durationExpression;
    /**
     * The number of seconds until the timer expires. The minimum value is `60` seconds to ensure accuracy. The maximum value is `31622400` seconds.
     * 
     */
    private final @Nullable Integer seconds;
    /**
     * The name of the timer.
     * 
     */
    private final String timerName;

    @OutputCustomType.Constructor({"durationExpression","seconds","timerName"})
    private DetectorModelSetTimer(
        @Nullable String durationExpression,
        @Nullable Integer seconds,
        String timerName) {
        this.durationExpression = durationExpression;
        this.seconds = seconds;
        this.timerName = Objects.requireNonNull(timerName);
    }

    /**
     * The duration of the timer, in seconds. You can use a string expression that includes numbers, variables (`$variable.<variable-name>`), and input values (`$input.<input-name>.<path-to-datum>`) as the duration. The range of the duration is `1-31622400` seconds. To ensure accuracy, the minimum duration is `60` seconds. The evaluated result of the duration is rounded down to the nearest whole number.
     * 
    */
    public Optional<String> getDurationExpression() {
        return Optional.ofNullable(this.durationExpression);
    }
    /**
     * The number of seconds until the timer expires. The minimum value is `60` seconds to ensure accuracy. The maximum value is `31622400` seconds.
     * 
    */
    public Optional<Integer> getSeconds() {
        return Optional.ofNullable(this.seconds);
    }
    /**
     * The name of the timer.
     * 
    */
    public String getTimerName() {
        return this.timerName;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(DetectorModelSetTimer defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String durationExpression;
        private @Nullable Integer seconds;
        private String timerName;

        public Builder() {
    	      // Empty
        }

        public Builder(DetectorModelSetTimer defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.durationExpression = defaults.durationExpression;
    	      this.seconds = defaults.seconds;
    	      this.timerName = defaults.timerName;
        }

        public Builder setDurationExpression(@Nullable String durationExpression) {
            this.durationExpression = durationExpression;
            return this;
        }

        public Builder setSeconds(@Nullable Integer seconds) {
            this.seconds = seconds;
            return this;
        }

        public Builder setTimerName(String timerName) {
            this.timerName = Objects.requireNonNull(timerName);
            return this;
        }
        public DetectorModelSetTimer build() {
            return new DetectorModelSetTimer(durationExpression, seconds, timerName);
        }
    }
}
