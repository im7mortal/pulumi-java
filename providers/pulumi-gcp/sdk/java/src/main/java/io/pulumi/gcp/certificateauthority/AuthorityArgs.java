// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.certificateauthority;

import io.pulumi.core.Input;
import io.pulumi.core.internal.annotations.InputImport;
import io.pulumi.gcp.certificateauthority.inputs.AuthorityConfigArgs;
import io.pulumi.gcp.certificateauthority.inputs.AuthorityKeySpecArgs;
import java.lang.Boolean;
import java.lang.String;
import java.util.Map;
import java.util.Objects;
import javax.annotation.Nullable;


public final class AuthorityArgs extends io.pulumi.resources.ResourceArgs {

    public static final AuthorityArgs Empty = new AuthorityArgs();

    /**
     * The user provided Resource ID for this Certificate Authority.
     * 
     */
    @InputImport(name="certificateAuthorityId", required=true)
    private final Input<String> certificateAuthorityId;

    public Input<String> getCertificateAuthorityId() {
        return this.certificateAuthorityId;
    }

    /**
     * The config used to create a self-signed X.509 certificate or CSR.
     * Structure is documented below.
     * 
     */
    @InputImport(name="config", required=true)
    private final Input<AuthorityConfigArgs> config;

    public Input<AuthorityConfigArgs> getConfig() {
        return this.config;
    }

    /**
     * The name of a Cloud Storage bucket where this CertificateAuthority will publish content,
     * such as the CA certificate and CRLs. This must be a bucket name, without any prefixes
     * (such as `gs://`) or suffixes (such as `.googleapis.com`). For example, to use a bucket named
     * my-bucket, you would simply specify `my-bucket`. If not specified, a managed bucket will be
     * created.
     * 
     */
    @InputImport(name="gcsBucket")
    private final @Nullable Input<String> gcsBucket;

    public Input<String> getGcsBucket() {
        return this.gcsBucket == null ? Input.empty() : this.gcsBucket;
    }

    /**
     * This field allows the CA to be deleted even if the CA has active certs. Active certs include both unrevoked and unexpired certs.
     * Use with care. Defaults to `false`.
     * 
     */
    @InputImport(name="ignoreActiveCertificatesOnDeletion")
    private final @Nullable Input<Boolean> ignoreActiveCertificatesOnDeletion;

    public Input<Boolean> getIgnoreActiveCertificatesOnDeletion() {
        return this.ignoreActiveCertificatesOnDeletion == null ? Input.empty() : this.ignoreActiveCertificatesOnDeletion;
    }

    /**
     * Used when issuing certificates for this CertificateAuthority. If this CertificateAuthority
     * is a self-signed CertificateAuthority, this key is also used to sign the self-signed CA
     * certificate. Otherwise, it is used to sign a CSR.
     * Structure is documented below.
     * 
     */
    @InputImport(name="keySpec", required=true)
    private final Input<AuthorityKeySpecArgs> keySpec;

    public Input<AuthorityKeySpecArgs> getKeySpec() {
        return this.keySpec;
    }

    /**
     * Labels with user-defined metadata.
     * An object containing a list of "key": value pairs. Example: { "name": "wrench", "mass":
     * "1.3kg", "count": "3" }.
     * 
     */
    @InputImport(name="labels")
    private final @Nullable Input<Map<String,String>> labels;

    public Input<Map<String,String>> getLabels() {
        return this.labels == null ? Input.empty() : this.labels;
    }

    /**
     * The desired lifetime of the CA certificate. Used to create the "notBeforeTime" and
     * "notAfterTime" fields inside an X.509 certificate. A duration in seconds with up to nine
     * fractional digits, terminated by 's'. Example: "3.5s".
     * 
     */
    @InputImport(name="lifetime")
    private final @Nullable Input<String> lifetime;

    public Input<String> getLifetime() {
        return this.lifetime == null ? Input.empty() : this.lifetime;
    }

