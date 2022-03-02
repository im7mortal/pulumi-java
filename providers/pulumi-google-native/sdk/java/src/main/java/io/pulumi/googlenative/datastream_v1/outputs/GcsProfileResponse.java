// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.datastream_v1.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import java.lang.String;
import java.util.Objects;

@OutputCustomType
public final class GcsProfileResponse {
    /**
     * The Cloud Storage bucket name.
     * 
     */
    private final String bucket;
    /**
     * The root path inside the Cloud Storage bucket.
     * 
     */
    private final String rootPath;

    @OutputCustomType.Constructor({"bucket","rootPath"})
    private GcsProfileResponse(
        String bucket,
        String rootPath) {
        this.bucket = Objects.requireNonNull(bucket);
        this.rootPath = Objects.requireNonNull(rootPath);
    }

    /**
     * The Cloud Storage bucket name.
     * 
    */
    public String getBucket() {
        return this.bucket;
    }
    /**
     * The root path inside the Cloud Storage bucket.
     * 
    */
    public String getRootPath() {
        return this.rootPath;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GcsProfileResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String bucket;
        private String rootPath;

        public Builder() {
    	      // Empty
        }

        public Builder(GcsProfileResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.bucket = defaults.bucket;
    	      this.rootPath = defaults.rootPath;
        }

        public Builder setBucket(String bucket) {
            this.bucket = Objects.requireNonNull(bucket);
            return this;
        }

        public Builder setRootPath(String rootPath) {
            this.rootPath = Objects.requireNonNull(rootPath);
            return this;
        }
        public GcsProfileResponse build() {
            return new GcsProfileResponse(bucket, rootPath);
        }
    }
}
