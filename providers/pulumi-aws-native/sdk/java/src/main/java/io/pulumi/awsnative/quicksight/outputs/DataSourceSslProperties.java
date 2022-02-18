// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.quicksight.outputs;

import io.pulumi.core.internal.annotations.OutputCustomType;
import java.lang.Boolean;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class DataSourceSslProperties {
    /**
     * <p>A Boolean option to control whether SSL should be disabled.</p>
     * 
     */
    private final @Nullable Boolean disableSsl;

    @OutputCustomType.Constructor({"disableSsl"})
    private DataSourceSslProperties(@Nullable Boolean disableSsl) {
        this.disableSsl = disableSsl;
    }

    /**
     * <p>A Boolean option to control whether SSL should be disabled.</p>
     * 
     */
    public Optional<Boolean> getDisableSsl() {
        return Optional.ofNullable(this.disableSsl);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(DataSourceSslProperties defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Boolean disableSsl;

        public Builder() {
    	      // Empty
        }

        public Builder(DataSourceSslProperties defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.disableSsl = defaults.disableSsl;
        }

        public Builder setDisableSsl(@Nullable Boolean disableSsl) {
            this.disableSsl = disableSsl;
            return this;
        }

        public DataSourceSslProperties build() {
            return new DataSourceSslProperties(disableSsl);
        }
    }
}
