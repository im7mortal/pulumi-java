// *** WARNING: this file was generated by test. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.akamai;

import com.pulumi.akamai.AppSecAdvancedSettingsPragmaHeaderArgs;
import com.pulumi.akamai.Utilities;
import com.pulumi.akamai.inputs.AppSecAdvancedSettingsPragmaHeaderState;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import java.lang.Integer;
import java.lang.String;
import java.util.Optional;
import javax.annotation.Nullable;

@ResourceType(type="akamai:index/appSecAdvancedSettingsPragmaHeader:AppSecAdvancedSettingsPragmaHeader")
public class AppSecAdvancedSettingsPragmaHeader extends com.pulumi.resources.CustomResource {
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
     * JSON-formatted information describing the conditions to exclude from the default remove action
     * 
     */
    @Export(name="pragmaHeader", refs={String.class}, tree="[0]")
    private Output<String> pragmaHeader;

    /**
     * @return JSON-formatted information describing the conditions to exclude from the default remove action
     * 
     */
    public Output<String> pragmaHeader() {
        return this.pragmaHeader;
    }
    /**
     * Unique identifier of the security policy
     * 
     */
    @Export(name="securityPolicyId", refs={String.class}, tree="[0]")
    private Output</* @Nullable */ String> securityPolicyId;

    /**
     * @return Unique identifier of the security policy
     * 
     */
    public Output<Optional<String>> securityPolicyId() {
        return Codegen.optional(this.securityPolicyId);
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public AppSecAdvancedSettingsPragmaHeader(java.lang.String name) {
        this(name, AppSecAdvancedSettingsPragmaHeaderArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public AppSecAdvancedSettingsPragmaHeader(java.lang.String name, AppSecAdvancedSettingsPragmaHeaderArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public AppSecAdvancedSettingsPragmaHeader(java.lang.String name, AppSecAdvancedSettingsPragmaHeaderArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("akamai:index/appSecAdvancedSettingsPragmaHeader:AppSecAdvancedSettingsPragmaHeader", name, makeArgs(args, options), makeResourceOptions(options, Codegen.empty()), false);
    }

    private AppSecAdvancedSettingsPragmaHeader(java.lang.String name, Output<java.lang.String> id, @Nullable AppSecAdvancedSettingsPragmaHeaderState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("akamai:index/appSecAdvancedSettingsPragmaHeader:AppSecAdvancedSettingsPragmaHeader", name, state, makeResourceOptions(options, id), false);
    }

    private static AppSecAdvancedSettingsPragmaHeaderArgs makeArgs(AppSecAdvancedSettingsPragmaHeaderArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        if (options != null && options.getUrn().isPresent()) {
            return null;
        }
        return args == null ? AppSecAdvancedSettingsPragmaHeaderArgs.Empty : args;
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
    public static AppSecAdvancedSettingsPragmaHeader get(java.lang.String name, Output<java.lang.String> id, @Nullable AppSecAdvancedSettingsPragmaHeaderState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new AppSecAdvancedSettingsPragmaHeader(name, id, state, options);
    }
}
