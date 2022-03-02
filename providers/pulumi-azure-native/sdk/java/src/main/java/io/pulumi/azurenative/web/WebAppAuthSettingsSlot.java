// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.web;

import io.pulumi.azurenative.Utilities;
import io.pulumi.azurenative.web.WebAppAuthSettingsSlotArgs;
import io.pulumi.core.Alias;
import io.pulumi.core.Input;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.OutputExport;
import io.pulumi.core.annotations.ResourceType;
import java.lang.Boolean;
import java.lang.Double;
import java.lang.String;
import java.util.List;
import javax.annotation.Nullable;

/**
 * Configuration settings for the Azure App Service Authentication / Authorization feature.
 * API Version: 2020-12-01.
 * ## Import
 * 
 * An existing resource can be imported using its type token, name, and identifier, e.g.
 * 
 * ```sh
 * $ pulumi import azure-native:web:WebAppAuthSettingsSlot myresource1 /subscriptions/{subscriptionId}/resourceGroups/{resourceGroupName}/providers/Microsoft.Web/sites/{name}/slots/{slot}/config/authsettings 
 * ```
 * 
 */
@ResourceType(type="azure-native:web:WebAppAuthSettingsSlot")
public class WebAppAuthSettingsSlot extends io.pulumi.resources.CustomResource {
    /**
     * Gets a JSON string containing the Azure AD Acl settings.
     * 
     */
    @OutputExport(name="aadClaimsAuthorization", type=String.class, parameters={})
    private Output</* @Nullable */ String> aadClaimsAuthorization;

    /**
     * @return Gets a JSON string containing the Azure AD Acl settings.
     * 
     */
    public Output</* @Nullable */ String> getAadClaimsAuthorization() {
        return this.aadClaimsAuthorization;
    }
    /**
     * Login parameters to send to the OpenID Connect authorization endpoint when
     * a user logs in. Each parameter must be in the form "key=value".
     * 
     */
    @OutputExport(name="additionalLoginParams", type=List.class, parameters={String.class})
    private Output</* @Nullable */ List<String>> additionalLoginParams;

    /**
     * @return Login parameters to send to the OpenID Connect authorization endpoint when
     * a user logs in. Each parameter must be in the form "key=value".
     * 
     */
    public Output</* @Nullable */ List<String>> getAdditionalLoginParams() {
        return this.additionalLoginParams;
    }
    /**
     * Allowed audience values to consider when validating JWTs issued by
     * Azure Active Directory. Note that the <code>ClientID</code> value is always considered an
     * allowed audience, regardless of this setting.
     * 
     */
    @OutputExport(name="allowedAudiences", type=List.class, parameters={String.class})
    private Output</* @Nullable */ List<String>> allowedAudiences;

    /**
     * @return Allowed audience values to consider when validating JWTs issued by
     * Azure Active Directory. Note that the <code>ClientID</code> value is always considered an
     * allowed audience, regardless of this setting.
     * 
     */
    public Output</* @Nullable */ List<String>> getAllowedAudiences() {
        return this.allowedAudiences;
    }
    /**
     * External URLs that can be redirected to as part of logging in or logging out of the app. Note that the query string part of the URL is ignored.
     * This is an advanced setting typically only needed by Windows Store application backends.
     * Note that URLs within the current domain are always implicitly allowed.
     * 
     */
    @OutputExport(name="allowedExternalRedirectUrls", type=List.class, parameters={String.class})
    private Output</* @Nullable */ List<String>> allowedExternalRedirectUrls;

    /**
     * @return External URLs that can be redirected to as part of logging in or logging out of the app. Note that the query string part of the URL is ignored.
     * This is an advanced setting typically only needed by Windows Store application backends.
     * Note that URLs within the current domain are always implicitly allowed.
     * 
     */
    public Output</* @Nullable */ List<String>> getAllowedExternalRedirectUrls() {
        return this.allowedExternalRedirectUrls;
    }
    /**
     * The path of the config file containing auth settings.
     * If the path is relative, base will the site's root directory.
     * 
     */
    @OutputExport(name="authFilePath", type=String.class, parameters={})
    private Output</* @Nullable */ String> authFilePath;

