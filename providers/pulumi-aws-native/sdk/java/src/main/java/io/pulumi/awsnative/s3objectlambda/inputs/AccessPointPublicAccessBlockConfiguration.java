// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.s3objectlambda.inputs;

import io.pulumi.core.internal.annotations.InputImport;
import java.lang.Boolean;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * The Public Access Block Configuration is used to block policies that would allow public access to this Object lambda Access Point. All public access to Object lambda Access Points are blocked by default, and any policy that would give public access to them will be also blocked. This behavior cannot be changed for Object lambda Access Points.
 * 
 */
public final class AccessPointPublicAccessBlockConfiguration extends io.pulumi.resources.InvokeArgs {

    public static final AccessPointPublicAccessBlockConfiguration Empty = new AccessPointPublicAccessBlockConfiguration();

    /**
     * Specifies whether Amazon S3 should block public access control lists (ACLs) to this object lambda access point. Setting this element to TRUE causes the following behavior:
     * - PUT Bucket acl and PUT Object acl calls fail if the specified ACL is public.
     *  - PUT Object calls fail if the request includes a public ACL.
     *    . - PUT Bucket calls fail if the request includes a public ACL.
     *    Enabling this setting doesn't affect existing policies or ACLs.
     * 
     */
    @InputImport(name="blockPublicAcls")
    private final @Nullable Boolean blockPublicAcls;

    public Optional<Boolean> getBlockPublicAcls() {
        return this.blockPublicAcls == null ? Optional.empty() : Optional.ofNullable(this.blockPublicAcls);
    }

    /**
     * Specifies whether Amazon S3 should block public bucket policies for buckets in this account. Setting this element to TRUE causes Amazon S3 to reject calls to PUT Bucket policy if the specified bucket policy allows public access. Enabling this setting doesn't affect existing bucket policies.
     * 
     */
    @InputImport(name="blockPublicPolicy")
    private final @Nullable Boolean blockPublicPolicy;

    public Optional<Boolean> getBlockPublicPolicy() {
        return this.blockPublicPolicy == null ? Optional.empty() : Optional.ofNullable(this.blockPublicPolicy);
    }

    /**
     * Specifies whether Amazon S3 should ignore public ACLs for buckets in this account. Setting this element to TRUE causes Amazon S3 to ignore all public ACLs on buckets in this account and any objects that they contain. Enabling this setting doesn't affect the persistence of any existing ACLs and doesn't prevent new public ACLs from being set.
     * 
     */
    @InputImport(name="ignorePublicAcls")
    private final @Nullable Boolean ignorePublicAcls;

    public Optional<Boolean> getIgnorePublicAcls() {
        return this.ignorePublicAcls == null ? Optional.empty() : Optional.ofNullable(this.ignorePublicAcls);
    }

    /**
     * Specifies whether Amazon S3 should restrict public bucket policies for this bucket. Setting this element to TRUE restricts access to this bucket to only AWS services and authorized users within this account if the bucket has a public policy.
     * Enabling this setting doesn't affect previously stored bucket policies, except that public and cross-account access within any public bucket policy, including non-public delegation to specific accounts, is blocked.
     * 
     */
    @InputImport(name="restrictPublicBuckets")
    private final @Nullable Boolean restrictPublicBuckets;

    public Optional<Boolean> getRestrictPublicBuckets() {
        return this.restrictPublicBuckets == null ? Optional.empty() : Optional.ofNullable(this.restrictPublicBuckets);
    }

    public AccessPointPublicAccessBlockConfiguration(
        @Nullable Boolean blockPublicAcls,
        @Nullable Boolean blockPublicPolicy,
        @Nullable Boolean ignorePublicAcls,
        @Nullable Boolean restrictPublicBuckets) {
        this.blockPublicAcls = blockPublicAcls;
        this.blockPublicPolicy = blockPublicPolicy;
        this.ignorePublicAcls = ignorePublicAcls;
        this.restrictPublicBuckets = restrictPublicBuckets;
    }

    private AccessPointPublicAccessBlockConfiguration() {
        this.blockPublicAcls = null;
        this.blockPublicPolicy = null;
        this.ignorePublicAcls = null;
        this.restrictPublicBuckets = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(AccessPointPublicAccessBlockConfiguration defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Boolean blockPublicAcls;
        private @Nullable Boolean blockPublicPolicy;
        private @Nullable Boolean ignorePublicAcls;
        private @Nullable Boolean restrictPublicBuckets;

        public Builder() {
    	      // Empty
        }

        public Builder(AccessPointPublicAccessBlockConfiguration defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.blockPublicAcls = defaults.blockPublicAcls;
    	      this.blockPublicPolicy = defaults.blockPublicPolicy;
    	      this.ignorePublicAcls = defaults.ignorePublicAcls;
    	      this.restrictPublicBuckets = defaults.restrictPublicBuckets;
        }

        public Builder setBlockPublicAcls(@Nullable Boolean blockPublicAcls) {
            this.blockPublicAcls = blockPublicAcls;
            return this;
        }

        public Builder setBlockPublicPolicy(@Nullable Boolean blockPublicPolicy) {
            this.blockPublicPolicy = blockPublicPolicy;
            return this;
        }

        public Builder setIgnorePublicAcls(@Nullable Boolean ignorePublicAcls) {
            this.ignorePublicAcls = ignorePublicAcls;
            return this;
        }

        public Builder setRestrictPublicBuckets(@Nullable Boolean restrictPublicBuckets) {
            this.restrictPublicBuckets = restrictPublicBuckets;
            return this;
        }

        public AccessPointPublicAccessBlockConfiguration build() {
            return new AccessPointPublicAccessBlockConfiguration(blockPublicAcls, blockPublicPolicy, ignorePublicAcls, restrictPublicBuckets);
        }
    }
}
