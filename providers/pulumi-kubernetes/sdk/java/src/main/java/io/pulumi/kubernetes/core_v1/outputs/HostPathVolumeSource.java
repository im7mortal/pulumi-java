// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.kubernetes.core_v1.outputs;

import io.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class HostPathVolumeSource {
    /**
     * Path of the directory on the host. If the path is a symlink, it will follow the link to the real path. More info: https://kubernetes.io/docs/concepts/storage/volumes#hostpath
     * 
     */
    private final String path;
    /**
     * Type for HostPath Volume Defaults to "" More info: https://kubernetes.io/docs/concepts/storage/volumes#hostpath
     * 
     */
    private final @Nullable String type;

    @CustomType.Constructor
    private HostPathVolumeSource(
        @CustomType.Parameter("path") String path,
        @CustomType.Parameter("type") @Nullable String type) {
        this.path = path;
        this.type = type;
    }

    /**
     * Path of the directory on the host. If the path is a symlink, it will follow the link to the real path. More info: https://kubernetes.io/docs/concepts/storage/volumes#hostpath
     * 
    */
    public String path() {
        return this.path;
    }
    /**
     * Type for HostPath Volume Defaults to "" More info: https://kubernetes.io/docs/concepts/storage/volumes#hostpath
     * 
    */
    public Optional<String> type() {
        return Optional.ofNullable(this.type);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(HostPathVolumeSource defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String path;
        private @Nullable String type;

        public Builder() {
    	      // Empty
        }

        public Builder(HostPathVolumeSource defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.path = defaults.path;
    	      this.type = defaults.type;
        }

        public Builder path(String path) {
            this.path = Objects.requireNonNull(path);
            return this;
        }
        public Builder type(@Nullable String type) {
            this.type = type;
            return this;
        }        public HostPathVolumeSource build() {
            return new HostPathVolumeSource(path, type);
        }
    }
}
