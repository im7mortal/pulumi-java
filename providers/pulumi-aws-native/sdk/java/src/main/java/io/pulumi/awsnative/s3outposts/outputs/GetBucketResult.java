// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.s3outposts.outputs;

import io.pulumi.awsnative.s3outposts.outputs.BucketLifecycleConfiguration;
import io.pulumi.awsnative.s3outposts.outputs.BucketTag;
import io.pulumi.core.internal.annotations.OutputCustomType;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class GetBucketResult {
    /**
     * The Amazon Resource Name (ARN) of the specified bucket.
     * 
     */
    private final @Nullable String arn;
    /**
     * Rules that define how Amazon S3Outposts manages objects during their lifetime.
     * 
     */
    private final @Nullable BucketLifecycleConfiguration lifecycleConfiguration;
    /**
     * An arbitrary set of tags (key-value pairs) for this S3Outposts bucket.
     * 
     */
    private final @Nullable List<BucketTag> tags;

    @OutputCustomType.Constructor({"arn","lifecycleConfiguration","tags"})
    private GetBucketResult(
        @Nullable String arn,
        @Nullable BucketLifecycleConfiguration lifecycleConfiguration,
        @Nullable List<BucketTag> tags) {
        this.arn = arn;
        this.lifecycleConfiguration = lifecycleConfiguration;
        this.tags = tags;
    }

    /**
     * The Amazon Resource Name (ARN) of the specified bucket.
     * 
     */
    public Optional<String> getArn() {
        return Optional.ofNullable(this.arn);
    }
    /**
     * Rules that define how Amazon S3Outposts manages objects during their lifetime.
     * 
     */
    public Optional<BucketLifecycleConfiguration> getLifecycleConfiguration() {
        return Optional.ofNullable(this.lifecycleConfiguration);
    }
    /**
     * An arbitrary set of tags (key-value pairs) for this S3Outposts bucket.
     * 
     */
    public List<BucketTag> getTags() {
        return this.tags == null ? List.of() : this.tags;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetBucketResult defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String arn;
        private @Nullable BucketLifecycleConfiguration lifecycleConfiguration;
        private @Nullable List<BucketTag> tags;

        public Builder() {
    	      // Empty
        }

        public Builder(GetBucketResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.arn = defaults.arn;
    	      this.lifecycleConfiguration = defaults.lifecycleConfiguration;
    	      this.tags = defaults.tags;
        }

        public Builder setArn(@Nullable String arn) {
            this.arn = arn;
            return this;
        }

        public Builder setLifecycleConfiguration(@Nullable BucketLifecycleConfiguration lifecycleConfiguration) {
            this.lifecycleConfiguration = lifecycleConfiguration;
            return this;
        }

        public Builder setTags(@Nullable List<BucketTag> tags) {
            this.tags = tags;
            return this;
        }

        public GetBucketResult build() {
            return new GetBucketResult(arn, lifecycleConfiguration, tags);
        }
    }
}
