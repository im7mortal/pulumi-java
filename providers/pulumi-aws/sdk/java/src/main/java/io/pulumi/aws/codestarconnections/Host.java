// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.codestarconnections;

import io.pulumi.aws.Utilities;
import io.pulumi.aws.codestarconnections.HostArgs;
import io.pulumi.aws.codestarconnections.inputs.HostState;
import io.pulumi.aws.codestarconnections.outputs.HostVpcConfiguration;
import io.pulumi.core.Input;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.OutputExport;
import io.pulumi.core.annotations.ResourceType;
import java.lang.String;
import javax.annotation.Nullable;

/**
 * Provides a CodeStar Host.
 * 
 * > **NOTE:** The `aws.codestarconnections.Host` resource is created in the state `PENDING`. Authentication with the host provider must be completed in the AWS Console. For more information visit [Set up a pending host](https://docs.aws.amazon.com/dtconsole/latest/userguide/connections-host-setup.html).
 * 
 * ## Example Usage
 * 
 * ## Import
 * 
 * CodeStar Host can be imported using the ARN, e.g.,
 * 
 * ```sh
 *  $ pulumi import aws:codestarconnections/host:Host example-host arn:aws:codestar-connections:us-west-1:0123456789:host/79d4d357-a2ee-41e4-b350-2fe39ae59448
 * ```
 * 
 */
@ResourceType(type="aws:codestarconnections/host:Host")
public class Host extends io.pulumi.resources.CustomResource {
    /**
     * The CodeStar Host ARN.
     * 
     */
    @OutputExport(name="arn", type=String.class, parameters={})
    private Output<String> arn;

    /**
     * @return The CodeStar Host ARN.
     * 
     */
    public Output<String> getArn() {
        return this.arn;
    }
    /**
     * The name of the host to be created. The name must be unique in the calling AWS account.
     * 
     */
    @OutputExport(name="name", type=String.class, parameters={})
    private Output<String> name;

    /**
     * @return The name of the host to be created. The name must be unique in the calling AWS account.
     * 
     */
    public Output<String> getName() {
        return this.name;
    }
    /**
     * The endpoint of the infrastructure to be represented by the host after it is created.
     * 
     */
    @OutputExport(name="providerEndpoint", type=String.class, parameters={})
    private Output<String> providerEndpoint;

    /**
     * @return The endpoint of the infrastructure to be represented by the host after it is created.
     * 
     */
    public Output<String> getProviderEndpoint() {
        return this.providerEndpoint;
    }
    /**
     * The name of the external provider where your third-party code repository is configured.
     * 
     */
    @OutputExport(name="providerType", type=String.class, parameters={})
    private Output<String> providerType;

    /**
     * @return The name of the external provider where your third-party code repository is configured.
     * 
     */
    public Output<String> getProviderType() {
        return this.providerType;
    }
    /**
     * The CodeStar Host status. Possible values are `PENDING`, `AVAILABLE`, `VPC_CONFIG_DELETING`, `VPC_CONFIG_INITIALIZING`, and `VPC_CONFIG_FAILED_INITIALIZATION`.
     * 
     */
    @OutputExport(name="status", type=String.class, parameters={})
    private Output<String> status;

    /**
     * @return The CodeStar Host status. Possible values are `PENDING`, `AVAILABLE`, `VPC_CONFIG_DELETING`, `VPC_CONFIG_INITIALIZING`, and `VPC_CONFIG_FAILED_INITIALIZATION`.
     * 
     */
    public Output<String> getStatus() {
        return this.status;
    }
    /**
     * The VPC configuration to be provisioned for the host. A VPC must be configured, and the infrastructure to be represented by the host must already be connected to the VPC.
     * 
     */
    @OutputExport(name="vpcConfiguration", type=HostVpcConfiguration.class, parameters={})
    private Output</* @Nullable */ HostVpcConfiguration> vpcConfiguration;

    /**
     * @return The VPC configuration to be provisioned for the host. A VPC must be configured, and the infrastructure to be represented by the host must already be connected to the VPC.
     * 
     */
    public Output</* @Nullable */ HostVpcConfiguration> getVpcConfiguration() {
        return this.vpcConfiguration;
    }

    public interface BuilderApplicator {
        public void apply(HostArgs.Builder a);
    }
    private static io.pulumi.aws.codestarconnections.HostArgs buildArgs(BuilderApplicator argsBuilder) {
        final var builder = io.pulumi.aws.codestarconnections.HostArgs.builder();
        argsBuilder.apply(builder);
        return builder.build();
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param argsBuilder A function that configures a passed builder.
     */
    public Host(String name, BuilderApplicator argsBuilder) {
        this(name, buildArgs(argsBuilder), null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public Host(String name) {
        this(name, HostArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public Host(String name, HostArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public Host(String name, HostArgs args, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("aws:codestarconnections/host:Host", name, args == null ? HostArgs.Empty : args, makeResourceOptions(options, Input.empty()));
    }

    private Host(String name, Input<String> id, @Nullable HostState state, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("aws:codestarconnections/host:Host", name, state, makeResourceOptions(options, id));
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
    public static Host get(String name, Input<String> id, @Nullable HostState state, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        return new Host(name, id, state, options);
    }
}
