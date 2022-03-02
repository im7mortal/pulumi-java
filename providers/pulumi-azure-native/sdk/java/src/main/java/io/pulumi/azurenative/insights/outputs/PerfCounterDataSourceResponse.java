// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.insights.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class PerfCounterDataSourceResponse {
    /**
     * A list of specifier names of the performance counters you want to collect.
     * Use a wildcard (*) to collect a counter for all instances.
     * To get a list of performance counters on Windows, run the command 'typeperf'.
     * 
     */
    private final @Nullable List<String> counterSpecifiers;
    /**
     * A friendly name for the data source.
     * This name should be unique across all data sources (regardless of type) within the data collection rule.
     * 
     */
    private final @Nullable String name;
    /**
     * The number of seconds between consecutive counter measurements (samples).
     * 
     */
    private final @Nullable Integer samplingFrequencyInSeconds;
    /**
     * List of streams that this data source will be sent to.
     * A stream indicates what schema will be used for this data and usually what table in Log Analytics the data will be sent to.
     * 
     */
    private final @Nullable List<String> streams;

    @OutputCustomType.Constructor({"counterSpecifiers","name","samplingFrequencyInSeconds","streams"})
    private PerfCounterDataSourceResponse(
        @Nullable List<String> counterSpecifiers,
        @Nullable String name,
        @Nullable Integer samplingFrequencyInSeconds,
        @Nullable List<String> streams) {
        this.counterSpecifiers = counterSpecifiers;
        this.name = name;
        this.samplingFrequencyInSeconds = samplingFrequencyInSeconds;
        this.streams = streams;
    }

    /**
     * A list of specifier names of the performance counters you want to collect.
     * Use a wildcard (*) to collect a counter for all instances.
     * To get a list of performance counters on Windows, run the command 'typeperf'.
     * 
    */
    public List<String> getCounterSpecifiers() {
        return this.counterSpecifiers == null ? List.of() : this.counterSpecifiers;
    }
    /**
     * A friendly name for the data source.
     * This name should be unique across all data sources (regardless of type) within the data collection rule.
     * 
    */
    public Optional<String> getName() {
        return Optional.ofNullable(this.name);
    }
    /**
     * The number of seconds between consecutive counter measurements (samples).
     * 
    */
    public Optional<Integer> getSamplingFrequencyInSeconds() {
        return Optional.ofNullable(this.samplingFrequencyInSeconds);
    }
    /**
     * List of streams that this data source will be sent to.
     * A stream indicates what schema will be used for this data and usually what table in Log Analytics the data will be sent to.
     * 
    */
    public List<String> getStreams() {
        return this.streams == null ? List.of() : this.streams;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(PerfCounterDataSourceResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable List<String> counterSpecifiers;
        private @Nullable String name;
        private @Nullable Integer samplingFrequencyInSeconds;
        private @Nullable List<String> streams;

        public Builder() {
    	      // Empty
        }

        public Builder(PerfCounterDataSourceResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.counterSpecifiers = defaults.counterSpecifiers;
    	      this.name = defaults.name;
    	      this.samplingFrequencyInSeconds = defaults.samplingFrequencyInSeconds;
    	      this.streams = defaults.streams;
        }

        public Builder setCounterSpecifiers(@Nullable List<String> counterSpecifiers) {
            this.counterSpecifiers = counterSpecifiers;
            return this;
        }

        public Builder setName(@Nullable String name) {
            this.name = name;
            return this;
        }

        public Builder setSamplingFrequencyInSeconds(@Nullable Integer samplingFrequencyInSeconds) {
            this.samplingFrequencyInSeconds = samplingFrequencyInSeconds;
            return this;
        }

        public Builder setStreams(@Nullable List<String> streams) {
            this.streams = streams;
            return this;
        }
        public PerfCounterDataSourceResponse build() {
            return new PerfCounterDataSourceResponse(counterSpecifiers, name, samplingFrequencyInSeconds, streams);
        }
    }
}
