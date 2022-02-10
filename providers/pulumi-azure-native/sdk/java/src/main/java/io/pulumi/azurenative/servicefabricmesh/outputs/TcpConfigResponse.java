// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.servicefabricmesh.outputs;

import io.pulumi.azurenative.servicefabricmesh.outputs.GatewayDestinationResponse;
import io.pulumi.core.internal.annotations.OutputCustomType;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;

@OutputCustomType
public final class TcpConfigResponse {
    private final GatewayDestinationResponse destination;
    private final String name;
    private final Integer port;

    @OutputCustomType.Constructor({"destination","name","port"})
    private TcpConfigResponse(
        GatewayDestinationResponse destination,
        String name,
        Integer port) {
        this.destination = Objects.requireNonNull(destination);
        this.name = Objects.requireNonNull(name);
        this.port = Objects.requireNonNull(port);
    }

    public GatewayDestinationResponse getDestination() {
        return this.destination;
    }
    public String getName() {
        return this.name;
    }
    public Integer getPort() {
        return this.port;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(TcpConfigResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GatewayDestinationResponse destination;
        private String name;
        private Integer port;

        public Builder() {
    	      // Empty
        }

        public Builder(TcpConfigResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.destination = defaults.destination;
    	      this.name = defaults.name;
    	      this.port = defaults.port;
        }

        public Builder setDestination(GatewayDestinationResponse destination) {
            this.destination = Objects.requireNonNull(destination);
            return this;
        }

        public Builder setName(String name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }

        public Builder setPort(Integer port) {
            this.port = Objects.requireNonNull(port);
            return this;
        }

        public TcpConfigResponse build() {
            return new TcpConfigResponse(destination, name, port);
        }
    }
}