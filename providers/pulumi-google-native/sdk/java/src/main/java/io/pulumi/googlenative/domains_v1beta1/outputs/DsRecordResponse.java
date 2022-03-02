// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.domains_v1beta1.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;

@OutputCustomType
public final class DsRecordResponse {
    /**
     * The algorithm used to generate the referenced DNSKEY.
     * 
     */
    private final String algorithm;
    /**
     * The digest generated from the referenced DNSKEY.
     * 
     */
    private final String digest;
    /**
     * The hash function used to generate the digest of the referenced DNSKEY.
     * 
     */
    private final String digestType;
    /**
     * The key tag of the record. Must be set in range 0 -- 65535.
     * 
     */
    private final Integer keyTag;

    @OutputCustomType.Constructor({"algorithm","digest","digestType","keyTag"})
    private DsRecordResponse(
        String algorithm,
        String digest,
        String digestType,
        Integer keyTag) {
        this.algorithm = Objects.requireNonNull(algorithm);
        this.digest = Objects.requireNonNull(digest);
        this.digestType = Objects.requireNonNull(digestType);
        this.keyTag = Objects.requireNonNull(keyTag);
    }

    /**
     * The algorithm used to generate the referenced DNSKEY.
     * 
    */
    public String getAlgorithm() {
        return this.algorithm;
    }
    /**
     * The digest generated from the referenced DNSKEY.
     * 
    */
    public String getDigest() {
        return this.digest;
    }
    /**
     * The hash function used to generate the digest of the referenced DNSKEY.
     * 
    */
    public String getDigestType() {
        return this.digestType;
    }
    /**
     * The key tag of the record. Must be set in range 0 -- 65535.
     * 
    */
    public Integer getKeyTag() {
        return this.keyTag;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(DsRecordResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String algorithm;
        private String digest;
        private String digestType;
        private Integer keyTag;

        public Builder() {
    	      // Empty
        }

        public Builder(DsRecordResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.algorithm = defaults.algorithm;
    	      this.digest = defaults.digest;
    	      this.digestType = defaults.digestType;
    	      this.keyTag = defaults.keyTag;
        }

        public Builder setAlgorithm(String algorithm) {
            this.algorithm = Objects.requireNonNull(algorithm);
            return this;
        }

        public Builder setDigest(String digest) {
            this.digest = Objects.requireNonNull(digest);
            return this;
        }

        public Builder setDigestType(String digestType) {
            this.digestType = Objects.requireNonNull(digestType);
            return this;
        }

        public Builder setKeyTag(Integer keyTag) {
            this.keyTag = Objects.requireNonNull(keyTag);
            return this;
        }
        public DsRecordResponse build() {
            return new DsRecordResponse(algorithm, digest, digestType, keyTag);
        }
    }
}
