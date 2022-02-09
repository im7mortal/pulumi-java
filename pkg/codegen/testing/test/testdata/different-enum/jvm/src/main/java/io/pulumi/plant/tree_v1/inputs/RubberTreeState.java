// *** WARNING: this file was generated by test. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.plant.tree_v1.inputs;

import io.pulumi.core.Either;
import io.pulumi.core.Input;
import io.pulumi.core.internal.annotations.InputImport;
import io.pulumi.plant.tree_v1.enums.Farm;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


public final class RubberTreeState extends io.pulumi.resources.ResourceArgs {

    public static final RubberTreeState Empty = new RubberTreeState();

    @InputImport(name="farm")
    private final @Nullable Input<Either<Farm,String>> farm;

    public Input<Either<Farm,String>> getFarm() {
        return this.farm == null ? Input.empty() : this.farm;
    }

    public RubberTreeState(@Nullable Input<Either<Farm,String>> farm) {
        this.farm = farm == null ? Input.ofRight("(unknown)") : farm;
    }

    private RubberTreeState() {
        this.farm = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(RubberTreeState defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<Either<Farm,String>> farm;

        public Builder() {
    	      // Empty
        }

        public Builder(RubberTreeState defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.farm = defaults.farm;
        }

        public Builder setFarm(@Nullable Input<Either<Farm,String>> farm) {
            this.farm = farm;
            return this;
        }

        public Builder setFarm(@Nullable Either<Farm,String> farm) {
            this.farm = Input.ofNullable(farm);
            return this;
        }

        public RubberTreeState build() {
            return new RubberTreeState(farm);
        }
    }
}
