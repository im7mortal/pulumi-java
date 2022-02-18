// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.kubernetes.core_v1.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import io.pulumi.kubernetes.core_v1.inputs.DownwardAPIVolumeFileArgs;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * Represents downward API info for projecting into a projected volume. Note that this is identical to a downwardAPI volume source without the default mode.
 * 
 */
public final class DownwardAPIProjectionArgs extends io.pulumi.resources.ResourceArgs {

    public static final DownwardAPIProjectionArgs Empty = new DownwardAPIProjectionArgs();

    /**
     * Items is a list of DownwardAPIVolume file
     * 
     */
    @InputImport(name="items")
    private final @Nullable Input<List<DownwardAPIVolumeFileArgs>> items;

    public Input<List<DownwardAPIVolumeFileArgs>> getItems() {
        return this.items == null ? Input.empty() : this.items;
    }

    public DownwardAPIProjectionArgs(@Nullable Input<List<DownwardAPIVolumeFileArgs>> items) {
        this.items = items;
    }

    private DownwardAPIProjectionArgs() {
        this.items = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(DownwardAPIProjectionArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<List<DownwardAPIVolumeFileArgs>> items;

        public Builder() {
    	      // Empty
        }

        public Builder(DownwardAPIProjectionArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.items = defaults.items;
        }

        public Builder setItems(@Nullable Input<List<DownwardAPIVolumeFileArgs>> items) {
            this.items = items;
            return this;
        }

        public Builder setItems(@Nullable List<DownwardAPIVolumeFileArgs> items) {
            this.items = Input.ofNullable(items);
            return this;
        }

        public DownwardAPIProjectionArgs build() {
            return new DownwardAPIProjectionArgs(items);
        }
    }
}
