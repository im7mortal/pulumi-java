// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.ecr.outputs;

import io.pulumi.core.internal.annotations.OutputCustomType;
import java.lang.Boolean;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class RepositoryImageScanningConfiguration {
    private final @Nullable Boolean scanOnPush;

    @OutputCustomType.Constructor({"scanOnPush"})
    private RepositoryImageScanningConfiguration(@Nullable Boolean scanOnPush) {
        this.scanOnPush = scanOnPush;
    }

    public Optional<Boolean> getScanOnPush() {
        return Optional.ofNullable(this.scanOnPush);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(RepositoryImageScanningConfiguration defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Boolean scanOnPush;

        public Builder() {
    	      // Empty
        }

        public Builder(RepositoryImageScanningConfiguration defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.scanOnPush = defaults.scanOnPush;
        }

        public Builder setScanOnPush(@Nullable Boolean scanOnPush) {
            this.scanOnPush = scanOnPush;
            return this;
        }

        public RepositoryImageScanningConfiguration build() {
            return new RepositoryImageScanningConfiguration(scanOnPush);
        }
    }
}