    /**
     * @return The path of the config file containing auth settings.
     * If the path is relative, base will the site's root directory.
     * 
     */
    public Output</* @Nullable */ String> getAuthFilePath() {
        return this.authFilePath;
    }
    /**
     * The Client ID of this relying party application, known as the client_id.
     * This setting is required for enabling OpenID Connection authentication with Azure Active Directory or
     * other 3rd party OpenID Connect providers.
     * More information on OpenID Connect: http://openid.net/specs/openid-connect-core-1_0.html
     * 
     */
    @OutputExport(name="clientId", type=String.class, parameters={})
    private Output</* @Nullable */ String> clientId;

    /**
     * @return The Client ID of this relying party application, known as the client_id.
     * This setting is required for enabling OpenID Connection authentication with Azure Active Directory or
     * other 3rd party OpenID Connect providers.
     * More information on OpenID Connect: http://openid.net/specs/openid-connect-core-1_0.html
     * 
     */
    public Output</* @Nullable */ String> getClientId() {
        return this.clientId;
    }
    /**
     * The Client Secret of this relying party application (in Azure Active Directory, this is also referred to as the Key).
     * This setting is optional. If no client secret is configured, the OpenID Connect implicit auth flow is used to authenticate end users.
     * Otherwise, the OpenID Connect Authorization Code Flow is used to authenticate end users.
     * More information on OpenID Connect: http://openid.net/specs/openid-connect-core-1_0.html
     * 
     */
    @OutputExport(name="clientSecret", type=String.class, parameters={})
    private Output</* @Nullable */ String> clientSecret;

    /**
     * @return The Client Secret of this relying party application (in Azure Active Directory, this is also referred to as the Key).
     * This setting is optional. If no client secret is configured, the OpenID Connect implicit auth flow is used to authenticate end users.
     * Otherwise, the OpenID Connect Authorization Code Flow is used to authenticate end users.
     * More information on OpenID Connect: http://openid.net/specs/openid-connect-core-1_0.html
     * 
     */
    public Output</* @Nullable */ String> getClientSecret() {
        return this.clientSecret;
    }
    /**
     * An alternative to the client secret, that is the thumbprint of a certificate used for signing purposes. This property acts as
     * a replacement for the Client Secret. It is also optional.
     * 
     */
    @OutputExport(name="clientSecretCertificateThumbprint", type=String.class, parameters={})
    private Output</* @Nullable */ String> clientSecretCertificateThumbprint;

    /**
     * @return An alternative to the client secret, that is the thumbprint of a certificate used for signing purposes. This property acts as
     * a replacement for the Client Secret. It is also optional.
     * 
     */
    public Output</* @Nullable */ String> getClientSecretCertificateThumbprint() {
        return this.clientSecretCertificateThumbprint;
    }
    /**
     * The app setting name that contains the client secret of the relying party application.
     * 
     */
    @OutputExport(name="clientSecretSettingName", type=String.class, parameters={})
    private Output</* @Nullable */ String> clientSecretSettingName;

    /**
     * @return The app setting name that contains the client secret of the relying party application.
     * 
     */
    public Output</* @Nullable */ String> getClientSecretSettingName() {
        return this.clientSecretSettingName;
    }
    /**
     * The ConfigVersion of the Authentication / Authorization feature in use for the current app.
     * The setting in this value can control the behavior of the control plane for Authentication / Authorization.
     * 
     */
    @OutputExport(name="configVersion", type=String.class, parameters={})
    private Output</* @Nullable */ String> configVersion;

    /**
     * @return The ConfigVersion of the Authentication / Authorization feature in use for the current app.
     * The setting in this value can control the behavior of the control plane for Authentication / Authorization.
     * 
     */
    public Output</* @Nullable */ String> getConfigVersion() {
        return this.configVersion;
    }
    /**
     * The default authentication provider to use when multiple providers are configured.
     * This setting is only needed if multiple providers are configured and the unauthenticated client
     * action is set to "RedirectToLoginPage".
     * 
     */
    @OutputExport(name="defaultProvider", type=String.class, parameters={})
    private Output</* @Nullable */ String> defaultProvider;

