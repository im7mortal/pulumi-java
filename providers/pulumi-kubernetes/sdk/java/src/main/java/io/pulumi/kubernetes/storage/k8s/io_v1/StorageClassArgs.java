// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.kubernetes.storage.k8s.io_v1;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import io.pulumi.core.internal.Codegen;
import io.pulumi.kubernetes.core_v1.inputs.TopologySelectorTermArgs;
import io.pulumi.kubernetes.meta_v1.inputs.ObjectMetaArgs;
import java.lang.Boolean;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import javax.annotation.Nullable;


public final class StorageClassArgs extends io.pulumi.resources.ResourceArgs {

    public static final StorageClassArgs Empty = new StorageClassArgs();

    /**
     * AllowVolumeExpansion shows whether the storage class allow volume expand
     * 
     */
    @Import(name="allowVolumeExpansion")
      private final @Nullable Output<Boolean> allowVolumeExpansion;

    public Output<Boolean> allowVolumeExpansion() {
        return this.allowVolumeExpansion == null ? Codegen.empty() : this.allowVolumeExpansion;
    }

    /**
     * Restrict the node topologies where volumes can be dynamically provisioned. Each volume plugin defines its own supported topology specifications. An empty TopologySelectorTerm list means there is no topology restriction. This field is only honored by servers that enable the VolumeScheduling feature.
     * 
     */
    @Import(name="allowedTopologies")
      private final @Nullable Output<List<TopologySelectorTermArgs>> allowedTopologies;

    public Output<List<TopologySelectorTermArgs>> allowedTopologies() {
        return this.allowedTopologies == null ? Codegen.empty() : this.allowedTopologies;
    }

    /**
     * APIVersion defines the versioned schema of this representation of an object. Servers should convert recognized schemas to the latest internal value, and may reject unrecognized values. More info: https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#resources
     * 
     */
    @Import(name="apiVersion")
      private final @Nullable Output<String> apiVersion;

    public Output<String> apiVersion() {
        return this.apiVersion == null ? Codegen.empty() : this.apiVersion;
    }

    /**
     * Kind is a string value representing the REST resource this object represents. Servers may infer this from the endpoint the client submits requests to. Cannot be updated. In CamelCase. More info: https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#types-kinds
     * 
     */
    @Import(name="kind")
      private final @Nullable Output<String> kind;

    public Output<String> kind() {
        return this.kind == null ? Codegen.empty() : this.kind;
    }

    /**
     * Standard object's metadata. More info: https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#metadata
     * 
     */
    @Import(name="metadata")
      private final @Nullable Output<ObjectMetaArgs> metadata;

    public Output<ObjectMetaArgs> metadata() {
        return this.metadata == null ? Codegen.empty() : this.metadata;
    }

    /**
     * Dynamically provisioned PersistentVolumes of this storage class are created with these mountOptions, e.g. ["ro", "soft"]. Not validated - mount of the PVs will simply fail if one is invalid.
     * 
     */
    @Import(name="mountOptions")
      private final @Nullable Output<List<String>> mountOptions;

    public Output<List<String>> mountOptions() {
        return this.mountOptions == null ? Codegen.empty() : this.mountOptions;
    }

    /**
     * Parameters holds the parameters for the provisioner that should create volumes of this storage class.
     * 
     */
    @Import(name="parameters")
      private final @Nullable Output<Map<String,String>> parameters;

    public Output<Map<String,String>> parameters() {
        return this.parameters == null ? Codegen.empty() : this.parameters;
    }

    /**
     * Provisioner indicates the type of the provisioner.
     * 
     */
    @Import(name="provisioner", required=true)
      private final Output<String> provisioner;

    public Output<String> provisioner() {
        return this.provisioner;
    }

    /**
     * Dynamically provisioned PersistentVolumes of this storage class are created with this reclaimPolicy. Defaults to Delete.
     * 
     */
    @Import(name="reclaimPolicy")
      private final @Nullable Output<String> reclaimPolicy;

    public Output<String> reclaimPolicy() {
        return this.reclaimPolicy == null ? Codegen.empty() : this.reclaimPolicy;
    }

    /**
     * VolumeBindingMode indicates how PersistentVolumeClaims should be provisioned and bound.  When unset, VolumeBindingImmediate is used. This field is only honored by servers that enable the VolumeScheduling feature.
     * 
     */
    @Import(name="volumeBindingMode")
      private final @Nullable Output<String> volumeBindingMode;

    public Output<String> volumeBindingMode() {
        return this.volumeBindingMode == null ? Codegen.empty() : this.volumeBindingMode;
    }

    public StorageClassArgs(
        @Nullable Output<Boolean> allowVolumeExpansion,
        @Nullable Output<List<TopologySelectorTermArgs>> allowedTopologies,
        @Nullable Output<String> apiVersion,
        @Nullable Output<String> kind,
        @Nullable Output<ObjectMetaArgs> metadata,
        @Nullable Output<List<String>> mountOptions,
        @Nullable Output<Map<String,String>> parameters,
        Output<String> provisioner,
        @Nullable Output<String> reclaimPolicy,
        @Nullable Output<String> volumeBindingMode) {
        this.allowVolumeExpansion = allowVolumeExpansion;
        this.allowedTopologies = allowedTopologies;
        this.apiVersion = apiVersion;
        this.kind = kind;
        this.metadata = metadata;
        this.mountOptions = mountOptions;
        this.parameters = parameters;
        this.provisioner = Objects.requireNonNull(provisioner, "expected parameter 'provisioner' to be non-null");
        this.reclaimPolicy = reclaimPolicy;
        this.volumeBindingMode = volumeBindingMode;
    }

