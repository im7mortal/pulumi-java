// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.cognitiveservices.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class DeploymentModelResponse {
    /**
     * Deployment model format.
     * 
     */
    private final @Nullable String format;
    /**
     * Deployment model name.
     * 
     */
    private final @Nullable String name;
    /**
     * Deployment model version.
     * 
     */
    private final @Nullable String version;

    @OutputCustomType.Constructor({"format","name","version"})
    private DeploymentModelResponse(
        @Nullable String format,
        @Nullable String name,
        @Nullable String version) {
        this.format = format;
        this.name = name;
        this.version = version;
    }

    /**
     * Deployment model format.
     * 
    */
    public Optional<String> getFormat() {
        return Optional.ofNullable(this.format);
    }
    /**
     * Deployment model name.
     * 
    */
    public Optional<String> getName() {
        return Optional.ofNullable(this.name);
    }
    /**
     * Deployment model version.
     * 
    */
    public Optional<String> getVersion() {
        return Optional.ofNullable(this.version);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(DeploymentModelResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String format;
        private @Nullable String name;
        private @Nullable String version;

        public Builder() {
    	      // Empty
        }

        public Builder(DeploymentModelResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.format = defaults.format;
    	      this.name = defaults.name;
    	      this.version = defaults.version;
        }

        public Builder setFormat(@Nullable String format) {
            this.format = format;
            return this;
        }

        public Builder setName(@Nullable String name) {
            this.name = name;
            return this;
        }

        public Builder setVersion(@Nullable String version) {
            this.version = version;
            return this;
        }
        public DeploymentModelResponse build() {
            return new DeploymentModelResponse(format, name, version);
        }
    }
}
