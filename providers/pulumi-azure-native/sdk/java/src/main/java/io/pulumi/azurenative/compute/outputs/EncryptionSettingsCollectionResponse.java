// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.compute.outputs;

import io.pulumi.azurenative.compute.outputs.EncryptionSettingsElementResponse;
import io.pulumi.core.annotations.OutputCustomType;
import java.lang.Boolean;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class EncryptionSettingsCollectionResponse {
    /**
     * Set this flag to true and provide DiskEncryptionKey and optional KeyEncryptionKey to enable encryption. Set this flag to false and remove DiskEncryptionKey and KeyEncryptionKey to disable encryption. If EncryptionSettings is null in the request object, the existing settings remain unchanged.
     * 
     */
    private final Boolean enabled;
    /**
     * A collection of encryption settings, one for each disk volume.
     * 
     */
    private final @Nullable List<EncryptionSettingsElementResponse> encryptionSettings;
    /**
     * Describes what type of encryption is used for the disks. Once this field is set, it cannot be overwritten. '1.0' corresponds to Azure Disk Encryption with AAD app.'1.1' corresponds to Azure Disk Encryption.
     * 
     */
    private final @Nullable String encryptionSettingsVersion;

    @OutputCustomType.Constructor({"enabled","encryptionSettings","encryptionSettingsVersion"})
    private EncryptionSettingsCollectionResponse(
        Boolean enabled,
        @Nullable List<EncryptionSettingsElementResponse> encryptionSettings,
        @Nullable String encryptionSettingsVersion) {
        this.enabled = Objects.requireNonNull(enabled);
        this.encryptionSettings = encryptionSettings;
        this.encryptionSettingsVersion = encryptionSettingsVersion;
    }

    /**
     * Set this flag to true and provide DiskEncryptionKey and optional KeyEncryptionKey to enable encryption. Set this flag to false and remove DiskEncryptionKey and KeyEncryptionKey to disable encryption. If EncryptionSettings is null in the request object, the existing settings remain unchanged.
     * 
    */
    public Boolean getEnabled() {
        return this.enabled;
    }
    /**
     * A collection of encryption settings, one for each disk volume.
     * 
    */
    public List<EncryptionSettingsElementResponse> getEncryptionSettings() {
        return this.encryptionSettings == null ? List.of() : this.encryptionSettings;
    }
    /**
     * Describes what type of encryption is used for the disks. Once this field is set, it cannot be overwritten. '1.0' corresponds to Azure Disk Encryption with AAD app.'1.1' corresponds to Azure Disk Encryption.
     * 
    */
    public Optional<String> getEncryptionSettingsVersion() {
        return Optional.ofNullable(this.encryptionSettingsVersion);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(EncryptionSettingsCollectionResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Boolean enabled;
        private @Nullable List<EncryptionSettingsElementResponse> encryptionSettings;
        private @Nullable String encryptionSettingsVersion;

        public Builder() {
    	      // Empty
        }

        public Builder(EncryptionSettingsCollectionResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.enabled = defaults.enabled;
    	      this.encryptionSettings = defaults.encryptionSettings;
    	      this.encryptionSettingsVersion = defaults.encryptionSettingsVersion;
        }

        public Builder setEnabled(Boolean enabled) {
            this.enabled = Objects.requireNonNull(enabled);
            return this;
        }

        public Builder setEncryptionSettings(@Nullable List<EncryptionSettingsElementResponse> encryptionSettings) {
            this.encryptionSettings = encryptionSettings;
            return this;
        }

        public Builder setEncryptionSettingsVersion(@Nullable String encryptionSettingsVersion) {
            this.encryptionSettingsVersion = encryptionSettingsVersion;
            return this;
        }
        public EncryptionSettingsCollectionResponse build() {
            return new EncryptionSettingsCollectionResponse(enabled, encryptionSettings, encryptionSettingsVersion);
        }
    }
}
