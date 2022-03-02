// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.kubernetes.core_v1.outputs;

import io.pulumi.core.Either;
import io.pulumi.core.annotations.OutputCustomType;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class ServicePort {
    /**
     * The application protocol for this port. This field follows standard Kubernetes label syntax. Un-prefixed names are reserved for IANA standard service names (as per RFC-6335 and http://www.iana.org/assignments/service-names). Non-standard protocols should use prefixed names such as mycompany.com/my-custom-protocol.
     * 
     */
    private final @Nullable String appProtocol;
    /**
     * The name of this port within the service. This must be a DNS_LABEL. All ports within a ServiceSpec must have unique names. When considering the endpoints for a Service, this must match the 'name' field in the EndpointPort. Optional if only one ServicePort is defined on this service.
     * 
     */
    private final @Nullable String name;
    /**
     * The port on each node on which this service is exposed when type is NodePort or LoadBalancer.  Usually assigned by the system. If a value is specified, in-range, and not in use it will be used, otherwise the operation will fail.  If not specified, a port will be allocated if this Service requires one.  If this field is specified when creating a Service which does not need it, creation will fail. This field will be wiped when updating a Service to no longer need it (e.g. changing type from NodePort to ClusterIP). More info: https://kubernetes.io/docs/concepts/services-networking/service/#type-nodeport
     * 
     */
    private final @Nullable Integer nodePort;
    /**
     * The port that will be exposed by this service.
     * 
     */
    private final Integer port;
    /**
     * The IP protocol for this port. Supports "TCP", "UDP", and "SCTP". Default is TCP.
     * 
     * Possible enum values:
     *  - `"SCTP"` is the SCTP protocol.
     *  - `"TCP"` is the TCP protocol.
     *  - `"UDP"` is the UDP protocol.
     * 
     */
    private final @Nullable String protocol;
    /**
     * Number or name of the port to access on the pods targeted by the service. Number must be in the range 1 to 65535. Name must be an IANA_SVC_NAME. If this is a string, it will be looked up as a named port in the target Pod's container ports. If this is not specified, the value of the 'port' field is used (an identity map). This field is ignored for services with clusterIP=None, and should be omitted or set equal to the 'port' field. More info: https://kubernetes.io/docs/concepts/services-networking/service/#defining-a-service
     * 
     */
    private final @Nullable Either<Integer,String> targetPort;

    @OutputCustomType.Constructor({"appProtocol","name","nodePort","port","protocol","targetPort"})
    private ServicePort(
        @Nullable String appProtocol,
        @Nullable String name,
        @Nullable Integer nodePort,
        Integer port,
        @Nullable String protocol,
        @Nullable Either<Integer,String> targetPort) {
        this.appProtocol = appProtocol;
        this.name = name;
        this.nodePort = nodePort;
        this.port = Objects.requireNonNull(port);
        this.protocol = protocol;
        this.targetPort = targetPort;
    }

    /**
     * The application protocol for this port. This field follows standard Kubernetes label syntax. Un-prefixed names are reserved for IANA standard service names (as per RFC-6335 and http://www.iana.org/assignments/service-names). Non-standard protocols should use prefixed names such as mycompany.com/my-custom-protocol.
     * 
    */
    public Optional<String> getAppProtocol() {
        return Optional.ofNullable(this.appProtocol);
    }
    /**
     * The name of this port within the service. This must be a DNS_LABEL. All ports within a ServiceSpec must have unique names. When considering the endpoints for a Service, this must match the 'name' field in the EndpointPort. Optional if only one ServicePort is defined on this service.
     * 
    */
    public Optional<String> getName() {
        return Optional.ofNullable(this.name);
    }
    /**
     * The port on each node on which this service is exposed when type is NodePort or LoadBalancer.  Usually assigned by the system. If a value is specified, in-range, and not in use it will be used, otherwise the operation will fail.  If not specified, a port will be allocated if this Service requires one.  If this field is specified when creating a Service which does not need it, creation will fail. This field will be wiped when updating a Service to no longer need it (e.g. changing type from NodePort to ClusterIP). More info: https://kubernetes.io/docs/concepts/services-networking/service/#type-nodeport
     * 
    */
    public Optional<Integer> getNodePort() {
        return Optional.ofNullable(this.nodePort);
    }
    /**
     * The port that will be exposed by this service.
     * 
    */
    public Integer getPort() {
        return this.port;
    }
    /**
     * The IP protocol for this port. Supports "TCP", "UDP", and "SCTP". Default is TCP.
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
    /**
     * Number or name of the port to access on the pods targeted by the service. Number must be in the range 1 to 65535. Name must be an IANA_SVC_NAME. If this is a string, it will be looked up as a named port in the target Pod's container ports. If this is not specified, the value of the 'port' field is used (an identity map). This field is ignored for services with clusterIP=None, and should be omitted or set equal to the 'port' field. More info: https://kubernetes.io/docs/concepts/services-networking/service/#defining-a-service
     * 
    */
    public Optional<Either<Integer,String>> getTargetPort() {
        return Optional.ofNullable(this.targetPort);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ServicePort defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String appProtocol;
        private @Nullable String name;
        private @Nullable Integer nodePort;
        private Integer port;
        private @Nullable String protocol;
        private @Nullable Either<Integer,String> targetPort;

        public Builder() {
    	      // Empty
        }

        public Builder(ServicePort defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.appProtocol = defaults.appProtocol;
    	      this.name = defaults.name;
    	      this.nodePort = defaults.nodePort;
    	      this.port = defaults.port;
    	      this.protocol = defaults.protocol;
    	      this.targetPort = defaults.targetPort;
        }

        public Builder setAppProtocol(@Nullable String appProtocol) {
            this.appProtocol = appProtocol;
            return this;
        }

        public Builder setName(@Nullable String name) {
            this.name = name;
            return this;
        }

        public Builder setNodePort(@Nullable Integer nodePort) {
            this.nodePort = nodePort;
            return this;
        }

        public Builder setPort(Integer port) {
            this.port = Objects.requireNonNull(port);
            return this;
        }

        public Builder setProtocol(@Nullable String protocol) {
            this.protocol = protocol;
            return this;
        }

        public Builder setTargetPort(@Nullable Either<Integer,String> targetPort) {
            this.targetPort = targetPort;
            return this;
        }
        public ServicePort build() {
            return new ServicePort(appProtocol, name, nodePort, port, protocol, targetPort);
        }
    }
}
