// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.deploymentmanager.outputs;

import io.pulumi.azurenative.deploymentmanager.outputs.RestHealthCheckResponse;
import io.pulumi.core.annotations.OutputCustomType;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class RestHealthCheckStepAttributesResponse {
    /**
     * The list of checks that form the health check step.
     * 
     */
    private final List<RestHealthCheckResponse> healthChecks;
    /**
     * The duration in ISO 8601 format for which the resource is expected to be continuously healthy. If maxElasticDuration is specified, healthy state duration is enforced after the detection of first healthy signal.
     * 
     */
    private final String healthyStateDuration;
    /**
     * The duration in ISO 8601 format for which the health check waits for the resource to become healthy. Health check fails if it doesn't. Health check starts to enforce healthyStateDuration once resource becomes healthy.
     * 
     */
    private final @Nullable String maxElasticDuration;
    /**
     * The type of health check.
     * Expected value is 'REST'.
     * 
     */
    private final String type;
    /**
     * The duration in ISO 8601 format for which health check waits idly without any checks.
     * 
     */
    private final @Nullable String waitDuration;

    @OutputCustomType.Constructor({"healthChecks","healthyStateDuration","maxElasticDuration","type","waitDuration"})
    private RestHealthCheckStepAttributesResponse(
        List<RestHealthCheckResponse> healthChecks,
        String healthyStateDuration,
        @Nullable String maxElasticDuration,
        String type,
        @Nullable String waitDuration) {
        this.healthChecks = Objects.requireNonNull(healthChecks);
        this.healthyStateDuration = Objects.requireNonNull(healthyStateDuration);
        this.maxElasticDuration = maxElasticDuration;
        this.type = Objects.requireNonNull(type);
        this.waitDuration = waitDuration;
    }

    /**
     * The list of checks that form the health check step.
     * 
    */
    public List<RestHealthCheckResponse> getHealthChecks() {
        return this.healthChecks;
    }
    /**
     * The duration in ISO 8601 format for which the resource is expected to be continuously healthy. If maxElasticDuration is specified, healthy state duration is enforced after the detection of first healthy signal.
     * 
    */
    public String getHealthyStateDuration() {
        return this.healthyStateDuration;
    }
    /**
     * The duration in ISO 8601 format for which the health check waits for the resource to become healthy. Health check fails if it doesn't. Health check starts to enforce healthyStateDuration once resource becomes healthy.
     * 
    */
    public Optional<String> getMaxElasticDuration() {
        return Optional.ofNullable(this.maxElasticDuration);
    }
    /**
     * The type of health check.
     * Expected value is 'REST'.
     * 
    */
    public String getType() {
        return this.type;
    }
    /**
     * The duration in ISO 8601 format for which health check waits idly without any checks.
     * 
    */
    public Optional<String> getWaitDuration() {
        return Optional.ofNullable(this.waitDuration);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(RestHealthCheckStepAttributesResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private List<RestHealthCheckResponse> healthChecks;
        private String healthyStateDuration;
        private @Nullable String maxElasticDuration;
        private String type;
        private @Nullable String waitDuration;

        public Builder() {
    	      // Empty
        }

        public Builder(RestHealthCheckStepAttributesResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.healthChecks = defaults.healthChecks;
    	      this.healthyStateDuration = defaults.healthyStateDuration;
    	      this.maxElasticDuration = defaults.maxElasticDuration;
    	      this.type = defaults.type;
    	      this.waitDuration = defaults.waitDuration;
        }

        public Builder setHealthChecks(List<RestHealthCheckResponse> healthChecks) {
            this.healthChecks = Objects.requireNonNull(healthChecks);
            return this;
        }

        public Builder setHealthyStateDuration(String healthyStateDuration) {
            this.healthyStateDuration = Objects.requireNonNull(healthyStateDuration);
            return this;
        }

        public Builder setMaxElasticDuration(@Nullable String maxElasticDuration) {
            this.maxElasticDuration = maxElasticDuration;
            return this;
        }

        public Builder setType(String type) {
            this.type = Objects.requireNonNull(type);
            return this;
        }

        public Builder setWaitDuration(@Nullable String waitDuration) {
            this.waitDuration = waitDuration;
            return this;
        }
        public RestHealthCheckStepAttributesResponse build() {
            return new RestHealthCheckStepAttributesResponse(healthChecks, healthyStateDuration, maxElasticDuration, type, waitDuration);
        }
    }
}
