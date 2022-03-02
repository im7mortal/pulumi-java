// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.compute;

import io.pulumi.core.Input;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.OutputExport;
import io.pulumi.core.annotations.ResourceType;
import io.pulumi.gcp.Utilities;
import io.pulumi.gcp.compute.SecurityPolicyArgs;
import io.pulumi.gcp.compute.inputs.SecurityPolicyState;
import io.pulumi.gcp.compute.outputs.SecurityPolicyAdaptiveProtectionConfig;
import io.pulumi.gcp.compute.outputs.SecurityPolicyRule;
import java.lang.String;
import java.util.List;
import javax.annotation.Nullable;

/**
 * A Security Policy defines an IP blacklist or whitelist that protects load balanced Google Cloud services by denying or permitting traffic from specified IP ranges. For more information
 * see the [official documentation](https://cloud.google.com/armor/docs/configure-security-policies)
 * and the [API](https://cloud.google.com/compute/docs/reference/rest/beta/securityPolicies).
 * 
 * ## Example Usage
 * 
 */
@ResourceType(type="gcp:compute/securityPolicy:SecurityPolicy")
public class SecurityPolicy extends io.pulumi.resources.CustomResource {
    /**
     * Configuration for [Google Cloud Armor Adaptive Protection](https://cloud.google.com/armor/docs/adaptive-protection-overview?hl=en). Structure is documented below.
     * 
     */
    @OutputExport(name="adaptiveProtectionConfig", type=SecurityPolicyAdaptiveProtectionConfig.class, parameters={})
    private Output</* @Nullable */ SecurityPolicyAdaptiveProtectionConfig> adaptiveProtectionConfig;

    /**
     * @return Configuration for [Google Cloud Armor Adaptive Protection](https://cloud.google.com/armor/docs/adaptive-protection-overview?hl=en). Structure is documented below.
     * 
     */
    public Output</* @Nullable */ SecurityPolicyAdaptiveProtectionConfig> getAdaptiveProtectionConfig() {
        return this.adaptiveProtectionConfig;
    }
    /**
     * An optional description of this rule. Max size is 64.
     * 
     */
    @OutputExport(name="description", type=String.class, parameters={})
    private Output</* @Nullable */ String> description;

    /**
     * @return An optional description of this rule. Max size is 64.
     * 
     */
    public Output</* @Nullable */ String> getDescription() {
        return this.description;
    }
    /**
     * Fingerprint of this resource.
     * 
     */
    @OutputExport(name="fingerprint", type=String.class, parameters={})
    private Output<String> fingerprint;

    /**
     * @return Fingerprint of this resource.
     * 
     */
    public Output<String> getFingerprint() {
        return this.fingerprint;
    }
    /**
     * The name of the security policy.
     * 
     */
    @OutputExport(name="name", type=String.class, parameters={})
    private Output<String> name;

    /**
     * @return The name of the security policy.
     * 
     */
    public Output<String> getName() {
        return this.name;
    }
    /**
     * The project in which the resource belongs. If it
     * is not provided, the provider project is used.
     * 
     */
    @OutputExport(name="project", type=String.class, parameters={})
    private Output<String> project;

    /**
     * @return The project in which the resource belongs. If it
     * is not provided, the provider project is used.
     * 
     */
    public Output<String> getProject() {
        return this.project;
    }
    /**
     * The set of rules that belong to this policy. There must always be a default
     * rule (rule with priority 2147483647 and match "\*"). If no rules are provided when creating a
     * security policy, a default rule with action "allow" will be added. Structure is documented below.
     * 
     */
    @OutputExport(name="rules", type=List.class, parameters={SecurityPolicyRule.class})
    private Output<List<SecurityPolicyRule>> rules;

    /**
     * @return The set of rules that belong to this policy. There must always be a default
     * rule (rule with priority 2147483647 and match "\*"). If no rules are provided when creating a
     * security policy, a default rule with action "allow" will be added. Structure is documented below.
     * 
     */
    public Output<List<SecurityPolicyRule>> getRules() {
        return this.rules;
    }
    /**
     * The URI of the created resourc
     * 
     */
    @OutputExport(name="selfLink", type=String.class, parameters={})
    private Output<String> selfLink;

    /**
     * @return The URI of the created resourc
     * 
     */
    public Output<String> getSelfLink() {
        return this.selfLink;
    }

    public interface BuilderApplicator {
        public void apply(@Nullable SecurityPolicyArgs.Builder a);
    }
    private static io.pulumi.gcp.compute.SecurityPolicyArgs buildArgs(BuilderApplicator argsBuilder) {
        final var builder = io.pulumi.gcp.compute.SecurityPolicyArgs.builder();
        argsBuilder.apply(builder);
        return builder.build();
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param argsBuilder A function that configures a passed builder.
     */
    public SecurityPolicy(String name, BuilderApplicator argsBuilder) {
        this(name, buildArgs(argsBuilder), null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public SecurityPolicy(String name) {
        this(name, SecurityPolicyArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public SecurityPolicy(String name, @Nullable SecurityPolicyArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public SecurityPolicy(String name, @Nullable SecurityPolicyArgs args, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("gcp:compute/securityPolicy:SecurityPolicy", name, args == null ? SecurityPolicyArgs.Empty : args, makeResourceOptions(options, Input.empty()));
    }

    private SecurityPolicy(String name, Input<String> id, @Nullable SecurityPolicyState state, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("gcp:compute/securityPolicy:SecurityPolicy", name, state, makeResourceOptions(options, id));
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
    public static SecurityPolicy get(String name, Input<String> id, @Nullable SecurityPolicyState state, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        return new SecurityPolicy(name, id, state, options);
    }
}
