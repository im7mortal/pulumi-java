// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.apimanagement;

import io.pulumi.azurenative.Utilities;
import io.pulumi.azurenative.apimanagement.AuthorizationServerArgs;
import io.pulumi.azurenative.apimanagement.outputs.TokenBodyParameterContractResponse;
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
 * External OAuth authorization server settings.
 * API Version: 2020-12-01.
 * 
 * ## Example Usage
 * 
 * ## Import
 * 
 * An existing resource can be imported using its type token, name, and identifier, e.g.
 * 
 * ```sh
 * $ pulumi import azure-native:apimanagement:AuthorizationServer newauthServer /subscriptions/subid/resourceGroups/rg1/providers/Microsoft.ApiManagement/service/apimService1/authorizationServers/newauthServer 
 * ```
 * 
 */
@ResourceType(type="azure-native:apimanagement:AuthorizationServer")
public class AuthorizationServer extends io.pulumi.resources.CustomResource {
    /**
     * OAuth authorization endpoint. See http://tools.ietf.org/html/rfc6749#section-3.2.
     * 
     */
    @OutputExport(name="authorizationEndpoint", type=String.class, parameters={})
    private Output<String> authorizationEndpoint;

    /**
     * @return OAuth authorization endpoint. See http://tools.ietf.org/html/rfc6749#section-3.2.
     * 
     */
    public Output<String> getAuthorizationEndpoint() {
        return this.authorizationEndpoint;
    }
    /**
     * HTTP verbs supported by the authorization endpoint. GET must be always present. POST is optional.
     * 
     */
    @OutputExport(name="authorizationMethods", type=List.class, parameters={String.class})
    private Output</* @Nullable */ List<String>> authorizationMethods;

    /**
     * @return HTTP verbs supported by the authorization endpoint. GET must be always present. POST is optional.
     * 
     */
    public Output</* @Nullable */ List<String>> getAuthorizationMethods() {
        return this.authorizationMethods;
    }
    /**
     * Specifies the mechanism by which access token is passed to the API.
     * 
     */
    @OutputExport(name="bearerTokenSendingMethods", type=List.class, parameters={String.class})
    private Output</* @Nullable */ List<String>> bearerTokenSendingMethods;

    /**
     * @return Specifies the mechanism by which access token is passed to the API.
     * 
     */
    public Output</* @Nullable */ List<String>> getBearerTokenSendingMethods() {
        return this.bearerTokenSendingMethods;
    }
    /**
     * Method of authentication supported by the token endpoint of this authorization server. Possible values are Basic and/or Body. When Body is specified, client credentials and other parameters are passed within the request body in the application/x-www-form-urlencoded format.
     * 
     */
    @OutputExport(name="clientAuthenticationMethod", type=List.class, parameters={String.class})
    private Output</* @Nullable */ List<String>> clientAuthenticationMethod;

    /**
     * @return Method of authentication supported by the token endpoint of this authorization server. Possible values are Basic and/or Body. When Body is specified, client credentials and other parameters are passed within the request body in the application/x-www-form-urlencoded format.
     * 
     */
    public Output</* @Nullable */ List<String>> getClientAuthenticationMethod() {
        return this.clientAuthenticationMethod;
    }
    /**
     * Client or app id registered with this authorization server.
     * 
     */
    @OutputExport(name="clientId", type=String.class, parameters={})
    private Output<String> clientId;

    /**
     * @return Client or app id registered with this authorization server.
     * 
     */
    public Output<String> getClientId() {
        return this.clientId;
    }
    /**
     * Optional reference to a page where client or app registration for this authorization server is performed. Contains absolute URL to entity being referenced.
     * 
     */
    @OutputExport(name="clientRegistrationEndpoint", type=String.class, parameters={})
    private Output<String> clientRegistrationEndpoint;

