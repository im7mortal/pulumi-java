// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.compute.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import java.lang.Boolean;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class HealthCheckLogConfig {
    /**
     * Indicates whether or not to export logs. This is false by default,
     * which means no health check logging will be done.
     * 
     */
    private final @Nullable Boolean enable;

    @OutputCustomType.Constructor({"enable"})
    private HealthCheckLogConfig(@Nullable Boolean enable) {
        this.enable = enable;
    }

    /**
     * Indicates whether or not to export logs. This is false by default,
     * which means no health check logging will be done.
     * 
    */
    public Optional<Boolean> getEnable() {
        return Optional.ofNullable(this.enable);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(HealthCheckLogConfig defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Boolean enable;

        public Builder() {
    	      // Empty
        }

        public Builder(HealthCheckLogConfig defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.enable = defaults.enable;
        }

        public Builder setEnable(@Nullable Boolean enable) {
            this.enable = enable;
            return this;
        }
        public HealthCheckLogConfig build() {
            return new HealthCheckLogConfig(enable);
        }
    }
}
