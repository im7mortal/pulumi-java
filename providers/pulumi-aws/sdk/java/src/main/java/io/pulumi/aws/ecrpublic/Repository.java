// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.ecrpublic;

import io.pulumi.aws.Utilities;
import io.pulumi.aws.ecrpublic.RepositoryArgs;
import io.pulumi.aws.ecrpublic.inputs.RepositoryState;
import io.pulumi.aws.ecrpublic.outputs.RepositoryCatalogData;
import io.pulumi.core.Input;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.OutputExport;
import io.pulumi.core.annotations.ResourceType;
import java.lang.Boolean;
import java.lang.String;
import javax.annotation.Nullable;

/**
 * Provides a Public Elastic Container Registry Repository.
 * 
 * > **NOTE:** This resource can only be used with `us-east-1` region.
 * 
 * ## Example Usage
 * 
 * ## Import
 * 
 * ECR Public Repositories can be imported using the `repository_name`, e.g.,
 * 
 * ```sh
 *  $ pulumi import aws:ecrpublic/repository:Repository example example
 * ```
 * 
 */
@ResourceType(type="aws:ecrpublic/repository:Repository")
public class Repository extends io.pulumi.resources.CustomResource {
    /**
     * Full ARN of the repository.
     * 
     */
    @OutputExport(name="arn", type=String.class, parameters={})
    private Output<String> arn;

    /**
     * @return Full ARN of the repository.
     * 
     */
    public Output<String> getArn() {
        return this.arn;
    }
    /**
     * Catalog data configuration for the repository. See below for schema.
     * 
     */
    @OutputExport(name="catalogData", type=RepositoryCatalogData.class, parameters={})
    private Output</* @Nullable */ RepositoryCatalogData> catalogData;

    /**
     * @return Catalog data configuration for the repository. See below for schema.
     * 
     */
    public Output</* @Nullable */ RepositoryCatalogData> getCatalogData() {
        return this.catalogData;
    }
    @OutputExport(name="forceDestroy", type=Boolean.class, parameters={})
    private Output</* @Nullable */ Boolean> forceDestroy;

    public Output</* @Nullable */ Boolean> getForceDestroy() {
        return this.forceDestroy;
    }
    /**
     * The registry ID where the repository was created.
     * 
     */
    @OutputExport(name="registryId", type=String.class, parameters={})
    private Output<String> registryId;

    /**
     * @return The registry ID where the repository was created.
     * 
     */
    public Output<String> getRegistryId() {
        return this.registryId;
    }
    /**
     * Name of the repository.
     * 
     */
    @OutputExport(name="repositoryName", type=String.class, parameters={})
    private Output<String> repositoryName;

    /**
     * @return Name of the repository.
     * 
     */
    public Output<String> getRepositoryName() {
        return this.repositoryName;
    }
    /**
     * The URI of the repository.
     * 
     */
    @OutputExport(name="repositoryUri", type=String.class, parameters={})
    private Output<String> repositoryUri;

    /**
     * @return The URI of the repository.
     * 
     */
    public Output<String> getRepositoryUri() {
        return this.repositoryUri;
    }

    public interface BuilderApplicator {
        public void apply(RepositoryArgs.Builder a);
    }
    private static io.pulumi.aws.ecrpublic.RepositoryArgs buildArgs(BuilderApplicator argsBuilder) {
        final var builder = io.pulumi.aws.ecrpublic.RepositoryArgs.builder();
        argsBuilder.apply(builder);
        return builder.build();
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param argsBuilder A function that configures a passed builder.
     */
    public Repository(String name, BuilderApplicator argsBuilder) {
        this(name, buildArgs(argsBuilder), null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public Repository(String name) {
        this(name, RepositoryArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public Repository(String name, RepositoryArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public Repository(String name, RepositoryArgs args, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("aws:ecrpublic/repository:Repository", name, args == null ? RepositoryArgs.Empty : args, makeResourceOptions(options, Input.empty()));
    }

    private Repository(String name, Input<String> id, @Nullable RepositoryState state, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("aws:ecrpublic/repository:Repository", name, state, makeResourceOptions(options, id));
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
    public static Repository get(String name, Input<String> id, @Nullable RepositoryState state, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        return new Repository(name, id, state, options);
    }
}
