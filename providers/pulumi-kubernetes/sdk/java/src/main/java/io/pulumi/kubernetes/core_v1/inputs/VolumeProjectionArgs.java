// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.kubernetes.core_v1.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import io.pulumi.core.internal.Codegen;
import io.pulumi.kubernetes.core_v1.inputs.ConfigMapProjectionArgs;
import io.pulumi.kubernetes.core_v1.inputs.DownwardAPIProjectionArgs;
import io.pulumi.kubernetes.core_v1.inputs.SecretProjectionArgs;
import io.pulumi.kubernetes.core_v1.inputs.ServiceAccountTokenProjectionArgs;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * Projection that may be projected along with other supported volume types
 * 
 */
public final class VolumeProjectionArgs extends io.pulumi.resources.ResourceArgs {

    public static final VolumeProjectionArgs Empty = new VolumeProjectionArgs();

    /**
     * information about the configMap data to project
     * 
     */
    @Import(name="configMap")
      private final @Nullable Output<ConfigMapProjectionArgs> configMap;

    public Output<ConfigMapProjectionArgs> configMap() {
        return this.configMap == null ? Codegen.empty() : this.configMap;
    }

    /**
     * information about the downwardAPI data to project
     * 
     */
    @Import(name="downwardAPI")
      private final @Nullable Output<DownwardAPIProjectionArgs> downwardAPI;

    public Output<DownwardAPIProjectionArgs> downwardAPI() {
        return this.downwardAPI == null ? Codegen.empty() : this.downwardAPI;
    }

    /**
     * information about the secret data to project
     * 
     */
    @Import(name="secret")
      private final @Nullable Output<SecretProjectionArgs> secret;

    public Output<SecretProjectionArgs> secret() {
        return this.secret == null ? Codegen.empty() : this.secret;
    }

    /**
     * information about the serviceAccountToken data to project
     * 
     */
    @Import(name="serviceAccountToken")
      private final @Nullable Output<ServiceAccountTokenProjectionArgs> serviceAccountToken;

    public Output<ServiceAccountTokenProjectionArgs> serviceAccountToken() {
        return this.serviceAccountToken == null ? Codegen.empty() : this.serviceAccountToken;
    }

    public VolumeProjectionArgs(
        @Nullable Output<ConfigMapProjectionArgs> configMap,
        @Nullable Output<DownwardAPIProjectionArgs> downwardAPI,
        @Nullable Output<SecretProjectionArgs> secret,
        @Nullable Output<ServiceAccountTokenProjectionArgs> serviceAccountToken) {
        this.configMap = configMap;
        this.downwardAPI = downwardAPI;
        this.secret = secret;
        this.serviceAccountToken = serviceAccountToken;
    }

    private VolumeProjectionArgs() {
        this.configMap = Codegen.empty();
        this.downwardAPI = Codegen.empty();
        this.secret = Codegen.empty();
        this.serviceAccountToken = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(VolumeProjectionArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<ConfigMapProjectionArgs> configMap;
        private @Nullable Output<DownwardAPIProjectionArgs> downwardAPI;
        private @Nullable Output<SecretProjectionArgs> secret;
        private @Nullable Output<ServiceAccountTokenProjectionArgs> serviceAccountToken;

        public Builder() {
    	      // Empty
        }

        public Builder(VolumeProjectionArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.configMap = defaults.configMap;
    	      this.downwardAPI = defaults.downwardAPI;
    	      this.secret = defaults.secret;
    	      this.serviceAccountToken = defaults.serviceAccountToken;
        }

        public Builder configMap(@Nullable Output<ConfigMapProjectionArgs> configMap) {
            this.configMap = configMap;
            return this;
        }
        public Builder configMap(@Nullable ConfigMapProjectionArgs configMap) {
            this.configMap = Codegen.ofNullable(configMap);
            return this;
        }
        public Builder downwardAPI(@Nullable Output<DownwardAPIProjectionArgs> downwardAPI) {
            this.downwardAPI = downwardAPI;
            return this;
        }
        public Builder downwardAPI(@Nullable DownwardAPIProjectionArgs downwardAPI) {
            this.downwardAPI = Codegen.ofNullable(downwardAPI);
            return this;
        }
        public Builder secret(@Nullable Output<SecretProjectionArgs> secret) {
            this.secret = secret;
            return this;
        }
        public Builder secret(@Nullable SecretProjectionArgs secret) {
            this.secret = Codegen.ofNullable(secret);
            return this;
        }
        public Builder serviceAccountToken(@Nullable Output<ServiceAccountTokenProjectionArgs> serviceAccountToken) {
            this.serviceAccountToken = serviceAccountToken;
            return this;
        }
        public Builder serviceAccountToken(@Nullable ServiceAccountTokenProjectionArgs serviceAccountToken) {
            this.serviceAccountToken = Codegen.ofNullable(serviceAccountToken);
            return this;
        }        public VolumeProjectionArgs build() {
            return new VolumeProjectionArgs(configMap, downwardAPI, secret, serviceAccountToken);
        }
    }
}
