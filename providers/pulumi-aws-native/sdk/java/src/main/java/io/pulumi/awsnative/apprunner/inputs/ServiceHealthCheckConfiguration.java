// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.apprunner.inputs;

import io.pulumi.awsnative.apprunner.enums.ServiceHealthCheckConfigurationProtocol;
import io.pulumi.core.internal.annotations.InputImport;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * Health check configuration
 * 
 */
public final class ServiceHealthCheckConfiguration extends io.pulumi.resources.InvokeArgs {

    public static final ServiceHealthCheckConfiguration Empty = new ServiceHealthCheckConfiguration();

    /**
     * Health check Healthy Threshold
     * 
     */
    @InputImport(name="healthyThreshold")
    private final @Nullable Integer healthyThreshold;

    public Optional<Integer> getHealthyThreshold() {
        return this.healthyThreshold == null ? Optional.empty() : Optional.ofNullable(this.healthyThreshold);
    }

    /**
     * Health check Interval
     * 
     */
    @InputImport(name="interval")
    private final @Nullable Integer interval;

    public Optional<Integer> getInterval() {
        return this.interval == null ? Optional.empty() : Optional.ofNullable(this.interval);
    }

    /**
     * Health check Path
     * 
     */
    @InputImport(name="path")
    private final @Nullable String path;

    public Optional<String> getPath() {
        return this.path == null ? Optional.empty() : Optional.ofNullable(this.path);
    }

    /**
     * Health Check Protocol
     * 
     */
    @InputImport(name="protocol")
    private final @Nullable ServiceHealthCheckConfigurationProtocol protocol;

    public Optional<ServiceHealthCheckConfigurationProtocol> getProtocol() {
        return this.protocol == null ? Optional.empty() : Optional.ofNullable(this.protocol);
    }

    /**
     * Health check Timeout
     * 
     */
    @InputImport(name="timeout")
    private final @Nullable Integer timeout;

    public Optional<Integer> getTimeout() {
        return this.timeout == null ? Optional.empty() : Optional.ofNullable(this.timeout);
    }

    /**
     * Health check Unhealthy Threshold
     * 
     */
    @InputImport(name="unhealthyThreshold")
    private final @Nullable Integer unhealthyThreshold;

    public Optional<Integer> getUnhealthyThreshold() {
        return this.unhealthyThreshold == null ? Optional.empty() : Optional.ofNullable(this.unhealthyThreshold);
    }

    public ServiceHealthCheckConfiguration(
        @Nullable Integer healthyThreshold,
        @Nullable Integer interval,
        @Nullable String path,
        @Nullable ServiceHealthCheckConfigurationProtocol protocol,
        @Nullable Integer timeout,
        @Nullable Integer unhealthyThreshold) {
        this.healthyThreshold = healthyThreshold;
        this.interval = interval;
        this.path = path;
        this.protocol = protocol;
        this.timeout = timeout;
        this.unhealthyThreshold = unhealthyThreshold;
    }

    private ServiceHealthCheckConfiguration() {
        this.healthyThreshold = null;
        this.interval = null;
        this.path = null;
        this.protocol = null;
        this.timeout = null;
        this.unhealthyThreshold = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ServiceHealthCheckConfiguration defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Integer healthyThreshold;
        private @Nullable Integer interval;
        private @Nullable String path;
        private @Nullable ServiceHealthCheckConfigurationProtocol protocol;
        private @Nullable Integer timeout;
        private @Nullable Integer unhealthyThreshold;

        public Builder() {
    	      // Empty
        }

        public Builder(ServiceHealthCheckConfiguration defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.healthyThreshold = defaults.healthyThreshold;
    	      this.interval = defaults.interval;
    	      this.path = defaults.path;
    	      this.protocol = defaults.protocol;
    	      this.timeout = defaults.timeout;
    	      this.unhealthyThreshold = defaults.unhealthyThreshold;
        }

        public Builder setHealthyThreshold(@Nullable Integer healthyThreshold) {
            this.healthyThreshold = healthyThreshold;
            return this;
        }

        public Builder setInterval(@Nullable Integer interval) {
            this.interval = interval;
            return this;
        }

        public Builder setPath(@Nullable String path) {
            this.path = path;
            return this;
        }

        public Builder setProtocol(@Nullable ServiceHealthCheckConfigurationProtocol protocol) {
            this.protocol = protocol;
            return this;
        }

        public Builder setTimeout(@Nullable Integer timeout) {
            this.timeout = timeout;
            return this;
        }

        public Builder setUnhealthyThreshold(@Nullable Integer unhealthyThreshold) {
            this.unhealthyThreshold = unhealthyThreshold;
            return this;
        }

        public ServiceHealthCheckConfiguration build() {
            return new ServiceHealthCheckConfiguration(healthyThreshold, interval, path, protocol, timeout, unhealthyThreshold);
        }
    }
}
