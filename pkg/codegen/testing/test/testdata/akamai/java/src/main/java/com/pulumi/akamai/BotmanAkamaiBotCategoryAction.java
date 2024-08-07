// *** WARNING: this file was generated by test. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.akamai;

import com.pulumi.akamai.BotmanAkamaiBotCategoryActionArgs;
import com.pulumi.akamai.Utilities;
import com.pulumi.akamai.inputs.BotmanAkamaiBotCategoryActionState;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import java.lang.Integer;
import java.lang.String;
import javax.annotation.Nullable;

@ResourceType(type="akamai:index/botmanAkamaiBotCategoryAction:BotmanAkamaiBotCategoryAction")
public class BotmanAkamaiBotCategoryAction extends com.pulumi.resources.CustomResource {
    @Export(name="akamaiBotCategoryAction", refs={String.class}, tree="[0]")
    private Output<String> akamaiBotCategoryAction;

    public Output<String> akamaiBotCategoryAction() {
        return this.akamaiBotCategoryAction;
    }
    @Export(name="categoryId", refs={String.class}, tree="[0]")
    private Output<String> categoryId;

    public Output<String> categoryId() {
        return this.categoryId;
    }
    @Export(name="configId", refs={Integer.class}, tree="[0]")
    private Output<Integer> configId;

    public Output<Integer> configId() {
        return this.configId;
    }
    @Export(name="securityPolicyId", refs={String.class}, tree="[0]")
    private Output<String> securityPolicyId;

    public Output<String> securityPolicyId() {
        return this.securityPolicyId;
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public BotmanAkamaiBotCategoryAction(java.lang.String name) {
        this(name, BotmanAkamaiBotCategoryActionArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public BotmanAkamaiBotCategoryAction(java.lang.String name, BotmanAkamaiBotCategoryActionArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public BotmanAkamaiBotCategoryAction(java.lang.String name, BotmanAkamaiBotCategoryActionArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("akamai:index/botmanAkamaiBotCategoryAction:BotmanAkamaiBotCategoryAction", name, makeArgs(args, options), makeResourceOptions(options, Codegen.empty()), false);
    }

    private BotmanAkamaiBotCategoryAction(java.lang.String name, Output<java.lang.String> id, @Nullable BotmanAkamaiBotCategoryActionState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("akamai:index/botmanAkamaiBotCategoryAction:BotmanAkamaiBotCategoryAction", name, state, makeResourceOptions(options, id), false);
    }

    private static BotmanAkamaiBotCategoryActionArgs makeArgs(BotmanAkamaiBotCategoryActionArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        if (options != null && options.getUrn().isPresent()) {
            return null;
        }
        return args == null ? BotmanAkamaiBotCategoryActionArgs.Empty : args;
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
    public static BotmanAkamaiBotCategoryAction get(java.lang.String name, Output<java.lang.String> id, @Nullable BotmanAkamaiBotCategoryActionState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new BotmanAkamaiBotCategoryAction(name, id, state, options);
    }
}