    /**
     * @return Optional reference to a page where client or app registration for this authorization server is performed. Contains absolute URL to entity being referenced.
     * 
     */
    public Output<String> getClientRegistrationEndpoint() {
        return this.clientRegistrationEndpoint;
    }
    /**
     * Client or app secret registered with this authorization server. This property will not be filled on 'GET' operations! Use '/listSecrets' POST request to get the value.
     * 
     */
    @OutputExport(name="clientSecret", type=String.class, parameters={})
    private Output</* @Nullable */ String> clientSecret;

    /**
     * @return Client or app secret registered with this authorization server. This property will not be filled on 'GET' operations! Use '/listSecrets' POST request to get the value.
     * 
     */
    public Output</* @Nullable */ String> getClientSecret() {
        return this.clientSecret;
    }
    /**
     * Access token scope that is going to be requested by default. Can be overridden at the API level. Should be provided in the form of a string containing space-delimited values.
     * 
     */
    @OutputExport(name="defaultScope", type=String.class, parameters={})
    private Output</* @Nullable */ String> defaultScope;

    /**
     * @return Access token scope that is going to be requested by default. Can be overridden at the API level. Should be provided in the form of a string containing space-delimited values.
     * 
     */
    public Output</* @Nullable */ String> getDefaultScope() {
        return this.defaultScope;
    }
    /**
     * Description of the authorization server. Can contain HTML formatting tags.
     * 
     */
    @OutputExport(name="description", type=String.class, parameters={})
    private Output</* @Nullable */ String> description;

    /**
     * @return Description of the authorization server. Can contain HTML formatting tags.
     * 
     */
    public Output</* @Nullable */ String> getDescription() {
        return this.description;
    }
    /**
     * User-friendly authorization server name.
     * 
     */
    @OutputExport(name="displayName", type=String.class, parameters={})
    private Output<String> displayName;

    /**
     * @return User-friendly authorization server name.
     * 
     */
    public Output<String> getDisplayName() {
        return this.displayName;
    }
    /**
     * Form of an authorization grant, which the client uses to request the access token.
     * 
     */
    @OutputExport(name="grantTypes", type=List.class, parameters={String.class})
    private Output<List<String>> grantTypes;

