// *** WARNING: this file was generated by test. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.akamai;

import com.pulumi.akamai.AppSecReputationProfileAnalysisArgs;
import com.pulumi.akamai.Utilities;
import com.pulumi.akamai.inputs.AppSecReputationProfileAnalysisState;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import javax.annotation.Nullable;

@ResourceType(type="akamai:index/appSecReputationProfileAnalysis:AppSecReputationProfileAnalysis")
public class AppSecReputationProfileAnalysis extends com.pulumi.resources.CustomResource {
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
     * Whether to add a value indicating that shared IPs are included in HTTP header and SIEM integration
     * 
     */
    @Export(name="forwardSharedIpToHttpHeaderSiem", refs={Boolean.class}, tree="[0]")
    private Output<Boolean> forwardSharedIpToHttpHeaderSiem;

    /**
     * @return Whether to add a value indicating that shared IPs are included in HTTP header and SIEM integration
     * 
     */
    public Output<Boolean> forwardSharedIpToHttpHeaderSiem() {
        return this.forwardSharedIpToHttpHeaderSiem;
    }
    /**
     * Whether to add client reputation details to requests forwarded to the origin server
     * 
     */
    @Export(name="forwardToHttpHeader", refs={Boolean.class}, tree="[0]")
    private Output<Boolean> forwardToHttpHeader;

    /**
     * @return Whether to add client reputation details to requests forwarded to the origin server
     * 
     */
    public Output<Boolean> forwardToHttpHeader() {
        return this.forwardToHttpHeader;
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
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public AppSecReputationProfileAnalysis(java.lang.String name) {
        this(name, AppSecReputationProfileAnalysisArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public AppSecReputationProfileAnalysis(java.lang.String name, AppSecReputationProfileAnalysisArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public AppSecReputationProfileAnalysis(java.lang.String name, AppSecReputationProfileAnalysisArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("akamai:index/appSecReputationProfileAnalysis:AppSecReputationProfileAnalysis", name, makeArgs(args, options), makeResourceOptions(options, Codegen.empty()), false);
    }

    private AppSecReputationProfileAnalysis(java.lang.String name, Output<java.lang.String> id, @Nullable AppSecReputationProfileAnalysisState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("akamai:index/appSecReputationProfileAnalysis:AppSecReputationProfileAnalysis", name, state, makeResourceOptions(options, id), false);
    }

    private static AppSecReputationProfileAnalysisArgs makeArgs(AppSecReputationProfileAnalysisArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        if (options != null && options.getUrn().isPresent()) {
            return null;
        }
        return args == null ? AppSecReputationProfileAnalysisArgs.Empty : args;
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
    public static AppSecReputationProfileAnalysis get(java.lang.String name, Output<java.lang.String> id, @Nullable AppSecReputationProfileAnalysisState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new AppSecReputationProfileAnalysis(name, id, state, options);
    }
}
