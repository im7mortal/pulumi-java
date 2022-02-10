// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.network;

import io.pulumi.azurenative.Utilities;
import io.pulumi.azurenative.network.ExperimentArgs;
import io.pulumi.azurenative.network.outputs.ExperimentEndpointResponse;
import io.pulumi.core.Alias;
import io.pulumi.core.Input;
import io.pulumi.core.Output;
import io.pulumi.core.internal.annotations.OutputExport;
import io.pulumi.core.internal.annotations.ResourceType;
import java.lang.String;
import java.util.List;
import java.util.Map;
import javax.annotation.Nullable;

@ResourceType(type="azure-native:network:Experiment")
public class Experiment extends io.pulumi.resources.CustomResource {
    @OutputExport(name="description", type=String.class, parameters={})
    private Output</* @Nullable */ String> description;

    public Output</* @Nullable */ String> getDescription() {
        return this.description;
    }
    @OutputExport(name="enabledState", type=String.class, parameters={})
    private Output</* @Nullable */ String> enabledState;

    public Output</* @Nullable */ String> getEnabledState() {
        return this.enabledState;
    }
    @OutputExport(name="endpointA", type=ExperimentEndpointResponse.class, parameters={})
    private Output</* @Nullable */ ExperimentEndpointResponse> endpointA;

    public Output</* @Nullable */ ExperimentEndpointResponse> getEndpointA() {
        return this.endpointA;
    }
    @OutputExport(name="endpointB", type=ExperimentEndpointResponse.class, parameters={})
    private Output</* @Nullable */ ExperimentEndpointResponse> endpointB;

    public Output</* @Nullable */ ExperimentEndpointResponse> getEndpointB() {
        return this.endpointB;
    }
    @OutputExport(name="location", type=String.class, parameters={})
    private Output</* @Nullable */ String> location;

    public Output</* @Nullable */ String> getLocation() {
        return this.location;
    }
    @OutputExport(name="name", type=String.class, parameters={})
    private Output<String> name;

    public Output<String> getName() {
        return this.name;
    }
    @OutputExport(name="resourceState", type=String.class, parameters={})
    private Output<String> resourceState;

    public Output<String> getResourceState() {
        return this.resourceState;
    }
    @OutputExport(name="scriptFileUri", type=String.class, parameters={})
    private Output<String> scriptFileUri;

    public Output<String> getScriptFileUri() {
        return this.scriptFileUri;
    }
    @OutputExport(name="status", type=String.class, parameters={})
    private Output<String> status;

    public Output<String> getStatus() {
        return this.status;
    }
    @OutputExport(name="tags", type=Map.class, parameters={String.class, String.class})
    private Output</* @Nullable */ Map<String,String>> tags;

    public Output</* @Nullable */ Map<String,String>> getTags() {
        return this.tags;
    }
    @OutputExport(name="type", type=String.class, parameters={})
    private Output<String> type;

    public Output<String> getType() {
        return this.type;
    }

    public Experiment(String name, ExperimentArgs args, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("azure-native:network:Experiment", name, args == null ? ExperimentArgs.Empty : args, makeResourceOptions(options, Input.empty()));
    }

    private Experiment(String name, Input<String> id, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("azure-native:network:Experiment", name, null, makeResourceOptions(options, id));
    }

    private static io.pulumi.resources.CustomResourceOptions makeResourceOptions(@Nullable io.pulumi.resources.CustomResourceOptions options, @Nullable Input<String> id) {
        var defaultOptions = io.pulumi.resources.CustomResourceOptions.builder()
            .setVersion(Utilities.getVersion())
            .setAliases(List.of(
                Input.of(Alias.builder().setType("azure-native:network/v20191101:Experiment").build())
            ))
            .build();
        return io.pulumi.resources.CustomResourceOptions.merge(defaultOptions, options, id);
    }

    public static Experiment get(String name, Input<String> id, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        return new Experiment(name, id, options);
    }
}