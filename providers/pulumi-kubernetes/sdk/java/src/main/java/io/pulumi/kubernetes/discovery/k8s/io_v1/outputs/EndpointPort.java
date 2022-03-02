// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.kubernetes.discovery.k8s.io_v1.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class EndpointPort {
    /**
     * The application protocol for this port. This field follows standard Kubernetes label syntax. Un-prefixed names are reserved for IANA standard service names (as per RFC-6335 and http://www.iana.org/assignments/service-names). Non-standard protocols should use prefixed names such as mycompany.com/my-custom-protocol.
     * 
     */
    private final @Nullable String appProtocol;
    /**
     * The name of this port. All ports in an EndpointSlice must have a unique name. If the EndpointSlice is dervied from a Kubernetes service, this corresponds to the Service.ports[].name. Name must either be an empty string or pass DNS_LABEL validation: * must be no more than 63 characters long. * must consist of lower case alphanumeric characters or '-'. * must start and end with an alphanumeric character. Default is empty string.
     * 
     */
    private final @Nullable String name;
    /**
     * The port number of the endpoint. If this is not specified, ports are not restricted and must be interpreted in the context of the specific consumer.
     * 
     */
    private final @Nullable Integer port;
    /**
     * The IP protocol for this port. Must be UDP, TCP, or SCTP. Default is TCP.
     * 
     */
    private final @Nullable String protocol;

    @OutputCustomType.Constructor({"appProtocol","name","port","protocol"})
    private EndpointPort(
        @Nullable String appProtocol,
        @Nullable String name,
        @Nullable Integer port,
        @Nullable String protocol) {
        this.appProtocol = appProtocol;
        this.name = name;
        this.port = port;
        this.protocol = protocol;
    }

    /**
     * The application protocol for this port. This field follows standard Kubernetes label syntax. Un-prefixed names are reserved for IANA standard service names (as per RFC-6335 and http://www.iana.org/assignments/service-names). Non-standard protocols should use prefixed names such as mycompany.com/my-custom-protocol.
     * 
    */
    public Optional<String> getAppProtocol() {
        return Optional.ofNullable(this.appProtocol);
    }
    /**
     * The name of this port. All ports in an EndpointSlice must have a unique name. If the EndpointSlice is dervied from a Kubernetes service, this corresponds to the Service.ports[].name. Name must either be an empty string or pass DNS_LABEL validation: * must be no more than 63 characters long. * must consist of lower case alphanumeric characters or '-'. * must start and end with an alphanumeric character. Default is empty string.
     * 
    */
    public Optional<String> getName() {
        return Optional.ofNullable(this.name);
    }
    /**
     * The port number of the endpoint. If this is not specified, ports are not restricted and must be interpreted in the context of the specific consumer.
     * 
    */
    public Optional<Integer> getPort() {
        return Optional.ofNullable(this.port);
    }
    /**
     * The IP protocol for this port. Must be UDP, TCP, or SCTP. Default is TCP.
     * 
    */
    public Optional<String> getProtocol() {
        return Optional.ofNullable(this.protocol);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(EndpointPort defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String appProtocol;
        private @Nullable String name;
        private @Nullable Integer port;
        private @Nullable String protocol;

        public Builder() {
    	      // Empty
        }

        public Builder(EndpointPort defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.appProtocol = defaults.appProtocol;
    	      this.name = defaults.name;
    	      this.port = defaults.port;
    	      this.protocol = defaults.protocol;
        }

        public Builder setAppProtocol(@Nullable String appProtocol) {
            this.appProtocol = appProtocol;
            return this;
        }

        public Builder setName(@Nullable String name) {
            this.name = name;
            return this;
        }

        public Builder setPort(@Nullable Integer port) {
            this.port = port;
            return this;
        }

        public Builder setProtocol(@Nullable String protocol) {
            this.protocol = protocol;
            return this;
        }
        public EndpointPort build() {
            return new EndpointPort(appProtocol, name, port, protocol);
        }
    }
}
