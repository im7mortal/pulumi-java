// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.documentdb.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import java.lang.Integer;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class AutoscaleSettingsResponse {
    /**
     * Represents maximum throughput, the resource can scale up to.
     * 
     */
    private final @Nullable Integer maxThroughput;

    @OutputCustomType.Constructor({"maxThroughput"})
    private AutoscaleSettingsResponse(@Nullable Integer maxThroughput) {
        this.maxThroughput = maxThroughput;
    }

    /**
     * Represents maximum throughput, the resource can scale up to.
     * 
    */
    public Optional<Integer> getMaxThroughput() {
        return Optional.ofNullable(this.maxThroughput);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(AutoscaleSettingsResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Integer maxThroughput;

        public Builder() {
    	      // Empty
        }

        public Builder(AutoscaleSettingsResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.maxThroughput = defaults.maxThroughput;
        }

        public Builder setMaxThroughput(@Nullable Integer maxThroughput) {
            this.maxThroughput = maxThroughput;
            return this;
        }
        public AutoscaleSettingsResponse build() {
            return new AutoscaleSettingsResponse(maxThroughput);
        }
    }
}
