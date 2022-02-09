// *** WARNING: this file was generated by test. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.example.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.internal.annotations.InputImport;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


public final class ConfigMapArgs extends io.pulumi.resources.ResourceArgs {

    public static final ConfigMapArgs Empty = new ConfigMapArgs();

    @InputImport(name="config")
    private final @Nullable Input<String> config;

    public Input<String> getConfig() {
        return this.config == null ? Input.empty() : this.config;
    }

    public ConfigMapArgs(@Nullable Input<String> config) {
        this.config = config;
    }

    private ConfigMapArgs() {
        this.config = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ConfigMapArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<String> config;

        public Builder() {
    	      // Empty
        }

        public Builder(ConfigMapArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.config = defaults.config;
        }

        public Builder setConfig(@Nullable Input<String> config) {
            this.config = config;
            return this;
        }

        public Builder setConfig(@Nullable String config) {
            this.config = Input.ofNullable(config);
            return this;
        }

        public ConfigMapArgs build() {
            return new ConfigMapArgs(config);
        }
    }
}
