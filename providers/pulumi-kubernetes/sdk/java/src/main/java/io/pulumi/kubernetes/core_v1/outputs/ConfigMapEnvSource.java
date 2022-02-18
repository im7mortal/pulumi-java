// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.kubernetes.core_v1.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import java.lang.Boolean;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class ConfigMapEnvSource {
    /**
     * Name of the referent. More info: https://kubernetes.io/docs/concepts/overview/working-with-objects/names/#names
     * 
     */
    private final @Nullable String name;
    /**
     * Specify whether the ConfigMap must be defined
     * 
     */
    private final @Nullable Boolean optional;

    @OutputCustomType.Constructor({"name","optional"})
    private ConfigMapEnvSource(
        @Nullable String name,
        @Nullable Boolean optional) {
        this.name = name;
        this.optional = optional;
    }

    /**
     * Name of the referent. More info: https://kubernetes.io/docs/concepts/overview/working-with-objects/names/#names
     * 
     */
    public Optional<String> getName() {
        return Optional.ofNullable(this.name);
    }
    /**
     * Specify whether the ConfigMap must be defined
     * 
     */
    public Optional<Boolean> getOptional() {
        return Optional.ofNullable(this.optional);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ConfigMapEnvSource defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String name;
        private @Nullable Boolean optional;

        public Builder() {
    	      // Empty
        }

        public Builder(ConfigMapEnvSource defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.name = defaults.name;
    	      this.optional = defaults.optional;
        }

        public Builder setName(@Nullable String name) {
            this.name = name;
            return this;
        }

        public Builder setOptional(@Nullable Boolean optional) {
            this.optional = optional;
            return this;
        }

        public ConfigMapEnvSource build() {
            return new ConfigMapEnvSource(name, optional);
        }
    }
}
