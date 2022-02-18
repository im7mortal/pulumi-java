// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.compute;

import io.pulumi.core.Input;
import io.pulumi.core.Output;
import io.pulumi.core.internal.annotations.OutputExport;
import io.pulumi.core.internal.annotations.ResourceType;
import io.pulumi.gcp.Utilities;
import io.pulumi.gcp.compute.ProjectMetadataItemArgs;
import io.pulumi.gcp.compute.inputs.ProjectMetadataItemState;
import java.lang.String;
import javax.annotation.Nullable;

/**
 * Manages a single key/value pair on metadata common to all instances for
 * a project in GCE. Using `gcp.compute.ProjectMetadataItem` lets you
 * manage a single key/value setting in the provider rather than the entire
 * project metadata map.
 * 
 * ## Example Usage
 * 
 * ## Import
 * 
 * Project metadata items can be imported using the `key`, e.g.
 * 
 * ```sh
 *  $ pulumi import gcp:compute/projectMetadataItem:ProjectMetadataItem default my_metadata
 * ```
 * 
 */
@ResourceType(type="gcp:compute/projectMetadataItem:ProjectMetadataItem")
public class ProjectMetadataItem extends io.pulumi.resources.CustomResource {
    /**
     * The metadata key to set.
     * 
     */
    @OutputExport(name="key", type=String.class, parameters={})
    private Output<String> key;

    /**
     * @return The metadata key to set.
     * 
     */
    public Output<String> getKey() {
        return this.key;
    }
    /**
     * The ID of the project in which the resource belongs. If it
     * is not provided, the provider project is used.
     * 
     */
    @OutputExport(name="project", type=String.class, parameters={})
    private Output<String> project;

    /**
     * @return The ID of the project in which the resource belongs. If it
     * is not provided, the provider project is used.
     * 
     */
    public Output<String> getProject() {
        return this.project;
    }
    /**
     * The value to set for the given metadata key.
     * 
     */
    @OutputExport(name="value", type=String.class, parameters={})
    private Output<String> value;

    /**
     * @return The value to set for the given metadata key.
     * 
     */
    public Output<String> getValue() {
        return this.value;
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public ProjectMetadataItem(String name, ProjectMetadataItemArgs args, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("gcp:compute/projectMetadataItem:ProjectMetadataItem", name, args == null ? ProjectMetadataItemArgs.Empty : args, makeResourceOptions(options, Input.empty()));
    }

    private ProjectMetadataItem(String name, Input<String> id, @Nullable ProjectMetadataItemState state, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("gcp:compute/projectMetadataItem:ProjectMetadataItem", name, state, makeResourceOptions(options, id));
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
    public static ProjectMetadataItem get(String name, Input<String> id, @Nullable ProjectMetadataItemState state, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        return new ProjectMetadataItem(name, id, state, options);
    }
}