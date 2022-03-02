// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.appmesh.outputs;

import io.pulumi.aws.appmesh.outputs.RouteSpecHttp2RouteMatchHeaderMatchRange;
import io.pulumi.core.annotations.OutputCustomType;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class RouteSpecHttp2RouteMatchHeaderMatch {
    /**
     * The value sent by the client must match the specified value exactly. Must be between 1 and 255 characters in length.
     * 
     */
    private final @Nullable String exact;
    /**
     * The value sent by the client must begin with the specified characters. Must be between 1 and 255 characters in length.
     * This parameter must always start with /, which by itself matches all requests to the virtual router service name.
     * 
     */
    private final @Nullable String prefix;
    /**
     * The object that specifies the range of numbers that the value sent by the client must be included in.
     * 
     */
    private final @Nullable RouteSpecHttp2RouteMatchHeaderMatchRange range;
    /**
     * The value sent by the client must include the specified characters. Must be between 1 and 255 characters in length.
     * 
     */
    private final @Nullable String regex;
    /**
     * The value sent by the client must end with the specified characters. Must be between 1 and 255 characters in length.
     * 
     */
    private final @Nullable String suffix;

    @OutputCustomType.Constructor({"exact","prefix","range","regex","suffix"})
    private RouteSpecHttp2RouteMatchHeaderMatch(
        @Nullable String exact,
        @Nullable String prefix,
        @Nullable RouteSpecHttp2RouteMatchHeaderMatchRange range,
        @Nullable String regex,
        @Nullable String suffix) {
        this.exact = exact;
        this.prefix = prefix;
        this.range = range;
        this.regex = regex;
        this.suffix = suffix;
    }

    /**
     * The value sent by the client must match the specified value exactly. Must be between 1 and 255 characters in length.
     * 
    */
    public Optional<String> getExact() {
        return Optional.ofNullable(this.exact);
    }
    /**
     * The value sent by the client must begin with the specified characters. Must be between 1 and 255 characters in length.
     * This parameter must always start with /, which by itself matches all requests to the virtual router service name.
     * 
    */
    public Optional<String> getPrefix() {
        return Optional.ofNullable(this.prefix);
    }
    /**
     * The object that specifies the range of numbers that the value sent by the client must be included in.
     * 
    */
    public Optional<RouteSpecHttp2RouteMatchHeaderMatchRange> getRange() {
        return Optional.ofNullable(this.range);
    }
    /**
     * The value sent by the client must include the specified characters. Must be between 1 and 255 characters in length.
     * 
    */
    public Optional<String> getRegex() {
        return Optional.ofNullable(this.regex);
    }
    /**
     * The value sent by the client must end with the specified characters. Must be between 1 and 255 characters in length.
     * 
    */
    public Optional<String> getSuffix() {
        return Optional.ofNullable(this.suffix);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(RouteSpecHttp2RouteMatchHeaderMatch defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String exact;
        private @Nullable String prefix;
        private @Nullable RouteSpecHttp2RouteMatchHeaderMatchRange range;
        private @Nullable String regex;
        private @Nullable String suffix;

        public Builder() {
    	      // Empty
        }

        public Builder(RouteSpecHttp2RouteMatchHeaderMatch defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.exact = defaults.exact;
    	      this.prefix = defaults.prefix;
    	      this.range = defaults.range;
    	      this.regex = defaults.regex;
    	      this.suffix = defaults.suffix;
        }

        public Builder setExact(@Nullable String exact) {
            this.exact = exact;
            return this;
        }

        public Builder setPrefix(@Nullable String prefix) {
            this.prefix = prefix;
            return this;
        }

        public Builder setRange(@Nullable RouteSpecHttp2RouteMatchHeaderMatchRange range) {
            this.range = range;
            return this;
        }

        public Builder setRegex(@Nullable String regex) {
            this.regex = regex;
            return this;
        }

        public Builder setSuffix(@Nullable String suffix) {
            this.suffix = suffix;
            return this;
        }
        public RouteSpecHttp2RouteMatchHeaderMatch build() {
            return new RouteSpecHttp2RouteMatchHeaderMatch(exact, prefix, range, regex, suffix);
        }
    }
}
