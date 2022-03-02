// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.appmesh;

import io.pulumi.aws.Utilities;
import io.pulumi.aws.appmesh.MeshArgs;
import io.pulumi.aws.appmesh.inputs.MeshState;
import io.pulumi.aws.appmesh.outputs.MeshSpec;
import io.pulumi.core.Input;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.OutputExport;
import io.pulumi.core.annotations.ResourceType;
import java.lang.String;
import java.util.Map;
import javax.annotation.Nullable;

/**
 * Provides an AWS App Mesh service mesh resource.
 * 
 * ## Example Usage
 * 
 * ## Import
 * 
 * App Mesh service meshes can be imported using the `name`, e.g.,
 * 
 * ```sh
 *  $ pulumi import aws:appmesh/mesh:Mesh simple simpleapp
 * ```
 * 
 */
@ResourceType(type="aws:appmesh/mesh:Mesh")
public class Mesh extends io.pulumi.resources.CustomResource {
    /**
     * The ARN of the service mesh.
     * 
     */
    @OutputExport(name="arn", type=String.class, parameters={})
    private Output<String> arn;

    /**
     * @return The ARN of the service mesh.
     * 
     */
    public Output<String> getArn() {
        return this.arn;
    }
    /**
     * The creation date of the service mesh.
     * 
     */
    @OutputExport(name="createdDate", type=String.class, parameters={})
    private Output<String> createdDate;

    /**
     * @return The creation date of the service mesh.
     * 
     */
    public Output<String> getCreatedDate() {
        return this.createdDate;
    }
    /**
     * The last update date of the service mesh.
     * 
     */
    @OutputExport(name="lastUpdatedDate", type=String.class, parameters={})
    private Output<String> lastUpdatedDate;

    /**
     * @return The last update date of the service mesh.
     * 
     */
    public Output<String> getLastUpdatedDate() {
        return this.lastUpdatedDate;
    }
    /**
     * The AWS account ID of the service mesh's owner.
     * 
     */
    @OutputExport(name="meshOwner", type=String.class, parameters={})
    private Output<String> meshOwner;

    /**
     * @return The AWS account ID of the service mesh's owner.
     * 
     */
    public Output<String> getMeshOwner() {
        return this.meshOwner;
    }
    /**
     * The name to use for the service mesh. Must be between 1 and 255 characters in length.
     * 
     */
    @OutputExport(name="name", type=String.class, parameters={})
    private Output<String> name;

    /**
     * @return The name to use for the service mesh. Must be between 1 and 255 characters in length.
     * 
     */
    public Output<String> getName() {
        return this.name;
    }
    /**
     * The resource owner's AWS account ID.
     * 
     */
    @OutputExport(name="resourceOwner", type=String.class, parameters={})
    private Output<String> resourceOwner;

    /**
     * @return The resource owner's AWS account ID.
     * 
     */
    public Output<String> getResourceOwner() {
        return this.resourceOwner;
    }
    /**
     * The service mesh specification to apply.
     * 
     */
    @OutputExport(name="spec", type=MeshSpec.class, parameters={})
    private Output</* @Nullable */ MeshSpec> spec;

    /**
     * @return The service mesh specification to apply.
     * 
     */
    public Output</* @Nullable */ MeshSpec> getSpec() {
        return this.spec;
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

    public interface BuilderApplicator {
        public void apply(@Nullable MeshArgs.Builder a);
    }
    private static io.pulumi.aws.appmesh.MeshArgs buildArgs(BuilderApplicator argsBuilder) {
        final var builder = io.pulumi.aws.appmesh.MeshArgs.builder();
        argsBuilder.apply(builder);
        return builder.build();
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param argsBuilder A function that configures a passed builder.
     */
    public Mesh(String name, BuilderApplicator argsBuilder) {
        this(name, buildArgs(argsBuilder), null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public Mesh(String name) {
        this(name, MeshArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public Mesh(String name, @Nullable MeshArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public Mesh(String name, @Nullable MeshArgs args, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("aws:appmesh/mesh:Mesh", name, args == null ? MeshArgs.Empty : args, makeResourceOptions(options, Input.empty()));
    }

    private Mesh(String name, Input<String> id, @Nullable MeshState state, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("aws:appmesh/mesh:Mesh", name, state, makeResourceOptions(options, id));
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
    public static Mesh get(String name, Input<String> id, @Nullable MeshState state, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        return new Mesh(name, id, state, options);
    }
}
