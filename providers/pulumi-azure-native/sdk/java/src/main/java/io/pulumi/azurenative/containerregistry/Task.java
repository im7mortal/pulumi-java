// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.containerregistry;

import io.pulumi.azurenative.Utilities;
import io.pulumi.azurenative.containerregistry.TaskArgs;
import io.pulumi.azurenative.containerregistry.outputs.AgentPropertiesResponse;
import io.pulumi.azurenative.containerregistry.outputs.CredentialsResponse;
import io.pulumi.azurenative.containerregistry.outputs.DockerBuildStepResponse;
import io.pulumi.azurenative.containerregistry.outputs.EncodedTaskStepResponse;
import io.pulumi.azurenative.containerregistry.outputs.FileTaskStepResponse;
import io.pulumi.azurenative.containerregistry.outputs.IdentityPropertiesResponse;
import io.pulumi.azurenative.containerregistry.outputs.PlatformPropertiesResponse;
import io.pulumi.azurenative.containerregistry.outputs.SystemDataResponse;
import io.pulumi.azurenative.containerregistry.outputs.TriggerPropertiesResponse;
import io.pulumi.core.Alias;
import io.pulumi.core.Input;
import io.pulumi.core.Output;
import io.pulumi.core.internal.annotations.OutputExport;
import io.pulumi.core.internal.annotations.ResourceType;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.Object;
import java.lang.String;
import java.util.List;
import java.util.Map;
import javax.annotation.Nullable;

@ResourceType(type="azure-native:containerregistry:Task")
public class Task extends io.pulumi.resources.CustomResource {
    @OutputExport(name="agentConfiguration", type=AgentPropertiesResponse.class, parameters={})
    private Output</* @Nullable */ AgentPropertiesResponse> agentConfiguration;

    public Output</* @Nullable */ AgentPropertiesResponse> getAgentConfiguration() {
        return this.agentConfiguration;
    }
    @OutputExport(name="agentPoolName", type=String.class, parameters={})
    private Output</* @Nullable */ String> agentPoolName;

    public Output</* @Nullable */ String> getAgentPoolName() {
        return this.agentPoolName;
    }
    @OutputExport(name="creationDate", type=String.class, parameters={})
    private Output<String> creationDate;

    public Output<String> getCreationDate() {
        return this.creationDate;
    }
    @OutputExport(name="credentials", type=CredentialsResponse.class, parameters={})
    private Output</* @Nullable */ CredentialsResponse> credentials;

    public Output</* @Nullable */ CredentialsResponse> getCredentials() {
        return this.credentials;
    }
    @OutputExport(name="identity", type=IdentityPropertiesResponse.class, parameters={})
    private Output</* @Nullable */ IdentityPropertiesResponse> identity;

    public Output</* @Nullable */ IdentityPropertiesResponse> getIdentity() {
        return this.identity;
    }
    @OutputExport(name="isSystemTask", type=Boolean.class, parameters={})
    private Output</* @Nullable */ Boolean> isSystemTask;

    public Output</* @Nullable */ Boolean> getIsSystemTask() {
        return this.isSystemTask;
    }
    @OutputExport(name="location", type=String.class, parameters={})
    private Output<String> location;

    public Output<String> getLocation() {
        return this.location;
    }
    @OutputExport(name="logTemplate", type=String.class, parameters={})
    private Output</* @Nullable */ String> logTemplate;

    public Output</* @Nullable */ String> getLogTemplate() {
        return this.logTemplate;
    }
    @OutputExport(name="name", type=String.class, parameters={})
    private Output<String> name;

    public Output<String> getName() {
        return this.name;
    }
    @OutputExport(name="platform", type=PlatformPropertiesResponse.class, parameters={})
    private Output</* @Nullable */ PlatformPropertiesResponse> platform;

    public Output</* @Nullable */ PlatformPropertiesResponse> getPlatform() {
        return this.platform;
    }
    @OutputExport(name="provisioningState", type=String.class, parameters={})
    private Output<String> provisioningState;

    public Output<String> getProvisioningState() {
        return this.provisioningState;
    }
    @OutputExport(name="status", type=String.class, parameters={})
    private Output</* @Nullable */ String> status;

    public Output</* @Nullable */ String> getStatus() {
        return this.status;
    }
    @OutputExport(name="step", type=Object.class, parameters={})
    private Output</* @Nullable */ Object> step;

    public Output</* @Nullable */ Object> getStep() {
        return this.step;
    }
    @OutputExport(name="systemData", type=SystemDataResponse.class, parameters={})
    private Output<SystemDataResponse> systemData;

    public Output<SystemDataResponse> getSystemData() {
        return this.systemData;
    }
    @OutputExport(name="tags", type=Map.class, parameters={String.class, String.class})
    private Output</* @Nullable */ Map<String,String>> tags;

    public Output</* @Nullable */ Map<String,String>> getTags() {
        return this.tags;
    }
    @OutputExport(name="timeout", type=Integer.class, parameters={})
    private Output</* @Nullable */ Integer> timeout;

    public Output</* @Nullable */ Integer> getTimeout() {
        return this.timeout;
    }
    @OutputExport(name="trigger", type=TriggerPropertiesResponse.class, parameters={})
    private Output</* @Nullable */ TriggerPropertiesResponse> trigger;

    public Output</* @Nullable */ TriggerPropertiesResponse> getTrigger() {
        return this.trigger;
    }
    @OutputExport(name="type", type=String.class, parameters={})
    private Output<String> type;

    public Output<String> getType() {
        return this.type;
    }

    public Task(String name, TaskArgs args, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("azure-native:containerregistry:Task", name, args == null ? TaskArgs.Empty : args, makeResourceOptions(options, Input.empty()));
    }

    private Task(String name, Input<String> id, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("azure-native:containerregistry:Task", name, null, makeResourceOptions(options, id));
    }

    private static io.pulumi.resources.CustomResourceOptions makeResourceOptions(@Nullable io.pulumi.resources.CustomResourceOptions options, @Nullable Input<String> id) {
        var defaultOptions = io.pulumi.resources.CustomResourceOptions.builder()
            .setVersion(Utilities.getVersion())
            .setAliases(List.of(
                Input.of(Alias.builder().setType("azure-native:containerregistry/v20180201preview:Task").build()),
                Input.of(Alias.builder().setType("azure-native:containerregistry/v20180901:Task").build()),
                Input.of(Alias.builder().setType("azure-native:containerregistry/v20190401:Task").build()),
                Input.of(Alias.builder().setType("azure-native:containerregistry/v20190601preview:Task").build())
            ))
            .build();
        return io.pulumi.resources.CustomResourceOptions.merge(defaultOptions, options, id);
    }

    public static Task get(String name, Input<String> id, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        return new Task(name, id, options);
    }
}