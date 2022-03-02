// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.organizations;

import io.pulumi.core.Input;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.OutputExport;
import io.pulumi.core.annotations.ResourceType;
import io.pulumi.gcp.Utilities;
import io.pulumi.gcp.organizations.IAMCustomRoleArgs;
import io.pulumi.gcp.organizations.inputs.IAMCustomRoleState;
import java.lang.Boolean;
import java.lang.String;
import java.util.List;
import javax.annotation.Nullable;

/**
 * Allows management of a customized Cloud IAM organization role. For more information see
 * [the official documentation](https://cloud.google.com/iam/docs/understanding-custom-roles)
 * and
 * [API](https://cloud.google.com/iam/reference/rest/v1/organizations.roles).
 * 
 * > **Warning:** Note that custom roles in GCP have the concept of a soft-delete. There are two issues that may arise
 *  from this and how roles are propagated. 1) creating a role may involve undeleting and then updating a role with the
 *  same name, possibly causing confusing behavior between undelete and update. 2) A deleted role is permanently deleted
 *  after 7 days, but it can take up to 30 more days (i.e. between 7 and 37 days after deletion) before the role name is
 *  made available again. This means a deleted role that has been deleted for more than 7 days cannot be changed at all
 *  by the provider, and new roles cannot share that name.
 * 
 * ## Example Usage
 * 
 * ## Import
 * 
 * Customized IAM organization role can be imported using their URI, e.g.
 * 
 * ```sh
 *  $ pulumi import gcp:organizations/iAMCustomRole:IAMCustomRole my-custom-role organizations/123456789/roles/myCustomRole
 * ```
 * 
 */
@ResourceType(type="gcp:organizations/iAMCustomRole:IAMCustomRole")
public class IAMCustomRole extends io.pulumi.resources.CustomResource {
    /**
     * (Optional) The current deleted state of the role.
     * 
     */
    @OutputExport(name="deleted", type=Boolean.class, parameters={})
    private Output<Boolean> deleted;

    /**
     * @return (Optional) The current deleted state of the role.
     * 
     */
    public Output<Boolean> getDeleted() {
        return this.deleted;
    }
    /**
     * A human-readable description for the role.
     * 
     */
    @OutputExport(name="description", type=String.class, parameters={})
    private Output</* @Nullable */ String> description;

    /**
     * @return A human-readable description for the role.
     * 
     */
    public Output</* @Nullable */ String> getDescription() {
        return this.description;
    }
    /**
     * The name of the role in the format `organizations/{{org_id}}/roles/{{role_id}}`. Like `id`, this field can be used as a reference in other resources such as IAM role bindings.
     * 
     */
    @OutputExport(name="name", type=String.class, parameters={})
    private Output<String> name;

    /**
     * @return The name of the role in the format `organizations/{{org_id}}/roles/{{role_id}}`. Like `id`, this field can be used as a reference in other resources such as IAM role bindings.
     * 
     */
    public Output<String> getName() {
        return this.name;
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
     * The names of the permissions this role grants when bound in an IAM policy. At least one permission must be specified.
     * 
     */
    @OutputExport(name="permissions", type=List.class, parameters={String.class})
    private Output<List<String>> permissions;

    /**
     * @return The names of the permissions this role grants when bound in an IAM policy. At least one permission must be specified.
     * 
     */
    public Output<List<String>> getPermissions() {
        return this.permissions;
    }
    /**
     * The role id to use for this role.
     * 
     */
    @OutputExport(name="roleId", type=String.class, parameters={})
    private Output<String> roleId;

    /**
     * @return The role id to use for this role.
     * 
     */
    public Output<String> getRoleId() {
        return this.roleId;
    }
    /**
     * The current launch stage of the role.
     * Defaults to `GA`.
     * List of possible stages is [here](https://cloud.google.com/iam/reference/rest/v1/organizations.roles#Role.RoleLaunchStage).
     * 
     */
    @OutputExport(name="stage", type=String.class, parameters={})
    private Output</* @Nullable */ String> stage;

    /**
     * @return The current launch stage of the role.
     * Defaults to `GA`.
     * List of possible stages is [here](https://cloud.google.com/iam/reference/rest/v1/organizations.roles#Role.RoleLaunchStage).
     * 
     */
    public Output</* @Nullable */ String> getStage() {
        return this.stage;
    }
    /**
     * A human-readable title for the role.
     * 
     */
    @OutputExport(name="title", type=String.class, parameters={})
    private Output<String> title;

    /**
     * @return A human-readable title for the role.
     * 
     */
    public Output<String> getTitle() {
        return this.title;
    }

    public interface BuilderApplicator {
        public void apply(IAMCustomRoleArgs.Builder a);
    }
    private static io.pulumi.gcp.organizations.IAMCustomRoleArgs buildArgs(BuilderApplicator argsBuilder) {
        final var builder = io.pulumi.gcp.organizations.IAMCustomRoleArgs.builder();
        argsBuilder.apply(builder);
        return builder.build();
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param argsBuilder A function that configures a passed builder.
     */
    public IAMCustomRole(String name, BuilderApplicator argsBuilder) {
        this(name, buildArgs(argsBuilder), null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public IAMCustomRole(String name) {
        this(name, IAMCustomRoleArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public IAMCustomRole(String name, IAMCustomRoleArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public IAMCustomRole(String name, IAMCustomRoleArgs args, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("gcp:organizations/iAMCustomRole:IAMCustomRole", name, args == null ? IAMCustomRoleArgs.Empty : args, makeResourceOptions(options, Input.empty()));
    }

    private IAMCustomRole(String name, Input<String> id, @Nullable IAMCustomRoleState state, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("gcp:organizations/iAMCustomRole:IAMCustomRole", name, state, makeResourceOptions(options, id));
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
    public static IAMCustomRole get(String name, Input<String> id, @Nullable IAMCustomRoleState state, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        return new IAMCustomRole(name, id, state, options);
    }
}
