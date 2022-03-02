// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.compute_beta.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import io.pulumi.googlenative.compute_beta.outputs.SslPolicyWarningsItemResponse;
import java.lang.String;
import java.util.List;
import java.util.Objects;

@OutputCustomType
public final class GetSslPolicyResult {
    /**
     * Creation timestamp in RFC3339 text format.
     * 
     */
    private final String creationTimestamp;
    /**
     * A list of features enabled when the selected profile is CUSTOM. The method returns the set of features that can be specified in this list. This field must be empty if the profile is not CUSTOM.
     * 
     */
    private final List<String> customFeatures;
    /**
     * An optional description of this resource. Provide this property when you create the resource.
     * 
     */
    private final String description;
    /**
     * The list of features enabled in the SSL policy.
     * 
     */
    private final List<String> enabledFeatures;
    /**
     * Fingerprint of this resource. A hash of the contents stored in this object. This field is used in optimistic locking. This field will be ignored when inserting a SslPolicy. An up-to-date fingerprint must be provided in order to update the SslPolicy, otherwise the request will fail with error 412 conditionNotMet. To see the latest fingerprint, make a get() request to retrieve an SslPolicy.
     * 
     */
    private final String fingerprint;
    /**
     * [Output only] Type of the resource. Always compute#sslPolicyfor SSL policies.
     * 
     */
    private final String kind;
    /**
     * The minimum version of SSL protocol that can be used by the clients to establish a connection with the load balancer. This can be one of TLS_1_0, TLS_1_1, TLS_1_2.
     * 
     */
    private final String minTlsVersion;
    /**
     * Name of the resource. The name must be 1-63 characters long, and comply with RFC1035. Specifically, the name must be 1-63 characters long and match the regular expression `[a-z]([-a-z0-9]*[a-z0-9])?` which means the first character must be a lowercase letter, and all following characters must be a dash, lowercase letter, or digit, except the last character, which cannot be a dash.
     * 
     */
    private final String name;
    /**
     * Profile specifies the set of SSL features that can be used by the load balancer when negotiating SSL with clients. This can be one of COMPATIBLE, MODERN, RESTRICTED, or CUSTOM. If using CUSTOM, the set of SSL features to enable must be specified in the customFeatures field.
     * 
     */
    private final String profile;
    /**
     * Server-defined URL for the resource.
     * 
     */
    private final String selfLink;
    /**
     * If potential misconfigurations are detected for this SSL policy, this field will be populated with warning messages.
     * 
     */
    private final List<SslPolicyWarningsItemResponse> warnings;

    @OutputCustomType.Constructor({"creationTimestamp","customFeatures","description","enabledFeatures","fingerprint","kind","minTlsVersion","name","profile","selfLink","warnings"})
    private GetSslPolicyResult(
        String creationTimestamp,
        List<String> customFeatures,
        String description,
        List<String> enabledFeatures,
        String fingerprint,
        String kind,
        String minTlsVersion,
        String name,
        String profile,
        String selfLink,
        List<SslPolicyWarningsItemResponse> warnings) {
        this.creationTimestamp = Objects.requireNonNull(creationTimestamp);
        this.customFeatures = Objects.requireNonNull(customFeatures);
        this.description = Objects.requireNonNull(description);
        this.enabledFeatures = Objects.requireNonNull(enabledFeatures);
        this.fingerprint = Objects.requireNonNull(fingerprint);
        this.kind = Objects.requireNonNull(kind);
        this.minTlsVersion = Objects.requireNonNull(minTlsVersion);
        this.name = Objects.requireNonNull(name);
        this.profile = Objects.requireNonNull(profile);
        this.selfLink = Objects.requireNonNull(selfLink);
        this.warnings = Objects.requireNonNull(warnings);
    }

