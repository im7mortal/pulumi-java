// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.networkfirewall;

import io.pulumi.aws.Utilities;
import io.pulumi.aws.networkfirewall.FirewallPolicyArgs;
import io.pulumi.aws.networkfirewall.inputs.FirewallPolicyState;
import io.pulumi.aws.networkfirewall.outputs.FirewallPolicyFirewallPolicy;
import io.pulumi.core.Input;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.OutputExport;
import io.pulumi.core.annotations.ResourceType;
import java.lang.String;
import java.util.Map;
import javax.annotation.Nullable;

/**
 * Provides an AWS Network Firewall Firewall Policy Resource
 * 
 * ## Example Usage
 * ## Policy with a Custom Action for Stateless Inspection
 * 
 * ## Import
 * 
 * Network Firewall Policies can be imported using their `ARN`.
 * 
 * ```sh
 *  $ pulumi import aws:networkfirewall/firewallPolicy:FirewallPolicy example arn:aws:network-firewall:us-west-1:123456789012:firewall-policy/example
 * ```
 * 
 */
@ResourceType(type="aws:networkfirewall/firewallPolicy:FirewallPolicy")
public class FirewallPolicy extends io.pulumi.resources.CustomResource {
    /**
     * The Amazon Resource Name (ARN) that identifies the firewall policy.
     * 
     */
    @OutputExport(name="arn", type=String.class, parameters={})
    private Output<String> arn;

    /**
     * @return The Amazon Resource Name (ARN) that identifies the firewall policy.
     * 
     */
    public Output<String> getArn() {
        return this.arn;
    }
    /**
     * A friendly description of the firewall policy.
     * 
     */
    @OutputExport(name="description", type=String.class, parameters={})
    private Output</* @Nullable */ String> description;

    /**
     * @return A friendly description of the firewall policy.
     * 
     */
    public Output</* @Nullable */ String> getDescription() {
        return this.description;
    }
    /**
     * A configuration block describing the rule groups and policy actions to use in the firewall policy. See Firewall Policy below for details.
     * 
     */
    @OutputExport(name="firewallPolicy", type=FirewallPolicyFirewallPolicy.class, parameters={})
    private Output<FirewallPolicyFirewallPolicy> firewallPolicy;

    /**
     * @return A configuration block describing the rule groups and policy actions to use in the firewall policy. See Firewall Policy below for details.
     * 
     */
    public Output<FirewallPolicyFirewallPolicy> getFirewallPolicy() {
        return this.firewallPolicy;
    }
    /**
     * A friendly name of the firewall policy.
     * 
     */
    @OutputExport(name="name", type=String.class, parameters={})
    private Output<String> name;

    /**
     * @return A friendly name of the firewall policy.
     * 
     */
    public Output<String> getName() {
        return this.name;
    }
    /**
     * Map of resource tags to associate with the resource. .If configured with a provider `default_tags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
     * 
     */
    @OutputExport(name="tags", type=Map.class, parameters={String.class, String.class})
    private Output</* @Nullable */ Map<String,String>> tags;

    /**
     * @return Map of resource tags to associate with the resource. .If configured with a provider `default_tags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
     * 
     */
    public Output</* @Nullable */ Map<String,String>> getTags() {
        return this.tags;
    }
    /**
     * A map of tags assigned to the resource, including those inherited from the provider .
     * 
     */
    @OutputExport(name="tagsAll", type=Map.class, parameters={String.class, String.class})
    private Output<Map<String,String>> tagsAll;

    /**
     * @return A map of tags assigned to the resource, including those inherited from the provider .
     * 
     */
    public Output<Map<String,String>> getTagsAll() {
        return this.tagsAll;
    }
    /**
     * A string token used when updating a firewall policy.
     * 
     */
    @OutputExport(name="updateToken", type=String.class, parameters={})
    private Output<String> updateToken;

    /**
     * @return A string token used when updating a firewall policy.
     * 
     */
    public Output<String> getUpdateToken() {
        return this.updateToken;
    }

    public interface BuilderApplicator {
        public void apply(FirewallPolicyArgs.Builder a);
    }
    private static io.pulumi.aws.networkfirewall.FirewallPolicyArgs buildArgs(BuilderApplicator argsBuilder) {
        final var builder = io.pulumi.aws.networkfirewall.FirewallPolicyArgs.builder();
        argsBuilder.apply(builder);
        return builder.build();
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param argsBuilder A function that configures a passed builder.
     */
    public FirewallPolicy(String name, BuilderApplicator argsBuilder) {
        this(name, buildArgs(argsBuilder), null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public FirewallPolicy(String name) {
        this(name, FirewallPolicyArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public FirewallPolicy(String name, FirewallPolicyArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public FirewallPolicy(String name, FirewallPolicyArgs args, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("aws:networkfirewall/firewallPolicy:FirewallPolicy", name, args == null ? FirewallPolicyArgs.Empty : args, makeResourceOptions(options, Input.empty()));
    }

    private FirewallPolicy(String name, Input<String> id, @Nullable FirewallPolicyState state, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("aws:networkfirewall/firewallPolicy:FirewallPolicy", name, state, makeResourceOptions(options, id));
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
     * @param state
     * @param options Optional settings to control the behavior of the CustomResource.
     */
    public static FirewallPolicy get(String name, Input<String> id, @Nullable FirewallPolicyState state, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        return new FirewallPolicy(name, id, state, options);
    }
}
