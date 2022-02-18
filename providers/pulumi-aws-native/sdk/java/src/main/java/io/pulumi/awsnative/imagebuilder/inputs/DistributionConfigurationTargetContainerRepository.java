// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.imagebuilder.inputs;

import io.pulumi.awsnative.imagebuilder.enums.DistributionConfigurationTargetContainerRepositoryService;
import io.pulumi.core.internal.annotations.InputImport;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * The destination repository for the container image.
 * 
 */
public final class DistributionConfigurationTargetContainerRepository extends io.pulumi.resources.InvokeArgs {

    public static final DistributionConfigurationTargetContainerRepository Empty = new DistributionConfigurationTargetContainerRepository();

    /**
     * The repository name of target container repository.
     * 
     */
    @InputImport(name="repositoryName")
    private final @Nullable String repositoryName;

    public Optional<String> getRepositoryName() {
        return this.repositoryName == null ? Optional.empty() : Optional.ofNullable(this.repositoryName);
    }

    /**
     * The service of target container repository.
     * 
     */
    @InputImport(name="service")
    private final @Nullable DistributionConfigurationTargetContainerRepositoryService service;

    public Optional<DistributionConfigurationTargetContainerRepositoryService> getService() {
        return this.service == null ? Optional.empty() : Optional.ofNullable(this.service);
    }

    public DistributionConfigurationTargetContainerRepository(
        @Nullable String repositoryName,
        @Nullable DistributionConfigurationTargetContainerRepositoryService service) {
        this.repositoryName = repositoryName;
        this.service = service;
    }

    private DistributionConfigurationTargetContainerRepository() {
        this.repositoryName = null;
        this.service = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(DistributionConfigurationTargetContainerRepository defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String repositoryName;
        private @Nullable DistributionConfigurationTargetContainerRepositoryService service;

        public Builder() {
    	      // Empty
        }

        public Builder(DistributionConfigurationTargetContainerRepository defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.repositoryName = defaults.repositoryName;
    	      this.service = defaults.service;
        }

        public Builder setRepositoryName(@Nullable String repositoryName) {
            this.repositoryName = repositoryName;
            return this;
        }

        public Builder setService(@Nullable DistributionConfigurationTargetContainerRepositoryService service) {
            this.service = service;
            return this;
        }

        public DistributionConfigurationTargetContainerRepository build() {
            return new DistributionConfigurationTargetContainerRepository(repositoryName, service);
        }
    }
}
