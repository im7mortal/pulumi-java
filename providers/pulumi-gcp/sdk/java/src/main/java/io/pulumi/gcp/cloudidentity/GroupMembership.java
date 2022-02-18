// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.cloudidentity;

import io.pulumi.core.Input;
import io.pulumi.core.Output;
import io.pulumi.core.internal.annotations.OutputExport;
import io.pulumi.core.internal.annotations.ResourceType;
import io.pulumi.gcp.Utilities;
import io.pulumi.gcp.cloudidentity.GroupMembershipArgs;
import io.pulumi.gcp.cloudidentity.inputs.GroupMembershipState;
import io.pulumi.gcp.cloudidentity.outputs.GroupMembershipMemberKey;
import io.pulumi.gcp.cloudidentity.outputs.GroupMembershipPreferredMemberKey;
import io.pulumi.gcp.cloudidentity.outputs.GroupMembershipRole;
import java.lang.String;
import java.util.List;
import javax.annotation.Nullable;

/**
 * A Membership defines a relationship between a Group and an entity belonging to that Group, referred to as a "member".
 * 
 * To get more information about GroupMembership, see:
 * 
 * * [API documentation](https://cloud.google.com/identity/docs/reference/rest/v1/groups.memberships)
 * * How-to Guides
 *     * [Official Documentation](https://cloud.google.com/identity/docs/how-to/memberships-google-groups)
 * 
 * > **Warning:** If you are using User ADCs (Application Default Credentials) with this resource,
 * you must specify a `billing_project` and set `user_project_override` to true
 * in the provider configuration. Otherwise the Cloud Identity API will return a 403 error.
 * Your account must have the `serviceusage.services.use` permission on the
 * `billing_project` you defined.
 * 
 * ## Example Usage
 * 
 * ## Import
 * 
 * GroupMembership can be imported using any of these accepted formats
 * 
 * ```sh
 *  $ pulumi import gcp:cloudidentity/groupMembership:GroupMembership default {{name}}
 * ```
 * 
 */
@ResourceType(type="gcp:cloudidentity/groupMembership:GroupMembership")
public class GroupMembership extends io.pulumi.resources.CustomResource {
    /**
     * The time when the Membership was created.
     * 
     */
    @OutputExport(name="createTime", type=String.class, parameters={})
    private Output<String> createTime;

    /**
     * @return The time when the Membership was created.
     * 
     */
    public Output<String> getCreateTime() {
        return this.createTime;
    }
    /**
     * The name of the Group to create this membership in.
     * 
     */
    @OutputExport(name="group", type=String.class, parameters={})
    private Output<String> group;

    /**
     * @return The name of the Group to create this membership in.
     * 
     */
    public Output<String> getGroup() {
        return this.group;
    }
    /**
     * EntityKey of the member.
     * Structure is documented below.
     * 
     */
    @OutputExport(name="memberKey", type=GroupMembershipMemberKey.class, parameters={})
    private Output<GroupMembershipMemberKey> memberKey;

    /**
     * @return EntityKey of the member.
     * Structure is documented below.
     * 
     */
    public Output<GroupMembershipMemberKey> getMemberKey() {
        return this.memberKey;
    }
    /**
     * The name of the MembershipRole. Must be one of OWNER, MANAGER, MEMBER.
     * Possible values are `OWNER`, `MANAGER`, and `MEMBER`.
     * 
     */
    @OutputExport(name="name", type=String.class, parameters={})
    private Output<String> name;

    /**
     * @return The name of the MembershipRole. Must be one of OWNER, MANAGER, MEMBER.
     * Possible values are `OWNER`, `MANAGER`, and `MEMBER`.
     * 
     */
    public Output<String> getName() {
        return this.name;
    }
    /**
     * EntityKey of the member.
     * Structure is documented below.
     * 
     */
    @OutputExport(name="preferredMemberKey", type=GroupMembershipPreferredMemberKey.class, parameters={})
    private Output<GroupMembershipPreferredMemberKey> preferredMemberKey;

    /**
     * @return EntityKey of the member.
     * Structure is documented below.
     * 
     */
    public Output<GroupMembershipPreferredMemberKey> getPreferredMemberKey() {
        return this.preferredMemberKey;
    }
    /**
     * The MembershipRoles that apply to the Membership.
     * Must not contain duplicate MembershipRoles with the same name.
     * Structure is documented below.
     * 
     */
    @OutputExport(name="roles", type=List.class, parameters={GroupMembershipRole.class})
    private Output<List<GroupMembershipRole>> roles;

    /**
     * @return The MembershipRoles that apply to the Membership.
     * Must not contain duplicate MembershipRoles with the same name.
     * Structure is documented below.
     * 
     */
    public Output<List<GroupMembershipRole>> getRoles() {
        return this.roles;
    }
    /**
     * The type of the membership.
     * 
     */
    @OutputExport(name="type", type=String.class, parameters={})
    private Output<String> type;

    /**
     * @return The type of the membership.
     * 
     */
    public Output<String> getType() {
        return this.type;
    }
    /**
     * The time when the Membership was last updated.
     * 
     */
    @OutputExport(name="updateTime", type=String.class, parameters={})
    private Output<String> updateTime;

    /**
     * @return The time when the Membership was last updated.
     * 
     */
    public Output<String> getUpdateTime() {
        return this.updateTime;
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public GroupMembership(String name, GroupMembershipArgs args, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("gcp:cloudidentity/groupMembership:GroupMembership", name, args == null ? GroupMembershipArgs.Empty : args, makeResourceOptions(options, Input.empty()));
    }

    private GroupMembership(String name, Input<String> id, @Nullable GroupMembershipState state, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("gcp:cloudidentity/groupMembership:GroupMembership", name, state, makeResourceOptions(options, id));
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
    public static GroupMembership get(String name, Input<String> id, @Nullable GroupMembershipState state, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        return new GroupMembership(name, id, state, options);
    }
}