    /**
     * Location of the CertificateAuthority. A full list of valid locations can be found by
     * running `gcloud privateca locations list`.
     * 
     */
    @InputImport(name="location", required=true)
    private final Input<String> location;

    public Input<String> getLocation() {
        return this.location;
    }

    /**
     * The name of the CaPool this Certificate Authority belongs to.
     * 
     */
    @InputImport(name="pool", required=true)
    private final Input<String> pool;

    public Input<String> getPool() {
        return this.pool;
    }

    /**
     * The ID of the project in which the resource belongs.
     * If it is not provided, the provider project is used.
     * 
     */
    @InputImport(name="project")
    private final @Nullable Input<String> project;

    public Input<String> getProject() {
        return this.project == null ? Input.empty() : this.project;
    }

    /**
     * The Type of this CertificateAuthority.
     * > **Note:** For `SUBORDINATE` Certificate Authorities, they need to
     * be manually activated (via Cloud Console of `gcloud`) before they can
     * issue certificates.
     * Default value is `SELF_SIGNED`.
     * Possible values are `SELF_SIGNED` and `SUBORDINATE`.
     * 
     */
    @InputImport(name="type")
    private final @Nullable Input<String> type;

    public Input<String> getType() {
        return this.type == null ? Input.empty() : this.type;
    }

    public AuthorityArgs(
        Input<String> certificateAuthorityId,
        Input<AuthorityConfigArgs> config,
        @Nullable Input<String> gcsBucket,
        @Nullable Input<Boolean> ignoreActiveCertificatesOnDeletion,
        Input<AuthorityKeySpecArgs> keySpec,
        @Nullable Input<Map<String,String>> labels,
        @Nullable Input<String> lifetime,
        Input<String> location,
        Input<String> pool,
        @Nullable Input<String> project,
        @Nullable Input<String> type) {
        this.certificateAuthorityId = Objects.requireNonNull(certificateAuthorityId, "expected parameter 'certificateAuthorityId' to be non-null");
        this.config = Objects.requireNonNull(config, "expected parameter 'config' to be non-null");
        this.gcsBucket = gcsBucket;
        this.ignoreActiveCertificatesOnDeletion = ignoreActiveCertificatesOnDeletion;
        this.keySpec = Objects.requireNonNull(keySpec, "expected parameter 'keySpec' to be non-null");
        this.labels = labels;
        this.lifetime = lifetime;
        this.location = Objects.requireNonNull(location, "expected parameter 'location' to be non-null");
        this.pool = Objects.requireNonNull(pool, "expected parameter 'pool' to be non-null");
        this.project = project;
        this.type = type;
    }

