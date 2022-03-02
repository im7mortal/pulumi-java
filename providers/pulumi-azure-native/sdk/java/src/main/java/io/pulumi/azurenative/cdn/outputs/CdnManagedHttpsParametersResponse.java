// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.cdn.outputs;

import io.pulumi.azurenative.cdn.outputs.CdnCertificateSourceParametersResponse;
import io.pulumi.core.annotations.OutputCustomType;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class CdnManagedHttpsParametersResponse {
    /**
     * Defines the source of the SSL certificate.
     * Expected value is 'Cdn'.
     * 
     */
    private final String certificateSource;
    /**
     * Defines the certificate source parameters using CDN managed certificate for enabling SSL.
     * 
     */
    private final CdnCertificateSourceParametersResponse certificateSourceParameters;
    /**
     * TLS protocol version that will be used for Https
     * 
     */
    private final @Nullable String minimumTlsVersion;
    /**
     * Defines the TLS extension protocol that is used for secure delivery.
     * 
     */
    private final String protocolType;

    @OutputCustomType.Constructor({"certificateSource","certificateSourceParameters","minimumTlsVersion","protocolType"})
    private CdnManagedHttpsParametersResponse(
        String certificateSource,
        CdnCertificateSourceParametersResponse certificateSourceParameters,
        @Nullable String minimumTlsVersion,
        String protocolType) {
        this.certificateSource = Objects.requireNonNull(certificateSource);
        this.certificateSourceParameters = Objects.requireNonNull(certificateSourceParameters);
        this.minimumTlsVersion = minimumTlsVersion;
        this.protocolType = Objects.requireNonNull(protocolType);
    }

    /**
     * Defines the source of the SSL certificate.
     * Expected value is 'Cdn'.
     * 
    */
    public String getCertificateSource() {
        return this.certificateSource;
    }
    /**
     * Defines the certificate source parameters using CDN managed certificate for enabling SSL.
     * 
    */
    public CdnCertificateSourceParametersResponse getCertificateSourceParameters() {
        return this.certificateSourceParameters;
    }
    /**
     * TLS protocol version that will be used for Https
     * 
    */
    public Optional<String> getMinimumTlsVersion() {
        return Optional.ofNullable(this.minimumTlsVersion);
    }
    /**
     * Defines the TLS extension protocol that is used for secure delivery.
     * 
    */
    public String getProtocolType() {
        return this.protocolType;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(CdnManagedHttpsParametersResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String certificateSource;
        private CdnCertificateSourceParametersResponse certificateSourceParameters;
        private @Nullable String minimumTlsVersion;
        private String protocolType;

        public Builder() {
    	      // Empty
        }

        public Builder(CdnManagedHttpsParametersResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.certificateSource = defaults.certificateSource;
    	      this.certificateSourceParameters = defaults.certificateSourceParameters;
    	      this.minimumTlsVersion = defaults.minimumTlsVersion;
    	      this.protocolType = defaults.protocolType;
        }

        public Builder setCertificateSource(String certificateSource) {
            this.certificateSource = Objects.requireNonNull(certificateSource);
            return this;
        }

        public Builder setCertificateSourceParameters(CdnCertificateSourceParametersResponse certificateSourceParameters) {
            this.certificateSourceParameters = Objects.requireNonNull(certificateSourceParameters);
            return this;
        }

        public Builder setMinimumTlsVersion(@Nullable String minimumTlsVersion) {
            this.minimumTlsVersion = minimumTlsVersion;
            return this;
        }

        public Builder setProtocolType(String protocolType) {
            this.protocolType = Objects.requireNonNull(protocolType);
            return this;
        }
        public CdnManagedHttpsParametersResponse build() {
            return new CdnManagedHttpsParametersResponse(certificateSource, certificateSourceParameters, minimumTlsVersion, protocolType);
        }
    }
}