    /**
     * @return The default authentication provider to use when multiple providers are configured.
     * This setting is only needed if multiple providers are configured and the unauthenticated client
     * action is set to "RedirectToLoginPage".
     * 
     */
    public Output</* @Nullable */ String> getDefaultProvider() {
        return this.defaultProvider;
    }
    /**
     * <code>true</code> if the Authentication / Authorization feature is enabled for the current app; otherwise, <code>false</code>.
     * 
     */
    @OutputExport(name="enabled", type=Boolean.class, parameters={})
    private Output</* @Nullable */ Boolean> enabled;

    /**
     * @return <code>true</code> if the Authentication / Authorization feature is enabled for the current app; otherwise, <code>false</code>.
     * 
     */
    public Output</* @Nullable */ Boolean> getEnabled() {
        return this.enabled;
    }
    /**
     * The App ID of the Facebook app used for login.
     * This setting is required for enabling Facebook Login.
     * Facebook Login documentation: https://developers.facebook.com/docs/facebook-login
     * 
     */
    @OutputExport(name="facebookAppId", type=String.class, parameters={})
    private Output</* @Nullable */ String> facebookAppId;

    /**
     * @return The App ID of the Facebook app used for login.
     * This setting is required for enabling Facebook Login.
     * Facebook Login documentation: https://developers.facebook.com/docs/facebook-login
     * 
     */
    public Output</* @Nullable */ String> getFacebookAppId() {
        return this.facebookAppId;
    }
    /**
     * The App Secret of the Facebook app used for Facebook Login.
     * This setting is required for enabling Facebook Login.
     * Facebook Login documentation: https://developers.facebook.com/docs/facebook-login
     * 
     */
    @OutputExport(name="facebookAppSecret", type=String.class, parameters={})
    private Output</* @Nullable */ String> facebookAppSecret;

    /**
     * @return The App Secret of the Facebook app used for Facebook Login.
     * This setting is required for enabling Facebook Login.
     * Facebook Login documentation: https://developers.facebook.com/docs/facebook-login
     * 
     */
    public Output</* @Nullable */ String> getFacebookAppSecret() {
        return this.facebookAppSecret;
    }
    /**
     * The app setting name that contains the app secret used for Facebook Login.
     * 
     */
    @OutputExport(name="facebookAppSecretSettingName", type=String.class, parameters={})
    private Output</* @Nullable */ String> facebookAppSecretSettingName;

    /**
     * @return The app setting name that contains the app secret used for Facebook Login.
     * 
     */
    public Output</* @Nullable */ String> getFacebookAppSecretSettingName() {
        return this.facebookAppSecretSettingName;
    }
    /**
     * The OAuth 2.0 scopes that will be requested as part of Facebook Login authentication.
     * This setting is optional.
     * Facebook Login documentation: https://developers.facebook.com/docs/facebook-login
     * 
     */
    @OutputExport(name="facebookOAuthScopes", type=List.class, parameters={String.class})
    private Output</* @Nullable */ List<String>> facebookOAuthScopes;

    /**
     * @return The OAuth 2.0 scopes that will be requested as part of Facebook Login authentication.
     * This setting is optional.
     * Facebook Login documentation: https://developers.facebook.com/docs/facebook-login
     * 
     */
    public Output</* @Nullable */ List<String>> getFacebookOAuthScopes() {
        return this.facebookOAuthScopes;
    }
    /**
     * The Client Id of the GitHub app used for login.
     * This setting is required for enabling Github login
     * 
     */
    @OutputExport(name="gitHubClientId", type=String.class, parameters={})
    private Output</* @Nullable */ String> gitHubClientId;

    /**
     * @return The Client Id of the GitHub app used for login.
     * This setting is required for enabling Github login
     * 
     */
    public Output</* @Nullable */ String> getGitHubClientId() {
        return this.gitHubClientId;
    }
    /**
     * The Client Secret of the GitHub app used for Github Login.
     * This setting is required for enabling Github login.
     * 
     */
    @OutputExport(name="gitHubClientSecret", type=String.class, parameters={})
    private Output</* @Nullable */ String> gitHubClientSecret;

