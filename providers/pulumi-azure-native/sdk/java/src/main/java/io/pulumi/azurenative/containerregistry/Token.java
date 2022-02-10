// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.containerregistry;

import io.pulumi.azurenative.Utilities;
import io.pulumi.azurenative.containerregistry.TokenArgs;
import io.pulumi.azurenative.containerregistry.outputs.SystemDataResponse;
import io.pulumi.azurenative.containerregistry.outputs.TokenCredentialsPropertiesResponse;
import io.pulumi.core.Alias;
import io.pulumi.core.Input;
import io.pulumi.core.Output;
import io.pulumi.core.internal.annotations.OutputExport;
import io.pulumi.core.internal.annotations.ResourceType;
import java.lang.String;
import java.util.List;
import javax.annotation.Nullable;

@ResourceType(type="azure-native:containerregistry:Token")
public class Token extends io.pulumi.resources.CustomResource {
    @OutputExport(name="creationDate", type=String.class, parameters={})
    private Output<String> creationDate;

    public Output<String> getCreationDate() {
        return this.creationDate;
    }
    @OutputExport(name="credentials", type=TokenCredentialsPropertiesResponse.class, parameters={})
    private Output</* @Nullable */ TokenCredentialsPropertiesResponse> credentials;

    public Output</* @Nullable */ TokenCredentialsPropertiesResponse> getCredentials() {
        return this.credentials;
    }
    @OutputExport(name="name", type=String.class, parameters={})
    private Output<String> name;

    public Output<String> getName() {
        return this.name;
    }
    @OutputExport(name="provisioningState", type=String.class, parameters={})
    private Output<String> provisioningState;

    public Output<String> getProvisioningState() {
        return this.provisioningState;
    }
    @OutputExport(name="scopeMapId", type=String.class, parameters={})
    private Output</* @Nullable */ String> scopeMapId;

    public Output</* @Nullable */ String> getScopeMapId() {
        return this.scopeMapId;
    }
    @OutputExport(name="status", type=String.class, parameters={})
    private Output</* @Nullable */ String> status;

    public Output</* @Nullable */ String> getStatus() {
        return this.status;
    }
    @OutputExport(name="systemData", type=SystemDataResponse.class, parameters={})
    private Output<SystemDataResponse> systemData;

    public Output<SystemDataResponse> getSystemData() {
        return this.systemData;
    }
    @OutputExport(name="type", type=String.class, parameters={})
    private Output<String> type;

    public Output<String> getType() {
        return this.type;
    }

    public Token(String name, TokenArgs args, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("azure-native:containerregistry:Token", name, args == null ? TokenArgs.Empty : args, makeResourceOptions(options, Input.empty()));
    }

    private Token(String name, Input<String> id, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("azure-native:containerregistry:Token", name, null, makeResourceOptions(options, id));
    }

    private static io.pulumi.resources.CustomResourceOptions makeResourceOptions(@Nullable io.pulumi.resources.CustomResourceOptions options, @Nullable Input<String> id) {
        var defaultOptions = io.pulumi.resources.CustomResourceOptions.builder()
            .setVersion(Utilities.getVersion())
            .setAliases(List.of(
                Input.of(Alias.builder().setType("azure-native:containerregistry/v20190501preview:Token").build()),
                Input.of(Alias.builder().setType("azure-native:containerregistry/v20201101preview:Token").build()),
                Input.of(Alias.builder().setType("azure-native:containerregistry/v20210601preview:Token").build()),
                Input.of(Alias.builder().setType("azure-native:containerregistry/v20210801preview:Token").build()),
                Input.of(Alias.builder().setType("azure-native:containerregistry/v20211201preview:Token").build())
            ))
            .build();
        return io.pulumi.resources.CustomResourceOptions.merge(defaultOptions, options, id);
    }

    public static Token get(String name, Input<String> id, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        return new Token(name, id, options);
    }
}