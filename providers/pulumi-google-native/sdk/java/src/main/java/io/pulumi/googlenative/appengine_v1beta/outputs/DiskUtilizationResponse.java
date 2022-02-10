// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.appengine_v1beta.outputs;

import io.pulumi.core.internal.annotations.OutputCustomType;
import java.lang.Integer;
import java.util.Objects;

@OutputCustomType
public final class DiskUtilizationResponse {
    private final Integer targetReadBytesPerSecond;
    private final Integer targetReadOpsPerSecond;
    private final Integer targetWriteBytesPerSecond;
    private final Integer targetWriteOpsPerSecond;

    @OutputCustomType.Constructor({"targetReadBytesPerSecond","targetReadOpsPerSecond","targetWriteBytesPerSecond","targetWriteOpsPerSecond"})
    private DiskUtilizationResponse(
        Integer targetReadBytesPerSecond,
        Integer targetReadOpsPerSecond,
        Integer targetWriteBytesPerSecond,
        Integer targetWriteOpsPerSecond) {
        this.targetReadBytesPerSecond = Objects.requireNonNull(targetReadBytesPerSecond);
        this.targetReadOpsPerSecond = Objects.requireNonNull(targetReadOpsPerSecond);
        this.targetWriteBytesPerSecond = Objects.requireNonNull(targetWriteBytesPerSecond);
        this.targetWriteOpsPerSecond = Objects.requireNonNull(targetWriteOpsPerSecond);
    }

    public Integer getTargetReadBytesPerSecond() {
        return this.targetReadBytesPerSecond;
    }
    public Integer getTargetReadOpsPerSecond() {
        return this.targetReadOpsPerSecond;
    }
    public Integer getTargetWriteBytesPerSecond() {
        return this.targetWriteBytesPerSecond;
    }
    public Integer getTargetWriteOpsPerSecond() {
        return this.targetWriteOpsPerSecond;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(DiskUtilizationResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Integer targetReadBytesPerSecond;
        private Integer targetReadOpsPerSecond;
        private Integer targetWriteBytesPerSecond;
        private Integer targetWriteOpsPerSecond;

        public Builder() {
    	      // Empty
        }

        public Builder(DiskUtilizationResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.targetReadBytesPerSecond = defaults.targetReadBytesPerSecond;
    	      this.targetReadOpsPerSecond = defaults.targetReadOpsPerSecond;
    	      this.targetWriteBytesPerSecond = defaults.targetWriteBytesPerSecond;
    	      this.targetWriteOpsPerSecond = defaults.targetWriteOpsPerSecond;
        }

        public Builder setTargetReadBytesPerSecond(Integer targetReadBytesPerSecond) {
            this.targetReadBytesPerSecond = Objects.requireNonNull(targetReadBytesPerSecond);
            return this;
        }

        public Builder setTargetReadOpsPerSecond(Integer targetReadOpsPerSecond) {
            this.targetReadOpsPerSecond = Objects.requireNonNull(targetReadOpsPerSecond);
            return this;
        }

        public Builder setTargetWriteBytesPerSecond(Integer targetWriteBytesPerSecond) {
            this.targetWriteBytesPerSecond = Objects.requireNonNull(targetWriteBytesPerSecond);
            return this;
        }

        public Builder setTargetWriteOpsPerSecond(Integer targetWriteOpsPerSecond) {
            this.targetWriteOpsPerSecond = Objects.requireNonNull(targetWriteOpsPerSecond);
            return this;
        }

        public DiskUtilizationResponse build() {
            return new DiskUtilizationResponse(targetReadBytesPerSecond, targetReadOpsPerSecond, targetWriteBytesPerSecond, targetWriteOpsPerSecond);
        }
    }
}