    /**
     * @return The Client Secret of the GitHub app used for Github Login.
     * This setting is required for enabling Github login.
     * 
     */
    public Output</* @Nullable */ String> getGitHubClientSecret() {
        return this.gitHubClientSecret;
    }
    /**
     * The app setting name that contains the client secret of the Github
     * app used for GitHub Login.
     * 
     */
    @OutputExport(name="gitHubClientSecretSettingName", type=String.class, parameters={})
    private Output</* @Nullable */ String> gitHubClientSecretSettingName;

    /**
     * @return The app setting name that contains the client secret of the Github
     * app used for GitHub Login.
     * 
     */
    public Output</* @Nullable */ String> getGitHubClientSecretSettingName() {
        return this.gitHubClientSecretSettingName;
    }
    /**
     * The OAuth 2.0 scopes that will be requested as part of GitHub Login authentication.
     * This setting is optional
     * 
     */
    @OutputExport(name="gitHubOAuthScopes", type=List.class, parameters={String.class})
    private Output</* @Nullable */ List<String>> gitHubOAuthScopes;

    /**
     * @return The OAuth 2.0 scopes that will be requested as part of GitHub Login authentication.
     * This setting is optional
     * 
     */
    public Output</* @Nullable */ List<String>> getGitHubOAuthScopes() {
        return this.gitHubOAuthScopes;
    }
    /**
     * The OpenID Connect Client ID for the Google web application.
     * This setting is required for enabling Google Sign-In.
     * Google Sign-In documentation: https://developers.google.com/identity/sign-in/web/
     * 
     */
    @OutputExport(name="googleClientId", type=String.class, parameters={})
    private Output</* @Nullable */ String> googleClientId;

    /**
     * @return The OpenID Connect Client ID for the Google web application.
     * This setting is required for enabling Google Sign-In.
     * Google Sign-In documentation: https://developers.google.com/identity/sign-in/web/
     * 
     */
    public Output</* @Nullable */ String> getGoogleClientId() {
        return this.googleClientId;
    }
    /**
     * The client secret associated with the Google web application.
     * This setting is required for enabling Google Sign-In.
     * Google Sign-In documentation: https://developers.google.com/identity/sign-in/web/
     * 
     */
    @OutputExport(name="googleClientSecret", type=String.class, parameters={})
    private Output</* @Nullable */ String> googleClientSecret;

    /**
     * @return The client secret associated with the Google web application.
     * This setting is required for enabling Google Sign-In.
     * Google Sign-In documentation: https://developers.google.com/identity/sign-in/web/
     * 
     */
    public Output</* @Nullable */ String> getGoogleClientSecret() {
        return this.googleClientSecret;
    }
    /**
     * The app setting name that contains the client secret associated with
     * the Google web application.
     * 
     */
    @OutputExport(name="googleClientSecretSettingName", type=String.class, parameters={})
    private Output</* @Nullable */ String> googleClientSecretSettingName;

    /**
     * @return The app setting name that contains the client secret associated with
     * the Google web application.
     * 
     */
    public Output</* @Nullable */ String> getGoogleClientSecretSettingName() {
        return this.googleClientSecretSettingName;
    }
    /**
     * The OAuth 2.0 scopes that will be requested as part of Google Sign-In authentication.
     * This setting is optional. If not specified, "openid", "profile", and "email" are used as default scopes.
     * Google Sign-In documentation: https://developers.google.com/identity/sign-in/web/
     * 
     */
    @OutputExport(name="googleOAuthScopes", type=List.class, parameters={String.class})
    private Output</* @Nullable */ List<String>> googleOAuthScopes;

    /**
     * @return The OAuth 2.0 scopes that will be requested as part of Google Sign-In authentication.
     * This setting is optional. If not specified, "openid", "profile", and "email" are used as default scopes.
     * Google Sign-In documentation: https://developers.google.com/identity/sign-in/web/
     * 
     */
    public Output</* @Nullable */ List<String>> getGoogleOAuthScopes() {
        return this.googleOAuthScopes;
    }
    /**
     * "true" if the auth config settings should be read from a file,
     * "false" otherwise
     * 
     */
    @OutputExport(name="isAuthFromFile", type=String.class, parameters={})
    private Output</* @Nullable */ String> isAuthFromFile;

