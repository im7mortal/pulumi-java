// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.dataproc_v1.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import io.pulumi.googlenative.dataproc_v1.outputs.ExecutionConfigResponse;
import io.pulumi.googlenative.dataproc_v1.outputs.PeripheralsConfigResponse;
import java.util.Objects;

@OutputCustomType
public final class EnvironmentConfigResponse {
    /**
     * Optional. Execution configuration for a workload.
     * 
     */
    private final ExecutionConfigResponse executionConfig;
    /**
     * Optional. Peripherals configuration that workload has access to.
     * 
     */
    private final PeripheralsConfigResponse peripheralsConfig;

    @OutputCustomType.Constructor({"executionConfig","peripheralsConfig"})
    private EnvironmentConfigResponse(
        ExecutionConfigResponse executionConfig,
        PeripheralsConfigResponse peripheralsConfig) {
        this.executionConfig = Objects.requireNonNull(executionConfig);
        this.peripheralsConfig = Objects.requireNonNull(peripheralsConfig);
    }

    /**
     * Optional. Execution configuration for a workload.
     * 
    */
    public ExecutionConfigResponse getExecutionConfig() {
        return this.executionConfig;
    }
    /**
     * Optional. Peripherals configuration that workload has access to.
     * 
    */
    public PeripheralsConfigResponse getPeripheralsConfig() {
        return this.peripheralsConfig;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(EnvironmentConfigResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private ExecutionConfigResponse executionConfig;
        private PeripheralsConfigResponse peripheralsConfig;

        public Builder() {
    	      // Empty
        }

        public Builder(EnvironmentConfigResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.executionConfig = defaults.executionConfig;
    	      this.peripheralsConfig = defaults.peripheralsConfig;
        }

        public Builder setExecutionConfig(ExecutionConfigResponse executionConfig) {
            this.executionConfig = Objects.requireNonNull(executionConfig);
            return this;
        }

        public Builder setPeripheralsConfig(PeripheralsConfigResponse peripheralsConfig) {
            this.peripheralsConfig = Objects.requireNonNull(peripheralsConfig);
            return this;
        }
        public EnvironmentConfigResponse build() {
            return new EnvironmentConfigResponse(executionConfig, peripheralsConfig);
        }
    }
}
