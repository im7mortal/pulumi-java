// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.kubernetes.core_v1.inputs;

import io.pulumi.core.Either;
import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * ServicePort contains information on service's port.
 * 
 */
public final class ServicePortArgs extends io.pulumi.resources.ResourceArgs {

    public static final ServicePortArgs Empty = new ServicePortArgs();

    /**
     * The application protocol for this port. This field follows standard Kubernetes label syntax. Un-prefixed names are reserved for IANA standard service names (as per RFC-6335 and http://www.iana.org/assignments/service-names). Non-standard protocols should use prefixed names such as mycompany.com/my-custom-protocol.
     * 
     */
    @InputImport(name="appProtocol")
    private final @Nullable Input<String> appProtocol;

    public Input<String> getAppProtocol() {
        return this.appProtocol == null ? Input.empty() : this.appProtocol;
    }

    /**
     * The name of this port within the service. This must be a DNS_LABEL. All ports within a ServiceSpec must have unique names. When considering the endpoints for a Service, this must match the 'name' field in the EndpointPort. Optional if only one ServicePort is defined on this service.
     * 
     */
    @InputImport(name="name")
    private final @Nullable Input<String> name;

    public Input<String> getName() {
        return this.name == null ? Input.empty() : this.name;
    }

    /**
     * The port on each node on which this service is exposed when type is NodePort or LoadBalancer.  Usually assigned by the system. If a value is specified, in-range, and not in use it will be used, otherwise the operation will fail.  If not specified, a port will be allocated if this Service requires one.  If this field is specified when creating a Service which does not need it, creation will fail. This field will be wiped when updating a Service to no longer need it (e.g. changing type from NodePort to ClusterIP). More info: https://kubernetes.io/docs/concepts/services-networking/service/#type-nodeport
     * 
     */
    @InputImport(name="nodePort")
    private final @Nullable Input<Integer> nodePort;

    public Input<Integer> getNodePort() {
        return this.nodePort == null ? Input.empty() : this.nodePort;
    }

    /**
     * The port that will be exposed by this service.
     * 
     */
    @InputImport(name="port", required=true)
    private final Input<Integer> port;

    public Input<Integer> getPort() {
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
    @InputImport(name="protocol")
    private final @Nullable Input<String> protocol;

    public Input<String> getProtocol() {
        return this.protocol == null ? Input.empty() : this.protocol;
    }

    /**
     * Number or name of the port to access on the pods targeted by the service. Number must be in the range 1 to 65535. Name must be an IANA_SVC_NAME. If this is a string, it will be looked up as a named port in the target Pod's container ports. If this is not specified, the value of the 'port' field is used (an identity map). This field is ignored for services with clusterIP=None, and should be omitted or set equal to the 'port' field. More info: https://kubernetes.io/docs/concepts/services-networking/service/#defining-a-service
     * 
     */
    @InputImport(name="targetPort")
    private final @Nullable Input<Either<Integer,String>> targetPort;

    public Input<Either<Integer,String>> getTargetPort() {
        return this.targetPort == null ? Input.empty() : this.targetPort;
    }

    public ServicePortArgs(
        @Nullable Input<String> appProtocol,
        @Nullable Input<String> name,
        @Nullable Input<Integer> nodePort,
        Input<Integer> port,
        @Nullable Input<String> protocol,
        @Nullable Input<Either<Integer,String>> targetPort) {
        this.appProtocol = appProtocol;
        this.name = name;
        this.nodePort = nodePort;
        this.port = Objects.requireNonNull(port, "expected parameter 'port' to be non-null");
        this.protocol = protocol;
        this.targetPort = targetPort;
    }

    private ServicePortArgs() {
        this.appProtocol = Input.empty();
        this.name = Input.empty();
        this.nodePort = Input.empty();
        this.port = Input.empty();
        this.protocol = Input.empty();
        this.targetPort = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ServicePortArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<String> appProtocol;
        private @Nullable Input<String> name;
        private @Nullable Input<Integer> nodePort;
        private Input<Integer> port;
        private @Nullable Input<String> protocol;
        private @Nullable Input<Either<Integer,String>> targetPort;

        public Builder() {
    	      // Empty
        }

        public Builder(ServicePortArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.appProtocol = defaults.appProtocol;
    	      this.name = defaults.name;
    	      this.nodePort = defaults.nodePort;
    	      this.port = defaults.port;
    	      this.protocol = defaults.protocol;
    	      this.targetPort = defaults.targetPort;
        }

        public Builder setAppProtocol(@Nullable Input<String> appProtocol) {
            this.appProtocol = appProtocol;
            return this;
        }

        public Builder setAppProtocol(@Nullable String appProtocol) {
            this.appProtocol = Input.ofNullable(appProtocol);
            return this;
        }

        public Builder setName(@Nullable Input<String> name) {
            this.name = name;
            return this;
        }

        public Builder setName(@Nullable String name) {
            this.name = Input.ofNullable(name);
            return this;
        }

        public Builder setNodePort(@Nullable Input<Integer> nodePort) {
            this.nodePort = nodePort;
            return this;
        }

        public Builder setNodePort(@Nullable Integer nodePort) {
            this.nodePort = Input.ofNullable(nodePort);
            return this;
        }

        public Builder setPort(Input<Integer> port) {
            this.port = Objects.requireNonNull(port);
            return this;
        }

        public Builder setPort(Integer port) {
            this.port = Input.of(Objects.requireNonNull(port));
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

        public Builder setTargetPort(@Nullable Input<Either<Integer,String>> targetPort) {
            this.targetPort = targetPort;
            return this;
        }

        public Builder setTargetPort(@Nullable Either<Integer,String> targetPort) {
            this.targetPort = Input.ofNullable(targetPort);
            return this;
        }

        public ServicePortArgs build() {
            return new ServicePortArgs(appProtocol, name, nodePort, port, protocol, targetPort);
        }
    }
}