    /**
     * @return "true" if the auth config settings should be read from a file,
     * "false" otherwise
     * 
     */
    public Output</* @Nullable */ String> getIsAuthFromFile() {
        return this.isAuthFromFile;
    }
    /**
     * The OpenID Connect Issuer URI that represents the entity which issues access tokens for this application.
     * When using Azure Active Directory, this value is the URI of the directory tenant, e.g. https://sts.windows.net/{tenant-guid}/.
     * This URI is a case-sensitive identifier for the token issuer.
     * More information on OpenID Connect Discovery: http://openid.net/specs/openid-connect-discovery-1_0.html
     * 
     */
    @OutputExport(name="issuer", type=String.class, parameters={})
    private Output</* @Nullable */ String> issuer;

    /**
     * @return The OpenID Connect Issuer URI that represents the entity which issues access tokens for this application.
     * When using Azure Active Directory, this value is the URI of the directory tenant, e.g. https://sts.windows.net/{tenant-guid}/.
     * This URI is a case-sensitive identifier for the token issuer.
     * More information on OpenID Connect Discovery: http://openid.net/specs/openid-connect-discovery-1_0.html
     * 
     */
    public Output</* @Nullable */ String> getIssuer() {
        return this.issuer;
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
     * The OAuth 2.0 client ID that was created for the app used for authentication.
     * This setting is required for enabling Microsoft Account authentication.
     * Microsoft Account OAuth documentation: https://dev.onedrive.com/auth/msa_oauth.htm
     * 
     */
    @OutputExport(name="microsoftAccountClientId", type=String.class, parameters={})
    private Output</* @Nullable */ String> microsoftAccountClientId;

    /**
     * @return The OAuth 2.0 client ID that was created for the app used for authentication.
     * This setting is required for enabling Microsoft Account authentication.
     * Microsoft Account OAuth documentation: https://dev.onedrive.com/auth/msa_oauth.htm
     * 
     */
    public Output</* @Nullable */ String> getMicrosoftAccountClientId() {
        return this.microsoftAccountClientId;
    }
    /**
     * The OAuth 2.0 client secret that was created for the app used for authentication.
     * This setting is required for enabling Microsoft Account authentication.
     * Microsoft Account OAuth documentation: https://dev.onedrive.com/auth/msa_oauth.htm
     * 
     */
    @OutputExport(name="microsoftAccountClientSecret", type=String.class, parameters={})
    private Output</* @Nullable */ String> microsoftAccountClientSecret;

    /**
     * @return The OAuth 2.0 client secret that was created for the app used for authentication.
     * This setting is required for enabling Microsoft Account authentication.
     * Microsoft Account OAuth documentation: https://dev.onedrive.com/auth/msa_oauth.htm
     * 
     */
    public Output</* @Nullable */ String> getMicrosoftAccountClientSecret() {
        return this.microsoftAccountClientSecret;
    }
    /**
     * The app setting name containing the OAuth 2.0 client secret that was created for the
     * app used for authentication.
     * 
     */
    @OutputExport(name="microsoftAccountClientSecretSettingName", type=String.class, parameters={})
    private Output</* @Nullable */ String> microsoftAccountClientSecretSettingName;

    /**
     * @return The app setting name containing the OAuth 2.0 client secret that was created for the
     * app used for authentication.
     * 
     */
    public Output</* @Nullable */ String> getMicrosoftAccountClientSecretSettingName() {
        return this.microsoftAccountClientSecretSettingName;
    }
    /**
     * The OAuth 2.0 scopes that will be requested as part of Microsoft Account authentication.
     * This setting is optional. If not specified, "wl.basic" is used as the default scope.
     * Microsoft Account Scopes and permissions documentation: https://msdn.microsoft.com/en-us/library/dn631845.aspx
     * 
     */
    @OutputExport(name="microsoftAccountOAuthScopes", type=List.class, parameters={String.class})
    private Output</* @Nullable */ List<String>> microsoftAccountOAuthScopes;

    /**
     * @return The OAuth 2.0 scopes that will be requested as part of Microsoft Account authentication.
     * This setting is optional. If not specified, "wl.basic" is used as the default scope.
     * Microsoft Account Scopes and permissions documentation: https://msdn.microsoft.com/en-us/library/dn631845.aspx
     * 
     */
    public Output</* @Nullable */ List<String>> getMicrosoftAccountOAuthScopes() {
        return this.microsoftAccountOAuthScopes;
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
     * The RuntimeVersion of the Authentication / Authorization feature in use for the current app.
     * The setting in this value can control the behavior of certain features in the Authentication / Authorization module.
     * 
     */
    @OutputExport(name="runtimeVersion", type=String.class, parameters={})
    private Output</* @Nullable */ String> runtimeVersion;

    /**
     * @return The RuntimeVersion of the Authentication / Authorization feature in use for the current app.
     * The setting in this value can control the behavior of certain features in the Authentication / Authorization module.
     * 
     */
    public Output</* @Nullable */ String> getRuntimeVersion() {
        return this.runtimeVersion;
    }
    /**
     * The number of hours after session token expiration that a session token can be used to
     * call the token refresh API. The default is 72 hours.
     * 
     */
    @OutputExport(name="tokenRefreshExtensionHours", type=Double.class, parameters={})
    private Output</* @Nullable */ Double> tokenRefreshExtensionHours;

    /**
     * @return The number of hours after session token expiration that a session token can be used to
     * call the token refresh API. The default is 72 hours.
     * 
     */
    public Output</* @Nullable */ Double> getTokenRefreshExtensionHours() {
        return this.tokenRefreshExtensionHours;
    }
    /**
     * <code>true</code> to durably store platform-specific security tokens that are obtained during login flows; otherwise, <code>false</code>.
     *  The default is <code>false</code>.
     * 
     */
    @OutputExport(name="tokenStoreEnabled", type=Boolean.class, parameters={})
    private Output</* @Nullable */ Boolean> tokenStoreEnabled;

    /**
     * @return <code>true</code> to durably store platform-specific security tokens that are obtained during login flows; otherwise, <code>false</code>.
     *  The default is <code>false</code>.
     * 
     */
    public Output</* @Nullable */ Boolean> getTokenStoreEnabled() {
        return this.tokenStoreEnabled;
    }
    /**
     * The OAuth 1.0a consumer key of the Twitter application used for sign-in.
     * This setting is required for enabling Twitter Sign-In.
     * Twitter Sign-In documentation: https://dev.twitter.com/web/sign-in
     * 
     */
    @OutputExport(name="twitterConsumerKey", type=String.class, parameters={})
    private Output</* @Nullable */ String> twitterConsumerKey;

    /**
     * @return The OAuth 1.0a consumer key of the Twitter application used for sign-in.
     * This setting is required for enabling Twitter Sign-In.
     * Twitter Sign-In documentation: https://dev.twitter.com/web/sign-in
     * 
     */
    public Output</* @Nullable */ String> getTwitterConsumerKey() {
        return this.twitterConsumerKey;
    }
    /**
     * The OAuth 1.0a consumer secret of the Twitter application used for sign-in.
     * This setting is required for enabling Twitter Sign-In.
     * Twitter Sign-In documentation: https://dev.twitter.com/web/sign-in
     * 
     */
    @OutputExport(name="twitterConsumerSecret", type=String.class, parameters={})
    private Output</* @Nullable */ String> twitterConsumerSecret;

    /**
     * @return The OAuth 1.0a consumer secret of the Twitter application used for sign-in.
     * This setting is required for enabling Twitter Sign-In.
     * Twitter Sign-In documentation: https://dev.twitter.com/web/sign-in
     * 
     */
    public Output</* @Nullable */ String> getTwitterConsumerSecret() {
        return this.twitterConsumerSecret;
    }
    /**
     * The app setting name that contains the OAuth 1.0a consumer secret of the Twitter
     * application used for sign-in.
     * 
     */
    @OutputExport(name="twitterConsumerSecretSettingName", type=String.class, parameters={})
    private Output</* @Nullable */ String> twitterConsumerSecretSettingName;

    /**
     * @return The app setting name that contains the OAuth 1.0a consumer secret of the Twitter
     * application used for sign-in.
     * 
     */
    public Output</* @Nullable */ String> getTwitterConsumerSecretSettingName() {
        return this.twitterConsumerSecretSettingName;
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
    /**
     * The action to take when an unauthenticated client attempts to access the app.
     * 
     */
    @OutputExport(name="unauthenticatedClientAction", type=String.class, parameters={})
    private Output</* @Nullable */ String> unauthenticatedClientAction;

    /**
     * @return The action to take when an unauthenticated client attempts to access the app.
     * 
     */
    public Output</* @Nullable */ String> getUnauthenticatedClientAction() {
        return this.unauthenticatedClientAction;
    }
    /**
     * Gets a value indicating whether the issuer should be a valid HTTPS url and be validated as such.
     * 
     */
    @OutputExport(name="validateIssuer", type=Boolean.class, parameters={})
    private Output</* @Nullable */ Boolean> validateIssuer;

    /**
     * @return Gets a value indicating whether the issuer should be a valid HTTPS url and be validated as such.
     * 
     */
    public Output</* @Nullable */ Boolean> getValidateIssuer() {
        return this.validateIssuer;
    }

    public interface BuilderApplicator {
        public void apply(WebAppAuthSettingsSlotArgs.Builder a);
    }
    private static io.pulumi.azurenative.web.WebAppAuthSettingsSlotArgs buildArgs(BuilderApplicator argsBuilder) {
        final var builder = io.pulumi.azurenative.web.WebAppAuthSettingsSlotArgs.builder();
        argsBuilder.apply(builder);
        return builder.build();
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param argsBuilder A function that configures a passed builder.
     */
    public WebAppAuthSettingsSlot(String name, BuilderApplicator argsBuilder) {
        this(name, buildArgs(argsBuilder), null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public WebAppAuthSettingsSlot(String name) {
        this(name, WebAppAuthSettingsSlotArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public WebAppAuthSettingsSlot(String name, WebAppAuthSettingsSlotArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public WebAppAuthSettingsSlot(String name, WebAppAuthSettingsSlotArgs args, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("azure-native:web:WebAppAuthSettingsSlot", name, args == null ? WebAppAuthSettingsSlotArgs.Empty : args, makeResourceOptions(options, Input.empty()));
    }

    private WebAppAuthSettingsSlot(String name, Input<String> id, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("azure-native:web:WebAppAuthSettingsSlot", name, null, makeResourceOptions(options, id));
    }

    private static io.pulumi.resources.CustomResourceOptions makeResourceOptions(@Nullable io.pulumi.resources.CustomResourceOptions options, @Nullable Input<String> id) {
        var defaultOptions = io.pulumi.resources.CustomResourceOptions.builder()
            .setVersion(Utilities.getVersion())
            .setAliases(List.of(
                Input.of(Alias.builder().setType("azure-native:web/v20150801:WebAppAuthSettingsSlot").build()),
                Input.of(Alias.builder().setType("azure-native:web/v20160801:WebAppAuthSettingsSlot").build()),
                Input.of(Alias.builder().setType("azure-native:web/v20180201:WebAppAuthSettingsSlot").build()),
                Input.of(Alias.builder().setType("azure-native:web/v20181101:WebAppAuthSettingsSlot").build()),
                Input.of(Alias.builder().setType("azure-native:web/v20190801:WebAppAuthSettingsSlot").build()),
                Input.of(Alias.builder().setType("azure-native:web/v20200601:WebAppAuthSettingsSlot").build()),
                Input.of(Alias.builder().setType("azure-native:web/v20200901:WebAppAuthSettingsSlot").build()),
                Input.of(Alias.builder().setType("azure-native:web/v20201001:WebAppAuthSettingsSlot").build()),
                Input.of(Alias.builder().setType("azure-native:web/v20201201:WebAppAuthSettingsSlot").build()),
                Input.of(Alias.builder().setType("azure-native:web/v20210101:WebAppAuthSettingsSlot").build()),
                Input.of(Alias.builder().setType("azure-native:web/v20210115:WebAppAuthSettingsSlot").build()),
                Input.of(Alias.builder().setType("azure-native:web/v20210201:WebAppAuthSettingsSlot").build()),
                Input.of(Alias.builder().setType("azure-native:web/v20210301:WebAppAuthSettingsSlot").build())
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
    public static WebAppAuthSettingsSlot get(String name, Input<String> id, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        return new WebAppAuthSettingsSlot(name, id, options);
    }
}
