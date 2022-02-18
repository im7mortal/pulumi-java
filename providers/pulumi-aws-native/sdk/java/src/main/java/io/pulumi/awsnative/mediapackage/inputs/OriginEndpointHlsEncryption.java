// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.mediapackage.inputs;

import io.pulumi.awsnative.mediapackage.enums.OriginEndpointHlsEncryptionEncryptionMethod;
import io.pulumi.awsnative.mediapackage.inputs.OriginEndpointSpekeKeyProvider;
import io.pulumi.core.internal.annotations.InputImport;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * An HTTP Live Streaming (HLS) encryption configuration.
 * 
 */
public final class OriginEndpointHlsEncryption extends io.pulumi.resources.InvokeArgs {

    public static final OriginEndpointHlsEncryption Empty = new OriginEndpointHlsEncryption();

    /**
     * A constant initialization vector for encryption (optional). When not specified the initialization vector will be periodically rotated.
     * 
     */
    @InputImport(name="constantInitializationVector")
    private final @Nullable String constantInitializationVector;

    public Optional<String> getConstantInitializationVector() {
        return this.constantInitializationVector == null ? Optional.empty() : Optional.ofNullable(this.constantInitializationVector);
    }

    /**
     * The encryption method to use.
     * 
     */
    @InputImport(name="encryptionMethod")
    private final @Nullable OriginEndpointHlsEncryptionEncryptionMethod encryptionMethod;

    public Optional<OriginEndpointHlsEncryptionEncryptionMethod> getEncryptionMethod() {
        return this.encryptionMethod == null ? Optional.empty() : Optional.ofNullable(this.encryptionMethod);
    }

    /**
     * Interval (in seconds) between each encryption key rotation.
     * 
     */
    @InputImport(name="keyRotationIntervalSeconds")
    private final @Nullable Integer keyRotationIntervalSeconds;

    public Optional<Integer> getKeyRotationIntervalSeconds() {
        return this.keyRotationIntervalSeconds == null ? Optional.empty() : Optional.ofNullable(this.keyRotationIntervalSeconds);
    }

    /**
     * When enabled, the EXT-X-KEY tag will be repeated in output manifests.
     * 
     */
    @InputImport(name="repeatExtXKey")
    private final @Nullable Boolean repeatExtXKey;

    public Optional<Boolean> getRepeatExtXKey() {
        return this.repeatExtXKey == null ? Optional.empty() : Optional.ofNullable(this.repeatExtXKey);
    }

    @InputImport(name="spekeKeyProvider", required=true)
    private final OriginEndpointSpekeKeyProvider spekeKeyProvider;

    public OriginEndpointSpekeKeyProvider getSpekeKeyProvider() {
        return this.spekeKeyProvider;
    }

    public OriginEndpointHlsEncryption(
        @Nullable String constantInitializationVector,
        @Nullable OriginEndpointHlsEncryptionEncryptionMethod encryptionMethod,
        @Nullable Integer keyRotationIntervalSeconds,
        @Nullable Boolean repeatExtXKey,
        OriginEndpointSpekeKeyProvider spekeKeyProvider) {
        this.constantInitializationVector = constantInitializationVector;
        this.encryptionMethod = encryptionMethod;
        this.keyRotationIntervalSeconds = keyRotationIntervalSeconds;
        this.repeatExtXKey = repeatExtXKey;
        this.spekeKeyProvider = Objects.requireNonNull(spekeKeyProvider, "expected parameter 'spekeKeyProvider' to be non-null");
    }

    private OriginEndpointHlsEncryption() {
        this.constantInitializationVector = null;
        this.encryptionMethod = null;
        this.keyRotationIntervalSeconds = null;
        this.repeatExtXKey = null;
        this.spekeKeyProvider = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(OriginEndpointHlsEncryption defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String constantInitializationVector;
        private @Nullable OriginEndpointHlsEncryptionEncryptionMethod encryptionMethod;
        private @Nullable Integer keyRotationIntervalSeconds;
        private @Nullable Boolean repeatExtXKey;
        private OriginEndpointSpekeKeyProvider spekeKeyProvider;

        public Builder() {
    	      // Empty
        }

        public Builder(OriginEndpointHlsEncryption defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.constantInitializationVector = defaults.constantInitializationVector;
    	      this.encryptionMethod = defaults.encryptionMethod;
    	      this.keyRotationIntervalSeconds = defaults.keyRotationIntervalSeconds;
    	      this.repeatExtXKey = defaults.repeatExtXKey;
    	      this.spekeKeyProvider = defaults.spekeKeyProvider;
        }

        public Builder setConstantInitializationVector(@Nullable String constantInitializationVector) {
            this.constantInitializationVector = constantInitializationVector;
            return this;
        }

        public Builder setEncryptionMethod(@Nullable OriginEndpointHlsEncryptionEncryptionMethod encryptionMethod) {
            this.encryptionMethod = encryptionMethod;
            return this;
        }

        public Builder setKeyRotationIntervalSeconds(@Nullable Integer keyRotationIntervalSeconds) {
            this.keyRotationIntervalSeconds = keyRotationIntervalSeconds;
            return this;
        }

        public Builder setRepeatExtXKey(@Nullable Boolean repeatExtXKey) {
            this.repeatExtXKey = repeatExtXKey;
            return this;
        }

        public Builder setSpekeKeyProvider(OriginEndpointSpekeKeyProvider spekeKeyProvider) {
            this.spekeKeyProvider = Objects.requireNonNull(spekeKeyProvider);
            return this;
        }

        public OriginEndpointHlsEncryption build() {
            return new OriginEndpointHlsEncryption(constantInitializationVector, encryptionMethod, keyRotationIntervalSeconds, repeatExtXKey, spekeKeyProvider);
        }
    }
}