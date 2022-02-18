// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.apprunner.outputs;

import io.pulumi.awsnative.apprunner.outputs.ServiceHealthCheckConfiguration;
import io.pulumi.awsnative.apprunner.outputs.ServiceInstanceConfiguration;
import io.pulumi.awsnative.apprunner.outputs.ServiceSourceConfiguration;
import io.pulumi.core.internal.annotations.OutputCustomType;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class GetServiceResult {
    private final @Nullable ServiceHealthCheckConfiguration healthCheckConfiguration;
    private final @Nullable ServiceInstanceConfiguration instanceConfiguration;
    /**
     * The Amazon Resource Name (ARN) of the AppRunner Service.
     * 
     */
    private final @Nullable String serviceArn;
    /**
     * The AppRunner Service Id
     * 
     */
    private final @Nullable String serviceId;
    /**
     * The Service Url of the AppRunner Service.
     * 
     */
    private final @Nullable String serviceUrl;
    private final @Nullable ServiceSourceConfiguration sourceConfiguration;
    /**
     * AppRunner Service status.
     * 
     */
    private final @Nullable String status;

    @OutputCustomType.Constructor({"healthCheckConfiguration","instanceConfiguration","serviceArn","serviceId","serviceUrl","sourceConfiguration","status"})
    private GetServiceResult(
        @Nullable ServiceHealthCheckConfiguration healthCheckConfiguration,
        @Nullable ServiceInstanceConfiguration instanceConfiguration,
        @Nullable String serviceArn,
        @Nullable String serviceId,
        @Nullable String serviceUrl,
        @Nullable ServiceSourceConfiguration sourceConfiguration,
        @Nullable String status) {
        this.healthCheckConfiguration = healthCheckConfiguration;
        this.instanceConfiguration = instanceConfiguration;
        this.serviceArn = serviceArn;
        this.serviceId = serviceId;
        this.serviceUrl = serviceUrl;
        this.sourceConfiguration = sourceConfiguration;
        this.status = status;
    }

    public Optional<ServiceHealthCheckConfiguration> getHealthCheckConfiguration() {
        return Optional.ofNullable(this.healthCheckConfiguration);
    }
    public Optional<ServiceInstanceConfiguration> getInstanceConfiguration() {
        return Optional.ofNullable(this.instanceConfiguration);
    }
    /**
     * The Amazon Resource Name (ARN) of the AppRunner Service.
     * 
     */
    public Optional<String> getServiceArn() {
        return Optional.ofNullable(this.serviceArn);
    }
    /**
     * The AppRunner Service Id
     * 
     */
    public Optional<String> getServiceId() {
        return Optional.ofNullable(this.serviceId);
    }
    /**
     * The Service Url of the AppRunner Service.
     * 
     */
    public Optional<String> getServiceUrl() {
        return Optional.ofNullable(this.serviceUrl);
    }
    public Optional<ServiceSourceConfiguration> getSourceConfiguration() {
        return Optional.ofNullable(this.sourceConfiguration);
    }
    /**
     * AppRunner Service status.
     * 
     */
    public Optional<String> getStatus() {
        return Optional.ofNullable(this.status);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetServiceResult defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable ServiceHealthCheckConfiguration healthCheckConfiguration;
        private @Nullable ServiceInstanceConfiguration instanceConfiguration;
        private @Nullable String serviceArn;
        private @Nullable String serviceId;
        private @Nullable String serviceUrl;
        private @Nullable ServiceSourceConfiguration sourceConfiguration;
        private @Nullable String status;

        public Builder() {
    	      // Empty
        }

        public Builder(GetServiceResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.healthCheckConfiguration = defaults.healthCheckConfiguration;
    	      this.instanceConfiguration = defaults.instanceConfiguration;
    	      this.serviceArn = defaults.serviceArn;
    	      this.serviceId = defaults.serviceId;
    	      this.serviceUrl = defaults.serviceUrl;
    	      this.sourceConfiguration = defaults.sourceConfiguration;
    	      this.status = defaults.status;
        }

        public Builder setHealthCheckConfiguration(@Nullable ServiceHealthCheckConfiguration healthCheckConfiguration) {
            this.healthCheckConfiguration = healthCheckConfiguration;
            return this;
        }

        public Builder setInstanceConfiguration(@Nullable ServiceInstanceConfiguration instanceConfiguration) {
            this.instanceConfiguration = instanceConfiguration;
            return this;
        }

        public Builder setServiceArn(@Nullable String serviceArn) {
            this.serviceArn = serviceArn;
            return this;
        }

        public Builder setServiceId(@Nullable String serviceId) {
            this.serviceId = serviceId;
            return this;
        }

        public Builder setServiceUrl(@Nullable String serviceUrl) {
            this.serviceUrl = serviceUrl;
            return this;
        }

        public Builder setSourceConfiguration(@Nullable ServiceSourceConfiguration sourceConfiguration) {
            this.sourceConfiguration = sourceConfiguration;
            return this;
        }

        public Builder setStatus(@Nullable String status) {
            this.status = status;
            return this;
        }

        public GetServiceResult build() {
            return new GetServiceResult(healthCheckConfiguration, instanceConfiguration, serviceArn, serviceId, serviceUrl, sourceConfiguration, status);
        }
    }
}
