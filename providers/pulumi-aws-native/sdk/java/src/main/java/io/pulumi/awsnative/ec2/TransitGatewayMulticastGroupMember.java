// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.ec2;

import io.pulumi.awsnative.Utilities;
import io.pulumi.awsnative.ec2.TransitGatewayMulticastGroupMemberArgs;
import io.pulumi.core.Input;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.OutputExport;
import io.pulumi.core.annotations.ResourceType;
import java.lang.Boolean;
import java.lang.String;
import javax.annotation.Nullable;

/**
 * The AWS::EC2::TransitGatewayMulticastGroupMember registers and deregisters members and sources (network interfaces) with the transit gateway multicast group
 * 
 */
@ResourceType(type="aws-native:ec2:TransitGatewayMulticastGroupMember")
public class TransitGatewayMulticastGroupMember extends io.pulumi.resources.CustomResource {
    /**
     * The IP address assigned to the transit gateway multicast group.
     * 
     */
    @OutputExport(name="groupIpAddress", type=String.class, parameters={})
    private Output<String> groupIpAddress;

    /**
     * @return The IP address assigned to the transit gateway multicast group.
     * 
     */
    public Output<String> getGroupIpAddress() {
        return this.groupIpAddress;
    }
    /**
     * Indicates that the resource is a transit gateway multicast group member.
     * 
     */
    @OutputExport(name="groupMember", type=Boolean.class, parameters={})
    private Output<Boolean> groupMember;

    /**
     * @return Indicates that the resource is a transit gateway multicast group member.
     * 
     */
    public Output<Boolean> getGroupMember() {
        return this.groupMember;
    }
    /**
     * Indicates that the resource is a transit gateway multicast group member.
     * 
     */
    @OutputExport(name="groupSource", type=Boolean.class, parameters={})
    private Output<Boolean> groupSource;

    /**
     * @return Indicates that the resource is a transit gateway multicast group member.
     * 
     */
    public Output<Boolean> getGroupSource() {
        return this.groupSource;
    }
    /**
     * The member type (for example, static).
     * 
     */
    @OutputExport(name="memberType", type=String.class, parameters={})
    private Output<String> memberType;

    /**
     * @return The member type (for example, static).
     * 
     */
    public Output<String> getMemberType() {
        return this.memberType;
    }
    /**
     * The ID of the transit gateway attachment.
     * 
     */
    @OutputExport(name="networkInterfaceId", type=String.class, parameters={})
    private Output<String> networkInterfaceId;

    /**
     * @return The ID of the transit gateway attachment.
     * 
     */
    public Output<String> getNetworkInterfaceId() {
        return this.networkInterfaceId;
    }
    /**
     * The ID of the resource.
     * 
     */
    @OutputExport(name="resourceId", type=String.class, parameters={})
    private Output<String> resourceId;

    /**
     * @return The ID of the resource.
     * 
     */
    public Output<String> getResourceId() {
        return this.resourceId;
    }
    /**
     * The type of resource, for example a VPC attachment.
     * 
     */
    @OutputExport(name="resourceType", type=String.class, parameters={})
    private Output<String> resourceType;

    /**
     * @return The type of resource, for example a VPC attachment.
     * 
     */
    public Output<String> getPropResourceType() {
        return this.resourceType;
    }
    /**
     * The source type.
     * 
     */
    @OutputExport(name="sourceType", type=String.class, parameters={})
    private Output<String> sourceType;

    /**
     * @return The source type.
     * 
     */
    public Output<String> getSourceType() {
        return this.sourceType;
    }
    /**
     * The ID of the subnet.
     * 
     */
    @OutputExport(name="subnetId", type=String.class, parameters={})
    private Output<String> subnetId;

    /**
     * @return The ID of the subnet.
     * 
     */
    public Output<String> getSubnetId() {
        return this.subnetId;
    }
    /**
     * The ID of the transit gateway attachment.
     * 
     */
    @OutputExport(name="transitGatewayAttachmentId", type=String.class, parameters={})
    private Output<String> transitGatewayAttachmentId;

    /**
     * @return The ID of the transit gateway attachment.
     * 
     */
    public Output<String> getTransitGatewayAttachmentId() {
        return this.transitGatewayAttachmentId;
    }
    /**
     * The ID of the transit gateway multicast domain.
     * 
     */
    @OutputExport(name="transitGatewayMulticastDomainId", type=String.class, parameters={})
    private Output<String> transitGatewayMulticastDomainId;

    /**
     * @return The ID of the transit gateway multicast domain.
     * 
     */
    public Output<String> getTransitGatewayMulticastDomainId() {
        return this.transitGatewayMulticastDomainId;
    }

    public interface BuilderApplicator {
        public void apply(TransitGatewayMulticastGroupMemberArgs.Builder a);
    }
    private static io.pulumi.awsnative.ec2.TransitGatewayMulticastGroupMemberArgs buildArgs(BuilderApplicator argsBuilder) {
        final var builder = io.pulumi.awsnative.ec2.TransitGatewayMulticastGroupMemberArgs.builder();
        argsBuilder.apply(builder);
        return builder.build();
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param argsBuilder A function that configures a passed builder.
     */
    public TransitGatewayMulticastGroupMember(String name, BuilderApplicator argsBuilder) {
        this(name, buildArgs(argsBuilder), null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public TransitGatewayMulticastGroupMember(String name) {
        this(name, TransitGatewayMulticastGroupMemberArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public TransitGatewayMulticastGroupMember(String name, TransitGatewayMulticastGroupMemberArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public TransitGatewayMulticastGroupMember(String name, TransitGatewayMulticastGroupMemberArgs args, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("aws-native:ec2:TransitGatewayMulticastGroupMember", name, args == null ? TransitGatewayMulticastGroupMemberArgs.Empty : args, makeResourceOptions(options, Input.empty()));
    }

    private TransitGatewayMulticastGroupMember(String name, Input<String> id, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("aws-native:ec2:TransitGatewayMulticastGroupMember", name, null, makeResourceOptions(options, id));
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
    public static TransitGatewayMulticastGroupMember get(String name, Input<String> id, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        return new TransitGatewayMulticastGroupMember(name, id, options);
    }
}
