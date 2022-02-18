// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.kubernetes.discovery.k8s.io_v1beta1.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import io.pulumi.kubernetes.core_v1.outputs.ObjectReference;
import io.pulumi.kubernetes.discovery.k8s.io_v1beta1.outputs.EndpointConditions;
import io.pulumi.kubernetes.discovery.k8s.io_v1beta1.outputs.EndpointHints;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class Endpoint {
    /**
     * addresses of this endpoint. The contents of this field are interpreted according to the corresponding EndpointSlice addressType field. Consumers must handle different types of addresses in the context of their own capabilities. This must contain at least one address but no more than 100.
     * 
     */
    private final List<String> addresses;
    /**
     * conditions contains information about the current status of the endpoint.
     * 
     */
    private final @Nullable EndpointConditions conditions;
    /**
     * hints contains information associated with how an endpoint should be consumed.
     * 
     */
    private final @Nullable EndpointHints hints;
    /**
     * hostname of this endpoint. This field may be used by consumers of endpoints to distinguish endpoints from each other (e.g. in DNS names). Multiple endpoints which use the same hostname should be considered fungible (e.g. multiple A values in DNS). Must be lowercase and pass DNS Label (RFC 1123) validation.
     * 
     */
    private final @Nullable String hostname;
    /**
     * nodeName represents the name of the Node hosting this endpoint. This can be used to determine endpoints local to a Node. This field can be enabled with the EndpointSliceNodeName feature gate.
     * 
     */
    private final @Nullable String nodeName;
    /**
     * targetRef is a reference to a Kubernetes object that represents this endpoint.
     * 
     */
    private final @Nullable ObjectReference targetRef;
    /**
     * topology contains arbitrary topology information associated with the endpoint. These key/value pairs must conform with the label format. https://kubernetes.io/docs/concepts/overview/working-with-objects/labels Topology may include a maximum of 16 key/value pairs. This includes, but is not limited to the following well known keys: * kubernetes.io/hostname: the value indicates the hostname of the node
     *   where the endpoint is located. This should match the corresponding
     *   node label.
     * * topology.kubernetes.io/zone: the value indicates the zone where the
     *   endpoint is located. This should match the corresponding node label.
     * * topology.kubernetes.io/region: the value indicates the region where the
     *   endpoint is located. This should match the corresponding node label.
     *   This field is deprecated and will be removed in future api versions.
     * 
     */
    private final @Nullable Map<String,String> topology;

    @OutputCustomType.Constructor({"addresses","conditions","hints","hostname","nodeName","targetRef","topology"})
    private Endpoint(
        List<String> addresses,
        @Nullable EndpointConditions conditions,
        @Nullable EndpointHints hints,
        @Nullable String hostname,
        @Nullable String nodeName,
        @Nullable ObjectReference targetRef,
        @Nullable Map<String,String> topology) {
        this.addresses = Objects.requireNonNull(addresses);
        this.conditions = conditions;
        this.hints = hints;
        this.hostname = hostname;
        this.nodeName = nodeName;
        this.targetRef = targetRef;
        this.topology = topology;
    }

    /**
     * addresses of this endpoint. The contents of this field are interpreted according to the corresponding EndpointSlice addressType field. Consumers must handle different types of addresses in the context of their own capabilities. This must contain at least one address but no more than 100.
     * 
     */
    public List<String> getAddresses() {
        return this.addresses;
    }
    /**
     * conditions contains information about the current status of the endpoint.
     * 
     */
    public Optional<EndpointConditions> getConditions() {
        return Optional.ofNullable(this.conditions);
    }
    /**
     * hints contains information associated with how an endpoint should be consumed.
     * 
     */
    public Optional<EndpointHints> getHints() {
        return Optional.ofNullable(this.hints);
    }
    /**
     * hostname of this endpoint. This field may be used by consumers of endpoints to distinguish endpoints from each other (e.g. in DNS names). Multiple endpoints which use the same hostname should be considered fungible (e.g. multiple A values in DNS). Must be lowercase and pass DNS Label (RFC 1123) validation.
     * 
     */
    public Optional<String> getHostname() {
        return Optional.ofNullable(this.hostname);
    }
    /**
     * nodeName represents the name of the Node hosting this endpoint. This can be used to determine endpoints local to a Node. This field can be enabled with the EndpointSliceNodeName feature gate.
     * 
     */
    public Optional<String> getNodeName() {
        return Optional.ofNullable(this.nodeName);
    }
    /**
     * targetRef is a reference to a Kubernetes object that represents this endpoint.
     * 
     */
    public Optional<ObjectReference> getTargetRef() {
        return Optional.ofNullable(this.targetRef);
    }
    /**
     * topology contains arbitrary topology information associated with the endpoint. These key/value pairs must conform with the label format. https://kubernetes.io/docs/concepts/overview/working-with-objects/labels Topology may include a maximum of 16 key/value pairs. This includes, but is not limited to the following well known keys: * kubernetes.io/hostname: the value indicates the hostname of the node
     *   where the endpoint is located. This should match the corresponding
     *   node label.
     * * topology.kubernetes.io/zone: the value indicates the zone where the
     *   endpoint is located. This should match the corresponding node label.
     * * topology.kubernetes.io/region: the value indicates the region where the
     *   endpoint is located. This should match the corresponding node label.
     *   This field is deprecated and will be removed in future api versions.
     * 
     */
    public Map<String,String> getTopology() {
        return this.topology == null ? Map.of() : this.topology;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(Endpoint defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private List<String> addresses;
        private @Nullable EndpointConditions conditions;
        private @Nullable EndpointHints hints;
        private @Nullable String hostname;
        private @Nullable String nodeName;
        private @Nullable ObjectReference targetRef;
        private @Nullable Map<String,String> topology;

        public Builder() {
    	      // Empty
        }

        public Builder(Endpoint defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.addresses = defaults.addresses;
    	      this.conditions = defaults.conditions;
    	      this.hints = defaults.hints;
    	      this.hostname = defaults.hostname;
    	      this.nodeName = defaults.nodeName;
    	      this.targetRef = defaults.targetRef;
    	      this.topology = defaults.topology;
        }

        public Builder setAddresses(List<String> addresses) {
            this.addresses = Objects.requireNonNull(addresses);
            return this;
        }

        public Builder setConditions(@Nullable EndpointConditions conditions) {
            this.conditions = conditions;
            return this;
        }

        public Builder setHints(@Nullable EndpointHints hints) {
            this.hints = hints;
            return this;
        }

        public Builder setHostname(@Nullable String hostname) {
            this.hostname = hostname;
            return this;
        }

        public Builder setNodeName(@Nullable String nodeName) {
            this.nodeName = nodeName;
            return this;
        }

        public Builder setTargetRef(@Nullable ObjectReference targetRef) {
            this.targetRef = targetRef;
            return this;
        }

        public Builder setTopology(@Nullable Map<String,String> topology) {
            this.topology = topology;
            return this;
        }

        public Endpoint build() {
            return new Endpoint(addresses, conditions, hints, hostname, nodeName, targetRef, topology);
        }
    }
}
