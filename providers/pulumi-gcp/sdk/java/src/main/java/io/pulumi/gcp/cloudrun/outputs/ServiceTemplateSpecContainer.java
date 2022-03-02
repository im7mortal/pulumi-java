// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.cloudrun.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import io.pulumi.gcp.cloudrun.outputs.ServiceTemplateSpecContainerEnv;
import io.pulumi.gcp.cloudrun.outputs.ServiceTemplateSpecContainerEnvFrom;
import io.pulumi.gcp.cloudrun.outputs.ServiceTemplateSpecContainerPort;
import io.pulumi.gcp.cloudrun.outputs.ServiceTemplateSpecContainerResources;
import io.pulumi.gcp.cloudrun.outputs.ServiceTemplateSpecContainerVolumeMount;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class ServiceTemplateSpecContainer {
    /**
     * Arguments to the entrypoint.
     * The docker image's CMD is used if this is not provided.
     * Variable references $(VAR_NAME) are expanded using the container's
     * environment. If a variable cannot be resolved, the reference in the input
     * string will be unchanged. The $(VAR_NAME) syntax can be escaped with a
     * double $$, ie: $$(VAR_NAME). Escaped references will never be expanded,
     * regardless of whether the variable exists or not.
     * More info:
     * https://kubernetes.io/docs/tasks/inject-data-application/define-command-argument-container/#running-a-command-in-a-shell
     * 
     */
    private final @Nullable List<String> args;
    /**
     * Entrypoint array. Not executed within a shell.
     * The docker image's ENTRYPOINT is used if this is not provided.
     * Variable references $(VAR_NAME) are expanded using the container's
     * environment. If a variable cannot be resolved, the reference in the input
     * string will be unchanged. The $(VAR_NAME) syntax can be escaped with a
     * double $$, ie: $$(VAR_NAME). Escaped references will never be expanded,
     * regardless of whether the variable exists or not.
     * More info:
     * https://kubernetes.io/docs/tasks/inject-data-application/define-command-argument-container/#running-a-command-in-a-shell
     * 
     */
    private final @Nullable List<String> commands;
    /**
     * - 
     * (Optional, Deprecated)
     * List of sources to populate environment variables in the container.
     * All invalid keys will be reported as an event when the container is starting.
     * When a key exists in multiple sources, the value associated with the last source will
     * take precedence. Values defined by an Env with a duplicate key will take
     * precedence.
     * Structure is documented below.
     * 
     * @Deprecated
     * Not supported by Cloud Run fully managed
     * 
     */
        @Deprecated /* Not supported by Cloud Run fully managed */
    private final @Nullable List<ServiceTemplateSpecContainerEnvFrom> envFroms;
    /**
     * List of environment variables to set in the container.
     * Structure is documented below.
     * 
     */
    private final @Nullable List<ServiceTemplateSpecContainerEnv> envs;
    /**
     * Docker image name. This is most often a reference to a container located
     * in the container registry, such as gcr.io/cloudrun/hello
     * More info: https://kubernetes.io/docs/concepts/containers/images
     * 
     */
    private final String image;
    /**
     * List of open ports in the container.
     * More Info:
     * https://cloud.google.com/run/docs/reference/rest/v1/RevisionSpec#ContainerPort
     * Structure is documented below.
     * 
     */
    private final @Nullable List<ServiceTemplateSpecContainerPort> ports;
    /**
     * Compute Resources required by this container. Used to set values such as max memory
     * More info:
     * https://kubernetes.io/docs/concepts/configuration/manage-resources-containers/#requests-and-limits
     * Structure is documented below.
     * 
     */
    private final @Nullable ServiceTemplateSpecContainerResources resources;
    /**
     * Volume to mount into the container's filesystem.
     * Only supports SecretVolumeSources.
     * Structure is documented below.
     * 
     */
    private final @Nullable List<ServiceTemplateSpecContainerVolumeMount> volumeMounts;
    /**
     * - 
     * (Optional, Deprecated)
     * Container's working directory.
     * If not specified, the container runtime's default will be used, which
     * might be configured in the container image.
     * 
     * @Deprecated
     * Not supported by Cloud Run fully managed
     * 
     */
        @Deprecated /* Not supported by Cloud Run fully managed */
    private final @Nullable String workingDir;

    @OutputCustomType.Constructor({"args","commands","envFroms","envs","image","ports","resources","volumeMounts","workingDir"})
    private ServiceTemplateSpecContainer(
        @Nullable List<String> args,
        @Nullable List<String> commands,
        @Nullable List<ServiceTemplateSpecContainerEnvFrom> envFroms,
        @Nullable List<ServiceTemplateSpecContainerEnv> envs,
        String image,
        @Nullable List<ServiceTemplateSpecContainerPort> ports,
        @Nullable ServiceTemplateSpecContainerResources resources,
        @Nullable List<ServiceTemplateSpecContainerVolumeMount> volumeMounts,
        @Nullable String workingDir) {
        this.args = args;
        this.commands = commands;
        this.envFroms = envFroms;
        this.envs = envs;
        this.image = Objects.requireNonNull(image);
        this.ports = ports;
        this.resources = resources;
        this.volumeMounts = volumeMounts;
        this.workingDir = workingDir;
    }

    /**
     * Arguments to the entrypoint.
     * The docker image's CMD is used if this is not provided.
     * Variable references $(VAR_NAME) are expanded using the container's
     * environment. If a variable cannot be resolved, the reference in the input
     * string will be unchanged. The $(VAR_NAME) syntax can be escaped with a
     * double $$, ie: $$(VAR_NAME). Escaped references will never be expanded,
     * regardless of whether the variable exists or not.
     * More info:
     * https://kubernetes.io/docs/tasks/inject-data-application/define-command-argument-container/#running-a-command-in-a-shell
     * 
    */
    public List<String> getArgs() {
        return this.args == null ? List.of() : this.args;
    }
    /**
     * Entrypoint array. Not executed within a shell.
     * The docker image's ENTRYPOINT is used if this is not provided.
     * Variable references $(VAR_NAME) are expanded using the container's
     * environment. If a variable cannot be resolved, the reference in the input
     * string will be unchanged. The $(VAR_NAME) syntax can be escaped with a
     * double $$, ie: $$(VAR_NAME). Escaped references will never be expanded,
     * regardless of whether the variable exists or not.
     * More info:
     * https://kubernetes.io/docs/tasks/inject-data-application/define-command-argument-container/#running-a-command-in-a-shell
     * 
    */
    public List<String> getCommands() {
        return this.commands == null ? List.of() : this.commands;
    }
    /**
     * - 
     * (Optional, Deprecated)
     * List of sources to populate environment variables in the container.
     * All invalid keys will be reported as an event when the container is starting.
     * When a key exists in multiple sources, the value associated with the last source will
     * take precedence. Values defined by an Env with a duplicate key will take
     * precedence.
     * Structure is documented below.
     * 
     * @Deprecated
     * Not supported by Cloud Run fully managed
     * 
    */
    @Deprecated /* Not supported by Cloud Run fully managed */
    public List<ServiceTemplateSpecContainerEnvFrom> getEnvFroms() {
        return this.envFroms == null ? List.of() : this.envFroms;
    }
    /**
     * List of environment variables to set in the container.
     * Structure is documented below.
     * 
    */
    public List<ServiceTemplateSpecContainerEnv> getEnvs() {
        return this.envs == null ? List.of() : this.envs;
    }
    /**
     * Docker image name. This is most often a reference to a container located
     * in the container registry, such as gcr.io/cloudrun/hello
     * More info: https://kubernetes.io/docs/concepts/containers/images
     * 
    */
    public String getImage() {
        return this.image;
    }
    /**
     * List of open ports in the container.
     * More Info:
     * https://cloud.google.com/run/docs/reference/rest/v1/RevisionSpec#ContainerPort
     * Structure is documented below.
     * 
    */
    public List<ServiceTemplateSpecContainerPort> getPorts() {
        return this.ports == null ? List.of() : this.ports;
    }
    /**
     * Compute Resources required by this container. Used to set values such as max memory
     * More info:
     * https://kubernetes.io/docs/concepts/configuration/manage-resources-containers/#requests-and-limits
     * Structure is documented below.
     * 
    */
    public Optional<ServiceTemplateSpecContainerResources> getResources() {
        return Optional.ofNullable(this.resources);
    }
    /**
     * Volume to mount into the container's filesystem.
     * Only supports SecretVolumeSources.
     * Structure is documented below.
     * 
    */
    public List<ServiceTemplateSpecContainerVolumeMount> getVolumeMounts() {
        return this.volumeMounts == null ? List.of() : this.volumeMounts;
    }
    /**
     * - 
     * (Optional, Deprecated)
     * Container's working directory.
     * If not specified, the container runtime's default will be used, which
     * might be configured in the container image.
     * 
     * @Deprecated
     * Not supported by Cloud Run fully managed
     * 
    */
    @Deprecated /* Not supported by Cloud Run fully managed */
    public Optional<String> getWorkingDir() {
        return Optional.ofNullable(this.workingDir);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ServiceTemplateSpecContainer defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable List<String> args;
        private @Nullable List<String> commands;
        private @Nullable List<ServiceTemplateSpecContainerEnvFrom> envFroms;
        private @Nullable List<ServiceTemplateSpecContainerEnv> envs;
        private String image;
        private @Nullable List<ServiceTemplateSpecContainerPort> ports;
        private @Nullable ServiceTemplateSpecContainerResources resources;
        private @Nullable List<ServiceTemplateSpecContainerVolumeMount> volumeMounts;
        private @Nullable String workingDir;

        public Builder() {
    	      // Empty
        }

        public Builder(ServiceTemplateSpecContainer defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.args = defaults.args;
    	      this.commands = defaults.commands;
    	      this.envFroms = defaults.envFroms;
    	      this.envs = defaults.envs;
    	      this.image = defaults.image;
    	      this.ports = defaults.ports;
    	      this.resources = defaults.resources;
    	      this.volumeMounts = defaults.volumeMounts;
    	      this.workingDir = defaults.workingDir;
        }

        public Builder setArgs(@Nullable List<String> args) {
            this.args = args;
            return this;
        }

        public Builder setCommands(@Nullable List<String> commands) {
            this.commands = commands;
            return this;
        }

        public Builder setEnvFroms(@Nullable List<ServiceTemplateSpecContainerEnvFrom> envFroms) {
            this.envFroms = envFroms;
            return this;
        }

        public Builder setEnvs(@Nullable List<ServiceTemplateSpecContainerEnv> envs) {
            this.envs = envs;
            return this;
        }

        public Builder setImage(String image) {
            this.image = Objects.requireNonNull(image);
            return this;
        }

        public Builder setPorts(@Nullable List<ServiceTemplateSpecContainerPort> ports) {
            this.ports = ports;
            return this;
        }

        public Builder setResources(@Nullable ServiceTemplateSpecContainerResources resources) {
            this.resources = resources;
            return this;
        }

        public Builder setVolumeMounts(@Nullable List<ServiceTemplateSpecContainerVolumeMount> volumeMounts) {
            this.volumeMounts = volumeMounts;
            return this;
        }

        public Builder setWorkingDir(@Nullable String workingDir) {
            this.workingDir = workingDir;
            return this;
        }
        public ServiceTemplateSpecContainer build() {
            return new ServiceTemplateSpecContainer(args, commands, envFroms, envs, image, ports, resources, volumeMounts, workingDir);
        }
    }
}
