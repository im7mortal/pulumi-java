// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.compute_v1.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import io.pulumi.googlenative.compute_v1.outputs.DurationResponse;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Objects;

@OutputCustomType
public final class HttpRetryPolicyResponse {
    /**
     * Specifies the allowed number retries. This number must be > 0. If not specified, defaults to 1.
     * 
     */
    private final Integer numRetries;
    /**
     * Specifies a non-zero timeout per retry attempt. If not specified, will use the timeout set in the HttpRouteAction field. If timeout in the HttpRouteAction field is not set, this field uses the largest timeout among all backend services associated with the route. Not supported when the URL map is bound to a target gRPC proxy that has the validateForProxyless field set to true.
     * 
     */
    private final DurationResponse perTryTimeout;
    /**
     * Specifies one or more conditions when this retry policy applies. Valid values are: - 5xx: retry is attempted if the instance or endpoint responds with any 5xx response code, or if the instance or endpoint does not respond at all. For example, disconnects, reset, read timeout, connection failure, and refused streams. - gateway-error: Similar to 5xx, but only applies to response codes 502, 503 or 504. - connect-failure: a retry is attempted on failures connecting to the instance or endpoint. For example, connection timeouts. - retriable-4xx: a retry is attempted if the instance or endpoint responds with a 4xx response code. The only error that you can retry is error code 409. - refused-stream: a retry is attempted if the instance or endpoint resets the stream with a REFUSED_STREAM error code. This reset type indicates that it is safe to retry. - cancelled: a retry is attempted if the gRPC status code in the response header is set to cancelled. - deadline-exceeded: a retry is attempted if the gRPC status code in the response header is set to deadline-exceeded. - internal: a retry is attempted if the gRPC status code in the response header is set to internal. - resource-exhausted: a retry is attempted if the gRPC status code in the response header is set to resource-exhausted. - unavailable: a retry is attempted if the gRPC status code in the response header is set to unavailable. Only the following codes are supported when the URL map is bound to target gRPC proxy that has validateForProxyless field set to true. - cancelled - deadline-exceeded - internal - resource-exhausted - unavailable
     * 
     */
    private final List<String> retryConditions;

    @OutputCustomType.Constructor({"numRetries","perTryTimeout","retryConditions"})
    private HttpRetryPolicyResponse(
        Integer numRetries,
        DurationResponse perTryTimeout,
        List<String> retryConditions) {
        this.numRetries = Objects.requireNonNull(numRetries);
        this.perTryTimeout = Objects.requireNonNull(perTryTimeout);
        this.retryConditions = Objects.requireNonNull(retryConditions);
    }

    /**
     * Specifies the allowed number retries. This number must be > 0. If not specified, defaults to 1.
     * 
    */
    public Integer getNumRetries() {
        return this.numRetries;
    }
    /**
     * Specifies a non-zero timeout per retry attempt. If not specified, will use the timeout set in the HttpRouteAction field. If timeout in the HttpRouteAction field is not set, this field uses the largest timeout among all backend services associated with the route. Not supported when the URL map is bound to a target gRPC proxy that has the validateForProxyless field set to true.
     * 
    */
    public DurationResponse getPerTryTimeout() {
        return this.perTryTimeout;
    }
    /**
     * Specifies one or more conditions when this retry policy applies. Valid values are: - 5xx: retry is attempted if the instance or endpoint responds with any 5xx response code, or if the instance or endpoint does not respond at all. For example, disconnects, reset, read timeout, connection failure, and refused streams. - gateway-error: Similar to 5xx, but only applies to response codes 502, 503 or 504. - connect-failure: a retry is attempted on failures connecting to the instance or endpoint. For example, connection timeouts. - retriable-4xx: a retry is attempted if the instance or endpoint responds with a 4xx response code. The only error that you can retry is error code 409. - refused-stream: a retry is attempted if the instance or endpoint resets the stream with a REFUSED_STREAM error code. This reset type indicates that it is safe to retry. - cancelled: a retry is attempted if the gRPC status code in the response header is set to cancelled. - deadline-exceeded: a retry is attempted if the gRPC status code in the response header is set to deadline-exceeded. - internal: a retry is attempted if the gRPC status code in the response header is set to internal. - resource-exhausted: a retry is attempted if the gRPC status code in the response header is set to resource-exhausted. - unavailable: a retry is attempted if the gRPC status code in the response header is set to unavailable. Only the following codes are supported when the URL map is bound to target gRPC proxy that has validateForProxyless field set to true. - cancelled - deadline-exceeded - internal - resource-exhausted - unavailable
     * 
    */
    public List<String> getRetryConditions() {
        return this.retryConditions;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(HttpRetryPolicyResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Integer numRetries;
        private DurationResponse perTryTimeout;
        private List<String> retryConditions;

        public Builder() {
    	      // Empty
        }

        public Builder(HttpRetryPolicyResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.numRetries = defaults.numRetries;
    	      this.perTryTimeout = defaults.perTryTimeout;
    	      this.retryConditions = defaults.retryConditions;
        }

        public Builder setNumRetries(Integer numRetries) {
            this.numRetries = Objects.requireNonNull(numRetries);
            return this;
        }

        public Builder setPerTryTimeout(DurationResponse perTryTimeout) {
            this.perTryTimeout = Objects.requireNonNull(perTryTimeout);
            return this;
        }

        public Builder setRetryConditions(List<String> retryConditions) {
            this.retryConditions = Objects.requireNonNull(retryConditions);
            return this;
        }
        public HttpRetryPolicyResponse build() {
            return new HttpRetryPolicyResponse(numRetries, perTryTimeout, retryConditions);
        }
    }
}
