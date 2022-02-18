// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.kafkaconnect.outputs;

import io.pulumi.core.internal.annotations.OutputCustomType;
import java.lang.Integer;
import java.util.Objects;

@OutputCustomType
public final class ConnectorScaleInPolicy {
    /**
     * Specifies the CPU utilization percentage threshold at which connector scale in should trigger.
     * 
     */
    private final Integer cpuUtilizationPercentage;

    @OutputCustomType.Constructor({"cpuUtilizationPercentage"})
    private ConnectorScaleInPolicy(Integer cpuUtilizationPercentage) {
        this.cpuUtilizationPercentage = Objects.requireNonNull(cpuUtilizationPercentage);
    }

    /**
     * Specifies the CPU utilization percentage threshold at which connector scale in should trigger.
     * 
     */
    public Integer getCpuUtilizationPercentage() {
        return this.cpuUtilizationPercentage;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ConnectorScaleInPolicy defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Integer cpuUtilizationPercentage;

        public Builder() {
    	      // Empty
        }

        public Builder(ConnectorScaleInPolicy defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.cpuUtilizationPercentage = defaults.cpuUtilizationPercentage;
        }

        public Builder setCpuUtilizationPercentage(Integer cpuUtilizationPercentage) {
            this.cpuUtilizationPercentage = Objects.requireNonNull(cpuUtilizationPercentage);
            return this;
        }

        public ConnectorScaleInPolicy build() {
            return new ConnectorScaleInPolicy(cpuUtilizationPercentage);
        }
    }
}
