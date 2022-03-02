// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.macie2.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import java.lang.String;
import java.util.List;
import java.util.Objects;

@OutputCustomType
public final class ClassificationJobS3JobDefinitionBucketDefinition {
    /**
     * The unique identifier for the AWS account that owns the buckets.
     * 
     */
    private final String accountId;
    /**
     * An array that lists the names of the buckets.
     * 
     */
    private final List<String> buckets;

    @OutputCustomType.Constructor({"accountId","buckets"})
    private ClassificationJobS3JobDefinitionBucketDefinition(
        String accountId,
        List<String> buckets) {
        this.accountId = Objects.requireNonNull(accountId);
        this.buckets = Objects.requireNonNull(buckets);
    }

    /**
     * The unique identifier for the AWS account that owns the buckets.
     * 
    */
    public String getAccountId() {
        return this.accountId;
    }
    /**
     * An array that lists the names of the buckets.
     * 
    */
    public List<String> getBuckets() {
        return this.buckets;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ClassificationJobS3JobDefinitionBucketDefinition defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String accountId;
        private List<String> buckets;

        public Builder() {
    	      // Empty
        }

        public Builder(ClassificationJobS3JobDefinitionBucketDefinition defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.accountId = defaults.accountId;
    	      this.buckets = defaults.buckets;
        }

        public Builder setAccountId(String accountId) {
            this.accountId = Objects.requireNonNull(accountId);
            return this;
        }

        public Builder setBuckets(List<String> buckets) {
            this.buckets = Objects.requireNonNull(buckets);
            return this;
        }
        public ClassificationJobS3JobDefinitionBucketDefinition build() {
            return new ClassificationJobS3JobDefinitionBucketDefinition(accountId, buckets);
        }
    }
}
