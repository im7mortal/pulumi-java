// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.organizations;

import io.pulumi.core.Input;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.OutputExport;
import io.pulumi.core.annotations.ResourceType;
import io.pulumi.gcp.Utilities;
import io.pulumi.gcp.organizations.IAMBindingArgs;
import io.pulumi.gcp.organizations.inputs.IAMBindingState;
import io.pulumi.gcp.organizations.outputs.IAMBindingCondition;
import java.lang.String;
import java.util.List;
import javax.annotation.Nullable;

/**
 * Allows creation and management of a single binding within IAM policy for
 * an existing Google Cloud Platform Organization.
 * 
 * > **Note:** This resource __must not__ be used in conjunction with
 *    `gcp.organizations.IAMMember` for the __same role__ or they will fight over
 *    what your policy should be.
 * 
 * > **Note:** On create, this resource will overwrite members of any existing roles.
 *     Use `pulumi import` and inspect the `output to ensure
 *     your existing members are preserved.
 * 
 * ## Example Usage
 * 
 * ## Import
 * 
 * IAM binding imports use space-delimited identifiers; first the resource in question and then the role.
 * 
 * These bindings can be imported using the `org_id` and role, e.g.
 * 
 * ```sh
 *  $ pulumi import gcp:organizations/iAMBinding:IAMBinding my_org "your-org-id roles/viewer"
 * ```
 * 
 *  -> **Custom Roles**If you're importing a IAM resource with a custom role, make sure to use the
 * 
 * full name of the custom role, e.g. `[projects/my-project|organizations/my-org]/roles/my-custom-role`.
 * 
 */
@ResourceType(type="gcp:organizations/iAMBinding:IAMBinding")
public class IAMBinding extends io.pulumi.resources.CustomResource {
    @OutputExport(name="condition", type=IAMBindingCondition.class, parameters={})
    private Output</* @Nullable */ IAMBindingCondition> condition;

    public Output</* @Nullable */ IAMBindingCondition> getCondition() {
        return this.condition;
    }
    /**
     * (Computed) The etag of the organization's IAM policy.
     * 
     */
    @OutputExport(name="etag", type=String.class, parameters={})
    private Output<String> etag;

    /**
     * @return (Computed) The etag of the organization's IAM policy.
     * 
     */
    public Output<String> getEtag() {
        return this.etag;
    }
    /**
     * A list of users that the role should apply to. For more details on format and restrictions see https://cloud.google.com/billing/reference/rest/v1/Policy#Binding
     * 
     */
    @OutputExport(name="members", type=List.class, parameters={String.class})
    private Output<List<String>> members;

    /**
     * @return A list of users that the role should apply to. For more details on format and restrictions see https://cloud.google.com/billing/reference/rest/v1/Policy#Binding
     * 
     */
    public Output<List<String>> getMembers() {
        return this.members;
    }
    /**
     * The numeric ID of the organization in which you want to create a custom role.
     * 
     */
    @OutputExport(name="orgId", type=String.class, parameters={})
    private Output<String> orgId;

    /**
     * @return The numeric ID of the organization in which you want to create a custom role.
     * 
     */
    public Output<String> getOrgId() {
        return this.orgId;
    }
    /**
     * The role that should be applied. Only one
     * `gcp.organizations.IAMBinding` can be used per role. Note that custom roles must be of the format
     * `[projects|organizations]/{parent-name}/roles/{role-name}`.
     * 
     */
    @OutputExport(name="role", type=String.class, parameters={})
    private Output<String> role;

    /**
     * @return The role that should be applied. Only one
     * `gcp.organizations.IAMBinding` can be used per role. Note that custom roles must be of the format
     * `[projects|organizations]/{parent-name}/roles/{role-name}`.
     * 
     */
    public Output<String> getRole() {
        return this.role;
    }

    public interface BuilderApplicator {
        public void apply(IAMBindingArgs.Builder a);
    }
    private static io.pulumi.gcp.organizations.IAMBindingArgs buildArgs(BuilderApplicator argsBuilder) {
        final var builder = io.pulumi.gcp.organizations.IAMBindingArgs.builder();
        argsBuilder.apply(builder);
        return builder.build();
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param argsBuilder A function that configures a passed builder.
     */
    public IAMBinding(String name, BuilderApplicator argsBuilder) {
        this(name, buildArgs(argsBuilder), null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public IAMBinding(String name) {
        this(name, IAMBindingArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public IAMBinding(String name, IAMBindingArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public IAMBinding(String name, IAMBindingArgs args, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("gcp:organizations/iAMBinding:IAMBinding", name, args == null ? IAMBindingArgs.Empty : args, makeResourceOptions(options, Input.empty()));
    }

    private IAMBinding(String name, Input<String> id, @Nullable IAMBindingState state, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("gcp:organizations/iAMBinding:IAMBinding", name, state, makeResourceOptions(options, id));
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
    public static IAMBinding get(String name, Input<String> id, @Nullable IAMBindingState state, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        return new IAMBinding(name, id, state, options);
    }
}
