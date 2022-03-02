// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.monitoring.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import java.lang.Boolean;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class SloWindowsBasedSliGoodTotalRatioThresholdBasicSliPerformanceAvailability {
    /**
     * Whether an availability SLI is enabled or not. Must be set to ` true. Defaults to  `true`.
     * 
     */
    private final @Nullable Boolean enabled;

    @OutputCustomType.Constructor({"enabled"})
    private SloWindowsBasedSliGoodTotalRatioThresholdBasicSliPerformanceAvailability(@Nullable Boolean enabled) {
        this.enabled = enabled;
    }

    /**
     * Whether an availability SLI is enabled or not. Must be set to ` true. Defaults to  `true`.
     * 
    */
    public Optional<Boolean> getEnabled() {
        return Optional.ofNullable(this.enabled);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(SloWindowsBasedSliGoodTotalRatioThresholdBasicSliPerformanceAvailability defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Boolean enabled;

        public Builder() {
    	      // Empty
        }

        public Builder(SloWindowsBasedSliGoodTotalRatioThresholdBasicSliPerformanceAvailability defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.enabled = defaults.enabled;
        }

        public Builder setEnabled(@Nullable Boolean enabled) {
            this.enabled = enabled;
            return this;
        }
        public SloWindowsBasedSliGoodTotalRatioThresholdBasicSliPerformanceAvailability build() {
            return new SloWindowsBasedSliGoodTotalRatioThresholdBasicSliPerformanceAvailability(enabled);
        }
    }
}
