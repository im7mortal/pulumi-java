// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.apimanagement;

import io.pulumi.azurenative.Utilities;
import io.pulumi.azurenative.apimanagement.ApiDiagnosticArgs;
import io.pulumi.azurenative.apimanagement.outputs.PipelineDiagnosticSettingsResponse;
import io.pulumi.azurenative.apimanagement.outputs.SamplingSettingsResponse;
import io.pulumi.core.Alias;
import io.pulumi.core.Input;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.OutputExport;
import io.pulumi.core.annotations.ResourceType;
import java.lang.Boolean;
import java.lang.String;
import java.util.List;
import javax.annotation.Nullable;

/**
 * Diagnostic details.
 * API Version: 2020-12-01.
 * 
 * ## Example Usage
 * 
 * ## Import
 * 
 * An existing resource can be imported using its type token, name, and identifier, e.g.
 * 
 * ```sh
 * $ pulumi import azure-native:apimanagement:ApiDiagnostic applicationinsights /subscriptions/subid/resourceGroups/rg1/providers/Microsoft.ApiManagement/service/apimService1/apis/57d1f7558aa04f15146d9d8a/diagnostics/applicationinsights 
 * ```
 * 
 */
@ResourceType(type="azure-native:apimanagement:ApiDiagnostic")
public class ApiDiagnostic extends io.pulumi.resources.CustomResource {
    /**
     * Specifies for what type of messages sampling settings should not apply.
     * 
     */
    @OutputExport(name="alwaysLog", type=String.class, parameters={})
    private Output</* @Nullable */ String> alwaysLog;

    /**
     * @return Specifies for what type of messages sampling settings should not apply.
     * 
     */
    public Output</* @Nullable */ String> getAlwaysLog() {
        return this.alwaysLog;
    }
    /**
     * Diagnostic settings for incoming/outgoing HTTP messages to the Backend
     * 
     */
    @OutputExport(name="backend", type=PipelineDiagnosticSettingsResponse.class, parameters={})
    private Output</* @Nullable */ PipelineDiagnosticSettingsResponse> backend;

    /**
     * @return Diagnostic settings for incoming/outgoing HTTP messages to the Backend
     * 
     */
    public Output</* @Nullable */ PipelineDiagnosticSettingsResponse> getBackend() {
        return this.backend;
    }
    /**
     * Diagnostic settings for incoming/outgoing HTTP messages to the Gateway.
     * 
     */
    @OutputExport(name="frontend", type=PipelineDiagnosticSettingsResponse.class, parameters={})
    private Output</* @Nullable */ PipelineDiagnosticSettingsResponse> frontend;

    /**
     * @return Diagnostic settings for incoming/outgoing HTTP messages to the Gateway.
     * 
     */
    public Output</* @Nullable */ PipelineDiagnosticSettingsResponse> getFrontend() {
        return this.frontend;
    }
    /**
     * Sets correlation protocol to use for Application Insights diagnostics.
     * 
     */
    @OutputExport(name="httpCorrelationProtocol", type=String.class, parameters={})
    private Output</* @Nullable */ String> httpCorrelationProtocol;

    /**
     * @return Sets correlation protocol to use for Application Insights diagnostics.
     * 
     */
    public Output</* @Nullable */ String> getHttpCorrelationProtocol() {
        return this.httpCorrelationProtocol;
    }
    /**
     * Log the ClientIP. Default is false.
     * 
     */
    @OutputExport(name="logClientIp", type=Boolean.class, parameters={})
    private Output</* @Nullable */ Boolean> logClientIp;

    /**
     * @return Log the ClientIP. Default is false.
     * 
     */
    public Output</* @Nullable */ Boolean> getLogClientIp() {
        return this.logClientIp;
    }
    /**
     * Resource Id of a target logger.
     * 
     */
    @OutputExport(name="loggerId", type=String.class, parameters={})
    private Output<String> loggerId;

    /**
     * @return Resource Id of a target logger.
     * 
     */
    public Output<String> getLoggerId() {
        return this.loggerId;
    }
    /**
     * Resource name.
     * 
     */
    @OutputExport(name="name", type=String.class, parameters={})
    private Output<String> name;

    /**
     * @return Resource name.
     * 
     */
    public Output<String> getName() {
        return this.name;
    }
    /**
     * The format of the Operation Name for Application Insights telemetries. Default is Name.
     * 
     */
    @OutputExport(name="operationNameFormat", type=String.class, parameters={})
    private Output</* @Nullable */ String> operationNameFormat;

