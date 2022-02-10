// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.sql;

import io.pulumi.azurenative.Utilities;
import io.pulumi.azurenative.sql.ManagedInstanceArgs;
import io.pulumi.azurenative.sql.outputs.ManagedInstanceExternalAdministratorResponse;
import io.pulumi.azurenative.sql.outputs.ManagedInstancePecPropertyResponse;
import io.pulumi.azurenative.sql.outputs.ResourceIdentityResponse;
import io.pulumi.azurenative.sql.outputs.SkuResponse;
import io.pulumi.core.Alias;
import io.pulumi.core.Input;
import io.pulumi.core.Output;
import io.pulumi.core.internal.annotations.OutputExport;
import io.pulumi.core.internal.annotations.ResourceType;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Map;
import javax.annotation.Nullable;

@ResourceType(type="azure-native:sql:ManagedInstance")
public class ManagedInstance extends io.pulumi.resources.CustomResource {
    @OutputExport(name="administratorLogin", type=String.class, parameters={})
    private Output</* @Nullable */ String> administratorLogin;

    public Output</* @Nullable */ String> getAdministratorLogin() {
        return this.administratorLogin;
    }
    @OutputExport(name="administrators", type=ManagedInstanceExternalAdministratorResponse.class, parameters={})
    private Output</* @Nullable */ ManagedInstanceExternalAdministratorResponse> administrators;

    public Output</* @Nullable */ ManagedInstanceExternalAdministratorResponse> getAdministrators() {
        return this.administrators;
    }
    @OutputExport(name="collation", type=String.class, parameters={})
    private Output</* @Nullable */ String> collation;

    public Output</* @Nullable */ String> getCollation() {
        return this.collation;
    }
    @OutputExport(name="dnsZone", type=String.class, parameters={})
    private Output<String> dnsZone;

    public Output<String> getDnsZone() {
        return this.dnsZone;
    }
    @OutputExport(name="fullyQualifiedDomainName", type=String.class, parameters={})
    private Output<String> fullyQualifiedDomainName;

    public Output<String> getFullyQualifiedDomainName() {
        return this.fullyQualifiedDomainName;
    }
    @OutputExport(name="identity", type=ResourceIdentityResponse.class, parameters={})
    private Output</* @Nullable */ ResourceIdentityResponse> identity;

    public Output</* @Nullable */ ResourceIdentityResponse> getIdentity() {
        return this.identity;
    }
    @OutputExport(name="instancePoolId", type=String.class, parameters={})
    private Output</* @Nullable */ String> instancePoolId;

    public Output</* @Nullable */ String> getInstancePoolId() {
        return this.instancePoolId;
    }
    @OutputExport(name="keyId", type=String.class, parameters={})
    private Output</* @Nullable */ String> keyId;

    public Output</* @Nullable */ String> getKeyId() {
        return this.keyId;
    }
    @OutputExport(name="licenseType", type=String.class, parameters={})
    private Output</* @Nullable */ String> licenseType;

    public Output</* @Nullable */ String> getLicenseType() {
        return this.licenseType;
    }
    @OutputExport(name="location", type=String.class, parameters={})
    private Output<String> location;

    public Output<String> getLocation() {
        return this.location;
    }
    @OutputExport(name="maintenanceConfigurationId", type=String.class, parameters={})
    private Output</* @Nullable */ String> maintenanceConfigurationId;

    public Output</* @Nullable */ String> getMaintenanceConfigurationId() {
        return this.maintenanceConfigurationId;
    }
    @OutputExport(name="minimalTlsVersion", type=String.class, parameters={})
    private Output</* @Nullable */ String> minimalTlsVersion;

    public Output</* @Nullable */ String> getMinimalTlsVersion() {
        return this.minimalTlsVersion;
    }
    @OutputExport(name="name", type=String.class, parameters={})
    private Output<String> name;

    public Output<String> getName() {
        return this.name;
    }
    @OutputExport(name="primaryUserAssignedIdentityId", type=String.class, parameters={})
    private Output</* @Nullable */ String> primaryUserAssignedIdentityId;

    public Output</* @Nullable */ String> getPrimaryUserAssignedIdentityId() {
        return this.primaryUserAssignedIdentityId;
    }
    @OutputExport(name="privateEndpointConnections", type=List.class, parameters={ManagedInstancePecPropertyResponse.class})
    private Output<List<ManagedInstancePecPropertyResponse>> privateEndpointConnections;

    public Output<List<ManagedInstancePecPropertyResponse>> getPrivateEndpointConnections() {
        return this.privateEndpointConnections;
    }
    @OutputExport(name="provisioningState", type=String.class, parameters={})
    private Output<String> provisioningState;

