// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.kms.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import java.lang.String;
import java.util.Objects;

@OutputCustomType
public final class GetKMSCryptoKeyVersionPublicKey {
    /**
     * The CryptoKeyVersionAlgorithm that this CryptoKeyVersion supports.
     * 
     */
    private final String algorithm;
    /**
     * The public key, encoded in PEM format. For more information, see the RFC 7468 sections for General Considerations and Textual Encoding of Subject Public Key Info.
     * 
     */
    private final String pem;

    @OutputCustomType.Constructor({"algorithm","pem"})
    private GetKMSCryptoKeyVersionPublicKey(
        String algorithm,
        String pem) {
        this.algorithm = Objects.requireNonNull(algorithm);
        this.pem = Objects.requireNonNull(pem);
    }

    /**
     * The CryptoKeyVersionAlgorithm that this CryptoKeyVersion supports.
     * 
    */
    public String getAlgorithm() {
        return this.algorithm;
    }
    /**
     * The public key, encoded in PEM format. For more information, see the RFC 7468 sections for General Considerations and Textual Encoding of Subject Public Key Info.
     * 
    */
    public String getPem() {
        return this.pem;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetKMSCryptoKeyVersionPublicKey defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String algorithm;
        private String pem;

        public Builder() {
    	      // Empty
        }

        public Builder(GetKMSCryptoKeyVersionPublicKey defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.algorithm = defaults.algorithm;
    	      this.pem = defaults.pem;
        }

        public Builder setAlgorithm(String algorithm) {
            this.algorithm = Objects.requireNonNull(algorithm);
            return this;
        }

        public Builder setPem(String pem) {
            this.pem = Objects.requireNonNull(pem);
            return this;
        }
        public GetKMSCryptoKeyVersionPublicKey build() {
            return new GetKMSCryptoKeyVersionPublicKey(algorithm, pem);
        }
    }
}
