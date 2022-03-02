// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.cdn.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import java.lang.Integer;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class HttpErrorRangeParametersResponse {
    /**
     * The inclusive start of the http status code range.
     * 
     */
    private final @Nullable Integer begin;
    /**
     * The inclusive end of the http status code range.
     * 
     */
    private final @Nullable Integer end;

    @OutputCustomType.Constructor({"begin","end"})
    private HttpErrorRangeParametersResponse(
        @Nullable Integer begin,
        @Nullable Integer end) {
        this.begin = begin;
        this.end = end;
    }

    /**
     * The inclusive start of the http status code range.
     * 
    */
    public Optional<Integer> getBegin() {
        return Optional.ofNullable(this.begin);
    }
    /**
     * The inclusive end of the http status code range.
     * 
    */
    public Optional<Integer> getEnd() {
        return Optional.ofNullable(this.end);
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
