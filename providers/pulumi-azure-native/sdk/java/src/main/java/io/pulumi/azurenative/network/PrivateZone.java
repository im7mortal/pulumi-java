// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.network;

import io.pulumi.azurenative.Utilities;
import io.pulumi.azurenative.network.PrivateZoneArgs;
import io.pulumi.core.Alias;
import io.pulumi.core.Input;
import io.pulumi.core.Output;
import io.pulumi.core.internal.annotations.OutputExport;
import io.pulumi.core.internal.annotations.ResourceType;
import java.lang.Double;
import java.lang.String;
import java.util.List;
import java.util.Map;
import javax.annotation.Nullable;

@ResourceType(type="azure-native:network:PrivateZone")
public class PrivateZone extends io.pulumi.resources.CustomResource {
    @OutputExport(name="etag", type=String.class, parameters={})
    private Output</* @Nullable */ String> etag;

    public Output</* @Nullable */ String> getEtag() {
        return this.etag;
    }
    @OutputExport(name="internalId", type=String.class, parameters={})
    private Output<String> internalId;

    public Output<String> getInternalId() {
        return this.internalId;
    }
    @OutputExport(name="location", type=String.class, parameters={})
    private Output</* @Nullable */ String> location;

    public Output</* @Nullable */ String> getLocation() {
        return this.location;
    }
    @OutputExport(name="maxNumberOfRecordSets", type=Double.class, parameters={})
    private Output<Double> maxNumberOfRecordSets;

    public Output<Double> getMaxNumberOfRecordSets() {
        return this.maxNumberOfRecordSets;
    }
    @OutputExport(name="maxNumberOfVirtualNetworkLinks", type=Double.class, parameters={})
    private Output<Double> maxNumberOfVirtualNetworkLinks;

    public Output<Double> getMaxNumberOfVirtualNetworkLinks() {
        return this.maxNumberOfVirtualNetworkLinks;
    }
    @OutputExport(name="maxNumberOfVirtualNetworkLinksWithRegistration", type=Double.class, parameters={})
    private Output<Double> maxNumberOfVirtualNetworkLinksWithRegistration;

    public Output<Double> getMaxNumberOfVirtualNetworkLinksWithRegistration() {
        return this.maxNumberOfVirtualNetworkLinksWithRegistration;
    }
    @OutputExport(name="name", type=String.class, parameters={})
    private Output<String> name;

    public Output<String> getName() {
        return this.name;
    }
    @OutputExport(name="numberOfRecordSets", type=Double.class, parameters={})
    private Output<Double> numberOfRecordSets;

    public Output<Double> getNumberOfRecordSets() {
        return this.numberOfRecordSets;
    }
    @OutputExport(name="numberOfVirtualNetworkLinks", type=Double.class, parameters={})
    private Output<Double> numberOfVirtualNetworkLinks;

    public Output<Double> getNumberOfVirtualNetworkLinks() {
        return this.numberOfVirtualNetworkLinks;
    }
    @OutputExport(name="numberOfVirtualNetworkLinksWithRegistration", type=Double.class, parameters={})
    private Output<Double> numberOfVirtualNetworkLinksWithRegistration;

    public Output<Double> getNumberOfVirtualNetworkLinksWithRegistration() {
        return this.numberOfVirtualNetworkLinksWithRegistration;
    }
    @OutputExport(name="provisioningState", type=String.class, parameters={})
    private Output<String> provisioningState;

    public Output<String> getProvisioningState() {
        return this.provisioningState;
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

    public PrivateZone(String name, PrivateZoneArgs args, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("azure-native:network:PrivateZone", name, args == null ? PrivateZoneArgs.Empty : args, makeResourceOptions(options, Input.empty()));
    }

    private PrivateZone(String name, Input<String> id, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("azure-native:network:PrivateZone", name, null, makeResourceOptions(options, id));
    }

    private static io.pulumi.resources.CustomResourceOptions makeResourceOptions(@Nullable io.pulumi.resources.CustomResourceOptions options, @Nullable Input<String> id) {
        var defaultOptions = io.pulumi.resources.CustomResourceOptions.builder()
            .setVersion(Utilities.getVersion())
            .setAliases(List.of(
                Input.of(Alias.builder().setType("azure-native:network/v20180901:PrivateZone").build()),
                Input.of(Alias.builder().setType("azure-native:network/v20200101:PrivateZone").build()),
                Input.of(Alias.builder().setType("azure-native:network/v20200601:PrivateZone").build())
            ))
            .build();
        return io.pulumi.resources.CustomResourceOptions.merge(defaultOptions, options, id);
    }

    public static PrivateZone get(String name, Input<String> id, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        return new PrivateZone(name, id, options);
    }
}