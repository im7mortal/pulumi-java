// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.ec2;

import io.pulumi.awsnative.Utilities;
import io.pulumi.awsnative.ec2.RouteTableArgs;
import io.pulumi.awsnative.ec2.outputs.RouteTableTag;
import io.pulumi.core.Input;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.OutputExport;
import io.pulumi.core.annotations.ResourceType;
import java.lang.String;
import java.util.List;
import javax.annotation.Nullable;

/**
 * Resource Type definition for AWS::EC2::RouteTable
 * 
 */
@ResourceType(type="aws-native:ec2:RouteTable")
public class RouteTable extends io.pulumi.resources.CustomResource {
    /**
     * The route table ID.
     * 
     */
    @OutputExport(name="routeTableId", type=String.class, parameters={})
    private Output<String> routeTableId;

    /**
     * @return The route table ID.
     * 
     */
    public Output<String> getRouteTableId() {
        return this.routeTableId;
    }
    /**
     * Any tags assigned to the route table.
     * 
     */
    @OutputExport(name="tags", type=List.class, parameters={RouteTableTag.class})
    private Output</* @Nullable */ List<RouteTableTag>> tags;

    /**
     * @return Any tags assigned to the route table.
     * 
     */
    public Output</* @Nullable */ List<RouteTableTag>> getTags() {
        return this.tags;
    }
    /**
     * The ID of the VPC.
     * 
     */
    @OutputExport(name="vpcId", type=String.class, parameters={})
    private Output<String> vpcId;

    /**
     * @return The ID of the VPC.
     * 
     */
    public Output<String> getVpcId() {
        return this.vpcId;
    }

    public interface BuilderApplicator {
        public void apply(RouteTableArgs.Builder a);
    }
    private static io.pulumi.awsnative.ec2.RouteTableArgs buildArgs(BuilderApplicator argsBuilder) {
        final var builder = io.pulumi.awsnative.ec2.RouteTableArgs.builder();
        argsBuilder.apply(builder);
        return builder.build();
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param argsBuilder A function that configures a passed builder.
     */
    public RouteTable(String name, BuilderApplicator argsBuilder) {
        this(name, buildArgs(argsBuilder), null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public RouteTable(String name) {
        this(name, RouteTableArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public RouteTable(String name, RouteTableArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public RouteTable(String name, RouteTableArgs args, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("aws-native:ec2:RouteTable", name, args == null ? RouteTableArgs.Empty : args, makeResourceOptions(options, Input.empty()));
    }

    private RouteTable(String name, Input<String> id, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("aws-native:ec2:RouteTable", name, null, makeResourceOptions(options, id));
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
    public static RouteTable get(String name, Input<String> id, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        return new RouteTable(name, id, options);
    }
}
