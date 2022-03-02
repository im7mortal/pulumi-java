// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.machinelearningservices;

import io.pulumi.azurenative.Utilities;
import io.pulumi.azurenative.machinelearningservices.LinkedWorkspaceArgs;
import io.pulumi.azurenative.machinelearningservices.outputs.LinkedWorkspacePropsResponse;
import io.pulumi.core.Alias;
import io.pulumi.core.Input;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.OutputExport;
import io.pulumi.core.annotations.ResourceType;
import java.lang.String;
import java.util.List;
import javax.annotation.Nullable;

/**
 * Linked workspace.
 * API Version: 2020-03-01.
 * 
 * ## Example Usage
 * 
 * ## Import
 * 
 * An existing resource can be imported using its type token, name, and identifier, e.g.
 * 
 * ```sh
 * $ pulumi import azure-native:machinelearningservices:LinkedWorkspace link-1 /subscriptions/00000000-1111-2222-3333-444444444444/resourceGroups/resourceGroup-1/providers/Microsoft.MachineLearningServices/workspaces/workspace-1/linkedWorkspaces/link-1 
 * ```
 * 
 */
@ResourceType(type="azure-native:machinelearningservices:LinkedWorkspace")
public class LinkedWorkspace extends io.pulumi.resources.CustomResource {
    /**
     * Friendly name of the linked workspace.
     * 
     */
    @OutputExport(name="name", type=String.class, parameters={})
    private Output<String> name;

    /**
     * @return Friendly name of the linked workspace.
     * 
     */
    public Output<String> getName() {
        return this.name;
    }
    /**
     * LinkedWorkspace specific properties.
     * 
     */
    @OutputExport(name="properties", type=LinkedWorkspacePropsResponse.class, parameters={})
    private Output<LinkedWorkspacePropsResponse> properties;

    /**
     * @return LinkedWorkspace specific properties.
     * 
     */
    public Output<LinkedWorkspacePropsResponse> getProperties() {
        return this.properties;
    }
    /**
     * Resource type of linked workspace.
     * 
     */
    @OutputExport(name="type", type=String.class, parameters={})
    private Output<String> type;

    /**
     * @return Resource type of linked workspace.
     * 
     */
    public Output<String> getType() {
        return this.type;
    }

    public interface BuilderApplicator {
        public void apply(LinkedWorkspaceArgs.Builder a);
    }
    private static io.pulumi.azurenative.machinelearningservices.LinkedWorkspaceArgs buildArgs(BuilderApplicator argsBuilder) {
        final var builder = io.pulumi.azurenative.machinelearningservices.LinkedWorkspaceArgs.builder();
        argsBuilder.apply(builder);
        return builder.build();
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param argsBuilder A function that configures a passed builder.
     */
    public LinkedWorkspace(String name, BuilderApplicator argsBuilder) {
        this(name, buildArgs(argsBuilder), null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public LinkedWorkspace(String name) {
        this(name, LinkedWorkspaceArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public LinkedWorkspace(String name, LinkedWorkspaceArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public LinkedWorkspace(String name, LinkedWorkspaceArgs args, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("azure-native:machinelearningservices:LinkedWorkspace", name, args == null ? LinkedWorkspaceArgs.Empty : args, makeResourceOptions(options, Input.empty()));
    }

    private LinkedWorkspace(String name, Input<String> id, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("azure-native:machinelearningservices:LinkedWorkspace", name, null, makeResourceOptions(options, id));
    }

    private static io.pulumi.resources.CustomResourceOptions makeResourceOptions(@Nullable io.pulumi.resources.CustomResourceOptions options, @Nullable Input<String> id) {
        var defaultOptions = io.pulumi.resources.CustomResourceOptions.builder()
            .setVersion(Utilities.getVersion())
            .setAliases(List.of(
                Input.of(Alias.builder().setType("azure-native:machinelearningservices/v20200301:LinkedWorkspace").build())
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
    public static LinkedWorkspace get(String name, Input<String> id, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        return new LinkedWorkspace(name, id, options);
    }
}
