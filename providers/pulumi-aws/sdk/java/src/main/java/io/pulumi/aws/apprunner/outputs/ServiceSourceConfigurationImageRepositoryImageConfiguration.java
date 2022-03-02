// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.apprunner.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import java.lang.String;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class ServiceSourceConfigurationImageRepositoryImageConfiguration {
    /**
     * The port that your application listens to in the container. Defaults to `"8080"`.
     * 
     */
    private final @Nullable String port;
    /**
     * Environment variables available to your running App Runner service. A map of key/value pairs. Keys with a prefix of `AWSAPPRUNNER` are reserved for system use and aren't valid.
     * 
     */
    private final @Nullable Map<String,String> runtimeEnvironmentVariables;
    /**
     * A command App Runner runs to start the application in the source image. If specified, this command overrides the Docker image’s default start command.
     * 
     */
    private final @Nullable String startCommand;

    @OutputCustomType.Constructor({"port","runtimeEnvironmentVariables","startCommand"})
    private ServiceSourceConfigurationImageRepositoryImageConfiguration(
        @Nullable String port,
        @Nullable Map<String,String> runtimeEnvironmentVariables,
        @Nullable String startCommand) {
        this.port = port;
        this.runtimeEnvironmentVariables = runtimeEnvironmentVariables;
        this.startCommand = startCommand;
    }

    /**
     * The port that your application listens to in the container. Defaults to `"8080"`.
     * 
    */
    public Optional<String> getPort() {
        return Optional.ofNullable(this.port);
    }
    /**
     * Environment variables available to your running App Runner service. A map of key/value pairs. Keys with a prefix of `AWSAPPRUNNER` are reserved for system use and aren't valid.
     * 
    */
    public Map<String,String> getRuntimeEnvironmentVariables() {
        return this.runtimeEnvironmentVariables == null ? Map.of() : this.runtimeEnvironmentVariables;
    }
    /**
     * A command App Runner runs to start the application in the source image. If specified, this command overrides the Docker image’s default start command.
     * 
    */
    public Optional<String> getStartCommand() {
        return Optional.ofNullable(this.startCommand);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ServiceSourceConfigurationImageRepositoryImageConfiguration defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String port;
        private @Nullable Map<String,String> runtimeEnvironmentVariables;
        private @Nullable String startCommand;

        public Builder() {
    	      // Empty
        }

        public Builder(ServiceSourceConfigurationImageRepositoryImageConfiguration defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.port = defaults.port;
    	      this.runtimeEnvironmentVariables = defaults.runtimeEnvironmentVariables;
    	      this.startCommand = defaults.startCommand;
        }

        public Builder setPort(@Nullable String port) {
            this.port = port;
            return this;
        }

        public Builder setRuntimeEnvironmentVariables(@Nullable Map<String,String> runtimeEnvironmentVariables) {
            this.runtimeEnvironmentVariables = runtimeEnvironmentVariables;
            return this;
        }

        public Builder setStartCommand(@Nullable String startCommand) {
            this.startCommand = startCommand;
            return this;
        }
        public ServiceSourceConfigurationImageRepositoryImageConfiguration build() {
            return new ServiceSourceConfigurationImageRepositoryImageConfiguration(port, runtimeEnvironmentVariables, startCommand);
        }
    }
}
