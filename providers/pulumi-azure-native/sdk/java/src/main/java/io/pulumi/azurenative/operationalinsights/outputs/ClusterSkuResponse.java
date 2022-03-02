// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.operationalinsights.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import java.lang.Double;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class ClusterSkuResponse {
    /**
     * The capacity value
     * 
     */
    private final @Nullable Double capacity;
    /**
     * The name of the SKU.
     * 
     */
    private final @Nullable String name;

    @OutputCustomType.Constructor({"capacity","name"})
    private ClusterSkuResponse(
        @Nullable Double capacity,
        @Nullable String name) {
        this.capacity = capacity;
        this.name = name;
    }

    /**
     * The capacity value
     * 
    */
    public Optional<Double> getCapacity() {
        return Optional.ofNullable(this.capacity);
    }
    /**
     * The name of the SKU.
     * 
    */
    public Optional<String> getName() {
        return Optional.ofNullable(this.name);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ClusterSkuResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Double capacity;
        private @Nullable String name;

        public Builder() {
    	      // Empty
        }

        public Builder(ClusterSkuResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.capacity = defaults.capacity;
    	      this.name = defaults.name;
        }

        public Builder setCapacity(@Nullable Double capacity) {
            this.capacity = capacity;
            return this;
        }

        public Builder setName(@Nullable String name) {
            this.name = name;
            return this;
        }
        public ClusterSkuResponse build() {
            return new ClusterSkuResponse(capacity, name);
        }
    }
}
