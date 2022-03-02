// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.agfoodplatform;

import io.pulumi.azurenative.Utilities;
import io.pulumi.azurenative.agfoodplatform.ExtensionArgs;
import io.pulumi.azurenative.agfoodplatform.outputs.SystemDataResponse;
import io.pulumi.core.Alias;
import io.pulumi.core.Input;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.OutputExport;
import io.pulumi.core.annotations.ResourceType;
import java.lang.String;
import java.util.List;
import javax.annotation.Nullable;

/**
 * Extension resource.
 * API Version: 2020-05-12-preview.
 * 
 * ## Example Usage
 * 
 * ## Import
 * 
 * An existing resource can be imported using its type token, name, and identifier, e.g.
 * 
 * ```sh
 * $ pulumi import azure-native:agfoodplatform:Extension provider.extension /subscriptions/11111111-2222-3333-4444-555555555555/resourceGroups/examples-rg/Microsoft.AgFoodPlatform/farmBeats/examples-farmbeatsResourceName/extensions/provider.extension 
 * ```
 * 
 */
@ResourceType(type="azure-native:agfoodplatform:Extension")
public class Extension extends io.pulumi.resources.CustomResource {
    /**
     * The ETag value to implement optimistic concurrency.
     * 
     */
    @OutputExport(name="eTag", type=String.class, parameters={})
    private Output<String> eTag;

    /**
     * @return The ETag value to implement optimistic concurrency.
     * 
     */
    public Output<String> getETag() {
        return this.eTag;
    }
    /**
     * Extension api docs link.
     * 
     */
    @OutputExport(name="extensionApiDocsLink", type=String.class, parameters={})
    private Output<String> extensionApiDocsLink;

    /**
     * @return Extension api docs link.
     * 
     */
    public Output<String> getExtensionApiDocsLink() {
        return this.extensionApiDocsLink;
    }
    /**
     * Extension auth link.
     * 
     */
    @OutputExport(name="extensionAuthLink", type=String.class, parameters={})
    private Output<String> extensionAuthLink;

    /**
     * @return Extension auth link.
     * 
     */
    public Output<String> getExtensionAuthLink() {
        return this.extensionAuthLink;
    }
    /**
     * Extension category. e.g. weather/sensor/satellite.
     * 
     */
    @OutputExport(name="extensionCategory", type=String.class, parameters={})
    private Output<String> extensionCategory;

    /**
     * @return Extension category. e.g. weather/sensor/satellite.
     * 
     */
    public Output<String> getExtensionCategory() {
        return this.extensionCategory;
    }
    /**
     * Extension Id.
     * 
     */
    @OutputExport(name="extensionId", type=String.class, parameters={})
    private Output<String> extensionId;

    /**
     * @return Extension Id.
     * 
     */
    public Output<String> getExtensionId() {
        return this.extensionId;
    }
    /**
     * Installed extension version.
     * 
     */
    @OutputExport(name="installedExtensionVersion", type=String.class, parameters={})
    private Output<String> installedExtensionVersion;

    /**
     * @return Installed extension version.
     * 
     */
    public Output<String> getInstalledExtensionVersion() {
        return this.installedExtensionVersion;
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
     * Metadata pertaining to creation and last modification of the resource.
     * 
     */
    @OutputExport(name="systemData", type=SystemDataResponse.class, parameters={})
    private Output<SystemDataResponse> systemData;

    /**
     * @return Metadata pertaining to creation and last modification of the resource.
     * 
     */
    public Output<SystemDataResponse> getSystemData() {
        return this.systemData;
    }
    /**
     * The type of the resource. E.g. "Microsoft.Compute/virtualMachines" or "Microsoft.Storage/storageAccounts"
     * 
     */
    @OutputExport(name="type", type=String.class, parameters={})
    private Output<String> type;

    /**
     * @return The type of the resource. E.g. "Microsoft.Compute/virtualMachines" or "Microsoft.Storage/storageAccounts"
     * 
     */
    public Output<String> getType() {
        return this.type;
    }

    public interface BuilderApplicator {
        public void apply(ExtensionArgs.Builder a);
    }
    private static io.pulumi.azurenative.agfoodplatform.ExtensionArgs buildArgs(BuilderApplicator argsBuilder) {
        final var builder = io.pulumi.azurenative.agfoodplatform.ExtensionArgs.builder();
        argsBuilder.apply(builder);
        return builder.build();
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param argsBuilder A function that configures a passed builder.
     */
    public Extension(String name, BuilderApplicator argsBuilder) {
        this(name, buildArgs(argsBuilder), null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public Extension(String name) {
        this(name, ExtensionArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public Extension(String name, ExtensionArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public Extension(String name, ExtensionArgs args, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("azure-native:agfoodplatform:Extension", name, args == null ? ExtensionArgs.Empty : args, makeResourceOptions(options, Input.empty()));
    }

    private Extension(String name, Input<String> id, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("azure-native:agfoodplatform:Extension", name, null, makeResourceOptions(options, id));
    }

    private static io.pulumi.resources.CustomResourceOptions makeResourceOptions(@Nullable io.pulumi.resources.CustomResourceOptions options, @Nullable Input<String> id) {
        var defaultOptions = io.pulumi.resources.CustomResourceOptions.builder()
            .setVersion(Utilities.getVersion())
            .setAliases(List.of(
                Input.of(Alias.builder().setType("azure-native:agfoodplatform/v20200512preview:Extension").build())
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
    public static Extension get(String name, Input<String> id, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        return new Extension(name, id, options);
    }
}
