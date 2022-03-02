// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.ec2transitgateway;

import io.pulumi.aws.Utilities;
import io.pulumi.aws.ec2transitgateway.VpcAttachmentArgs;
import io.pulumi.aws.ec2transitgateway.inputs.VpcAttachmentState;
import io.pulumi.core.Input;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.OutputExport;
import io.pulumi.core.annotations.ResourceType;
import java.lang.Boolean;
import java.lang.String;
import java.util.List;
import java.util.Map;
import javax.annotation.Nullable;

/**
 * Manages an EC2 Transit Gateway VPC Attachment. For examples of custom route table association and propagation, see the EC2 Transit Gateway Networking Examples Guide.
 * 
 * ## Example Usage
 * 
 * ## Import
 * 
 * `aws_ec2_transit_gateway_vpc_attachment` can be imported by using the EC2 Transit Gateway Attachment identifier, e.g.,
 * 
 * ```sh
 *  $ pulumi import aws:ec2transitgateway/vpcAttachment:VpcAttachment example tgw-attach-12345678
 * ```
 * 
 */
@ResourceType(type="aws:ec2transitgateway/vpcAttachment:VpcAttachment")
public class VpcAttachment extends io.pulumi.resources.CustomResource {
    /**
     * Whether Appliance Mode support is enabled. If enabled, a traffic flow between a source and destination uses the same Availability Zone for the VPC attachment for the lifetime of that flow. Valid values: `disable`, `enable`. Default value: `disable`.
     * 
     */
    @OutputExport(name="applianceModeSupport", type=String.class, parameters={})
    private Output</* @Nullable */ String> applianceModeSupport;

    /**
     * @return Whether Appliance Mode support is enabled. If enabled, a traffic flow between a source and destination uses the same Availability Zone for the VPC attachment for the lifetime of that flow. Valid values: `disable`, `enable`. Default value: `disable`.
     * 
     */
    public Output</* @Nullable */ String> getApplianceModeSupport() {
        return this.applianceModeSupport;
    }
    /**
     * Whether DNS support is enabled. Valid values: `disable`, `enable`. Default value: `enable`.
     * 
     */
    @OutputExport(name="dnsSupport", type=String.class, parameters={})
    private Output</* @Nullable */ String> dnsSupport;

    /**
     * @return Whether DNS support is enabled. Valid values: `disable`, `enable`. Default value: `enable`.
     * 
     */
    public Output</* @Nullable */ String> getDnsSupport() {
        return this.dnsSupport;
    }
    /**
     * Whether IPv6 support is enabled. Valid values: `disable`, `enable`. Default value: `disable`.
     * 
     */
    @OutputExport(name="ipv6Support", type=String.class, parameters={})
    private Output</* @Nullable */ String> ipv6Support;

    /**
     * @return Whether IPv6 support is enabled. Valid values: `disable`, `enable`. Default value: `disable`.
     * 
     */
    public Output</* @Nullable */ String> getIpv6Support() {
        return this.ipv6Support;
    }
    /**
     * Identifiers of EC2 Subnets.
     * 
     */
    @OutputExport(name="subnetIds", type=List.class, parameters={String.class})
    private Output<List<String>> subnetIds;

    /**
     * @return Identifiers of EC2 Subnets.
     * 
     */
    public Output<List<String>> getSubnetIds() {
        return this.subnetIds;
    }
    /**
     * Key-value tags for the EC2 Transit Gateway VPC Attachment. If configured with a provider `default_tags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
     * 
     */
    @OutputExport(name="tags", type=Map.class, parameters={String.class, String.class})
    private Output</* @Nullable */ Map<String,String>> tags;

    /**
     * @return Key-value tags for the EC2 Transit Gateway VPC Attachment. If configured with a provider `default_tags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
     * 
     */
    public Output</* @Nullable */ Map<String,String>> getTags() {
        return this.tags;
    }
    /**
     * A map of tags assigned to the resource, including those inherited from the provider `default_tags` configuration block.
     * 
     */
    @OutputExport(name="tagsAll", type=Map.class, parameters={String.class, String.class})
    private Output<Map<String,String>> tagsAll;

