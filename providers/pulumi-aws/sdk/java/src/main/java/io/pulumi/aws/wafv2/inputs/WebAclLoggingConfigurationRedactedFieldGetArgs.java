// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.wafv2.inputs;

import io.pulumi.aws.wafv2.inputs.WebAclLoggingConfigurationRedactedFieldAllQueryArgumentsGetArgs;
import io.pulumi.aws.wafv2.inputs.WebAclLoggingConfigurationRedactedFieldBodyGetArgs;
import io.pulumi.aws.wafv2.inputs.WebAclLoggingConfigurationRedactedFieldMethodGetArgs;
import io.pulumi.aws.wafv2.inputs.WebAclLoggingConfigurationRedactedFieldQueryStringGetArgs;
import io.pulumi.aws.wafv2.inputs.WebAclLoggingConfigurationRedactedFieldSingleHeaderGetArgs;
import io.pulumi.aws.wafv2.inputs.WebAclLoggingConfigurationRedactedFieldSingleQueryArgumentGetArgs;
import io.pulumi.aws.wafv2.inputs.WebAclLoggingConfigurationRedactedFieldUriPathGetArgs;
import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.util.Objects;
import javax.annotation.Nullable;


public final class WebAclLoggingConfigurationRedactedFieldGetArgs extends io.pulumi.resources.ResourceArgs {

    public static final WebAclLoggingConfigurationRedactedFieldGetArgs Empty = new WebAclLoggingConfigurationRedactedFieldGetArgs();

    /**
     * Redact all query arguments.
     * 
     * @Deprecated
     * Not supported by WAFv2 API
     * 
     */
    @Deprecated /* Not supported by WAFv2 API */
    @InputImport(name="allQueryArguments")
      private final @Nullable Input<WebAclLoggingConfigurationRedactedFieldAllQueryArgumentsGetArgs> allQueryArguments;

    @Deprecated /* Not supported by WAFv2 API */
    public Input<WebAclLoggingConfigurationRedactedFieldAllQueryArgumentsGetArgs> getAllQueryArguments() {
        return this.allQueryArguments == null ? Input.empty() : this.allQueryArguments;
    }

    /**
     * Redact the request body, which immediately follows the request headers.
     * 
     * @Deprecated
     * Not supported by WAFv2 API
     * 
     */
    @Deprecated /* Not supported by WAFv2 API */
    @InputImport(name="body")
      private final @Nullable Input<WebAclLoggingConfigurationRedactedFieldBodyGetArgs> body;

    @Deprecated /* Not supported by WAFv2 API */
    public Input<WebAclLoggingConfigurationRedactedFieldBodyGetArgs> getBody() {
        return this.body == null ? Input.empty() : this.body;
    }

    /**
     * Redact the HTTP method. Must be specified as an empty configuration block `{}`. The method indicates the type of operation that the request is asking the origin to perform.
     * 
     */
    @InputImport(name="method")
      private final @Nullable Input<WebAclLoggingConfigurationRedactedFieldMethodGetArgs> method;

    public Input<WebAclLoggingConfigurationRedactedFieldMethodGetArgs> getMethod() {
        return this.method == null ? Input.empty() : this.method;
    }

    /**
     * Redact the query string. Must be specified as an empty configuration block `{}`. This is the part of a URL that appears after a `?` character, if any.
     * 
     */
    @InputImport(name="queryString")
      private final @Nullable Input<WebAclLoggingConfigurationRedactedFieldQueryStringGetArgs> queryString;

    public Input<WebAclLoggingConfigurationRedactedFieldQueryStringGetArgs> getQueryString() {
        return this.queryString == null ? Input.empty() : this.queryString;
    }

    /**
     * Redact a single header. See Single Header below for details.
     * 
     */
    @InputImport(name="singleHeader")
      private final @Nullable Input<WebAclLoggingConfigurationRedactedFieldSingleHeaderGetArgs> singleHeader;

    public Input<WebAclLoggingConfigurationRedactedFieldSingleHeaderGetArgs> getSingleHeader() {
        return this.singleHeader == null ? Input.empty() : this.singleHeader;
    }

    /**
     * Redact a single query argument. See Single Query Argument below for details.
     * 
     * @Deprecated
     * Not supported by WAFv2 API
     * 
     */
    @Deprecated /* Not supported by WAFv2 API */
    @InputImport(name="singleQueryArgument")
      private final @Nullable Input<WebAclLoggingConfigurationRedactedFieldSingleQueryArgumentGetArgs> singleQueryArgument;

    @Deprecated /* Not supported by WAFv2 API */
    public Input<WebAclLoggingConfigurationRedactedFieldSingleQueryArgumentGetArgs> getSingleQueryArgument() {
        return this.singleQueryArgument == null ? Input.empty() : this.singleQueryArgument;
    }

    /**
     * Redact the request URI path. Must be specified as an empty configuration block `{}`. This is the part of a web request that identifies a resource, for example, `/images/daily-ad.jpg`.
     * 
     */
    @InputImport(name="uriPath")
      private final @Nullable Input<WebAclLoggingConfigurationRedactedFieldUriPathGetArgs> uriPath;

    public Input<WebAclLoggingConfigurationRedactedFieldUriPathGetArgs> getUriPath() {
        return this.uriPath == null ? Input.empty() : this.uriPath;
    }

