// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.cloudfunctions_v1.outputs;

import io.pulumi.core.internal.annotations.OutputCustomType;
import java.lang.String;
import java.util.Objects;

@OutputCustomType
public final class SecretVersionResponse {
    private final String path;
    private final String version;

    @OutputCustomType.Constructor({"path","version"})
    private SecretVersionResponse(
        String path,
        String version) {
        this.path = Objects.requireNonNull(path);
        this.version = Objects.requireNonNull(version);
    }

    public String getPath() {
        return this.path;
    }
    public String getVersion() {
        return this.version;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(SecretVersionResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String path;
        private String version;

        public Builder() {
    	      // Empty
        }

        public Builder(SecretVersionResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.path = defaults.path;
    	      this.version = defaults.version;
        }

        public Builder setPath(String path) {
            this.path = Objects.requireNonNull(path);
            return this;
        }

        public Builder setVersion(String version) {
            this.version = Objects.requireNonNull(version);
            return this;
        }

        public SecretVersionResponse build() {
            return new SecretVersionResponse(path, version);
        }
    }
}