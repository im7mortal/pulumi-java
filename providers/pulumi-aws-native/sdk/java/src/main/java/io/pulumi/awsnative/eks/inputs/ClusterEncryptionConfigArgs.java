// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.eks.inputs;

import io.pulumi.awsnative.eks.inputs.ClusterEncryptionConfigProviderPropertiesArgs;
import io.pulumi.core.Input;
import io.pulumi.core.internal.annotations.InputImport;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * The encryption configuration for the cluster
 * 
 */
public final class ClusterEncryptionConfigArgs extends io.pulumi.resources.ResourceArgs {

    public static final ClusterEncryptionConfigArgs Empty = new ClusterEncryptionConfigArgs();

    /**
     * The encryption provider for the cluster.
     * 
     */
    @InputImport(name="provider")
    private final @Nullable Input<ClusterEncryptionConfigProviderPropertiesArgs> provider;

    public Input<ClusterEncryptionConfigProviderPropertiesArgs> getProvider() {
        return this.provider == null ? Input.empty() : this.provider;
    }

    /**
     * Specifies the resources to be encrypted. The only supported value is "secrets".
     * 
     */
    @InputImport(name="resources")
    private final @Nullable Input<List<String>> resources;

    public Input<List<String>> getResources() {
        return this.resources == null ? Input.empty() : this.resources;
    }

    public ClusterEncryptionConfigArgs(
        @Nullable Input<ClusterEncryptionConfigProviderPropertiesArgs> provider,
        @Nullable Input<List<String>> resources) {
        this.provider = provider;
        this.resources = resources;
    }

    private ClusterEncryptionConfigArgs() {
        this.provider = Input.empty();
        this.resources = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ClusterEncryptionConfigArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<ClusterEncryptionConfigProviderPropertiesArgs> provider;
        private @Nullable Input<List<String>> resources;

        public Builder() {
    	      // Empty
        }

        public Builder(ClusterEncryptionConfigArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.provider = defaults.provider;
    	      this.resources = defaults.resources;
        }

        public Builder setProvider(@Nullable Input<ClusterEncryptionConfigProviderPropertiesArgs> provider) {
            this.provider = provider;
            return this;
        }

        public Builder setProvider(@Nullable ClusterEncryptionConfigProviderPropertiesArgs provider) {
            this.provider = Input.ofNullable(provider);
            return this;
        }

        public Builder setResources(@Nullable Input<List<String>> resources) {
            this.resources = resources;
            return this;
        }

        public Builder setResources(@Nullable List<String> resources) {
            this.resources = Input.ofNullable(resources);
            return this;
        }

        public ClusterEncryptionConfigArgs build() {
            return new ClusterEncryptionConfigArgs(provider, resources);
        }
    }
}
