// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.appmesh.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import java.lang.String;
import java.util.Objects;

@OutputCustomType
public final class VirtualGatewaySpecBackendDefaultsClientPolicyTlsValidationTrustFile {
    /**
     * The certificate trust chain for a certificate stored on the file system of the mesh endpoint that the proxy is running on. Must be between 1 and 255 characters in length.
     * 
     */
    private final String certificateChain;

    @OutputCustomType.Constructor({"certificateChain"})
    private VirtualGatewaySpecBackendDefaultsClientPolicyTlsValidationTrustFile(String certificateChain) {
        this.certificateChain = Objects.requireNonNull(certificateChain);
    }

    /**
     * The certificate trust chain for a certificate stored on the file system of the mesh endpoint that the proxy is running on. Must be between 1 and 255 characters in length.
     * 
    */
    public String getCertificateChain() {
        return this.certificateChain;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(VirtualGatewaySpecBackendDefaultsClientPolicyTlsValidationTrustFile defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String certificateChain;

        public Builder() {
    	      // Empty
        }

        public Builder(VirtualGatewaySpecBackendDefaultsClientPolicyTlsValidationTrustFile defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.certificateChain = defaults.certificateChain;
        }

        public Builder setCertificateChain(String certificateChain) {
            this.certificateChain = Objects.requireNonNull(certificateChain);
            return this;
        }
        public VirtualGatewaySpecBackendDefaultsClientPolicyTlsValidationTrustFile build() {
            return new VirtualGatewaySpecBackendDefaultsClientPolicyTlsValidationTrustFile(certificateChain);
        }
    }
}
