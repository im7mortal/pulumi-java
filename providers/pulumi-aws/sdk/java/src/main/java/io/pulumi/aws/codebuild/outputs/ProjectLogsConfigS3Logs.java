// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.codebuild.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import java.lang.Boolean;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class ProjectLogsConfigS3Logs {
    /**
     * Specifies the bucket owner's access for objects that another account uploads to their Amazon S3 bucket. By default, only the account that uploads the objects to the bucket has access to these objects. This property allows you to give the bucket owner access to these objects. Valid values are `NONE`, `READ_ONLY`, and `FULL`. your CodeBuild service role must have the `s3:PutBucketAcl` permission. This permission allows CodeBuild to modify the access control list for the bucket.
     * 
     */
    private final @Nullable String bucketOwnerAccess;
    /**
     * Whether to disable encrypting output artifacts. If `type` is set to `NO_ARTIFACTS`, this value is ignored. Defaults to `false`.
     * 
     */
    private final @Nullable Boolean encryptionDisabled;
    /**
     * Location of the source code from git or s3.
     * 
     */
    private final @Nullable String location;
    /**
     * Current status of logs in S3 for a build project. Valid values: `ENABLED`, `DISABLED`. Defaults to `DISABLED`.
     * 
     */
    private final @Nullable String status;

    @OutputCustomType.Constructor({"bucketOwnerAccess","encryptionDisabled","location","status"})
    private ProjectLogsConfigS3Logs(
        @Nullable String bucketOwnerAccess,
        @Nullable Boolean encryptionDisabled,
        @Nullable String location,
        @Nullable String status) {
        this.bucketOwnerAccess = bucketOwnerAccess;
        this.encryptionDisabled = encryptionDisabled;
        this.location = location;
        this.status = status;
    }

    /**
     * Specifies the bucket owner's access for objects that another account uploads to their Amazon S3 bucket. By default, only the account that uploads the objects to the bucket has access to these objects. This property allows you to give the bucket owner access to these objects. Valid values are `NONE`, `READ_ONLY`, and `FULL`. your CodeBuild service role must have the `s3:PutBucketAcl` permission. This permission allows CodeBuild to modify the access control list for the bucket.
     * 
    */
    public Optional<String> getBucketOwnerAccess() {
        return Optional.ofNullable(this.bucketOwnerAccess);
    }
    /**
     * Whether to disable encrypting output artifacts. If `type` is set to `NO_ARTIFACTS`, this value is ignored. Defaults to `false`.
     * 
    */
    public Optional<Boolean> getEncryptionDisabled() {
        return Optional.ofNullable(this.encryptionDisabled);
    }
    /**
     * Location of the source code from git or s3.
     * 
    */
    public Optional<String> getLocation() {
        return Optional.ofNullable(this.location);
    }
    /**
     * Current status of logs in S3 for a build project. Valid values: `ENABLED`, `DISABLED`. Defaults to `DISABLED`.
     * 
    */
    public Optional<String> getStatus() {
        return Optional.ofNullable(this.status);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ProjectLogsConfigS3Logs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String bucketOwnerAccess;
        private @Nullable Boolean encryptionDisabled;
        private @Nullable String location;
        private @Nullable String status;

        public Builder() {
    	      // Empty
        }

        public Builder(ProjectLogsConfigS3Logs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.bucketOwnerAccess = defaults.bucketOwnerAccess;
    	      this.encryptionDisabled = defaults.encryptionDisabled;
    	      this.location = defaults.location;
    	      this.status = defaults.status;
        }

        public Builder setBucketOwnerAccess(@Nullable String bucketOwnerAccess) {
            this.bucketOwnerAccess = bucketOwnerAccess;
            return this;
        }

        public Builder setEncryptionDisabled(@Nullable Boolean encryptionDisabled) {
            this.encryptionDisabled = encryptionDisabled;
            return this;
        }

        public Builder setLocation(@Nullable String location) {
            this.location = location;
            return this;
        }

        public Builder setStatus(@Nullable String status) {
            this.status = status;
            return this;
        }
        public ProjectLogsConfigS3Logs build() {
            return new ProjectLogsConfigS3Logs(bucketOwnerAccess, encryptionDisabled, location, status);
        }
    }
}
