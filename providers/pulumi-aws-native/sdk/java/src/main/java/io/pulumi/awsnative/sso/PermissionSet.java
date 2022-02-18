// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.sso;

import io.pulumi.awsnative.Utilities;
import io.pulumi.awsnative.sso.PermissionSetArgs;
import io.pulumi.awsnative.sso.outputs.PermissionSetTag;
import io.pulumi.core.Input;
import io.pulumi.core.Output;
import io.pulumi.core.internal.annotations.OutputExport;
import io.pulumi.core.internal.annotations.ResourceType;
import java.lang.Object;
import java.lang.String;
import java.util.List;
import javax.annotation.Nullable;

/**
 * Resource Type definition for SSO PermissionSet
 * 
 */
@ResourceType(type="aws-native:sso:PermissionSet")
public class PermissionSet extends io.pulumi.resources.CustomResource {
    /**
     * The permission set description.
     * 
     */
    @OutputExport(name="description", type=String.class, parameters={})
    private Output</* @Nullable */ String> description;

    /**
     * @return The permission set description.
     * 
     */
    public Output</* @Nullable */ String> getDescription() {
        return this.description;
    }
    /**
     * The inline policy to put in permission set.
     * 
     */
    @OutputExport(name="inlinePolicy", type=Object.class, parameters={})
    private Output</* @Nullable */ Object> inlinePolicy;

    /**
     * @return The inline policy to put in permission set.
     * 
     */
    public Output</* @Nullable */ Object> getInlinePolicy() {
        return this.inlinePolicy;
    }
    /**
     * The sso instance arn that the permission set is owned.
     * 
     */
    @OutputExport(name="instanceArn", type=String.class, parameters={})
    private Output<String> instanceArn;

    /**
     * @return The sso instance arn that the permission set is owned.
     * 
     */
    public Output<String> getInstanceArn() {
        return this.instanceArn;
    }
    @OutputExport(name="managedPolicies", type=List.class, parameters={String.class})
    private Output</* @Nullable */ List<String>> managedPolicies;

    public Output</* @Nullable */ List<String>> getManagedPolicies() {
        return this.managedPolicies;
    }
    /**
     * The name you want to assign to this permission set.
     * 
     */
    @OutputExport(name="name", type=String.class, parameters={})
    private Output<String> name;

    /**
     * @return The name you want to assign to this permission set.
     * 
     */
    public Output<String> getName() {
        return this.name;
    }
    /**
     * The permission set that the policy will be attached to
     * 
     */
    @OutputExport(name="permissionSetArn", type=String.class, parameters={})
    private Output<String> permissionSetArn;

    /**
     * @return The permission set that the policy will be attached to
     * 
     */
    public Output<String> getPermissionSetArn() {
        return this.permissionSetArn;
    }
    /**
     * The relay state URL that redirect links to any service in the AWS Management Console.
     * 
     */
    @OutputExport(name="relayStateType", type=String.class, parameters={})
    private Output</* @Nullable */ String> relayStateType;

    /**
     * @return The relay state URL that redirect links to any service in the AWS Management Console.
     * 
     */
    public Output</* @Nullable */ String> getRelayStateType() {
        return this.relayStateType;
    }
    /**
     * The length of time that a user can be signed in to an AWS account.
     * 
     */
    @OutputExport(name="sessionDuration", type=String.class, parameters={})
    private Output</* @Nullable */ String> sessionDuration;

    /**
     * @return The length of time that a user can be signed in to an AWS account.
     * 
     */
    public Output</* @Nullable */ String> getSessionDuration() {
        return this.sessionDuration;
    }
    @OutputExport(name="tags", type=List.class, parameters={PermissionSetTag.class})
    private Output</* @Nullable */ List<PermissionSetTag>> tags;

    public Output</* @Nullable */ List<PermissionSetTag>> getTags() {
        return this.tags;
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public PermissionSet(String name, PermissionSetArgs args, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("aws-native:sso:PermissionSet", name, args == null ? PermissionSetArgs.Empty : args, makeResourceOptions(options, Input.empty()));
    }

    private PermissionSet(String name, Input<String> id, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("aws-native:sso:PermissionSet", name, null, makeResourceOptions(options, id));
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
     * @param options Optional settings to control the behavior of the CustomResource.
     */
    public static PermissionSet get(String name, Input<String> id, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        return new PermissionSet(name, id, options);
    }
}
