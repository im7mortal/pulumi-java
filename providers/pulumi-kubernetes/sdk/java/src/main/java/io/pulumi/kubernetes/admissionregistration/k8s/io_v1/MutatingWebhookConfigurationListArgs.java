// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.kubernetes.admissionregistration.k8s.io_v1;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import io.pulumi.core.internal.Codegen;
import io.pulumi.kubernetes.admissionregistration.k8s.io_v1.inputs.MutatingWebhookConfigurationArgs;
import io.pulumi.kubernetes.meta_v1.inputs.ListMetaArgs;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;


public final class MutatingWebhookConfigurationListArgs extends io.pulumi.resources.ResourceArgs {

    public static final MutatingWebhookConfigurationListArgs Empty = new MutatingWebhookConfigurationListArgs();

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
     * List of MutatingWebhookConfiguration.
     * 
     */
    @Import(name="items", required=true)
      private final Output<List<MutatingWebhookConfigurationArgs>> items;

    public Output<List<MutatingWebhookConfigurationArgs>> items() {
        return this.items;
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
     * Standard list metadata. More info: https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#types-kinds
     * 
     */
    @Import(name="metadata")
      private final @Nullable Output<ListMetaArgs> metadata;

    public Output<ListMetaArgs> metadata() {
        return this.metadata == null ? Codegen.empty() : this.metadata;
    }

    public MutatingWebhookConfigurationListArgs(
        @Nullable Output<String> apiVersion,
        Output<List<MutatingWebhookConfigurationArgs>> items,
        @Nullable Output<String> kind,
        @Nullable Output<ListMetaArgs> metadata) {
        this.apiVersion = apiVersion;
        this.items = Objects.requireNonNull(items, "expected parameter 'items' to be non-null");
        this.kind = kind;
        this.metadata = metadata;
    }

    private MutatingWebhookConfigurationListArgs() {
        this.apiVersion = Codegen.empty();
        this.items = Codegen.empty();
        this.kind = Codegen.empty();
        this.metadata = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(MutatingWebhookConfigurationListArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<String> apiVersion;
        private Output<List<MutatingWebhookConfigurationArgs>> items;
        private @Nullable Output<String> kind;
        private @Nullable Output<ListMetaArgs> metadata;

        public Builder() {
    	      // Empty
        }

        public Builder(MutatingWebhookConfigurationListArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.apiVersion = defaults.apiVersion;
    	      this.items = defaults.items;
    	      this.kind = defaults.kind;
    	      this.metadata = defaults.metadata;
        }

        public Builder apiVersion(@Nullable Output<String> apiVersion) {
            this.apiVersion = apiVersion;
            return this;
        }
        public Builder apiVersion(@Nullable String apiVersion) {
            this.apiVersion = Codegen.ofNullable(apiVersion);
            return this;
        }
        public Builder items(Output<List<MutatingWebhookConfigurationArgs>> items) {
            this.items = Objects.requireNonNull(items);
            return this;
        }
        public Builder items(List<MutatingWebhookConfigurationArgs> items) {
            this.items = Output.of(Objects.requireNonNull(items));
            return this;
        }
        public Builder items(MutatingWebhookConfigurationArgs... items) {
            return items(List.of(items));
        }
        public Builder kind(@Nullable Output<String> kind) {
            this.kind = kind;
            return this;
        }
        public Builder kind(@Nullable String kind) {
            this.kind = Codegen.ofNullable(kind);
            return this;
        }
        public Builder metadata(@Nullable Output<ListMetaArgs> metadata) {
            this.metadata = metadata;
            return this;
        }
        public Builder metadata(@Nullable ListMetaArgs metadata) {
            this.metadata = Codegen.ofNullable(metadata);
            return this;
        }        public MutatingWebhookConfigurationListArgs build() {
            return new MutatingWebhookConfigurationListArgs(apiVersion, items, kind, metadata);
        }
    }
}
