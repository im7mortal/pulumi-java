// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.cloudidentity_v1;

import io.pulumi.core.Input;
import io.pulumi.core.Output;
import io.pulumi.core.internal.annotations.OutputExport;
import io.pulumi.core.internal.annotations.ResourceType;
import io.pulumi.googlenative.Utilities;
import io.pulumi.googlenative.cloudidentity_v1.DeviceArgs;
import io.pulumi.googlenative.cloudidentity_v1.outputs.GoogleAppsCloudidentityDevicesV1AndroidAttributesResponse;
import java.lang.Boolean;
import java.lang.String;
import java.util.List;
import javax.annotation.Nullable;

@ResourceType(type="google-native:cloudidentity/v1:Device")
public class Device extends io.pulumi.resources.CustomResource {
    @OutputExport(name="androidSpecificAttributes", type=GoogleAppsCloudidentityDevicesV1AndroidAttributesResponse.class, parameters={})
    private Output<GoogleAppsCloudidentityDevicesV1AndroidAttributesResponse> androidSpecificAttributes;

    public Output<GoogleAppsCloudidentityDevicesV1AndroidAttributesResponse> getAndroidSpecificAttributes() {
        return this.androidSpecificAttributes;
    }
    @OutputExport(name="assetTag", type=String.class, parameters={})
    private Output<String> assetTag;

    public Output<String> getAssetTag() {
        return this.assetTag;
    }
    @OutputExport(name="basebandVersion", type=String.class, parameters={})
    private Output<String> basebandVersion;

    public Output<String> getBasebandVersion() {
        return this.basebandVersion;
    }
    @OutputExport(name="bootloaderVersion", type=String.class, parameters={})
    private Output<String> bootloaderVersion;

    public Output<String> getBootloaderVersion() {
        return this.bootloaderVersion;
    }
    @OutputExport(name="brand", type=String.class, parameters={})
    private Output<String> brand;

    public Output<String> getBrand() {
        return this.brand;
    }
    @OutputExport(name="buildNumber", type=String.class, parameters={})
    private Output<String> buildNumber;

    public Output<String> getBuildNumber() {
        return this.buildNumber;
    }
    @OutputExport(name="compromisedState", type=String.class, parameters={})
    private Output<String> compromisedState;

    public Output<String> getCompromisedState() {
        return this.compromisedState;
    }
    @OutputExport(name="createTime", type=String.class, parameters={})
    private Output<String> createTime;

    public Output<String> getCreateTime() {
        return this.createTime;
    }
    @OutputExport(name="deviceType", type=String.class, parameters={})
    private Output<String> deviceType;

    public Output<String> getDeviceType() {
        return this.deviceType;
    }
    @OutputExport(name="enabledDeveloperOptions", type=Boolean.class, parameters={})
    private Output<Boolean> enabledDeveloperOptions;

    public Output<Boolean> getEnabledDeveloperOptions() {
        return this.enabledDeveloperOptions;
    }
    @OutputExport(name="enabledUsbDebugging", type=Boolean.class, parameters={})
    private Output<Boolean> enabledUsbDebugging;

    public Output<Boolean> getEnabledUsbDebugging() {
        return this.enabledUsbDebugging;
    }
    @OutputExport(name="encryptionState", type=String.class, parameters={})
    private Output<String> encryptionState;

    public Output<String> getEncryptionState() {
        return this.encryptionState;
    }
    @OutputExport(name="imei", type=String.class, parameters={})
    private Output<String> imei;

    public Output<String> getImei() {
        return this.imei;
    }
    @OutputExport(name="kernelVersion", type=String.class, parameters={})
    private Output<String> kernelVersion;

    public Output<String> getKernelVersion() {
        return this.kernelVersion;
    }
    @OutputExport(name="lastSyncTime", type=String.class, parameters={})
    private Output<String> lastSyncTime;

    public Output<String> getLastSyncTime() {
        return this.lastSyncTime;
    }
    @OutputExport(name="managementState", type=String.class, parameters={})
    private Output<String> managementState;

    public Output<String> getManagementState() {
        return this.managementState;
    }
    @OutputExport(name="manufacturer", type=String.class, parameters={})
    private Output<String> manufacturer;

    public Output<String> getManufacturer() {
        return this.manufacturer;
    }
    @OutputExport(name="meid", type=String.class, parameters={})
    private Output<String> meid;

    public Output<String> getMeid() {
        return this.meid;
    }
    @OutputExport(name="model", type=String.class, parameters={})
    private Output<String> model;

    public Output<String> getModel() {
        return this.model;
    }
    @OutputExport(name="name", type=String.class, parameters={})
    private Output<String> name;

    public Output<String> getName() {
        return this.name;
    }
    @OutputExport(name="networkOperator", type=String.class, parameters={})
    private Output<String> networkOperator;

    public Output<String> getNetworkOperator() {
        return this.networkOperator;
    }
    @OutputExport(name="osVersion", type=String.class, parameters={})
    private Output<String> osVersion;

    public Output<String> getOsVersion() {
        return this.osVersion;
    }
    @OutputExport(name="otherAccounts", type=List.class, parameters={String.class})
    private Output<List<String>> otherAccounts;

    public Output<List<String>> getOtherAccounts() {
        return this.otherAccounts;
    }
    @OutputExport(name="ownerType", type=String.class, parameters={})
    private Output<String> ownerType;

    public Output<String> getOwnerType() {
        return this.ownerType;
    }
    @OutputExport(name="releaseVersion", type=String.class, parameters={})
    private Output<String> releaseVersion;

    public Output<String> getReleaseVersion() {
        return this.releaseVersion;
    }
    @OutputExport(name="securityPatchTime", type=String.class, parameters={})
    private Output<String> securityPatchTime;

    public Output<String> getSecurityPatchTime() {
        return this.securityPatchTime;
    }
    @OutputExport(name="serialNumber", type=String.class, parameters={})
    private Output<String> serialNumber;

    public Output<String> getSerialNumber() {
        return this.serialNumber;
    }
    @OutputExport(name="wifiMacAddresses", type=List.class, parameters={String.class})
    private Output<List<String>> wifiMacAddresses;

    public Output<List<String>> getWifiMacAddresses() {
        return this.wifiMacAddresses;
    }

    public Device(String name, @Nullable DeviceArgs args, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("google-native:cloudidentity/v1:Device", name, args == null ? DeviceArgs.Empty : args, makeResourceOptions(options, Input.empty()));
    }

    private Device(String name, Input<String> id, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("google-native:cloudidentity/v1:Device", name, null, makeResourceOptions(options, id));
    }

    private static io.pulumi.resources.CustomResourceOptions makeResourceOptions(@Nullable io.pulumi.resources.CustomResourceOptions options, @Nullable Input<String> id) {
        var defaultOptions = io.pulumi.resources.CustomResourceOptions.builder()
            .setVersion(Utilities.getVersion())
            .build();
        return io.pulumi.resources.CustomResourceOptions.merge(defaultOptions, options, id);
    }

    public static Device get(String name, Input<String> id, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        return new Device(name, id, options);
    }
}