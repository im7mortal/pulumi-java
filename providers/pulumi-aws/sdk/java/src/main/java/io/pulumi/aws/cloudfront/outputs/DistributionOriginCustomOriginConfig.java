// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.cloudfront.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class DistributionOriginCustomOriginConfig {
    /**
     * The HTTP port the custom origin listens on.
     * 
     */
    private final Integer httpPort;
    /**
     * The HTTPS port the custom origin listens on.
     * 
     */
    private final Integer httpsPort;
    /**
     * The Custom KeepAlive timeout, in seconds. By default, AWS enforces a limit of `60`. But you can request an [increase](http://docs.aws.amazon.com/AmazonCloudFront/latest/DeveloperGuide/RequestAndResponseBehaviorCustomOrigin.html#request-custom-request-timeout).
     * 
     */
    private final @Nullable Integer originKeepaliveTimeout;
    /**
     * The origin protocol policy to apply to
     * your origin. One of `http-only`, `https-only`, or `match-viewer`.
     * 
     */
    private final String originProtocolPolicy;
    /**
     * The Custom Read timeout, in seconds. By default, AWS enforces a limit of `60`. But you can request an [increase](http://docs.aws.amazon.com/AmazonCloudFront/latest/DeveloperGuide/RequestAndResponseBehaviorCustomOrigin.html#request-custom-request-timeout).
     * 
     */
    private final @Nullable Integer originReadTimeout;
    /**
     * The SSL/TLS protocols that you want
     * CloudFront to use when communicating with your origin over HTTPS. A list of
     * one or more of `SSLv3`, `TLSv1`, `TLSv1.1`, and `TLSv1.2`.
     * 
     */
    private final List<String> originSslProtocols;

    @OutputCustomType.Constructor({"httpPort","httpsPort","originKeepaliveTimeout","originProtocolPolicy","originReadTimeout","originSslProtocols"})
    private DistributionOriginCustomOriginConfig(
        Integer httpPort,
        Integer httpsPort,
        @Nullable Integer originKeepaliveTimeout,
        String originProtocolPolicy,
        @Nullable Integer originReadTimeout,
        List<String> originSslProtocols) {
        this.httpPort = Objects.requireNonNull(httpPort);
        this.httpsPort = Objects.requireNonNull(httpsPort);
        this.originKeepaliveTimeout = originKeepaliveTimeout;
        this.originProtocolPolicy = Objects.requireNonNull(originProtocolPolicy);
        this.originReadTimeout = originReadTimeout;
        this.originSslProtocols = Objects.requireNonNull(originSslProtocols);
    }

    /**
     * The HTTP port the custom origin listens on.
     * 
    */
    public Integer getHttpPort() {
        return this.httpPort;
    }
    /**
     * The HTTPS port the custom origin listens on.
     * 
    */
    public Integer getHttpsPort() {
        return this.httpsPort;
    }
    /**
     * The Custom KeepAlive timeout, in seconds. By default, AWS enforces a limit of `60`. But you can request an [increase](http://docs.aws.amazon.com/AmazonCloudFront/latest/DeveloperGuide/RequestAndResponseBehaviorCustomOrigin.html#request-custom-request-timeout).
     * 
    */
    public Optional<Integer> getOriginKeepaliveTimeout() {
        return Optional.ofNullable(this.originKeepaliveTimeout);
    }
    /**
     * The origin protocol policy to apply to
     * your origin. One of `http-only`, `https-only`, or `match-viewer`.
     * 
    */
    public String getOriginProtocolPolicy() {
        return this.originProtocolPolicy;
    }
    /**
     * The Custom Read timeout, in seconds. By default, AWS enforces a limit of `60`. But you can request an [increase](http://docs.aws.amazon.com/AmazonCloudFront/latest/DeveloperGuide/RequestAndResponseBehaviorCustomOrigin.html#request-custom-request-timeout).
     * 
    */
    public Optional<Integer> getOriginReadTimeout() {
        return Optional.ofNullable(this.originReadTimeout);
    }
    /**
     * The SSL/TLS protocols that you want
     * CloudFront to use when communicating with your origin over HTTPS. A list of
     * one or more of `SSLv3`, `TLSv1`, `TLSv1.1`, and `TLSv1.2`.
     * 
    */
    public List<String> getOriginSslProtocols() {
        return this.originSslProtocols;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(DistributionOriginCustomOriginConfig defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Integer httpPort;
        private Integer httpsPort;
        private @Nullable Integer originKeepaliveTimeout;
        private String originProtocolPolicy;
        private @Nullable Integer originReadTimeout;
        private List<String> originSslProtocols;

        public Builder() {
    	      // Empty
        }

        public Builder(DistributionOriginCustomOriginConfig defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.httpPort = defaults.httpPort;
    	      this.httpsPort = defaults.httpsPort;
    	      this.originKeepaliveTimeout = defaults.originKeepaliveTimeout;
    	      this.originProtocolPolicy = defaults.originProtocolPolicy;
    	      this.originReadTimeout = defaults.originReadTimeout;
    	      this.originSslProtocols = defaults.originSslProtocols;
        }

        public Builder setHttpPort(Integer httpPort) {
            this.httpPort = Objects.requireNonNull(httpPort);
            return this;
        }

        public Builder setHttpsPort(Integer httpsPort) {
            this.httpsPort = Objects.requireNonNull(httpsPort);
            return this;
        }

        public Builder setOriginKeepaliveTimeout(@Nullable Integer originKeepaliveTimeout) {
            this.originKeepaliveTimeout = originKeepaliveTimeout;
            return this;
        }

        public Builder setOriginProtocolPolicy(String originProtocolPolicy) {
            this.originProtocolPolicy = Objects.requireNonNull(originProtocolPolicy);
            return this;
        }

        public Builder setOriginReadTimeout(@Nullable Integer originReadTimeout) {
            this.originReadTimeout = originReadTimeout;
            return this;
        }

        public Builder setOriginSslProtocols(List<String> originSslProtocols) {
            this.originSslProtocols = Objects.requireNonNull(originSslProtocols);
            return this;
        }
        public DistributionOriginCustomOriginConfig build() {
            return new DistributionOriginCustomOriginConfig(httpPort, httpsPort, originKeepaliveTimeout, originProtocolPolicy, originReadTimeout, originSslProtocols);
        }
    }
}
