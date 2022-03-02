// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.tags;

import io.pulumi.core.Input;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.OutputExport;
import io.pulumi.core.annotations.ResourceType;
import io.pulumi.gcp.Utilities;
import io.pulumi.gcp.tags.TagKeyIamBindingArgs;
import io.pulumi.gcp.tags.inputs.TagKeyIamBindingState;
import io.pulumi.gcp.tags.outputs.TagKeyIamBindingCondition;
import java.lang.String;
import java.util.List;
import javax.annotation.Nullable;

/**
 * Three different resources help you manage your IAM policy for Tags TagKey. Each of these resources serves a different use case:
 * 
 * * `gcp.tags.TagKeyIamPolicy`: Authoritative. Sets the IAM policy for the tagkey and replaces any existing policy already attached.
 * * `gcp.tags.TagKeyIamBinding`: Authoritative for a given role. Updates the IAM policy to grant a role to a list of members. Other roles within the IAM policy for the tagkey are preserved.
 * * `gcp.tags.TagKeyIamMember`: Non-authoritative. Updates the IAM policy to grant a role to a new member. Other members for the role for the tagkey are preserved.
 * 
 * > **Note:** `gcp.tags.TagKeyIamPolicy` **cannot** be used in conjunction with `gcp.tags.TagKeyIamBinding` and `gcp.tags.TagKeyIamMember` or they will fight over what your policy should be.
 * 
 * > **Note:** `gcp.tags.TagKeyIamBinding` resources **can be** used in conjunction with `gcp.tags.TagKeyIamMember` resources **only if** they do not grant privilege to the same role.
 * 
 * ## google\_tags\_tag\_key\_iam\_policy
 * 
 * ## google\_tags\_tag\_key\_iam\_binding
 * 
 * ## google\_tags\_tag\_key\_iam\_member
 * 
 * ## Import
 * 
 * For all import syntaxes, the "resource in question" can take any of the following forms* tagKeys/{{name}} * {{name}} Any variables not passed in the import command will be taken from the provider configuration. Tags tagkey IAM resources can be imported using the resource identifiers, role, and member. IAM member imports use space-delimited identifiersthe resource in question, the role, and the member identity, e.g.
 * 
 * ```sh
 *  $ pulumi import gcp:tags/tagKeyIamBinding:TagKeyIamBinding editor "tagKeys/{{tag_key}} roles/viewer user:jane@example.com"
 * ```
 * 
 *  IAM binding imports use space-delimited identifiersthe resource in question and the role, e.g.
 * 
 * ```sh
 *  $ pulumi import gcp:tags/tagKeyIamBinding:TagKeyIamBinding editor "tagKeys/{{tag_key}} roles/viewer"
 * ```
 * 
 *  IAM policy imports use the identifier of the resource in question, e.g.
 * 
 * ```sh
 *  $ pulumi import gcp:tags/tagKeyIamBinding:TagKeyIamBinding editor tagKeys/{{tag_key}}
 * ```
 * 
 *  -> **Custom Roles**If you're importing a IAM resource with a custom role, make sure to use the
 * 
 * full name of the custom role, e.g. `[projects/my-project|organizations/my-org]/roles/my-custom-role`.
 * 
 */
@ResourceType(type="gcp:tags/tagKeyIamBinding:TagKeyIamBinding")
public class TagKeyIamBinding extends io.pulumi.resources.CustomResource {
    @OutputExport(name="condition", type=TagKeyIamBindingCondition.class, parameters={})
    private Output</* @Nullable */ TagKeyIamBindingCondition> condition;

    public Output</* @Nullable */ TagKeyIamBindingCondition> getCondition() {
        return this.condition;
    }
    /**
     * (Computed) The etag of the IAM policy.
     * 
     */
    @OutputExport(name="etag", type=String.class, parameters={})
    private Output<String> etag;

    /**
     * @return (Computed) The etag of the IAM policy.
     * 
     */
    public Output<String> getEtag() {
        return this.etag;
    }
    @OutputExport(name="members", type=List.class, parameters={String.class})
    private Output<List<String>> members;

    public Output<List<String>> getMembers() {
        return this.members;
    }
    /**
     * The role that should be applied. Only one
     * `gcp.tags.TagKeyIamBinding` can be used per role. Note that custom roles must be of the format
     * `[projects|organizations]/{parent-name}/roles/{role-name}`.
     * 
     */
    @OutputExport(name="role", type=String.class, parameters={})
    private Output<String> role;

    /**
     * @return The role that should be applied. Only one
     * `gcp.tags.TagKeyIamBinding` can be used per role. Note that custom roles must be of the format
     * `[projects|organizations]/{parent-name}/roles/{role-name}`.
     * 
     */
    public Output<String> getRole() {
        return this.role;
    }
    /**
     * Used to find the parent resource to bind the IAM policy to
     * 
     */
    @OutputExport(name="tagKey", type=String.class, parameters={})
    private Output<String> tagKey;

    /**
     * @return Used to find the parent resource to bind the IAM policy to
     * 
     */
    public Output<String> getTagKey() {
        return this.tagKey;
    }

    public interface BuilderApplicator {
        public void apply(TagKeyIamBindingArgs.Builder a);
    }
    private static io.pulumi.gcp.tags.TagKeyIamBindingArgs buildArgs(BuilderApplicator argsBuilder) {
        final var builder = io.pulumi.gcp.tags.TagKeyIamBindingArgs.builder();
        argsBuilder.apply(builder);
        return builder.build();
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param argsBuilder A function that configures a passed builder.
     */
    public TagKeyIamBinding(String name, BuilderApplicator argsBuilder) {
        this(name, buildArgs(argsBuilder), null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public TagKeyIamBinding(String name) {
        this(name, TagKeyIamBindingArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public TagKeyIamBinding(String name, TagKeyIamBindingArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public TagKeyIamBinding(String name, TagKeyIamBindingArgs args, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("gcp:tags/tagKeyIamBinding:TagKeyIamBinding", name, args == null ? TagKeyIamBindingArgs.Empty : args, makeResourceOptions(options, Input.empty()));
    }

    private TagKeyIamBinding(String name, Input<String> id, @Nullable TagKeyIamBindingState state, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("gcp:tags/tagKeyIamBinding:TagKeyIamBinding", name, state, makeResourceOptions(options, id));
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
    public static TagKeyIamBinding get(String name, Input<String> id, @Nullable TagKeyIamBindingState state, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        return new TagKeyIamBinding(name, id, state, options);
    }
}
