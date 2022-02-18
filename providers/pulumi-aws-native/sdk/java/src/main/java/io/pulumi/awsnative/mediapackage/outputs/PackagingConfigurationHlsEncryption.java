// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.mediapackage.outputs;

import io.pulumi.awsnative.mediapackage.enums.PackagingConfigurationHlsEncryptionEncryptionMethod;
import io.pulumi.awsnative.mediapackage.outputs.PackagingConfigurationSpekeKeyProvider;
import io.pulumi.core.internal.annotations.OutputCustomType;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class PackagingConfigurationHlsEncryption {
    /**
     * An HTTP Live Streaming (HLS) encryption configuration.
     * 
     */
    private final @Nullable String constantInitializationVector;
    /**
     * The encryption method to use.
     * 
     */
    private final @Nullable PackagingConfigurationHlsEncryptionEncryptionMethod encryptionMethod;
    private final PackagingConfigurationSpekeKeyProvider spekeKeyProvider;

    @OutputCustomType.Constructor({"constantInitializationVector","encryptionMethod","spekeKeyProvider"})
    private PackagingConfigurationHlsEncryption(
        @Nullable String constantInitializationVector,
        @Nullable PackagingConfigurationHlsEncryptionEncryptionMethod encryptionMethod,
        PackagingConfigurationSpekeKeyProvider spekeKeyProvider) {
        this.constantInitializationVector = constantInitializationVector;
        this.encryptionMethod = encryptionMethod;
        this.spekeKeyProvider = Objects.requireNonNull(spekeKeyProvider);
    }

    /**
     * An HTTP Live Streaming (HLS) encryption configuration.
     * 
     */
    public Optional<String> getConstantInitializationVector() {
        return Optional.ofNullable(this.constantInitializationVector);
    }
    /**
     * The encryption method to use.
     * 
     */
    public Optional<PackagingConfigurationHlsEncryptionEncryptionMethod> getEncryptionMethod() {
        return Optional.ofNullable(this.encryptionMethod);
    }
    public PackagingConfigurationSpekeKeyProvider getSpekeKeyProvider() {
        return this.spekeKeyProvider;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(PackagingConfigurationHlsEncryption defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String constantInitializationVector;
        private @Nullable PackagingConfigurationHlsEncryptionEncryptionMethod encryptionMethod;
        private PackagingConfigurationSpekeKeyProvider spekeKeyProvider;

        public Builder() {
    	      // Empty
        }

        public Builder(PackagingConfigurationHlsEncryption defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.constantInitializationVector = defaults.constantInitializationVector;
    	      this.encryptionMethod = defaults.encryptionMethod;
    	      this.spekeKeyProvider = defaults.spekeKeyProvider;
        }

        public Builder setConstantInitializationVector(@Nullable String constantInitializationVector) {
            this.constantInitializationVector = constantInitializationVector;
            return this;
        }

        public Builder setEncryptionMethod(@Nullable PackagingConfigurationHlsEncryptionEncryptionMethod encryptionMethod) {
            this.encryptionMethod = encryptionMethod;
            return this;
        }

        public Builder setSpekeKeyProvider(PackagingConfigurationSpekeKeyProvider spekeKeyProvider) {
            this.spekeKeyProvider = Objects.requireNonNull(spekeKeyProvider);
            return this;
        }

        public PackagingConfigurationHlsEncryption build() {
            return new PackagingConfigurationHlsEncryption(constantInitializationVector, encryptionMethod, spekeKeyProvider);
        }
    }
}
