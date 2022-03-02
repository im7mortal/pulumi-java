// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.directconnect;

import io.pulumi.aws.Utilities;
import io.pulumi.aws.directconnect.PrivateVirtualInterfaceArgs;
import io.pulumi.aws.directconnect.inputs.PrivateVirtualInterfaceState;
import io.pulumi.core.Input;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.OutputExport;
import io.pulumi.core.annotations.ResourceType;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import java.util.Map;
import javax.annotation.Nullable;

/**
 * Provides a Direct Connect private virtual interface resource.
 * 
 * ## Example Usage
 * 
 * ## Import
 * 
 * Direct Connect private virtual interfaces can be imported using the `vif id`, e.g.,
 * 
 * ```sh
 *  $ pulumi import aws:directconnect/privateVirtualInterface:PrivateVirtualInterface test dxvif-33cc44dd
 * ```
 * 
 */
@ResourceType(type="aws:directconnect/privateVirtualInterface:PrivateVirtualInterface")
public class PrivateVirtualInterface extends io.pulumi.resources.CustomResource {
    /**
     * The address family for the BGP peer. ` ipv4  ` or `ipv6`.
     * 
     */
    @OutputExport(name="addressFamily", type=String.class, parameters={})
    private Output<String> addressFamily;

    /**
     * @return The address family for the BGP peer. ` ipv4  ` or `ipv6`.
     * 
     */
    public Output<String> getAddressFamily() {
        return this.addressFamily;
    }
    /**
     * The IPv4 CIDR address to use to send traffic to Amazon. Required for IPv4 BGP peers.
     * 
     */
    @OutputExport(name="amazonAddress", type=String.class, parameters={})
    private Output<String> amazonAddress;

    /**
     * @return The IPv4 CIDR address to use to send traffic to Amazon. Required for IPv4 BGP peers.
     * 
     */
    public Output<String> getAmazonAddress() {
        return this.amazonAddress;
    }
    @OutputExport(name="amazonSideAsn", type=String.class, parameters={})
    private Output<String> amazonSideAsn;

    public Output<String> getAmazonSideAsn() {
        return this.amazonSideAsn;
    }
    /**
     * The ARN of the virtual interface.
     * 
     */
    @OutputExport(name="arn", type=String.class, parameters={})
    private Output<String> arn;

    /**
     * @return The ARN of the virtual interface.
     * 
     */
    public Output<String> getArn() {
        return this.arn;
    }
    /**
     * The Direct Connect endpoint on which the virtual interface terminates.
     * 
     */
    @OutputExport(name="awsDevice", type=String.class, parameters={})
    private Output<String> awsDevice;

    /**
     * @return The Direct Connect endpoint on which the virtual interface terminates.
     * 
     */
    public Output<String> getAwsDevice() {
        return this.awsDevice;
    }
    /**
     * The autonomous system (AS) number for Border Gateway Protocol (BGP) configuration.
     * 
     */
    @OutputExport(name="bgpAsn", type=Integer.class, parameters={})
    private Output<Integer> bgpAsn;

    /**
     * @return The autonomous system (AS) number for Border Gateway Protocol (BGP) configuration.
     * 
     */
    public Output<Integer> getBgpAsn() {
        return this.bgpAsn;
    }
    /**
     * The authentication key for BGP configuration.
     * 
     */
    @OutputExport(name="bgpAuthKey", type=String.class, parameters={})
    private Output<String> bgpAuthKey;

    /**
     * @return The authentication key for BGP configuration.
     * 
     */
    public Output<String> getBgpAuthKey() {
        return this.bgpAuthKey;
    }
    /**
     * The ID of the Direct Connect connection (or LAG) on which to create the virtual interface.
     * 
     */
    @OutputExport(name="connectionId", type=String.class, parameters={})
    private Output<String> connectionId;

    /**
     * @return The ID of the Direct Connect connection (or LAG) on which to create the virtual interface.
     * 
     */
    public Output<String> getConnectionId() {
        return this.connectionId;
    }
    /**
     * The IPv4 CIDR destination address to which Amazon should send traffic. Required for IPv4 BGP peers.
     * 
     */
    @OutputExport(name="customerAddress", type=String.class, parameters={})
    private Output<String> customerAddress;

    /**
     * @return The IPv4 CIDR destination address to which Amazon should send traffic. Required for IPv4 BGP peers.
     * 
     */
    public Output<String> getCustomerAddress() {
        return this.customerAddress;
    }
    /**
     * The ID of the Direct Connect gateway to which to connect the virtual interface.
     * 
     */
    @OutputExport(name="dxGatewayId", type=String.class, parameters={})
    private Output</* @Nullable */ String> dxGatewayId;

