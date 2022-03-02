// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.appengine.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import java.lang.Boolean;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class FlexibleAppVersionEndpointsApiService {
    /**
     * Endpoints service configuration ID as specified by the Service Management API. For example "2016-09-19r1".
     * By default, the rollout strategy for Endpoints is "FIXED". This means that Endpoints starts up with a particular configuration ID.
     * When a new configuration is rolled out, Endpoints must be given the new configuration ID. The configId field is used to give the configuration ID
     * and is required in this case.
     * Endpoints also has a rollout strategy called "MANAGED". When using this, Endpoints fetches the latest configuration and does not need
     * the configuration ID. In this case, configId must be omitted.
     * 
     */
    private final @Nullable String configId;
    /**
     * Enable or disable trace sampling. By default, this is set to false for enabled.
     * 
     */
    private final @Nullable Boolean disableTraceSampling;
    /**
     * Full Serverless VPC Access Connector name e.g. /projects/my-project/locations/us-central1/connectors/c1.
     * 
     */
    private final String name;
    /**
     * Endpoints rollout strategy. If FIXED, configId must be specified. If MANAGED, configId must be omitted.
     * Default value is `FIXED`.
     * Possible values are `FIXED` and `MANAGED`.
     * 
     */
    private final @Nullable String rolloutStrategy;

    @OutputCustomType.Constructor({"configId","disableTraceSampling","name","rolloutStrategy"})
    private FlexibleAppVersionEndpointsApiService(
        @Nullable String configId,
        @Nullable Boolean disableTraceSampling,
        String name,
        @Nullable String rolloutStrategy) {
        this.configId = configId;
        this.disableTraceSampling = disableTraceSampling;
        this.name = Objects.requireNonNull(name);
        this.rolloutStrategy = rolloutStrategy;
    }

    /**
     * Endpoints service configuration ID as specified by the Service Management API. For example "2016-09-19r1".
     * By default, the rollout strategy for Endpoints is "FIXED". This means that Endpoints starts up with a particular configuration ID.
     * When a new configuration is rolled out, Endpoints must be given the new configuration ID. The configId field is used to give the configuration ID
     * and is required in this case.
     * Endpoints also has a rollout strategy called "MANAGED". When using this, Endpoints fetches the latest configuration and does not need
     * the configuration ID. In this case, configId must be omitted.
     * 
    */
    public Optional<String> getConfigId() {
        return Optional.ofNullable(this.configId);
    }
    /**
     * Enable or disable trace sampling. By default, this is set to false for enabled.
     * 
    */
    public Optional<Boolean> getDisableTraceSampling() {
        return Optional.ofNullable(this.disableTraceSampling);
    }
    /**
     * Full Serverless VPC Access Connector name e.g. /projects/my-project/locations/us-central1/connectors/c1.
     * 
    */
    public String getName() {
        return this.name;
    }
    /**
     * Endpoints rollout strategy. If FIXED, configId must be specified. If MANAGED, configId must be omitted.
     * Default value is `FIXED`.
     * Possible values are `FIXED` and `MANAGED`.
     * 
    */
    public Optional<String> getRolloutStrategy() {
        return Optional.ofNullable(this.rolloutStrategy);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(FlexibleAppVersionEndpointsApiService defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String configId;
        private @Nullable Boolean disableTraceSampling;
        private String name;
        private @Nullable String rolloutStrategy;

        public Builder() {
    	      // Empty
        }

        public Builder(FlexibleAppVersionEndpointsApiService defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.configId = defaults.configId;
    	      this.disableTraceSampling = defaults.disableTraceSampling;
    	      this.name = defaults.name;
    	      this.rolloutStrategy = defaults.rolloutStrategy;
        }

        public Builder setConfigId(@Nullable String configId) {
            this.configId = configId;
            return this;
        }

        public Builder setDisableTraceSampling(@Nullable Boolean disableTraceSampling) {
            this.disableTraceSampling = disableTraceSampling;
            return this;
        }

        public Builder setName(String name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }

        public Builder setRolloutStrategy(@Nullable String rolloutStrategy) {
            this.rolloutStrategy = rolloutStrategy;
            return this;
        }
        public FlexibleAppVersionEndpointsApiService build() {
            return new FlexibleAppVersionEndpointsApiService(configId, disableTraceSampling, name, rolloutStrategy);
        }
    }
}
