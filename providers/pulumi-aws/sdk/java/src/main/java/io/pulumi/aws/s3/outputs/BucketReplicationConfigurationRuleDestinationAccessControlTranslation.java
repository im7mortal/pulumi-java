// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.s3.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import java.lang.String;
import java.util.Objects;

@OutputCustomType
public final class BucketReplicationConfigurationRuleDestinationAccessControlTranslation {
    /**
     * The override value for the owner on replicated objects. Currently only `Destination` is supported.
     * 
     */
    private final String owner;

    @OutputCustomType.Constructor({"owner"})
    private BucketReplicationConfigurationRuleDestinationAccessControlTranslation(String owner) {
        this.owner = Objects.requireNonNull(owner);
    }

    /**
     * The override value for the owner on replicated objects. Currently only `Destination` is supported.
     * 
    */
    public String getOwner() {
        return this.owner;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(BucketReplicationConfigurationRuleDestinationAccessControlTranslation defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String owner;

        public Builder() {
    	      // Empty
        }

        public Builder(BucketReplicationConfigurationRuleDestinationAccessControlTranslation defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.owner = defaults.owner;
        }

        public Builder setOwner(String owner) {
            this.owner = Objects.requireNonNull(owner);
            return this;
        }
        public BucketReplicationConfigurationRuleDestinationAccessControlTranslation build() {
            return new BucketReplicationConfigurationRuleDestinationAccessControlTranslation(owner);
        }
    }
}
