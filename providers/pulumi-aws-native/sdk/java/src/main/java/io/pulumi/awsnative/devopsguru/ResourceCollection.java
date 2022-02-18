// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.devopsguru;

import io.pulumi.awsnative.Utilities;
import io.pulumi.awsnative.devopsguru.ResourceCollectionArgs;
import io.pulumi.awsnative.devopsguru.enums.ResourceCollectionType;
import io.pulumi.awsnative.devopsguru.outputs.ResourceCollectionFilter;
import io.pulumi.core.Input;
import io.pulumi.core.Output;
import io.pulumi.core.internal.annotations.OutputExport;
import io.pulumi.core.internal.annotations.ResourceType;
import javax.annotation.Nullable;

/**
 * This resource schema represents the ResourceCollection resource in the Amazon DevOps Guru.
 * 
 * ## Example Usage
 * 
 */
@ResourceType(type="aws-native:devopsguru:ResourceCollection")
public class ResourceCollection extends io.pulumi.resources.CustomResource {
    @OutputExport(name="resourceCollectionFilter", type=ResourceCollectionFilter.class, parameters={})
    private Output<ResourceCollectionFilter> resourceCollectionFilter;

    public Output<ResourceCollectionFilter> getResourceCollectionFilter() {
        return this.resourceCollectionFilter;
    }
    /**
     * The type of ResourceCollection
     * 
     */
    @OutputExport(name="resourceCollectionType", type=ResourceCollectionType.class, parameters={})
    private Output<ResourceCollectionType> resourceCollectionType;

    /**
     * @return The type of ResourceCollection
     * 
     */
    public Output<ResourceCollectionType> getResourceCollectionType() {
        return this.resourceCollectionType;
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public ResourceCollection(String name, ResourceCollectionArgs args, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("aws-native:devopsguru:ResourceCollection", name, args == null ? ResourceCollectionArgs.Empty : args, makeResourceOptions(options, Input.empty()));
    }

    private ResourceCollection(String name, Input<String> id, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("aws-native:devopsguru:ResourceCollection", name, null, makeResourceOptions(options, id));
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
    public static ResourceCollection get(String name, Input<String> id, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        return new ResourceCollection(name, id, options);
    }
}
