// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.apigateway;

import io.pulumi.awsnative.Utilities;
import io.pulumi.awsnative.apigateway.AuthorizerArgs;
import io.pulumi.core.Input;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.OutputExport;
import io.pulumi.core.annotations.ResourceType;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import javax.annotation.Nullable;

/**
 * Represents an authorization layer for methods. If enabled on a method, API Gateway will activate the authorizer when a client calls the method.
 * 
 */
@ResourceType(type="aws-native:apigateway:Authorizer")
public class Authorizer extends io.pulumi.resources.CustomResource {
    /**
     * Optional customer-defined field, used in OpenAPI imports and exports without functional impact.
     * 
     */
    @OutputExport(name="authType", type=String.class, parameters={})
    private Output</* @Nullable */ String> authType;

    /**
     * @return Optional customer-defined field, used in OpenAPI imports and exports without functional impact.
     * 
     */
    public Output</* @Nullable */ String> getAuthType() {
        return this.authType;
    }
    /**
     * Specifies the required credentials as an IAM role for API Gateway to invoke the authorizer.
     * 
     */
    @OutputExport(name="authorizerCredentials", type=String.class, parameters={})
    private Output</* @Nullable */ String> authorizerCredentials;

    /**
     * @return Specifies the required credentials as an IAM role for API Gateway to invoke the authorizer.
     * 
     */
    public Output</* @Nullable */ String> getAuthorizerCredentials() {
        return this.authorizerCredentials;
    }
    @OutputExport(name="authorizerId", type=String.class, parameters={})
    private Output<String> authorizerId;

    public Output<String> getAuthorizerId() {
        return this.authorizerId;
    }
    /**
     * The TTL in seconds of cached authorizer results.
     * 
     */
    @OutputExport(name="authorizerResultTtlInSeconds", type=Integer.class, parameters={})
    private Output</* @Nullable */ Integer> authorizerResultTtlInSeconds;

    /**
     * @return The TTL in seconds of cached authorizer results.
     * 
     */
    public Output</* @Nullable */ Integer> getAuthorizerResultTtlInSeconds() {
        return this.authorizerResultTtlInSeconds;
    }
    /**
     * Specifies the authorizer's Uniform Resource Identifier (URI).
     * 
     */
    @OutputExport(name="authorizerUri", type=String.class, parameters={})
    private Output</* @Nullable */ String> authorizerUri;

    /**
     * @return Specifies the authorizer's Uniform Resource Identifier (URI).
     * 
     */
    public Output</* @Nullable */ String> getAuthorizerUri() {
        return this.authorizerUri;
    }
    /**
     * The identity source for which authorization is requested.
     * 
     */
    @OutputExport(name="identitySource", type=String.class, parameters={})
    private Output</* @Nullable */ String> identitySource;

    /**
     * @return The identity source for which authorization is requested.
     * 
     */
    public Output</* @Nullable */ String> getIdentitySource() {
        return this.identitySource;
    }
    /**
     * A validation expression for the incoming identity token.
     * 
     */
    @OutputExport(name="identityValidationExpression", type=String.class, parameters={})
    private Output</* @Nullable */ String> identityValidationExpression;

    /**
     * @return A validation expression for the incoming identity token.
     * 
     */
    public Output</* @Nullable */ String> getIdentityValidationExpression() {
        return this.identityValidationExpression;
    }
    /**
     * The name of the authorizer.
     * 
     */
    @OutputExport(name="name", type=String.class, parameters={})
    private Output<String> name;

    /**
     * @return The name of the authorizer.
     * 
     */
    public Output<String> getName() {
        return this.name;
    }
    /**
     * A list of the Amazon Cognito user pool ARNs for the COGNITO_USER_POOLS authorizer.
     * 
     */
    @OutputExport(name="providerARNs", type=List.class, parameters={String.class})
    private Output</* @Nullable */ List<String>> providerARNs;

    /**
     * @return A list of the Amazon Cognito user pool ARNs for the COGNITO_USER_POOLS authorizer.
     * 
     */
    public Output</* @Nullable */ List<String>> getProviderARNs() {
        return this.providerARNs;
    }
    /**
     * The identifier of the API.
     * 
     */
    @OutputExport(name="restApiId", type=String.class, parameters={})
    private Output<String> restApiId;

    /**
     * @return The identifier of the API.
     * 
     */
    public Output<String> getRestApiId() {
        return this.restApiId;
    }
    /**
     * The authorizer type.
     * 
     */
    @OutputExport(name="type", type=String.class, parameters={})
    private Output<String> type;

    /**
     * @return The authorizer type.
     * 
     */
    public Output<String> getType() {
        return this.type;
    }

    public interface BuilderApplicator {
        public void apply(AuthorizerArgs.Builder a);
    }
    private static io.pulumi.awsnative.apigateway.AuthorizerArgs buildArgs(BuilderApplicator argsBuilder) {
        final var builder = io.pulumi.awsnative.apigateway.AuthorizerArgs.builder();
        argsBuilder.apply(builder);
        return builder.build();
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param argsBuilder A function that configures a passed builder.
     */
    public Authorizer(String name, BuilderApplicator argsBuilder) {
        this(name, buildArgs(argsBuilder), null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public Authorizer(String name) {
        this(name, AuthorizerArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public Authorizer(String name, AuthorizerArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public Authorizer(String name, AuthorizerArgs args, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("aws-native:apigateway:Authorizer", name, args == null ? AuthorizerArgs.Empty : args, makeResourceOptions(options, Input.empty()));
    }

    private Authorizer(String name, Input<String> id, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("aws-native:apigateway:Authorizer", name, null, makeResourceOptions(options, id));
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
     * @param options Optional settings to control the behavior of the CustomResource.
     */
    public static Authorizer get(String name, Input<String> id, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        return new Authorizer(name, id, options);
    }
}
