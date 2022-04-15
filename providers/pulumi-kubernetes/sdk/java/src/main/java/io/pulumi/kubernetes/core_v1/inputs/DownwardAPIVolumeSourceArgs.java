// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.kubernetes.core_v1.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import io.pulumi.core.internal.Codegen;
import io.pulumi.kubernetes.core_v1.inputs.DownwardAPIVolumeFileArgs;
import java.lang.Integer;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * DownwardAPIVolumeSource represents a volume containing downward API info. Downward API volumes support ownership management and SELinux relabeling.
 * 
 */
public final class DownwardAPIVolumeSourceArgs extends io.pulumi.resources.ResourceArgs {

    public static final DownwardAPIVolumeSourceArgs Empty = new DownwardAPIVolumeSourceArgs();

    /**
     * Optional: mode bits to use on created files by default. Must be a Optional: mode bits used to set permissions on created files by default. Must be an octal value between 0000 and 0777 or a decimal value between 0 and 511. YAML accepts both octal and decimal values, JSON requires decimal values for mode bits. Defaults to 0644. Directories within the path are not affected by this setting. This might be in conflict with other options that affect the file mode, like fsGroup, and the result can be other mode bits set.
     * 
     */
    @Import(name="defaultMode")
      private final @Nullable Output<Integer> defaultMode;

    public Output<Integer> defaultMode() {
        return this.defaultMode == null ? Codegen.empty() : this.defaultMode;
    }

    /**
     * Items is a list of downward API volume file
     * 
     */
    @Import(name="items")
      private final @Nullable Output<List<DownwardAPIVolumeFileArgs>> items;

    public Output<List<DownwardAPIVolumeFileArgs>> items() {
        return this.items == null ? Codegen.empty() : this.items;
    }

    public DownwardAPIVolumeSourceArgs(
        @Nullable Output<Integer> defaultMode,
        @Nullable Output<List<DownwardAPIVolumeFileArgs>> items) {
        this.defaultMode = defaultMode;
        this.items = items;
    }

    private DownwardAPIVolumeSourceArgs() {
        this.defaultMode = Codegen.empty();
        this.items = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(DownwardAPIVolumeSourceArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<Integer> defaultMode;
        private @Nullable Output<List<DownwardAPIVolumeFileArgs>> items;

        public Builder() {
    	      // Empty
        }

        public Builder(DownwardAPIVolumeSourceArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.defaultMode = defaults.defaultMode;
    	      this.items = defaults.items;
        }

        public Builder defaultMode(@Nullable Output<Integer> defaultMode) {
            this.defaultMode = defaultMode;
            return this;
        }
        public Builder defaultMode(@Nullable Integer defaultMode) {
            this.defaultMode = Codegen.ofNullable(defaultMode);
            return this;
        }
        public Builder items(@Nullable Output<List<DownwardAPIVolumeFileArgs>> items) {
            this.items = items;
            return this;
        }
        public Builder items(@Nullable List<DownwardAPIVolumeFileArgs> items) {
            this.items = Codegen.ofNullable(items);
            return this;
        }
        public Builder items(DownwardAPIVolumeFileArgs... items) {
            return items(List.of(items));
        }        public DownwardAPIVolumeSourceArgs build() {
            return new DownwardAPIVolumeSourceArgs(defaultMode, items);
        }
    }
}
