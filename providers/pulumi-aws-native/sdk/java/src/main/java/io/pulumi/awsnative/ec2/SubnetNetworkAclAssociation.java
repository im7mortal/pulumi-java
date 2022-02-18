// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.ec2;

import io.pulumi.awsnative.Utilities;
import io.pulumi.awsnative.ec2.SubnetNetworkAclAssociationArgs;
import io.pulumi.core.Input;
import io.pulumi.core.Output;
import io.pulumi.core.internal.annotations.OutputExport;
import io.pulumi.core.internal.annotations.ResourceType;
import java.lang.String;
import javax.annotation.Nullable;

/**
 * Resource Type definition for AWS::EC2::SubnetNetworkAclAssociation
 * 
 */
@ResourceType(type="aws-native:ec2:SubnetNetworkAclAssociation")
public class SubnetNetworkAclAssociation extends io.pulumi.resources.CustomResource {
    @OutputExport(name="associationId", type=String.class, parameters={})
    private Output<String> associationId;

    public Output<String> getAssociationId() {
        return this.associationId;
    }
    /**
     * The ID of the network ACL
     * 
     */
    @OutputExport(name="networkAclId", type=String.class, parameters={})
    private Output<String> networkAclId;

    /**
     * @return The ID of the network ACL
     * 
     */
    public Output<String> getNetworkAclId() {
        return this.networkAclId;
    }
    /**
     * The ID of the subnet
     * 
     */
    @OutputExport(name="subnetId", type=String.class, parameters={})
    private Output<String> subnetId;

    /**
     * @return The ID of the subnet
     * 
     */
    public Output<String> getSubnetId() {
        return this.subnetId;
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public SubnetNetworkAclAssociation(String name, SubnetNetworkAclAssociationArgs args, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("aws-native:ec2:SubnetNetworkAclAssociation", name, args == null ? SubnetNetworkAclAssociationArgs.Empty : args, makeResourceOptions(options, Input.empty()));
    }

    private SubnetNetworkAclAssociation(String name, Input<String> id, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("aws-native:ec2:SubnetNetworkAclAssociation", name, null, makeResourceOptions(options, id));
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
    public static SubnetNetworkAclAssociation get(String name, Input<String> id, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        return new SubnetNetworkAclAssociation(name, id, options);
    }
}
