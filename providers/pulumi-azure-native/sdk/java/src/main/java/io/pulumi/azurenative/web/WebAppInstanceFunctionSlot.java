// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.web;

import io.pulumi.azurenative.Utilities;
import io.pulumi.azurenative.web.WebAppInstanceFunctionSlotArgs;
import io.pulumi.core.Alias;
import io.pulumi.core.Input;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.OutputExport;
import io.pulumi.core.annotations.ResourceType;
import java.lang.Boolean;
import java.lang.Object;
import java.lang.String;
import java.util.List;
import java.util.Map;
import javax.annotation.Nullable;

/**
 * Function information.
 * API Version: 2020-12-01.
 * ## Import
 * 
 * An existing resource can be imported using its type token, name, and identifier, e.g.
 * 
 * ```sh
 * $ pulumi import azure-native:web:WebAppInstanceFunctionSlot myresource1 /subscriptions/{subscriptionId}/resourceGroups/{resourceGroupName}/providers/Microsoft.Web/sites/{name}/slots/{slot}/functions/{functionName} 
 * ```
 * 
 */
@ResourceType(type="azure-native:web:WebAppInstanceFunctionSlot")
public class WebAppInstanceFunctionSlot extends io.pulumi.resources.CustomResource {
    /**
     * Config information.
     * 
     */
    @OutputExport(name="config", type=Object.class, parameters={})
    private Output</* @Nullable */ Object> config;

    /**
     * @return Config information.
     * 
     */
    public Output</* @Nullable */ Object> getConfig() {
        return this.config;
    }
    /**
     * Config URI.
     * 
     */
    @OutputExport(name="configHref", type=String.class, parameters={})
    private Output</* @Nullable */ String> configHref;

    /**
     * @return Config URI.
     * 
     */
    public Output</* @Nullable */ String> getConfigHref() {
        return this.configHref;
    }
    /**
     * File list.
     * 
     */
    @OutputExport(name="files", type=Map.class, parameters={String.class, String.class})
    private Output</* @Nullable */ Map<String,String>> files;

    /**
     * @return File list.
     * 
     */
    public Output</* @Nullable */ Map<String,String>> getFiles() {
        return this.files;
    }
    /**
     * Function App ID.
     * 
     */
    @OutputExport(name="functionAppId", type=String.class, parameters={})
    private Output</* @Nullable */ String> functionAppId;

    /**
     * @return Function App ID.
     * 
     */
    public Output</* @Nullable */ String> getFunctionAppId() {
        return this.functionAppId;
    }
    /**
     * Function URI.
     * 
     */
    @OutputExport(name="href", type=String.class, parameters={})
    private Output</* @Nullable */ String> href;

    /**
     * @return Function URI.
     * 
     */
    public Output</* @Nullable */ String> getHref() {
        return this.href;
    }
    /**
     * The invocation URL
     * 
     */
    @OutputExport(name="invokeUrlTemplate", type=String.class, parameters={})
    private Output</* @Nullable */ String> invokeUrlTemplate;

    /**
     * @return The invocation URL
     * 
     */
    public Output</* @Nullable */ String> getInvokeUrlTemplate() {
        return this.invokeUrlTemplate;
    }
    /**
     * Gets or sets a value indicating whether the function is disabled
     * 
     */
    @OutputExport(name="isDisabled", type=Boolean.class, parameters={})
    private Output</* @Nullable */ Boolean> isDisabled;

    /**
     * @return Gets or sets a value indicating whether the function is disabled
     * 
     */
    public Output</* @Nullable */ Boolean> getIsDisabled() {
        return this.isDisabled;
    }
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
     * The function language
     * 
     */
    @OutputExport(name="language", type=String.class, parameters={})
    private Output</* @Nullable */ String> language;

