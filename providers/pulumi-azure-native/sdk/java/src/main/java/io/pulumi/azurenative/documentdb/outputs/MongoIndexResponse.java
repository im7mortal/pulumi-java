// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.documentdb.outputs;

import io.pulumi.azurenative.documentdb.outputs.MongoIndexKeysResponse;
import io.pulumi.azurenative.documentdb.outputs.MongoIndexOptionsResponse;
import io.pulumi.core.annotations.OutputCustomType;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class MongoIndexResponse {
    /**
     * Cosmos DB MongoDB collection index keys
     * 
     */
    private final @Nullable MongoIndexKeysResponse key;
    /**
     * Cosmos DB MongoDB collection index key options
     * 
     */
    private final @Nullable MongoIndexOptionsResponse options;

    @OutputCustomType.Constructor({"key","options"})
    private MongoIndexResponse(
        @Nullable MongoIndexKeysResponse key,
        @Nullable MongoIndexOptionsResponse options) {
        this.key = key;
        this.options = options;
    }

    /**
     * Cosmos DB MongoDB collection index keys
     * 
    */
    public Optional<MongoIndexKeysResponse> getKey() {
        return Optional.ofNullable(this.key);
    }
    /**
     * Cosmos DB MongoDB collection index key options
     * 
    */
    public Optional<MongoIndexOptionsResponse> getOptions() {
        return Optional.ofNullable(this.options);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(MongoIndexResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable MongoIndexKeysResponse key;
        private @Nullable MongoIndexOptionsResponse options;

        public Builder() {
    	      // Empty
        }

        public Builder(MongoIndexResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.key = defaults.key;
    	      this.options = defaults.options;
        }

        public Builder setKey(@Nullable MongoIndexKeysResponse key) {
            this.key = key;
            return this;
        }

        public Builder setOptions(@Nullable MongoIndexOptionsResponse options) {
            this.options = options;
            return this;
        }
        public MongoIndexResponse build() {
            return new MongoIndexResponse(key, options);
        }
    }
}
