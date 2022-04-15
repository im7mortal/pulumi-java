// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.kubernetes.rbac.authorization.k8s.io_v1;

import io.pulumi.core.Alias;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.Export;
import io.pulumi.core.annotations.ResourceType;
import io.pulumi.core.internal.Codegen;
import io.pulumi.kubernetes.Utilities;
import io.pulumi.kubernetes.meta_v1.outputs.ObjectMeta;
import io.pulumi.kubernetes.rbac.authorization.k8s.io_v1.ClusterRoleArgs;
import io.pulumi.kubernetes.rbac.authorization.k8s.io_v1.outputs.AggregationRule;
import io.pulumi.kubernetes.rbac.authorization.k8s.io_v1.outputs.PolicyRule;
import java.lang.String;
import java.util.List;
import javax.annotation.Nullable;

/**
 * ClusterRole is a cluster level, logical grouping of PolicyRules that can be referenced as a unit by a RoleBinding or ClusterRoleBinding.
 * 
 */
@ResourceType(type="kubernetes:rbac.authorization.k8s.io/v1:ClusterRole")
public class ClusterRole extends io.pulumi.resources.CustomResource {
    /**
     * AggregationRule is an optional field that describes how to build the Rules for this ClusterRole. If AggregationRule is set, then the Rules are controller managed and direct changes to Rules will be stomped by the controller.
     * 
     */
    @Export(name="aggregationRule", type=AggregationRule.class, parameters={})
    private Output</* @Nullable */ AggregationRule> aggregationRule;

    /**
     * @return AggregationRule is an optional field that describes how to build the Rules for this ClusterRole. If AggregationRule is set, then the Rules are controller managed and direct changes to Rules will be stomped by the controller.
     * 
     */
    public Output</* @Nullable */ AggregationRule> aggregationRule() {
        return this.aggregationRule;
    }
    /**
     * APIVersion defines the versioned schema of this representation of an object. Servers should convert recognized schemas to the latest internal value, and may reject unrecognized values. More info: https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#resources
     * 
     */
    @Export(name="apiVersion", type=String.class, parameters={})
    private Output</* @Nullable */ String> apiVersion;

    /**
     * @return APIVersion defines the versioned schema of this representation of an object. Servers should convert recognized schemas to the latest internal value, and may reject unrecognized values. More info: https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#resources
     * 
     */
    public Output</* @Nullable */ String> apiVersion() {
        return this.apiVersion;
    }
    /**
     * Kind is a string value representing the REST resource this object represents. Servers may infer this from the endpoint the client submits requests to. Cannot be updated. In CamelCase. More info: https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#types-kinds
     * 
     */
    @Export(name="kind", type=String.class, parameters={})
    private Output</* @Nullable */ String> kind;

    /**
     * @return Kind is a string value representing the REST resource this object represents. Servers may infer this from the endpoint the client submits requests to. Cannot be updated. In CamelCase. More info: https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#types-kinds
     * 
     */
    public Output</* @Nullable */ String> kind() {
        return this.kind;
    }
    /**
     * Standard object's metadata.
     * 
     */
    @Export(name="metadata", type=ObjectMeta.class, parameters={})
    private Output</* @Nullable */ ObjectMeta> metadata;

    /**
     * @return Standard object's metadata.
     * 
     */
    public Output</* @Nullable */ ObjectMeta> metadata() {
        return this.metadata;
    }
    /**
     * Rules holds all the PolicyRules for this ClusterRole
     * 
     */
    @Export(name="rules", type=List.class, parameters={PolicyRule.class})
    private Output</* @Nullable */ List<PolicyRule>> rules;

    /**
     * @return Rules holds all the PolicyRules for this ClusterRole
     * 
     */
    public Output</* @Nullable */ List<PolicyRule>> rules() {
        return this.rules;
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public ClusterRole(String name) {
        this(name, ClusterRoleArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public ClusterRole(String name, @Nullable ClusterRoleArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public ClusterRole(String name, @Nullable ClusterRoleArgs args, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("kubernetes:rbac.authorization.k8s.io/v1:ClusterRole", name, makeArgs(args), makeResourceOptions(options, Codegen.empty()));
    }

    private ClusterRole(String name, Output<String> id, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("kubernetes:rbac.authorization.k8s.io/v1:ClusterRole", name, null, makeResourceOptions(options, id));
    }

    private static ClusterRoleArgs makeArgs(@Nullable ClusterRoleArgs args) {
        var builder = args == null ? ClusterRoleArgs.builder() : ClusterRoleArgs.builder(args);
        return builder
            .apiVersion("rbac.authorization.k8s.io/v1")
            .kind("ClusterRole")
            .build();
    }

    private static io.pulumi.resources.CustomResourceOptions makeResourceOptions(@Nullable io.pulumi.resources.CustomResourceOptions options, @Nullable Output<String> id) {
        var defaultOptions = io.pulumi.resources.CustomResourceOptions.builder()
            .version(Utilities.getVersion())
            .aliases(List.of(
                Output.of(Alias.builder().type("kubernetes:rbac.authorization.k8s.io/v1alpha1:ClusterRole").build()),
                Output.of(Alias.builder().type("kubernetes:rbac.authorization.k8s.io/v1beta1:ClusterRole").build())
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
    public static ClusterRole get(String name, Output<String> id, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        return new ClusterRole(name, id, options);
    }
}