    public Output<String> getProvisioningState() {
        return this.provisioningState;
    }
    @OutputExport(name="proxyOverride", type=String.class, parameters={})
    private Output</* @Nullable */ String> proxyOverride;

    public Output</* @Nullable */ String> getProxyOverride() {
        return this.proxyOverride;
    }
    @OutputExport(name="publicDataEndpointEnabled", type=Boolean.class, parameters={})
    private Output</* @Nullable */ Boolean> publicDataEndpointEnabled;

    public Output</* @Nullable */ Boolean> getPublicDataEndpointEnabled() {
        return this.publicDataEndpointEnabled;
    }
    @OutputExport(name="sku", type=SkuResponse.class, parameters={})
    private Output</* @Nullable */ SkuResponse> sku;

    public Output</* @Nullable */ SkuResponse> getSku() {
        return this.sku;
    }
    @OutputExport(name="state", type=String.class, parameters={})
    private Output<String> state;

    public Output<String> getState() {
        return this.state;
    }
    @OutputExport(name="storageAccountType", type=String.class, parameters={})
    private Output</* @Nullable */ String> storageAccountType;

    public Output</* @Nullable */ String> getStorageAccountType() {
        return this.storageAccountType;
    }
    @OutputExport(name="storageSizeInGB", type=Integer.class, parameters={})
    private Output</* @Nullable */ Integer> storageSizeInGB;

    public Output</* @Nullable */ Integer> getStorageSizeInGB() {
        return this.storageSizeInGB;
    }
    @OutputExport(name="subnetId", type=String.class, parameters={})
    private Output</* @Nullable */ String> subnetId;

    public Output</* @Nullable */ String> getSubnetId() {
        return this.subnetId;
    }
    @OutputExport(name="tags", type=Map.class, parameters={String.class, String.class})
    private Output</* @Nullable */ Map<String,String>> tags;

    public Output</* @Nullable */ Map<String,String>> getTags() {
        return this.tags;
    }
    @OutputExport(name="timezoneId", type=String.class, parameters={})
    private Output</* @Nullable */ String> timezoneId;

    public Output</* @Nullable */ String> getTimezoneId() {
        return this.timezoneId;
    }
    @OutputExport(name="type", type=String.class, parameters={})
    private Output<String> type;

    public Output<String> getType() {
        return this.type;
    }
    @OutputExport(name="vCores", type=Integer.class, parameters={})
    private Output</* @Nullable */ Integer> vCores;

    public Output</* @Nullable */ Integer> getVCores() {
        return this.vCores;
    }
    @OutputExport(name="zoneRedundant", type=Boolean.class, parameters={})
    private Output</* @Nullable */ Boolean> zoneRedundant;

    public Output</* @Nullable */ Boolean> getZoneRedundant() {
        return this.zoneRedundant;
    }

    public ManagedInstance(String name, ManagedInstanceArgs args, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("azure-native:sql:ManagedInstance", name, args == null ? ManagedInstanceArgs.Empty : args, makeResourceOptions(options, Input.empty()));
    }

    private ManagedInstance(String name, Input<String> id, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("azure-native:sql:ManagedInstance", name, null, makeResourceOptions(options, id));
    }

    private static io.pulumi.resources.CustomResourceOptions makeResourceOptions(@Nullable io.pulumi.resources.CustomResourceOptions options, @Nullable Input<String> id) {
        var defaultOptions = io.pulumi.resources.CustomResourceOptions.builder()
            .setVersion(Utilities.getVersion())
            .setAliases(List.of(
                Input.of(Alias.builder().setType("azure-native:sql/v20150501preview:ManagedInstance").build()),
                Input.of(Alias.builder().setType("azure-native:sql/v20180601preview:ManagedInstance").build()),
                Input.of(Alias.builder().setType("azure-native:sql/v20200202preview:ManagedInstance").build()),
                Input.of(Alias.builder().setType("azure-native:sql/v20200801preview:ManagedInstance").build()),
                Input.of(Alias.builder().setType("azure-native:sql/v20201101preview:ManagedInstance").build()),
                Input.of(Alias.builder().setType("azure-native:sql/v20210201preview:ManagedInstance").build()),
                Input.of(Alias.builder().setType("azure-native:sql/v20210501preview:ManagedInstance").build()),
                Input.of(Alias.builder().setType("azure-native:sql/v20210801preview:ManagedInstance").build())
            ))
            .build();
        return io.pulumi.resources.CustomResourceOptions.merge(defaultOptions, options, id);
    }

    public static ManagedInstance get(String name, Input<String> id, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        return new ManagedInstance(name, id, options);
    }
}