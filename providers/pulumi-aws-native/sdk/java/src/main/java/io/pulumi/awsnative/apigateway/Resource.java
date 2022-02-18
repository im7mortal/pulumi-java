// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.apigateway;

import io.pulumi.awsnative.Utilities;
import io.pulumi.awsnative.apigateway.ResourceArgs;
import io.pulumi.core.Input;
import io.pulumi.core.Output;
import io.pulumi.core.internal.annotations.OutputExport;
import io.pulumi.core.internal.annotations.ResourceType;
import java.lang.String;
import javax.annotation.Nullable;

/**
 * Resource Type definition for AWS::ApiGateway::Resource
 * 
 */
@ResourceType(type="aws-native:apigateway:Resource")
public class Resource extends io.pulumi.resources.CustomResource {
    /**
     * The parent resource's identifier.
     * 
     */
    @OutputExport(name="parentId", type=String.class, parameters={})
    private Output<String> parentId;

    /**
     * @return The parent resource's identifier.
     * 
     */
    public Output<String> getParentId() {
        return this.parentId;
    }
    /**
     * The last path segment for this resource.
     * 
     */
    @OutputExport(name="pathPart", type=String.class, parameters={})
    private Output<String> pathPart;

    /**
     * @return The last path segment for this resource.
     * 
     */
    public Output<String> getPathPart() {
        return this.pathPart;
    }
    /**
     * A unique primary identifier for a Resource
     * 
     */
    @OutputExport(name="resourceId", type=String.class, parameters={})
    private Output<String> resourceId;

    /**
     * @return A unique primary identifier for a Resource
     * 
     */
    public Output<String> getResourceId() {
        return this.resourceId;
    }
    /**
     * The ID of the RestApi resource in which you want to create this resource..
     * 
     */
    @OutputExport(name="restApiId", type=String.class, parameters={})
    private Output<String> restApiId;

    /**
     * @return The ID of the RestApi resource in which you want to create this resource..
     * 
     */
    public Output<String> getRestApiId() {
        return this.restApiId;
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public Resource(String name, ResourceArgs args, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("aws-native:apigateway:Resource", name, args == null ? ResourceArgs.Empty : args, makeResourceOptions(options, Input.empty()));
    }

    private Resource(String name, Input<String> id, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("aws-native:apigateway:Resource", name, null, makeResourceOptions(options, id));
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
    public static Resource get(String name, Input<String> id, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        return new Resource(name, id, options);
    }
}
