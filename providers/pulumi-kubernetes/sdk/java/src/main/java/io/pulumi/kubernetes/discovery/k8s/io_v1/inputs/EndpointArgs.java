// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.kubernetes.discovery.k8s.io_v1.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import io.pulumi.kubernetes.core_v1.inputs.ObjectReferenceArgs;
import io.pulumi.kubernetes.discovery.k8s.io_v1.inputs.EndpointConditionsArgs;
import io.pulumi.kubernetes.discovery.k8s.io_v1.inputs.EndpointHintsArgs;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * Endpoint represents a single logical "backend" implementing a service.
 * 
 */
public final class EndpointArgs extends io.pulumi.resources.ResourceArgs {

    public static final EndpointArgs Empty = new EndpointArgs();

    /**
     * addresses of this endpoint. The contents of this field are interpreted according to the corresponding EndpointSlice addressType field. Consumers must handle different types of addresses in the context of their own capabilities. This must contain at least one address but no more than 100.
     * 
     */
    @InputImport(name="addresses", required=true)
    private final Input<List<String>> addresses;

    public Input<List<String>> getAddresses() {
        return this.addresses;
    }

    /**
     * conditions contains information about the current status of the endpoint.
     * 
     */
    @InputImport(name="conditions")
    private final @Nullable Input<EndpointConditionsArgs> conditions;

    public Input<EndpointConditionsArgs> getConditions() {
        return this.conditions == null ? Input.empty() : this.conditions;
    }

    /**
     * deprecatedTopology contains topology information part of the v1beta1 API. This field is deprecated, and will be removed when the v1beta1 API is removed (no sooner than kubernetes v1.24).  While this field can hold values, it is not writable through the v1 API, and any attempts to write to it will be silently ignored. Topology information can be found in the zone and nodeName fields instead.
     * 
     */
    @InputImport(name="deprecatedTopology")
    private final @Nullable Input<Map<String,String>> deprecatedTopology;

    public Input<Map<String,String>> getDeprecatedTopology() {
        return this.deprecatedTopology == null ? Input.empty() : this.deprecatedTopology;
    }

    /**
     * hints contains information associated with how an endpoint should be consumed.
     * 
     */
    @InputImport(name="hints")
    private final @Nullable Input<EndpointHintsArgs> hints;

    public Input<EndpointHintsArgs> getHints() {
        return this.hints == null ? Input.empty() : this.hints;
    }

    /**
     * hostname of this endpoint. This field may be used by consumers of endpoints to distinguish endpoints from each other (e.g. in DNS names). Multiple endpoints which use the same hostname should be considered fungible (e.g. multiple A values in DNS). Must be lowercase and pass DNS Label (RFC 1123) validation.
     * 
     */
    @InputImport(name="hostname")
    private final @Nullable Input<String> hostname;

    public Input<String> getHostname() {
        return this.hostname == null ? Input.empty() : this.hostname;
    }

    /**
     * nodeName represents the name of the Node hosting this endpoint. This can be used to determine endpoints local to a Node. This field can be enabled with the EndpointSliceNodeName feature gate.
     * 
     */
    @InputImport(name="nodeName")
    private final @Nullable Input<String> nodeName;

    public Input<String> getNodeName() {
        return this.nodeName == null ? Input.empty() : this.nodeName;
    }

    /**
     * targetRef is a reference to a Kubernetes object that represents this endpoint.
     * 
     */
    @InputImport(name="targetRef")
    private final @Nullable Input<ObjectReferenceArgs> targetRef;

    public Input<ObjectReferenceArgs> getTargetRef() {
        return this.targetRef == null ? Input.empty() : this.targetRef;
    }

    /**
     * zone is the name of the Zone this endpoint exists in.
     * 
     */
    @InputImport(name="zone")
    private final @Nullable Input<String> zone;

    public Input<String> getZone() {
        return this.zone == null ? Input.empty() : this.zone;
    }