    /**
     * @return Form of an authorization grant, which the client uses to request the access token.
     * 
     */
    public Output<List<String>> getGrantTypes() {
        return this.grantTypes;
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
     * Can be optionally specified when resource owner password grant type is supported by this authorization server. Default resource owner password.
     * 
     */
    @OutputExport(name="resourceOwnerPassword", type=String.class, parameters={})
    private Output</* @Nullable */ String> resourceOwnerPassword;

    /**
     * @return Can be optionally specified when resource owner password grant type is supported by this authorization server. Default resource owner password.
     * 
     */
    public Output</* @Nullable */ String> getResourceOwnerPassword() {
        return this.resourceOwnerPassword;
    }
    /**
     * Can be optionally specified when resource owner password grant type is supported by this authorization server. Default resource owner username.
     * 
     */
    @OutputExport(name="resourceOwnerUsername", type=String.class, parameters={})
    private Output</* @Nullable */ String> resourceOwnerUsername;

    /**
     * @return Can be optionally specified when resource owner password grant type is supported by this authorization server. Default resource owner username.
     * 
     */
    public Output</* @Nullable */ String> getResourceOwnerUsername() {
        return this.resourceOwnerUsername;
    }
    /**
     * If true, authorization server will include state parameter from the authorization request to its response. Client may use state parameter to raise protocol security.
     * 
     */
    @OutputExport(name="supportState", type=Boolean.class, parameters={})
    private Output</* @Nullable */ Boolean> supportState;

    /**
     * @return If true, authorization server will include state parameter from the authorization request to its response. Client may use state parameter to raise protocol security.
     * 
     */
    public Output</* @Nullable */ Boolean> getSupportState() {
        return this.supportState;
    }
    /**
     * Additional parameters required by the token endpoint of this authorization server represented as an array of JSON objects with name and value string properties, i.e. {"name" : "name value", "value": "a value"}.
     * 
     */
    @OutputExport(name="tokenBodyParameters", type=List.class, parameters={TokenBodyParameterContractResponse.class})
    private Output</* @Nullable */ List<TokenBodyParameterContractResponse>> tokenBodyParameters;

    /**
     * @return Additional parameters required by the token endpoint of this authorization server represented as an array of JSON objects with name and value string properties, i.e. {"name" : "name value", "value": "a value"}.
     * 
     */
    public Output</* @Nullable */ List<TokenBodyParameterContractResponse>> getTokenBodyParameters() {
        return this.tokenBodyParameters;
    }
    /**
     * OAuth token endpoint. Contains absolute URI to entity being referenced.
     * 
     */
    @OutputExport(name="tokenEndpoint", type=String.class, parameters={})
    private Output</* @Nullable */ String> tokenEndpoint;

    /**
     * @return OAuth token endpoint. Contains absolute URI to entity being referenced.
     * 
     */
    public Output</* @Nullable */ String> getTokenEndpoint() {
        return this.tokenEndpoint;
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

    public interface BuilderApplicator {
        public void apply(AuthorizationServerArgs.Builder a);
    }
    private static io.pulumi.azurenative.apimanagement.AuthorizationServerArgs buildArgs(BuilderApplicator argsBuilder) {
        final var builder = io.pulumi.azurenative.apimanagement.AuthorizationServerArgs.builder();
        argsBuilder.apply(builder);
        return builder.build();
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param argsBuilder A function that configures a passed builder.
     */
    public AuthorizationServer(String name, BuilderApplicator argsBuilder) {
        this(name, buildArgs(argsBuilder), null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public AuthorizationServer(String name) {
        this(name, AuthorizationServerArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public AuthorizationServer(String name, AuthorizationServerArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public AuthorizationServer(String name, AuthorizationServerArgs args, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("azure-native:apimanagement:AuthorizationServer", name, args == null ? AuthorizationServerArgs.Empty : args, makeResourceOptions(options, Input.empty()));
    }

    private AuthorizationServer(String name, Input<String> id, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("azure-native:apimanagement:AuthorizationServer", name, null, makeResourceOptions(options, id));
    }

    private static io.pulumi.resources.CustomResourceOptions makeResourceOptions(@Nullable io.pulumi.resources.CustomResourceOptions options, @Nullable Input<String> id) {
        var defaultOptions = io.pulumi.resources.CustomResourceOptions.builder()
            .setVersion(Utilities.getVersion())
            .setAliases(List.of(
                Input.of(Alias.builder().setType("azure-native:apimanagement/v20160707:AuthorizationServer").build()),
                Input.of(Alias.builder().setType("azure-native:apimanagement/v20161010:AuthorizationServer").build()),
                Input.of(Alias.builder().setType("azure-native:apimanagement/v20170301:AuthorizationServer").build()),
                Input.of(Alias.builder().setType("azure-native:apimanagement/v20180101:AuthorizationServer").build()),
                Input.of(Alias.builder().setType("azure-native:apimanagement/v20180601preview:AuthorizationServer").build()),
                Input.of(Alias.builder().setType("azure-native:apimanagement/v20190101:AuthorizationServer").build()),
                Input.of(Alias.builder().setType("azure-native:apimanagement/v20191201:AuthorizationServer").build()),
                Input.of(Alias.builder().setType("azure-native:apimanagement/v20191201preview:AuthorizationServer").build()),
                Input.of(Alias.builder().setType("azure-native:apimanagement/v20200601preview:AuthorizationServer").build()),
                Input.of(Alias.builder().setType("azure-native:apimanagement/v20201201:AuthorizationServer").build()),
                Input.of(Alias.builder().setType("azure-native:apimanagement/v20210101preview:AuthorizationServer").build()),
                Input.of(Alias.builder().setType("azure-native:apimanagement/v20210401preview:AuthorizationServer").build()),
                Input.of(Alias.builder().setType("azure-native:apimanagement/v20210801:AuthorizationServer").build())
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
    public static AuthorizationServer get(String name, Input<String> id, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        return new AuthorizationServer(name, id, options);
    }
}
