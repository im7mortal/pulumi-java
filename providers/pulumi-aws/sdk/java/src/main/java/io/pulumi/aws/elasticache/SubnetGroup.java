// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.elasticache;

import io.pulumi.aws.Utilities;
import io.pulumi.aws.elasticache.SubnetGroupArgs;
import io.pulumi.aws.elasticache.inputs.SubnetGroupState;
import io.pulumi.core.Input;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.OutputExport;
import io.pulumi.core.annotations.ResourceType;
import java.lang.String;
import java.util.List;
import java.util.Map;
import javax.annotation.Nullable;

/**
 * Provides an ElastiCache Subnet Group resource.
 * 
 * > **NOTE:** ElastiCache Subnet Groups are only for use when working with an
 * ElastiCache cluster **inside** of a VPC. If you are on EC2 Classic, see the
 * ElastiCache Security Group resource.
 * 
 * ## Example Usage
 * 
 * ## Import
 * 
 * ElastiCache Subnet Groups can be imported using the `name`, e.g.,
 * 
 * ```sh
 *  $ pulumi import aws:elasticache/subnetGroup:SubnetGroup bar tf-test-cache-subnet
 * ```
 * 
 */
@ResourceType(type="aws:elasticache/subnetGroup:SubnetGroup")
public class SubnetGroup extends io.pulumi.resources.CustomResource {
    @OutputExport(name="arn", type=String.class, parameters={})
    private Output<String> arn;

    public Output<String> getArn() {
        return this.arn;
    }
    /**
     * Description for the cache subnet group. Defaults to "Managed by Pulumi".
     * 
     */
    @OutputExport(name="description", type=String.class, parameters={})
    private Output<String> description;

    /**
     * @return Description for the cache subnet group. Defaults to "Managed by Pulumi".
     * 
     */
    public Output<String> getDescription() {
        return this.description;
    }
    /**
     * Name for the cache subnet group. Elasticache converts this name to lowercase.
     * 
     */
    @OutputExport(name="name", type=String.class, parameters={})
    private Output<String> name;

    /**
     * @return Name for the cache subnet group. Elasticache converts this name to lowercase.
     * 
     */
    public Output<String> getName() {
        return this.name;
    }
    /**
     * List of VPC Subnet IDs for the cache subnet group
     * 
     */
    @OutputExport(name="subnetIds", type=List.class, parameters={String.class})
    private Output<List<String>> subnetIds;

    /**
     * @return List of VPC Subnet IDs for the cache subnet group
     * 
     */
    public Output<List<String>> getSubnetIds() {
        return this.subnetIds;
    }
    /**
     * Key-value map of resource tags. .If configured with a provider `default_tags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
     * 
     */
    @OutputExport(name="tags", type=Map.class, parameters={String.class, String.class})
    private Output</* @Nullable */ Map<String,String>> tags;

    /**
     * @return Key-value map of resource tags. .If configured with a provider `default_tags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
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

    public interface BuilderApplicator {
        public void apply(SubnetGroupArgs.Builder a);
    }
    private static io.pulumi.aws.elasticache.SubnetGroupArgs buildArgs(BuilderApplicator argsBuilder) {
        final var builder = io.pulumi.aws.elasticache.SubnetGroupArgs.builder();
        argsBuilder.apply(builder);
        return builder.build();
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param argsBuilder A function that configures a passed builder.
     */
    public SubnetGroup(String name, BuilderApplicator argsBuilder) {
        this(name, buildArgs(argsBuilder), null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public SubnetGroup(String name) {
        this(name, SubnetGroupArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public SubnetGroup(String name, SubnetGroupArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public SubnetGroup(String name, SubnetGroupArgs args, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("aws:elasticache/subnetGroup:SubnetGroup", name, args == null ? SubnetGroupArgs.Empty : args, makeResourceOptions(options, Input.empty()));
    }

    private SubnetGroup(String name, Input<String> id, @Nullable SubnetGroupState state, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("aws:elasticache/subnetGroup:SubnetGroup", name, state, makeResourceOptions(options, id));
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
    public static SubnetGroup get(String name, Input<String> id, @Nullable SubnetGroupState state, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        return new SubnetGroup(name, id, state, options);
    }
}
