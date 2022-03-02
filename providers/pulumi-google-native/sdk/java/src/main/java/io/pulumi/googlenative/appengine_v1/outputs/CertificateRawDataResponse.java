// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.appengine_v1.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import java.lang.String;
import java.util.Objects;

@OutputCustomType
public final class CertificateRawDataResponse {
    /**
     * Unencrypted PEM encoded RSA private key. This field is set once on certificate creation and then encrypted. The key size must be 2048 bits or fewer. Must include the header and footer. Example: -----BEGIN RSA PRIVATE KEY----- -----END RSA PRIVATE KEY----- @InputOnly
     * 
     */
    private final String privateKey;
    /**
     * PEM encoded x.509 public key certificate. This field is set once on certificate creation. Must include the header and footer. Example: -----BEGIN CERTIFICATE----- -----END CERTIFICATE-----
     * 
     */
    private final String publicCertificate;

    @OutputCustomType.Constructor({"privateKey","publicCertificate"})
    private CertificateRawDataResponse(
        String privateKey,
        String publicCertificate) {
        this.privateKey = Objects.requireNonNull(privateKey);
        this.publicCertificate = Objects.requireNonNull(publicCertificate);
    }

    /**
     * Unencrypted PEM encoded RSA private key. This field is set once on certificate creation and then encrypted. The key size must be 2048 bits or fewer. Must include the header and footer. Example: -----BEGIN RSA PRIVATE KEY----- -----END RSA PRIVATE KEY----- @InputOnly
     * 
    */
    public String getPrivateKey() {
        return this.privateKey;
    }
    /**
     * PEM encoded x.509 public key certificate. This field is set once on certificate creation. Must include the header and footer. Example: -----BEGIN CERTIFICATE----- -----END CERTIFICATE-----
     * 
    */
    public String getPublicCertificate() {
        return this.publicCertificate;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(CertificateRawDataResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String privateKey;
        private String publicCertificate;

        public Builder() {
    	      // Empty
        }

        public Builder(CertificateRawDataResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.privateKey = defaults.privateKey;
    	      this.publicCertificate = defaults.publicCertificate;
        }

        public Builder setPrivateKey(String privateKey) {
            this.privateKey = Objects.requireNonNull(privateKey);
            return this;
        }

        public Builder setPublicCertificate(String publicCertificate) {
            this.publicCertificate = Objects.requireNonNull(publicCertificate);
            return this;
        }
        public CertificateRawDataResponse build() {
            return new CertificateRawDataResponse(privateKey, publicCertificate);
        }
    }
}