    /**
     * @return A map of tags assigned to the resource, including those inherited from the provider `default_tags` configuration block.
     * 
     */
    public Output<Map<String,String>> getTagsAll() {
        return this.tagsAll;
    }
    /**
     * Boolean whether the VPC Attachment should be associated with the EC2 Transit Gateway association default route table. This cannot be configured or perform drift detection with Resource Access Manager shared EC2 Transit Gateways. Default value: `true`.
     * 
     */
    @OutputExport(name="transitGatewayDefaultRouteTableAssociation", type=Boolean.class, parameters={})
    private Output</* @Nullable */ Boolean> transitGatewayDefaultRouteTableAssociation;

    /**
     * @return Boolean whether the VPC Attachment should be associated with the EC2 Transit Gateway association default route table. This cannot be configured or perform drift detection with Resource Access Manager shared EC2 Transit Gateways. Default value: `true`.
     * 
     */
    public Output</* @Nullable */ Boolean> getTransitGatewayDefaultRouteTableAssociation() {
        return this.transitGatewayDefaultRouteTableAssociation;
    }
    /**
     * Boolean whether the VPC Attachment should propagate routes with the EC2 Transit Gateway propagation default route table. This cannot be configured or perform drift detection with Resource Access Manager shared EC2 Transit Gateways. Default value: `true`.
     * 
     */
    @OutputExport(name="transitGatewayDefaultRouteTablePropagation", type=Boolean.class, parameters={})
    private Output</* @Nullable */ Boolean> transitGatewayDefaultRouteTablePropagation;

    /**
     * @return Boolean whether the VPC Attachment should propagate routes with the EC2 Transit Gateway propagation default route table. This cannot be configured or perform drift detection with Resource Access Manager shared EC2 Transit Gateways. Default value: `true`.
     * 
     */
    public Output</* @Nullable */ Boolean> getTransitGatewayDefaultRouteTablePropagation() {
        return this.transitGatewayDefaultRouteTablePropagation;
    }
    /**
     * Identifier of EC2 Transit Gateway.
     * 
     */
    @OutputExport(name="transitGatewayId", type=String.class, parameters={})
    private Output<String> transitGatewayId;

    /**
     * @return Identifier of EC2 Transit Gateway.
     * 
     */
    public Output<String> getTransitGatewayId() {
        return this.transitGatewayId;
    }
    /**
     * Identifier of EC2 VPC.
     * 
     */
    @OutputExport(name="vpcId", type=String.class, parameters={})
    private Output<String> vpcId;

    /**
     * @return Identifier of EC2 VPC.
     * 
     */
    public Output<String> getVpcId() {
        return this.vpcId;
    }
    /**
     * Identifier of the AWS account that owns the EC2 VPC.
     * 
     */
    @OutputExport(name="vpcOwnerId", type=String.class, parameters={})
    private Output<String> vpcOwnerId;

    /**
     * @return Identifier of the AWS account that owns the EC2 VPC.
     * 
     */
    public Output<String> getVpcOwnerId() {
        return this.vpcOwnerId;
    }

    public interface BuilderApplicator {
        public void apply(VpcAttachmentArgs.Builder a);
    }
    private static io.pulumi.aws.ec2transitgateway.VpcAttachmentArgs buildArgs(BuilderApplicator argsBuilder) {
        final var builder = io.pulumi.aws.ec2transitgateway.VpcAttachmentArgs.builder();
        argsBuilder.apply(builder);
        return builder.build();
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param argsBuilder A function that configures a passed builder.
     */
    public VpcAttachment(String name, BuilderApplicator argsBuilder) {
        this(name, buildArgs(argsBuilder), null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public VpcAttachment(String name) {
        this(name, VpcAttachmentArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public VpcAttachment(String name, VpcAttachmentArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public VpcAttachment(String name, VpcAttachmentArgs args, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("aws:ec2transitgateway/vpcAttachment:VpcAttachment", name, args == null ? VpcAttachmentArgs.Empty : args, makeResourceOptions(options, Input.empty()));
    }

    private VpcAttachment(String name, Input<String> id, @Nullable VpcAttachmentState state, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("aws:ec2transitgateway/vpcAttachment:VpcAttachment", name, state, makeResourceOptions(options, id));
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
    public static VpcAttachment get(String name, Input<String> id, @Nullable VpcAttachmentState state, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        return new VpcAttachment(name, id, state, options);
    }
}
