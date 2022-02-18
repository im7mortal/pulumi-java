// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.lightsail.inputs;

import io.pulumi.awsnative.lightsail.inputs.ContainerEnvironmentVariable;
import io.pulumi.awsnative.lightsail.inputs.ContainerPortInfo;
import io.pulumi.core.internal.annotations.InputImport;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * Describes the settings of a container that will be launched, or that is launched, to an Amazon Lightsail container service.
 * 
 */
public final class Container extends io.pulumi.resources.InvokeArgs {

    public static final Container Empty = new Container();

    /**
     * The launch command for the container.
     * 
     */
    @InputImport(name="command")
    private final @Nullable List<String> command;

    public List<String> getCommand() {
        return this.command == null ? List.of() : this.command;
    }

    /**
     * The name of the container.
     * 
     */
    @InputImport(name="containerName")
    private final @Nullable String containerName;

    public Optional<String> getContainerName() {
        return this.containerName == null ? Optional.empty() : Optional.ofNullable(this.containerName);
    }

    /**
     * The environment variables of the container.
     * 
     */
    @InputImport(name="environment")
    private final @Nullable List<ContainerEnvironmentVariable> environment;

    public List<ContainerEnvironmentVariable> getEnvironment() {
        return this.environment == null ? List.of() : this.environment;
    }

    /**
     * The name of the image used for the container.
     * 
     */
    @InputImport(name="image")
    private final @Nullable String image;

    public Optional<String> getImage() {
        return this.image == null ? Optional.empty() : Optional.ofNullable(this.image);
    }

    /**
     * The open firewall ports of the container.
     * 
     */
    @InputImport(name="ports")
    private final @Nullable List<ContainerPortInfo> ports;

    public List<ContainerPortInfo> getPorts() {
        return this.ports == null ? List.of() : this.ports;
    }

    public Container(
        @Nullable List<String> command,
        @Nullable String containerName,
        @Nullable List<ContainerEnvironmentVariable> environment,
        @Nullable String image,
        @Nullable List<ContainerPortInfo> ports) {
        this.command = command;
        this.containerName = containerName;
        this.environment = environment;
        this.image = image;
        this.ports = ports;
    }

    private Container() {
        this.command = List.of();
        this.containerName = null;
        this.environment = List.of();
        this.image = null;
        this.ports = List.of();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(Container defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable List<String> command;
        private @Nullable String containerName;
        private @Nullable List<ContainerEnvironmentVariable> environment;
        private @Nullable String image;
        private @Nullable List<ContainerPortInfo> ports;

        public Builder() {
    	      // Empty
        }

        public Builder(Container defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.command = defaults.command;
    	      this.containerName = defaults.containerName;
    	      this.environment = defaults.environment;
    	      this.image = defaults.image;
    	      this.ports = defaults.ports;
        }

        public Builder setCommand(@Nullable List<String> command) {
            this.command = command;
            return this;
        }

        public Builder setContainerName(@Nullable String containerName) {
            this.containerName = containerName;
            return this;
        }

        public Builder setEnvironment(@Nullable List<ContainerEnvironmentVariable> environment) {
            this.environment = environment;
            return this;
        }

        public Builder setImage(@Nullable String image) {
            this.image = image;
            return this;
        }

        public Builder setPorts(@Nullable List<ContainerPortInfo> ports) {
            this.ports = ports;
            return this;
        }

        public Container build() {
            return new Container(command, containerName, environment, image, ports);
        }
    }
}
