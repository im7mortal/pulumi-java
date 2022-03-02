// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.apigateway;

import io.pulumi.awsnative.Utilities;
import io.pulumi.awsnative.apigateway.DocumentationVersionArgs;
import io.pulumi.core.Input;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.OutputExport;
import io.pulumi.core.annotations.ResourceType;
import java.lang.String;
import javax.annotation.Nullable;

/**
 * A snapshot of the documentation of an API.
 * 
 */
@ResourceType(type="aws-native:apigateway:DocumentationVersion")
public class DocumentationVersion extends io.pulumi.resources.CustomResource {
    /**
     * The description of the API documentation snapshot.
     * 
     */
    @OutputExport(name="description", type=String.class, parameters={})
    private Output</* @Nullable */ String> description;

    /**
     * @return The description of the API documentation snapshot.
     * 
     */
    public Output</* @Nullable */ String> getDescription() {
        return this.description;
    }
    /**
     * The version identifier of the API documentation snapshot.
     * 
     */
    @OutputExport(name="documentationVersion", type=String.class, parameters={})
    private Output<String> documentationVersion;

    /**
     * @return The version identifier of the API documentation snapshot.
     * 
     */
    public Output<String> getDocumentationVersion() {
        return this.documentationVersion;
    }
    /**
     * The identifier of the API.
     * 
     */
    @OutputExport(name="restApiId", type=String.class, parameters={})
    private Output<String> restApiId;

    /**
     * @return The identifier of the API.
     * 
     */
    public Output<String> getRestApiId() {
        return this.restApiId;
    }

    public interface BuilderApplicator {
        public void apply(DocumentationVersionArgs.Builder a);
    }
    private static io.pulumi.awsnative.apigateway.DocumentationVersionArgs buildArgs(BuilderApplicator argsBuilder) {
        final var builder = io.pulumi.awsnative.apigateway.DocumentationVersionArgs.builder();
        argsBuilder.apply(builder);
        return builder.build();
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param argsBuilder A function that configures a passed builder.
     */
    public DocumentationVersion(String name, BuilderApplicator argsBuilder) {
        this(name, buildArgs(argsBuilder), null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public DocumentationVersion(String name) {
        this(name, DocumentationVersionArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public DocumentationVersion(String name, DocumentationVersionArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public DocumentationVersion(String name, DocumentationVersionArgs args, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("aws-native:apigateway:DocumentationVersion", name, args == null ? DocumentationVersionArgs.Empty : args, makeResourceOptions(options, Input.empty()));
    }

    private DocumentationVersion(String name, Input<String> id, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("aws-native:apigateway:DocumentationVersion", name, null, makeResourceOptions(options, id));
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
    public static DocumentationVersion get(String name, Input<String> id, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        return new DocumentationVersion(name, id, options);
    }
}
