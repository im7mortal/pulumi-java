// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.glue.outputs;

import io.pulumi.aws.glue.outputs.GetDataCatalogEncryptionSettingsDataCatalogEncryptionSettingConnectionPasswordEncryption;
import io.pulumi.aws.glue.outputs.GetDataCatalogEncryptionSettingsDataCatalogEncryptionSettingEncryptionAtRest;
import io.pulumi.core.annotations.OutputCustomType;
import java.util.List;
import java.util.Objects;

@OutputCustomType
public final class GetDataCatalogEncryptionSettingsDataCatalogEncryptionSetting {
    /**
     * When connection password protection is enabled, the Data Catalog uses a customer-provided key to encrypt the password as part of CreateConnection or UpdateConnection and store it in the ENCRYPTED_PASSWORD field in the connection properties. You can enable catalog encryption or only password encryption. see Connection Password Encryption.
     * 
     */
    private final List<GetDataCatalogEncryptionSettingsDataCatalogEncryptionSettingConnectionPasswordEncryption> connectionPasswordEncryptions;
    /**
     * Specifies the encryption-at-rest configuration for the Data Catalog. see Encryption At Rest.
     * 
     */
    private final List<GetDataCatalogEncryptionSettingsDataCatalogEncryptionSettingEncryptionAtRest> encryptionAtRests;

    @OutputCustomType.Constructor({"connectionPasswordEncryptions","encryptionAtRests"})
    private GetDataCatalogEncryptionSettingsDataCatalogEncryptionSetting(
        List<GetDataCatalogEncryptionSettingsDataCatalogEncryptionSettingConnectionPasswordEncryption> connectionPasswordEncryptions,
        List<GetDataCatalogEncryptionSettingsDataCatalogEncryptionSettingEncryptionAtRest> encryptionAtRests) {
        this.connectionPasswordEncryptions = Objects.requireNonNull(connectionPasswordEncryptions);
        this.encryptionAtRests = Objects.requireNonNull(encryptionAtRests);
    }

    /**
     * When connection password protection is enabled, the Data Catalog uses a customer-provided key to encrypt the password as part of CreateConnection or UpdateConnection and store it in the ENCRYPTED_PASSWORD field in the connection properties. You can enable catalog encryption or only password encryption. see Connection Password Encryption.
     * 
    */
    public List<GetDataCatalogEncryptionSettingsDataCatalogEncryptionSettingConnectionPasswordEncryption> getConnectionPasswordEncryptions() {
        return this.connectionPasswordEncryptions;
    }
    /**
     * Specifies the encryption-at-rest configuration for the Data Catalog. see Encryption At Rest.
     * 
    */
    public List<GetDataCatalogEncryptionSettingsDataCatalogEncryptionSettingEncryptionAtRest> getEncryptionAtRests() {
        return this.encryptionAtRests;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetDataCatalogEncryptionSettingsDataCatalogEncryptionSetting defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private List<GetDataCatalogEncryptionSettingsDataCatalogEncryptionSettingConnectionPasswordEncryption> connectionPasswordEncryptions;
        private List<GetDataCatalogEncryptionSettingsDataCatalogEncryptionSettingEncryptionAtRest> encryptionAtRests;

        public Builder() {
    	      // Empty
        }

        public Builder(GetDataCatalogEncryptionSettingsDataCatalogEncryptionSetting defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.connectionPasswordEncryptions = defaults.connectionPasswordEncryptions;
    	      this.encryptionAtRests = defaults.encryptionAtRests;
        }

        public Builder setConnectionPasswordEncryptions(List<GetDataCatalogEncryptionSettingsDataCatalogEncryptionSettingConnectionPasswordEncryption> connectionPasswordEncryptions) {
            this.connectionPasswordEncryptions = Objects.requireNonNull(connectionPasswordEncryptions);
            return this;
        }

        public Builder setEncryptionAtRests(List<GetDataCatalogEncryptionSettingsDataCatalogEncryptionSettingEncryptionAtRest> encryptionAtRests) {
            this.encryptionAtRests = Objects.requireNonNull(encryptionAtRests);
            return this;
        }
        public GetDataCatalogEncryptionSettingsDataCatalogEncryptionSetting build() {
            return new GetDataCatalogEncryptionSettingsDataCatalogEncryptionSetting(connectionPasswordEncryptions, encryptionAtRests);
        }
    }
}
