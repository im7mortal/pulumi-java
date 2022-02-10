// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.apimanagement;

import io.pulumi.azurenative.Utilities;
import io.pulumi.azurenative.apimanagement.IdentityProviderArgs;
import io.pulumi.core.Alias;
import io.pulumi.core.Input;
import io.pulumi.core.Output;
import io.pulumi.core.internal.annotations.OutputExport;
import io.pulumi.core.internal.annotations.ResourceType;
import java.lang.String;
import java.util.List;
import javax.annotation.Nullable;

@ResourceType(type="azure-native:apimanagement:IdentityProvider")
public class IdentityProvider extends io.pulumi.resources.CustomResource {
    @OutputExport(name="allowedTenants", type=List.class, parameters={String.class})
    private Output</* @Nullable */ List<String>> allowedTenants;

    public Output</* @Nullable */ List<String>> getAllowedTenants() {
        return this.allowedTenants;
    }
    @OutputExport(name="authority", type=String.class, parameters={})
    private Output</* @Nullable */ String> authority;

    public Output</* @Nullable */ String> getAuthority() {
        return this.authority;
    }
    @OutputExport(name="clientId", type=String.class, parameters={})
    private Output<String> clientId;

    public Output<String> getClientId() {
        return this.clientId;
    }
    @OutputExport(name="clientSecret", type=String.class, parameters={})
    private Output</* @Nullable */ String> clientSecret;

    public Output</* @Nullable */ String> getClientSecret() {
        return this.clientSecret;
    }
    @OutputExport(name="name", type=String.class, parameters={})
    private Output<String> name;

    public Output<String> getName() {
        return this.name;
    }
    @OutputExport(name="passwordResetPolicyName", type=String.class, parameters={})
    private Output</* @Nullable */ String> passwordResetPolicyName;

    public Output</* @Nullable */ String> getPasswordResetPolicyName() {
        return this.passwordResetPolicyName;
    }
    @OutputExport(name="profileEditingPolicyName", type=String.class, parameters={})
    private Output</* @Nullable */ String> profileEditingPolicyName;

    public Output</* @Nullable */ String> getProfileEditingPolicyName() {
        return this.profileEditingPolicyName;
    }
    @OutputExport(name="signinPolicyName", type=String.class, parameters={})
    private Output</* @Nullable */ String> signinPolicyName;

    public Output</* @Nullable */ String> getSigninPolicyName() {
        return this.signinPolicyName;
    }
    @OutputExport(name="signinTenant", type=String.class, parameters={})
    private Output</* @Nullable */ String> signinTenant;

    public Output</* @Nullable */ String> getSigninTenant() {
        return this.signinTenant;
    }
    @OutputExport(name="signupPolicyName", type=String.class, parameters={})
    private Output</* @Nullable */ String> signupPolicyName;

    public Output</* @Nullable */ String> getSignupPolicyName() {
        return this.signupPolicyName;
    }
    @OutputExport(name="type", type=String.class, parameters={})
    private Output<String> type;

    public Output<String> getType() {
        return this.type;
    }

    public IdentityProvider(String name, IdentityProviderArgs args, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("azure-native:apimanagement:IdentityProvider", name, args == null ? IdentityProviderArgs.Empty : args, makeResourceOptions(options, Input.empty()));
    }

    private IdentityProvider(String name, Input<String> id, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("azure-native:apimanagement:IdentityProvider", name, null, makeResourceOptions(options, id));
    }

    private static io.pulumi.resources.CustomResourceOptions makeResourceOptions(@Nullable io.pulumi.resources.CustomResourceOptions options, @Nullable Input<String> id) {
        var defaultOptions = io.pulumi.resources.CustomResourceOptions.builder()
            .setVersion(Utilities.getVersion())
            .setAliases(List.of(
                Input.of(Alias.builder().setType("azure-native:apimanagement/v20160707:IdentityProvider").build()),
                Input.of(Alias.builder().setType("azure-native:apimanagement/v20161010:IdentityProvider").build()),
                Input.of(Alias.builder().setType("azure-native:apimanagement/v20170301:IdentityProvider").build()),
                Input.of(Alias.builder().setType("azure-native:apimanagement/v20180101:IdentityProvider").build()),
                Input.of(Alias.builder().setType("azure-native:apimanagement/v20180601preview:IdentityProvider").build()),
                Input.of(Alias.builder().setType("azure-native:apimanagement/v20190101:IdentityProvider").build()),
                Input.of(Alias.builder().setType("azure-native:apimanagement/v20191201:IdentityProvider").build()),
                Input.of(Alias.builder().setType("azure-native:apimanagement/v20191201preview:IdentityProvider").build()),
                Input.of(Alias.builder().setType("azure-native:apimanagement/v20200601preview:IdentityProvider").build()),
                Input.of(Alias.builder().setType("azure-native:apimanagement/v20201201:IdentityProvider").build()),
                Input.of(Alias.builder().setType("azure-native:apimanagement/v20210101preview:IdentityProvider").build()),
                Input.of(Alias.builder().setType("azure-native:apimanagement/v20210401preview:IdentityProvider").build()),
                Input.of(Alias.builder().setType("azure-native:apimanagement/v20210801:IdentityProvider").build())
            ))
            .build();
        return io.pulumi.resources.CustomResourceOptions.merge(defaultOptions, options, id);
    }

    public static IdentityProvider get(String name, Input<String> id, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        return new IdentityProvider(name, id, options);
    }
}