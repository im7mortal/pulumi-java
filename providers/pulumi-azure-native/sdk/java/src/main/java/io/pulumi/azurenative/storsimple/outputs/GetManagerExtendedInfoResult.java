// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.storsimple.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class GetManagerExtendedInfoResult {
    /**
     * Represents the encryption algorithm used to encrypt the keys. None - if Key is saved in plain text format. Algorithm name - if key is encrypted
     * 
     */
    private final String algorithm;
    /**
     * Represents the CEK of the resource.
     * 
     */
    private final @Nullable String encryptionKey;
    /**
     * Represents the Cert thumbprint that was used to encrypt the CEK.
     * 
     */
    private final @Nullable String encryptionKeyThumbprint;
    /**
     * The etag of the resource.
     * 
     */
    private final @Nullable String etag;
    /**
     * The path ID that uniquely identifies the object.
     * 
     */
    private final String id;
    /**
     * Represents the CIK of the resource.
     * 
     */
    private final String integrityKey;
    /**
     * The Kind of the object. Currently only Series8000 is supported
     * 
     */
    private final @Nullable String kind;
    /**
     * The name of the object.
     * 
     */
    private final String name;
    /**
     * Represents the portal thumbprint which can be used optionally to encrypt the entire data before storing it.
     * 
     */
    private final @Nullable String portalCertificateThumbprint;
    /**
     * The hierarchical type of the object.
     * 
     */
    private final String type;
    /**
     * The version of the extended info being persisted.
     * 
     */
    private final @Nullable String version;

    @OutputCustomType.Constructor({"algorithm","encryptionKey","encryptionKeyThumbprint","etag","id","integrityKey","kind","name","portalCertificateThumbprint","type","version"})
    private GetManagerExtendedInfoResult(
        String algorithm,
        @Nullable String encryptionKey,
        @Nullable String encryptionKeyThumbprint,
        @Nullable String etag,
        String id,
        String integrityKey,
        @Nullable String kind,
        String name,
        @Nullable String portalCertificateThumbprint,
        String type,
        @Nullable String version) {
        this.algorithm = Objects.requireNonNull(algorithm);
        this.encryptionKey = encryptionKey;
        this.encryptionKeyThumbprint = encryptionKeyThumbprint;
        this.etag = etag;
        this.id = Objects.requireNonNull(id);
        this.integrityKey = Objects.requireNonNull(integrityKey);
        this.kind = kind;
        this.name = Objects.requireNonNull(name);
        this.portalCertificateThumbprint = portalCertificateThumbprint;
        this.type = Objects.requireNonNull(type);
        this.version = version;
    }

    /**
     * Represents the encryption algorithm used to encrypt the keys. None - if Key is saved in plain text format. Algorithm name - if key is encrypted
     * 
    */
    public String getAlgorithm() {
        return this.algorithm;
    }
    /**
     * Represents the CEK of the resource.
     * 
    */
    public Optional<String> getEncryptionKey() {
        return Optional.ofNullable(this.encryptionKey);
    }
    /**
     * Represents the Cert thumbprint that was used to encrypt the CEK.
     * 
    */
    public Optional<String> getEncryptionKeyThumbprint() {
        return Optional.ofNullable(this.encryptionKeyThumbprint);
    }
    /**
     * The etag of the resource.
     * 
    */
    public Optional<String> getEtag() {
        return Optional.ofNullable(this.etag);
    }
    /**
     * The path ID that uniquely identifies the object.
     * 
    */
    public String getId() {
        return this.id;
    }
    /**
     * Represents the CIK of the resource.
     * 
    */
    public String getIntegrityKey() {
        return this.integrityKey;
    }
    /**
     * The Kind of the object. Currently only Series8000 is supported
     * 
    */
    public Optional<String> getKind() {
        return Optional.ofNullable(this.kind);
    }
    /**
     * The name of the object.
     * 
    */
    public String getName() {
        return this.name;
    }
    /**
     * Represents the portal thumbprint which can be used optionally to encrypt the entire data before storing it.
     * 
    */
    public Optional<String> getPortalCertificateThumbprint() {
        return Optional.ofNullable(this.portalCertificateThumbprint);
    }
    /**
     * The hierarchical type of the object.
     * 
    */
    public String getType() {
        return this.type;
    }
    /**
     * The version of the extended info being persisted.
     * 
    */
    public Optional<String> getVersion() {
        return Optional.ofNullable(this.version);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetManagerExtendedInfoResult defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String algorithm;
        private @Nullable String encryptionKey;
        private @Nullable String encryptionKeyThumbprint;
        private @Nullable String etag;
        private String id;
        private String integrityKey;
        private @Nullable String kind;
        private String name;
        private @Nullable String portalCertificateThumbprint;
        private String type;
        private @Nullable String version;

        public Builder() {
    	      // Empty
        }

        public Builder(GetManagerExtendedInfoResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.algorithm = defaults.algorithm;
    	      this.encryptionKey = defaults.encryptionKey;
    	      this.encryptionKeyThumbprint = defaults.encryptionKeyThumbprint;
    	      this.etag = defaults.etag;
    	      this.id = defaults.id;
    	      this.integrityKey = defaults.integrityKey;
    	      this.kind = defaults.kind;
    	      this.name = defaults.name;
    	      this.portalCertificateThumbprint = defaults.portalCertificateThumbprint;
    	      this.type = defaults.type;
    	      this.version = defaults.version;
        }

        public Builder setAlgorithm(String algorithm) {
            this.algorithm = Objects.requireNonNull(algorithm);
            return this;
        }

        public Builder setEncryptionKey(@Nullable String encryptionKey) {
            this.encryptionKey = encryptionKey;
            return this;
        }

        public Builder setEncryptionKeyThumbprint(@Nullable String encryptionKeyThumbprint) {
            this.encryptionKeyThumbprint = encryptionKeyThumbprint;
            return this;
        }

        public Builder setEtag(@Nullable String etag) {
            this.etag = etag;
            return this;
        }

        public Builder setId(String id) {
            this.id = Objects.requireNonNull(id);
            return this;
        }

        public Builder setIntegrityKey(String integrityKey) {
            this.integrityKey = Objects.requireNonNull(integrityKey);
            return this;
        }

        public Builder setKind(@Nullable String kind) {
            this.kind = kind;
            return this;
        }

        public Builder setName(String name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }

        public Builder setPortalCertificateThumbprint(@Nullable String portalCertificateThumbprint) {
            this.portalCertificateThumbprint = portalCertificateThumbprint;
            return this;
        }

        public Builder setType(String type) {
            this.type = Objects.requireNonNull(type);
            return this;
        }

        public Builder setVersion(@Nullable String version) {
            this.version = version;
            return this;
        }
        public GetManagerExtendedInfoResult build() {
            return new GetManagerExtendedInfoResult(algorithm, encryptionKey, encryptionKeyThumbprint, etag, id, integrityKey, kind, name, portalCertificateThumbprint, type, version);
        }
    }
}
