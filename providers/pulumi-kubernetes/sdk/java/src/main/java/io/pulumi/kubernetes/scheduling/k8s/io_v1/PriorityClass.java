// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.kubernetes.scheduling.k8s.io_v1;

import io.pulumi.core.Alias;
import io.pulumi.core.Input;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.OutputExport;
import io.pulumi.core.annotations.ResourceType;
import io.pulumi.kubernetes.Utilities;
import io.pulumi.kubernetes.meta_v1.outputs.ObjectMeta;
import io.pulumi.kubernetes.scheduling.k8s.io_v1.PriorityClassArgs;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import javax.annotation.Nullable;

/**
 * PriorityClass defines mapping from a priority class name to the priority integer value. The value can be any valid integer.
 * 
 */
@ResourceType(type="kubernetes:scheduling.k8s.io/v1:PriorityClass")
public class PriorityClass extends io.pulumi.resources.CustomResource {
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
     * description is an arbitrary string that usually provides guidelines on when this priority class should be used.
     * 
     */
    @OutputExport(name="description", type=String.class, parameters={})
    private Output</* @Nullable */ String> description;

    /**
     * @return description is an arbitrary string that usually provides guidelines on when this priority class should be used.
     * 
     */
    public Output</* @Nullable */ String> getDescription() {
        return this.description;
    }
    /**
     * globalDefault specifies whether this PriorityClass should be considered as the default priority for pods that do not have any priority class. Only one PriorityClass can be marked as `globalDefault`. However, if more than one PriorityClasses exists with their `globalDefault` field set to true, the smallest value of such global default PriorityClasses will be used as the default priority.
     * 
     */
    @OutputExport(name="globalDefault", type=Boolean.class, parameters={})
    private Output</* @Nullable */ Boolean> globalDefault;

    /**
     * @return globalDefault specifies whether this PriorityClass should be considered as the default priority for pods that do not have any priority class. Only one PriorityClass can be marked as `globalDefault`. However, if more than one PriorityClasses exists with their `globalDefault` field set to true, the smallest value of such global default PriorityClasses will be used as the default priority.
     * 
     */
    public Output</* @Nullable */ Boolean> getGlobalDefault() {
        return this.globalDefault;
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
    /**
     * Standard object's metadata. More info: https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#metadata
     * 
     */
    @OutputExport(name="metadata", type=ObjectMeta.class, parameters={})
    private Output</* @Nullable */ ObjectMeta> metadata;

    /**
     * @return Standard object's metadata. More info: https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#metadata
     * 
     */
    public Output</* @Nullable */ ObjectMeta> getMetadata() {
        return this.metadata;
    }
    /**
     * PreemptionPolicy is the Policy for preempting pods with lower priority. One of Never, PreemptLowerPriority. Defaults to PreemptLowerPriority if unset. This field is beta-level, gated by the NonPreemptingPriority feature-gate.
     * 
     */
    @OutputExport(name="preemptionPolicy", type=String.class, parameters={})
    private Output</* @Nullable */ String> preemptionPolicy;

    /**
     * @return PreemptionPolicy is the Policy for preempting pods with lower priority. One of Never, PreemptLowerPriority. Defaults to PreemptLowerPriority if unset. This field is beta-level, gated by the NonPreemptingPriority feature-gate.
     * 
     */
    public Output</* @Nullable */ String> getPreemptionPolicy() {
        return this.preemptionPolicy;
    }
    /**
     * The value of this priority class. This is the actual priority that pods receive when they have the name of this class in their pod spec.
     * 
     */
    @OutputExport(name="value", type=Integer.class, parameters={})
    private Output<Integer> value;

    /**
     * @return The value of this priority class. This is the actual priority that pods receive when they have the name of this class in their pod spec.
     * 
     */
    public Output<Integer> getValue() {
        return this.value;
    }

    public interface BuilderApplicator {
        public void apply(PriorityClassArgs.Builder a);
    }
    private static io.pulumi.kubernetes.scheduling.k8s.io_v1.PriorityClassArgs buildArgs(BuilderApplicator argsBuilder) {
        final var builder = io.pulumi.kubernetes.scheduling.k8s.io_v1.PriorityClassArgs.builder();
        argsBuilder.apply(builder);
        return builder.build();
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param argsBuilder A function that configures a passed builder.
     */
    public PriorityClass(String name, BuilderApplicator argsBuilder) {
        this(name, buildArgs(argsBuilder), null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public PriorityClass(String name) {
        this(name, PriorityClassArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public PriorityClass(String name, PriorityClassArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public PriorityClass(String name, PriorityClassArgs args, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("kubernetes:scheduling.k8s.io/v1:PriorityClass", name, makeArgs(args), makeResourceOptions(options, Input.empty()));
    }

    private PriorityClass(String name, Input<String> id, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("kubernetes:scheduling.k8s.io/v1:PriorityClass", name, null, makeResourceOptions(options, id));
    }

    private static PriorityClassArgs makeArgs(PriorityClassArgs args) {
        var builder = args == null ? PriorityClassArgs.builder() : PriorityClassArgs.builder(args);
        return builder
            .setApiVersion("scheduling.k8s.io/v1")
            .setKind("PriorityClass")
            .build();
    }

    private static io.pulumi.resources.CustomResourceOptions makeResourceOptions(@Nullable io.pulumi.resources.CustomResourceOptions options, @Nullable Input<String> id) {
        var defaultOptions = io.pulumi.resources.CustomResourceOptions.builder()
            .setVersion(Utilities.getVersion())
            .setAliases(List.of(
                Input.of(Alias.builder().setType("kubernetes:scheduling.k8s.io/v1alpha1:PriorityClass").build()),
                Input.of(Alias.builder().setType("kubernetes:scheduling.k8s.io/v1beta1:PriorityClass").build())
            ))
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
    public static PriorityClass get(String name, Input<String> id, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        return new PriorityClass(name, id, options);
    }
}
