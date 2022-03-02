// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.machinelearningservices.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import java.lang.Integer;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class CosmosDbSettingsResponse {
    /**
     * The throughput of the collections in cosmosdb database
     * 
     */
    private final @Nullable Integer collectionsThroughput;

    @OutputCustomType.Constructor({"collectionsThroughput"})
    private CosmosDbSettingsResponse(@Nullable Integer collectionsThroughput) {
        this.collectionsThroughput = collectionsThroughput;
    }

    /**
     * The throughput of the collections in cosmosdb database
     * 
    */
    public Optional<Integer> getCollectionsThroughput() {
        return Optional.ofNullable(this.collectionsThroughput);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(CosmosDbSettingsResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Integer collectionsThroughput;

        public Builder() {
    	      // Empty
        }

        public Builder(CosmosDbSettingsResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.collectionsThroughput = defaults.collectionsThroughput;
        }

        public Builder setCollectionsThroughput(@Nullable Integer collectionsThroughput) {
            this.collectionsThroughput = collectionsThroughput;
            return this;
        }
        public CosmosDbSettingsResponse build() {
            return new CosmosDbSettingsResponse(collectionsThroughput);
        }
    }
}
