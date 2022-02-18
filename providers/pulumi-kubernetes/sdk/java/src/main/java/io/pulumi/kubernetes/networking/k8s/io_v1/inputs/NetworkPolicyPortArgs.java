// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.kubernetes.networking.k8s.io_v1.inputs;

import io.pulumi.core.Either;
import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * NetworkPolicyPort describes a port to allow traffic on
 * 
 */
public final class NetworkPolicyPortArgs extends io.pulumi.resources.ResourceArgs {

    public static final NetworkPolicyPortArgs Empty = new NetworkPolicyPortArgs();

    /**
     * If set, indicates that the range of ports from port to endPort, inclusive, should be allowed by the policy. This field cannot be defined if the port field is not defined or if the port field is defined as a named (string) port. The endPort must be equal or greater than port. This feature is in Beta state and is enabled by default. It can be disabled using the Feature Gate "NetworkPolicyEndPort".
     * 
     */
    @InputImport(name="endPort")
    private final @Nullable Input<Integer> endPort;

    public Input<Integer> getEndPort() {
        return this.endPort == null ? Input.empty() : this.endPort;
    }

    /**
     * The port on the given protocol. This can either be a numerical or named port on a pod. If this field is not provided, this matches all port names and numbers. If present, only traffic on the specified protocol AND port will be matched.
     * 
     */
    @InputImport(name="port")
    private final @Nullable Input<Either<Integer,String>> port;

    public Input<Either<Integer,String>> getPort() {
        return this.port == null ? Input.empty() : this.port;
    }

    /**
     * The protocol (TCP, UDP, or SCTP) which traffic must match. If not specified, this field defaults to TCP.
     * 
     */
    @InputImport(name="protocol")
    private final @Nullable Input<String> protocol;

    public Input<String> getProtocol() {
        return this.protocol == null ? Input.empty() : this.protocol;
    }

    public NetworkPolicyPortArgs(
        @Nullable Input<Integer> endPort,
        @Nullable Input<Either<Integer,String>> port,
        @Nullable Input<String> protocol) {
        this.endPort = endPort;
        this.port = port;
        this.protocol = protocol;
    }

    private NetworkPolicyPortArgs() {
        this.endPort = Input.empty();
        this.port = Input.empty();
        this.protocol = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(NetworkPolicyPortArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<Integer> endPort;
        private @Nullable Input<Either<Integer,String>> port;
        private @Nullable Input<String> protocol;

        public Builder() {
    	      // Empty
        }

        public Builder(NetworkPolicyPortArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.endPort = defaults.endPort;
    	      this.port = defaults.port;
    	      this.protocol = defaults.protocol;
        }

        public Builder setEndPort(@Nullable Input<Integer> endPort) {
            this.endPort = endPort;
            return this;
        }

        public Builder setEndPort(@Nullable Integer endPort) {
            this.endPort = Input.ofNullable(endPort);
            return this;
        }

        public Builder setPort(@Nullable Input<Either<Integer,String>> port) {
            this.port = port;
            return this;
        }

        public Builder setPort(@Nullable Either<Integer,String> port) {
            this.port = Input.ofNullable(port);
            return this;
        }

        public Builder setProtocol(@Nullable Input<String> protocol) {
            this.protocol = protocol;
            return this;
        }

        public Builder setProtocol(@Nullable String protocol) {
            this.protocol = Input.ofNullable(protocol);
            return this;
        }

        public NetworkPolicyPortArgs build() {
            return new NetworkPolicyPortArgs(endPort, port, protocol);
        }
    }
}
