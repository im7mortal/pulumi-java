// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.appplatform.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;

@OutputCustomType
public final class ServiceRegistryResourceRequestsResponse {
    /**
     * Cpu allocated to each Service Registry instance
     * 
     */
    private final String cpu;
    /**
     * Instance count of the Service Registry
     * 
     */
    private final Integer instanceCount;
    /**
     * Memory allocated to each Service Registry instance
     * 
     */
    private final String memory;

    @OutputCustomType.Constructor({"cpu","instanceCount","memory"})
    private ServiceRegistryResourceRequestsResponse(
        String cpu,
        Integer instanceCount,
        String memory) {
        this.cpu = Objects.requireNonNull(cpu);
        this.instanceCount = Objects.requireNonNull(instanceCount);
        this.memory = Objects.requireNonNull(memory);
    }

    /**
     * Cpu allocated to each Service Registry instance
     * 
    */
    public String getCpu() {
        return this.cpu;
    }
    /**
     * Instance count of the Service Registry
     * 
    */
    public Integer getInstanceCount() {
        return this.instanceCount;
    }
    /**
     * Memory allocated to each Service Registry instance
     * 
    */
    public String getMemory() {
        return this.memory;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ServiceRegistryResourceRequestsResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String cpu;
        private Integer instanceCount;
        private String memory;

        public Builder() {
    	      // Empty
        }

        public Builder(ServiceRegistryResourceRequestsResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.cpu = defaults.cpu;
    	      this.instanceCount = defaults.instanceCount;
    	      this.memory = defaults.memory;
        }

        public Builder setCpu(String cpu) {
            this.cpu = Objects.requireNonNull(cpu);
            return this;
        }

        public Builder setInstanceCount(Integer instanceCount) {
            this.instanceCount = Objects.requireNonNull(instanceCount);
            return this;
        }

        public Builder setMemory(String memory) {
            this.memory = Objects.requireNonNull(memory);
            return this;
        }
        public ServiceRegistryResourceRequestsResponse build() {
            return new ServiceRegistryResourceRequestsResponse(cpu, instanceCount, memory);
        }
    }
}
