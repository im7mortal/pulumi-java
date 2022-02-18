// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.kubernetes.certificates.k8s.io_v1.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class CertificateSigningRequestSpec {
    /**
     * expirationSeconds is the requested duration of validity of the issued certificate. The certificate signer may issue a certificate with a different validity duration so a client must check the delta between the notBefore and and notAfter fields in the issued certificate to determine the actual duration.
     * 
     * The v1.22+ in-tree implementations of the well-known Kubernetes signers will honor this field as long as the requested duration is not greater than the maximum duration they will honor per the --cluster-signing-duration CLI flag to the Kubernetes controller manager.
     * 
     * Certificate signers may not honor this field for various reasons:
     * 
     *   1. Old signer that is unaware of the field (such as the in-tree
     *      implementations prior to v1.22)
     *   2. Signer whose configured maximum is shorter than the requested duration
     *   3. Signer whose configured minimum is longer than the requested duration
     * 
     * The minimum valid value for expirationSeconds is 600, i.e. 10 minutes.
     * 
     * As of v1.22, this field is beta and is controlled via the CSRDuration feature gate.
     * 
     */
    private final @Nullable Integer expirationSeconds;
    /**
     * extra contains extra attributes of the user that created the CertificateSigningRequest. Populated by the API server on creation and immutable.
     * 
     */
    private final @Nullable Map<String,List<String>> extra;
    /**
     * groups contains group membership of the user that created the CertificateSigningRequest. Populated by the API server on creation and immutable.
     * 
     */
    private final @Nullable List<String> groups;
    /**
     * request contains an x509 certificate signing request encoded in a "CERTIFICATE REQUEST" PEM block. When serialized as JSON or YAML, the data is additionally base64-encoded.
     * 
     */
    private final String request;
    /**
     * signerName indicates the requested signer, and is a qualified name.
     * 
     * List/watch requests for CertificateSigningRequests can filter on this field using a "spec.signerName=NAME" fieldSelector.
     * 
     * Well-known Kubernetes signers are:
     *  1. "kubernetes.io/kube-apiserver-client": issues client certificates that can be used to authenticate to kube-apiserver.
     *       Requests for this signer are never auto-approved by kube-controller-manager, can be issued by the "csrsigning" controller in kube-controller-manager.
     *  2. "kubernetes.io/kube-apiserver-client-kubelet": issues client certificates that kubelets use to authenticate to kube-apiserver.
     *       Requests for this signer can be auto-approved by the "csrapproving" controller in kube-controller-manager, and can be issued by the "csrsigning" controller in kube-controller-manager.
     *  3. "kubernetes.io/kubelet-serving" issues serving certificates that kubelets use to serve TLS endpoints, which kube-apiserver can connect to securely.
     *       Requests for this signer are never auto-approved by kube-controller-manager, and can be issued by the "csrsigning" controller in kube-controller-manager.
     * 
     * More details are available at https://k8s.io/docs/reference/access-authn-authz/certificate-signing-requests/#kubernetes-signers
     * 
     * Custom signerNames can also be specified. The signer defines:
     *  1. Trust distribution: how trust (CA bundles) are distributed.
     *  2. Permitted subjects: and behavior when a disallowed subject is requested.
     *  3. Required, permitted, or forbidden x509 extensions in the request (including whether subjectAltNames are allowed, which types, restrictions on allowed values) and behavior when a disallowed extension is requested.
     *  4. Required, permitted, or forbidden key usages / extended key usages.
     *  5. Expiration/certificate lifetime: whether it is fixed by the signer, configurable by the admin.
     *  6. Whether or not requests for CA certificates are allowed.
     * 
     */
    private final String signerName;
    /**
     * uid contains the uid of the user that created the CertificateSigningRequest. Populated by the API server on creation and immutable.
     * 
     */
    private final @Nullable String uid;
    /**
     * usages specifies a set of key usages requested in the issued certificate.
     * 
     * Requests for TLS client certificates typically request: "digital signature", "key encipherment", "client auth".
     * 
     * Requests for TLS serving certificates typically request: "key encipherment", "digital signature", "server auth".
     * 
     * Valid values are:
     *  "signing", "digital signature", "content commitment",
     *  "key encipherment", "key agreement", "data encipherment",
     *  "cert sign", "crl sign", "encipher only", "decipher only", "any",
     *  "server auth", "client auth",
     *  "code signing", "email protection", "s/mime",
     *  "ipsec end system", "ipsec tunnel", "ipsec user",
     *  "timestamping", "ocsp signing", "microsoft sgc", "netscape sgc"
     * 
     */
    private final @Nullable List<String> usages;
    /**
     * username contains the name of the user that created the CertificateSigningRequest. Populated by the API server on creation and immutable.
     * 
     */
    private final @Nullable String username;

    @OutputCustomType.Constructor({"expirationSeconds","extra","groups","request","signerName","uid","usages","username"})
    private CertificateSigningRequestSpec(
        @Nullable Integer expirationSeconds,
        @Nullable Map<String,List<String>> extra,
        @Nullable List<String> groups,
        String request,
        String signerName,
        @Nullable String uid,
        @Nullable List<String> usages,
        @Nullable String username) {
        this.expirationSeconds = expirationSeconds;
        this.extra = extra;
        this.groups = groups;
        this.request = Objects.requireNonNull(request);
        this.signerName = Objects.requireNonNull(signerName);
        this.uid = uid;
        this.usages = usages;
        this.username = username;
    }

    /**
     * expirationSeconds is the requested duration of validity of the issued certificate. The certificate signer may issue a certificate with a different validity duration so a client must check the delta between the notBefore and and notAfter fields in the issued certificate to determine the actual duration.
     * 
     * The v1.22+ in-tree implementations of the well-known Kubernetes signers will honor this field as long as the requested duration is not greater than the maximum duration they will honor per the --cluster-signing-duration CLI flag to the Kubernetes controller manager.
     * 
     * Certificate signers may not honor this field for various reasons:
     * 
     *   1. Old signer that is unaware of the field (such as the in-tree
     *      implementations prior to v1.22)
     *   2. Signer whose configured maximum is shorter than the requested duration
     *   3. Signer whose configured minimum is longer than the requested duration
     * 
     * The minimum valid value for expirationSeconds is 600, i.e. 10 minutes.
     * 
     * As of v1.22, this field is beta and is controlled via the CSRDuration feature gate.
     * 
     */
    public Optional<Integer> getExpirationSeconds() {
        return Optional.ofNullable(this.expirationSeconds);
    }
    /**
     * extra contains extra attributes of the user that created the CertificateSigningRequest. Populated by the API server on creation and immutable.
     * 
     */
    public Map<String,List<String>> getExtra() {
        return this.extra == null ? Map.of() : this.extra;
    }
    /**
     * groups contains group membership of the user that created the CertificateSigningRequest. Populated by the API server on creation and immutable.
     * 
     */
    public List<String> getGroups() {
        return this.groups == null ? List.of() : this.groups;
    }
    /**
     * request contains an x509 certificate signing request encoded in a "CERTIFICATE REQUEST" PEM block. When serialized as JSON or YAML, the data is additionally base64-encoded.
     * 
     */
    public String getRequest() {
        return this.request;
    }
    /**
     * signerName indicates the requested signer, and is a qualified name.
     * 
     * List/watch requests for CertificateSigningRequests can filter on this field using a "spec.signerName=NAME" fieldSelector.
     * 
     * Well-known Kubernetes signers are:
     *  1. "kubernetes.io/kube-apiserver-client": issues client certificates that can be used to authenticate to kube-apiserver.
     *       Requests for this signer are never auto-approved by kube-controller-manager, can be issued by the "csrsigning" controller in kube-controller-manager.
     *  2. "kubernetes.io/kube-apiserver-client-kubelet": issues client certificates that kubelets use to authenticate to kube-apiserver.
     *       Requests for this signer can be auto-approved by the "csrapproving" controller in kube-controller-manager, and can be issued by the "csrsigning" controller in kube-controller-manager.
     *  3. "kubernetes.io/kubelet-serving" issues serving certificates that kubelets use to serve TLS endpoints, which kube-apiserver can connect to securely.
     *       Requests for this signer are never auto-approved by kube-controller-manager, and can be issued by the "csrsigning" controller in kube-controller-manager.
     * 
     * More details are available at https://k8s.io/docs/reference/access-authn-authz/certificate-signing-requests/#kubernetes-signers
     * 
     * Custom signerNames can also be specified. The signer defines:
     *  1. Trust distribution: how trust (CA bundles) are distributed.
     *  2. Permitted subjects: and behavior when a disallowed subject is requested.
     *  3. Required, permitted, or forbidden x509 extensions in the request (including whether subjectAltNames are allowed, which types, restrictions on allowed values) and behavior when a disallowed extension is requested.
     *  4. Required, permitted, or forbidden key usages / extended key usages.
     *  5. Expiration/certificate lifetime: whether it is fixed by the signer, configurable by the admin.
     *  6. Whether or not requests for CA certificates are allowed.
     * 
     */
    public String getSignerName() {
        return this.signerName;
    }
    /**
     * uid contains the uid of the user that created the CertificateSigningRequest. Populated by the API server on creation and immutable.
     * 
     */
    public Optional<String> getUid() {
        return Optional.ofNullable(this.uid);
    }
    /**
     * usages specifies a set of key usages requested in the issued certificate.
     * 
     * Requests for TLS client certificates typically request: "digital signature", "key encipherment", "client auth".
     * 
     * Requests for TLS serving certificates typically request: "key encipherment", "digital signature", "server auth".
     * 
     * Valid values are:
     *  "signing", "digital signature", "content commitment",
     *  "key encipherment", "key agreement", "data encipherment",
     *  "cert sign", "crl sign", "encipher only", "decipher only", "any",
     *  "server auth", "client auth",
     *  "code signing", "email protection", "s/mime",
     *  "ipsec end system", "ipsec tunnel", "ipsec user",
     *  "timestamping", "ocsp signing", "microsoft sgc", "netscape sgc"
     * 
     */
    public List<String> getUsages() {
        return this.usages == null ? List.of() : this.usages;
    }
    /**
     * username contains the name of the user that created the CertificateSigningRequest. Populated by the API server on creation and immutable.
     * 
     */
    public Optional<String> getUsername() {
        return Optional.ofNullable(this.username);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(CertificateSigningRequestSpec defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Integer expirationSeconds;
        private @Nullable Map<String,List<String>> extra;
        private @Nullable List<String> groups;
        private String request;
        private String signerName;
        private @Nullable String uid;
        private @Nullable List<String> usages;
        private @Nullable String username;

        public Builder() {
    	      // Empty
        }

        public Builder(CertificateSigningRequestSpec defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.expirationSeconds = defaults.expirationSeconds;
    	      this.extra = defaults.extra;
    	      this.groups = defaults.groups;
    	      this.request = defaults.request;
    	      this.signerName = defaults.signerName;
    	      this.uid = defaults.uid;
    	      this.usages = defaults.usages;
    	      this.username = defaults.username;
        }

        public Builder setExpirationSeconds(@Nullable Integer expirationSeconds) {
            this.expirationSeconds = expirationSeconds;
            return this;
        }

        public Builder setExtra(@Nullable Map<String,List<String>> extra) {
            this.extra = extra;
            return this;
        }

        public Builder setGroups(@Nullable List<String> groups) {
            this.groups = groups;
            return this;
        }

        public Builder setRequest(String request) {
            this.request = Objects.requireNonNull(request);
            return this;
        }

        public Builder setSignerName(String signerName) {
            this.signerName = Objects.requireNonNull(signerName);
            return this;
        }

        public Builder setUid(@Nullable String uid) {
            this.uid = uid;
            return this;
        }

        public Builder setUsages(@Nullable List<String> usages) {
            this.usages = usages;
            return this;
        }

        public Builder setUsername(@Nullable String username) {
            this.username = username;
            return this;
        }

        public CertificateSigningRequestSpec build() {
            return new CertificateSigningRequestSpec(expirationSeconds, extra, groups, request, signerName, uid, usages, username);
        }
    }
}
