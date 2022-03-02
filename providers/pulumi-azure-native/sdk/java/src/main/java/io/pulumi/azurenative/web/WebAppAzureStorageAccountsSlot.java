// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.web;

import io.pulumi.azurenative.Utilities;
import io.pulumi.azurenative.web.WebAppAzureStorageAccountsSlotArgs;
import io.pulumi.azurenative.web.outputs.AzureStorageInfoValueResponse;
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
 * AzureStorageInfo dictionary resource.
 * API Version: 2020-12-01.
 * ## Import
 * 
 * An existing resource can be imported using its type token, name, and identifier, e.g.
 * 
 * ```sh
 * $ pulumi import azure-native:web:WebAppAzureStorageAccountsSlot myresource1 /subscriptions/{subscriptionId}/resourceGroups/{resourceGroupName}/providers/Microsoft.Web/sites/{name}/slots/{slot}/config/azurestorageaccounts 
 * ```
 * 
 */
@ResourceType(type="azure-native:web:WebAppAzureStorageAccountsSlot")
public class WebAppAzureStorageAccountsSlot extends io.pulumi.resources.CustomResource {
    /**
     * Kind of resource.
     * 
     */
    @OutputExport(name="kind", type=String.class, parameters={})
    private Output</* @Nullable */ String> kind;

    /**
     * @return Kind of resource.
     * 
     */
    public Output</* @Nullable */ String> getKind() {
        return this.kind;
    }
    /**
     * Resource Name.
     * 
     */
    @OutputExport(name="name", type=String.class, parameters={})
    private Output<String> name;

    /**
     * @return Resource Name.
     * 
     */
    public Output<String> getName() {
        return this.name;
    }
    /**
     * Azure storage accounts.
     * 
     */
    @OutputExport(name="properties", type=Map.class, parameters={String.class, AzureStorageInfoValueResponse.class})
    private Output<Map<String,AzureStorageInfoValueResponse>> properties;

    /**
     * @return Azure storage accounts.
     * 
     */
    public Output<Map<String,AzureStorageInfoValueResponse>> getProperties() {
        return this.properties;
    }
    /**
     * Resource type.
     * 
     */
    @OutputExport(name="type", type=String.class, parameters={})
    private Output<String> type;

    /**
     * @return Resource type.
     * 
     */
    public Output<String> getType() {
        return this.type;
    }

    public interface BuilderApplicator {
        public void apply(WebAppAzureStorageAccountsSlotArgs.Builder a);
    }
    private static io.pulumi.azurenative.web.WebAppAzureStorageAccountsSlotArgs buildArgs(BuilderApplicator argsBuilder) {
        final var builder = io.pulumi.azurenative.web.WebAppAzureStorageAccountsSlotArgs.builder();
        argsBuilder.apply(builder);
        return builder.build();
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param argsBuilder A function that configures a passed builder.
     */
    public WebAppAzureStorageAccountsSlot(String name, BuilderApplicator argsBuilder) {
        this(name, buildArgs(argsBuilder), null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public WebAppAzureStorageAccountsSlot(String name) {
        this(name, WebAppAzureStorageAccountsSlotArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public WebAppAzureStorageAccountsSlot(String name, WebAppAzureStorageAccountsSlotArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public WebAppAzureStorageAccountsSlot(String name, WebAppAzureStorageAccountsSlotArgs args, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("azure-native:web:WebAppAzureStorageAccountsSlot", name, args == null ? WebAppAzureStorageAccountsSlotArgs.Empty : args, makeResourceOptions(options, Input.empty()));
    }

    private WebAppAzureStorageAccountsSlot(String name, Input<String> id, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("azure-native:web:WebAppAzureStorageAccountsSlot", name, null, makeResourceOptions(options, id));
    }

    private static io.pulumi.resources.CustomResourceOptions makeResourceOptions(@Nullable io.pulumi.resources.CustomResourceOptions options, @Nullable Input<String> id) {
        var defaultOptions = io.pulumi.resources.CustomResourceOptions.builder()
            .setVersion(Utilities.getVersion())
            .setAliases(List.of(
                Input.of(Alias.builder().setType("azure-native:web/v20180201:WebAppAzureStorageAccountsSlot").build()),
                Input.of(Alias.builder().setType("azure-native:web/v20181101:WebAppAzureStorageAccountsSlot").build()),
                Input.of(Alias.builder().setType("azure-native:web/v20190801:WebAppAzureStorageAccountsSlot").build()),
                Input.of(Alias.builder().setType("azure-native:web/v20200601:WebAppAzureStorageAccountsSlot").build()),
                Input.of(Alias.builder().setType("azure-native:web/v20200901:WebAppAzureStorageAccountsSlot").build()),
                Input.of(Alias.builder().setType("azure-native:web/v20201001:WebAppAzureStorageAccountsSlot").build()),
                Input.of(Alias.builder().setType("azure-native:web/v20201201:WebAppAzureStorageAccountsSlot").build()),
                Input.of(Alias.builder().setType("azure-native:web/v20210101:WebAppAzureStorageAccountsSlot").build()),
                Input.of(Alias.builder().setType("azure-native:web/v20210115:WebAppAzureStorageAccountsSlot").build()),
                Input.of(Alias.builder().setType("azure-native:web/v20210201:WebAppAzureStorageAccountsSlot").build()),
                Input.of(Alias.builder().setType("azure-native:web/v20210301:WebAppAzureStorageAccountsSlot").build())
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
    public static WebAppAzureStorageAccountsSlot get(String name, Input<String> id, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        return new WebAppAzureStorageAccountsSlot(name, id, options);
    }
}
