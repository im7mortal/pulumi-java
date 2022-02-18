// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.nimblestudio.inputs;

import io.pulumi.awsnative.nimblestudio.enums.LaunchProfileStreamingSessionStorageMode;
import io.pulumi.awsnative.nimblestudio.inputs.LaunchProfileStreamingSessionStorageRootArgs;
import io.pulumi.core.Input;
import io.pulumi.core.internal.annotations.InputImport;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * <p>The configuration for a streaming session’s upload storage.</p>
 * 
 */
public final class LaunchProfileStreamConfigurationSessionStorageArgs extends io.pulumi.resources.ResourceArgs {

    public static final LaunchProfileStreamConfigurationSessionStorageArgs Empty = new LaunchProfileStreamConfigurationSessionStorageArgs();

    /**
     * <p>Allows artists to upload files to their workstations. The only valid option is
     *                 <code>UPLOAD</code>.</p>
     * 
     */
    @InputImport(name="mode")
    private final @Nullable Input<List<LaunchProfileStreamingSessionStorageMode>> mode;

    public Input<List<LaunchProfileStreamingSessionStorageMode>> getMode() {
        return this.mode == null ? Input.empty() : this.mode;
    }

    @InputImport(name="root")
    private final @Nullable Input<LaunchProfileStreamingSessionStorageRootArgs> root;

    public Input<LaunchProfileStreamingSessionStorageRootArgs> getRoot() {
        return this.root == null ? Input.empty() : this.root;
    }

    public LaunchProfileStreamConfigurationSessionStorageArgs(
        @Nullable Input<List<LaunchProfileStreamingSessionStorageMode>> mode,
        @Nullable Input<LaunchProfileStreamingSessionStorageRootArgs> root) {
        this.mode = mode;
        this.root = root;
    }

    private LaunchProfileStreamConfigurationSessionStorageArgs() {
        this.mode = Input.empty();
        this.root = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(LaunchProfileStreamConfigurationSessionStorageArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<List<LaunchProfileStreamingSessionStorageMode>> mode;
        private @Nullable Input<LaunchProfileStreamingSessionStorageRootArgs> root;

        public Builder() {
    	      // Empty
        }

        public Builder(LaunchProfileStreamConfigurationSessionStorageArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.mode = defaults.mode;
    	      this.root = defaults.root;
        }

        public Builder setMode(@Nullable Input<List<LaunchProfileStreamingSessionStorageMode>> mode) {
            this.mode = mode;
            return this;
        }

        public Builder setMode(@Nullable List<LaunchProfileStreamingSessionStorageMode> mode) {
            this.mode = Input.ofNullable(mode);
            return this;
        }

        public Builder setRoot(@Nullable Input<LaunchProfileStreamingSessionStorageRootArgs> root) {
            this.root = root;
            return this;
        }

        public Builder setRoot(@Nullable LaunchProfileStreamingSessionStorageRootArgs root) {
            this.root = Input.ofNullable(root);
            return this;
        }

        public LaunchProfileStreamConfigurationSessionStorageArgs build() {
            return new LaunchProfileStreamConfigurationSessionStorageArgs(mode, root);
        }
    }
}
