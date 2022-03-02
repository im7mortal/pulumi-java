// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.monitoring_v3.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import java.lang.Integer;
import java.util.Objects;

@OutputCustomType
public final class TcpCheckResponse {
    /**
     * The TCP port on the server against which to run the check. Will be combined with host (specified within the monitored_resource) to construct the full URL. Required.
     * 
     */
    private final Integer port;

    @OutputCustomType.Constructor({"port"})
    private TcpCheckResponse(Integer port) {
        this.port = Objects.requireNonNull(port);
    }

    /**
     * The TCP port on the server against which to run the check. Will be combined with host (specified within the monitored_resource) to construct the full URL. Required.
     * 
    */
    public Integer getPort() {
        return this.port;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(TcpCheckResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Integer port;

        public Builder() {
    	      // Empty
        }

        public Builder(TcpCheckResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.port = defaults.port;
        }

        public Builder setPort(Integer port) {
            this.port = Objects.requireNonNull(port);
            return this;
        }
        public TcpCheckResponse build() {
            return new TcpCheckResponse(port);
        }
    }
}
