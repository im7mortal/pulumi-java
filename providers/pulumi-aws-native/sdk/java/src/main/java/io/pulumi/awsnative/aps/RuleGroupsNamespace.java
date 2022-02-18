// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.aps;

import io.pulumi.awsnative.Utilities;
import io.pulumi.awsnative.aps.RuleGroupsNamespaceArgs;
import io.pulumi.awsnative.aps.outputs.RuleGroupsNamespaceTag;
import io.pulumi.core.Input;
import io.pulumi.core.Output;
import io.pulumi.core.internal.annotations.OutputExport;
import io.pulumi.core.internal.annotations.ResourceType;
import java.lang.String;
import java.util.List;
import javax.annotation.Nullable;

/**
 * RuleGroupsNamespace schema for cloudformation.
 * 
 */
@ResourceType(type="aws-native:aps:RuleGroupsNamespace")
public class RuleGroupsNamespace extends io.pulumi.resources.CustomResource {
    /**
     * The RuleGroupsNamespace ARN.
     * 
     */
    @OutputExport(name="arn", type=String.class, parameters={})
    private Output<String> arn;

    /**
     * @return The RuleGroupsNamespace ARN.
     * 
     */
    public Output<String> getArn() {
        return this.arn;
    }
    /**
     * The RuleGroupsNamespace data.
     * 
     */
    @OutputExport(name="data", type=String.class, parameters={})
    private Output<String> data;

    /**
     * @return The RuleGroupsNamespace data.
     * 
     */
    public Output<String> getData() {
        return this.data;
    }
    /**
     * The RuleGroupsNamespace name.
     * 
     */
    @OutputExport(name="name", type=String.class, parameters={})
    private Output<String> name;

    /**
     * @return The RuleGroupsNamespace name.
     * 
     */
    public Output<String> getName() {
        return this.name;
    }
    /**
     * An array of key-value pairs to apply to this resource.
     * 
     */
    @OutputExport(name="tags", type=List.class, parameters={RuleGroupsNamespaceTag.class})
    private Output</* @Nullable */ List<RuleGroupsNamespaceTag>> tags;

    /**
     * @return An array of key-value pairs to apply to this resource.
     * 
     */
    public Output</* @Nullable */ List<RuleGroupsNamespaceTag>> getTags() {
        return this.tags;
    }
    /**
     * Required to identify a specific APS Workspace associated with this RuleGroupsNamespace.
     * 
     */
    @OutputExport(name="workspace", type=String.class, parameters={})
    private Output<String> workspace;

    /**
     * @return Required to identify a specific APS Workspace associated with this RuleGroupsNamespace.
     * 
     */
    public Output<String> getWorkspace() {
        return this.workspace;
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public RuleGroupsNamespace(String name, RuleGroupsNamespaceArgs args, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("aws-native:aps:RuleGroupsNamespace", name, args == null ? RuleGroupsNamespaceArgs.Empty : args, makeResourceOptions(options, Input.empty()));
    }

    private RuleGroupsNamespace(String name, Input<String> id, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("aws-native:aps:RuleGroupsNamespace", name, null, makeResourceOptions(options, id));
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
    public static RuleGroupsNamespace get(String name, Input<String> id, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        return new RuleGroupsNamespace(name, id, options);
    }
}