    public WebAclLoggingConfigurationRedactedFieldGetArgs(
        @Nullable Input<WebAclLoggingConfigurationRedactedFieldAllQueryArgumentsGetArgs> allQueryArguments,
        @Nullable Input<WebAclLoggingConfigurationRedactedFieldBodyGetArgs> body,
        @Nullable Input<WebAclLoggingConfigurationRedactedFieldMethodGetArgs> method,
        @Nullable Input<WebAclLoggingConfigurationRedactedFieldQueryStringGetArgs> queryString,
        @Nullable Input<WebAclLoggingConfigurationRedactedFieldSingleHeaderGetArgs> singleHeader,
        @Nullable Input<WebAclLoggingConfigurationRedactedFieldSingleQueryArgumentGetArgs> singleQueryArgument,
        @Nullable Input<WebAclLoggingConfigurationRedactedFieldUriPathGetArgs> uriPath) {
        this.allQueryArguments = allQueryArguments;
        this.body = body;
        this.method = method;
        this.queryString = queryString;
        this.singleHeader = singleHeader;
        this.singleQueryArgument = singleQueryArgument;
        this.uriPath = uriPath;
    }

    private WebAclLoggingConfigurationRedactedFieldGetArgs() {
        this.allQueryArguments = Input.empty();
        this.body = Input.empty();
        this.method = Input.empty();
        this.queryString = Input.empty();
        this.singleHeader = Input.empty();
        this.singleQueryArgument = Input.empty();
        this.uriPath = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(WebAclLoggingConfigurationRedactedFieldGetArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<WebAclLoggingConfigurationRedactedFieldAllQueryArgumentsGetArgs> allQueryArguments;
        private @Nullable Input<WebAclLoggingConfigurationRedactedFieldBodyGetArgs> body;
        private @Nullable Input<WebAclLoggingConfigurationRedactedFieldMethodGetArgs> method;
        private @Nullable Input<WebAclLoggingConfigurationRedactedFieldQueryStringGetArgs> queryString;
        private @Nullable Input<WebAclLoggingConfigurationRedactedFieldSingleHeaderGetArgs> singleHeader;
        private @Nullable Input<WebAclLoggingConfigurationRedactedFieldSingleQueryArgumentGetArgs> singleQueryArgument;
        private @Nullable Input<WebAclLoggingConfigurationRedactedFieldUriPathGetArgs> uriPath;

        public Builder() {
    	      // Empty
        }

        public Builder(WebAclLoggingConfigurationRedactedFieldGetArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.allQueryArguments = defaults.allQueryArguments;
    	      this.body = defaults.body;
    	      this.method = defaults.method;
    	      this.queryString = defaults.queryString;
    	      this.singleHeader = defaults.singleHeader;
    	      this.singleQueryArgument = defaults.singleQueryArgument;
    	      this.uriPath = defaults.uriPath;
        }

        public Builder setAllQueryArguments(@Nullable Input<WebAclLoggingConfigurationRedactedFieldAllQueryArgumentsGetArgs> allQueryArguments) {
            this.allQueryArguments = allQueryArguments;
            return this;
        }

        public Builder setAllQueryArguments(@Nullable WebAclLoggingConfigurationRedactedFieldAllQueryArgumentsGetArgs allQueryArguments) {
            this.allQueryArguments = Input.ofNullable(allQueryArguments);
            return this;
        }

        public Builder setBody(@Nullable Input<WebAclLoggingConfigurationRedactedFieldBodyGetArgs> body) {
            this.body = body;
            return this;
        }

        public Builder setBody(@Nullable WebAclLoggingConfigurationRedactedFieldBodyGetArgs body) {
            this.body = Input.ofNullable(body);
            return this;
        }

        public Builder setMethod(@Nullable Input<WebAclLoggingConfigurationRedactedFieldMethodGetArgs> method) {
            this.method = method;
            return this;
        }

        public Builder setMethod(@Nullable WebAclLoggingConfigurationRedactedFieldMethodGetArgs method) {
            this.method = Input.ofNullable(method);
            return this;
        }

        public Builder setQueryString(@Nullable Input<WebAclLoggingConfigurationRedactedFieldQueryStringGetArgs> queryString) {
            this.queryString = queryString;
            return this;
        }

        public Builder setQueryString(@Nullable WebAclLoggingConfigurationRedactedFieldQueryStringGetArgs queryString) {
            this.queryString = Input.ofNullable(queryString);
            return this;
        }

        public Builder setSingleHeader(@Nullable Input<WebAclLoggingConfigurationRedactedFieldSingleHeaderGetArgs> singleHeader) {
            this.singleHeader = singleHeader;
            return this;
        }

        public Builder setSingleHeader(@Nullable WebAclLoggingConfigurationRedactedFieldSingleHeaderGetArgs singleHeader) {
            this.singleHeader = Input.ofNullable(singleHeader);
            return this;
        }

        public Builder setSingleQueryArgument(@Nullable Input<WebAclLoggingConfigurationRedactedFieldSingleQueryArgumentGetArgs> singleQueryArgument) {
            this.singleQueryArgument = singleQueryArgument;
            return this;
        }

        public Builder setSingleQueryArgument(@Nullable WebAclLoggingConfigurationRedactedFieldSingleQueryArgumentGetArgs singleQueryArgument) {
            this.singleQueryArgument = Input.ofNullable(singleQueryArgument);
            return this;
        }

        public Builder setUriPath(@Nullable Input<WebAclLoggingConfigurationRedactedFieldUriPathGetArgs> uriPath) {
            this.uriPath = uriPath;
            return this;
        }

        public Builder setUriPath(@Nullable WebAclLoggingConfigurationRedactedFieldUriPathGetArgs uriPath) {
            this.uriPath = Input.ofNullable(uriPath);
            return this;
        }
        public WebAclLoggingConfigurationRedactedFieldGetArgs build() {
            return new WebAclLoggingConfigurationRedactedFieldGetArgs(allQueryArguments, body, method, queryString, singleHeader, singleQueryArgument, uriPath);
        }
    }
}