    /**
     * @return The format of the Operation Name for Application Insights telemetries. Default is Name.
     * 
     */
    public Output</* @Nullable */ String> getOperationNameFormat() {
        return this.operationNameFormat;
    }
    /**
     * Sampling settings for Diagnostic.
     * 
     */
    @OutputExport(name="sampling", type=SamplingSettingsResponse.class, parameters={})
    private Output</* @Nullable */ SamplingSettingsResponse> sampling;

    /**
     * @return Sampling settings for Diagnostic.
     * 
     */
    public Output</* @Nullable */ SamplingSettingsResponse> getSampling() {
        return this.sampling;
    }
    /**
     * Resource type for API Management resource.
     * 
     */
    @OutputExport(name="type", type=String.class, parameters={})
    private Output<String> type;

    /**
     * @return Resource type for API Management resource.
     * 
     */
    public Output<String> getType() {
        return this.type;
    }
    /**
     * The verbosity level applied to traces emitted by trace policies.
     * 
     */
    @OutputExport(name="verbosity", type=String.class, parameters={})
    private Output</* @Nullable */ String> verbosity;

    /**
     * @return The verbosity level applied to traces emitted by trace policies.
     * 
     */
    public Output</* @Nullable */ String> getVerbosity() {
        return this.verbosity;
    }

    public interface BuilderApplicator {
        public void apply(ApiDiagnosticArgs.Builder a);
    }
    private static io.pulumi.azurenative.apimanagement.ApiDiagnosticArgs buildArgs(BuilderApplicator argsBuilder) {
        final var builder = io.pulumi.azurenative.apimanagement.ApiDiagnosticArgs.builder();
        argsBuilder.apply(builder);
        return builder.build();
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param argsBuilder A function that configures a passed builder.
     */
    public ApiDiagnostic(String name, BuilderApplicator argsBuilder) {
        this(name, buildArgs(argsBuilder), null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public ApiDiagnostic(String name) {
        this(name, ApiDiagnosticArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public ApiDiagnostic(String name, ApiDiagnosticArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public ApiDiagnostic(String name, ApiDiagnosticArgs args, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("azure-native:apimanagement:ApiDiagnostic", name, args == null ? ApiDiagnosticArgs.Empty : args, makeResourceOptions(options, Input.empty()));
    }

    private ApiDiagnostic(String name, Input<String> id, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("azure-native:apimanagement:ApiDiagnostic", name, null, makeResourceOptions(options, id));
    }

    private static io.pulumi.resources.CustomResourceOptions makeResourceOptions(@Nullable io.pulumi.resources.CustomResourceOptions options, @Nullable Input<String> id) {
        var defaultOptions = io.pulumi.resources.CustomResourceOptions.builder()
            .setVersion(Utilities.getVersion())
            .setAliases(List.of(
                Input.of(Alias.builder().setType("azure-native:apimanagement/v20170301:ApiDiagnostic").build()),
                Input.of(Alias.builder().setType("azure-native:apimanagement/v20180101:ApiDiagnostic").build()),
                Input.of(Alias.builder().setType("azure-native:apimanagement/v20180601preview:ApiDiagnostic").build()),
                Input.of(Alias.builder().setType("azure-native:apimanagement/v20190101:ApiDiagnostic").build()),
                Input.of(Alias.builder().setType("azure-native:apimanagement/v20191201:ApiDiagnostic").build()),
                Input.of(Alias.builder().setType("azure-native:apimanagement/v20191201preview:ApiDiagnostic").build()),
                Input.of(Alias.builder().setType("azure-native:apimanagement/v20200601preview:ApiDiagnostic").build()),
                Input.of(Alias.builder().setType("azure-native:apimanagement/v20201201:ApiDiagnostic").build()),
                Input.of(Alias.builder().setType("azure-native:apimanagement/v20210101preview:ApiDiagnostic").build()),
                Input.of(Alias.builder().setType("azure-native:apimanagement/v20210401preview:ApiDiagnostic").build()),
                Input.of(Alias.builder().setType("azure-native:apimanagement/v20210801:ApiDiagnostic").build())
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
    public static ApiDiagnostic get(String name, Input<String> id, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        return new ApiDiagnostic(name, id, options);
    }
}
