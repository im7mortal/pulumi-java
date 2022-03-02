// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.servicefabricmesh;

import io.pulumi.azurenative.Utilities;
import io.pulumi.azurenative.servicefabricmesh.SecretValueArgs;
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
 * This type describes a value of a secret resource. The name of this resource is the version identifier corresponding to this secret value.
 * API Version: 2018-09-01-preview.
 * 
 * ## Example Usage
 * 
 * ## Import
 * 
 * An existing resource can be imported using its type token, name, and identifier, e.g.
 * 
 * ```sh
 * $ pulumi import azure-native:servicefabricmesh:SecretValue v1 /subscriptions/00000000-0000-0000-0000-000000000000/resourcegroups/sbz_demo/providers/Microsoft.ServiceFabricMesh/secrets/dbConnectionString/values/v1 
 * ```
 * 
 */
@ResourceType(type="azure-native:servicefabricmesh:SecretValue")
public class SecretValue extends io.pulumi.resources.CustomResource {
    /**
     * The geo-location where the resource lives
     * 
     */
    @OutputExport(name="location", type=String.class, parameters={})
    private Output<String> location;

    /**
     * @return The geo-location where the resource lives
     * 
     */
    public Output<String> getLocation() {
        return this.location;
    }
    /**
     * The name of the resource
     * 
     */
    @OutputExport(name="name", type=String.class, parameters={})
    private Output<String> name;

    /**
     * @return The name of the resource
     * 
     */
    public Output<String> getName() {
        return this.name;
    }
    /**
     * State of the resource.
     * 
     */
    @OutputExport(name="provisioningState", type=String.class, parameters={})
    private Output<String> provisioningState;

    /**
     * @return State of the resource.
     * 
     */
    public Output<String> getProvisioningState() {
        return this.provisioningState;
    }
    /**
     * Resource tags.
     * 
     */
    @OutputExport(name="tags", type=Map.class, parameters={String.class, String.class})
    private Output</* @Nullable */ Map<String,String>> tags;

    /**
     * @return Resource tags.
     * 
     */
    public Output</* @Nullable */ Map<String,String>> getTags() {
        return this.tags;
    }
    /**
     * The type of the resource. Ex- Microsoft.Compute/virtualMachines or Microsoft.Storage/storageAccounts.
     * 
     */
    @OutputExport(name="type", type=String.class, parameters={})
    private Output<String> type;

    /**
     * @return The type of the resource. Ex- Microsoft.Compute/virtualMachines or Microsoft.Storage/storageAccounts.
     * 
     */
    public Output<String> getType() {
        return this.type;
    }
    /**
     * The actual value of the secret.
     * 
     */
    @OutputExport(name="value", type=String.class, parameters={})
    private Output</* @Nullable */ String> value;

    /**
     * @return The actual value of the secret.
     * 
     */
    public Output</* @Nullable */ String> getValue() {
        return this.value;
    }

    public interface BuilderApplicator {
        public void apply(SecretValueArgs.Builder a);
    }
    private static io.pulumi.azurenative.servicefabricmesh.SecretValueArgs buildArgs(BuilderApplicator argsBuilder) {
        final var builder = io.pulumi.azurenative.servicefabricmesh.SecretValueArgs.builder();
        argsBuilder.apply(builder);
        return builder.build();
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param argsBuilder A function that configures a passed builder.
     */
    public SecretValue(String name, BuilderApplicator argsBuilder) {
        this(name, buildArgs(argsBuilder), null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public SecretValue(String name) {
        this(name, SecretValueArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public SecretValue(String name, SecretValueArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public SecretValue(String name, SecretValueArgs args, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("azure-native:servicefabricmesh:SecretValue", name, args == null ? SecretValueArgs.Empty : args, makeResourceOptions(options, Input.empty()));
    }

    private SecretValue(String name, Input<String> id, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("azure-native:servicefabricmesh:SecretValue", name, null, makeResourceOptions(options, id));
    }

    private static io.pulumi.resources.CustomResourceOptions makeResourceOptions(@Nullable io.pulumi.resources.CustomResourceOptions options, @Nullable Input<String> id) {
        var defaultOptions = io.pulumi.resources.CustomResourceOptions.builder()
            .setVersion(Utilities.getVersion())
            .setAliases(List.of(
                Input.of(Alias.builder().setType("azure-native:servicefabricmesh/v20180901preview:SecretValue").build())
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
    public static SecretValue get(String name, Input<String> id, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        return new SecretValue(name, id, options);
    }
}
