// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.ec2clientvpn;

import io.pulumi.aws.Utilities;
import io.pulumi.aws.ec2clientvpn.NetworkAssociationArgs;
import io.pulumi.aws.ec2clientvpn.inputs.NetworkAssociationState;
import io.pulumi.core.Input;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.OutputExport;
import io.pulumi.core.annotations.ResourceType;
import java.lang.String;
import java.util.List;
import javax.annotation.Nullable;

/**
 * Provides network associations for AWS Client VPN endpoints. For more information on usage, please see the
 * [AWS Client VPN Administrator's Guide](https://docs.aws.amazon.com/vpn/latest/clientvpn-admin/what-is.html).
 * 
 * ## Example Usage
 * 
 * ## Import
 * 
 * AWS Client VPN network associations can be imported using the endpoint ID and the association ID. Values are separated by a `,`.
 * 
 * ```sh
 *  $ pulumi import aws:ec2clientvpn/networkAssociation:NetworkAssociation example cvpn-endpoint-0ac3a1abbccddd666,vpn-assoc-0b8db902465d069ad
 * ```
 * 
 */
@ResourceType(type="aws:ec2clientvpn/networkAssociation:NetworkAssociation")
public class NetworkAssociation extends io.pulumi.resources.CustomResource {
    /**
     * The unique ID of the target network association.
     * 
     */
    @OutputExport(name="associationId", type=String.class, parameters={})
    private Output<String> associationId;

    /**
     * @return The unique ID of the target network association.
     * 
     */
    public Output<String> getAssociationId() {
        return this.associationId;
    }
    /**
     * The ID of the Client VPN endpoint.
     * 
     */
    @OutputExport(name="clientVpnEndpointId", type=String.class, parameters={})
    private Output<String> clientVpnEndpointId;

    /**
     * @return The ID of the Client VPN endpoint.
     * 
     */
    public Output<String> getClientVpnEndpointId() {
        return this.clientVpnEndpointId;
    }
    /**
     * A list of up to five custom security groups to apply to the target network. If not specified, the VPC's default security group is assigned.
     * 
     */
    @OutputExport(name="securityGroups", type=List.class, parameters={String.class})
    private Output<List<String>> securityGroups;

    /**
     * @return A list of up to five custom security groups to apply to the target network. If not specified, the VPC's default security group is assigned.
     * 
     */
    public Output<List<String>> getSecurityGroups() {
        return this.securityGroups;
    }
    /**
     * The current state of the target network association.
     * 
     */
    @OutputExport(name="status", type=String.class, parameters={})
    private Output<String> status;

    /**
     * @return The current state of the target network association.
     * 
     */
    public Output<String> getStatus() {
        return this.status;
    }
    /**
     * The ID of the subnet to associate with the Client VPN endpoint.
     * 
     */
    @OutputExport(name="subnetId", type=String.class, parameters={})
    private Output<String> subnetId;

    /**
     * @return The ID of the subnet to associate with the Client VPN endpoint.
     * 
     */
    public Output<String> getSubnetId() {
        return this.subnetId;
    }
    /**
     * The ID of the VPC in which the target subnet is located.
     * 
     */
    @OutputExport(name="vpcId", type=String.class, parameters={})
    private Output<String> vpcId;

    /**
     * @return The ID of the VPC in which the target subnet is located.
     * 
     */
    public Output<String> getVpcId() {
        return this.vpcId;
    }

    public interface BuilderApplicator {
        public void apply(NetworkAssociationArgs.Builder a);
    }
    private static io.pulumi.aws.ec2clientvpn.NetworkAssociationArgs buildArgs(BuilderApplicator argsBuilder) {
        final var builder = io.pulumi.aws.ec2clientvpn.NetworkAssociationArgs.builder();
        argsBuilder.apply(builder);
        return builder.build();
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param argsBuilder A function that configures a passed builder.
     */
    public NetworkAssociation(String name, BuilderApplicator argsBuilder) {
        this(name, buildArgs(argsBuilder), null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public NetworkAssociation(String name) {
        this(name, NetworkAssociationArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public NetworkAssociation(String name, NetworkAssociationArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public NetworkAssociation(String name, NetworkAssociationArgs args, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("aws:ec2clientvpn/networkAssociation:NetworkAssociation", name, args == null ? NetworkAssociationArgs.Empty : args, makeResourceOptions(options, Input.empty()));
    }

    private NetworkAssociation(String name, Input<String> id, @Nullable NetworkAssociationState state, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("aws:ec2clientvpn/networkAssociation:NetworkAssociation", name, state, makeResourceOptions(options, id));
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
    public static NetworkAssociation get(String name, Input<String> id, @Nullable NetworkAssociationState state, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        return new NetworkAssociation(name, id, state, options);
    }
}
