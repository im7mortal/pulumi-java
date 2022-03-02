// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.appsync;

import io.pulumi.aws.Utilities;
import io.pulumi.aws.appsync.ResolverArgs;
import io.pulumi.aws.appsync.inputs.ResolverState;
import io.pulumi.aws.appsync.outputs.ResolverCachingConfig;
import io.pulumi.aws.appsync.outputs.ResolverPipelineConfig;
import io.pulumi.aws.appsync.outputs.ResolverSyncConfig;
import io.pulumi.core.Input;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.OutputExport;
import io.pulumi.core.annotations.ResourceType;
import java.lang.Integer;
import java.lang.String;
import javax.annotation.Nullable;

/**
 * Provides an AppSync Resolver.
 * 
 * ## Example Usage
 * 
 * ## Import
 * 
 * `aws_appsync_resolver` can be imported with their `api_id`, a hyphen, `type`, a hypen and `field` e.g.,
 * 
 * ```sh
 *  $ pulumi import aws:appsync/resolver:Resolver example abcdef123456-exampleType-exampleField
 * ```
 * 
 */
@ResourceType(type="aws:appsync/resolver:Resolver")
public class Resolver extends io.pulumi.resources.CustomResource {
    /**
     * The API ID for the GraphQL API.
     * 
     */
    @OutputExport(name="apiId", type=String.class, parameters={})
    private Output<String> apiId;

    /**
     * @return The API ID for the GraphQL API.
     * 
     */
    public Output<String> getApiId() {
        return this.apiId;
    }
    /**
     * The ARN
     * 
     */
    @OutputExport(name="arn", type=String.class, parameters={})
    private Output<String> arn;

    /**
     * @return The ARN
     * 
     */
    public Output<String> getArn() {
        return this.arn;
    }
    /**
     * The CachingConfig.
     * 
     */
    @OutputExport(name="cachingConfig", type=ResolverCachingConfig.class, parameters={})
    private Output</* @Nullable */ ResolverCachingConfig> cachingConfig;

    /**
     * @return The CachingConfig.
     * 
     */
    public Output</* @Nullable */ ResolverCachingConfig> getCachingConfig() {
        return this.cachingConfig;
    }
    /**
     * The DataSource name.
     * 
     */
    @OutputExport(name="dataSource", type=String.class, parameters={})
    private Output</* @Nullable */ String> dataSource;

    /**
     * @return The DataSource name.
     * 
     */
    public Output</* @Nullable */ String> getDataSource() {
        return this.dataSource;
    }
    /**
     * The field name from the schema defined in the GraphQL API.
     * 
     */
    @OutputExport(name="field", type=String.class, parameters={})
    private Output<String> field;

    /**
     * @return The field name from the schema defined in the GraphQL API.
     * 
     */
    public Output<String> getField() {
        return this.field;
    }
    /**
     * The resolver type. Valid values are `UNIT` and `PIPELINE`.
     * 
     */
    @OutputExport(name="kind", type=String.class, parameters={})
    private Output</* @Nullable */ String> kind;

    /**
     * @return The resolver type. Valid values are `UNIT` and `PIPELINE`.
     * 
     */
    public Output</* @Nullable */ String> getKind() {
        return this.kind;
    }
    /**
     * The maximum batching size for a resolver. Valid values are between `0` and `2000`.
     * 
     */
    @OutputExport(name="maxBatchSize", type=Integer.class, parameters={})
    private Output</* @Nullable */ Integer> maxBatchSize;

    /**
     * @return The maximum batching size for a resolver. Valid values are between `0` and `2000`.
     * 
     */
    public Output</* @Nullable */ Integer> getMaxBatchSize() {
        return this.maxBatchSize;
    }
    /**
     * The PipelineConfig.
     * 
     */
    @OutputExport(name="pipelineConfig", type=ResolverPipelineConfig.class, parameters={})
    private Output</* @Nullable */ ResolverPipelineConfig> pipelineConfig;

    /**
     * @return The PipelineConfig.
     * 
     */
    public Output</* @Nullable */ ResolverPipelineConfig> getPipelineConfig() {
        return this.pipelineConfig;
    }
    /**
     * The request mapping template for UNIT resolver or 'before mapping template' for PIPELINE resolver. Required for non-Lambda resolvers.
     * 
     */
    @OutputExport(name="requestTemplate", type=String.class, parameters={})
    private Output</* @Nullable */ String> requestTemplate;

    /**
     * @return The request mapping template for UNIT resolver or 'before mapping template' for PIPELINE resolver. Required for non-Lambda resolvers.
     * 
     */
    public Output</* @Nullable */ String> getRequestTemplate() {
        return this.requestTemplate;
    }
    /**
     * The response mapping template for UNIT resolver or 'after mapping template' for PIPELINE resolver. Required for non-Lambda resolvers.
     * 
     */
    @OutputExport(name="responseTemplate", type=String.class, parameters={})
    private Output</* @Nullable */ String> responseTemplate;

    /**
     * @return The response mapping template for UNIT resolver or 'after mapping template' for PIPELINE resolver. Required for non-Lambda resolvers.
     * 
     */
    public Output</* @Nullable */ String> getResponseTemplate() {
        return this.responseTemplate;
    }
    /**
     * Describes a Sync configuration for a resolver. See Sync Config.
     * 
     */
    @OutputExport(name="syncConfig", type=ResolverSyncConfig.class, parameters={})
    private Output</* @Nullable */ ResolverSyncConfig> syncConfig;

    /**
     * @return Describes a Sync configuration for a resolver. See Sync Config.
     * 
     */
    public Output</* @Nullable */ ResolverSyncConfig> getSyncConfig() {
        return this.syncConfig;
    }
    /**
     * The type name from the schema defined in the GraphQL API.
     * 
     */
    @OutputExport(name="type", type=String.class, parameters={})
    private Output<String> type;

    /**
     * @return The type name from the schema defined in the GraphQL API.
     * 
     */
    public Output<String> getType() {
        return this.type;
    }

    public interface BuilderApplicator {
        public void apply(ResolverArgs.Builder a);
    }
    private static io.pulumi.aws.appsync.ResolverArgs buildArgs(BuilderApplicator argsBuilder) {
        final var builder = io.pulumi.aws.appsync.ResolverArgs.builder();
        argsBuilder.apply(builder);
        return builder.build();
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param argsBuilder A function that configures a passed builder.
     */
    public Resolver(String name, BuilderApplicator argsBuilder) {
        this(name, buildArgs(argsBuilder), null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public Resolver(String name) {
        this(name, ResolverArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public Resolver(String name, ResolverArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public Resolver(String name, ResolverArgs args, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("aws:appsync/resolver:Resolver", name, args == null ? ResolverArgs.Empty : args, makeResourceOptions(options, Input.empty()));
    }

    private Resolver(String name, Input<String> id, @Nullable ResolverState state, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("aws:appsync/resolver:Resolver", name, state, makeResourceOptions(options, id));
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
    public static Resolver get(String name, Input<String> id, @Nullable ResolverState state, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        return new Resolver(name, id, state, options);
    }
}
