// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.apprunner.outputs;

import io.pulumi.awsnative.apprunner.outputs.ServiceKeyValuePair;
import io.pulumi.core.internal.annotations.OutputCustomType;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class ServiceImageConfiguration {
    /**
     * Port
     * 
     */
    private final @Nullable String port;
    private final @Nullable List<ServiceKeyValuePair> runtimeEnvironmentVariables;
    /**
     * Start Command
     * 
     */
    private final @Nullable String startCommand;

    @OutputCustomType.Constructor({"port","runtimeEnvironmentVariables","startCommand"})
    private ServiceImageConfiguration(
        @Nullable String port,
        @Nullable List<ServiceKeyValuePair> runtimeEnvironmentVariables,
        @Nullable String startCommand) {
        this.port = port;
        this.runtimeEnvironmentVariables = runtimeEnvironmentVariables;
        this.startCommand = startCommand;
    }

    /**
     * Port
     * 
     */
    public Optional<String> getPort() {
        return Optional.ofNullable(this.port);
    }
    public List<ServiceKeyValuePair> getRuntimeEnvironmentVariables() {
        return this.runtimeEnvironmentVariables == null ? List.of() : this.runtimeEnvironmentVariables;
    }
    /**
     * Start Command
     * 
     */
    public Optional<String> getStartCommand() {
        return Optional.ofNullable(this.startCommand);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ServiceImageConfiguration defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String port;
        private @Nullable List<ServiceKeyValuePair> runtimeEnvironmentVariables;
        private @Nullable String startCommand;

        public Builder() {
    	      // Empty
        }

        public Builder(ServiceImageConfiguration defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.port = defaults.port;
    	      this.runtimeEnvironmentVariables = defaults.runtimeEnvironmentVariables;
    	      this.startCommand = defaults.startCommand;
        }

        public Builder setPort(@Nullable String port) {
            this.port = port;
            return this;
        }

        public Builder setRuntimeEnvironmentVariables(@Nullable List<ServiceKeyValuePair> runtimeEnvironmentVariables) {
            this.runtimeEnvironmentVariables = runtimeEnvironmentVariables;
            return this;
        }

        public Builder setStartCommand(@Nullable String startCommand) {
            this.startCommand = startCommand;
            return this;
        }

        public ServiceImageConfiguration build() {
            return new ServiceImageConfiguration(port, runtimeEnvironmentVariables, startCommand);
        }
    }
}