    private StorageClassArgs() {
        this.allowVolumeExpansion = Codegen.empty();
        this.allowedTopologies = Codegen.empty();
        this.apiVersion = Codegen.empty();
        this.kind = Codegen.empty();
        this.metadata = Codegen.empty();
        this.mountOptions = Codegen.empty();
        this.parameters = Codegen.empty();
        this.provisioner = Codegen.empty();
        this.reclaimPolicy = Codegen.empty();
        this.volumeBindingMode = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(StorageClassArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<Boolean> allowVolumeExpansion;
        private @Nullable Output<List<TopologySelectorTermArgs>> allowedTopologies;
        private @Nullable Output<String> apiVersion;
        private @Nullable Output<String> kind;
        private @Nullable Output<ObjectMetaArgs> metadata;
        private @Nullable Output<List<String>> mountOptions;
        private @Nullable Output<Map<String,String>> parameters;
        private Output<String> provisioner;
        private @Nullable Output<String> reclaimPolicy;
        private @Nullable Output<String> volumeBindingMode;

        public Builder() {
    	      // Empty
        }

        public Builder(StorageClassArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.allowVolumeExpansion = defaults.allowVolumeExpansion;
    	      this.allowedTopologies = defaults.allowedTopologies;
    	      this.apiVersion = defaults.apiVersion;
    	      this.kind = defaults.kind;
    	      this.metadata = defaults.metadata;
    	      this.mountOptions = defaults.mountOptions;
    	      this.parameters = defaults.parameters;
    	      this.provisioner = defaults.provisioner;
    	      this.reclaimPolicy = defaults.reclaimPolicy;
    	      this.volumeBindingMode = defaults.volumeBindingMode;
        }

        public Builder allowVolumeExpansion(@Nullable Output<Boolean> allowVolumeExpansion) {
            this.allowVolumeExpansion = allowVolumeExpansion;
            return this;
        }
        public Builder allowVolumeExpansion(@Nullable Boolean allowVolumeExpansion) {
            this.allowVolumeExpansion = Codegen.ofNullable(allowVolumeExpansion);
            return this;
        }
        public Builder allowedTopologies(@Nullable Output<List<TopologySelectorTermArgs>> allowedTopologies) {
            this.allowedTopologies = allowedTopologies;
            return this;
        }
        public Builder allowedTopologies(@Nullable List<TopologySelectorTermArgs> allowedTopologies) {
            this.allowedTopologies = Codegen.ofNullable(allowedTopologies);
            return this;
        }
        public Builder allowedTopologies(TopologySelectorTermArgs... allowedTopologies) {
            return allowedTopologies(List.of(allowedTopologies));
        }
        public Builder apiVersion(@Nullable Output<String> apiVersion) {
            this.apiVersion = apiVersion;
            return this;
        }
        public Builder apiVersion(@Nullable String apiVersion) {
            this.apiVersion = Codegen.ofNullable(apiVersion);
            return this;
        }
        public Builder kind(@Nullable Output<String> kind) {
            this.kind = kind;
            return this;
        }
        public Builder kind(@Nullable String kind) {
            this.kind = Codegen.ofNullable(kind);
            return this;
        }
        public Builder metadata(@Nullable Output<ObjectMetaArgs> metadata) {
            this.metadata = metadata;
            return this;
        }
        public Builder metadata(@Nullable ObjectMetaArgs metadata) {
            this.metadata = Codegen.ofNullable(metadata);
            return this;
        }
        public Builder mountOptions(@Nullable Output<List<String>> mountOptions) {
            this.mountOptions = mountOptions;
            return this;
        }
        public Builder mountOptions(@Nullable List<String> mountOptions) {
            this.mountOptions = Codegen.ofNullable(mountOptions);
            return this;
        }
        public Builder mountOptions(String... mountOptions) {
            return mountOptions(List.of(mountOptions));
        }
        public Builder parameters(@Nullable Output<Map<String,String>> parameters) {
            this.parameters = parameters;
            return this;
        }
        public Builder parameters(@Nullable Map<String,String> parameters) {
            this.parameters = Codegen.ofNullable(parameters);
            return this;
        }
        public Builder provisioner(Output<String> provisioner) {
            this.provisioner = Objects.requireNonNull(provisioner);
            return this;
        }
        public Builder provisioner(String provisioner) {
            this.provisioner = Output.of(Objects.requireNonNull(provisioner));
            return this;
        }
        public Builder reclaimPolicy(@Nullable Output<String> reclaimPolicy) {
            this.reclaimPolicy = reclaimPolicy;
            return this;
        }
        public Builder reclaimPolicy(@Nullable String reclaimPolicy) {
            this.reclaimPolicy = Codegen.ofNullable(reclaimPolicy);
            return this;
        }
        public Builder volumeBindingMode(@Nullable Output<String> volumeBindingMode) {
            this.volumeBindingMode = volumeBindingMode;
            return this;
        }
        public Builder volumeBindingMode(@Nullable String volumeBindingMode) {
            this.volumeBindingMode = Codegen.ofNullable(volumeBindingMode);
            return this;
        }        public StorageClassArgs build() {
            return new StorageClassArgs(allowVolumeExpansion, allowedTopologies, apiVersion, kind, metadata, mountOptions, parameters, provisioner, reclaimPolicy, volumeBindingMode);
        }
    }
}
