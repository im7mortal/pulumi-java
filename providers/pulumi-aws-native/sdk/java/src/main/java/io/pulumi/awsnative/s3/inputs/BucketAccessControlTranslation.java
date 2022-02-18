// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.s3.inputs;

import io.pulumi.core.internal.annotations.InputImport;
import java.lang.String;
import java.util.Objects;


/**
 * Specify this only in a cross-account scenario (where source and destination bucket owners are not the same), and you want to change replica ownership to the AWS account that owns the destination bucket. If this is not specified in the replication configuration, the replicas are owned by same AWS account that owns the source object.
 * 
 */
public final class BucketAccessControlTranslation extends io.pulumi.resources.InvokeArgs {

    public static final BucketAccessControlTranslation Empty = new BucketAccessControlTranslation();

    @InputImport(name="owner", required=true)
    private final String owner;

    public String getOwner() {
        return this.owner;
    }

    public BucketAccessControlTranslation(String owner) {
        this.owner = Objects.requireNonNull(owner, "expected parameter 'owner' to be non-null");
    }

    private BucketAccessControlTranslation() {
        this.owner = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(BucketAccessControlTranslation defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String owner;

        public Builder() {
    	      // Empty
        }

        public Builder(BucketAccessControlTranslation defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.owner = defaults.owner;
        }

        public Builder setOwner(String owner) {
            this.owner = Objects.requireNonNull(owner);
            return this;
        }

        public BucketAccessControlTranslation build() {
            return new BucketAccessControlTranslation(owner);
        }
    }
}
