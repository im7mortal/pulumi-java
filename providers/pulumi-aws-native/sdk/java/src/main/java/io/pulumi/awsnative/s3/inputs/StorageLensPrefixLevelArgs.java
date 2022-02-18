// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.s3.inputs;

import io.pulumi.awsnative.s3.inputs.StorageLensPrefixLevelStorageMetricsArgs;
import io.pulumi.core.Input;
import io.pulumi.core.internal.annotations.InputImport;
import java.util.Objects;


/**
 * Prefix-level metrics configurations.
 * 
 */
public final class StorageLensPrefixLevelArgs extends io.pulumi.resources.ResourceArgs {

    public static final StorageLensPrefixLevelArgs Empty = new StorageLensPrefixLevelArgs();

    @InputImport(name="storageMetrics", required=true)
    private final Input<StorageLensPrefixLevelStorageMetricsArgs> storageMetrics;

    public Input<StorageLensPrefixLevelStorageMetricsArgs> getStorageMetrics() {
        return this.storageMetrics;
    }

    public StorageLensPrefixLevelArgs(Input<StorageLensPrefixLevelStorageMetricsArgs> storageMetrics) {
        this.storageMetrics = Objects.requireNonNull(storageMetrics, "expected parameter 'storageMetrics' to be non-null");
    }

    private StorageLensPrefixLevelArgs() {
        this.storageMetrics = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(StorageLensPrefixLevelArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Input<StorageLensPrefixLevelStorageMetricsArgs> storageMetrics;

        public Builder() {
    	      // Empty
        }

        public Builder(StorageLensPrefixLevelArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.storageMetrics = defaults.storageMetrics;
        }

        public Builder setStorageMetrics(Input<StorageLensPrefixLevelStorageMetricsArgs> storageMetrics) {
            this.storageMetrics = Objects.requireNonNull(storageMetrics);
            return this;
        }

        public Builder setStorageMetrics(StorageLensPrefixLevelStorageMetricsArgs storageMetrics) {
            this.storageMetrics = Input.of(Objects.requireNonNull(storageMetrics));
            return this;
        }

        public StorageLensPrefixLevelArgs build() {
            return new StorageLensPrefixLevelArgs(storageMetrics);
        }
    }
}
