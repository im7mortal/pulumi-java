// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.connectedvmwarevsphere;

import io.pulumi.azurenative.Utilities;
import io.pulumi.azurenative.connectedvmwarevsphere.GuestAgentArgs;
import io.pulumi.azurenative.connectedvmwarevsphere.outputs.GuestCredentialResponse;
import io.pulumi.azurenative.connectedvmwarevsphere.outputs.HttpProxyConfigurationResponse;
import io.pulumi.azurenative.connectedvmwarevsphere.outputs.ResourceStatusResponse;
import io.pulumi.azurenative.connectedvmwarevsphere.outputs.SystemDataResponse;
import io.pulumi.core.Alias;
import io.pulumi.core.Input;
import io.pulumi.core.Output;
import io.pulumi.core.internal.annotations.OutputExport;
import io.pulumi.core.internal.annotations.ResourceType;
import java.lang.String;
import java.util.List;
import javax.annotation.Nullable;

@ResourceType(type="azure-native:connectedvmwarevsphere:GuestAgent")
public class GuestAgent extends io.pulumi.resources.CustomResource {
    @OutputExport(name="credentials", type=GuestCredentialResponse.class, parameters={})
    private Output</* @Nullable */ GuestCredentialResponse> credentials;

    public Output</* @Nullable */ GuestCredentialResponse> getCredentials() {
        return this.credentials;
    }
    @OutputExport(name="customResourceName", type=String.class, parameters={})
    private Output<String> customResourceName;

    public Output<String> getCustomResourceName() {
        return this.customResourceName;
    }
    @OutputExport(name="httpProxyConfig", type=HttpProxyConfigurationResponse.class, parameters={})
    private Output</* @Nullable */ HttpProxyConfigurationResponse> httpProxyConfig;

    public Output</* @Nullable */ HttpProxyConfigurationResponse> getHttpProxyConfig() {
        return this.httpProxyConfig;
    }
    @OutputExport(name="name", type=String.class, parameters={})
    private Output<String> name;

    public Output<String> getName() {
        return this.name;
    }
    @OutputExport(name="provisioningAction", type=String.class, parameters={})
    private Output</* @Nullable */ String> provisioningAction;

    public Output</* @Nullable */ String> getProvisioningAction() {
        return this.provisioningAction;
    }
    @OutputExport(name="provisioningState", type=String.class, parameters={})
    private Output<String> provisioningState;

    public Output<String> getProvisioningState() {
        return this.provisioningState;
    }
    @OutputExport(name="status", type=String.class, parameters={})
    private Output<String> status;

    public Output<String> getStatus() {
        return this.status;
    }
    @OutputExport(name="statuses", type=List.class, parameters={ResourceStatusResponse.class})
    private Output<List<ResourceStatusResponse>> statuses;

    public Output<List<ResourceStatusResponse>> getStatuses() {
        return this.statuses;
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
    @OutputExport(name="uuid", type=String.class, parameters={})
    private Output<String> uuid;

    public Output<String> getUuid() {
        return this.uuid;
    }

    public GuestAgent(String name, GuestAgentArgs args, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("azure-native:connectedvmwarevsphere:GuestAgent", name, args == null ? GuestAgentArgs.Empty : args, makeResourceOptions(options, Input.empty()));
    }

    private GuestAgent(String name, Input<String> id, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("azure-native:connectedvmwarevsphere:GuestAgent", name, null, makeResourceOptions(options, id));
    }

    private static io.pulumi.resources.CustomResourceOptions makeResourceOptions(@Nullable io.pulumi.resources.CustomResourceOptions options, @Nullable Input<String> id) {
        var defaultOptions = io.pulumi.resources.CustomResourceOptions.builder()
            .setVersion(Utilities.getVersion())
            .setAliases(List.of(
                Input.of(Alias.builder().setType("azure-native:connectedvmwarevsphere/v20201001preview:GuestAgent").build())
            ))
            .build();
        return io.pulumi.resources.CustomResourceOptions.merge(defaultOptions, options, id);
    }

    public static GuestAgent get(String name, Input<String> id, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        return new GuestAgent(name, id, options);
    }
}