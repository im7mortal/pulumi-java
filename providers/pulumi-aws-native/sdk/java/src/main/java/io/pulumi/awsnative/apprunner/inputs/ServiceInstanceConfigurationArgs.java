// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.apprunner.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.internal.annotations.InputImport;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * Instance Configuration
 * 
 */
public final class ServiceInstanceConfigurationArgs extends io.pulumi.resources.ResourceArgs {

    public static final ServiceInstanceConfigurationArgs Empty = new ServiceInstanceConfigurationArgs();

    /**
     * CPU
     * 
     */
    @InputImport(name="cpu")
    private final @Nullable Input<String> cpu;

    public Input<String> getCpu() {
        return this.cpu == null ? Input.empty() : this.cpu;
    }

    /**
     * Instance Role Arn
     * 
     */
    @InputImport(name="instanceRoleArn")
    private final @Nullable Input<String> instanceRoleArn;

    public Input<String> getInstanceRoleArn() {
        return this.instanceRoleArn == null ? Input.empty() : this.instanceRoleArn;
    }

    /**
     * Memory
     * 
     */
    @InputImport(name="memory")
    private final @Nullable Input<String> memory;

    public Input<String> getMemory() {
        return this.memory == null ? Input.empty() : this.memory;
    }

    public ServiceInstanceConfigurationArgs(
        @Nullable Input<String> cpu,
        @Nullable Input<String> instanceRoleArn,
        @Nullable Input<String> memory) {
        this.cpu = cpu;
        this.instanceRoleArn = instanceRoleArn;
        this.memory = memory;
    }

    private ServiceInstanceConfigurationArgs() {
        this.cpu = Input.empty();
        this.instanceRoleArn = Input.empty();
        this.memory = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ServiceInstanceConfigurationArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<String> cpu;
        private @Nullable Input<String> instanceRoleArn;
        private @Nullable Input<String> memory;

        public Builder() {
    	      // Empty
        }

        public Builder(ServiceInstanceConfigurationArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.cpu = defaults.cpu;
    	      this.instanceRoleArn = defaults.instanceRoleArn;
    	      this.memory = defaults.memory;
        }

        public Builder setCpu(@Nullable Input<String> cpu) {
            this.cpu = cpu;
            return this;
        }

        public Builder setCpu(@Nullable String cpu) {
            this.cpu = Input.ofNullable(cpu);
            return this;
        }

        public Builder setInstanceRoleArn(@Nullable Input<String> instanceRoleArn) {
            this.instanceRoleArn = instanceRoleArn;
            return this;
        }

        public Builder setInstanceRoleArn(@Nullable String instanceRoleArn) {
            this.instanceRoleArn = Input.ofNullable(instanceRoleArn);
            return this;
        }

        public Builder setMemory(@Nullable Input<String> memory) {
            this.memory = memory;
            return this;
        }

        public Builder setMemory(@Nullable String memory) {
            this.memory = Input.ofNullable(memory);
            return this;
        }

        public ServiceInstanceConfigurationArgs build() {
            return new ServiceInstanceConfigurationArgs(cpu, instanceRoleArn, memory);
        }
    }
}
