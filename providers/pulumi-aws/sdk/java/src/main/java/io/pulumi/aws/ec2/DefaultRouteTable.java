// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.ec2;

import io.pulumi.aws.Utilities;
import io.pulumi.aws.ec2.DefaultRouteTableArgs;
import io.pulumi.aws.ec2.inputs.DefaultRouteTableState;
import io.pulumi.aws.ec2.outputs.DefaultRouteTableRoute;
import io.pulumi.core.Input;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.OutputExport;
import io.pulumi.core.annotations.ResourceType;
import java.lang.String;
import java.util.List;
import java.util.Map;
import javax.annotation.Nullable;

/**
 * Provides a resource to manage a default route table of a VPC. This resource can manage the default route table of the default or a non-default VPC.
 * 
 * > **NOTE:** This is an advanced resource with special caveats. Please read this document in its entirety before using this resource. The `aws.ec2.DefaultRouteTable` resource behaves differently from normal resources. This provider does not _create_ this resource but instead attempts to "adopt" it into management. **Do not** use both `aws.ec2.DefaultRouteTable` to manage a default route table **and** `aws.ec2.MainRouteTableAssociation` with the same VPC due to possible route conflicts. See aws.ec2.MainRouteTableAssociation documentation for more details.
 * 
 * Every VPC has a default route table that can be managed but not destroyed. When the provider first adopts a default route table, it **immediately removes all defined routes**. It then proceeds to create any routes specified in the configuration. This step is required so that only the routes specified in the configuration exist in the default route table.
 * 
 * For more information, see the Amazon VPC User Guide on [Route Tables](https://docs.aws.amazon.com/vpc/latest/userguide/VPC_Route_Tables.html). For information about managing normal route tables in this provider, see `aws.ec2.RouteTable`.
 * 
 * ## Example Usage
 * 
 * ## Import
 * 
 * Default VPC route tables can be imported using the `vpc_id`, e.g.,
 * 
 * ```sh
 *  $ pulumi import aws:ec2/defaultRouteTable:DefaultRouteTable example vpc-33cc44dd
 * ```
 * 
 *  [aws-route-tables]http://docs.aws.amazon.com/AmazonVPC/latest/UserGuide/VPC_Route_Tables.html#Route_Replacing_Main_Table [tf-route-tables]/docs/providers/aws/r/route_table.html [tf-main-route-table-association]/docs/providers/aws/r/main_route_table_association.html
 * 
 */
@ResourceType(type="aws:ec2/defaultRouteTable:DefaultRouteTable")
public class DefaultRouteTable extends io.pulumi.resources.CustomResource {
    /**
     * The ARN of the route table.
     * 
     */
    @OutputExport(name="arn", type=String.class, parameters={})
    private Output<String> arn;

    /**
     * @return The ARN of the route table.
     * 
     */
    public Output<String> getArn() {
        return this.arn;
    }
    /**
     * ID of the default route table.
     * 
     */
    @OutputExport(name="defaultRouteTableId", type=String.class, parameters={})
    private Output<String> defaultRouteTableId;

    /**
     * @return ID of the default route table.
     * 
     */
    public Output<String> getDefaultRouteTableId() {
        return this.defaultRouteTableId;
    }
    /**
     * ID of the AWS account that owns the route table.
     * 
     */
    @OutputExport(name="ownerId", type=String.class, parameters={})
    private Output<String> ownerId;

    /**
     * @return ID of the AWS account that owns the route table.
     * 
     */
    public Output<String> getOwnerId() {
        return this.ownerId;
    }
    /**
     * List of virtual gateways for propagation.
     * 
     */
    @OutputExport(name="propagatingVgws", type=List.class, parameters={String.class})
    private Output</* @Nullable */ List<String>> propagatingVgws;

    /**
     * @return List of virtual gateways for propagation.
     * 
     */
    public Output</* @Nullable */ List<String>> getPropagatingVgws() {
        return this.propagatingVgws;
    }
    /**
     * Set of objects. Detailed below
     * 
     */
    @OutputExport(name="routes", type=List.class, parameters={DefaultRouteTableRoute.class})
    private Output<List<DefaultRouteTableRoute>> routes;

    /**
     * @return Set of objects. Detailed below
     * 
     */
    public Output<List<DefaultRouteTableRoute>> getRoutes() {
        return this.routes;
    }
    /**
     * Map of tags to assign to the resource. If configured with a provider `default_tags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
     * 
     */
    @OutputExport(name="tags", type=Map.class, parameters={String.class, String.class})
    private Output</* @Nullable */ Map<String,String>> tags;

    /**
     * @return Map of tags to assign to the resource. If configured with a provider `default_tags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
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
     * ID of the VPC.
     * 
     */
    @OutputExport(name="vpcId", type=String.class, parameters={})
    private Output<String> vpcId;

    /**
     * @return ID of the VPC.
     * 
     */
    public Output<String> getVpcId() {
        return this.vpcId;
    }

    public interface BuilderApplicator {
        public void apply(DefaultRouteTableArgs.Builder a);
    }
    private static io.pulumi.aws.ec2.DefaultRouteTableArgs buildArgs(BuilderApplicator argsBuilder) {
        final var builder = io.pulumi.aws.ec2.DefaultRouteTableArgs.builder();
        argsBuilder.apply(builder);
        return builder.build();
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param argsBuilder A function that configures a passed builder.
     */
    public DefaultRouteTable(String name, BuilderApplicator argsBuilder) {
        this(name, buildArgs(argsBuilder), null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public DefaultRouteTable(String name) {
        this(name, DefaultRouteTableArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public DefaultRouteTable(String name, DefaultRouteTableArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public DefaultRouteTable(String name, DefaultRouteTableArgs args, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("aws:ec2/defaultRouteTable:DefaultRouteTable", name, args == null ? DefaultRouteTableArgs.Empty : args, makeResourceOptions(options, Input.empty()));
    }

    private DefaultRouteTable(String name, Input<String> id, @Nullable DefaultRouteTableState state, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("aws:ec2/defaultRouteTable:DefaultRouteTable", name, state, makeResourceOptions(options, id));
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
    public static DefaultRouteTable get(String name, Input<String> id, @Nullable DefaultRouteTableState state, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        return new DefaultRouteTable(name, id, state, options);
    }
}
