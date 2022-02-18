// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.gkehub.outputs;

import io.pulumi.core.internal.annotations.OutputCustomType;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class FeatureStateState {
    private final @Nullable String code;
    private final @Nullable String description;
    private final @Nullable String updateTime;

    @OutputCustomType.Constructor({"code","description","updateTime"})
    private FeatureStateState(
        @Nullable String code,
        @Nullable String description,
        @Nullable String updateTime) {
        this.code = code;
        this.description = description;
        this.updateTime = updateTime;
    }

    public Optional<String> getCode() {
        return Optional.ofNullable(this.code);
    }
    public Optional<String> getDescription() {
        return Optional.ofNullable(this.description);
    }
    public Optional<String> getUpdateTime() {
        return Optional.ofNullable(this.updateTime);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(FeatureStateState defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String code;
        private @Nullable String description;
        private @Nullable String updateTime;

        public Builder() {
    	      // Empty
        }

        public Builder(FeatureStateState defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.code = defaults.code;
    	      this.description = defaults.description;
    	      this.updateTime = defaults.updateTime;
        }

        public Builder setCode(@Nullable String code) {
            this.code = code;
            return this;
        }

        public Builder setDescription(@Nullable String description) {
            this.description = description;
            return this;
        }

        public Builder setUpdateTime(@Nullable String updateTime) {
            this.updateTime = updateTime;
            return this;
        }

        public FeatureStateState build() {
            return new FeatureStateState(code, description, updateTime);
        }
    }
}