    public EndpointArgs(
        Input<List<String>> addresses,
        @Nullable Input<EndpointConditionsArgs> conditions,
        @Nullable Input<Map<String,String>> deprecatedTopology,
        @Nullable Input<EndpointHintsArgs> hints,
        @Nullable Input<String> hostname,
        @Nullable Input<String> nodeName,
        @Nullable Input<ObjectReferenceArgs> targetRef,
        @Nullable Input<String> zone) {
        this.addresses = Objects.requireNonNull(addresses, "expected parameter 'addresses' to be non-null");
        this.conditions = conditions;
        this.deprecatedTopology = deprecatedTopology;
        this.hints = hints;
        this.hostname = hostname;
        this.nodeName = nodeName;
        this.targetRef = targetRef;
        this.zone = zone;
    }

    private EndpointArgs() {
        this.addresses = Input.empty();
        this.conditions = Input.empty();
        this.deprecatedTopology = Input.empty();
        this.hints = Input.empty();
        this.hostname = Input.empty();
        this.nodeName = Input.empty();
        this.targetRef = Input.empty();
        this.zone = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(EndpointArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Input<List<String>> addresses;
        private @Nullable Input<EndpointConditionsArgs> conditions;
        private @Nullable Input<Map<String,String>> deprecatedTopology;
        private @Nullable Input<EndpointHintsArgs> hints;
        private @Nullable Input<String> hostname;
        private @Nullable Input<String> nodeName;
        private @Nullable Input<ObjectReferenceArgs> targetRef;
        private @Nullable Input<String> zone;

        public Builder() {
    	      // Empty
        }

        public Builder(EndpointArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.addresses = defaults.addresses;
    	      this.conditions = defaults.conditions;
    	      this.deprecatedTopology = defaults.deprecatedTopology;
    	      this.hints = defaults.hints;
    	      this.hostname = defaults.hostname;
    	      this.nodeName = defaults.nodeName;
    	      this.targetRef = defaults.targetRef;
    	      this.zone = defaults.zone;
        }

        public Builder setAddresses(Input<List<String>> addresses) {
            this.addresses = Objects.requireNonNull(addresses);
            return this;
        }

        public Builder setAddresses(List<String> addresses) {
            this.addresses = Input.of(Objects.requireNonNull(addresses));
            return this;
        }

        public Builder setConditions(@Nullable Input<EndpointConditionsArgs> conditions) {
            this.conditions = conditions;
            return this;
        }

        public Builder setConditions(@Nullable EndpointConditionsArgs conditions) {
            this.conditions = Input.ofNullable(conditions);
            return this;
        }

        public Builder setDeprecatedTopology(@Nullable Input<Map<String,String>> deprecatedTopology) {
            this.deprecatedTopology = deprecatedTopology;
            return this;
        }

        public Builder setDeprecatedTopology(@Nullable Map<String,String> deprecatedTopology) {
            this.deprecatedTopology = Input.ofNullable(deprecatedTopology);
            return this;
        }

        public Builder setHints(@Nullable Input<EndpointHintsArgs> hints) {
            this.hints = hints;
            return this;
        }

        public Builder setHints(@Nullable EndpointHintsArgs hints) {
            this.hints = Input.ofNullable(hints);
            return this;
        }

        public Builder setHostname(@Nullable Input<String> hostname) {
            this.hostname = hostname;
            return this;
        }

        public Builder setHostname(@Nullable String hostname) {
            this.hostname = Input.ofNullable(hostname);
            return this;
        }

        public Builder setNodeName(@Nullable Input<String> nodeName) {
            this.nodeName = nodeName;
            return this;
        }

        public Builder setNodeName(@Nullable String nodeName) {
            this.nodeName = Input.ofNullable(nodeName);
            return this;
        }

        public Builder setTargetRef(@Nullable Input<ObjectReferenceArgs> targetRef) {
            this.targetRef = targetRef;
            return this;
        }

        public Builder setTargetRef(@Nullable ObjectReferenceArgs targetRef) {
            this.targetRef = Input.ofNullable(targetRef);
            return this;
        }

        public Builder setZone(@Nullable Input<String> zone) {
            this.zone = zone;
            return this;
        }

        public Builder setZone(@Nullable String zone) {
            this.zone = Input.ofNullable(zone);
            return this;
        }

        public EndpointArgs build() {
            return new EndpointArgs(addresses, conditions, deprecatedTopology, hints, hostname, nodeName, targetRef, zone);
        }
    }
}
