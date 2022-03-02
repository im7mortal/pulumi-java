// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.privateca_v1beta1.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import io.pulumi.googlenative.privateca_v1beta1.outputs.SubordinateConfigChainResponse;
import java.lang.String;
import java.util.Objects;

@OutputCustomType
public final class SubordinateConfigResponse {
    /**
     * This can refer to a CertificateAuthority that was used to create a subordinate CertificateAuthority. This field is used for information and usability purposes only. The resource name is in the format `projects/*{@literal /}locations/*{@literal /}certificateAuthorities/*`.
     * 
     */
    private final String certificateAuthority;
    /**
     * Contains the PEM certificate chain for the issuers of this CertificateAuthority, but not pem certificate for this CA itself.
     * 
     */
    private final SubordinateConfigChainResponse pemIssuerChain;

    @OutputCustomType.Constructor({"certificateAuthority","pemIssuerChain"})
    private SubordinateConfigResponse(
        String certificateAuthority,
        SubordinateConfigChainResponse pemIssuerChain) {
        this.certificateAuthority = Objects.requireNonNull(certificateAuthority);
        this.pemIssuerChain = Objects.requireNonNull(pemIssuerChain);
    }

    /**
     * This can refer to a CertificateAuthority that was used to create a subordinate CertificateAuthority. This field is used for information and usability purposes only. The resource name is in the format `projects/*{@literal /}locations/*{@literal /}certificateAuthorities/*`.
     * 
    */
    public String getCertificateAuthority() {
        return this.certificateAuthority;
    }
    /**
     * Contains the PEM certificate chain for the issuers of this CertificateAuthority, but not pem certificate for this CA itself.
     * 
    */
    public SubordinateConfigChainResponse getPemIssuerChain() {
        return this.pemIssuerChain;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(SubordinateConfigResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String certificateAuthority;
        private SubordinateConfigChainResponse pemIssuerChain;

        public Builder() {
    	      // Empty
        }

        public Builder(SubordinateConfigResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.certificateAuthority = defaults.certificateAuthority;
    	      this.pemIssuerChain = defaults.pemIssuerChain;
        }

        public Builder setCertificateAuthority(String certificateAuthority) {
            this.certificateAuthority = Objects.requireNonNull(certificateAuthority);
            return this;
        }

        public Builder setPemIssuerChain(SubordinateConfigChainResponse pemIssuerChain) {
            this.pemIssuerChain = Objects.requireNonNull(pemIssuerChain);
            return this;
        }
        public SubordinateConfigResponse build() {
            return new SubordinateConfigResponse(certificateAuthority, pemIssuerChain);
        }
    }
}
