// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.appmesh.outputs;

import io.pulumi.aws.appmesh.outputs.VirtualNodeSpecBackendVirtualServiceClientPolicyTlsValidationTrustAcm;
import io.pulumi.aws.appmesh.outputs.VirtualNodeSpecBackendVirtualServiceClientPolicyTlsValidationTrustFile;
import io.pulumi.aws.appmesh.outputs.VirtualNodeSpecBackendVirtualServiceClientPolicyTlsValidationTrustSds;
import io.pulumi.core.annotations.OutputCustomType;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class VirtualNodeSpecBackendVirtualServiceClientPolicyTlsValidationTrust {
    /**
     * The TLS validation context trust for an AWS Certificate Manager (ACM) certificate.
     * 
     */
    private final @Nullable VirtualNodeSpecBackendVirtualServiceClientPolicyTlsValidationTrustAcm acm;
    /**
     * The TLS validation context trust for a local file certificate.
     * 
     */
    private final @Nullable VirtualNodeSpecBackendVirtualServiceClientPolicyTlsValidationTrustFile file;
    /**
     * The TLS validation context trust for a [Secret Discovery Service](https://www.envoyproxy.io/docs/envoy/latest/configuration/security/secret#secret-discovery-service-sds) certificate.
     * 
     */
    private final @Nullable VirtualNodeSpecBackendVirtualServiceClientPolicyTlsValidationTrustSds sds;

    @OutputCustomType.Constructor({"acm","file","sds"})
    private VirtualNodeSpecBackendVirtualServiceClientPolicyTlsValidationTrust(
        @Nullable VirtualNodeSpecBackendVirtualServiceClientPolicyTlsValidationTrustAcm acm,
        @Nullable VirtualNodeSpecBackendVirtualServiceClientPolicyTlsValidationTrustFile file,
        @Nullable VirtualNodeSpecBackendVirtualServiceClientPolicyTlsValidationTrustSds sds) {
        this.acm = acm;
        this.file = file;
        this.sds = sds;
    }

    /**
     * The TLS validation context trust for an AWS Certificate Manager (ACM) certificate.
     * 
    */
    public Optional<VirtualNodeSpecBackendVirtualServiceClientPolicyTlsValidationTrustAcm> getAcm() {
        return Optional.ofNullable(this.acm);
    }
    /**
     * The TLS validation context trust for a local file certificate.
     * 
    */
    public Optional<VirtualNodeSpecBackendVirtualServiceClientPolicyTlsValidationTrustFile> getFile() {
        return Optional.ofNullable(this.file);
    }
    /**
     * The TLS validation context trust for a [Secret Discovery Service](https://www.envoyproxy.io/docs/envoy/latest/configuration/security/secret#secret-discovery-service-sds) certificate.
     * 
    */
    public Optional<VirtualNodeSpecBackendVirtualServiceClientPolicyTlsValidationTrustSds> getSds() {
        return Optional.ofNullable(this.sds);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(VirtualNodeSpecBackendVirtualServiceClientPolicyTlsValidationTrust defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable VirtualNodeSpecBackendVirtualServiceClientPolicyTlsValidationTrustAcm acm;
        private @Nullable VirtualNodeSpecBackendVirtualServiceClientPolicyTlsValidationTrustFile file;
        private @Nullable VirtualNodeSpecBackendVirtualServiceClientPolicyTlsValidationTrustSds sds;

        public Builder() {
    	      // Empty
        }

        public Builder(VirtualNodeSpecBackendVirtualServiceClientPolicyTlsValidationTrust defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.acm = defaults.acm;
    	      this.file = defaults.file;
    	      this.sds = defaults.sds;
        }

        public Builder setAcm(@Nullable VirtualNodeSpecBackendVirtualServiceClientPolicyTlsValidationTrustAcm acm) {
            this.acm = acm;
            return this;
        }

        public Builder setFile(@Nullable VirtualNodeSpecBackendVirtualServiceClientPolicyTlsValidationTrustFile file) {
            this.file = file;
            return this;
        }

        public Builder setSds(@Nullable VirtualNodeSpecBackendVirtualServiceClientPolicyTlsValidationTrustSds sds) {
            this.sds = sds;
            return this;
        }
        public VirtualNodeSpecBackendVirtualServiceClientPolicyTlsValidationTrust build() {
            return new VirtualNodeSpecBackendVirtualServiceClientPolicyTlsValidationTrust(acm, file, sds);
        }
    }
}
