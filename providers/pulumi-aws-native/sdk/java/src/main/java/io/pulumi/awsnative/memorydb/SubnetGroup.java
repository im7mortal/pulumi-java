// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.memorydb;

import io.pulumi.awsnative.Utilities;
import io.pulumi.awsnative.memorydb.SubnetGroupArgs;
import io.pulumi.awsnative.memorydb.outputs.SubnetGroupTag;
import io.pulumi.core.Input;
import io.pulumi.core.Output;
import io.pulumi.core.internal.annotations.OutputExport;
import io.pulumi.core.internal.annotations.ResourceType;
import java.lang.String;
import java.util.List;
import javax.annotation.Nullable;

/**
 * The AWS::MemoryDB::SubnetGroup resource creates an Amazon MemoryDB Subnet Group.
 * 
 */
@ResourceType(type="aws-native:memorydb:SubnetGroup")
public class SubnetGroup extends io.pulumi.resources.CustomResource {
    /**
     * The Amazon Resource Name (ARN) of the subnet group.
     * 
     */
    @OutputExport(name="aRN", type=String.class, parameters={})
    private Output<String> aRN;

    /**
     * @return The Amazon Resource Name (ARN) of the subnet group.
     * 
     */
    public Output<String> getARN() {
        return this.aRN;
    }
    /**
     * An optional description of the subnet group.
     * 
     */
    @OutputExport(name="description", type=String.class, parameters={})
    private Output</* @Nullable */ String> description;

    /**
     * @return An optional description of the subnet group.
     * 
     */
    public Output</* @Nullable */ String> getDescription() {
        return this.description;
    }
    /**
     * The name of the subnet group. This value must be unique as it also serves as the subnet group identifier.
     * 
     */
    @OutputExport(name="subnetGroupName", type=String.class, parameters={})
    private Output<String> subnetGroupName;

    /**
     * @return The name of the subnet group. This value must be unique as it also serves as the subnet group identifier.
     * 
     */
    public Output<String> getSubnetGroupName() {
        return this.subnetGroupName;
    }
    /**
     * A list of VPC subnet IDs for the subnet group.
     * 
     */
    @OutputExport(name="subnetIds", type=List.class, parameters={String.class})
    private Output<List<String>> subnetIds;

    /**
     * @return A list of VPC subnet IDs for the subnet group.
     * 
     */
    public Output<List<String>> getSubnetIds() {
        return this.subnetIds;
    }
    /**
     * An array of key-value pairs to apply to this subnet group.
     * 
     */
    @OutputExport(name="tags", type=List.class, parameters={SubnetGroupTag.class})
    private Output</* @Nullable */ List<SubnetGroupTag>> tags;

    /**
     * @return An array of key-value pairs to apply to this subnet group.
     * 
     */
    public Output</* @Nullable */ List<SubnetGroupTag>> getTags() {
        return this.tags;
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public SubnetGroup(String name, SubnetGroupArgs args, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("aws-native:memorydb:SubnetGroup", name, args == null ? SubnetGroupArgs.Empty : args, makeResourceOptions(options, Input.empty()));
    }

    private SubnetGroup(String name, Input<String> id, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("aws-native:memorydb:SubnetGroup", name, null, makeResourceOptions(options, id));
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
    public static SubnetGroup get(String name, Input<String> id, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        return new SubnetGroup(name, id, options);
    }
}
