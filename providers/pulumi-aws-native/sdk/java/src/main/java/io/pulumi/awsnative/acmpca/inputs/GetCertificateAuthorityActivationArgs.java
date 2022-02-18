// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.acmpca.inputs;

import io.pulumi.core.internal.annotations.InputImport;
import java.lang.String;
import java.util.Objects;


public final class GetCertificateAuthorityActivationArgs extends io.pulumi.resources.InvokeArgs {

    public static final GetCertificateAuthorityActivationArgs Empty = new GetCertificateAuthorityActivationArgs();

    /**
     * Arn of the Certificate Authority.
     * 
     */
    @InputImport(name="certificateAuthorityArn", required=true)
    private final String certificateAuthorityArn;

    public String getCertificateAuthorityArn() {
        return this.certificateAuthorityArn;
    }

    public GetCertificateAuthorityActivationArgs(String certificateAuthorityArn) {
        this.certificateAuthorityArn = Objects.requireNonNull(certificateAuthorityArn, "expected parameter 'certificateAuthorityArn' to be non-null");
    }

    private GetCertificateAuthorityActivationArgs() {
        this.certificateAuthorityArn = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetCertificateAuthorityActivationArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String certificateAuthorityArn;

        public Builder() {
    	      // Empty
        }

        public Builder(GetCertificateAuthorityActivationArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.certificateAuthorityArn = defaults.certificateAuthorityArn;
        }

        public Builder setCertificateAuthorityArn(String certificateAuthorityArn) {
            this.certificateAuthorityArn = Objects.requireNonNull(certificateAuthorityArn);
            return this;
        }

        public GetCertificateAuthorityActivationArgs build() {
            return new GetCertificateAuthorityActivationArgs(certificateAuthorityArn);
        }
    }
}
