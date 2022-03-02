// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.appmesh.outputs;

import io.pulumi.aws.appmesh.outputs.RouteSpecGrpcRouteAction;
import io.pulumi.aws.appmesh.outputs.RouteSpecGrpcRouteMatch;
import io.pulumi.aws.appmesh.outputs.RouteSpecGrpcRouteRetryPolicy;
import io.pulumi.aws.appmesh.outputs.RouteSpecGrpcRouteTimeout;
import io.pulumi.core.annotations.OutputCustomType;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class RouteSpecGrpcRoute {
    /**
     * The action to take if a match is determined.
     * 
     */
    private final RouteSpecGrpcRouteAction action;
    /**
     * The criteria for determining an gRPC request match.
     * 
     */
    private final @Nullable RouteSpecGrpcRouteMatch match;
    /**
     * The retry policy.
     * 
     */
    private final @Nullable RouteSpecGrpcRouteRetryPolicy retryPolicy;
    /**
     * The types of timeouts.
     * 
     */
    private final @Nullable RouteSpecGrpcRouteTimeout timeout;

    @OutputCustomType.Constructor({"action","match","retryPolicy","timeout"})
    private RouteSpecGrpcRoute(
        RouteSpecGrpcRouteAction action,
        @Nullable RouteSpecGrpcRouteMatch match,
        @Nullable RouteSpecGrpcRouteRetryPolicy retryPolicy,
        @Nullable RouteSpecGrpcRouteTimeout timeout) {
        this.action = Objects.requireNonNull(action);
        this.match = match;
        this.retryPolicy = retryPolicy;
        this.timeout = timeout;
    }

    /**
     * The action to take if a match is determined.
     * 
    */
    public RouteSpecGrpcRouteAction getAction() {
        return this.action;
    }
    /**
     * The criteria for determining an gRPC request match.
     * 
    */
    public Optional<RouteSpecGrpcRouteMatch> getMatch() {
        return Optional.ofNullable(this.match);
    }
    /**
     * The retry policy.
     * 
    */
    public Optional<RouteSpecGrpcRouteRetryPolicy> getRetryPolicy() {
        return Optional.ofNullable(this.retryPolicy);
    }
    /**
     * The types of timeouts.
     * 
    */
    public Optional<RouteSpecGrpcRouteTimeout> getTimeout() {
        return Optional.ofNullable(this.timeout);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(RouteSpecGrpcRoute defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private RouteSpecGrpcRouteAction action;
        private @Nullable RouteSpecGrpcRouteMatch match;
        private @Nullable RouteSpecGrpcRouteRetryPolicy retryPolicy;
        private @Nullable RouteSpecGrpcRouteTimeout timeout;

        public Builder() {
    	      // Empty
        }

        public Builder(RouteSpecGrpcRoute defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.action = defaults.action;
    	      this.match = defaults.match;
    	      this.retryPolicy = defaults.retryPolicy;
    	      this.timeout = defaults.timeout;
        }

        public Builder setAction(RouteSpecGrpcRouteAction action) {
            this.action = Objects.requireNonNull(action);
            return this;
        }

        public Builder setMatch(@Nullable RouteSpecGrpcRouteMatch match) {
            this.match = match;
            return this;
        }

        public Builder setRetryPolicy(@Nullable RouteSpecGrpcRouteRetryPolicy retryPolicy) {
            this.retryPolicy = retryPolicy;
            return this;
        }

        public Builder setTimeout(@Nullable RouteSpecGrpcRouteTimeout timeout) {
            this.timeout = timeout;
            return this;
        }
        public RouteSpecGrpcRoute build() {
            return new RouteSpecGrpcRoute(action, match, retryPolicy, timeout);
        }
    }
}
