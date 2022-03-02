// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.network.outputs;

import io.pulumi.azurenative.network.outputs.ConnectionMonitorEndpointScopeItemResponse;
import io.pulumi.core.annotations.OutputCustomType;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;

@OutputCustomType
public final class ConnectionMonitorEndpointScopeResponse {
    /**
     * List of items which needs to be excluded from the endpoint scope.
     * 
     */
    private final @Nullable List<ConnectionMonitorEndpointScopeItemResponse> exclude;
    /**
     * List of items which needs to be included to the endpoint scope.
     * 
     */
    private final @Nullable List<ConnectionMonitorEndpointScopeItemResponse> include;

    @OutputCustomType.Constructor({"exclude","include"})
    private ConnectionMonitorEndpointScopeResponse(
        @Nullable List<ConnectionMonitorEndpointScopeItemResponse> exclude,
        @Nullable List<ConnectionMonitorEndpointScopeItemResponse> include) {
        this.exclude = exclude;
        this.include = include;
    }

    /**
     * List of items which needs to be excluded from the endpoint scope.
     * 
    */
    public List<ConnectionMonitorEndpointScopeItemResponse> getExclude() {
        return this.exclude == null ? List.of() : this.exclude;
    }
    /**
     * List of items which needs to be included to the endpoint scope.
     * 
    */
    public List<ConnectionMonitorEndpointScopeItemResponse> getInclude() {
        return this.include == null ? List.of() : this.include;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ConnectionMonitorEndpointScopeResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable List<ConnectionMonitorEndpointScopeItemResponse> exclude;
        private @Nullable List<ConnectionMonitorEndpointScopeItemResponse> include;

        public Builder() {
    	      // Empty
        }

        public Builder(ConnectionMonitorEndpointScopeResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.exclude = defaults.exclude;
    	      this.include = defaults.include;
        }

        public Builder setExclude(@Nullable List<ConnectionMonitorEndpointScopeItemResponse> exclude) {
            this.exclude = exclude;
            return this;
        }

        public Builder setInclude(@Nullable List<ConnectionMonitorEndpointScopeItemResponse> include) {
            this.include = include;
            return this;
        }
        public ConnectionMonitorEndpointScopeResponse build() {
            return new ConnectionMonitorEndpointScopeResponse(exclude, include);
        }
    }
}
