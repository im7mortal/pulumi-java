// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.kubernetes.apps_v1beta1.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.Integer;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * RollingUpdateStatefulSetStrategy is used to communicate parameter for RollingUpdateStatefulSetStrategyType.
 * 
 */
public final class RollingUpdateStatefulSetStrategyArgs extends io.pulumi.resources.ResourceArgs {

    public static final RollingUpdateStatefulSetStrategyArgs Empty = new RollingUpdateStatefulSetStrategyArgs();

    /**
     * Partition indicates the ordinal at which the StatefulSet should be partitioned.
     * 
     */
    @InputImport(name="partition")
    private final @Nullable Input<Integer> partition;

    public Input<Integer> getPartition() {
        return this.partition == null ? Input.empty() : this.partition;
    }

    public RollingUpdateStatefulSetStrategyArgs(@Nullable Input<Integer> partition) {
        this.partition = partition;
    }

    private RollingUpdateStatefulSetStrategyArgs() {
        this.partition = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(RollingUpdateStatefulSetStrategyArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<Integer> partition;

        public Builder() {
    	      // Empty
        }

        public Builder(RollingUpdateStatefulSetStrategyArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.partition = defaults.partition;
        }

        public Builder setPartition(@Nullable Input<Integer> partition) {
            this.partition = partition;
            return this;
        }

        public Builder setPartition(@Nullable Integer partition) {
            this.partition = Input.ofNullable(partition);
            return this;
        }

        public RollingUpdateStatefulSetStrategyArgs build() {
            return new RollingUpdateStatefulSetStrategyArgs(partition);
        }
    }
}
