// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.s3.inputs;

import io.pulumi.awsnative.s3.inputs.BucketStorageClassAnalysis;
import io.pulumi.awsnative.s3.inputs.BucketTagFilter;
import io.pulumi.core.internal.annotations.InputImport;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * Specifies the configuration and any analyses for the analytics filter of an Amazon S3 bucket.
 * 
 */
public final class BucketAnalyticsConfiguration extends io.pulumi.resources.InvokeArgs {

    public static final BucketAnalyticsConfiguration Empty = new BucketAnalyticsConfiguration();

    /**
     * The ID that identifies the analytics configuration.
     * 
     */
    @InputImport(name="id", required=true)
    private final String id;

    public String getId() {
        return this.id;
    }

    /**
     * The prefix that an object must have to be included in the analytics results.
     * 
     */
    @InputImport(name="prefix")
    private final @Nullable String prefix;

    public Optional<String> getPrefix() {
        return this.prefix == null ? Optional.empty() : Optional.ofNullable(this.prefix);
    }

    @InputImport(name="storageClassAnalysis", required=true)
    private final BucketStorageClassAnalysis storageClassAnalysis;

    public BucketStorageClassAnalysis getStorageClassAnalysis() {
        return this.storageClassAnalysis;
    }

    @InputImport(name="tagFilters")
    private final @Nullable List<BucketTagFilter> tagFilters;

    public List<BucketTagFilter> getTagFilters() {
        return this.tagFilters == null ? List.of() : this.tagFilters;
    }

    public BucketAnalyticsConfiguration(
        String id,
        @Nullable String prefix,
        BucketStorageClassAnalysis storageClassAnalysis,
        @Nullable List<BucketTagFilter> tagFilters) {
        this.id = Objects.requireNonNull(id, "expected parameter 'id' to be non-null");
        this.prefix = prefix;
        this.storageClassAnalysis = Objects.requireNonNull(storageClassAnalysis, "expected parameter 'storageClassAnalysis' to be non-null");
        this.tagFilters = tagFilters;
    }

    private BucketAnalyticsConfiguration() {
        this.id = null;
        this.prefix = null;
        this.storageClassAnalysis = null;
        this.tagFilters = List.of();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(BucketAnalyticsConfiguration defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String id;
        private @Nullable String prefix;
        private BucketStorageClassAnalysis storageClassAnalysis;
        private @Nullable List<BucketTagFilter> tagFilters;

        public Builder() {
    	      // Empty
        }

        public Builder(BucketAnalyticsConfiguration defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.id = defaults.id;
    	      this.prefix = defaults.prefix;
    	      this.storageClassAnalysis = defaults.storageClassAnalysis;
    	      this.tagFilters = defaults.tagFilters;
        }

        public Builder setId(String id) {
            this.id = Objects.requireNonNull(id);
            return this;
        }

        public Builder setPrefix(@Nullable String prefix) {
            this.prefix = prefix;
            return this;
        }

        public Builder setStorageClassAnalysis(BucketStorageClassAnalysis storageClassAnalysis) {
            this.storageClassAnalysis = Objects.requireNonNull(storageClassAnalysis);
            return this;
        }

        public Builder setTagFilters(@Nullable List<BucketTagFilter> tagFilters) {
            this.tagFilters = tagFilters;
            return this;
        }

        public BucketAnalyticsConfiguration build() {
            return new BucketAnalyticsConfiguration(id, prefix, storageClassAnalysis, tagFilters);
        }
    }
}