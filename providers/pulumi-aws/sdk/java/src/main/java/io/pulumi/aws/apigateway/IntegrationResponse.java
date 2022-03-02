// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.apigateway;

import io.pulumi.aws.Utilities;
import io.pulumi.aws.apigateway.IntegrationResponseArgs;
import io.pulumi.aws.apigateway.inputs.IntegrationResponseState;
import io.pulumi.core.Input;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.OutputExport;
import io.pulumi.core.annotations.ResourceType;
import java.lang.String;
import java.util.Map;
import javax.annotation.Nullable;

/**
 * Provides an HTTP Method Integration Response for an API Gateway Resource.
 * 
 * > **Note:** Depends on having `aws.apigateway.Integration` inside your rest api. To ensure this
 * you might need to add an explicit `depends_on` for clean runs.
 * 
 * ## Example Usage
 * 
 * ## Import
 * 
 * `aws_api_gateway_integration_response` can be imported using `REST-API-ID/RESOURCE-ID/HTTP-METHOD/STATUS-CODE`, e.g.,
 * 
 * ```sh
 *  $ pulumi import aws:apigateway/integrationResponse:IntegrationResponse example 12345abcde/67890fghij/GET/200
 * ```
 * 
 */
@ResourceType(type="aws:apigateway/integrationResponse:IntegrationResponse")
public class IntegrationResponse extends io.pulumi.resources.CustomResource {
    /**
     * Specifies how to handle request payload content type conversions. Supported values are `CONVERT_TO_BINARY` and `CONVERT_TO_TEXT`. If this property is not defined, the response payload will be passed through from the integration response to the method response without modification.
     * 
     */
    @OutputExport(name="contentHandling", type=String.class, parameters={})
    private Output</* @Nullable */ String> contentHandling;

    /**
     * @return Specifies how to handle request payload content type conversions. Supported values are `CONVERT_TO_BINARY` and `CONVERT_TO_TEXT`. If this property is not defined, the response payload will be passed through from the integration response to the method response without modification.
     * 
     */
    public Output</* @Nullable */ String> getContentHandling() {
        return this.contentHandling;
    }
    /**
     * The HTTP method (`GET`, `POST`, `PUT`, `DELETE`, `HEAD`, `OPTIONS`, `ANY`)
     * 
     */
    @OutputExport(name="httpMethod", type=String.class, parameters={})
    private Output<String> httpMethod;

    /**
     * @return The HTTP method (`GET`, `POST`, `PUT`, `DELETE`, `HEAD`, `OPTIONS`, `ANY`)
     * 
     */
    public Output<String> getHttpMethod() {
        return this.httpMethod;
    }
    /**
     * The API resource ID
     * 
     */
    @OutputExport(name="resourceId", type=String.class, parameters={})
    private Output<String> resourceId;

    /**
     * @return The API resource ID
     * 
     */
    public Output<String> getResourceId() {
        return this.resourceId;
    }
    /**
     * A map of response parameters that can be read from the backend response.
     * For example: `response_parameters = { "method.response.header.X-Some-Header" = "integration.response.header.X-Some-Other-Header" }`
     * 
     */
    @OutputExport(name="responseParameters", type=Map.class, parameters={String.class, String.class})
    private Output</* @Nullable */ Map<String,String>> responseParameters;

    /**
     * @return A map of response parameters that can be read from the backend response.
     * For example: `response_parameters = { "method.response.header.X-Some-Header" = "integration.response.header.X-Some-Other-Header" }`
     * 
     */
    public Output</* @Nullable */ Map<String,String>> getResponseParameters() {
        return this.responseParameters;
    }
    /**
     * A map specifying the templates used to transform the integration response body
     * 
     */
    @OutputExport(name="responseTemplates", type=Map.class, parameters={String.class, String.class})
    private Output</* @Nullable */ Map<String,String>> responseTemplates;

    /**
     * @return A map specifying the templates used to transform the integration response body
     * 
     */
    public Output</* @Nullable */ Map<String,String>> getResponseTemplates() {
        return this.responseTemplates;
    }
    /**
     * The ID of the associated REST API
     * 
     */
    @OutputExport(name="restApi", type=String.class, parameters={})
    private Output<String> restApi;

    /**
     * @return The ID of the associated REST API
     * 
     */
    public Output<String> getRestApi() {
        return this.restApi;
    }
    /**
     * Specifies the regular expression pattern used to choose
     * an integration response based on the response from the backend. Omit configuring this to make the integration the default one.
     * If the backend is an `AWS` Lambda function, the AWS Lambda function error header is matched.
     * For all other `HTTP` and `AWS` backends, the HTTP status code is matched.
     * 
     */
    @OutputExport(name="selectionPattern", type=String.class, parameters={})
    private Output</* @Nullable */ String> selectionPattern;

    /**
     * @return Specifies the regular expression pattern used to choose
     * an integration response based on the response from the backend. Omit configuring this to make the integration the default one.
     * If the backend is an `AWS` Lambda function, the AWS Lambda function error header is matched.
     * For all other `HTTP` and `AWS` backends, the HTTP status code is matched.
     * 
     */
    public Output</* @Nullable */ String> getSelectionPattern() {
        return this.selectionPattern;
    }
    /**
     * The HTTP status code
     * 
     */
    @OutputExport(name="statusCode", type=String.class, parameters={})
    private Output<String> statusCode;

    /**
     * @return The HTTP status code
     * 
     */
    public Output<String> getStatusCode() {
        return this.statusCode;
    }

    public interface BuilderApplicator {
        public void apply(IntegrationResponseArgs.Builder a);
    }
    private static io.pulumi.aws.apigateway.IntegrationResponseArgs buildArgs(BuilderApplicator argsBuilder) {
        final var builder = io.pulumi.aws.apigateway.IntegrationResponseArgs.builder();
        argsBuilder.apply(builder);
        return builder.build();
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param argsBuilder A function that configures a passed builder.
     */
    public IntegrationResponse(String name, BuilderApplicator argsBuilder) {
        this(name, buildArgs(argsBuilder), null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public IntegrationResponse(String name) {
        this(name, IntegrationResponseArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public IntegrationResponse(String name, IntegrationResponseArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public IntegrationResponse(String name, IntegrationResponseArgs args, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("aws:apigateway/integrationResponse:IntegrationResponse", name, args == null ? IntegrationResponseArgs.Empty : args, makeResourceOptions(options, Input.empty()));
    }

    private IntegrationResponse(String name, Input<String> id, @Nullable IntegrationResponseState state, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("aws:apigateway/integrationResponse:IntegrationResponse", name, state, makeResourceOptions(options, id));
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
    public static IntegrationResponse get(String name, Input<String> id, @Nullable IntegrationResponseState state, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        return new IntegrationResponse(name, id, state, options);
    }
}
