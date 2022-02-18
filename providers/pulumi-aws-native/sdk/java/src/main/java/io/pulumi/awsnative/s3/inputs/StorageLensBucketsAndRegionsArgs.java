// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.s3.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.internal.annotations.InputImport;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * S3 buckets and Regions to include/exclude in the Amazon S3 Storage Lens configuration.
 * 
 */
public final class StorageLensBucketsAndRegionsArgs extends io.pulumi.resources.ResourceArgs {

    public static final StorageLensBucketsAndRegionsArgs Empty = new StorageLensBucketsAndRegionsArgs();

    @InputImport(name="buckets")
    private final @Nullable Input<List<String>> buckets;

    public Input<List<String>> getBuckets() {
        return this.buckets == null ? Input.empty() : this.buckets;
    }

    @InputImport(name="regions")
    private final @Nullable Input<List<String>> regions;

    public Input<List<String>> getRegions() {
        return this.regions == null ? Input.empty() : this.regions;
    }

    public StorageLensBucketsAndRegionsArgs(
        @Nullable Input<List<String>> buckets,
        @Nullable Input<List<String>> regions) {
        this.buckets = buckets;
        this.regions = regions;
    }

    private StorageLensBucketsAndRegionsArgs() {
        this.buckets = Input.empty();
        this.regions = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(StorageLensBucketsAndRegionsArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<List<String>> buckets;
        private @Nullable Input<List<String>> regions;

        public Builder() {
    	      // Empty
        }

        public Builder(StorageLensBucketsAndRegionsArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.buckets = defaults.buckets;
    	      this.regions = defaults.regions;
        }

        public Builder setBuckets(@Nullable Input<List<String>> buckets) {
            this.buckets = buckets;
            return this;
        }

        public Builder setBuckets(@Nullable List<String> buckets) {
            this.buckets = Input.ofNullable(buckets);
            return this;
        }

        public Builder setRegions(@Nullable Input<List<String>> regions) {
            this.regions = regions;
            return this;
        }

        public Builder setRegions(@Nullable List<String> regions) {
            this.regions = Input.ofNullable(regions);
            return this;
        }

        public StorageLensBucketsAndRegionsArgs build() {
            return new StorageLensBucketsAndRegionsArgs(buckets, regions);
        }
    }
}