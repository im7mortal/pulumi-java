// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.sql.inputs;

import io.pulumi.core.internal.annotations.InputImport;
import java.lang.Double;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class ElasticPoolPerDatabaseSettingsResponse extends io.pulumi.resources.InvokeArgs {

    public static final ElasticPoolPerDatabaseSettingsResponse Empty = new ElasticPoolPerDatabaseSettingsResponse();

    @InputImport(name="maxCapacity")
    private final @Nullable Double maxCapacity;

    public Optional<Double> getMaxCapacity() {
        return this.maxCapacity == null ? Optional.empty() : Optional.ofNullable(this.maxCapacity);
    }

    @InputImport(name="minCapacity")
    private final @Nullable Double minCapacity;

    public Optional<Double> getMinCapacity() {
        return this.minCapacity == null ? Optional.empty() : Optional.ofNullable(this.minCapacity);
    }

    public ElasticPoolPerDatabaseSettingsResponse(
        @Nullable Double maxCapacity,
        @Nullable Double minCapacity) {
        this.maxCapacity = maxCapacity;
        this.minCapacity = minCapacity;
    }

    private ElasticPoolPerDatabaseSettingsResponse() {
        this.maxCapacity = null;
        this.minCapacity = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ElasticPoolPerDatabaseSettingsResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Double maxCapacity;
        private @Nullable Double minCapacity;

        public Builder() {
    	      // Empty
        }

        public Builder(ElasticPoolPerDatabaseSettingsResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.maxCapacity = defaults.maxCapacity;
    	      this.minCapacity = defaults.minCapacity;
        }

        public Builder setMaxCapacity(@Nullable Double maxCapacity) {
            this.maxCapacity = maxCapacity;
            return this;
        }

        public Builder setMinCapacity(@Nullable Double minCapacity) {
            this.minCapacity = minCapacity;
            return this;
        }

        public ElasticPoolPerDatabaseSettingsResponse build() {
            return new ElasticPoolPerDatabaseSettingsResponse(maxCapacity, minCapacity);
        }
    }
}