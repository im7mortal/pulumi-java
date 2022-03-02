// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.testing_v1.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import io.pulumi.googlenative.testing_v1.outputs.TestTargetsForShardResponse;
import java.util.List;
import java.util.Objects;

@OutputCustomType
public final class ManualShardingResponse {
    /**
     * Group of packages, classes, and/or test methods to be run for each shard. When any physical devices are selected, the number of test_targets_for_shard must be >= 1 and <= 50. When no physical devices are selected, the number must be >= 1 and <= 500.
     * 
     */
    private final List<TestTargetsForShardResponse> testTargetsForShard;

    @OutputCustomType.Constructor({"testTargetsForShard"})
    private ManualShardingResponse(List<TestTargetsForShardResponse> testTargetsForShard) {
        this.testTargetsForShard = Objects.requireNonNull(testTargetsForShard);
    }

    /**
     * Group of packages, classes, and/or test methods to be run for each shard. When any physical devices are selected, the number of test_targets_for_shard must be >= 1 and <= 50. When no physical devices are selected, the number must be >= 1 and <= 500.
     * 
    */
    public List<TestTargetsForShardResponse> getTestTargetsForShard() {
        return this.testTargetsForShard;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ManualShardingResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private List<TestTargetsForShardResponse> testTargetsForShard;

        public Builder() {
    	      // Empty
        }

        public Builder(ManualShardingResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.testTargetsForShard = defaults.testTargetsForShard;
        }

        public Builder setTestTargetsForShard(List<TestTargetsForShardResponse> testTargetsForShard) {
            this.testTargetsForShard = Objects.requireNonNull(testTargetsForShard);
            return this;
        }
        public ManualShardingResponse build() {
            return new ManualShardingResponse(testTargetsForShard);
        }
    }
}
