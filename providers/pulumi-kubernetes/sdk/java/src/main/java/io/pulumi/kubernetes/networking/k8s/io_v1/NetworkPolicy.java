// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.kubernetes.networking.k8s.io_v1;

import io.pulumi.core.Alias;
import io.pulumi.core.Input;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.OutputExport;
import io.pulumi.core.annotations.ResourceType;
import io.pulumi.kubernetes.Utilities;
import io.pulumi.kubernetes.meta_v1.outputs.ObjectMeta;
import io.pulumi.kubernetes.networking.k8s.io_v1.NetworkPolicyArgs;
import io.pulumi.kubernetes.networking.k8s.io_v1.outputs.NetworkPolicySpec;
import java.lang.String;
import java.util.List;
import javax.annotation.Nullable;

/**
 * NetworkPolicy describes what network traffic is allowed for a set of Pods
 * 
 */
@ResourceType(type="kubernetes:networking.k8s.io/v1:NetworkPolicy")
public class NetworkPolicy extends io.pulumi.resources.CustomResource {
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
     * Specification of the desired behavior for this NetworkPolicy.
     * 
     */
    @OutputExport(name="spec", type=NetworkPolicySpec.class, parameters={})
    private Output</* @Nullable */ NetworkPolicySpec> spec;

    /**
     * @return Specification of the desired behavior for this NetworkPolicy.
     * 
     */
    public Output</* @Nullable */ NetworkPolicySpec> getSpec() {
        return this.spec;
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public NetworkPolicy(String name, @Nullable NetworkPolicyArgs args, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("kubernetes:networking.k8s.io/v1:NetworkPolicy", name, makeArgs(args), makeResourceOptions(options, Input.empty()));
    }

    private NetworkPolicy(String name, Input<String> id, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("kubernetes:networking.k8s.io/v1:NetworkPolicy", name, null, makeResourceOptions(options, id));
    }

    private static NetworkPolicyArgs makeArgs(@Nullable NetworkPolicyArgs args) {
        var builder = args == null ? NetworkPolicyArgs.builder() : NetworkPolicyArgs.builder(args);
        return builder
            .setApiVersion("networking.k8s.io/v1")
            .setKind("NetworkPolicy")
            .build();
    }

    private static io.pulumi.resources.CustomResourceOptions makeResourceOptions(@Nullable io.pulumi.resources.CustomResourceOptions options, @Nullable Input<String> id) {
        var defaultOptions = io.pulumi.resources.CustomResourceOptions.builder()
            .setVersion(Utilities.getVersion())
            .setAliases(List.of(
                Input.of(Alias.builder().setType("kubernetes:extensions/v1beta1:NetworkPolicy").build())
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
    public static NetworkPolicy get(String name, Input<String> id, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        return new NetworkPolicy(name, id, options);
    }
}