    /**
     * Creation timestamp in RFC3339 text format.
     * 
    */
    public String getCreationTimestamp() {
        return this.creationTimestamp;
    }
    /**
     * A list of features enabled when the selected profile is CUSTOM. The method returns the set of features that can be specified in this list. This field must be empty if the profile is not CUSTOM.
     * 
    */
    public List<String> getCustomFeatures() {
        return this.customFeatures;
    }
    /**
     * An optional description of this resource. Provide this property when you create the resource.
     * 
    */
    public String getDescription() {
        return this.description;
    }
    /**
     * The list of features enabled in the SSL policy.
     * 
    */
    public List<String> getEnabledFeatures() {
        return this.enabledFeatures;
    }
    /**
     * Fingerprint of this resource. A hash of the contents stored in this object. This field is used in optimistic locking. This field will be ignored when inserting a SslPolicy. An up-to-date fingerprint must be provided in order to update the SslPolicy, otherwise the request will fail with error 412 conditionNotMet. To see the latest fingerprint, make a get() request to retrieve an SslPolicy.
     * 
    */
    public String getFingerprint() {
        return this.fingerprint;
    }
    /**
     * [Output only] Type of the resource. Always compute#sslPolicyfor SSL policies.
     * 
    */
    public String getKind() {
        return this.kind;
    }
    /**
     * The minimum version of SSL protocol that can be used by the clients to establish a connection with the load balancer. This can be one of TLS_1_0, TLS_1_1, TLS_1_2.
     * 
    */
    public String getMinTlsVersion() {
        return this.minTlsVersion;
    }
    /**
     * Name of the resource. The name must be 1-63 characters long, and comply with RFC1035. Specifically, the name must be 1-63 characters long and match the regular expression `[a-z]([-a-z0-9]*[a-z0-9])?` which means the first character must be a lowercase letter, and all following characters must be a dash, lowercase letter, or digit, except the last character, which cannot be a dash.
     * 
    */
    public String getName() {
        return this.name;
    }
    /**
     * Profile specifies the set of SSL features that can be used by the load balancer when negotiating SSL with clients. This can be one of COMPATIBLE, MODERN, RESTRICTED, or CUSTOM. If using CUSTOM, the set of SSL features to enable must be specified in the customFeatures field.
     * 
    */
    public String getProfile() {
        return this.profile;
    }
    /**
     * Server-defined URL for the resource.
     * 
    */
    public String getSelfLink() {
        return this.selfLink;
    }
    /**
     * If potential misconfigurations are detected for this SSL policy, this field will be populated with warning messages.
     * 
    */
    public List<SslPolicyWarningsItemResponse> getWarnings() {
        return this.warnings;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetSslPolicyResult defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String creationTimestamp;
        private List<String> customFeatures;
        private String description;
        private List<String> enabledFeatures;
        private String fingerprint;
        private String kind;
        private String minTlsVersion;
        private String name;
        private String profile;
        private String selfLink;
        private List<SslPolicyWarningsItemResponse> warnings;

        public Builder() {
    	      // Empty
        }

        public Builder(GetSslPolicyResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.creationTimestamp = defaults.creationTimestamp;
    	      this.customFeatures = defaults.customFeatures;
    	      this.description = defaults.description;
    	      this.enabledFeatures = defaults.enabledFeatures;
    	      this.fingerprint = defaults.fingerprint;
    	      this.kind = defaults.kind;
    	      this.minTlsVersion = defaults.minTlsVersion;
    	      this.name = defaults.name;
    	      this.profile = defaults.profile;
    	      this.selfLink = defaults.selfLink;
    	      this.warnings = defaults.warnings;
        }

        public Builder setCreationTimestamp(String creationTimestamp) {
            this.creationTimestamp = Objects.requireNonNull(creationTimestamp);
            return this;
        }

        public Builder setCustomFeatures(List<String> customFeatures) {
            this.customFeatures = Objects.requireNonNull(customFeatures);
            return this;
        }

        public Builder setDescription(String description) {
            this.description = Objects.requireNonNull(description);
            return this;
        }

        public Builder setEnabledFeatures(List<String> enabledFeatures) {
            this.enabledFeatures = Objects.requireNonNull(enabledFeatures);
            return this;
        }

        public Builder setFingerprint(String fingerprint) {
            this.fingerprint = Objects.requireNonNull(fingerprint);
            return this;
        }

        public Builder setKind(String kind) {
            this.kind = Objects.requireNonNull(kind);
            return this;
        }

        public Builder setMinTlsVersion(String minTlsVersion) {
            this.minTlsVersion = Objects.requireNonNull(minTlsVersion);
            return this;
        }

        public Builder setName(String name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }

        public Builder setProfile(String profile) {
            this.profile = Objects.requireNonNull(profile);
            return this;
        }

        public Builder setSelfLink(String selfLink) {
            this.selfLink = Objects.requireNonNull(selfLink);
            return this;
        }

        public Builder setWarnings(List<SslPolicyWarningsItemResponse> warnings) {
            this.warnings = Objects.requireNonNull(warnings);
            return this;
        }
        public GetSslPolicyResult build() {
            return new GetSslPolicyResult(creationTimestamp, customFeatures, description, enabledFeatures, fingerprint, kind, minTlsVersion, name, profile, selfLink, warnings);
        }
    }
}
