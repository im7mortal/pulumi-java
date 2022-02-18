// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.s3.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.internal.annotations.InputImport;
import java.lang.Boolean;
import java.util.Objects;
import javax.annotation.Nullable;


public final class MultiRegionAccessPointPublicAccessBlockConfigurationArgs extends io.pulumi.resources.ResourceArgs {

    public static final MultiRegionAccessPointPublicAccessBlockConfigurationArgs Empty = new MultiRegionAccessPointPublicAccessBlockConfigurationArgs();

    /**
     * Specifies whether Amazon S3 should block public access control lists (ACLs) for buckets in this account. Setting this element to TRUE causes the following behavior:
     * - PUT Bucket acl and PUT Object acl calls fail if the specified ACL is public.
     *  - PUT Object calls fail if the request includes a public ACL.
     *    . - PUT Bucket calls fail if the request includes a public ACL.
     *    Enabling this setting doesn't affect existing policies or ACLs.
     * 
     */
    @InputImport(name="blockPublicAcls")
    private final @Nullable Input<Boolean> blockPublicAcls;

    public Input<Boolean> getBlockPublicAcls() {
        return this.blockPublicAcls == null ? Input.empty() : this.blockPublicAcls;
    }

    /**
     * Specifies whether Amazon S3 should block public bucket policies for buckets in this account. Setting this element to TRUE causes Amazon S3 to reject calls to PUT Bucket policy if the specified bucket policy allows public access. Enabling this setting doesn't affect existing bucket policies.
     * 
     */
    @InputImport(name="blockPublicPolicy")
    private final @Nullable Input<Boolean> blockPublicPolicy;

    public Input<Boolean> getBlockPublicPolicy() {
        return this.blockPublicPolicy == null ? Input.empty() : this.blockPublicPolicy;
    }

    /**
     * Specifies whether Amazon S3 should ignore public ACLs for buckets in this account. Setting this element to TRUE causes Amazon S3 to ignore all public ACLs on buckets in this account and any objects that they contain. Enabling this setting doesn't affect the persistence of any existing ACLs and doesn't prevent new public ACLs from being set.
     * 
     */
    @InputImport(name="ignorePublicAcls")
    private final @Nullable Input<Boolean> ignorePublicAcls;

    public Input<Boolean> getIgnorePublicAcls() {
        return this.ignorePublicAcls == null ? Input.empty() : this.ignorePublicAcls;
    }

    /**
     * Specifies whether Amazon S3 should restrict public bucket policies for this bucket. Setting this element to TRUE restricts access to this bucket to only AWS services and authorized users within this account if the bucket has a public policy.
     * Enabling this setting doesn't affect previously stored bucket policies, except that public and cross-account access within any public bucket policy, including non-public delegation to specific accounts, is blocked.
     * 
     */
    @InputImport(name="restrictPublicBuckets")
    private final @Nullable Input<Boolean> restrictPublicBuckets;

    public Input<Boolean> getRestrictPublicBuckets() {
        return this.restrictPublicBuckets == null ? Input.empty() : this.restrictPublicBuckets;
    }

    public MultiRegionAccessPointPublicAccessBlockConfigurationArgs(
        @Nullable Input<Boolean> blockPublicAcls,
        @Nullable Input<Boolean> blockPublicPolicy,
        @Nullable Input<Boolean> ignorePublicAcls,
        @Nullable Input<Boolean> restrictPublicBuckets) {
        this.blockPublicAcls = blockPublicAcls;
        this.blockPublicPolicy = blockPublicPolicy;
        this.ignorePublicAcls = ignorePublicAcls;
        this.restrictPublicBuckets = restrictPublicBuckets;
    }

    private MultiRegionAccessPointPublicAccessBlockConfigurationArgs() {
        this.blockPublicAcls = Input.empty();
        this.blockPublicPolicy = Input.empty();
        this.ignorePublicAcls = Input.empty();
        this.restrictPublicBuckets = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(MultiRegionAccessPointPublicAccessBlockConfigurationArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<Boolean> blockPublicAcls;
        private @Nullable Input<Boolean> blockPublicPolicy;
        private @Nullable Input<Boolean> ignorePublicAcls;
        private @Nullable Input<Boolean> restrictPublicBuckets;

        public Builder() {
    	      // Empty
        }

        public Builder(MultiRegionAccessPointPublicAccessBlockConfigurationArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.blockPublicAcls = defaults.blockPublicAcls;
    	      this.blockPublicPolicy = defaults.blockPublicPolicy;
    	      this.ignorePublicAcls = defaults.ignorePublicAcls;
    	      this.restrictPublicBuckets = defaults.restrictPublicBuckets;
        }

        public Builder setBlockPublicAcls(@Nullable Input<Boolean> blockPublicAcls) {
            this.blockPublicAcls = blockPublicAcls;
            return this;
        }

        public Builder setBlockPublicAcls(@Nullable Boolean blockPublicAcls) {
            this.blockPublicAcls = Input.ofNullable(blockPublicAcls);
            return this;
        }

        public Builder setBlockPublicPolicy(@Nullable Input<Boolean> blockPublicPolicy) {
            this.blockPublicPolicy = blockPublicPolicy;
            return this;
        }

        public Builder setBlockPublicPolicy(@Nullable Boolean blockPublicPolicy) {
            this.blockPublicPolicy = Input.ofNullable(blockPublicPolicy);
            return this;
        }

        public Builder setIgnorePublicAcls(@Nullable Input<Boolean> ignorePublicAcls) {
            this.ignorePublicAcls = ignorePublicAcls;
            return this;
        }

        public Builder setIgnorePublicAcls(@Nullable Boolean ignorePublicAcls) {
            this.ignorePublicAcls = Input.ofNullable(ignorePublicAcls);
            return this;
        }

        public Builder setRestrictPublicBuckets(@Nullable Input<Boolean> restrictPublicBuckets) {
            this.restrictPublicBuckets = restrictPublicBuckets;
            return this;
        }

        public Builder setRestrictPublicBuckets(@Nullable Boolean restrictPublicBuckets) {
            this.restrictPublicBuckets = Input.ofNullable(restrictPublicBuckets);
            return this;
        }

        public MultiRegionAccessPointPublicAccessBlockConfigurationArgs build() {
            return new MultiRegionAccessPointPublicAccessBlockConfigurationArgs(blockPublicAcls, blockPublicPolicy, ignorePublicAcls, restrictPublicBuckets);
        }
    }
}
