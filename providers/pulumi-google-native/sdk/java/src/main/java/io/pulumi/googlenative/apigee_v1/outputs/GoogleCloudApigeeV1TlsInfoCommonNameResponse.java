// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.apigee_v1.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import java.lang.Boolean;
import java.lang.String;
import java.util.Objects;

@OutputCustomType
public final class GoogleCloudApigeeV1TlsInfoCommonNameResponse {
    /**
     * The TLS Common Name string of the certificate.
     * 
     */
    private final String value;
    /**
     * Indicates whether the cert should be matched against as a wildcard cert.
     * 
     */
    private final Boolean wildcardMatch;

    @OutputCustomType.Constructor({"value","wildcardMatch"})
    private GoogleCloudApigeeV1TlsInfoCommonNameResponse(
        String value,
        Boolean wildcardMatch) {
        this.value = Objects.requireNonNull(value);
        this.wildcardMatch = Objects.requireNonNull(wildcardMatch);
    }

    /**
     * The TLS Common Name string of the certificate.
     * 
    */
    public String getValue() {
        return this.value;
    }
    /**
     * Indicates whether the cert should be matched against as a wildcard cert.
     * 
    */
    public Boolean getWildcardMatch() {
        return this.wildcardMatch;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GoogleCloudApigeeV1TlsInfoCommonNameResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String value;
        private Boolean wildcardMatch;

        public Builder() {
    	      // Empty
        }

        public Builder(GoogleCloudApigeeV1TlsInfoCommonNameResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.value = defaults.value;
    	      this.wildcardMatch = defaults.wildcardMatch;
        }

        public Builder setValue(String value) {
            this.value = Objects.requireNonNull(value);
            return this;
        }

        public Builder setWildcardMatch(Boolean wildcardMatch) {
            this.wildcardMatch = Objects.requireNonNull(wildcardMatch);
            return this;
        }
        public GoogleCloudApigeeV1TlsInfoCommonNameResponse build() {
            return new GoogleCloudApigeeV1TlsInfoCommonNameResponse(value, wildcardMatch);
        }
    }
}
