// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.cdn;

import io.pulumi.azurenative.Utilities;
import io.pulumi.azurenative.cdn.PolicyArgs;
import io.pulumi.azurenative.cdn.outputs.CdnEndpointResponse;
import io.pulumi.azurenative.cdn.outputs.CustomRuleListResponse;
import io.pulumi.azurenative.cdn.outputs.ManagedRuleSetListResponse;
import io.pulumi.azurenative.cdn.outputs.PolicySettingsResponse;
import io.pulumi.azurenative.cdn.outputs.RateLimitRuleListResponse;
import io.pulumi.azurenative.cdn.outputs.SkuResponse;
import io.pulumi.azurenative.cdn.outputs.SystemDataResponse;
import io.pulumi.core.Alias;
import io.pulumi.core.Input;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.OutputExport;
import io.pulumi.core.annotations.ResourceType;
import java.lang.String;
import java.util.List;
import java.util.Map;
import javax.annotation.Nullable;

/**
 * Defines web application firewall policy for Azure CDN.
 * API Version: 2020-09-01.
 * 
 * ## Example Usage
 * 
 * ## Import
 * 
 * An existing resource can be imported using its type token, name, and identifier, e.g.
 * 
 * ```sh
 * $ pulumi import azure-native:cdn:Policy MicrosoftCdnWafPolicy /subscriptions/subid/resourceGroups/rg1/providers/Microsoft.Cdn/CdnWebApplicationFirewallPolicies/MicrosoftCdnWafPolicy 
 * ```
 * 
 */
@ResourceType(type="azure-native:cdn:Policy")
public class Policy extends io.pulumi.resources.CustomResource {
    /**
     * Describes custom rules inside the policy.
     * 
     */
    @OutputExport(name="customRules", type=CustomRuleListResponse.class, parameters={})
    private Output</* @Nullable */ CustomRuleListResponse> customRules;

    /**
     * @return Describes custom rules inside the policy.
     * 
     */
    public Output</* @Nullable */ CustomRuleListResponse> getCustomRules() {
        return this.customRules;
    }
    /**
     * Describes Azure CDN endpoints associated with this Web Application Firewall policy.
     * 
     */
    @OutputExport(name="endpointLinks", type=List.class, parameters={CdnEndpointResponse.class})
    private Output<List<CdnEndpointResponse>> endpointLinks;

    /**
     * @return Describes Azure CDN endpoints associated with this Web Application Firewall policy.
     * 
     */
    public Output<List<CdnEndpointResponse>> getEndpointLinks() {
        return this.endpointLinks;
    }
    /**
     * Gets a unique read-only string that changes whenever the resource is updated.
     * 
     */
    @OutputExport(name="etag", type=String.class, parameters={})
    private Output</* @Nullable */ String> etag;

    /**
     * @return Gets a unique read-only string that changes whenever the resource is updated.
     * 
     */
    public Output</* @Nullable */ String> getEtag() {
        return this.etag;
    }
    /**
     * Resource location.
     * 
     */
    @OutputExport(name="location", type=String.class, parameters={})
    private Output<String> location;

    /**
     * @return Resource location.
     * 
     */
    public Output<String> getLocation() {
        return this.location;
    }
    /**
     * Describes managed rules inside the policy.
     * 
     */
    @OutputExport(name="managedRules", type=ManagedRuleSetListResponse.class, parameters={})
    private Output</* @Nullable */ ManagedRuleSetListResponse> managedRules;

    /**
     * @return Describes managed rules inside the policy.
     * 
     */
    public Output</* @Nullable */ ManagedRuleSetListResponse> getManagedRules() {
        return this.managedRules;
    }
    /**
     * Resource name.
     * 
     */
    @OutputExport(name="name", type=String.class, parameters={})
    private Output<String> name;

    /**
     * @return Resource name.
     * 
     */
    public Output<String> getName() {
        return this.name;
    }
    /**
     * Describes  policySettings for policy
     * 
     */
    @OutputExport(name="policySettings", type=PolicySettingsResponse.class, parameters={})
    private Output</* @Nullable */ PolicySettingsResponse> policySettings;

    /**
     * @return Describes  policySettings for policy
     * 
     */
    public Output</* @Nullable */ PolicySettingsResponse> getPolicySettings() {
        return this.policySettings;
    }
    /**
     * Provisioning state of the WebApplicationFirewallPolicy.
     * 
     */
    @OutputExport(name="provisioningState", type=String.class, parameters={})
    private Output<String> provisioningState;

