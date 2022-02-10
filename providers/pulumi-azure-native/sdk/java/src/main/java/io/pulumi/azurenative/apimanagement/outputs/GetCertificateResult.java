// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.apimanagement.outputs;

import io.pulumi.azurenative.apimanagement.outputs.KeyVaultContractPropertiesResponse;
import io.pulumi.core.internal.annotations.OutputCustomType;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class GetCertificateResult {
    private final String expirationDate;
    private final String id;
    private final @Nullable KeyVaultContractPropertiesResponse keyVault;
    private final String name;
    private final String subject;
    private final String thumbprint;
    private final String type;

    @OutputCustomType.Constructor({"expirationDate","id","keyVault","name","subject","thumbprint","type"})
    private GetCertificateResult(
        String expirationDate,
        String id,
        @Nullable KeyVaultContractPropertiesResponse keyVault,
        String name,
        String subject,
        String thumbprint,
        String type) {
        this.expirationDate = Objects.requireNonNull(expirationDate);
        this.id = Objects.requireNonNull(id);
        this.keyVault = keyVault;
        this.name = Objects.requireNonNull(name);
        this.subject = Objects.requireNonNull(subject);
        this.thumbprint = Objects.requireNonNull(thumbprint);
        this.type = Objects.requireNonNull(type);
    }

    public String getExpirationDate() {
        return this.expirationDate;
    }
    public String getId() {
        return this.id;
    }
    public Optional<KeyVaultContractPropertiesResponse> getKeyVault() {
        return Optional.ofNullable(this.keyVault);
    }
    public String getName() {
        return this.name;
    }
    public String getSubject() {
        return this.subject;
    }
    public String getThumbprint() {
        return this.thumbprint;
    }
    public String getType() {
        return this.type;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetCertificateResult defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String expirationDate;
        private String id;
        private @Nullable KeyVaultContractPropertiesResponse keyVault;
        private String name;
        private String subject;
        private String thumbprint;
        private String type;

        public Builder() {
    	      // Empty
        }

        public Builder(GetCertificateResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.expirationDate = defaults.expirationDate;
    	      this.id = defaults.id;
    	      this.keyVault = defaults.keyVault;
    	      this.name = defaults.name;
    	      this.subject = defaults.subject;
    	      this.thumbprint = defaults.thumbprint;
    	      this.type = defaults.type;
        }

        public Builder setExpirationDate(String expirationDate) {
            this.expirationDate = Objects.requireNonNull(expirationDate);
            return this;
        }

        public Builder setId(String id) {
            this.id = Objects.requireNonNull(id);
            return this;
        }

        public Builder setKeyVault(@Nullable KeyVaultContractPropertiesResponse keyVault) {
            this.keyVault = keyVault;
            return this;
        }

        public Builder setName(String name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }

        public Builder setSubject(String subject) {
            this.subject = Objects.requireNonNull(subject);
            return this;
        }

        public Builder setThumbprint(String thumbprint) {
            this.thumbprint = Objects.requireNonNull(thumbprint);
            return this;
        }

        public Builder setType(String type) {
            this.type = Objects.requireNonNull(type);
            return this;
        }

        public GetCertificateResult build() {
            return new GetCertificateResult(expirationDate, id, keyVault, name, subject, thumbprint, type);
        }
    }
}