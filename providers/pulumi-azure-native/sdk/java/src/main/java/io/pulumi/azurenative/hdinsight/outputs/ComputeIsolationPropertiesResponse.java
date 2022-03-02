// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.hdinsight.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import java.lang.Boolean;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class ComputeIsolationPropertiesResponse {
    /**
     * The flag indicates whether enable compute isolation or not.
     * 
     */
    private final @Nullable Boolean enableComputeIsolation;
    /**
     * The host sku.
     * 
     */
    private final @Nullable String hostSku;

    @OutputCustomType.Constructor({"enableComputeIsolation","hostSku"})
    private ComputeIsolationPropertiesResponse(
        @Nullable Boolean enableComputeIsolation,
        @Nullable String hostSku) {
        this.enableComputeIsolation = enableComputeIsolation;
        this.hostSku = hostSku;
    }

    /**
     * The flag indicates whether enable compute isolation or not.
     * 
    */
    public Optional<Boolean> getEnableComputeIsolation() {
        return Optional.ofNullable(this.enableComputeIsolation);
    }
    /**
     * The host sku.
     * 
    */
    public Optional<String> getHostSku() {
        return Optional.ofNullable(this.hostSku);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ComputeIsolationPropertiesResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Boolean enableComputeIsolation;
        private @Nullable String hostSku;

        public Builder() {
    	      // Empty
        }

        public Builder(ComputeIsolationPropertiesResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.enableComputeIsolation = defaults.enableComputeIsolation;
    	      this.hostSku = defaults.hostSku;
        }

        public Builder setEnableComputeIsolation(@Nullable Boolean enableComputeIsolation) {
            this.enableComputeIsolation = enableComputeIsolation;
            return this;
        }

        public Builder setHostSku(@Nullable String hostSku) {
            this.hostSku = hostSku;
            return this;
        }
        public ComputeIsolationPropertiesResponse build() {
            return new ComputeIsolationPropertiesResponse(enableComputeIsolation, hostSku);
        }
    }
}
