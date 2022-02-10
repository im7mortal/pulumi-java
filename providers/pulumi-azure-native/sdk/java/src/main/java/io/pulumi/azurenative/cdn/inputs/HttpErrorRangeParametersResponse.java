// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.cdn.inputs;

import io.pulumi.core.internal.annotations.InputImport;
import java.lang.Integer;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class HttpErrorRangeParametersResponse extends io.pulumi.resources.InvokeArgs {

    public static final HttpErrorRangeParametersResponse Empty = new HttpErrorRangeParametersResponse();

    @InputImport(name="begin")
    private final @Nullable Integer begin;

    public Optional<Integer> getBegin() {
        return this.begin == null ? Optional.empty() : Optional.ofNullable(this.begin);
    }

    @InputImport(name="end")
    private final @Nullable Integer end;

    public Optional<Integer> getEnd() {
        return this.end == null ? Optional.empty() : Optional.ofNullable(this.end);
    }

    public HttpErrorRangeParametersResponse(
        @Nullable Integer begin,
        @Nullable Integer end) {
        this.begin = begin;
        this.end = end;
    }

    private HttpErrorRangeParametersResponse() {
        this.begin = null;
        this.end = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(HttpErrorRangeParametersResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Integer begin;
        private @Nullable Integer end;

        public Builder() {
    	      // Empty
        }

        public Builder(HttpErrorRangeParametersResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.begin = defaults.begin;
    	      this.end = defaults.end;
        }

        public Builder setBegin(@Nullable Integer begin) {
            this.begin = begin;
            return this;
        }

        public Builder setEnd(@Nullable Integer end) {
            this.end = end;
            return this;
        }

        public HttpErrorRangeParametersResponse build() {
            return new HttpErrorRangeParametersResponse(begin, end);
        }
    }
}