// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.apigee_v1.outputs;

import io.pulumi.core.internal.annotations.OutputCustomType;
import java.lang.String;
import java.util.Objects;

@OutputCustomType
public final class GoogleCloudApigeeV1CanaryEvaluationMetricLabelsResponse {
    private final String env;
    private final String instanceId;
    private final String location;

    @OutputCustomType.Constructor({"env","instanceId","location"})
    private GoogleCloudApigeeV1CanaryEvaluationMetricLabelsResponse(
        String env,
        String instanceId,
        String location) {
        this.env = Objects.requireNonNull(env);
        this.instanceId = Objects.requireNonNull(instanceId);
        this.location = Objects.requireNonNull(location);
    }

    public String getEnv() {
        return this.env;
    }
    public String getInstanceId() {
        return this.instanceId;
    }
    public String getLocation() {
        return this.location;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GoogleCloudApigeeV1CanaryEvaluationMetricLabelsResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String env;
        private String instanceId;
        private String location;

        public Builder() {
    	      // Empty
        }

        public Builder(GoogleCloudApigeeV1CanaryEvaluationMetricLabelsResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.env = defaults.env;
    	      this.instanceId = defaults.instanceId;
    	      this.location = defaults.location;
        }

        public Builder setEnv(String env) {
            this.env = Objects.requireNonNull(env);
            return this;
        }

        public Builder setInstanceId(String instanceId) {
            this.instanceId = Objects.requireNonNull(instanceId);
            return this;
        }

        public Builder setLocation(String location) {
            this.location = Objects.requireNonNull(location);
            return this;
        }

        public GoogleCloudApigeeV1CanaryEvaluationMetricLabelsResponse build() {
            return new GoogleCloudApigeeV1CanaryEvaluationMetricLabelsResponse(env, instanceId, location);
        }
    }
}