    /**
     * @return The function language
     * 
     */
    public Output</* @Nullable */ String> getLanguage() {
        return this.language;
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
     * Script URI.
     * 
     */
    @OutputExport(name="scriptHref", type=String.class, parameters={})
    private Output</* @Nullable */ String> scriptHref;

    /**
     * @return Script URI.
     * 
     */
    public Output</* @Nullable */ String> getScriptHref() {
        return this.scriptHref;
    }
    /**
     * Script root path URI.
     * 
     */
    @OutputExport(name="scriptRootPathHref", type=String.class, parameters={})
    private Output</* @Nullable */ String> scriptRootPathHref;

    /**
     * @return Script root path URI.
     * 
     */
    public Output</* @Nullable */ String> getScriptRootPathHref() {
        return this.scriptRootPathHref;
    }
    /**
     * Secrets file URI.
     * 
     */
    @OutputExport(name="secretsFileHref", type=String.class, parameters={})
    private Output</* @Nullable */ String> secretsFileHref;

    /**
     * @return Secrets file URI.
     * 
     */
    public Output</* @Nullable */ String> getSecretsFileHref() {
        return this.secretsFileHref;
    }
    /**
     * Test data used when testing via the Azure Portal.
     * 
     */
    @OutputExport(name="testData", type=String.class, parameters={})
    private Output</* @Nullable */ String> testData;

    /**
     * @return Test data used when testing via the Azure Portal.
     * 
     */
    public Output</* @Nullable */ String> getTestData() {
        return this.testData;
    }
    /**
     * Test data URI.
     * 
     */
    @OutputExport(name="testDataHref", type=String.class, parameters={})
    private Output</* @Nullable */ String> testDataHref;

    /**
     * @return Test data URI.
     * 
     */
    public Output</* @Nullable */ String> getTestDataHref() {
        return this.testDataHref;
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
        public void apply(WebAppInstanceFunctionSlotArgs.Builder a);
    }
    private static io.pulumi.azurenative.web.WebAppInstanceFunctionSlotArgs buildArgs(BuilderApplicator argsBuilder) {
        final var builder = io.pulumi.azurenative.web.WebAppInstanceFunctionSlotArgs.builder();
        argsBuilder.apply(builder);
        return builder.build();
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param argsBuilder A function that configures a passed builder.
     */
    public WebAppInstanceFunctionSlot(String name, BuilderApplicator argsBuilder) {
        this(name, buildArgs(argsBuilder), null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public WebAppInstanceFunctionSlot(String name) {
        this(name, WebAppInstanceFunctionSlotArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public WebAppInstanceFunctionSlot(String name, WebAppInstanceFunctionSlotArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public WebAppInstanceFunctionSlot(String name, WebAppInstanceFunctionSlotArgs args, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("azure-native:web:WebAppInstanceFunctionSlot", name, args == null ? WebAppInstanceFunctionSlotArgs.Empty : args, makeResourceOptions(options, Input.empty()));
    }

    private WebAppInstanceFunctionSlot(String name, Input<String> id, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("azure-native:web:WebAppInstanceFunctionSlot", name, null, makeResourceOptions(options, id));
    }

    private static io.pulumi.resources.CustomResourceOptions makeResourceOptions(@Nullable io.pulumi.resources.CustomResourceOptions options, @Nullable Input<String> id) {
        var defaultOptions = io.pulumi.resources.CustomResourceOptions.builder()
            .setVersion(Utilities.getVersion())
            .setAliases(List.of(
                Input.of(Alias.builder().setType("azure-native:web/v20160801:WebAppInstanceFunctionSlot").build()),
                Input.of(Alias.builder().setType("azure-native:web/v20180201:WebAppInstanceFunctionSlot").build()),
                Input.of(Alias.builder().setType("azure-native:web/v20181101:WebAppInstanceFunctionSlot").build()),
                Input.of(Alias.builder().setType("azure-native:web/v20190801:WebAppInstanceFunctionSlot").build()),
                Input.of(Alias.builder().setType("azure-native:web/v20200601:WebAppInstanceFunctionSlot").build()),
                Input.of(Alias.builder().setType("azure-native:web/v20200901:WebAppInstanceFunctionSlot").build()),
                Input.of(Alias.builder().setType("azure-native:web/v20201001:WebAppInstanceFunctionSlot").build()),
                Input.of(Alias.builder().setType("azure-native:web/v20201201:WebAppInstanceFunctionSlot").build()),
                Input.of(Alias.builder().setType("azure-native:web/v20210101:WebAppInstanceFunctionSlot").build()),
                Input.of(Alias.builder().setType("azure-native:web/v20210115:WebAppInstanceFunctionSlot").build()),
                Input.of(Alias.builder().setType("azure-native:web/v20210201:WebAppInstanceFunctionSlot").build()),
                Input.of(Alias.builder().setType("azure-native:web/v20210301:WebAppInstanceFunctionSlot").build())
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
    public static WebAppInstanceFunctionSlot get(String name, Input<String> id, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        return new WebAppInstanceFunctionSlot(name, id, options);
    }
}
