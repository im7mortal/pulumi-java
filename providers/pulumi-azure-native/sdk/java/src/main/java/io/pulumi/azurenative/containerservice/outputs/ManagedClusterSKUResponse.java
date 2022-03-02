// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.containerservice.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class ManagedClusterSKUResponse {
    /**
     * Name of a managed cluster SKU.
     * 
     */
    private final @Nullable String name;
    /**
     * Tier of a managed cluster SKU.
     * 
     */
    private final @Nullable String tier;

    @OutputCustomType.Constructor({"name","tier"})
    private ManagedClusterSKUResponse(
        @Nullable String name,
        @Nullable String tier) {
        this.name = name;
        this.tier = tier;
    }

    /**
     * Name of a managed cluster SKU.
     * 
    */
    public Optional<String> getName() {
        return Optional.ofNullable(this.name);
    }
    /**
     * Tier of a managed cluster SKU.
     * 
    */
    public Optional<String> getTier() {
        return Optional.ofNullable(this.tier);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ManagedClusterSKUResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String name;
        private @Nullable String tier;

        public Builder() {
    	      // Empty
        }

        public Builder(ManagedClusterSKUResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.name = defaults.name;
    	      this.tier = defaults.tier;
        }

        public Builder setName(@Nullable String name) {
            this.name = name;
            return this;
        }

        public Builder setTier(@Nullable String tier) {
            this.tier = tier;
            return this;
        }
        public ManagedClusterSKUResponse build() {
            return new ManagedClusterSKUResponse(name, tier);
        }
    }
}
