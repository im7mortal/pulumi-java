// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.cdn.outputs;

import io.pulumi.azurenative.cdn.outputs.ResourceReferenceResponse;
import io.pulumi.core.annotations.OutputCustomType;
import java.lang.Boolean;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class CustomerCertificateParametersResponse {
    /**
     * Certificate issuing authority.
     * 
     */
    private final @Nullable String certificateAuthority;
    /**
     * Resource reference to the KV secret
     * 
     */
    private final ResourceReferenceResponse secretSource;
    /**
     * Version of the secret to be used
     * 
     */
    private final @Nullable String secretVersion;
    /**
     * The list of SANs.
     * 
     */
    private final @Nullable List<String> subjectAlternativeNames;
    /**
     * The type of the Secret to create.
     * Expected value is 'CustomerCertificate'.
     * 
     */
    private final String type;
    /**
     * Whether to use the latest version for the certificate
     * 
     */
    private final @Nullable Boolean useLatestVersion;

    @OutputCustomType.Constructor({"certificateAuthority","secretSource","secretVersion","subjectAlternativeNames","type","useLatestVersion"})
    private CustomerCertificateParametersResponse(
        @Nullable String certificateAuthority,
        ResourceReferenceResponse secretSource,
        @Nullable String secretVersion,
        @Nullable List<String> subjectAlternativeNames,
        String type,
        @Nullable Boolean useLatestVersion) {
        this.certificateAuthority = certificateAuthority;
        this.secretSource = Objects.requireNonNull(secretSource);
        this.secretVersion = secretVersion;
        this.subjectAlternativeNames = subjectAlternativeNames;
        this.type = Objects.requireNonNull(type);
        this.useLatestVersion = useLatestVersion;
    }

    /**
     * Certificate issuing authority.
     * 
    */
    public Optional<String> getCertificateAuthority() {
        return Optional.ofNullable(this.certificateAuthority);
    }
    /**
     * Resource reference to the KV secret
     * 
    */
    public ResourceReferenceResponse getSecretSource() {
        return this.secretSource;
    }
    /**
     * Version of the secret to be used
     * 
    */
    public Optional<String> getSecretVersion() {
        return Optional.ofNullable(this.secretVersion);
    }
    /**
     * The list of SANs.
     * 
    */
    public List<String> getSubjectAlternativeNames() {
        return this.subjectAlternativeNames == null ? List.of() : this.subjectAlternativeNames;
    }
    /**
     * The type of the Secret to create.
     * Expected value is 'CustomerCertificate'.
     * 
    */
    public String getType() {
        return this.type;
    }
    /**
     * Whether to use the latest version for the certificate
     * 
    */
    public Optional<Boolean> getUseLatestVersion() {
        return Optional.ofNullable(this.useLatestVersion);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(CustomerCertificateParametersResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String certificateAuthority;
        private ResourceReferenceResponse secretSource;
        private @Nullable String secretVersion;
        private @Nullable List<String> subjectAlternativeNames;
        private String type;
        private @Nullable Boolean useLatestVersion;

        public Builder() {
    	      // Empty
        }

        public Builder(CustomerCertificateParametersResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.certificateAuthority = defaults.certificateAuthority;
    	      this.secretSource = defaults.secretSource;
    	      this.secretVersion = defaults.secretVersion;
    	      this.subjectAlternativeNames = defaults.subjectAlternativeNames;
    	      this.type = defaults.type;
    	      this.useLatestVersion = defaults.useLatestVersion;
        }

        public Builder setCertificateAuthority(@Nullable String certificateAuthority) {
            this.certificateAuthority = certificateAuthority;
            return this;
        }

        public Builder setSecretSource(ResourceReferenceResponse secretSource) {
            this.secretSource = Objects.requireNonNull(secretSource);
            return this;
        }

        public Builder setSecretVersion(@Nullable String secretVersion) {
            this.secretVersion = secretVersion;
            return this;
        }

        public Builder setSubjectAlternativeNames(@Nullable List<String> subjectAlternativeNames) {
            this.subjectAlternativeNames = subjectAlternativeNames;
            return this;
        }

        public Builder setType(String type) {
            this.type = Objects.requireNonNull(type);
            return this;
        }

        public Builder setUseLatestVersion(@Nullable Boolean useLatestVersion) {
            this.useLatestVersion = useLatestVersion;
            return this;
        }
        public CustomerCertificateParametersResponse build() {
            return new CustomerCertificateParametersResponse(certificateAuthority, secretSource, secretVersion, subjectAlternativeNames, type, useLatestVersion);
        }
    }
}
