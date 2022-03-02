// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.ec2;

import io.pulumi.awsnative.Utilities;
import io.pulumi.awsnative.ec2.TransitGatewayMulticastDomainAssociationArgs;
import io.pulumi.core.Input;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.OutputExport;
import io.pulumi.core.annotations.ResourceType;
import java.lang.String;
import javax.annotation.Nullable;

/**
 * The AWS::EC2::TransitGatewayMulticastDomainAssociation type
 * 
 */
@ResourceType(type="aws-native:ec2:TransitGatewayMulticastDomainAssociation")
public class TransitGatewayMulticastDomainAssociation extends io.pulumi.resources.CustomResource {
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
     * The state of the subnet association.
     * 
     */
    @OutputExport(name="state", type=String.class, parameters={})
    private Output<String> state;

    /**
     * @return The state of the subnet association.
     * 
     */
    public Output<String> getState() {
        return this.state;
    }
    /**
     * The IDs of the subnets to associate with the transit gateway multicast domain.
     * 
     */
    @OutputExport(name="subnetId", type=String.class, parameters={})
    private Output<String> subnetId;

    /**
     * @return The IDs of the subnets to associate with the transit gateway multicast domain.
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
        public void apply(TransitGatewayMulticastDomainAssociationArgs.Builder a);
    }
    private static io.pulumi.awsnative.ec2.TransitGatewayMulticastDomainAssociationArgs buildArgs(BuilderApplicator argsBuilder) {
        final var builder = io.pulumi.awsnative.ec2.TransitGatewayMulticastDomainAssociationArgs.builder();
        argsBuilder.apply(builder);
        return builder.build();
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param argsBuilder A function that configures a passed builder.
     */
    public TransitGatewayMulticastDomainAssociation(String name, BuilderApplicator argsBuilder) {
        this(name, buildArgs(argsBuilder), null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public TransitGatewayMulticastDomainAssociation(String name) {
        this(name, TransitGatewayMulticastDomainAssociationArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public TransitGatewayMulticastDomainAssociation(String name, TransitGatewayMulticastDomainAssociationArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public TransitGatewayMulticastDomainAssociation(String name, TransitGatewayMulticastDomainAssociationArgs args, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("aws-native:ec2:TransitGatewayMulticastDomainAssociation", name, args == null ? TransitGatewayMulticastDomainAssociationArgs.Empty : args, makeResourceOptions(options, Input.empty()));
    }

    private TransitGatewayMulticastDomainAssociation(String name, Input<String> id, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("aws-native:ec2:TransitGatewayMulticastDomainAssociation", name, null, makeResourceOptions(options, id));
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
    public static TransitGatewayMulticastDomainAssociation get(String name, Input<String> id, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        return new TransitGatewayMulticastDomainAssociation(name, id, options);
    }
}
