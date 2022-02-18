// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.synthetics.outputs;

import io.pulumi.core.internal.annotations.OutputCustomType;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.Object;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class CanaryRunConfig {
    /**
     * Enable active tracing if set to true
     * 
     */
    private final @Nullable Boolean activeTracing;
    /**
     * Environment variable key-value pairs.
     * 
     */
    private final @Nullable Object environmentVariables;
    /**
     * Provide maximum memory available for canary in MB
     * 
     */
    private final @Nullable Integer memoryInMB;
    /**
     * Provide maximum canary timeout per run in seconds
     * 
     */
    private final @Nullable Integer timeoutInSeconds;

    @OutputCustomType.Constructor({"activeTracing","environmentVariables","memoryInMB","timeoutInSeconds"})
    private CanaryRunConfig(
        @Nullable Boolean activeTracing,
        @Nullable Object environmentVariables,
        @Nullable Integer memoryInMB,
        @Nullable Integer timeoutInSeconds) {
        this.activeTracing = activeTracing;
        this.environmentVariables = environmentVariables;
        this.memoryInMB = memoryInMB;
        this.timeoutInSeconds = timeoutInSeconds;
    }

    /**
     * Enable active tracing if set to true
     * 
     */
    public Optional<Boolean> getActiveTracing() {
        return Optional.ofNullable(this.activeTracing);
    }
    /**
     * Environment variable key-value pairs.
     * 
     */
    public Optional<Object> getEnvironmentVariables() {
        return Optional.ofNullable(this.environmentVariables);
    }
    /**
     * Provide maximum memory available for canary in MB
     * 
     */
    public Optional<Integer> getMemoryInMB() {
        return Optional.ofNullable(this.memoryInMB);
    }
    /**
     * Provide maximum canary timeout per run in seconds
     * 
     */
    public Optional<Integer> getTimeoutInSeconds() {
        return Optional.ofNullable(this.timeoutInSeconds);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(CanaryRunConfig defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Boolean activeTracing;
        private @Nullable Object environmentVariables;
        private @Nullable Integer memoryInMB;
        private @Nullable Integer timeoutInSeconds;

        public Builder() {
    	      // Empty
        }

        public Builder(CanaryRunConfig defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.activeTracing = defaults.activeTracing;
    	      this.environmentVariables = defaults.environmentVariables;
    	      this.memoryInMB = defaults.memoryInMB;
    	      this.timeoutInSeconds = defaults.timeoutInSeconds;
        }

        public Builder setActiveTracing(@Nullable Boolean activeTracing) {
            this.activeTracing = activeTracing;
            return this;
        }

        public Builder setEnvironmentVariables(@Nullable Object environmentVariables) {
            this.environmentVariables = environmentVariables;
            return this;
        }

        public Builder setMemoryInMB(@Nullable Integer memoryInMB) {
            this.memoryInMB = memoryInMB;
            return this;
        }

        public Builder setTimeoutInSeconds(@Nullable Integer timeoutInSeconds) {
            this.timeoutInSeconds = timeoutInSeconds;
            return this;
        }

        public CanaryRunConfig build() {
            return new CanaryRunConfig(activeTracing, environmentVariables, memoryInMB, timeoutInSeconds);
        }
    }
}
