// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.kubernetes.core_v1.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import io.pulumi.core.internal.Codegen;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * ContainerPort represents a network port in a single container.
 * 
 */
public final class ContainerPortArgs extends io.pulumi.resources.ResourceArgs {

    public static final ContainerPortArgs Empty = new ContainerPortArgs();

    /**
     * Number of port to expose on the pod's IP address. This must be a valid port number, 0 < x < 65536.
     * 
     */
    @Import(name="containerPort", required=true)
      private final Output<Integer> containerPort;

    public Output<Integer> containerPort() {
        return this.containerPort;
    }

    /**
     * What host IP to bind the external port to.
     * 
     */
    @Import(name="hostIP")
      private final @Nullable Output<String> hostIP;

    public Output<String> hostIP() {
        return this.hostIP == null ? Codegen.empty() : this.hostIP;
    }

    /**
     * Number of port to expose on the host. If specified, this must be a valid port number, 0 < x < 65536. If HostNetwork is specified, this must match ContainerPort. Most containers do not need this.
     * 
     */
    @Import(name="hostPort")
      private final @Nullable Output<Integer> hostPort;

    public Output<Integer> hostPort() {
        return this.hostPort == null ? Codegen.empty() : this.hostPort;
    }

    /**
     * If specified, this must be an IANA_SVC_NAME and unique within the pod. Each named port in a pod must have a unique name. Name for the port that can be referred to by services.
     * 
     */
    @Import(name="name")
      private final @Nullable Output<String> name;

    public Output<String> name() {
        return this.name == null ? Codegen.empty() : this.name;
    }

    /**
     * Protocol for port. Must be UDP, TCP, or SCTP. Defaults to "TCP".
     * 
     * Possible enum values:
     *  - `"SCTP"` is the SCTP protocol.
     *  - `"TCP"` is the TCP protocol.
     *  - `"UDP"` is the UDP protocol.
     * 
     */
    @Import(name="protocol")
      private final @Nullable Output<String> protocol;

    public Output<String> protocol() {
        return this.protocol == null ? Codegen.empty() : this.protocol;
    }

    public ContainerPortArgs(
        Output<Integer> containerPort,
        @Nullable Output<String> hostIP,
        @Nullable Output<Integer> hostPort,
        @Nullable Output<String> name,
        @Nullable Output<String> protocol) {
        this.containerPort = Objects.requireNonNull(containerPort, "expected parameter 'containerPort' to be non-null");
        this.hostIP = hostIP;
        this.hostPort = hostPort;
        this.name = name;
        this.protocol = protocol;
    }

    private ContainerPortArgs() {
        this.containerPort = Codegen.empty();
        this.hostIP = Codegen.empty();
        this.hostPort = Codegen.empty();
        this.name = Codegen.empty();
        this.protocol = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ContainerPortArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Output<Integer> containerPort;
        private @Nullable Output<String> hostIP;
        private @Nullable Output<Integer> hostPort;
        private @Nullable Output<String> name;
        private @Nullable Output<String> protocol;

        public Builder() {
    	      // Empty
        }

        public Builder(ContainerPortArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.containerPort = defaults.containerPort;
    	      this.hostIP = defaults.hostIP;
    	      this.hostPort = defaults.hostPort;
    	      this.name = defaults.name;
    	      this.protocol = defaults.protocol;
        }

        public Builder containerPort(Output<Integer> containerPort) {
            this.containerPort = Objects.requireNonNull(containerPort);
            return this;
        }
        public Builder containerPort(Integer containerPort) {
            this.containerPort = Output.of(Objects.requireNonNull(containerPort));
            return this;
        }
        public Builder hostIP(@Nullable Output<String> hostIP) {
            this.hostIP = hostIP;
            return this;
        }
        public Builder hostIP(@Nullable String hostIP) {
            this.hostIP = Codegen.ofNullable(hostIP);
            return this;
        }
        public Builder hostPort(@Nullable Output<Integer> hostPort) {
            this.hostPort = hostPort;
            return this;
        }
        public Builder hostPort(@Nullable Integer hostPort) {
            this.hostPort = Codegen.ofNullable(hostPort);
            return this;
        }
        public Builder name(@Nullable Output<String> name) {
            this.name = name;
            return this;
        }
        public Builder name(@Nullable String name) {
            this.name = Codegen.ofNullable(name);
            return this;
        }
        public Builder protocol(@Nullable Output<String> protocol) {
            this.protocol = protocol;
            return this;
        }
        public Builder protocol(@Nullable String protocol) {
            this.protocol = Codegen.ofNullable(protocol);
            return this;
        }        public ContainerPortArgs build() {
            return new ContainerPortArgs(containerPort, hostIP, hostPort, name, protocol);
        }
    }
}
