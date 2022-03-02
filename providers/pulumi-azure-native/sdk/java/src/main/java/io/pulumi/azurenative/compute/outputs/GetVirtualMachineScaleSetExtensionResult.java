// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.compute.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import java.lang.Boolean;
import java.lang.Object;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class GetVirtualMachineScaleSetExtensionResult {
    /**
     * Indicates whether the extension should use a newer minor version if one is available at deployment time. Once deployed, however, the extension will not upgrade minor versions unless redeployed, even with this property set to true.
     * 
     */
    private final @Nullable Boolean autoUpgradeMinorVersion;
    /**
     * Indicates whether the extension should be automatically upgraded by the platform if there is a newer version of the extension available.
     * 
     */
    private final @Nullable Boolean enableAutomaticUpgrade;
    /**
     * If a value is provided and is different from the previous value, the extension handler will be forced to update even if the extension configuration has not changed.
     * 
     */
    private final @Nullable String forceUpdateTag;
    /**
     * Resource Id
     * 
     */
    private final String id;
    /**
     * The name of the extension.
     * 
     */
    private final @Nullable String name;
    /**
     * The extension can contain either protectedSettings or protectedSettingsFromKeyVault or no protected settings at all.
     * 
     */
    private final @Nullable Object protectedSettings;
    /**
     * Collection of extension names after which this extension needs to be provisioned.
     * 
     */
    private final @Nullable List<String> provisionAfterExtensions;
    /**
     * The provisioning state, which only appears in the response.
     * 
     */
    private final String provisioningState;
    /**
     * The name of the extension handler publisher.
     * 
     */
    private final @Nullable String publisher;
    /**
     * Json formatted public settings for the extension.
     * 
     */
    private final @Nullable Object settings;
    /**
     * Resource type
     * 
     */
    private final String type;
    /**
     * Specifies the version of the script handler.
     * 
     */
    private final @Nullable String typeHandlerVersion;

    @OutputCustomType.Constructor({"autoUpgradeMinorVersion","enableAutomaticUpgrade","forceUpdateTag","id","name","protectedSettings","provisionAfterExtensions","provisioningState","publisher","settings","type","typeHandlerVersion"})
    private GetVirtualMachineScaleSetExtensionResult(
        @Nullable Boolean autoUpgradeMinorVersion,
        @Nullable Boolean enableAutomaticUpgrade,
        @Nullable String forceUpdateTag,
        String id,
        @Nullable String name,
        @Nullable Object protectedSettings,
        @Nullable List<String> provisionAfterExtensions,
        String provisioningState,
        @Nullable String publisher,
        @Nullable Object settings,
        String type,
        @Nullable String typeHandlerVersion) {
        this.autoUpgradeMinorVersion = autoUpgradeMinorVersion;
        this.enableAutomaticUpgrade = enableAutomaticUpgrade;
        this.forceUpdateTag = forceUpdateTag;
        this.id = Objects.requireNonNull(id);
        this.name = name;
        this.protectedSettings = protectedSettings;
        this.provisionAfterExtensions = provisionAfterExtensions;
        this.provisioningState = Objects.requireNonNull(provisioningState);
        this.publisher = publisher;
        this.settings = settings;
        this.type = Objects.requireNonNull(type);
        this.typeHandlerVersion = typeHandlerVersion;
    }

    /**
     * Indicates whether the extension should use a newer minor version if one is available at deployment time. Once deployed, however, the extension will not upgrade minor versions unless redeployed, even with this property set to true.
     * 
    */
    public Optional<Boolean> getAutoUpgradeMinorVersion() {
        return Optional.ofNullable(this.autoUpgradeMinorVersion);
    }
    /**
     * Indicates whether the extension should be automatically upgraded by the platform if there is a newer version of the extension available.
     * 
    */
    public Optional<Boolean> getEnableAutomaticUpgrade() {
        return Optional.ofNullable(this.enableAutomaticUpgrade);
    }
    /**
     * If a value is provided and is different from the previous value, the extension handler will be forced to update even if the extension configuration has not changed.
     * 
    */
    public Optional<String> getForceUpdateTag() {
        return Optional.ofNullable(this.forceUpdateTag);
    }
    /**
     * Resource Id
     * 
    */
    public String getId() {
        return this.id;
    }
    /**
     * The name of the extension.
     * 
    */
    public Optional<String> getName() {
        return Optional.ofNullable(this.name);
    }
    /**
     * The extension can contain either protectedSettings or protectedSettingsFromKeyVault or no protected settings at all.
     * 
    */
    public Optional<Object> getProtectedSettings() {
        return Optional.ofNullable(this.protectedSettings);
    }
    /**
     * Collection of extension names after which this extension needs to be provisioned.
     * 
    */
    public List<String> getProvisionAfterExtensions() {
        return this.provisionAfterExtensions == null ? List.of() : this.provisionAfterExtensions;
    }
    /**
     * The provisioning state, which only appears in the response.
     * 
    */
    public String getProvisioningState() {
        return this.provisioningState;
    }
    /**
     * The name of the extension handler publisher.
     * 
    */
    public Optional<String> getPublisher() {
        return Optional.ofNullable(this.publisher);
    }
    /**
     * Json formatted public settings for the extension.
     * 
    */
    public Optional<Object> getSettings() {
        return Optional.ofNullable(this.settings);
    }
    /**
     * Resource type
     * 
    */
    public String getType() {
        return this.type;
    }
    /**
     * Specifies the version of the script handler.
     * 
    */
    public Optional<String> getTypeHandlerVersion() {
        return Optional.ofNullable(this.typeHandlerVersion);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetVirtualMachineScaleSetExtensionResult defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Boolean autoUpgradeMinorVersion;
        private @Nullable Boolean enableAutomaticUpgrade;
        private @Nullable String forceUpdateTag;
        private String id;
        private @Nullable String name;
        private @Nullable Object protectedSettings;
        private @Nullable List<String> provisionAfterExtensions;
        private String provisioningState;
        private @Nullable String publisher;
        private @Nullable Object settings;
        private String type;
        private @Nullable String typeHandlerVersion;

        public Builder() {
    	      // Empty
        }

        public Builder(GetVirtualMachineScaleSetExtensionResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.autoUpgradeMinorVersion = defaults.autoUpgradeMinorVersion;
    	      this.enableAutomaticUpgrade = defaults.enableAutomaticUpgrade;
    	      this.forceUpdateTag = defaults.forceUpdateTag;
    	      this.id = defaults.id;
    	      this.name = defaults.name;
    	      this.protectedSettings = defaults.protectedSettings;
    	      this.provisionAfterExtensions = defaults.provisionAfterExtensions;
    	      this.provisioningState = defaults.provisioningState;
    	      this.publisher = defaults.publisher;
    	      this.settings = defaults.settings;
    	      this.type = defaults.type;
    	      this.typeHandlerVersion = defaults.typeHandlerVersion;
        }

        public Builder setAutoUpgradeMinorVersion(@Nullable Boolean autoUpgradeMinorVersion) {
            this.autoUpgradeMinorVersion = autoUpgradeMinorVersion;
            return this;
        }

        public Builder setEnableAutomaticUpgrade(@Nullable Boolean enableAutomaticUpgrade) {
            this.enableAutomaticUpgrade = enableAutomaticUpgrade;
            return this;
        }

        public Builder setForceUpdateTag(@Nullable String forceUpdateTag) {
            this.forceUpdateTag = forceUpdateTag;
            return this;
        }

        public Builder setId(String id) {
            this.id = Objects.requireNonNull(id);
            return this;
        }

        public Builder setName(@Nullable String name) {
            this.name = name;
            return this;
        }

        public Builder setProtectedSettings(@Nullable Object protectedSettings) {
            this.protectedSettings = protectedSettings;
            return this;
        }

        public Builder setProvisionAfterExtensions(@Nullable List<String> provisionAfterExtensions) {
            this.provisionAfterExtensions = provisionAfterExtensions;
            return this;
        }

        public Builder setProvisioningState(String provisioningState) {
            this.provisioningState = Objects.requireNonNull(provisioningState);
            return this;
        }

        public Builder setPublisher(@Nullable String publisher) {
            this.publisher = publisher;
            return this;
        }

        public Builder setSettings(@Nullable Object settings) {
            this.settings = settings;
            return this;
        }

        public Builder setType(String type) {
            this.type = Objects.requireNonNull(type);
            return this;
        }

        public Builder setTypeHandlerVersion(@Nullable String typeHandlerVersion) {
            this.typeHandlerVersion = typeHandlerVersion;
            return this;
        }
        public GetVirtualMachineScaleSetExtensionResult build() {
            return new GetVirtualMachineScaleSetExtensionResult(autoUpgradeMinorVersion, enableAutomaticUpgrade, forceUpdateTag, id, name, protectedSettings, provisionAfterExtensions, provisioningState, publisher, settings, type, typeHandlerVersion);
        }
    }
}
