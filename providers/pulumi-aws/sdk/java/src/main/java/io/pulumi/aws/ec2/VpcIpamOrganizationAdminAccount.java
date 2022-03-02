// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.ec2;

import io.pulumi.aws.Utilities;
import io.pulumi.aws.ec2.VpcIpamOrganizationAdminAccountArgs;
import io.pulumi.aws.ec2.inputs.VpcIpamOrganizationAdminAccountState;
import io.pulumi.core.Input;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.OutputExport;
import io.pulumi.core.annotations.ResourceType;
import java.lang.String;
import javax.annotation.Nullable;

/**
 * Enables the IPAM Service and promotes a delegated administrator.
 * 
 * ## Example Usage
 * 
 * ## Import
 * 
 * IPAMs can be imported using the `delegate account id`, e.g.
 * 
 * ```sh
 *  $ pulumi import aws:ec2/vpcIpamOrganizationAdminAccount:VpcIpamOrganizationAdminAccount example 12345678901
 * ```
 * 
 */
@ResourceType(type="aws:ec2/vpcIpamOrganizationAdminAccount:VpcIpamOrganizationAdminAccount")
public class VpcIpamOrganizationAdminAccount extends io.pulumi.resources.CustomResource {
    /**
     * The Organizations ARN for the delegate account.
     * 
     */
    @OutputExport(name="arn", type=String.class, parameters={})
    private Output<String> arn;

    /**
     * @return The Organizations ARN for the delegate account.
     * 
     */
    public Output<String> getArn() {
        return this.arn;
    }
    @OutputExport(name="delegatedAdminAccountId", type=String.class, parameters={})
    private Output<String> delegatedAdminAccountId;

    public Output<String> getDelegatedAdminAccountId() {
        return this.delegatedAdminAccountId;
    }
    /**
     * The Organizations email for the delegate account.
     * 
     */
    @OutputExport(name="email", type=String.class, parameters={})
    private Output<String> email;

    /**
     * @return The Organizations email for the delegate account.
     * 
     */
    public Output<String> getEmail() {
        return this.email;
    }
    /**
     * The Organizations name for the delegate account.
     * 
     */
    @OutputExport(name="name", type=String.class, parameters={})
    private Output<String> name;

    /**
     * @return The Organizations name for the delegate account.
     * 
     */
    public Output<String> getName() {
        return this.name;
    }
    /**
     * The AWS service principal.
     * 
     */
    @OutputExport(name="servicePrincipal", type=String.class, parameters={})
    private Output<String> servicePrincipal;

    /**
     * @return The AWS service principal.
     * 
     */
    public Output<String> getServicePrincipal() {
        return this.servicePrincipal;
    }

    public interface BuilderApplicator {
        public void apply(VpcIpamOrganizationAdminAccountArgs.Builder a);
    }
    private static io.pulumi.aws.ec2.VpcIpamOrganizationAdminAccountArgs buildArgs(BuilderApplicator argsBuilder) {
        final var builder = io.pulumi.aws.ec2.VpcIpamOrganizationAdminAccountArgs.builder();
        argsBuilder.apply(builder);
        return builder.build();
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param argsBuilder A function that configures a passed builder.
     */
    public VpcIpamOrganizationAdminAccount(String name, BuilderApplicator argsBuilder) {
        this(name, buildArgs(argsBuilder), null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public VpcIpamOrganizationAdminAccount(String name) {
        this(name, VpcIpamOrganizationAdminAccountArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public VpcIpamOrganizationAdminAccount(String name, VpcIpamOrganizationAdminAccountArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public VpcIpamOrganizationAdminAccount(String name, VpcIpamOrganizationAdminAccountArgs args, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("aws:ec2/vpcIpamOrganizationAdminAccount:VpcIpamOrganizationAdminAccount", name, args == null ? VpcIpamOrganizationAdminAccountArgs.Empty : args, makeResourceOptions(options, Input.empty()));
    }

    private VpcIpamOrganizationAdminAccount(String name, Input<String> id, @Nullable VpcIpamOrganizationAdminAccountState state, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("aws:ec2/vpcIpamOrganizationAdminAccount:VpcIpamOrganizationAdminAccount", name, state, makeResourceOptions(options, id));
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
    public static VpcIpamOrganizationAdminAccount get(String name, Input<String> id, @Nullable VpcIpamOrganizationAdminAccountState state, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        return new VpcIpamOrganizationAdminAccount(name, id, state, options);
    }
}