    private AuthorityArgs() {
        this.certificateAuthorityId = Input.empty();
        this.config = Input.empty();
        this.gcsBucket = Input.empty();
        this.ignoreActiveCertificatesOnDeletion = Input.empty();
        this.keySpec = Input.empty();
        this.labels = Input.empty();
        this.lifetime = Input.empty();
        this.location = Input.empty();
        this.pool = Input.empty();
        this.project = Input.empty();
        this.type = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(AuthorityArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Input<String> certificateAuthorityId;
        private Input<AuthorityConfigArgs> config;
        private @Nullable Input<String> gcsBucket;
        private @Nullable Input<Boolean> ignoreActiveCertificatesOnDeletion;
        private Input<AuthorityKeySpecArgs> keySpec;
        private @Nullable Input<Map<String,String>> labels;
        private @Nullable Input<String> lifetime;
        private Input<String> location;
        private Input<String> pool;
        private @Nullable Input<String> project;
        private @Nullable Input<String> type;

        public Builder() {
    	      // Empty
        }

        public Builder(AuthorityArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.certificateAuthorityId = defaults.certificateAuthorityId;
    	      this.config = defaults.config;
    	      this.gcsBucket = defaults.gcsBucket;
    	      this.ignoreActiveCertificatesOnDeletion = defaults.ignoreActiveCertificatesOnDeletion;
    	      this.keySpec = defaults.keySpec;
    	      this.labels = defaults.labels;
    	      this.lifetime = defaults.lifetime;
    	      this.location = defaults.location;
    	      this.pool = defaults.pool;
    	      this.project = defaults.project;
    	      this.type = defaults.type;
        }

        public Builder setCertificateAuthorityId(Input<String> certificateAuthorityId) {
            this.certificateAuthorityId = Objects.requireNonNull(certificateAuthorityId);
            return this;
        }

        public Builder setCertificateAuthorityId(String certificateAuthorityId) {
            this.certificateAuthorityId = Input.of(Objects.requireNonNull(certificateAuthorityId));
            return this;
        }

        public Builder setConfig(Input<AuthorityConfigArgs> config) {
            this.config = Objects.requireNonNull(config);
            return this;
        }

        public Builder setConfig(AuthorityConfigArgs config) {
            this.config = Input.of(Objects.requireNonNull(config));
            return this;
        }

        public Builder setGcsBucket(@Nullable Input<String> gcsBucket) {
            this.gcsBucket = gcsBucket;
            return this;
        }

        public Builder setGcsBucket(@Nullable String gcsBucket) {
            this.gcsBucket = Input.ofNullable(gcsBucket);
            return this;
        }

        public Builder setIgnoreActiveCertificatesOnDeletion(@Nullable Input<Boolean> ignoreActiveCertificatesOnDeletion) {
            this.ignoreActiveCertificatesOnDeletion = ignoreActiveCertificatesOnDeletion;
            return this;
        }

        public Builder setIgnoreActiveCertificatesOnDeletion(@Nullable Boolean ignoreActiveCertificatesOnDeletion) {
            this.ignoreActiveCertificatesOnDeletion = Input.ofNullable(ignoreActiveCertificatesOnDeletion);
            return this;
        }

        public Builder setKeySpec(Input<AuthorityKeySpecArgs> keySpec) {
            this.keySpec = Objects.requireNonNull(keySpec);
            return this;
        }

        public Builder setKeySpec(AuthorityKeySpecArgs keySpec) {
            this.keySpec = Input.of(Objects.requireNonNull(keySpec));
            return this;
        }

        public Builder setLabels(@Nullable Input<Map<String,String>> labels) {
            this.labels = labels;
            return this;
        }

        public Builder setLabels(@Nullable Map<String,String> labels) {
            this.labels = Input.ofNullable(labels);
            return this;
        }

        public Builder setLifetime(@Nullable Input<String> lifetime) {
            this.lifetime = lifetime;
            return this;
        }

        public Builder setLifetime(@Nullable String lifetime) {
            this.lifetime = Input.ofNullable(lifetime);
            return this;
        }

        public Builder setLocation(Input<String> location) {
            this.location = Objects.requireNonNull(location);
            return this;
        }

        public Builder setLocation(String location) {
            this.location = Input.of(Objects.requireNonNull(location));
            return this;
        }

        public Builder setPool(Input<String> pool) {
            this.pool = Objects.requireNonNull(pool);
            return this;
        }

        public Builder setPool(String pool) {
            this.pool = Input.of(Objects.requireNonNull(pool));
            return this;
        }

        public Builder setProject(@Nullable Input<String> project) {
            this.project = project;
            return this;
        }

        public Builder setProject(@Nullable String project) {
            this.project = Input.ofNullable(project);
            return this;
        }

        public Builder setType(@Nullable Input<String> type) {
            this.type = type;
            return this;
        }

        public Builder setType(@Nullable String type) {
            this.type = Input.ofNullable(type);
            return this;
        }

        public AuthorityArgs build() {
            return new AuthorityArgs(certificateAuthorityId, config, gcsBucket, ignoreActiveCertificatesOnDeletion, keySpec, labels, lifetime, location, pool, project, type);
        }
    }
}