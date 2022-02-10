// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.datafactory.outputs;

import io.pulumi.core.internal.annotations.OutputCustomType;
import java.lang.Object;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class PolybaseSettingsResponse {
    private final @Nullable Object rejectSampleValue;
    private final @Nullable String rejectType;
    private final @Nullable Object rejectValue;
    private final @Nullable Object useTypeDefault;

    @OutputCustomType.Constructor({"rejectSampleValue","rejectType","rejectValue","useTypeDefault"})
    private PolybaseSettingsResponse(
        @Nullable Object rejectSampleValue,
        @Nullable String rejectType,
        @Nullable Object rejectValue,
        @Nullable Object useTypeDefault) {
        this.rejectSampleValue = rejectSampleValue;
        this.rejectType = rejectType;
        this.rejectValue = rejectValue;
        this.useTypeDefault = useTypeDefault;
    }

    public Optional<Object> getRejectSampleValue() {
        return Optional.ofNullable(this.rejectSampleValue);
    }
    public Optional<String> getRejectType() {
        return Optional.ofNullable(this.rejectType);
    }
    public Optional<Object> getRejectValue() {
        return Optional.ofNullable(this.rejectValue);
    }
    public Optional<Object> getUseTypeDefault() {
        return Optional.ofNullable(this.useTypeDefault);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(PolybaseSettingsResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Object rejectSampleValue;
        private @Nullable String rejectType;
        private @Nullable Object rejectValue;
        private @Nullable Object useTypeDefault;

        public Builder() {
    	      // Empty
        }

        public Builder(PolybaseSettingsResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.rejectSampleValue = defaults.rejectSampleValue;
    	      this.rejectType = defaults.rejectType;
    	      this.rejectValue = defaults.rejectValue;
    	      this.useTypeDefault = defaults.useTypeDefault;
        }

        public Builder setRejectSampleValue(@Nullable Object rejectSampleValue) {
            this.rejectSampleValue = rejectSampleValue;
            return this;
        }

        public Builder setRejectType(@Nullable String rejectType) {
            this.rejectType = rejectType;
            return this;
        }

        public Builder setRejectValue(@Nullable Object rejectValue) {
            this.rejectValue = rejectValue;
            return this;
        }

        public Builder setUseTypeDefault(@Nullable Object useTypeDefault) {
            this.useTypeDefault = useTypeDefault;
            return this;
        }

        public PolybaseSettingsResponse build() {
            return new PolybaseSettingsResponse(rejectSampleValue, rejectType, rejectValue, useTypeDefault);
        }
    }
}