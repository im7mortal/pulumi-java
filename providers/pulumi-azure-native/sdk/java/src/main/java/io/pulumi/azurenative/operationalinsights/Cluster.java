// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.operationalinsights;

import io.pulumi.azurenative.Utilities;
import io.pulumi.azurenative.operationalinsights.ClusterArgs;
import io.pulumi.azurenative.operationalinsights.outputs.AssociatedWorkspaceResponse;
import io.pulumi.azurenative.operationalinsights.outputs.CapacityReservationPropertiesResponse;
import io.pulumi.azurenative.operationalinsights.outputs.ClusterSkuResponse;
import io.pulumi.azurenative.operationalinsights.outputs.IdentityResponse;
import io.pulumi.azurenative.operationalinsights.outputs.KeyVaultPropertiesResponse;
import io.pulumi.core.Alias;
import io.pulumi.core.Input;
import io.pulumi.core.Output;
import io.pulumi.core.internal.annotations.OutputExport;
import io.pulumi.core.internal.annotations.ResourceType;
import java.lang.Boolean;
import java.lang.String;
import java.util.List;
import java.util.Map;
import javax.annotation.Nullable;

@ResourceType(type="azure-native:operationalinsights:Cluster")
public class Cluster extends io.pulumi.resources.CustomResource {
    @OutputExport(name="associatedWorkspaces", type=List.class, parameters={AssociatedWorkspaceResponse.class})
    private Output</* @Nullable */ List<AssociatedWorkspaceResponse>> associatedWorkspaces;

    public Output</* @Nullable */ List<AssociatedWorkspaceResponse>> getAssociatedWorkspaces() {
        return this.associatedWorkspaces;
    }
    @OutputExport(name="billingType", type=String.class, parameters={})
    private Output</* @Nullable */ String> billingType;

    public Output</* @Nullable */ String> getBillingType() {
        return this.billingType;
    }
    @OutputExport(name="capacityReservationProperties", type=CapacityReservationPropertiesResponse.class, parameters={})
    private Output</* @Nullable */ CapacityReservationPropertiesResponse> capacityReservationProperties;

    public Output</* @Nullable */ CapacityReservationPropertiesResponse> getCapacityReservationProperties() {
        return this.capacityReservationProperties;
    }
    @OutputExport(name="clusterId", type=String.class, parameters={})
    private Output<String> clusterId;

    public Output<String> getClusterId() {
        return this.clusterId;
    }
    @OutputExport(name="createdDate", type=String.class, parameters={})
    private Output<String> createdDate;

    public Output<String> getCreatedDate() {
        return this.createdDate;
    }
    @OutputExport(name="identity", type=IdentityResponse.class, parameters={})
    private Output</* @Nullable */ IdentityResponse> identity;

    public Output</* @Nullable */ IdentityResponse> getIdentity() {
        return this.identity;
    }
    @OutputExport(name="isAvailabilityZonesEnabled", type=Boolean.class, parameters={})
    private Output</* @Nullable */ Boolean> isAvailabilityZonesEnabled;

    public Output</* @Nullable */ Boolean> getIsAvailabilityZonesEnabled() {
        return this.isAvailabilityZonesEnabled;
    }
    @OutputExport(name="keyVaultProperties", type=KeyVaultPropertiesResponse.class, parameters={})
    private Output</* @Nullable */ KeyVaultPropertiesResponse> keyVaultProperties;

    public Output</* @Nullable */ KeyVaultPropertiesResponse> getKeyVaultProperties() {
        return this.keyVaultProperties;
    }
    @OutputExport(name="lastModifiedDate", type=String.class, parameters={})
    private Output<String> lastModifiedDate;

    public Output<String> getLastModifiedDate() {
        return this.lastModifiedDate;
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
    @OutputExport(name="sku", type=ClusterSkuResponse.class, parameters={})
    private Output</* @Nullable */ ClusterSkuResponse> sku;

    public Output</* @Nullable */ ClusterSkuResponse> getSku() {
        return this.sku;
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

    public Cluster(String name, ClusterArgs args, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("azure-native:operationalinsights:Cluster", name, args == null ? ClusterArgs.Empty : args, makeResourceOptions(options, Input.empty()));
    }

    private Cluster(String name, Input<String> id, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("azure-native:operationalinsights:Cluster", name, null, makeResourceOptions(options, id));
    }

    private static io.pulumi.resources.CustomResourceOptions makeResourceOptions(@Nullable io.pulumi.resources.CustomResourceOptions options, @Nullable Input<String> id) {
        var defaultOptions = io.pulumi.resources.CustomResourceOptions.builder()
            .setVersion(Utilities.getVersion())
            .setAliases(List.of(
                Input.of(Alias.builder().setType("azure-native:operationalinsights/v20190801preview:Cluster").build()),
                Input.of(Alias.builder().setType("azure-native:operationalinsights/v20200301preview:Cluster").build()),
                Input.of(Alias.builder().setType("azure-native:operationalinsights/v20200801:Cluster").build()),
                Input.of(Alias.builder().setType("azure-native:operationalinsights/v20201001:Cluster").build()),
                Input.of(Alias.builder().setType("azure-native:operationalinsights/v20210601:Cluster").build())
            ))
            .build();
        return io.pulumi.resources.CustomResourceOptions.merge(defaultOptions, options, id);
    }

    public static Cluster get(String name, Input<String> id, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        return new Cluster(name, id, options);
    }
}