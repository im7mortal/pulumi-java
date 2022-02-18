// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.s3.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.internal.annotations.InputImport;
import java.lang.String;
import java.util.Objects;


public final class MultiRegionAccessPointRegionArgs extends io.pulumi.resources.ResourceArgs {

    public static final MultiRegionAccessPointRegionArgs Empty = new MultiRegionAccessPointRegionArgs();

    @InputImport(name="bucket", required=true)
    private final Input<String> bucket;

    public Input<String> getBucket() {
        return this.bucket;
    }

    public MultiRegionAccessPointRegionArgs(Input<String> bucket) {
        this.bucket = Objects.requireNonNull(bucket, "expected parameter 'bucket' to be non-null");
    }

    private MultiRegionAccessPointRegionArgs() {
        this.bucket = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(MultiRegionAccessPointRegionArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Input<String> bucket;

        public Builder() {
    	      // Empty
        }

        public Builder(MultiRegionAccessPointRegionArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.bucket = defaults.bucket;
        }

        public Builder setBucket(Input<String> bucket) {
            this.bucket = Objects.requireNonNull(bucket);
            return this;
        }

        public Builder setBucket(String bucket) {
            this.bucket = Input.of(Objects.requireNonNull(bucket));
            return this;
        }

        public MultiRegionAccessPointRegionArgs build() {
            return new MultiRegionAccessPointRegionArgs(bucket);
        }
    }
}