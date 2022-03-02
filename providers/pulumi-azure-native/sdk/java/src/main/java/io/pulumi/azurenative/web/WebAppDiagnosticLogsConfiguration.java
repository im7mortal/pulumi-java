// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.web;

import io.pulumi.azurenative.Utilities;
import io.pulumi.azurenative.web.WebAppDiagnosticLogsConfigurationArgs;
import io.pulumi.azurenative.web.outputs.ApplicationLogsConfigResponse;
import io.pulumi.azurenative.web.outputs.EnabledConfigResponse;
import io.pulumi.azurenative.web.outputs.HttpLogsConfigResponse;
import io.pulumi.core.Alias;
import io.pulumi.core.Input;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.OutputExport;
import io.pulumi.core.annotations.ResourceType;
import java.lang.String;
import java.util.List;
import javax.annotation.Nullable;

/**
 * Configuration of App Service site logs.
 * API Version: 2020-12-01.
 * ## Import
 * 
 * An existing resource can be imported using its type token, name, and identifier, e.g.
 * 
 * ```sh
 * $ pulumi import azure-native:web:WebAppDiagnosticLogsConfiguration myresource1 /subscriptions/{subscriptionId}/resourceGroups/{resourceGroupName}/providers/Microsoft.Web/sites/{name}/config/logs 
 * ```
 * 
 */
@ResourceType(type="azure-native:web:WebAppDiagnosticLogsConfiguration")
public class WebAppDiagnosticLogsConfiguration extends io.pulumi.resources.CustomResource {
    /**
     * Application logs configuration.
     * 
     */
    @OutputExport(name="applicationLogs", type=ApplicationLogsConfigResponse.class, parameters={})
    private Output</* @Nullable */ ApplicationLogsConfigResponse> applicationLogs;

    /**
     * @return Application logs configuration.
     * 
     */
    public Output</* @Nullable */ ApplicationLogsConfigResponse> getApplicationLogs() {
        return this.applicationLogs;
    }
    /**
     * Detailed error messages configuration.
     * 
     */
    @OutputExport(name="detailedErrorMessages", type=EnabledConfigResponse.class, parameters={})
    private Output</* @Nullable */ EnabledConfigResponse> detailedErrorMessages;

    /**
     * @return Detailed error messages configuration.
     * 
     */
    public Output</* @Nullable */ EnabledConfigResponse> getDetailedErrorMessages() {
        return this.detailedErrorMessages;
    }
    /**
     * Failed requests tracing configuration.
     * 
     */
    @OutputExport(name="failedRequestsTracing", type=EnabledConfigResponse.class, parameters={})
    private Output</* @Nullable */ EnabledConfigResponse> failedRequestsTracing;

    /**
     * @return Failed requests tracing configuration.
     * 
     */
    public Output</* @Nullable */ EnabledConfigResponse> getFailedRequestsTracing() {
        return this.failedRequestsTracing;
    }
    /**
     * HTTP logs configuration.
     * 
     */
    @OutputExport(name="httpLogs", type=HttpLogsConfigResponse.class, parameters={})
    private Output</* @Nullable */ HttpLogsConfigResponse> httpLogs;

    /**
     * @return HTTP logs configuration.
     * 
     */
    public Output</* @Nullable */ HttpLogsConfigResponse> getHttpLogs() {
        return this.httpLogs;
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
        public void apply(WebAppDiagnosticLogsConfigurationArgs.Builder a);
    }
    private static io.pulumi.azurenative.web.WebAppDiagnosticLogsConfigurationArgs buildArgs(BuilderApplicator argsBuilder) {
        final var builder = io.pulumi.azurenative.web.WebAppDiagnosticLogsConfigurationArgs.builder();
        argsBuilder.apply(builder);
        return builder.build();
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param argsBuilder A function that configures a passed builder.
     */
    public WebAppDiagnosticLogsConfiguration(String name, BuilderApplicator argsBuilder) {
        this(name, buildArgs(argsBuilder), null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public WebAppDiagnosticLogsConfiguration(String name) {
        this(name, WebAppDiagnosticLogsConfigurationArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public WebAppDiagnosticLogsConfiguration(String name, WebAppDiagnosticLogsConfigurationArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public WebAppDiagnosticLogsConfiguration(String name, WebAppDiagnosticLogsConfigurationArgs args, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("azure-native:web:WebAppDiagnosticLogsConfiguration", name, args == null ? WebAppDiagnosticLogsConfigurationArgs.Empty : args, makeResourceOptions(options, Input.empty()));
    }

    private WebAppDiagnosticLogsConfiguration(String name, Input<String> id, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("azure-native:web:WebAppDiagnosticLogsConfiguration", name, null, makeResourceOptions(options, id));
    }

    private static io.pulumi.resources.CustomResourceOptions makeResourceOptions(@Nullable io.pulumi.resources.CustomResourceOptions options, @Nullable Input<String> id) {
        var defaultOptions = io.pulumi.resources.CustomResourceOptions.builder()
            .setVersion(Utilities.getVersion())
            .setAliases(List.of(
                Input.of(Alias.builder().setType("azure-native:web/v20150801:WebAppDiagnosticLogsConfiguration").build()),
                Input.of(Alias.builder().setType("azure-native:web/v20160801:WebAppDiagnosticLogsConfiguration").build()),
                Input.of(Alias.builder().setType("azure-native:web/v20180201:WebAppDiagnosticLogsConfiguration").build()),
                Input.of(Alias.builder().setType("azure-native:web/v20181101:WebAppDiagnosticLogsConfiguration").build()),
                Input.of(Alias.builder().setType("azure-native:web/v20190801:WebAppDiagnosticLogsConfiguration").build()),
                Input.of(Alias.builder().setType("azure-native:web/v20200601:WebAppDiagnosticLogsConfiguration").build()),
                Input.of(Alias.builder().setType("azure-native:web/v20200901:WebAppDiagnosticLogsConfiguration").build()),
                Input.of(Alias.builder().setType("azure-native:web/v20201001:WebAppDiagnosticLogsConfiguration").build()),
                Input.of(Alias.builder().setType("azure-native:web/v20201201:WebAppDiagnosticLogsConfiguration").build()),
                Input.of(Alias.builder().setType("azure-native:web/v20210101:WebAppDiagnosticLogsConfiguration").build()),
                Input.of(Alias.builder().setType("azure-native:web/v20210115:WebAppDiagnosticLogsConfiguration").build()),
                Input.of(Alias.builder().setType("azure-native:web/v20210201:WebAppDiagnosticLogsConfiguration").build()),
                Input.of(Alias.builder().setType("azure-native:web/v20210301:WebAppDiagnosticLogsConfiguration").build())
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
    public static WebAppDiagnosticLogsConfiguration get(String name, Input<String> id, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        return new WebAppDiagnosticLogsConfiguration(name, id, options);
    }
}
