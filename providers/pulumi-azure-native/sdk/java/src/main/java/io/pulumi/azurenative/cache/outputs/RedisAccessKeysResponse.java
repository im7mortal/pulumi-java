// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.cache.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import java.lang.String;
import java.util.Objects;

@OutputCustomType
public final class RedisAccessKeysResponse {
    /**
     * The current primary key that clients can use to authenticate with Redis cache.
     * 
     */
    private final String primaryKey;
    /**
     * The current secondary key that clients can use to authenticate with Redis cache.
     * 
     */
    private final String secondaryKey;

    @OutputCustomType.Constructor({"primaryKey","secondaryKey"})
    private RedisAccessKeysResponse(
        String primaryKey,
        String secondaryKey) {
        this.primaryKey = Objects.requireNonNull(primaryKey);
        this.secondaryKey = Objects.requireNonNull(secondaryKey);
    }

    /**
     * The current primary key that clients can use to authenticate with Redis cache.
     * 
    */
    public String getPrimaryKey() {
        return this.primaryKey;
    }
    /**
     * The current secondary key that clients can use to authenticate with Redis cache.
     * 
    */
    public String getSecondaryKey() {
        return this.secondaryKey;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(RedisAccessKeysResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String primaryKey;
        private String secondaryKey;

        public Builder() {
    	      // Empty
        }

        public Builder(RedisAccessKeysResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.primaryKey = defaults.primaryKey;
    	      this.secondaryKey = defaults.secondaryKey;
        }

        public Builder setPrimaryKey(String primaryKey) {
            this.primaryKey = Objects.requireNonNull(primaryKey);
            return this;
        }

        public Builder setSecondaryKey(String secondaryKey) {
            this.secondaryKey = Objects.requireNonNull(secondaryKey);
            return this;
        }
        public RedisAccessKeysResponse build() {
            return new RedisAccessKeysResponse(primaryKey, secondaryKey);
        }
    }
}
