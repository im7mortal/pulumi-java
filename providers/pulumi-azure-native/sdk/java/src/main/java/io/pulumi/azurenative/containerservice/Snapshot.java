// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.containerservice;

import io.pulumi.azurenative.Utilities;
import io.pulumi.azurenative.containerservice.SnapshotArgs;
import io.pulumi.azurenative.containerservice.outputs.CreationDataResponse;
import io.pulumi.azurenative.containerservice.outputs.SystemDataResponse;
import io.pulumi.core.Alias;
import io.pulumi.core.Input;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.OutputExport;
import io.pulumi.core.annotations.ResourceType;
import java.lang.String;
import java.util.List;
import java.util.Map;
import javax.annotation.Nullable;

/**
 * A node pool snapshot resource.
 * API Version: 2021-08-01.
 * 
 * ## Example Usage
 * 
 * ## Import
 * 
 * An existing resource can be imported using its type token, name, and identifier, e.g.
 * 
 * ```sh
 * $ pulumi import azure-native:containerservice:Snapshot snapshot1 /subscriptions/subid1/resourcegroups/rg1/providers/Microsoft.ContainerService/snapshots/snapshot1 
 * ```
 * 
 */
@ResourceType(type="azure-native:containerservice:Snapshot")
public class Snapshot extends io.pulumi.resources.CustomResource {
    /**
     * CreationData to be used to specify the source agent pool resource ID to create this snapshot.
     * 
     */
    @OutputExport(name="creationData", type=CreationDataResponse.class, parameters={})
    private Output</* @Nullable */ CreationDataResponse> creationData;

    /**
     * @return CreationData to be used to specify the source agent pool resource ID to create this snapshot.
     * 
     */
    public Output</* @Nullable */ CreationDataResponse> getCreationData() {
        return this.creationData;
    }
    /**
     * Resource location
     * 
     */
    @OutputExport(name="location", type=String.class, parameters={})
    private Output<String> location;

    /**
     * @return Resource location
     * 
     */
    public Output<String> getLocation() {
        return this.location;
    }
    /**
     * Resource name
     * 
     */
    @OutputExport(name="name", type=String.class, parameters={})
    private Output<String> name;

    /**
     * @return Resource name
     * 
     */
    public Output<String> getName() {
        return this.name;
    }
    /**
     * The type of a snapshot. The default is NodePool.
     * 
     */
    @OutputExport(name="snapshotType", type=String.class, parameters={})
    private Output</* @Nullable */ String> snapshotType;

    /**
     * @return The type of a snapshot. The default is NodePool.
     * 
     */
    public Output</* @Nullable */ String> getSnapshotType() {
        return this.snapshotType;
    }
    /**
     * The system metadata relating to this snapshot.
     * 
     */
    @OutputExport(name="systemData", type=SystemDataResponse.class, parameters={})
    private Output<SystemDataResponse> systemData;

    /**
     * @return The system metadata relating to this snapshot.
     * 
     */
    public Output<SystemDataResponse> getSystemData() {
        return this.systemData;
    }
    /**
     * Resource tags
     * 
     */
    @OutputExport(name="tags", type=Map.class, parameters={String.class, String.class})
    private Output</* @Nullable */ Map<String,String>> tags;

    /**
     * @return Resource tags
     * 
     */
    public Output</* @Nullable */ Map<String,String>> getTags() {
        return this.tags;
    }
    /**
     * Resource type
     * 
     */
    @OutputExport(name="type", type=String.class, parameters={})
    private Output<String> type;

    /**
     * @return Resource type
     * 
     */
    public Output<String> getType() {
        return this.type;
    }

    public interface BuilderApplicator {
        public void apply(SnapshotArgs.Builder a);
    }
    private static io.pulumi.azurenative.containerservice.SnapshotArgs buildArgs(BuilderApplicator argsBuilder) {
        final var builder = io.pulumi.azurenative.containerservice.SnapshotArgs.builder();
        argsBuilder.apply(builder);
        return builder.build();
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param argsBuilder A function that configures a passed builder.
     */
    public Snapshot(String name, BuilderApplicator argsBuilder) {
        this(name, buildArgs(argsBuilder), null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public Snapshot(String name) {
        this(name, SnapshotArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public Snapshot(String name, SnapshotArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public Snapshot(String name, SnapshotArgs args, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("azure-native:containerservice:Snapshot", name, args == null ? SnapshotArgs.Empty : args, makeResourceOptions(options, Input.empty()));
    }

    private Snapshot(String name, Input<String> id, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("azure-native:containerservice:Snapshot", name, null, makeResourceOptions(options, id));
    }

    private static io.pulumi.resources.CustomResourceOptions makeResourceOptions(@Nullable io.pulumi.resources.CustomResourceOptions options, @Nullable Input<String> id) {
        var defaultOptions = io.pulumi.resources.CustomResourceOptions.builder()
            .setVersion(Utilities.getVersion())
            .setAliases(List.of(
                Input.of(Alias.builder().setType("azure-native:containerservice/v20210801:Snapshot").build()),
                Input.of(Alias.builder().setType("azure-native:containerservice/v20210901:Snapshot").build()),
                Input.of(Alias.builder().setType("azure-native:containerservice/v20211001:Snapshot").build()),
                Input.of(Alias.builder().setType("azure-native:containerservice/v20211101preview:Snapshot").build())
            ))
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
    public static Snapshot get(String name, Input<String> id, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        return new Snapshot(name, id, options);
    }
}
