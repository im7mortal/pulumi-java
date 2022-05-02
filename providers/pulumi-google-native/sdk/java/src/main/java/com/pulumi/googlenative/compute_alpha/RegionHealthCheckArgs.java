// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.compute_alpha;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.googlenative.compute_alpha.enums.RegionHealthCheckType;
import com.pulumi.googlenative.compute_alpha.inputs.GRPCHealthCheckArgs;
import com.pulumi.googlenative.compute_alpha.inputs.HTTP2HealthCheckArgs;
import com.pulumi.googlenative.compute_alpha.inputs.HTTPHealthCheckArgs;
import com.pulumi.googlenative.compute_alpha.inputs.HTTPSHealthCheckArgs;
import com.pulumi.googlenative.compute_alpha.inputs.HealthCheckLogConfigArgs;
import com.pulumi.googlenative.compute_alpha.inputs.SSLHealthCheckArgs;
import com.pulumi.googlenative.compute_alpha.inputs.TCPHealthCheckArgs;
import com.pulumi.googlenative.compute_alpha.inputs.UDPHealthCheckArgs;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class RegionHealthCheckArgs extends com.pulumi.resources.ResourceArgs {

    public static final RegionHealthCheckArgs Empty = new RegionHealthCheckArgs();

    /**
     * How often (in seconds) to send a health check. The default value is 5 seconds.
     * 
     */
    @Import(name="checkIntervalSec")
    private @Nullable Output<Integer> checkIntervalSec;

    /**
     * @return How often (in seconds) to send a health check. The default value is 5 seconds.
     * 
     */
    public Optional<Output<Integer>> checkIntervalSec() {
        return Optional.ofNullable(this.checkIntervalSec);
    }

    /**
     * An optional description of this resource. Provide this property when you create the resource.
     * 
     */
    @Import(name="description")
    private @Nullable Output<String> description;

    /**
     * @return An optional description of this resource. Provide this property when you create the resource.
     * 
     */
    public Optional<Output<String>> description() {
        return Optional.ofNullable(this.description);
    }

    @Import(name="grpcHealthCheck")
    private @Nullable Output<GRPCHealthCheckArgs> grpcHealthCheck;

    public Optional<Output<GRPCHealthCheckArgs>> grpcHealthCheck() {
        return Optional.ofNullable(this.grpcHealthCheck);
    }

    /**
     * A so-far unhealthy instance will be marked healthy after this many consecutive successes. The default value is 2.
     * 
     */
    @Import(name="healthyThreshold")
    private @Nullable Output<Integer> healthyThreshold;

    /**
     * @return A so-far unhealthy instance will be marked healthy after this many consecutive successes. The default value is 2.
     * 
     */
    public Optional<Output<Integer>> healthyThreshold() {
        return Optional.ofNullable(this.healthyThreshold);
    }

    @Import(name="http2HealthCheck")
    private @Nullable Output<HTTP2HealthCheckArgs> http2HealthCheck;

    public Optional<Output<HTTP2HealthCheckArgs>> http2HealthCheck() {
        return Optional.ofNullable(this.http2HealthCheck);
    }

    @Import(name="httpHealthCheck")
    private @Nullable Output<HTTPHealthCheckArgs> httpHealthCheck;

    public Optional<Output<HTTPHealthCheckArgs>> httpHealthCheck() {
        return Optional.ofNullable(this.httpHealthCheck);
    }

    @Import(name="httpsHealthCheck")
    private @Nullable Output<HTTPSHealthCheckArgs> httpsHealthCheck;

    public Optional<Output<HTTPSHealthCheckArgs>> httpsHealthCheck() {
        return Optional.ofNullable(this.httpsHealthCheck);
    }

    /**
     * Type of the resource.
     * 
     */
    @Import(name="kind")
    private @Nullable Output<String> kind;

    /**
     * @return Type of the resource.
     * 
     */
    public Optional<Output<String>> kind() {
        return Optional.ofNullable(this.kind);
    }

    /**
     * Configure logging on this health check.
     * 
     */
    @Import(name="logConfig")
    private @Nullable Output<HealthCheckLogConfigArgs> logConfig;

    /**
     * @return Configure logging on this health check.
     * 
     */
    public Optional<Output<HealthCheckLogConfigArgs>> logConfig() {
        return Optional.ofNullable(this.logConfig);
    }

    /**
     * Name of the resource. Provided by the client when the resource is created. The name must be 1-63 characters long, and comply with RFC1035. For example, a name that is 1-63 characters long, matches the regular expression `[a-z]([-a-z0-9]*[a-z0-9])?`, and otherwise complies with RFC1035. This regular expression describes a name where the first character is a lowercase letter, and all following characters are a dash, lowercase letter, or digit, except the last character, which isn&#39;t a dash.
     * 
     */
    @Import(name="name")
    private @Nullable Output<String> name;

    /**
     * @return Name of the resource. Provided by the client when the resource is created. The name must be 1-63 characters long, and comply with RFC1035. For example, a name that is 1-63 characters long, matches the regular expression `[a-z]([-a-z0-9]*[a-z0-9])?`, and otherwise complies with RFC1035. This regular expression describes a name where the first character is a lowercase letter, and all following characters are a dash, lowercase letter, or digit, except the last character, which isn&#39;t a dash.
     * 
     */
    public Optional<Output<String>> name() {
        return Optional.ofNullable(this.name);
    }

    @Import(name="project")
    private @Nullable Output<String> project;

    public Optional<Output<String>> project() {
        return Optional.ofNullable(this.project);
    }

    @Import(name="region", required=true)
    private Output<String> region;

    public Output<String> region() {
        return this.region;
    }

    /**
     * An optional request ID to identify requests. Specify a unique request ID so that if you must retry your request, the server will know to ignore the request if it has already been completed. For example, consider a situation where you make an initial request and the request times out. If you make the request again with the same request ID, the server can check if original operation with the same request ID was received, and if so, will ignore the second request. This prevents clients from accidentally creating duplicate commitments. The request ID must be a valid UUID with the exception that zero UUID is not supported ( 00000000-0000-0000-0000-000000000000).
     * 
     */
    @Import(name="requestId")
    private @Nullable Output<String> requestId;

    /**
     * @return An optional request ID to identify requests. Specify a unique request ID so that if you must retry your request, the server will know to ignore the request if it has already been completed. For example, consider a situation where you make an initial request and the request times out. If you make the request again with the same request ID, the server can check if original operation with the same request ID was received, and if so, will ignore the second request. This prevents clients from accidentally creating duplicate commitments. The request ID must be a valid UUID with the exception that zero UUID is not supported ( 00000000-0000-0000-0000-000000000000).
     * 
     */
    public Optional<Output<String>> requestId() {
        return Optional.ofNullable(this.requestId);
    }

    @Import(name="sslHealthCheck")
    private @Nullable Output<SSLHealthCheckArgs> sslHealthCheck;

    public Optional<Output<SSLHealthCheckArgs>> sslHealthCheck() {
        return Optional.ofNullable(this.sslHealthCheck);
    }

    @Import(name="tcpHealthCheck")
    private @Nullable Output<TCPHealthCheckArgs> tcpHealthCheck;

    public Optional<Output<TCPHealthCheckArgs>> tcpHealthCheck() {
        return Optional.ofNullable(this.tcpHealthCheck);
    }

    /**
     * How long (in seconds) to wait before claiming failure. The default value is 5 seconds. It is invalid for timeoutSec to have greater value than checkIntervalSec.
     * 
     */
    @Import(name="timeoutSec")
    private @Nullable Output<Integer> timeoutSec;

    /**
     * @return How long (in seconds) to wait before claiming failure. The default value is 5 seconds. It is invalid for timeoutSec to have greater value than checkIntervalSec.
     * 
     */
    public Optional<Output<Integer>> timeoutSec() {
        return Optional.ofNullable(this.timeoutSec);
    }

    /**
     * Specifies the type of the healthCheck, either TCP, SSL, HTTP, HTTPS or HTTP2. Exactly one of the protocol-specific health check field must be specified, which must match type field.
     * 
     */
    @Import(name="type")
    private @Nullable Output<RegionHealthCheckType> type;

    /**
     * @return Specifies the type of the healthCheck, either TCP, SSL, HTTP, HTTPS or HTTP2. Exactly one of the protocol-specific health check field must be specified, which must match type field.
     * 
     */
    public Optional<Output<RegionHealthCheckType>> type() {
        return Optional.ofNullable(this.type);
    }

    @Import(name="udpHealthCheck")
    private @Nullable Output<UDPHealthCheckArgs> udpHealthCheck;

    public Optional<Output<UDPHealthCheckArgs>> udpHealthCheck() {
        return Optional.ofNullable(this.udpHealthCheck);
    }

    /**
     * A so-far healthy instance will be marked unhealthy after this many consecutive failures. The default value is 2.
     * 
     */
    @Import(name="unhealthyThreshold")
    private @Nullable Output<Integer> unhealthyThreshold;

    /**
     * @return A so-far healthy instance will be marked unhealthy after this many consecutive failures. The default value is 2.
     * 
     */
    public Optional<Output<Integer>> unhealthyThreshold() {
        return Optional.ofNullable(this.unhealthyThreshold);
    }

    private RegionHealthCheckArgs() {}

    private RegionHealthCheckArgs(RegionHealthCheckArgs $) {
        this.checkIntervalSec = $.checkIntervalSec;
        this.description = $.description;
        this.grpcHealthCheck = $.grpcHealthCheck;
        this.healthyThreshold = $.healthyThreshold;
        this.http2HealthCheck = $.http2HealthCheck;
        this.httpHealthCheck = $.httpHealthCheck;
        this.httpsHealthCheck = $.httpsHealthCheck;
        this.kind = $.kind;
        this.logConfig = $.logConfig;
        this.name = $.name;
        this.project = $.project;
        this.region = $.region;
        this.requestId = $.requestId;
        this.sslHealthCheck = $.sslHealthCheck;
        this.tcpHealthCheck = $.tcpHealthCheck;
        this.timeoutSec = $.timeoutSec;
        this.type = $.type;
        this.udpHealthCheck = $.udpHealthCheck;
        this.unhealthyThreshold = $.unhealthyThreshold;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(RegionHealthCheckArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private RegionHealthCheckArgs $;

        public Builder() {
            $ = new RegionHealthCheckArgs();
        }

        public Builder(RegionHealthCheckArgs defaults) {
            $ = new RegionHealthCheckArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param checkIntervalSec How often (in seconds) to send a health check. The default value is 5 seconds.
         * 
         * @return builder
         * 
         */
        public Builder checkIntervalSec(@Nullable Output<Integer> checkIntervalSec) {
            $.checkIntervalSec = checkIntervalSec;
            return this;
        }

        /**
         * @param checkIntervalSec How often (in seconds) to send a health check. The default value is 5 seconds.
         * 
         * @return builder
         * 
         */
        public Builder checkIntervalSec(Integer checkIntervalSec) {
            return checkIntervalSec(Output.of(checkIntervalSec));
        }

        /**
         * @param description An optional description of this resource. Provide this property when you create the resource.
         * 
         * @return builder
         * 
         */
        public Builder description(@Nullable Output<String> description) {
            $.description = description;
            return this;
        }

        /**
         * @param description An optional description of this resource. Provide this property when you create the resource.
         * 
         * @return builder
         * 
         */
        public Builder description(String description) {
            return description(Output.of(description));
        }

        public Builder grpcHealthCheck(@Nullable Output<GRPCHealthCheckArgs> grpcHealthCheck) {
            $.grpcHealthCheck = grpcHealthCheck;
            return this;
        }

        public Builder grpcHealthCheck(GRPCHealthCheckArgs grpcHealthCheck) {
            return grpcHealthCheck(Output.of(grpcHealthCheck));
        }

        /**
         * @param healthyThreshold A so-far unhealthy instance will be marked healthy after this many consecutive successes. The default value is 2.
         * 
         * @return builder
         * 
         */
        public Builder healthyThreshold(@Nullable Output<Integer> healthyThreshold) {
            $.healthyThreshold = healthyThreshold;
            return this;
        }

        /**
         * @param healthyThreshold A so-far unhealthy instance will be marked healthy after this many consecutive successes. The default value is 2.
         * 
         * @return builder
         * 
         */
        public Builder healthyThreshold(Integer healthyThreshold) {
            return healthyThreshold(Output.of(healthyThreshold));
        }

        public Builder http2HealthCheck(@Nullable Output<HTTP2HealthCheckArgs> http2HealthCheck) {
            $.http2HealthCheck = http2HealthCheck;
            return this;
        }

        public Builder http2HealthCheck(HTTP2HealthCheckArgs http2HealthCheck) {
            return http2HealthCheck(Output.of(http2HealthCheck));
        }

        public Builder httpHealthCheck(@Nullable Output<HTTPHealthCheckArgs> httpHealthCheck) {
            $.httpHealthCheck = httpHealthCheck;
            return this;
        }

        public Builder httpHealthCheck(HTTPHealthCheckArgs httpHealthCheck) {
            return httpHealthCheck(Output.of(httpHealthCheck));
        }

        public Builder httpsHealthCheck(@Nullable Output<HTTPSHealthCheckArgs> httpsHealthCheck) {
            $.httpsHealthCheck = httpsHealthCheck;
            return this;
        }

        public Builder httpsHealthCheck(HTTPSHealthCheckArgs httpsHealthCheck) {
            return httpsHealthCheck(Output.of(httpsHealthCheck));
        }

        /**
         * @param kind Type of the resource.
         * 
         * @return builder
         * 
         */
        public Builder kind(@Nullable Output<String> kind) {
            $.kind = kind;
            return this;
        }

        /**
         * @param kind Type of the resource.
         * 
         * @return builder
         * 
         */
        public Builder kind(String kind) {
            return kind(Output.of(kind));
        }

        /**
         * @param logConfig Configure logging on this health check.
         * 
         * @return builder
         * 
         */
        public Builder logConfig(@Nullable Output<HealthCheckLogConfigArgs> logConfig) {
            $.logConfig = logConfig;
            return this;
        }

        /**
         * @param logConfig Configure logging on this health check.
         * 
         * @return builder
         * 
         */
        public Builder logConfig(HealthCheckLogConfigArgs logConfig) {
            return logConfig(Output.of(logConfig));
        }

        /**
         * @param name Name of the resource. Provided by the client when the resource is created. The name must be 1-63 characters long, and comply with RFC1035. For example, a name that is 1-63 characters long, matches the regular expression `[a-z]([-a-z0-9]*[a-z0-9])?`, and otherwise complies with RFC1035. This regular expression describes a name where the first character is a lowercase letter, and all following characters are a dash, lowercase letter, or digit, except the last character, which isn&#39;t a dash.
         * 
         * @return builder
         * 
         */
        public Builder name(@Nullable Output<String> name) {
            $.name = name;
            return this;
        }

        /**
         * @param name Name of the resource. Provided by the client when the resource is created. The name must be 1-63 characters long, and comply with RFC1035. For example, a name that is 1-63 characters long, matches the regular expression `[a-z]([-a-z0-9]*[a-z0-9])?`, and otherwise complies with RFC1035. This regular expression describes a name where the first character is a lowercase letter, and all following characters are a dash, lowercase letter, or digit, except the last character, which isn&#39;t a dash.
         * 
         * @return builder
         * 
         */
        public Builder name(String name) {
            return name(Output.of(name));
        }

        public Builder project(@Nullable Output<String> project) {
            $.project = project;
            return this;
        }

        public Builder project(String project) {
            return project(Output.of(project));
        }

        public Builder region(Output<String> region) {
            $.region = region;
            return this;
        }

        public Builder region(String region) {
            return region(Output.of(region));
        }

        /**
         * @param requestId An optional request ID to identify requests. Specify a unique request ID so that if you must retry your request, the server will know to ignore the request if it has already been completed. For example, consider a situation where you make an initial request and the request times out. If you make the request again with the same request ID, the server can check if original operation with the same request ID was received, and if so, will ignore the second request. This prevents clients from accidentally creating duplicate commitments. The request ID must be a valid UUID with the exception that zero UUID is not supported ( 00000000-0000-0000-0000-000000000000).
         * 
         * @return builder
         * 
         */
        public Builder requestId(@Nullable Output<String> requestId) {
            $.requestId = requestId;
            return this;
        }

        /**
         * @param requestId An optional request ID to identify requests. Specify a unique request ID so that if you must retry your request, the server will know to ignore the request if it has already been completed. For example, consider a situation where you make an initial request and the request times out. If you make the request again with the same request ID, the server can check if original operation with the same request ID was received, and if so, will ignore the second request. This prevents clients from accidentally creating duplicate commitments. The request ID must be a valid UUID with the exception that zero UUID is not supported ( 00000000-0000-0000-0000-000000000000).
         * 
         * @return builder
         * 
         */
        public Builder requestId(String requestId) {
            return requestId(Output.of(requestId));
        }

        public Builder sslHealthCheck(@Nullable Output<SSLHealthCheckArgs> sslHealthCheck) {
            $.sslHealthCheck = sslHealthCheck;
            return this;
        }

        public Builder sslHealthCheck(SSLHealthCheckArgs sslHealthCheck) {
            return sslHealthCheck(Output.of(sslHealthCheck));
        }

        public Builder tcpHealthCheck(@Nullable Output<TCPHealthCheckArgs> tcpHealthCheck) {
            $.tcpHealthCheck = tcpHealthCheck;
            return this;
        }

        public Builder tcpHealthCheck(TCPHealthCheckArgs tcpHealthCheck) {
            return tcpHealthCheck(Output.of(tcpHealthCheck));
        }

        /**
         * @param timeoutSec How long (in seconds) to wait before claiming failure. The default value is 5 seconds. It is invalid for timeoutSec to have greater value than checkIntervalSec.
         * 
         * @return builder
         * 
         */
        public Builder timeoutSec(@Nullable Output<Integer> timeoutSec) {
            $.timeoutSec = timeoutSec;
            return this;
        }

        /**
         * @param timeoutSec How long (in seconds) to wait before claiming failure. The default value is 5 seconds. It is invalid for timeoutSec to have greater value than checkIntervalSec.
         * 
         * @return builder
         * 
         */
        public Builder timeoutSec(Integer timeoutSec) {
            return timeoutSec(Output.of(timeoutSec));
        }

        /**
         * @param type Specifies the type of the healthCheck, either TCP, SSL, HTTP, HTTPS or HTTP2. Exactly one of the protocol-specific health check field must be specified, which must match type field.
         * 
         * @return builder
         * 
         */
        public Builder type(@Nullable Output<RegionHealthCheckType> type) {
            $.type = type;
            return this;
        }

        /**
         * @param type Specifies the type of the healthCheck, either TCP, SSL, HTTP, HTTPS or HTTP2. Exactly one of the protocol-specific health check field must be specified, which must match type field.
         * 
         * @return builder
         * 
         */
        public Builder type(RegionHealthCheckType type) {
            return type(Output.of(type));
        }

        public Builder udpHealthCheck(@Nullable Output<UDPHealthCheckArgs> udpHealthCheck) {
            $.udpHealthCheck = udpHealthCheck;
            return this;
        }

        public Builder udpHealthCheck(UDPHealthCheckArgs udpHealthCheck) {
            return udpHealthCheck(Output.of(udpHealthCheck));
        }

        /**
         * @param unhealthyThreshold A so-far healthy instance will be marked unhealthy after this many consecutive failures. The default value is 2.
         * 
         * @return builder
         * 
         */
        public Builder unhealthyThreshold(@Nullable Output<Integer> unhealthyThreshold) {
            $.unhealthyThreshold = unhealthyThreshold;
            return this;
        }

        /**
         * @param unhealthyThreshold A so-far healthy instance will be marked unhealthy after this many consecutive failures. The default value is 2.
         * 
         * @return builder
         * 
         */
        public Builder unhealthyThreshold(Integer unhealthyThreshold) {
            return unhealthyThreshold(Output.of(unhealthyThreshold));
        }

        public RegionHealthCheckArgs build() {
            $.region = Objects.requireNonNull($.region, "expected parameter 'region' to be non-null");
            return $;
        }
    }

}
