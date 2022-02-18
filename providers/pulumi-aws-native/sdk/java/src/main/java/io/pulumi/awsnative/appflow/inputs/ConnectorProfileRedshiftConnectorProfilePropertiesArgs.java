// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.appflow.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.internal.annotations.InputImport;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


public final class ConnectorProfileRedshiftConnectorProfilePropertiesArgs extends io.pulumi.resources.ResourceArgs {

    public static final ConnectorProfileRedshiftConnectorProfilePropertiesArgs Empty = new ConnectorProfileRedshiftConnectorProfilePropertiesArgs();

    /**
     * The name of the Amazon S3 bucket associated with Redshift.
     * 
     */
    @InputImport(name="bucketName", required=true)
    private final Input<String> bucketName;

    public Input<String> getBucketName() {
        return this.bucketName;
    }

    /**
     * The object key for the destination bucket in which Amazon AppFlow will place the ﬁles.
     * 
     */
    @InputImport(name="bucketPrefix")
    private final @Nullable Input<String> bucketPrefix;

    public Input<String> getBucketPrefix() {
        return this.bucketPrefix == null ? Input.empty() : this.bucketPrefix;
    }

    /**
     * The JDBC URL of the Amazon Redshift cluster.
     * 
     */
    @InputImport(name="databaseUrl", required=true)
    private final Input<String> databaseUrl;

    public Input<String> getDatabaseUrl() {
        return this.databaseUrl;
    }

    /**
     * The Amazon Resource Name (ARN) of the IAM role.
     * 
     */
    @InputImport(name="roleArn", required=true)
    private final Input<String> roleArn;

    public Input<String> getRoleArn() {
        return this.roleArn;
    }

    public ConnectorProfileRedshiftConnectorProfilePropertiesArgs(
        Input<String> bucketName,
        @Nullable Input<String> bucketPrefix,
        Input<String> databaseUrl,
        Input<String> roleArn) {
        this.bucketName = Objects.requireNonNull(bucketName, "expected parameter 'bucketName' to be non-null");
        this.bucketPrefix = bucketPrefix;
        this.databaseUrl = Objects.requireNonNull(databaseUrl, "expected parameter 'databaseUrl' to be non-null");
        this.roleArn = Objects.requireNonNull(roleArn, "expected parameter 'roleArn' to be non-null");
    }

    private ConnectorProfileRedshiftConnectorProfilePropertiesArgs() {
        this.bucketName = Input.empty();
        this.bucketPrefix = Input.empty();
        this.databaseUrl = Input.empty();
        this.roleArn = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ConnectorProfileRedshiftConnectorProfilePropertiesArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Input<String> bucketName;
        private @Nullable Input<String> bucketPrefix;
        private Input<String> databaseUrl;
        private Input<String> roleArn;

        public Builder() {
    	      // Empty
        }

        public Builder(ConnectorProfileRedshiftConnectorProfilePropertiesArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.bucketName = defaults.bucketName;
    	      this.bucketPrefix = defaults.bucketPrefix;
    	      this.databaseUrl = defaults.databaseUrl;
    	      this.roleArn = defaults.roleArn;
        }

        public Builder setBucketName(Input<String> bucketName) {
            this.bucketName = Objects.requireNonNull(bucketName);
            return this;
        }

        public Builder setBucketName(String bucketName) {
            this.bucketName = Input.of(Objects.requireNonNull(bucketName));
            return this;
        }

        public Builder setBucketPrefix(@Nullable Input<String> bucketPrefix) {
            this.bucketPrefix = bucketPrefix;
            return this;
        }

        public Builder setBucketPrefix(@Nullable String bucketPrefix) {
            this.bucketPrefix = Input.ofNullable(bucketPrefix);
            return this;
        }

        public Builder setDatabaseUrl(Input<String> databaseUrl) {
            this.databaseUrl = Objects.requireNonNull(databaseUrl);
            return this;
        }

        public Builder setDatabaseUrl(String databaseUrl) {
            this.databaseUrl = Input.of(Objects.requireNonNull(databaseUrl));
            return this;
        }

        public Builder setRoleArn(Input<String> roleArn) {
            this.roleArn = Objects.requireNonNull(roleArn);
            return this;
        }

        public Builder setRoleArn(String roleArn) {
            this.roleArn = Input.of(Objects.requireNonNull(roleArn));
            return this;
        }

        public ConnectorProfileRedshiftConnectorProfilePropertiesArgs build() {
            return new ConnectorProfileRedshiftConnectorProfilePropertiesArgs(bucketName, bucketPrefix, databaseUrl, roleArn);
        }
    }
}
