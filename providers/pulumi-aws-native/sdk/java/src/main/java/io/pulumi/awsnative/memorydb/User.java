// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.memorydb;

import io.pulumi.awsnative.Utilities;
import io.pulumi.awsnative.memorydb.UserArgs;
import io.pulumi.awsnative.memorydb.outputs.AuthenticationModeProperties;
import io.pulumi.awsnative.memorydb.outputs.UserTag;
import io.pulumi.core.Input;
import io.pulumi.core.Output;
import io.pulumi.core.internal.annotations.OutputExport;
import io.pulumi.core.internal.annotations.ResourceType;
import java.lang.String;
import java.util.List;
import javax.annotation.Nullable;

/**
 * Resource Type definition for AWS::MemoryDB::User
 * 
 */
@ResourceType(type="aws-native:memorydb:User")
public class User extends io.pulumi.resources.CustomResource {
    /**
     * Access permissions string used for this user account.
     * 
     */
    @OutputExport(name="accessString", type=String.class, parameters={})
    private Output<String> accessString;

    /**
     * @return Access permissions string used for this user account.
     * 
     */
    public Output<String> getAccessString() {
        return this.accessString;
    }
    /**
     * The Amazon Resource Name (ARN) of the user account.
     * 
     */
    @OutputExport(name="arn", type=String.class, parameters={})
    private Output<String> arn;

    /**
     * @return The Amazon Resource Name (ARN) of the user account.
     * 
     */
    public Output<String> getArn() {
        return this.arn;
    }
    @OutputExport(name="authenticationMode", type=AuthenticationModeProperties.class, parameters={})
    private Output<AuthenticationModeProperties> authenticationMode;

    public Output<AuthenticationModeProperties> getAuthenticationMode() {
        return this.authenticationMode;
    }
    /**
     * Indicates the user status. Can be "active", "modifying" or "deleting".
     * 
     */
    @OutputExport(name="status", type=String.class, parameters={})
    private Output<String> status;

    /**
     * @return Indicates the user status. Can be "active", "modifying" or "deleting".
     * 
     */
    public Output<String> getStatus() {
        return this.status;
    }
    /**
     * An array of key-value pairs to apply to this user.
     * 
     */
    @OutputExport(name="tags", type=List.class, parameters={UserTag.class})
    private Output</* @Nullable */ List<UserTag>> tags;

    /**
     * @return An array of key-value pairs to apply to this user.
     * 
     */
    public Output</* @Nullable */ List<UserTag>> getTags() {
        return this.tags;
    }
    /**
     * The name of the user.
     * 
     */
    @OutputExport(name="userName", type=String.class, parameters={})
    private Output<String> userName;

    /**
     * @return The name of the user.
     * 
     */
    public Output<String> getUserName() {
        return this.userName;
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public User(String name, UserArgs args, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("aws-native:memorydb:User", name, args == null ? UserArgs.Empty : args, makeResourceOptions(options, Input.empty()));
    }

    private User(String name, Input<String> id, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("aws-native:memorydb:User", name, null, makeResourceOptions(options, id));
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
    public static User get(String name, Input<String> id, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        return new User(name, id, options);
    }
}