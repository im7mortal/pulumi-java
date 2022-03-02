// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.kubernetes.settings.k8s.io_v1alpha1;

import io.pulumi.core.Input;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.OutputExport;
import io.pulumi.core.annotations.ResourceType;
import io.pulumi.kubernetes.Utilities;
import io.pulumi.kubernetes.meta_v1.outputs.ObjectMeta;
import io.pulumi.kubernetes.settings.k8s.io_v1alpha1.PodPresetArgs;
import io.pulumi.kubernetes.settings.k8s.io_v1alpha1.outputs.PodPresetSpec;
import java.lang.String;
import javax.annotation.Nullable;

/**
 * PodPreset is a policy resource that defines additional runtime requirements for a Pod.
 * 
 */
@ResourceType(type="kubernetes:settings.k8s.io/v1alpha1:PodPreset")
public class PodPreset extends io.pulumi.resources.CustomResource {
    /**
     * APIVersion defines the versioned schema of this representation of an object. Servers should convert recognized schemas to the latest internal value, and may reject unrecognized values. More info: https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#resources
     * 
     */
    @OutputExport(name="apiVersion", type=String.class, parameters={})
    private Output</* @Nullable */ String> apiVersion;

    /**
     * @return APIVersion defines the versioned schema of this representation of an object. Servers should convert recognized schemas to the latest internal value, and may reject unrecognized values. More info: https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#resources
     * 
     */
    public Output</* @Nullable */ String> getApiVersion() {
        return this.apiVersion;
    }
    /**
     * Kind is a string value representing the REST resource this object represents. Servers may infer this from the endpoint the client submits requests to. Cannot be updated. In CamelCase. More info: https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#types-kinds
     * 
     */
    @OutputExport(name="kind", type=String.class, parameters={})
    private Output</* @Nullable */ String> kind;

    /**
     * @return Kind is a string value representing the REST resource this object represents. Servers may infer this from the endpoint the client submits requests to. Cannot be updated. In CamelCase. More info: https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#types-kinds
     * 
     */
    public Output</* @Nullable */ String> getKind() {
        return this.kind;
    }
    @OutputExport(name="metadata", type=ObjectMeta.class, parameters={})
    private Output</* @Nullable */ ObjectMeta> metadata;

    public Output</* @Nullable */ ObjectMeta> getMetadata() {
        return this.metadata;
    }
    @OutputExport(name="spec", type=PodPresetSpec.class, parameters={})
    private Output</* @Nullable */ PodPresetSpec> spec;

    public Output</* @Nullable */ PodPresetSpec> getSpec() {
        return this.spec;
    }

    public interface BuilderApplicator {
        public void apply(@Nullable PodPresetArgs.Builder a);
    }
    private static io.pulumi.kubernetes.settings.k8s.io_v1alpha1.PodPresetArgs buildArgs(BuilderApplicator argsBuilder) {
        final var builder = io.pulumi.kubernetes.settings.k8s.io_v1alpha1.PodPresetArgs.builder();
        argsBuilder.apply(builder);
        return builder.build();
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param argsBuilder A function that configures a passed builder.
     */
    public PodPreset(String name, BuilderApplicator argsBuilder) {
        this(name, buildArgs(argsBuilder), null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public PodPreset(String name) {
        this(name, PodPresetArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public PodPreset(String name, @Nullable PodPresetArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public PodPreset(String name, @Nullable PodPresetArgs args, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("kubernetes:settings.k8s.io/v1alpha1:PodPreset", name, makeArgs(args), makeResourceOptions(options, Input.empty()));
    }

    private PodPreset(String name, Input<String> id, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("kubernetes:settings.k8s.io/v1alpha1:PodPreset", name, null, makeResourceOptions(options, id));
    }

    private static PodPresetArgs makeArgs(@Nullable PodPresetArgs args) {
        var builder = args == null ? PodPresetArgs.builder() : PodPresetArgs.builder(args);
        return builder
            .setApiVersion("settings.k8s.io/v1alpha1")
            .setKind("PodPreset")
            .build();
    }

    private static io.pulumi.resources.CustomResourceOptions makeResourceOptions(@Nullable io.pulumi.resources.CustomResourceOptions options, @Nullable Input<String> id) {
        var defaultOptions = io.pulumi.resources.CustomResourceOptions.builder()
            .setVersion(Utilities.getVersion())
            .build();
        return io.pulumi.resources.CustomResourceOptions.merge(defaultOptions, options, id);
    }

    /**
     * Get an existing Host resource's state with the given name, ID, and optional extra
     * properties used to qualify the lookup.
     *
     * @param name The _unique_ name of the resulting resource.
     * @param id The _unique_ provider ID of the resource to lookup.
     * @param options Optional settings to control the behavior of the CustomResource.
     */
    public static PodPreset get(String name, Input<String> id, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        return new PodPreset(name, id, options);
    }
}
