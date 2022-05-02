// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.artifactregistry_v1beta1.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Map;
import java.util.Objects;

@CustomType
public final class GetRepositoryResult {
    /**
     * @return The time when the repository was created.
     * 
     */
    private final String createTime;
    /**
     * @return The user-provided description of the repository.
     * 
     */
    private final String description;
    /**
     * @return The format of packages that are stored in the repository.
     * 
     */
    private final String format;
    /**
     * @return The Cloud KMS resource name of the customer managed encryption key that&#39;s used to encrypt the contents of the Repository. Has the form: `projects/my-project/locations/my-region/keyRings/my-kr/cryptoKeys/my-key`. This value may not be changed after the Repository has been created.
     * 
     */
    private final String kmsKeyName;
    /**
     * @return Labels with user-defined metadata. This field may contain up to 64 entries. Label keys and values may be no longer than 63 characters. Label keys must begin with a lowercase letter and may only contain lowercase letters, numeric characters, underscores, and dashes.
     * 
     */
    private final Map<String,String> labels;
    /**
     * @return The name of the repository, for example: &#34;projects/p1/locations/us-central1/repositories/repo1&#34;.
     * 
     */
    private final String name;
    /**
     * @return The size, in bytes, of all artifact storage in this repository. Repositories that are generally available or in public preview use this to calculate storage costs.
     * 
     */
    private final String sizeBytes;
    /**
     * @return The time when the repository was last updated.
     * 
     */
    private final String updateTime;

    @CustomType.Constructor
    private GetRepositoryResult(
        @CustomType.Parameter("createTime") String createTime,
        @CustomType.Parameter("description") String description,
        @CustomType.Parameter("format") String format,
        @CustomType.Parameter("kmsKeyName") String kmsKeyName,
        @CustomType.Parameter("labels") Map<String,String> labels,
        @CustomType.Parameter("name") String name,
        @CustomType.Parameter("sizeBytes") String sizeBytes,
        @CustomType.Parameter("updateTime") String updateTime) {
        this.createTime = createTime;
        this.description = description;
        this.format = format;
        this.kmsKeyName = kmsKeyName;
        this.labels = labels;
        this.name = name;
        this.sizeBytes = sizeBytes;
        this.updateTime = updateTime;
    }

    /**
     * @return The time when the repository was created.
     * 
     */
    public String createTime() {
        return this.createTime;
    }
    /**
     * @return The user-provided description of the repository.
     * 
     */
    public String description() {
        return this.description;
    }
    /**
     * @return The format of packages that are stored in the repository.
     * 
     */
    public String format() {
        return this.format;
    }
    /**
     * @return The Cloud KMS resource name of the customer managed encryption key that&#39;s used to encrypt the contents of the Repository. Has the form: `projects/my-project/locations/my-region/keyRings/my-kr/cryptoKeys/my-key`. This value may not be changed after the Repository has been created.
     * 
     */
    public String kmsKeyName() {
        return this.kmsKeyName;
    }
    /**
     * @return Labels with user-defined metadata. This field may contain up to 64 entries. Label keys and values may be no longer than 63 characters. Label keys must begin with a lowercase letter and may only contain lowercase letters, numeric characters, underscores, and dashes.
     * 
     */
    public Map<String,String> labels() {
        return this.labels;
    }
    /**
     * @return The name of the repository, for example: &#34;projects/p1/locations/us-central1/repositories/repo1&#34;.
     * 
     */
    public String name() {
        return this.name;
    }
    /**
     * @return The size, in bytes, of all artifact storage in this repository. Repositories that are generally available or in public preview use this to calculate storage costs.
     * 
     */
    public String sizeBytes() {
        return this.sizeBytes;
    }
    /**
     * @return The time when the repository was last updated.
     * 
     */
    public String updateTime() {
        return this.updateTime;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetRepositoryResult defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String createTime;
        private String description;
        private String format;
        private String kmsKeyName;
        private Map<String,String> labels;
        private String name;
        private String sizeBytes;
        private String updateTime;

        public Builder() {
    	      // Empty
        }

        public Builder(GetRepositoryResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.createTime = defaults.createTime;
    	      this.description = defaults.description;
    	      this.format = defaults.format;
    	      this.kmsKeyName = defaults.kmsKeyName;
    	      this.labels = defaults.labels;
    	      this.name = defaults.name;
    	      this.sizeBytes = defaults.sizeBytes;
    	      this.updateTime = defaults.updateTime;
        }

        public Builder createTime(String createTime) {
            this.createTime = Objects.requireNonNull(createTime);
            return this;
        }
        public Builder description(String description) {
            this.description = Objects.requireNonNull(description);
            return this;
        }
        public Builder format(String format) {
            this.format = Objects.requireNonNull(format);
            return this;
        }
        public Builder kmsKeyName(String kmsKeyName) {
            this.kmsKeyName = Objects.requireNonNull(kmsKeyName);
            return this;
        }
        public Builder labels(Map<String,String> labels) {
            this.labels = Objects.requireNonNull(labels);
            return this;
        }
        public Builder name(String name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }
        public Builder sizeBytes(String sizeBytes) {
            this.sizeBytes = Objects.requireNonNull(sizeBytes);
            return this;
        }
        public Builder updateTime(String updateTime) {
            this.updateTime = Objects.requireNonNull(updateTime);
            return this;
        }        public GetRepositoryResult build() {
            return new GetRepositoryResult(createTime, description, format, kmsKeyName, labels, name, sizeBytes, updateTime);
        }
    }
}
