// *** WARNING: this file was generated by test. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.plant.tree_v1;

import io.pulumi.core.Input;
import io.pulumi.core.internal.annotations.InputImport;
import io.pulumi.plant.tree_v1.enums.RubberTreeVariety;
import io.pulumi.plant.tree_v1.enums.TreeSize;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import javax.annotation.Nullable;


public final class NurseryArgs extends io.pulumi.resources.ResourceArgs {

    public static final NurseryArgs Empty = new NurseryArgs();

    /**
     * The sizes of trees available
     * 
     */
    @InputImport(name="sizes")
    private final @Nullable Input<Map<String,TreeSize>> sizes;

    public Input<Map<String,TreeSize>> getSizes() {
        return this.sizes == null ? Input.empty() : this.sizes;
    }

    /**
     * The varieties available
     * 
     */
    @InputImport(name="varieties", required=true)
    private final Input<List<RubberTreeVariety>> varieties;

    public Input<List<RubberTreeVariety>> getVarieties() {
        return this.varieties;
    }

    public NurseryArgs(
        @Nullable Input<Map<String,TreeSize>> sizes,
        Input<List<RubberTreeVariety>> varieties) {
        this.sizes = sizes;
        this.varieties = Objects.requireNonNull(varieties, "expected parameter 'varieties' to be non-null");
    }

    private NurseryArgs() {
        this.sizes = Input.empty();
        this.varieties = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(NurseryArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<Map<String,TreeSize>> sizes;
        private Input<List<RubberTreeVariety>> varieties;

        public Builder() {
    	      // Empty
        }

        public Builder(NurseryArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.sizes = defaults.sizes;
    	      this.varieties = defaults.varieties;
        }

        public Builder setSizes(@Nullable Input<Map<String,TreeSize>> sizes) {
            this.sizes = sizes;
            return this;
        }

        public Builder setSizes(@Nullable Map<String,TreeSize> sizes) {
            this.sizes = Input.ofNullable(sizes);
            return this;
        }

        public Builder setVarieties(Input<List<RubberTreeVariety>> varieties) {
            this.varieties = Objects.requireNonNull(varieties);
            return this;
        }

        public Builder setVarieties(List<RubberTreeVariety> varieties) {
            this.varieties = Input.of(Objects.requireNonNull(varieties));
            return this;
        }

        public NurseryArgs build() {
            return new NurseryArgs(sizes, varieties);
        }
    }
}
