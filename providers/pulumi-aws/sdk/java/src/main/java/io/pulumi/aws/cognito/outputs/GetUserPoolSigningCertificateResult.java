// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.cognito.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import java.lang.String;
import java.util.Objects;

@OutputCustomType
public final class GetUserPoolSigningCertificateResult {
    /**
     * The certificate string
     * 
     */
    private final String certificate;
    /**
     * The provider-assigned unique ID for this managed resource.
     * 
     */
    private final String id;
    private final String userPoolId;

    @OutputCustomType.Constructor({"certificate","id","userPoolId"})
    private GetUserPoolSigningCertificateResult(
        String certificate,
        String id,
        String userPoolId) {
        this.certificate = Objects.requireNonNull(certificate);
        this.id = Objects.requireNonNull(id);
        this.userPoolId = Objects.requireNonNull(userPoolId);
    }

    /**
     * The certificate string
     * 
    */
    public String getCertificate() {
        return this.certificate;
    }
    /**
     * The provider-assigned unique ID for this managed resource.
     * 
    */
    public String getId() {
        return this.id;
    }
    public String getUserPoolId() {
        return this.userPoolId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetUserPoolSigningCertificateResult defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String certificate;
        private String id;
        private String userPoolId;

        public Builder() {
    	      // Empty
        }

        public Builder(GetUserPoolSigningCertificateResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.certificate = defaults.certificate;
    	      this.id = defaults.id;
    	      this.userPoolId = defaults.userPoolId;
        }

        public Builder setCertificate(String certificate) {
            this.certificate = Objects.requireNonNull(certificate);
            return this;
        }

        public Builder setId(String id) {
            this.id = Objects.requireNonNull(id);
            return this;
        }

        public Builder setUserPoolId(String userPoolId) {
            this.userPoolId = Objects.requireNonNull(userPoolId);
            return this;
        }
        public GetUserPoolSigningCertificateResult build() {
            return new GetUserPoolSigningCertificateResult(certificate, id, userPoolId);
        }
    }
}
