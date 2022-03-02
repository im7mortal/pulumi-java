// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.batch.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class NFSMountConfigurationResponse {
    /**
     * These are 'net use' options in Windows and 'mount' options in Linux.
     * 
     */
    private final @Nullable String mountOptions;
    /**
     * All file systems are mounted relative to the Batch mounts directory, accessible via the AZ_BATCH_NODE_MOUNTS_DIR environment variable.
     * 
     */
    private final String relativeMountPath;
    private final String source;

    @OutputCustomType.Constructor({"mountOptions","relativeMountPath","source"})
    private NFSMountConfigurationResponse(
        @Nullable String mountOptions,
        String relativeMountPath,
        String source) {
        this.mountOptions = mountOptions;
        this.relativeMountPath = Objects.requireNonNull(relativeMountPath);
        this.source = Objects.requireNonNull(source);
    }

    /**
     * These are 'net use' options in Windows and 'mount' options in Linux.
     * 
    */
    public Optional<String> getMountOptions() {
        return Optional.ofNullable(this.mountOptions);
    }
    /**
     * All file systems are mounted relative to the Batch mounts directory, accessible via the AZ_BATCH_NODE_MOUNTS_DIR environment variable.
     * 
    */
    public String getRelativeMountPath() {
        return this.relativeMountPath;
    }
    public String getSource() {
        return this.source;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(NFSMountConfigurationResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String mountOptions;
        private String relativeMountPath;
        private String source;

        public Builder() {
    	      // Empty
        }

        public Builder(NFSMountConfigurationResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.mountOptions = defaults.mountOptions;
    	      this.relativeMountPath = defaults.relativeMountPath;
    	      this.source = defaults.source;
        }

        public Builder setMountOptions(@Nullable String mountOptions) {
            this.mountOptions = mountOptions;
            return this;
        }

        public Builder setRelativeMountPath(String relativeMountPath) {
            this.relativeMountPath = Objects.requireNonNull(relativeMountPath);
            return this;
        }

        public Builder setSource(String source) {
            this.source = Objects.requireNonNull(source);
            return this;
        }
        public NFSMountConfigurationResponse build() {
            return new NFSMountConfigurationResponse(mountOptions, relativeMountPath, source);
        }
    }
}
