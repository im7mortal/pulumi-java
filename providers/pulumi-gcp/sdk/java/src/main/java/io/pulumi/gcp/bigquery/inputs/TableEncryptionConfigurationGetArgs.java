// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.bigquery.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.internal.annotations.InputImport;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


public final class TableEncryptionConfigurationGetArgs extends io.pulumi.resources.ResourceArgs {

    public static final TableEncryptionConfigurationGetArgs Empty = new TableEncryptionConfigurationGetArgs();

    /**
     * The self link or full name of a key which should be used to
     * encrypt this table.  Note that the default bigquery service account will need to have
     * encrypt/decrypt permissions on this key - you may want to see the
     * `gcp.bigquery.getDefaultServiceAccount` datasource and the
     * `gcp.kms.CryptoKeyIAMBinding` resource.
     * 
     */
    @InputImport(name="kmsKeyName", required=true)
    private final Input<String> kmsKeyName;

    public Input<String> getKmsKeyName() {
        return this.kmsKeyName;
    }

    /**
     * The self link or full name of the kms key version used to encrypt this table.
     * 
     */
    @InputImport(name="kmsKeyVersion")
    private final @Nullable Input<String> kmsKeyVersion;

    public Input<String> getKmsKeyVersion() {
        return this.kmsKeyVersion == null ? Input.empty() : this.kmsKeyVersion;
    }

    public TableEncryptionConfigurationGetArgs(
        Input<String> kmsKeyName,
        @Nullable Input<String> kmsKeyVersion) {
        this.kmsKeyName = Objects.requireNonNull(kmsKeyName, "expected parameter 'kmsKeyName' to be non-null");
        this.kmsKeyVersion = kmsKeyVersion;
    }

    private TableEncryptionConfigurationGetArgs() {
        this.kmsKeyName = Input.empty();
        this.kmsKeyVersion = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(TableEncryptionConfigurationGetArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Input<String> kmsKeyName;
        private @Nullable Input<String> kmsKeyVersion;

        public Builder() {
    	      // Empty
        }

        public Builder(TableEncryptionConfigurationGetArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.kmsKeyName = defaults.kmsKeyName;
    	      this.kmsKeyVersion = defaults.kmsKeyVersion;
        }

        public Builder setKmsKeyName(Input<String> kmsKeyName) {
            this.kmsKeyName = Objects.requireNonNull(kmsKeyName);
            return this;
        }

        public Builder setKmsKeyName(String kmsKeyName) {
            this.kmsKeyName = Input.of(Objects.requireNonNull(kmsKeyName));
            return this;
        }

        public Builder setKmsKeyVersion(@Nullable Input<String> kmsKeyVersion) {
            this.kmsKeyVersion = kmsKeyVersion;
            return this;
        }

        public Builder setKmsKeyVersion(@Nullable String kmsKeyVersion) {
            this.kmsKeyVersion = Input.ofNullable(kmsKeyVersion);
            return this;
        }

        public TableEncryptionConfigurationGetArgs build() {
            return new TableEncryptionConfigurationGetArgs(kmsKeyName, kmsKeyVersion);
        }
    }
}