// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.kubernetes.core_v1.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class ContainerPort {
    /**
     * Number of port to expose on the pod's IP address. This must be a valid port number, 0 < x < 65536.
     * 
     */
    private final Integer containerPort;
    /**
     * What host IP to bind the external port to.
     * 
     */
    private final @Nullable String hostIP;
    /**
     * Number of port to expose on the host. If specified, this must be a valid port number, 0 < x < 65536. If HostNetwork is specified, this must match ContainerPort. Most containers do not need this.
     * 
     */
    private final @Nullable Integer hostPort;
    /**
     * If specified, this must be an IANA_SVC_NAME and unique within the pod. Each named port in a pod must have a unique name. Name for the port that can be referred to by services.
     * 
     */
    private final @Nullable String name;
    /**
     * Protocol for port. Must be UDP, TCP, or SCTP. Defaults to "TCP".
     * 
     * Possible enum values:
     *  - `"SCTP"` is the SCTP protocol.
     *  - `"TCP"` is the TCP protocol.
     *  - `"UDP"` is the UDP protocol.
     * 
     */
    private final @Nullable String protocol;

    @OutputCustomType.Constructor({"containerPort","hostIP","hostPort","name","protocol"})
    private ContainerPort(
        Integer containerPort,
        @Nullable String hostIP,
        @Nullable Integer hostPort,
        @Nullable String name,
        @Nullable String protocol) {
        this.containerPort = Objects.requireNonNull(containerPort);
        this.hostIP = hostIP;
        this.hostPort = hostPort;
        this.name = name;
        this.protocol = protocol;
    }

    /**
     * Number of port to expose on the pod's IP address. This must be a valid port number, 0 < x < 65536.
     * 
     */
    public Integer getContainerPort() {
        return this.containerPort;
    }
    /**
     * What host IP to bind the external port to.
     * 
     */
    public Optional<String> getHostIP() {
        return Optional.ofNullable(this.hostIP);
    }
    /**
     * Number of port to expose on the host. If specified, this must be a valid port number, 0 < x < 65536. If HostNetwork is specified, this must match ContainerPort. Most containers do not need this.
     * 
     */
    public Optional<Integer> getHostPort() {
        return Optional.ofNullable(this.hostPort);
    }
    /**
     * If specified, this must be an IANA_SVC_NAME and unique within the pod. Each named port in a pod must have a unique name. Name for the port that can be referred to by services.
     * 
     */
    public Optional<String> getName() {
        return Optional.ofNullable(this.name);
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
    public Optional<String> getProtocol() {
        return Optional.ofNullable(this.protocol);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ContainerPort defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Integer containerPort;
        private @Nullable String hostIP;
        private @Nullable Integer hostPort;
        private @Nullable String name;
        private @Nullable String protocol;

        public Builder() {
    	      // Empty
        }

        public Builder(ContainerPort defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.containerPort = defaults.containerPort;
    	      this.hostIP = defaults.hostIP;
    	      this.hostPort = defaults.hostPort;
    	      this.name = defaults.name;
    	      this.protocol = defaults.protocol;
        }

        public Builder setContainerPort(Integer containerPort) {
            this.containerPort = Objects.requireNonNull(containerPort);
            return this;
        }

        public Builder setHostIP(@Nullable String hostIP) {
            this.hostIP = hostIP;
            return this;
        }

        public Builder setHostPort(@Nullable Integer hostPort) {
            this.hostPort = hostPort;
            return this;
        }

        public Builder setName(@Nullable String name) {
            this.name = name;
            return this;
        }

        public Builder setProtocol(@Nullable String protocol) {
            this.protocol = protocol;
            return this;
        }

        public ContainerPort build() {
            return new ContainerPort(containerPort, hostIP, hostPort, name, protocol);
        }
    }
}
