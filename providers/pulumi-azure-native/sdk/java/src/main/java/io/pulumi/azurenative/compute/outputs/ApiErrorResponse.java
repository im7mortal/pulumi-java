// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.compute.outputs;

import io.pulumi.azurenative.compute.outputs.ApiErrorBaseResponse;
import io.pulumi.azurenative.compute.outputs.InnerErrorResponse;
import io.pulumi.core.internal.annotations.OutputCustomType;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class ApiErrorResponse {
    private final @Nullable String code;
    private final @Nullable List<ApiErrorBaseResponse> details;
    private final @Nullable InnerErrorResponse innererror;
    private final @Nullable String message;
    private final @Nullable String target;

    @OutputCustomType.Constructor({"code","details","innererror","message","target"})
    private ApiErrorResponse(
        @Nullable String code,
        @Nullable List<ApiErrorBaseResponse> details,
        @Nullable InnerErrorResponse innererror,
        @Nullable String message,
        @Nullable String target) {
        this.code = code;
        this.details = details;
        this.innererror = innererror;
        this.message = message;
        this.target = target;
    }

    public Optional<String> getCode() {
        return Optional.ofNullable(this.code);
    }
    public List<ApiErrorBaseResponse> getDetails() {
        return this.details == null ? List.of() : this.details;
    }
    public Optional<InnerErrorResponse> getInnererror() {
        return Optional.ofNullable(this.innererror);
    }
    public Optional<String> getMessage() {
        return Optional.ofNullable(this.message);
    }
    public Optional<String> getTarget() {
        return Optional.ofNullable(this.target);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ApiErrorResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String code;
        private @Nullable List<ApiErrorBaseResponse> details;
        private @Nullable InnerErrorResponse innererror;
        private @Nullable String message;
        private @Nullable String target;

        public Builder() {
    	      // Empty
        }

        public Builder(ApiErrorResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.code = defaults.code;
    	      this.details = defaults.details;
    	      this.innererror = defaults.innererror;
    	      this.message = defaults.message;
    	      this.target = defaults.target;
        }

        public Builder setCode(@Nullable String code) {
            this.code = code;
            return this;
        }

        public Builder setDetails(@Nullable List<ApiErrorBaseResponse> details) {
            this.details = details;
            return this;
        }

        public Builder setInnererror(@Nullable InnerErrorResponse innererror) {
            this.innererror = innererror;
            return this;
        }

        public Builder setMessage(@Nullable String message) {
            this.message = message;
            return this;
        }

        public Builder setTarget(@Nullable String target) {
            this.target = target;
            return this;
        }

        public ApiErrorResponse build() {
            return new ApiErrorResponse(code, details, innererror, message, target);
        }
    }
}