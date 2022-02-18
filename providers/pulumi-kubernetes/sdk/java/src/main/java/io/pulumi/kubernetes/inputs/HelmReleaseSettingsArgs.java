// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.kubernetes.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
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
    @InputImport(name="driver")
    private final @Nullable Input<String> driver;

    public Input<String> getDriver() {
        return this.driver == null ? Input.empty() : this.driver;
    }

    /**
     * The path to the helm plugins directory.
     * 
     */
    @InputImport(name="pluginsPath")
    private final @Nullable Input<String> pluginsPath;

    public Input<String> getPluginsPath() {
        return this.pluginsPath == null ? Input.empty() : this.pluginsPath;
    }

    /**
     * The path to the registry config file.
     * 
     */
    @InputImport(name="registryConfigPath")
    private final @Nullable Input<String> registryConfigPath;

    public Input<String> getRegistryConfigPath() {
        return this.registryConfigPath == null ? Input.empty() : this.registryConfigPath;
    }

    /**
     * The path to the file containing cached repository indexes.
     * 
     */
    @InputImport(name="repositoryCache")
    private final @Nullable Input<String> repositoryCache;

    public Input<String> getRepositoryCache() {
        return this.repositoryCache == null ? Input.empty() : this.repositoryCache;
    }

    /**
     * The path to the file containing repository names and URLs.
     * 
     */
    @InputImport(name="repositoryConfigPath")
    private final @Nullable Input<String> repositoryConfigPath;

    public Input<String> getRepositoryConfigPath() {
        return this.repositoryConfigPath == null ? Input.empty() : this.repositoryConfigPath;
    }

    public HelmReleaseSettingsArgs(
        @Nullable Input<String> driver,
        @Nullable Input<String> pluginsPath,
        @Nullable Input<String> registryConfigPath,
        @Nullable Input<String> repositoryCache,
        @Nullable Input<String> repositoryConfigPath) {
        this.driver = driver == null ? Input.ofNullable(Utilities.getEnv("PULUMI_K8S_HELM_DRIVER").orElse(null)) : driver;
        this.pluginsPath = pluginsPath == null ? Input.ofNullable(Utilities.getEnv("PULUMI_K8S_HELM_PLUGINS_PATH").orElse(null)) : pluginsPath;
        this.registryConfigPath = registryConfigPath == null ? Input.ofNullable(Utilities.getEnv("PULUMI_K8S_HELM_REGISTRY_CONFIG_PATH").orElse(null)) : registryConfigPath;
        this.repositoryCache = repositoryCache == null ? Input.ofNullable(Utilities.getEnv("PULUMI_K8S_HELM_REPOSITORY_CACHE").orElse(null)) : repositoryCache;
        this.repositoryConfigPath = repositoryConfigPath == null ? Input.ofNullable(Utilities.getEnv("PULUMI_K8S_HELM_REPOSITORY_CONFIG_PATH").orElse(null)) : repositoryConfigPath;
    }

    private HelmReleaseSettingsArgs() {
        this.driver = Input.empty();
        this.pluginsPath = Input.empty();
        this.registryConfigPath = Input.empty();
        this.repositoryCache = Input.empty();
        this.repositoryConfigPath = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(HelmReleaseSettingsArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<String> driver;
        private @Nullable Input<String> pluginsPath;
        private @Nullable Input<String> registryConfigPath;
        private @Nullable Input<String> repositoryCache;
        private @Nullable Input<String> repositoryConfigPath;

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

        public Builder setDriver(@Nullable Input<String> driver) {
            this.driver = driver;
            return this;
        }

        public Builder setDriver(@Nullable String driver) {
            this.driver = Input.ofNullable(driver);
            return this;
        }

        public Builder setPluginsPath(@Nullable Input<String> pluginsPath) {
            this.pluginsPath = pluginsPath;
            return this;
        }

        public Builder setPluginsPath(@Nullable String pluginsPath) {
            this.pluginsPath = Input.ofNullable(pluginsPath);
            return this;
        }

        public Builder setRegistryConfigPath(@Nullable Input<String> registryConfigPath) {
            this.registryConfigPath = registryConfigPath;
            return this;
        }

        public Builder setRegistryConfigPath(@Nullable String registryConfigPath) {
            this.registryConfigPath = Input.ofNullable(registryConfigPath);
            return this;
        }

        public Builder setRepositoryCache(@Nullable Input<String> repositoryCache) {
            this.repositoryCache = repositoryCache;
            return this;
        }

        public Builder setRepositoryCache(@Nullable String repositoryCache) {
            this.repositoryCache = Input.ofNullable(repositoryCache);
            return this;
        }

        public Builder setRepositoryConfigPath(@Nullable Input<String> repositoryConfigPath) {
            this.repositoryConfigPath = repositoryConfigPath;
            return this;
        }

        public Builder setRepositoryConfigPath(@Nullable String repositoryConfigPath) {
            this.repositoryConfigPath = Input.ofNullable(repositoryConfigPath);
            return this;
        }

        public HelmReleaseSettingsArgs build() {
            return new HelmReleaseSettingsArgs(driver, pluginsPath, registryConfigPath, repositoryCache, repositoryConfigPath);
        }
    }
}
