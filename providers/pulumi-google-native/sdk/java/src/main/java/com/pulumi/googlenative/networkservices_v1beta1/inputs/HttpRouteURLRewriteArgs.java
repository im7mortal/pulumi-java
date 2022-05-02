// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.networkservices_v1beta1.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * The specification for modifying the URL of the request, prior to forwarding the request to the destination.
 * 
 */
public final class HttpRouteURLRewriteArgs extends com.pulumi.resources.ResourceArgs {

    public static final HttpRouteURLRewriteArgs Empty = new HttpRouteURLRewriteArgs();

    /**
     * Prior to forwarding the request to the selected destination, the requests host header is replaced by this value.
     * 
     */
    @Import(name="hostRewrite")
    private @Nullable Output<String> hostRewrite;

    /**
     * @return Prior to forwarding the request to the selected destination, the requests host header is replaced by this value.
     * 
     */
    public Optional<Output<String>> hostRewrite() {
        return Optional.ofNullable(this.hostRewrite);
    }

    /**
     * Prior to forwarding the request to the selected destination, the matching portion of the requests path is replaced by this value.
     * 
     */
    @Import(name="pathPrefixRewrite")
    private @Nullable Output<String> pathPrefixRewrite;

    /**
     * @return Prior to forwarding the request to the selected destination, the matching portion of the requests path is replaced by this value.
     * 
     */
    public Optional<Output<String>> pathPrefixRewrite() {
        return Optional.ofNullable(this.pathPrefixRewrite);
    }

    private HttpRouteURLRewriteArgs() {}

    private HttpRouteURLRewriteArgs(HttpRouteURLRewriteArgs $) {
        this.hostRewrite = $.hostRewrite;
        this.pathPrefixRewrite = $.pathPrefixRewrite;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(HttpRouteURLRewriteArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private HttpRouteURLRewriteArgs $;

        public Builder() {
            $ = new HttpRouteURLRewriteArgs();
        }

        public Builder(HttpRouteURLRewriteArgs defaults) {
            $ = new HttpRouteURLRewriteArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param hostRewrite Prior to forwarding the request to the selected destination, the requests host header is replaced by this value.
         * 
         * @return builder
         * 
         */
        public Builder hostRewrite(@Nullable Output<String> hostRewrite) {
            $.hostRewrite = hostRewrite;
            return this;
        }

        /**
         * @param hostRewrite Prior to forwarding the request to the selected destination, the requests host header is replaced by this value.
         * 
         * @return builder
         * 
         */
        public Builder hostRewrite(String hostRewrite) {
            return hostRewrite(Output.of(hostRewrite));
        }

        /**
         * @param pathPrefixRewrite Prior to forwarding the request to the selected destination, the matching portion of the requests path is replaced by this value.
         * 
         * @return builder
         * 
         */
        public Builder pathPrefixRewrite(@Nullable Output<String> pathPrefixRewrite) {
            $.pathPrefixRewrite = pathPrefixRewrite;
            return this;
        }

        /**
         * @param pathPrefixRewrite Prior to forwarding the request to the selected destination, the matching portion of the requests path is replaced by this value.
         * 
         * @return builder
         * 
         */
        public Builder pathPrefixRewrite(String pathPrefixRewrite) {
            return pathPrefixRewrite(Output.of(pathPrefixRewrite));
        }

        public HttpRouteURLRewriteArgs build() {
            return $;
        }
    }

}
