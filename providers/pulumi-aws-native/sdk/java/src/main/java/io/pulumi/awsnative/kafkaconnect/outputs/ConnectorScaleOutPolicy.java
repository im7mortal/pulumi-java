// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.kafkaconnect.outputs;

import io.pulumi.core.internal.annotations.OutputCustomType;
import java.lang.Integer;
import java.util.Objects;

@OutputCustomType
public final class ConnectorScaleOutPolicy {
    /**
     * Specifies the CPU utilization percentage threshold at which connector scale out should trigger.
     * 
     */
    private final Integer cpuUtilizationPercentage;

    @OutputCustomType.Constructor({"cpuUtilizationPercentage"})
    private ConnectorScaleOutPolicy(Integer cpuUtilizationPercentage) {
        this.cpuUtilizationPercentage = Objects.requireNonNull(cpuUtilizationPercentage);
    }

    /**
     * Specifies the CPU utilization percentage threshold at which connector scale out should trigger.
     * 
     */
    public Integer getCpuUtilizationPercentage() {
        return this.cpuUtilizationPercentage;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ConnectorScaleOutPolicy defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Integer cpuUtilizationPercentage;

        public Builder() {
    	      // Empty
        }

        public Builder(ConnectorScaleOutPolicy defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.cpuUtilizationPercentage = defaults.cpuUtilizationPercentage;
        }

        public Builder setCpuUtilizationPercentage(Integer cpuUtilizationPercentage) {
            this.cpuUtilizationPercentage = Objects.requireNonNull(cpuUtilizationPercentage);
            return this;
        }

        public ConnectorScaleOutPolicy build() {
            return new ConnectorScaleOutPolicy(cpuUtilizationPercentage);
        }
    }
}
