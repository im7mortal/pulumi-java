// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.storagetransfer_v1.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import io.pulumi.googlenative.storagetransfer_v1.outputs.AwsAccessKeyResponse;
import java.lang.String;
import java.util.Objects;

@OutputCustomType
public final class AwsS3DataResponse {
    /**
     * Input only. AWS access key used to sign the API requests to the AWS S3 bucket. Permissions on the bucket must be granted to the access ID of the AWS access key. For information on our data retention policy for user credentials, see [User credentials](/storage-transfer/docs/data-retention#user-credentials).
     * 
     */
    private final AwsAccessKeyResponse awsAccessKey;
    /**
     * S3 Bucket name (see [Creating a bucket](https://docs.aws.amazon.com/AmazonS3/latest/dev/create-bucket-get-location-example.html)).
     * 
     */
    private final String bucketName;
    /**
     * Root path to transfer objects. Must be an empty string or full path name that ends with a '/'. This field is treated as an object prefix. As such, it should generally not begin with a '/'.
     * 
     */
    private final String path;
    /**
     * The Amazon Resource Name (ARN) of the role to support temporary credentials via `AssumeRoleWithWebIdentity`. For more information about ARNs, see [IAM ARNs](https://docs.aws.amazon.com/IAM/latest/UserGuide/reference_identifiers.html#identifiers-arns). When a role ARN is provided, Transfer Service fetches temporary credentials for the session using a `AssumeRoleWithWebIdentity` call for the provided role using the GoogleServiceAccount for this project.
     * 
     */
    private final String roleArn;

    @OutputCustomType.Constructor({"awsAccessKey","bucketName","path","roleArn"})
    private AwsS3DataResponse(
        AwsAccessKeyResponse awsAccessKey,
        String bucketName,
        String path,
        String roleArn) {
        this.awsAccessKey = Objects.requireNonNull(awsAccessKey);
        this.bucketName = Objects.requireNonNull(bucketName);
        this.path = Objects.requireNonNull(path);
        this.roleArn = Objects.requireNonNull(roleArn);
    }

    /**
     * Input only. AWS access key used to sign the API requests to the AWS S3 bucket. Permissions on the bucket must be granted to the access ID of the AWS access key. For information on our data retention policy for user credentials, see [User credentials](/storage-transfer/docs/data-retention#user-credentials).
     * 
    */
    public AwsAccessKeyResponse getAwsAccessKey() {
        return this.awsAccessKey;
    }
    /**
     * S3 Bucket name (see [Creating a bucket](https://docs.aws.amazon.com/AmazonS3/latest/dev/create-bucket-get-location-example.html)).
     * 
    */
    public String getBucketName() {
        return this.bucketName;
    }
    /**
     * Root path to transfer objects. Must be an empty string or full path name that ends with a '/'. This field is treated as an object prefix. As such, it should generally not begin with a '/'.
     * 
    */
    public String getPath() {
        return this.path;
    }
    /**
     * The Amazon Resource Name (ARN) of the role to support temporary credentials via `AssumeRoleWithWebIdentity`. For more information about ARNs, see [IAM ARNs](https://docs.aws.amazon.com/IAM/latest/UserGuide/reference_identifiers.html#identifiers-arns). When a role ARN is provided, Transfer Service fetches temporary credentials for the session using a `AssumeRoleWithWebIdentity` call for the provided role using the GoogleServiceAccount for this project.
     * 
    */
    public String getRoleArn() {
        return this.roleArn;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(AwsS3DataResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private AwsAccessKeyResponse awsAccessKey;
        private String bucketName;
        private String path;
        private String roleArn;

        public Builder() {
    	      // Empty
        }

        public Builder(AwsS3DataResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.awsAccessKey = defaults.awsAccessKey;
    	      this.bucketName = defaults.bucketName;
    	      this.path = defaults.path;
    	      this.roleArn = defaults.roleArn;
        }

        public Builder setAwsAccessKey(AwsAccessKeyResponse awsAccessKey) {
            this.awsAccessKey = Objects.requireNonNull(awsAccessKey);
            return this;
        }

        public Builder setBucketName(String bucketName) {
            this.bucketName = Objects.requireNonNull(bucketName);
            return this;
        }

        public Builder setPath(String path) {
            this.path = Objects.requireNonNull(path);
            return this;
        }

        public Builder setRoleArn(String roleArn) {
            this.roleArn = Objects.requireNonNull(roleArn);
            return this;
        }
        public AwsS3DataResponse build() {
            return new AwsS3DataResponse(awsAccessKey, bucketName, path, roleArn);
        }
    }
}
