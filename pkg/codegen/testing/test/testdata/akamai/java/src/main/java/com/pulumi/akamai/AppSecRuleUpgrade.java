// *** WARNING: this file was generated by test. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.akamai;

import com.pulumi.akamai.AppSecRuleUpgradeArgs;
import com.pulumi.akamai.Utilities;
import com.pulumi.akamai.inputs.AppSecRuleUpgradeState;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import java.lang.Integer;
import java.lang.String;
import java.util.Optional;
import javax.annotation.Nullable;

@ResourceType(type="akamai:index/appSecRuleUpgrade:AppSecRuleUpgrade")
public class AppSecRuleUpgrade extends com.pulumi.resources.CustomResource {
    /**
     * Unique identifier of the security configuration
     * 
     */
    @Export(name="configId", refs={Integer.class}, tree="[0]")
    private Output<Integer> configId;

    /**
     * @return Unique identifier of the security configuration
     * 
     */
    public Output<Integer> configId() {
        return this.configId;
    }
    /**
     * Versioning information for the current KRS rule set
     * 
     */
    @Export(name="currentRuleset", refs={String.class}, tree="[0]")
    private Output<String> currentRuleset;

    /**
     * @return Versioning information for the current KRS rule set
     * 
     */
    public Output<String> currentRuleset() {
        return this.currentRuleset;
    }
    /**
     * Whether an evaluation is currently in progress
     * 
     */
    @Export(name="evalStatus", refs={String.class}, tree="[0]")
    private Output<String> evalStatus;

    /**
     * @return Whether an evaluation is currently in progress
     * 
     */
    public Output<String> evalStatus() {
        return this.evalStatus;
    }
    /**
     * Upgrade mode (KRS, AAG, ASE_MANUAL or ASE_AUTO)
     * 
     */
    @Export(name="mode", refs={String.class}, tree="[0]")
    private Output<String> mode;

    /**
     * @return Upgrade mode (KRS, AAG, ASE_MANUAL or ASE_AUTO)
     * 
     */
    public Output<String> mode() {
        return this.mode;
    }
    /**
     * Unique identifier of the security policy
     * 
     */
    @Export(name="securityPolicyId", refs={String.class}, tree="[0]")
    private Output<String> securityPolicyId;

    /**
     * @return Unique identifier of the security policy
     * 
     */
    public Output<String> securityPolicyId() {
        return this.securityPolicyId;
    }
    /**
     * Modifies the upgrade type for organizations running the ASE beta (ASE_AUTO or ASE_MANUAL)
     * 
     */
    @Export(name="upgradeMode", refs={String.class}, tree="[0]")
    private Output</* @Nullable */ String> upgradeMode;

    /**
     * @return Modifies the upgrade type for organizations running the ASE beta (ASE_AUTO or ASE_MANUAL)
     * 
     */
    public Output<Optional<String>> upgradeMode() {
        return Codegen.optional(this.upgradeMode);
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public AppSecRuleUpgrade(java.lang.String name) {
        this(name, AppSecRuleUpgradeArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public AppSecRuleUpgrade(java.lang.String name, AppSecRuleUpgradeArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public AppSecRuleUpgrade(java.lang.String name, AppSecRuleUpgradeArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("akamai:index/appSecRuleUpgrade:AppSecRuleUpgrade", name, makeArgs(args, options), makeResourceOptions(options, Codegen.empty()), false);
    }

    private AppSecRuleUpgrade(java.lang.String name, Output<java.lang.String> id, @Nullable AppSecRuleUpgradeState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("akamai:index/appSecRuleUpgrade:AppSecRuleUpgrade", name, state, makeResourceOptions(options, id), false);
    }

    private static AppSecRuleUpgradeArgs makeArgs(AppSecRuleUpgradeArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        if (options != null && options.getUrn().isPresent()) {
            return null;
        }
        return args == null ? AppSecRuleUpgradeArgs.Empty : args;
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
    public static AppSecRuleUpgrade get(java.lang.String name, Output<java.lang.String> id, @Nullable AppSecRuleUpgradeState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new AppSecRuleUpgrade(name, id, state, options);
    }
}
