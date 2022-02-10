// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.timeseriesinsights;

import io.pulumi.azurenative.Utilities;
import io.pulumi.azurenative.timeseriesinsights.EventHubEventSourceArgs;
import io.pulumi.azurenative.timeseriesinsights.outputs.LocalTimestampResponse;
import io.pulumi.core.Alias;
import io.pulumi.core.Input;
import io.pulumi.core.Output;
import io.pulumi.core.internal.annotations.OutputExport;
import io.pulumi.core.internal.annotations.ResourceType;
import java.lang.String;
import java.util.List;
import java.util.Map;
import javax.annotation.Nullable;

@ResourceType(type="azure-native:timeseriesinsights:EventHubEventSource")
public class EventHubEventSource extends io.pulumi.resources.CustomResource {
    @OutputExport(name="consumerGroupName", type=String.class, parameters={})
    private Output<String> consumerGroupName;

    public Output<String> getConsumerGroupName() {
        return this.consumerGroupName;
    }
    @OutputExport(name="creationTime", type=String.class, parameters={})
    private Output<String> creationTime;

    public Output<String> getCreationTime() {
        return this.creationTime;
    }
    @OutputExport(name="eventHubName", type=String.class, parameters={})
    private Output<String> eventHubName;

    public Output<String> getEventHubName() {
        return this.eventHubName;
    }
    @OutputExport(name="eventSourceResourceId", type=String.class, parameters={})
    private Output<String> eventSourceResourceId;

    public Output<String> getEventSourceResourceId() {
        return this.eventSourceResourceId;
    }
    @OutputExport(name="keyName", type=String.class, parameters={})
    private Output<String> keyName;

    public Output<String> getKeyName() {
        return this.keyName;
    }
    @OutputExport(name="kind", type=String.class, parameters={})
    private Output<String> kind;

    public Output<String> getKind() {
        return this.kind;
    }
    @OutputExport(name="localTimestamp", type=LocalTimestampResponse.class, parameters={})
    private Output</* @Nullable */ LocalTimestampResponse> localTimestamp;

    public Output</* @Nullable */ LocalTimestampResponse> getLocalTimestamp() {
        return this.localTimestamp;
    }
    @OutputExport(name="location", type=String.class, parameters={})
    private Output<String> location;

    public Output<String> getLocation() {
        return this.location;
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
    @OutputExport(name="serviceBusNamespace", type=String.class, parameters={})
    private Output<String> serviceBusNamespace;

    public Output<String> getServiceBusNamespace() {
        return this.serviceBusNamespace;
    }
    @OutputExport(name="tags", type=Map.class, parameters={String.class, String.class})
    private Output</* @Nullable */ Map<String,String>> tags;

    public Output</* @Nullable */ Map<String,String>> getTags() {
        return this.tags;
    }
    @OutputExport(name="time", type=String.class, parameters={})
    private Output</* @Nullable */ String> time;

    public Output</* @Nullable */ String> getTime() {
        return this.time;
    }
    @OutputExport(name="timestampPropertyName", type=String.class, parameters={})
    private Output</* @Nullable */ String> timestampPropertyName;

    public Output</* @Nullable */ String> getTimestampPropertyName() {
        return this.timestampPropertyName;
    }
    @OutputExport(name="type", type=String.class, parameters={})
    private Output<String> type;

    public Output<String> getType() {
        return this.type;
    }

    public EventHubEventSource(String name, EventHubEventSourceArgs args, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("azure-native:timeseriesinsights:EventHubEventSource", name, makeArgs(args), makeResourceOptions(options, Input.empty()));
    }

    private EventHubEventSource(String name, Input<String> id, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("azure-native:timeseriesinsights:EventHubEventSource", name, null, makeResourceOptions(options, id));
    }

    private static EventHubEventSourceArgs makeArgs(EventHubEventSourceArgs args) {
        var builder = args == null ? EventHubEventSourceArgs.builder() : EventHubEventSourceArgs.builder(args);
        return builder
            .setKind("Microsoft.EventHub")
            .build();
    }

    private static io.pulumi.resources.CustomResourceOptions makeResourceOptions(@Nullable io.pulumi.resources.CustomResourceOptions options, @Nullable Input<String> id) {
        var defaultOptions = io.pulumi.resources.CustomResourceOptions.builder()
            .setVersion(Utilities.getVersion())
            .setAliases(List.of(
                Input.of(Alias.builder().setType("azure-native:timeseriesinsights/v20170228preview:EventHubEventSource").build()),
                Input.of(Alias.builder().setType("azure-native:timeseriesinsights/v20171115:EventHubEventSource").build()),
                Input.of(Alias.builder().setType("azure-native:timeseriesinsights/v20180815preview:EventHubEventSource").build()),
                Input.of(Alias.builder().setType("azure-native:timeseriesinsights/v20200515:EventHubEventSource").build()),
                Input.of(Alias.builder().setType("azure-native:timeseriesinsights/v20210331preview:EventHubEventSource").build()),
                Input.of(Alias.builder().setType("azure-native:timeseriesinsights/v20210630preview:EventHubEventSource").build())
            ))
            .build();
        return io.pulumi.resources.CustomResourceOptions.merge(defaultOptions, options, id);
    }

    public static EventHubEventSource get(String name, Input<String> id, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        return new EventHubEventSource(name, id, options);
    }
}