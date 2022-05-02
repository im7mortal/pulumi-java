// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.networkservices_v1beta1.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.Integer;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * Represents an integer value range.
 * 
 */
public final class HttpRouteHeaderMatchIntegerRangeArgs extends com.pulumi.resources.ResourceArgs {

    public static final HttpRouteHeaderMatchIntegerRangeArgs Empty = new HttpRouteHeaderMatchIntegerRangeArgs();

    /**
     * End of the range (exclusive)
     * 
     */
    @Import(name="end")
    private @Nullable Output<Integer> end;

    /**
     * @return End of the range (exclusive)
     * 
     */
    public Optional<Output<Integer>> end() {
        return Optional.ofNullable(this.end);
    }

    /**
     * Start of the range (inclusive)
     * 
     */
    @Import(name="start")
    private @Nullable Output<Integer> start;

    /**
     * @return Start of the range (inclusive)
     * 
     */
    public Optional<Output<Integer>> start() {
        return Optional.ofNullable(this.start);
    }

    private HttpRouteHeaderMatchIntegerRangeArgs() {}

    private HttpRouteHeaderMatchIntegerRangeArgs(HttpRouteHeaderMatchIntegerRangeArgs $) {
        this.end = $.end;
        this.start = $.start;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(HttpRouteHeaderMatchIntegerRangeArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private HttpRouteHeaderMatchIntegerRangeArgs $;

        public Builder() {
            $ = new HttpRouteHeaderMatchIntegerRangeArgs();
        }

        public Builder(HttpRouteHeaderMatchIntegerRangeArgs defaults) {
            $ = new HttpRouteHeaderMatchIntegerRangeArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param end End of the range (exclusive)
         * 
         * @return builder
         * 
         */
        public Builder end(@Nullable Output<Integer> end) {
            $.end = end;
            return this;
        }

        /**
         * @param end End of the range (exclusive)
         * 
         * @return builder
         * 
         */
        public Builder end(Integer end) {
            return end(Output.of(end));
        }

        /**
         * @param start Start of the range (inclusive)
         * 
         * @return builder
         * 
         */
        public Builder start(@Nullable Output<Integer> start) {
            $.start = start;
            return this;
        }

        /**
         * @param start Start of the range (inclusive)
         * 
         * @return builder
         * 
         */
        public Builder start(Integer start) {
            return start(Output.of(start));
        }

        public HttpRouteHeaderMatchIntegerRangeArgs build() {
            return $;
        }
    }

}
