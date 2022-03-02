// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.storage.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class TransferJobTransferSpecGcsDataSink {
    /**
     * S3 Bucket name.
     * 
     */
    private final String bucketName;
    /**
     * Root path to transfer objects. Must be an empty string or full path name that ends with a '/'. This field is treated as an object prefix. As such, it should generally not begin with a '/'.
     * 
     */
    private final @Nullable String path;

    @OutputCustomType.Constructor({"bucketName","path"})
    private TransferJobTransferSpecGcsDataSink(
        String bucketName,
        @Nullable String path) {
        this.bucketName = Objects.requireNonNull(bucketName);
        this.path = path;
    }

    /**
     * S3 Bucket name.
     * 
    */
    public String getBucketName() {
        return this.bucketName;
    }
    /**
     * Root path to transfer objects. Must be an empty string or full path name that ends with a '/'. This field is treated as an object prefix. As such, it should generally not begin with a '/'.
     * 
    */
    public Optional<String> getPath() {
        return Optional.ofNullable(this.path);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(TransferJobTransferSpecGcsDataSink defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String bucketName;
        private @Nullable String path;

        public Builder() {
    	      // Empty
        }

        public Builder(TransferJobTransferSpecGcsDataSink defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.bucketName = defaults.bucketName;
    	      this.path = defaults.path;
        }

        public Builder setBucketName(String bucketName) {
            this.bucketName = Objects.requireNonNull(bucketName);
            return this;
        }

        public Builder setPath(@Nullable String path) {
            this.path = path;
            return this;
        }
        public TransferJobTransferSpecGcsDataSink build() {
            return new TransferJobTransferSpecGcsDataSink(bucketName, path);
        }
    }
}
