// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.logic;

import io.pulumi.azurenative.Utilities;
import io.pulumi.azurenative.logic.IntegrationAccountArgs;
import io.pulumi.azurenative.logic.outputs.IntegrationAccountSkuResponse;
import io.pulumi.azurenative.logic.outputs.ResourceReferenceResponse;
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
 * The integration account.
 * API Version: 2019-05-01.
 * 
 * ## Example Usage
 * 
 * ## Import
 * 
 * An existing resource can be imported using its type token, name, and identifier, e.g.
 * 
 * ```sh
 * $ pulumi import azure-native:logic:IntegrationAccount testIntegrationAccount /subscriptions/34adfa4f-cedf-4dc0-ba29-b6d1a69ab345/resourceGroups/testResourceGroup/providers/Microsoft.Logic/integrationAccounts/testIntegrationAccount 
 * ```
 * 
 */
@ResourceType(type="azure-native:logic:IntegrationAccount")
public class IntegrationAccount extends io.pulumi.resources.CustomResource {
    /**
     * The integration service environment.
     * 
     */
    @OutputExport(name="integrationServiceEnvironment", type=ResourceReferenceResponse.class, parameters={})
    private Output</* @Nullable */ ResourceReferenceResponse> integrationServiceEnvironment;

    /**
     * @return The integration service environment.
     * 
     */
    public Output</* @Nullable */ ResourceReferenceResponse> getIntegrationServiceEnvironment() {
        return this.integrationServiceEnvironment;
    }
    /**
     * The resource location.
     * 
     */
    @OutputExport(name="location", type=String.class, parameters={})
    private Output</* @Nullable */ String> location;

    /**
     * @return The resource location.
     * 
     */
    public Output</* @Nullable */ String> getLocation() {
        return this.location;
    }
    /**
     * Gets the resource name.
     * 
     */
    @OutputExport(name="name", type=String.class, parameters={})
    private Output<String> name;

    /**
     * @return Gets the resource name.
     * 
     */
    public Output<String> getName() {
        return this.name;
    }
    /**
     * The sku.
     * 
     */
    @OutputExport(name="sku", type=IntegrationAccountSkuResponse.class, parameters={})
    private Output</* @Nullable */ IntegrationAccountSkuResponse> sku;

    /**
     * @return The sku.
     * 
     */
    public Output</* @Nullable */ IntegrationAccountSkuResponse> getSku() {
        return this.sku;
    }
    /**
     * The workflow state.
     * 
     */
    @OutputExport(name="state", type=String.class, parameters={})
    private Output</* @Nullable */ String> state;

    /**
     * @return The workflow state.
     * 
     */
    public Output</* @Nullable */ String> getState() {
        return this.state;
    }
    /**
     * The resource tags.
     * 
     */
    @OutputExport(name="tags", type=Map.class, parameters={String.class, String.class})
    private Output</* @Nullable */ Map<String,String>> tags;

    /**
     * @return The resource tags.
     * 
     */
    public Output</* @Nullable */ Map<String,String>> getTags() {
        return this.tags;
    }
    /**
     * Gets the resource type.
     * 
     */
    @OutputExport(name="type", type=String.class, parameters={})
    private Output<String> type;

    /**
     * @return Gets the resource type.
     * 
     */
    public Output<String> getType() {
        return this.type;
    }

    public interface BuilderApplicator {
        public void apply(IntegrationAccountArgs.Builder a);
    }
    private static io.pulumi.azurenative.logic.IntegrationAccountArgs buildArgs(BuilderApplicator argsBuilder) {
        final var builder = io.pulumi.azurenative.logic.IntegrationAccountArgs.builder();
        argsBuilder.apply(builder);
        return builder.build();
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param argsBuilder A function that configures a passed builder.
     */
    public IntegrationAccount(String name, BuilderApplicator argsBuilder) {
        this(name, buildArgs(argsBuilder), null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public IntegrationAccount(String name) {
        this(name, IntegrationAccountArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public IntegrationAccount(String name, IntegrationAccountArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public IntegrationAccount(String name, IntegrationAccountArgs args, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("azure-native:logic:IntegrationAccount", name, args == null ? IntegrationAccountArgs.Empty : args, makeResourceOptions(options, Input.empty()));
    }

    private IntegrationAccount(String name, Input<String> id, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("azure-native:logic:IntegrationAccount", name, null, makeResourceOptions(options, id));
    }

    private static io.pulumi.resources.CustomResourceOptions makeResourceOptions(@Nullable io.pulumi.resources.CustomResourceOptions options, @Nullable Input<String> id) {
        var defaultOptions = io.pulumi.resources.CustomResourceOptions.builder()
            .setVersion(Utilities.getVersion())
            .setAliases(List.of(
                Input.of(Alias.builder().setType("azure-native:logic/v20150801preview:IntegrationAccount").build()),
                Input.of(Alias.builder().setType("azure-native:logic/v20160601:IntegrationAccount").build()),
                Input.of(Alias.builder().setType("azure-native:logic/v20180701preview:IntegrationAccount").build()),
                Input.of(Alias.builder().setType("azure-native:logic/v20190501:IntegrationAccount").build())
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
    public static IntegrationAccount get(String name, Input<String> id, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        return new IntegrationAccount(name, id, options);
    }
}
