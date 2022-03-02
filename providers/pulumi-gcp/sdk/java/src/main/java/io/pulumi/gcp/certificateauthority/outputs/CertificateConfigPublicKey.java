// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.certificateauthority.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class CertificateConfigPublicKey {
    /**
     * The format of the public key. Currently, only PEM format is supported.
     * Possible values are `KEY_TYPE_UNSPECIFIED` and `PEM`.
     * 
     */
    private final String format;
    /**
     * Required. A public key. When this is specified in a request, the padding and encoding can be any of the options described by the respective 'KeyType' value. When this is generated by the service, it will always be an RFC 5280 SubjectPublicKeyInfo structure containing an algorithm identifier and a key. A base64-encoded string.
     * 
     */
    private final @Nullable String key;

    @OutputCustomType.Constructor({"format","key"})
    private CertificateConfigPublicKey(
        String format,
        @Nullable String key) {
        this.format = Objects.requireNonNull(format);
        this.key = key;
    }

    /**
     * The format of the public key. Currently, only PEM format is supported.
     * Possible values are `KEY_TYPE_UNSPECIFIED` and `PEM`.
     * 
    */
    public String getFormat() {
        return this.format;
    }
    /**
     * Required. A public key. When this is specified in a request, the padding and encoding can be any of the options described by the respective 'KeyType' value. When this is generated by the service, it will always be an RFC 5280 SubjectPublicKeyInfo structure containing an algorithm identifier and a key. A base64-encoded string.
     * 
    */
    public Optional<String> getKey() {
        return Optional.ofNullable(this.key);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(CertificateConfigPublicKey defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String format;
        private @Nullable String key;

        public Builder() {
    	      // Empty
        }

        public Builder(CertificateConfigPublicKey defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.format = defaults.format;
    	      this.key = defaults.key;
        }

        public Builder setFormat(String format) {
            this.format = Objects.requireNonNull(format);
            return this;
        }

        public Builder setKey(@Nullable String key) {
            this.key = key;
            return this;
        }
        public CertificateConfigPublicKey build() {
            return new CertificateConfigPublicKey(format, key);
        }
    }
}
