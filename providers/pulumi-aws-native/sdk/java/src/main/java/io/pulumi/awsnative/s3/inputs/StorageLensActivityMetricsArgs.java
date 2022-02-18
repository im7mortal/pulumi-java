// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.s3.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.internal.annotations.InputImport;
import java.lang.Boolean;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * Enables activity metrics.
 * 
 */
public final class StorageLensActivityMetricsArgs extends io.pulumi.resources.ResourceArgs {

    public static final StorageLensActivityMetricsArgs Empty = new StorageLensActivityMetricsArgs();

    /**
     * Specifies whether activity metrics are enabled or disabled.
     * 
     */
    @InputImport(name="isEnabled")
    private final @Nullable Input<Boolean> isEnabled;

    public Input<Boolean> getIsEnabled() {
        return this.isEnabled == null ? Input.empty() : this.isEnabled;
    }

    public StorageLensActivityMetricsArgs(@Nullable Input<Boolean> isEnabled) {
        this.isEnabled = isEnabled;
    }

    private StorageLensActivityMetricsArgs() {
        this.isEnabled = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(StorageLensActivityMetricsArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<Boolean> isEnabled;

        public Builder() {
    	      // Empty
        }

        public Builder(StorageLensActivityMetricsArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.isEnabled = defaults.isEnabled;
        }

        public Builder setIsEnabled(@Nullable Input<Boolean> isEnabled) {
            this.isEnabled = isEnabled;
            return this;
        }

        public Builder setIsEnabled(@Nullable Boolean isEnabled) {
            this.isEnabled = Input.ofNullable(isEnabled);
            return this;
        }

        public StorageLensActivityMetricsArgs build() {
            return new StorageLensActivityMetricsArgs(isEnabled);
        }
    }
}
