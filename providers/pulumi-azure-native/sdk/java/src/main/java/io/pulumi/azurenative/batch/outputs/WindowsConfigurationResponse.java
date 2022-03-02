// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.batch.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import java.lang.Boolean;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class WindowsConfigurationResponse {
    /**
     * If omitted, the default value is true.
     * 
     */
    private final @Nullable Boolean enableAutomaticUpdates;

    @OutputCustomType.Constructor({"enableAutomaticUpdates"})
    private WindowsConfigurationResponse(@Nullable Boolean enableAutomaticUpdates) {
        this.enableAutomaticUpdates = enableAutomaticUpdates;
    }

    /**
     * If omitted, the default value is true.
     * 
    */
    public Optional<Boolean> getEnableAutomaticUpdates() {
        return Optional.ofNullable(this.enableAutomaticUpdates);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(WindowsConfigurationResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Boolean enableAutomaticUpdates;

        public Builder() {
    	      // Empty
        }

        public Builder(WindowsConfigurationResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.enableAutomaticUpdates = defaults.enableAutomaticUpdates;
        }

        public Builder setEnableAutomaticUpdates(@Nullable Boolean enableAutomaticUpdates) {
            this.enableAutomaticUpdates = enableAutomaticUpdates;
            return this;
        }
        public WindowsConfigurationResponse build() {
            return new WindowsConfigurationResponse(enableAutomaticUpdates);
        }
    }
}
