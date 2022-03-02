// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.cloud9;

import io.pulumi.aws.Utilities;
import io.pulumi.aws.cloud9.EnvironmentMembershipArgs;
import io.pulumi.aws.cloud9.inputs.EnvironmentMembershipState;
import io.pulumi.core.Input;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.OutputExport;
import io.pulumi.core.annotations.ResourceType;
import java.lang.String;
import javax.annotation.Nullable;

/**
 * Provides an environment member to an AWS Cloud9 development environment.
 * 
 * ## Example Usage
 * 
 * ## Import
 * 
 * Cloud9 environment membership can be imported using the `environment-id#user-arn`, e.g.
 * 
 * ```sh
 *  $ pulumi import aws:cloud9/environmentMembership:EnvironmentMembership test environment-id#user-arn
 * ```
 * 
 */
@ResourceType(type="aws:cloud9/environmentMembership:EnvironmentMembership")
public class EnvironmentMembership extends io.pulumi.resources.CustomResource {
    /**
     * The ID of the environment that contains the environment member you want to add.
     * 
     */
    @OutputExport(name="environmentId", type=String.class, parameters={})
    private Output<String> environmentId;

    /**
     * @return The ID of the environment that contains the environment member you want to add.
     * 
     */
    public Output<String> getEnvironmentId() {
        return this.environmentId;
    }
    /**
     * The type of environment member permissions you want to associate with this environment member. Allowed values are `read-only` and `read-write` .
     * 
     */
    @OutputExport(name="permissions", type=String.class, parameters={})
    private Output<String> permissions;

    /**
     * @return The type of environment member permissions you want to associate with this environment member. Allowed values are `read-only` and `read-write` .
     * 
     */
    public Output<String> getPermissions() {
        return this.permissions;
    }
    /**
     * The Amazon Resource Name (ARN) of the environment member you want to add.
     * 
     */
    @OutputExport(name="userArn", type=String.class, parameters={})
    private Output<String> userArn;

    /**
     * @return The Amazon Resource Name (ARN) of the environment member you want to add.
     * 
     */
    public Output<String> getUserArn() {
        return this.userArn;
    }
    /**
     * he user ID in AWS Identity and Access Management (AWS IAM) of the environment member.
     * 
     */
    @OutputExport(name="userId", type=String.class, parameters={})
    private Output<String> userId;

    /**
     * @return he user ID in AWS Identity and Access Management (AWS IAM) of the environment member.
     * 
     */
    public Output<String> getUserId() {
        return this.userId;
    }

    public interface BuilderApplicator {
        public void apply(EnvironmentMembershipArgs.Builder a);
    }
    private static io.pulumi.aws.cloud9.EnvironmentMembershipArgs buildArgs(BuilderApplicator argsBuilder) {
        final var builder = io.pulumi.aws.cloud9.EnvironmentMembershipArgs.builder();
        argsBuilder.apply(builder);
        return builder.build();
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param argsBuilder A function that configures a passed builder.
     */
    public EnvironmentMembership(String name, BuilderApplicator argsBuilder) {
        this(name, buildArgs(argsBuilder), null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public EnvironmentMembership(String name) {
        this(name, EnvironmentMembershipArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public EnvironmentMembership(String name, EnvironmentMembershipArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public EnvironmentMembership(String name, EnvironmentMembershipArgs args, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("aws:cloud9/environmentMembership:EnvironmentMembership", name, args == null ? EnvironmentMembershipArgs.Empty : args, makeResourceOptions(options, Input.empty()));
    }

    private EnvironmentMembership(String name, Input<String> id, @Nullable EnvironmentMembershipState state, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("aws:cloud9/environmentMembership:EnvironmentMembership", name, state, makeResourceOptions(options, id));
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
    public static EnvironmentMembership get(String name, Input<String> id, @Nullable EnvironmentMembershipState state, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        return new EnvironmentMembership(name, id, state, options);
    }
}
