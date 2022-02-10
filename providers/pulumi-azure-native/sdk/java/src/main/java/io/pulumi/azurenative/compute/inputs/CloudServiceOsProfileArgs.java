// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.compute.inputs;

import io.pulumi.azurenative.compute.inputs.CloudServiceVaultSecretGroupArgs;
import io.pulumi.core.Input;
import io.pulumi.core.internal.annotations.InputImport;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;


public final class CloudServiceOsProfileArgs extends io.pulumi.resources.ResourceArgs {

    public static final CloudServiceOsProfileArgs Empty = new CloudServiceOsProfileArgs();

    @InputImport(name="secrets")
    private final @Nullable Input<List<CloudServiceVaultSecretGroupArgs>> secrets;

    public Input<List<CloudServiceVaultSecretGroupArgs>> getSecrets() {
        return this.secrets == null ? Input.empty() : this.secrets;
    }

    public CloudServiceOsProfileArgs(@Nullable Input<List<CloudServiceVaultSecretGroupArgs>> secrets) {
        this.secrets = secrets;
    }

    private CloudServiceOsProfileArgs() {
        this.secrets = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(CloudServiceOsProfileArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<List<CloudServiceVaultSecretGroupArgs>> secrets;

        public Builder() {
    	      // Empty
        }

        public Builder(CloudServiceOsProfileArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.secrets = defaults.secrets;
        }

        public Builder setSecrets(@Nullable Input<List<CloudServiceVaultSecretGroupArgs>> secrets) {
            this.secrets = secrets;
            return this;
        }

        public Builder setSecrets(@Nullable List<CloudServiceVaultSecretGroupArgs> secrets) {
            this.secrets = Input.ofNullable(secrets);
            return this;
        }

        public CloudServiceOsProfileArgs build() {
            return new CloudServiceOsProfileArgs(secrets);
        }
    }
}