// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.compute.inputs;

import io.pulumi.azurenative.compute.enums.DiffDiskOptions;
import io.pulumi.azurenative.compute.enums.DiffDiskPlacement;
import io.pulumi.core.Either;
import io.pulumi.core.Input;
import io.pulumi.core.internal.annotations.InputImport;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


public final class DiffDiskSettingsArgs extends io.pulumi.resources.ResourceArgs {

    public static final DiffDiskSettingsArgs Empty = new DiffDiskSettingsArgs();

    @InputImport(name="option")
    private final @Nullable Input<Either<String,DiffDiskOptions>> option;

    public Input<Either<String,DiffDiskOptions>> getOption() {
        return this.option == null ? Input.empty() : this.option;
    }

    @InputImport(name="placement")
    private final @Nullable Input<Either<String,DiffDiskPlacement>> placement;

    public Input<Either<String,DiffDiskPlacement>> getPlacement() {
        return this.placement == null ? Input.empty() : this.placement;
    }

    public DiffDiskSettingsArgs(
        @Nullable Input<Either<String,DiffDiskOptions>> option,
        @Nullable Input<Either<String,DiffDiskPlacement>> placement) {
        this.option = option;
        this.placement = placement;
    }

    private DiffDiskSettingsArgs() {
        this.option = Input.empty();
        this.placement = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(DiffDiskSettingsArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<Either<String,DiffDiskOptions>> option;
        private @Nullable Input<Either<String,DiffDiskPlacement>> placement;

        public Builder() {
    	      // Empty
        }

        public Builder(DiffDiskSettingsArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.option = defaults.option;
    	      this.placement = defaults.placement;
        }

        public Builder setOption(@Nullable Input<Either<String,DiffDiskOptions>> option) {
            this.option = option;
            return this;
        }

        public Builder setOption(@Nullable Either<String,DiffDiskOptions> option) {
            this.option = Input.ofNullable(option);
            return this;
        }

        public Builder setPlacement(@Nullable Input<Either<String,DiffDiskPlacement>> placement) {
            this.placement = placement;
            return this;
        }

        public Builder setPlacement(@Nullable Either<String,DiffDiskPlacement> placement) {
            this.placement = Input.ofNullable(placement);
            return this;
        }

        public DiffDiskSettingsArgs build() {
            return new DiffDiskSettingsArgs(option, placement);
        }
    }
}