    /**
     * @return Provisioning state of the WebApplicationFirewallPolicy.
     * 
     */
    public Output<String> getProvisioningState() {
        return this.provisioningState;
    }
    /**
     * Describes rate limit rules inside the policy.
     * 
     */
    @OutputExport(name="rateLimitRules", type=RateLimitRuleListResponse.class, parameters={})
    private Output</* @Nullable */ RateLimitRuleListResponse> rateLimitRules;

    /**
     * @return Describes rate limit rules inside the policy.
     * 
     */
    public Output</* @Nullable */ RateLimitRuleListResponse> getRateLimitRules() {
        return this.rateLimitRules;
    }
    @OutputExport(name="resourceState", type=String.class, parameters={})
    private Output<String> resourceState;

    public Output<String> getResourceState() {
        return this.resourceState;
    }
    /**
     * The pricing tier (defines a CDN provider, feature list and rate) of the CdnWebApplicationFirewallPolicy.
     * 
     */
    @OutputExport(name="sku", type=SkuResponse.class, parameters={})
    private Output<SkuResponse> sku;

    /**
     * @return The pricing tier (defines a CDN provider, feature list and rate) of the CdnWebApplicationFirewallPolicy.
     * 
     */
    public Output<SkuResponse> getSku() {
        return this.sku;
    }
    /**
     * Read only system data
     * 
     */
    @OutputExport(name="systemData", type=SystemDataResponse.class, parameters={})
    private Output<SystemDataResponse> systemData;

    /**
     * @return Read only system data
     * 
     */
    public Output<SystemDataResponse> getSystemData() {
        return this.systemData;
    }
    /**
     * Resource tags.
     * 
     */
    @OutputExport(name="tags", type=Map.class, parameters={String.class, String.class})
    private Output</* @Nullable */ Map<String,String>> tags;

    /**
     * @return Resource tags.
     * 
     */
    public Output</* @Nullable */ Map<String,String>> getTags() {
        return this.tags;
    }
    /**
     * Resource type.
     * 
     */
    @OutputExport(name="type", type=String.class, parameters={})
    private Output<String> type;

    /**
     * @return Resource type.
     * 
     */
    public Output<String> getType() {
        return this.type;
    }

    public interface BuilderApplicator {
        public void apply(PolicyArgs.Builder a);
    }
    private static io.pulumi.azurenative.cdn.PolicyArgs buildArgs(BuilderApplicator argsBuilder) {
        final var builder = io.pulumi.azurenative.cdn.PolicyArgs.builder();
        argsBuilder.apply(builder);
        return builder.build();
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param argsBuilder A function that configures a passed builder.
     */
    public Policy(String name, BuilderApplicator argsBuilder) {
        this(name, buildArgs(argsBuilder), null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public Policy(String name) {
        this(name, PolicyArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public Policy(String name, PolicyArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public Policy(String name, PolicyArgs args, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("azure-native:cdn:Policy", name, args == null ? PolicyArgs.Empty : args, makeResourceOptions(options, Input.empty()));
    }

    private Policy(String name, Input<String> id, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("azure-native:cdn:Policy", name, null, makeResourceOptions(options, id));
    }

    private static io.pulumi.resources.CustomResourceOptions makeResourceOptions(@Nullable io.pulumi.resources.CustomResourceOptions options, @Nullable Input<String> id) {
        var defaultOptions = io.pulumi.resources.CustomResourceOptions.builder()
            .setVersion(Utilities.getVersion())
            .setAliases(List.of(
                Input.of(Alias.builder().setType("azure-native:cdn/v20190615:Policy").build()),
                Input.of(Alias.builder().setType("azure-native:cdn/v20190615preview:Policy").build()),
                Input.of(Alias.builder().setType("azure-native:cdn/v20200331:Policy").build()),
                Input.of(Alias.builder().setType("azure-native:cdn/v20200415:Policy").build()),
                Input.of(Alias.builder().setType("azure-native:cdn/v20200901:Policy").build()),
                Input.of(Alias.builder().setType("azure-native:cdn/v20210601:Policy").build())
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
    public static Policy get(String name, Input<String> id, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        return new Policy(name, id, options);
    }
}
