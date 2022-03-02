// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.compute.outputs;

import io.pulumi.azurenative.compute.outputs.PublicIPAddressSkuResponse;
import io.pulumi.azurenative.compute.outputs.SubResourceResponse;
import io.pulumi.azurenative.compute.outputs.VirtualMachineIpTagResponse;
import io.pulumi.azurenative.compute.outputs.VirtualMachinePublicIPAddressDnsSettingsConfigurationResponse;
import io.pulumi.core.annotations.OutputCustomType;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class VirtualMachinePublicIPAddressConfigurationResponse {
    /**
     * Specify what happens to the public IP address when the VM is deleted
     * 
     */
    private final @Nullable String deleteOption;
    /**
     * The dns settings to be applied on the publicIP addresses .
     * 
     */
    private final @Nullable VirtualMachinePublicIPAddressDnsSettingsConfigurationResponse dnsSettings;
    /**
     * The idle timeout of the public IP address.
     * 
     */
    private final @Nullable Integer idleTimeoutInMinutes;
    /**
     * The list of IP tags associated with the public IP address.
     * 
     */
    private final @Nullable List<VirtualMachineIpTagResponse> ipTags;
    /**
     * The publicIP address configuration name.
     * 
     */
    private final String name;
    /**
     * Available from Api-Version 2019-07-01 onwards, it represents whether the specific ipconfiguration is IPv4 or IPv6. Default is taken as IPv4. Possible values are: 'IPv4' and 'IPv6'.
     * 
     */
    private final @Nullable String publicIPAddressVersion;
    /**
     * Specify the public IP allocation type
     * 
     */
    private final @Nullable String publicIPAllocationMethod;
    /**
     * The PublicIPPrefix from which to allocate publicIP addresses.
     * 
     */
    private final @Nullable SubResourceResponse publicIPPrefix;
    /**
     * Describes the public IP Sku
     * 
     */
    private final @Nullable PublicIPAddressSkuResponse sku;

    @OutputCustomType.Constructor({"deleteOption","dnsSettings","idleTimeoutInMinutes","ipTags","name","publicIPAddressVersion","publicIPAllocationMethod","publicIPPrefix","sku"})
    private VirtualMachinePublicIPAddressConfigurationResponse(
        @Nullable String deleteOption,
        @Nullable VirtualMachinePublicIPAddressDnsSettingsConfigurationResponse dnsSettings,
        @Nullable Integer idleTimeoutInMinutes,
        @Nullable List<VirtualMachineIpTagResponse> ipTags,
        String name,
        @Nullable String publicIPAddressVersion,
        @Nullable String publicIPAllocationMethod,
        @Nullable SubResourceResponse publicIPPrefix,
        @Nullable PublicIPAddressSkuResponse sku) {
        this.deleteOption = deleteOption;
        this.dnsSettings = dnsSettings;
        this.idleTimeoutInMinutes = idleTimeoutInMinutes;
        this.ipTags = ipTags;
        this.name = Objects.requireNonNull(name);
        this.publicIPAddressVersion = publicIPAddressVersion;
        this.publicIPAllocationMethod = publicIPAllocationMethod;
        this.publicIPPrefix = publicIPPrefix;
        this.sku = sku;
    }

    /**
     * Specify what happens to the public IP address when the VM is deleted
     * 
    */
    public Optional<String> getDeleteOption() {
        return Optional.ofNullable(this.deleteOption);
    }
    /**
     * The dns settings to be applied on the publicIP addresses .
     * 
    */
    public Optional<VirtualMachinePublicIPAddressDnsSettingsConfigurationResponse> getDnsSettings() {
        return Optional.ofNullable(this.dnsSettings);
    }
    /**
     * The idle timeout of the public IP address.
     * 
    */
    public Optional<Integer> getIdleTimeoutInMinutes() {
        return Optional.ofNullable(this.idleTimeoutInMinutes);
    }
    /**
     * The list of IP tags associated with the public IP address.
     * 
    */
    public List<VirtualMachineIpTagResponse> getIpTags() {
        return this.ipTags == null ? List.of() : this.ipTags;
    }
    /**
     * The publicIP address configuration name.
     * 
    */
    public String getName() {
        return this.name;
    }
    /**
     * Available from Api-Version 2019-07-01 onwards, it represents whether the specific ipconfiguration is IPv4 or IPv6. Default is taken as IPv4. Possible values are: 'IPv4' and 'IPv6'.
     * 
    */
    public Optional<String> getPublicIPAddressVersion() {
        return Optional.ofNullable(this.publicIPAddressVersion);
    }
    /**
     * Specify the public IP allocation type
     * 
    */
    public Optional<String> getPublicIPAllocationMethod() {
        return Optional.ofNullable(this.publicIPAllocationMethod);
    }
    /**
     * The PublicIPPrefix from which to allocate publicIP addresses.
     * 
    */
    public Optional<SubResourceResponse> getPublicIPPrefix() {
        return Optional.ofNullable(this.publicIPPrefix);
    }
    /**
     * Describes the public IP Sku
     * 
    */
    public Optional<PublicIPAddressSkuResponse> getSku() {
        return Optional.ofNullable(this.sku);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(VirtualMachinePublicIPAddressConfigurationResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String deleteOption;
        private @Nullable VirtualMachinePublicIPAddressDnsSettingsConfigurationResponse dnsSettings;
        private @Nullable Integer idleTimeoutInMinutes;
        private @Nullable List<VirtualMachineIpTagResponse> ipTags;
        private String name;
        private @Nullable String publicIPAddressVersion;
        private @Nullable String publicIPAllocationMethod;
        private @Nullable SubResourceResponse publicIPPrefix;
        private @Nullable PublicIPAddressSkuResponse sku;

        public Builder() {
    	      // Empty
        }

        public Builder(VirtualMachinePublicIPAddressConfigurationResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.deleteOption = defaults.deleteOption;
    	      this.dnsSettings = defaults.dnsSettings;
    	      this.idleTimeoutInMinutes = defaults.idleTimeoutInMinutes;
    	      this.ipTags = defaults.ipTags;
    	      this.name = defaults.name;
    	      this.publicIPAddressVersion = defaults.publicIPAddressVersion;
    	      this.publicIPAllocationMethod = defaults.publicIPAllocationMethod;
    	      this.publicIPPrefix = defaults.publicIPPrefix;
    	      this.sku = defaults.sku;
        }

        public Builder setDeleteOption(@Nullable String deleteOption) {
            this.deleteOption = deleteOption;
            return this;
        }

        public Builder setDnsSettings(@Nullable VirtualMachinePublicIPAddressDnsSettingsConfigurationResponse dnsSettings) {
            this.dnsSettings = dnsSettings;
            return this;
        }

        public Builder setIdleTimeoutInMinutes(@Nullable Integer idleTimeoutInMinutes) {
            this.idleTimeoutInMinutes = idleTimeoutInMinutes;
            return this;
        }

        public Builder setIpTags(@Nullable List<VirtualMachineIpTagResponse> ipTags) {
            this.ipTags = ipTags;
            return this;
        }

        public Builder setName(String name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }

        public Builder setPublicIPAddressVersion(@Nullable String publicIPAddressVersion) {
            this.publicIPAddressVersion = publicIPAddressVersion;
            return this;
        }

        public Builder setPublicIPAllocationMethod(@Nullable String publicIPAllocationMethod) {
            this.publicIPAllocationMethod = publicIPAllocationMethod;
            return this;
        }

        public Builder setPublicIPPrefix(@Nullable SubResourceResponse publicIPPrefix) {
            this.publicIPPrefix = publicIPPrefix;
            return this;
        }

        public Builder setSku(@Nullable PublicIPAddressSkuResponse sku) {
            this.sku = sku;
            return this;
        }
        public VirtualMachinePublicIPAddressConfigurationResponse build() {
            return new VirtualMachinePublicIPAddressConfigurationResponse(deleteOption, dnsSettings, idleTimeoutInMinutes, ipTags, name, publicIPAddressVersion, publicIPAllocationMethod, publicIPPrefix, sku);
        }
    }
}
