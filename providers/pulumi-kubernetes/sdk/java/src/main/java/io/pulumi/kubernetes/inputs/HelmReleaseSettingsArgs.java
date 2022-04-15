// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.kubernetes.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import io.pulumi.core.internal.Codegen;
import io.pulumi.kubernetes.Utilities;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * Options to configure the Helm Release resource.
 * 
 */
public final class HelmReleaseSettingsArgs extends io.pulumi.resources.ResourceArgs {

    public static final HelmReleaseSettingsArgs Empty = new HelmReleaseSettingsArgs();

    /**
     * The backend storage driver for Helm. Values are: configmap, secret, memory, sql.
     * 
     */
    @Import(name="driver")
      private final @Nullable Output<String> driver;

    public Output<String> driver() {
        return this.driver == null ? Codegen.empty() : this.driver;
    }

    /**
     * The path to the helm plugins directory.
     * 
     */
    @Import(name="pluginsPath")
      private final @Nullable Output<String> pluginsPath;

    public Output<String> pluginsPath() {
        return this.pluginsPath == null ? Codegen.empty() : this.pluginsPath;
    }

    /**
     * The path to the registry config file.
     * 
     */
    @Import(name="registryConfigPath")
      private final @Nullable Output<String> registryConfigPath;

    public Output<String> registryConfigPath() {
        return this.registryConfigPath == null ? Codegen.empty() : this.registryConfigPath;
    }

    /**
     * The path to the file containing cached repository indexes.
     * 
     */
    @Import(name="repositoryCache")
      private final @Nullable Output<String> repositoryCache;

    public Output<String> repositoryCache() {
        return this.repositoryCache == null ? Codegen.empty() : this.repositoryCache;
    }

    /**
     * The path to the file containing repository names and URLs.
     * 
     */
    @Import(name="repositoryConfigPath")
      private final @Nullable Output<String> repositoryConfigPath;

    public Output<String> repositoryConfigPath() {
        return this.repositoryConfigPath == null ? Codegen.empty() : this.repositoryConfigPath;
    }

    public HelmReleaseSettingsArgs(
        @Nullable Output<String> driver,
        @Nullable Output<String> pluginsPath,
        @Nullable Output<String> registryConfigPath,
        @Nullable Output<String> repositoryCache,
        @Nullable Output<String> repositoryConfigPath) {
        this.driver = driver == null ? Codegen.ofNullable(Utilities.getEnv("PULUMI_K8S_HELM_DRIVER").orElse(null)) : driver;
        this.pluginsPath = pluginsPath == null ? Codegen.ofNullable(Utilities.getEnv("PULUMI_K8S_HELM_PLUGINS_PATH").orElse(null)) : pluginsPath;
        this.registryConfigPath = registryConfigPath == null ? Codegen.ofNullable(Utilities.getEnv("PULUMI_K8S_HELM_REGISTRY_CONFIG_PATH").orElse(null)) : registryConfigPath;
        this.repositoryCache = repositoryCache == null ? Codegen.ofNullable(Utilities.getEnv("PULUMI_K8S_HELM_REPOSITORY_CACHE").orElse(null)) : repositoryCache;
        this.repositoryConfigPath = repositoryConfigPath == null ? Codegen.ofNullable(Utilities.getEnv("PULUMI_K8S_HELM_REPOSITORY_CONFIG_PATH").orElse(null)) : repositoryConfigPath;
    }

    private HelmReleaseSettingsArgs() {
        this.driver = Codegen.empty();
        this.pluginsPath = Codegen.empty();
        this.registryConfigPath = Codegen.empty();
        this.repositoryCache = Codegen.empty();
        this.repositoryConfigPath = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(HelmReleaseSettingsArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<String> driver;
        private @Nullable Output<String> pluginsPath;
        private @Nullable Output<String> registryConfigPath;
        private @Nullable Output<String> repositoryCache;
        private @Nullable Output<String> repositoryConfigPath;

        public Builder() {
    	      // Empty
        }

        public Builder(HelmReleaseSettingsArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.driver = defaults.driver;
    	      this.pluginsPath = defaults.pluginsPath;
    	      this.registryConfigPath = defaults.registryConfigPath;
    	      this.repositoryCache = defaults.repositoryCache;
    	      this.repositoryConfigPath = defaults.repositoryConfigPath;
        }

        public Builder driver(@Nullable Output<String> driver) {
            this.driver = driver;
            return this;
        }
        public Builder driver(@Nullable String driver) {
            this.driver = Codegen.ofNullable(driver);
            return this;
        }
        public Builder pluginsPath(@Nullable Output<String> pluginsPath) {
            this.pluginsPath = pluginsPath;
            return this;
        }
        public Builder pluginsPath(@Nullable String pluginsPath) {
            this.pluginsPath = Codegen.ofNullable(pluginsPath);
            return this;
        }
        public Builder registryConfigPath(@Nullable Output<String> registryConfigPath) {
            this.registryConfigPath = registryConfigPath;
            return this;
        }
        public Builder registryConfigPath(@Nullable String registryConfigPath) {
            this.registryConfigPath = Codegen.ofNullable(registryConfigPath);
            return this;
        }
        public Builder repositoryCache(@Nullable Output<String> repositoryCache) {
            this.repositoryCache = repositoryCache;
            return this;
        }
        public Builder repositoryCache(@Nullable String repositoryCache) {
            this.repositoryCache = Codegen.ofNullable(repositoryCache);
            return this;
        }
        public Builder repositoryConfigPath(@Nullable Output<String> repositoryConfigPath) {
            this.repositoryConfigPath = repositoryConfigPath;
            return this;
        }
        public Builder repositoryConfigPath(@Nullable String repositoryConfigPath) {
            this.repositoryConfigPath = Codegen.ofNullable(repositoryConfigPath);
            return this;
        }        public HelmReleaseSettingsArgs build() {
            return new HelmReleaseSettingsArgs(driver, pluginsPath, registryConfigPath, repositoryCache, repositoryConfigPath);
        }
    }
}