    /**
     * @return The ID of the Direct Connect gateway to which to connect the virtual interface.
     * 
     */
    public Output</* @Nullable */ String> getDxGatewayId() {
        return this.dxGatewayId;
    }
    /**
     * Indicates whether jumbo frames (9001 MTU) are supported.
     * 
     */
    @OutputExport(name="jumboFrameCapable", type=Boolean.class, parameters={})
    private Output<Boolean> jumboFrameCapable;

    /**
     * @return Indicates whether jumbo frames (9001 MTU) are supported.
     * 
     */
    public Output<Boolean> getJumboFrameCapable() {
        return this.jumboFrameCapable;
    }
    /**
     * The maximum transmission unit (MTU) is the size, in bytes, of the largest permissible packet that can be passed over the connection.
     * The MTU of a virtual private interface can be either `1500` or `9001` (jumbo frames). Default is `1500`.
     * 
     */
    @OutputExport(name="mtu", type=Integer.class, parameters={})
    private Output</* @Nullable */ Integer> mtu;

    /**
     * @return The maximum transmission unit (MTU) is the size, in bytes, of the largest permissible packet that can be passed over the connection.
     * The MTU of a virtual private interface can be either `1500` or `9001` (jumbo frames). Default is `1500`.
     * 
     */
    public Output</* @Nullable */ Integer> getMtu() {
        return this.mtu;
    }
    /**
     * The name for the virtual interface.
     * 
     */
    @OutputExport(name="name", type=String.class, parameters={})
    private Output<String> name;

    /**
     * @return The name for the virtual interface.
     * 
     */
    public Output<String> getName() {
        return this.name;
    }
    @OutputExport(name="sitelinkEnabled", type=Boolean.class, parameters={})
    private Output</* @Nullable */ Boolean> sitelinkEnabled;

    public Output</* @Nullable */ Boolean> getSitelinkEnabled() {
        return this.sitelinkEnabled;
    }
    /**
     * A map of tags to assign to the resource. .If configured with a provider `default_tags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
     * 
     */
    @OutputExport(name="tags", type=Map.class, parameters={String.class, String.class})
    private Output</* @Nullable */ Map<String,String>> tags;

    /**
     * @return A map of tags to assign to the resource. .If configured with a provider `default_tags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
     * 
     */
    public Output</* @Nullable */ Map<String,String>> getTags() {
        return this.tags;
    }
    /**
     * A map of tags assigned to the resource, including those inherited from the provider .
     * 
     */
    @OutputExport(name="tagsAll", type=Map.class, parameters={String.class, String.class})
    private Output<Map<String,String>> tagsAll;

    /**
     * @return A map of tags assigned to the resource, including those inherited from the provider .
     * 
     */
    public Output<Map<String,String>> getTagsAll() {
        return this.tagsAll;
    }
    /**
     * The VLAN ID.
     * 
     */
    @OutputExport(name="vlan", type=Integer.class, parameters={})
    private Output<Integer> vlan;

    /**
     * @return The VLAN ID.
     * 
     */
    public Output<Integer> getVlan() {
        return this.vlan;
    }
    /**
     * The ID of the virtual private gateway to which to connect the virtual interface.
     * 
     */
    @OutputExport(name="vpnGatewayId", type=String.class, parameters={})
    private Output</* @Nullable */ String> vpnGatewayId;

    /**
     * @return The ID of the virtual private gateway to which to connect the virtual interface.
     * 
     */
    public Output</* @Nullable */ String> getVpnGatewayId() {
        return this.vpnGatewayId;
    }

    public interface BuilderApplicator {
        public void apply(PrivateVirtualInterfaceArgs.Builder a);
    }
    private static io.pulumi.aws.directconnect.PrivateVirtualInterfaceArgs buildArgs(BuilderApplicator argsBuilder) {
        final var builder = io.pulumi.aws.directconnect.PrivateVirtualInterfaceArgs.builder();
        argsBuilder.apply(builder);
        return builder.build();
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param argsBuilder A function that configures a passed builder.
     */
    public PrivateVirtualInterface(String name, BuilderApplicator argsBuilder) {
        this(name, buildArgs(argsBuilder), null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public PrivateVirtualInterface(String name) {
        this(name, PrivateVirtualInterfaceArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public PrivateVirtualInterface(String name, PrivateVirtualInterfaceArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public PrivateVirtualInterface(String name, PrivateVirtualInterfaceArgs args, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("aws:directconnect/privateVirtualInterface:PrivateVirtualInterface", name, args == null ? PrivateVirtualInterfaceArgs.Empty : args, makeResourceOptions(options, Input.empty()));
    }

    private PrivateVirtualInterface(String name, Input<String> id, @Nullable PrivateVirtualInterfaceState state, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("aws:directconnect/privateVirtualInterface:PrivateVirtualInterface", name, state, makeResourceOptions(options, id));
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
    public static PrivateVirtualInterface get(String name, Input<String> id, @Nullable PrivateVirtualInterfaceState state, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        return new PrivateVirtualInterface(name, id, state, options);
    }
}
