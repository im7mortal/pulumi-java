// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.monitoring.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.internal.annotations.InputImport;
import io.pulumi.gcp.monitoring.inputs.SloWindowsBasedSliGoodTotalRatioThresholdBasicSliPerformanceArgs;
import io.pulumi.gcp.monitoring.inputs.SloWindowsBasedSliGoodTotalRatioThresholdPerformanceArgs;
import java.lang.Double;
import java.util.Objects;
import javax.annotation.Nullable;


public final class SloWindowsBasedSliGoodTotalRatioThresholdArgs extends io.pulumi.resources.ResourceArgs {

    public static final SloWindowsBasedSliGoodTotalRatioThresholdArgs Empty = new SloWindowsBasedSliGoodTotalRatioThresholdArgs();

    /**
     * Basic SLI to evaluate to judge window quality.
     * Structure is documented below.
     * 
     */
    @InputImport(name="basicSliPerformance")
    private final @Nullable Input<SloWindowsBasedSliGoodTotalRatioThresholdBasicSliPerformanceArgs> basicSliPerformance;

    public Input<SloWindowsBasedSliGoodTotalRatioThresholdBasicSliPerformanceArgs> getBasicSliPerformance() {
        return this.basicSliPerformance == null ? Input.empty() : this.basicSliPerformance;
    }

    /**
     * Request-based SLI to evaluate to judge window quality.
     * Structure is documented below.
     * 
     */
    @InputImport(name="performance")
    private final @Nullable Input<SloWindowsBasedSliGoodTotalRatioThresholdPerformanceArgs> performance;

    public Input<SloWindowsBasedSliGoodTotalRatioThresholdPerformanceArgs> getPerformance() {
        return this.performance == null ? Input.empty() : this.performance;
    }

    /**
     * A duration string, e.g. 10s.
     * Good service is defined to be the count of requests made to
     * this service that return in no more than threshold.
     * 
     */
    @InputImport(name="threshold")
    private final @Nullable Input<Double> threshold;

    public Input<Double> getThreshold() {
        return this.threshold == null ? Input.empty() : this.threshold;
    }

    public SloWindowsBasedSliGoodTotalRatioThresholdArgs(
        @Nullable Input<SloWindowsBasedSliGoodTotalRatioThresholdBasicSliPerformanceArgs> basicSliPerformance,
        @Nullable Input<SloWindowsBasedSliGoodTotalRatioThresholdPerformanceArgs> performance,
        @Nullable Input<Double> threshold) {
        this.basicSliPerformance = basicSliPerformance;
        this.performance = performance;
        this.threshold = threshold;
    }

    private SloWindowsBasedSliGoodTotalRatioThresholdArgs() {
        this.basicSliPerformance = Input.empty();
        this.performance = Input.empty();
        this.threshold = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(SloWindowsBasedSliGoodTotalRatioThresholdArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<SloWindowsBasedSliGoodTotalRatioThresholdBasicSliPerformanceArgs> basicSliPerformance;
        private @Nullable Input<SloWindowsBasedSliGoodTotalRatioThresholdPerformanceArgs> performance;
        private @Nullable Input<Double> threshold;

        public Builder() {
    	      // Empty
        }

        public Builder(SloWindowsBasedSliGoodTotalRatioThresholdArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.basicSliPerformance = defaults.basicSliPerformance;
    	      this.performance = defaults.performance;
    	      this.threshold = defaults.threshold;
        }

        public Builder setBasicSliPerformance(@Nullable Input<SloWindowsBasedSliGoodTotalRatioThresholdBasicSliPerformanceArgs> basicSliPerformance) {
            this.basicSliPerformance = basicSliPerformance;
            return this;
        }

        public Builder setBasicSliPerformance(@Nullable SloWindowsBasedSliGoodTotalRatioThresholdBasicSliPerformanceArgs basicSliPerformance) {
            this.basicSliPerformance = Input.ofNullable(basicSliPerformance);
            return this;
        }

        public Builder setPerformance(@Nullable Input<SloWindowsBasedSliGoodTotalRatioThresholdPerformanceArgs> performance) {
            this.performance = performance;
            return this;
        }

        public Builder setPerformance(@Nullable SloWindowsBasedSliGoodTotalRatioThresholdPerformanceArgs performance) {
            this.performance = Input.ofNullable(performance);
            return this;
        }

        public Builder setThreshold(@Nullable Input<Double> threshold) {
            this.threshold = threshold;
            return this;
        }

        public Builder setThreshold(@Nullable Double threshold) {
            this.threshold = Input.ofNullable(threshold);
            return this;
        }

        public SloWindowsBasedSliGoodTotalRatioThresholdArgs build() {
            return new SloWindowsBasedSliGoodTotalRatioThresholdArgs(basicSliPerformance, performance, threshold);
        }
    }
}