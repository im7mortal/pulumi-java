// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.imagebuilder.inputs;

import io.pulumi.awsnative.imagebuilder.enums.ContainerRecipeTargetContainerRepositoryService;
import io.pulumi.core.Input;
import io.pulumi.core.internal.annotations.InputImport;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * The container repository where the output container image is stored.
 * 
 */
public final class ContainerRecipeTargetContainerRepositoryArgs extends io.pulumi.resources.ResourceArgs {

    public static final ContainerRecipeTargetContainerRepositoryArgs Empty = new ContainerRecipeTargetContainerRepositoryArgs();

    /**
     * The name of the container repository where the output container image is stored. This name is prefixed by the repository location.
     * 
     */
    @InputImport(name="repositoryName")
    private final @Nullable Input<String> repositoryName;

    public Input<String> getRepositoryName() {
        return this.repositoryName == null ? Input.empty() : this.repositoryName;
    }

    /**
     * Specifies the service in which this image was registered.
     * 
     */
    @InputImport(name="service")
    private final @Nullable Input<ContainerRecipeTargetContainerRepositoryService> service;

    public Input<ContainerRecipeTargetContainerRepositoryService> getService() {
        return this.service == null ? Input.empty() : this.service;
    }

    public ContainerRecipeTargetContainerRepositoryArgs(
        @Nullable Input<String> repositoryName,
        @Nullable Input<ContainerRecipeTargetContainerRepositoryService> service) {
        this.repositoryName = repositoryName;
        this.service = service;
    }

    private ContainerRecipeTargetContainerRepositoryArgs() {
        this.repositoryName = Input.empty();
        this.service = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ContainerRecipeTargetContainerRepositoryArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<String> repositoryName;
        private @Nullable Input<ContainerRecipeTargetContainerRepositoryService> service;

        public Builder() {
    	      // Empty
        }

        public Builder(ContainerRecipeTargetContainerRepositoryArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.repositoryName = defaults.repositoryName;
    	      this.service = defaults.service;
        }

        public Builder setRepositoryName(@Nullable Input<String> repositoryName) {
            this.repositoryName = repositoryName;
            return this;
        }

        public Builder setRepositoryName(@Nullable String repositoryName) {
            this.repositoryName = Input.ofNullable(repositoryName);
            return this;
        }

        public Builder setService(@Nullable Input<ContainerRecipeTargetContainerRepositoryService> service) {
            this.service = service;
            return this;
        }

        public Builder setService(@Nullable ContainerRecipeTargetContainerRepositoryService service) {
            this.service = Input.ofNullable(service);
            return this;
        }

        public ContainerRecipeTargetContainerRepositoryArgs build() {
            return new ContainerRecipeTargetContainerRepositoryArgs(repositoryName, service);
        }
    }
}
