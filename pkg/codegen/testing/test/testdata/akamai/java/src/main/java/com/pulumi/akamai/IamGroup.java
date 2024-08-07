// *** WARNING: this file was generated by test. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.akamai;

import com.pulumi.akamai.IamGroupArgs;
import com.pulumi.akamai.Utilities;
import com.pulumi.akamai.inputs.IamGroupState;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import javax.annotation.Nullable;

@ResourceType(type="akamai:index/iamGroup:IamGroup")
public class IamGroup extends com.pulumi.resources.CustomResource {
    /**
     * Human readable name for a group
     * 
     */
    @Export(name="name", refs={String.class}, tree="[0]")
    private Output<String> name;

    /**
     * @return Human readable name for a group
     * 
     */
    public Output<String> name() {
        return this.name;
    }
    /**
     * Unique identifier for the parent group
     * 
     */
    @Export(name="parentGroupId", refs={Integer.class}, tree="[0]")
    private Output<Integer> parentGroupId;

    /**
     * @return Unique identifier for the parent group
     * 
     */
    public Output<Integer> parentGroupId() {
        return this.parentGroupId;
    }
    /**
     * Subgroups IDs
     * 
     */
    @Export(name="subGroups", refs={List.class,Integer.class}, tree="[0,1]")
    private Output<List<Integer>> subGroups;

    /**
     * @return Subgroups IDs
     * 
     */
    public Output<List<Integer>> subGroups() {
        return this.subGroups;
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public IamGroup(java.lang.String name) {
        this(name, IamGroupArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public IamGroup(java.lang.String name, IamGroupArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public IamGroup(java.lang.String name, IamGroupArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("akamai:index/iamGroup:IamGroup", name, makeArgs(args, options), makeResourceOptions(options, Codegen.empty()), false);
    }

    private IamGroup(java.lang.String name, Output<java.lang.String> id, @Nullable IamGroupState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("akamai:index/iamGroup:IamGroup", name, state, makeResourceOptions(options, id), false);
    }

    private static IamGroupArgs makeArgs(IamGroupArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        if (options != null && options.getUrn().isPresent()) {
            return null;
        }
        return args == null ? IamGroupArgs.Empty : args;
    }

    private static com.pulumi.resources.CustomResourceOptions makeResourceOptions(@Nullable com.pulumi.resources.CustomResourceOptions options, @Nullable Output<java.lang.String> id) {
        var defaultOptions = com.pulumi.resources.CustomResourceOptions.builder()
            .version(Utilities.getVersion())
            .build();
        return com.pulumi.resources.CustomResourceOptions.merge(defaultOptions, options, id);
    }

    /**
     * Get an existing Host resource's state with the given name, ID, and optional extra
     * properties used to qualify the lookup.
     *
     * @param name The _unique_ name of the resulting resource.
     * @param id The _unique_ provider ID of the resource to lookup.
     * @param state
     * @param options Optional settings to control the behavior of the CustomResource.
     */
    public static IamGroup get(java.lang.String name, Output<java.lang.String> id, @Nullable IamGroupState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new IamGroup(name, id, state, options);
    }
}
