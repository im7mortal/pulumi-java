// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.cloudidentity_v1beta1;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class DeviceArgs extends com.pulumi.resources.ResourceArgs {

    public static final DeviceArgs Empty = new DeviceArgs();

    /**
     * Asset tag of the device.
     * 
     */
    @Import(name="assetTag")
    private @Nullable Output<String> assetTag;

    /**
     * @return Asset tag of the device.
     * 
     */
    public Optional<Output<String>> assetTag() {
        return Optional.ofNullable(this.assetTag);
    }

    /**
     * Unique identifier for the device.
     * 
     */
    @Import(name="deviceId")
    private @Nullable Output<String> deviceId;

    /**
     * @return Unique identifier for the device.
     * 
     */
    public Optional<Output<String>> deviceId() {
        return Optional.ofNullable(this.deviceId);
    }

    /**
     * Most recent time when device synced with this service.
     * 
     */
    @Import(name="lastSyncTime")
    private @Nullable Output<String> lastSyncTime;

    /**
     * @return Most recent time when device synced with this service.
     * 
     */
    public Optional<Output<String>> lastSyncTime() {
        return Optional.ofNullable(this.lastSyncTime);
    }

    /**
     * Serial Number of device. Example: HT82V1A01076.
     * 
     */
    @Import(name="serialNumber")
    private @Nullable Output<String> serialNumber;

    /**
     * @return Serial Number of device. Example: HT82V1A01076.
     * 
     */
    public Optional<Output<String>> serialNumber() {
        return Optional.ofNullable(this.serialNumber);
    }

    /**
     * WiFi MAC addresses of device.
     * 
     */
    @Import(name="wifiMacAddresses")
    private @Nullable Output<List<String>> wifiMacAddresses;

    /**
     * @return WiFi MAC addresses of device.
     * 
     */
    public Optional<Output<List<String>>> wifiMacAddresses() {
        return Optional.ofNullable(this.wifiMacAddresses);
    }

    private DeviceArgs() {}

    private DeviceArgs(DeviceArgs $) {
        this.assetTag = $.assetTag;
        this.deviceId = $.deviceId;
        this.lastSyncTime = $.lastSyncTime;
        this.serialNumber = $.serialNumber;
        this.wifiMacAddresses = $.wifiMacAddresses;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(DeviceArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private DeviceArgs $;

        public Builder() {
            $ = new DeviceArgs();
        }

        public Builder(DeviceArgs defaults) {
            $ = new DeviceArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param assetTag Asset tag of the device.
         * 
         * @return builder
         * 
         */
        public Builder assetTag(@Nullable Output<String> assetTag) {
            $.assetTag = assetTag;
            return this;
        }

        /**
         * @param assetTag Asset tag of the device.
         * 
         * @return builder
         * 
         */
        public Builder assetTag(String assetTag) {
            return assetTag(Output.of(assetTag));
        }

        /**
         * @param deviceId Unique identifier for the device.
         * 
         * @return builder
         * 
         */
        public Builder deviceId(@Nullable Output<String> deviceId) {
            $.deviceId = deviceId;
            return this;
        }

        /**
         * @param deviceId Unique identifier for the device.
         * 
         * @return builder
         * 
         */
        public Builder deviceId(String deviceId) {
            return deviceId(Output.of(deviceId));
        }

        /**
         * @param lastSyncTime Most recent time when device synced with this service.
         * 
         * @return builder
         * 
         */
        public Builder lastSyncTime(@Nullable Output<String> lastSyncTime) {
            $.lastSyncTime = lastSyncTime;
            return this;
        }

        /**
         * @param lastSyncTime Most recent time when device synced with this service.
         * 
         * @return builder
         * 
         */
        public Builder lastSyncTime(String lastSyncTime) {
            return lastSyncTime(Output.of(lastSyncTime));
        }

        /**
         * @param serialNumber Serial Number of device. Example: HT82V1A01076.
         * 
         * @return builder
         * 
         */
        public Builder serialNumber(@Nullable Output<String> serialNumber) {
            $.serialNumber = serialNumber;
            return this;
        }

        /**
         * @param serialNumber Serial Number of device. Example: HT82V1A01076.
         * 
         * @return builder
         * 
         */
        public Builder serialNumber(String serialNumber) {
            return serialNumber(Output.of(serialNumber));
        }

        /**
         * @param wifiMacAddresses WiFi MAC addresses of device.
         * 
         * @return builder
         * 
         */
        public Builder wifiMacAddresses(@Nullable Output<List<String>> wifiMacAddresses) {
            $.wifiMacAddresses = wifiMacAddresses;
            return this;
        }

        /**
         * @param wifiMacAddresses WiFi MAC addresses of device.
         * 
         * @return builder
         * 
         */
        public Builder wifiMacAddresses(List<String> wifiMacAddresses) {
            return wifiMacAddresses(Output.of(wifiMacAddresses));
        }

        /**
         * @param wifiMacAddresses WiFi MAC addresses of device.
         * 
         * @return builder
         * 
         */
        public Builder wifiMacAddresses(String... wifiMacAddresses) {
            return wifiMacAddresses(List.of(wifiMacAddresses));
        }

        public DeviceArgs build() {
            return $;
        }
    }

}
