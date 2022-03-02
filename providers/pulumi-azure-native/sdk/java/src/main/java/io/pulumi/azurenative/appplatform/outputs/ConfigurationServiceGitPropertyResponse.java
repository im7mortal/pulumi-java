// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.appplatform.outputs;

import io.pulumi.azurenative.appplatform.outputs.ConfigurationServiceGitRepositoryResponse;
import io.pulumi.core.annotations.OutputCustomType;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;

@OutputCustomType
public final class ConfigurationServiceGitPropertyResponse {
    /**
     * Repositories of Application Configuration Service git property.
     * 
     */
    private final @Nullable List<ConfigurationServiceGitRepositoryResponse> repositories;

    @OutputCustomType.Constructor({"repositories"})
    private ConfigurationServiceGitPropertyResponse(@Nullable List<ConfigurationServiceGitRepositoryResponse> repositories) {
        this.repositories = repositories;
    }

    /**
     * Repositories of Application Configuration Service git property.
     * 
    */
    public List<ConfigurationServiceGitRepositoryResponse> getRepositories() {
        return this.repositories == null ? List.of() : this.repositories;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ConfigurationServiceGitPropertyResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable List<ConfigurationServiceGitRepositoryResponse> repositories;

        public Builder() {
    	      // Empty
        }

        public Builder(ConfigurationServiceGitPropertyResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.repositories = defaults.repositories;
        }

        public Builder setRepositories(@Nullable List<ConfigurationServiceGitRepositoryResponse> repositories) {
            this.repositories = repositories;
            return this;
        }
        public ConfigurationServiceGitPropertyResponse build() {
            return new ConfigurationServiceGitPropertyResponse(repositories);
        }
    }
}
