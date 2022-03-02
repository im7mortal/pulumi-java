// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.cache.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;

@OutputCustomType
public final class SkuResponse {
    /**
     * The size of the Redis cache to deploy. Valid values: for C (Basic/Standard) family (0, 1, 2, 3, 4, 5, 6), for P (Premium) family (1, 2, 3, 4).
     * 
     */
    private final Integer capacity;
    /**
     * The SKU family to use. Valid values: (C, P). (C = Basic/Standard, P = Premium).
     * 
     */
    private final String family;
    /**
     * The type of Redis cache to deploy. Valid values: (Basic, Standard, Premium)
     * 
     */
    private final String name;

    @OutputCustomType.Constructor({"capacity","family","name"})
    private SkuResponse(
        Integer capacity,
        String family,
        String name) {
        this.capacity = Objects.requireNonNull(capacity);
        this.family = Objects.requireNonNull(family);
        this.name = Objects.requireNonNull(name);
    }

    /**
     * The size of the Redis cache to deploy. Valid values: for C (Basic/Standard) family (0, 1, 2, 3, 4, 5, 6), for P (Premium) family (1, 2, 3, 4).
     * 
    */
    public Integer getCapacity() {
        return this.capacity;
    }
    /**
     * The SKU family to use. Valid values: (C, P). (C = Basic/Standard, P = Premium).
     * 
    */
    public String getFamily() {
        return this.family;
    }
    /**
     * The type of Redis cache to deploy. Valid values: (Basic, Standard, Premium)
     * 
    */
    public String getName() {
        return this.name;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(SkuResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Integer capacity;
        private String family;
        private String name;

        public Builder() {
    	      // Empty
        }

        public Builder(SkuResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.capacity = defaults.capacity;
    	      this.family = defaults.family;
    	      this.name = defaults.name;
        }

        public Builder setCapacity(Integer capacity) {
            this.capacity = Objects.requireNonNull(capacity);
            return this;
        }

        public Builder setFamily(String family) {
            this.family = Objects.requireNonNull(family);
            return this;
        }

        public Builder setName(String name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }
        public SkuResponse build() {
            return new SkuResponse(capacity, family, name);
        }
    }
}
