// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.transfer.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class WorkflowS3InputFileLocation {
    /**
     * Specifies the S3 bucket that contains the file being copied.
     * 
     */
    private final @Nullable String bucket;
    /**
     * The name assigned to the file when it was created in S3. You use the object key to retrieve the object.
     * 
     */
    private final @Nullable String key;

    @OutputCustomType.Constructor({"bucket","key"})
    private WorkflowS3InputFileLocation(
        @Nullable String bucket,
        @Nullable String key) {
        this.bucket = bucket;
        this.key = key;
    }

    /**
     * Specifies the S3 bucket that contains the file being copied.
     * 
    */
    public Optional<String> getBucket() {
        return Optional.ofNullable(this.bucket);
    }
    /**
     * The name assigned to the file when it was created in S3. You use the object key to retrieve the object.
     * 
    */
    public Optional<String> getKey() {
        return Optional.ofNullable(this.key);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(WorkflowS3InputFileLocation defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String bucket;
        private @Nullable String key;

        public Builder() {
    	      // Empty
        }

        public Builder(WorkflowS3InputFileLocation defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.bucket = defaults.bucket;
    	      this.key = defaults.key;
        }

        public Builder setBucket(@Nullable String bucket) {
            this.bucket = bucket;
            return this;
        }

        public Builder setKey(@Nullable String key) {
            this.key = key;
            return this;
        }
        public WorkflowS3InputFileLocation build() {
            return new WorkflowS3InputFileLocation(bucket, key);
        }
    }
}
