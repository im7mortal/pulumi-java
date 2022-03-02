// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.cloudsearch.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class DomainScalingParameters {
    /**
     * The instance type that you want to preconfigure for your domain. See the [AWS documentation](https://docs.aws.amazon.com/cloudsearch/latest/developerguide/API_ScalingParameters.html) for valid values.
     * 
     */
    private final @Nullable String desiredInstanceType;
    /**
     * The number of partitions you want to preconfigure for your domain. Only valid when you select `search.2xlarge` as the instance type.
     * 
     */
    private final @Nullable Integer desiredPartitionCount;
    /**
     * The number of replicas you want to preconfigure for each index partition.
     * 
     */
    private final @Nullable Integer desiredReplicationCount;

    @OutputCustomType.Constructor({"desiredInstanceType","desiredPartitionCount","desiredReplicationCount"})
    private DomainScalingParameters(
        @Nullable String desiredInstanceType,
        @Nullable Integer desiredPartitionCount,
        @Nullable Integer desiredReplicationCount) {
        this.desiredInstanceType = desiredInstanceType;
        this.desiredPartitionCount = desiredPartitionCount;
        this.desiredReplicationCount = desiredReplicationCount;
    }

    /**
     * The instance type that you want to preconfigure for your domain. See the [AWS documentation](https://docs.aws.amazon.com/cloudsearch/latest/developerguide/API_ScalingParameters.html) for valid values.
     * 
    */
    public Optional<String> getDesiredInstanceType() {
        return Optional.ofNullable(this.desiredInstanceType);
    }
    /**
     * The number of partitions you want to preconfigure for your domain. Only valid when you select `search.2xlarge` as the instance type.
     * 
    */
    public Optional<Integer> getDesiredPartitionCount() {
        return Optional.ofNullable(this.desiredPartitionCount);
    }
    /**
     * The number of replicas you want to preconfigure for each index partition.
     * 
    */
    public Optional<Integer> getDesiredReplicationCount() {
        return Optional.ofNullable(this.desiredReplicationCount);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(DomainScalingParameters defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String desiredInstanceType;
        private @Nullable Integer desiredPartitionCount;
        private @Nullable Integer desiredReplicationCount;

        public Builder() {
    	      // Empty
        }

        public Builder(DomainScalingParameters defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.desiredInstanceType = defaults.desiredInstanceType;
    	      this.desiredPartitionCount = defaults.desiredPartitionCount;
    	      this.desiredReplicationCount = defaults.desiredReplicationCount;
        }

        public Builder setDesiredInstanceType(@Nullable String desiredInstanceType) {
            this.desiredInstanceType = desiredInstanceType;
            return this;
        }

        public Builder setDesiredPartitionCount(@Nullable Integer desiredPartitionCount) {
            this.desiredPartitionCount = desiredPartitionCount;
            return this;
        }

        public Builder setDesiredReplicationCount(@Nullable Integer desiredReplicationCount) {
            this.desiredReplicationCount = desiredReplicationCount;
            return this;
        }
        public DomainScalingParameters build() {
            return new DomainScalingParameters(desiredInstanceType, desiredPartitionCount, desiredReplicationCount);
        }
    }
}
