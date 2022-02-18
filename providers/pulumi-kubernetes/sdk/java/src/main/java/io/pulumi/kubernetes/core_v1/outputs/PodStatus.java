// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.kubernetes.core_v1.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import io.pulumi.kubernetes.core_v1.outputs.ContainerStatus;
import io.pulumi.kubernetes.core_v1.outputs.PodCondition;
import io.pulumi.kubernetes.core_v1.outputs.PodIP;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class PodStatus {
    /**
     * Current service state of pod. More info: https://kubernetes.io/docs/concepts/workloads/pods/pod-lifecycle#pod-conditions
     * 
     */
    private final @Nullable List<PodCondition> conditions;
    /**
     * The list has one entry per container in the manifest. Each entry is currently the output of `docker inspect`. More info: https://kubernetes.io/docs/concepts/workloads/pods/pod-lifecycle#pod-and-container-status
     * 
     */
    private final @Nullable List<ContainerStatus> containerStatuses;
    /**
     * Status for any ephemeral containers that have run in this pod. This field is beta-level and available on clusters that haven't disabled the EphemeralContainers feature gate.
     * 
     */
    private final @Nullable List<ContainerStatus> ephemeralContainerStatuses;
    /**
     * IP address of the host to which the pod is assigned. Empty if not yet scheduled.
     * 
     */
    private final @Nullable String hostIP;
    /**
     * The list has one entry per init container in the manifest. The most recent successful init container will have ready = true, the most recently started container will have startTime set. More info: https://kubernetes.io/docs/concepts/workloads/pods/pod-lifecycle#pod-and-container-status
     * 
     */
    private final @Nullable List<ContainerStatus> initContainerStatuses;
    /**
     * A human readable message indicating details about why the pod is in this condition.
     * 
     */
    private final @Nullable String message;
    /**
     * nominatedNodeName is set only when this pod preempts other pods on the node, but it cannot be scheduled right away as preemption victims receive their graceful termination periods. This field does not guarantee that the pod will be scheduled on this node. Scheduler may decide to place the pod elsewhere if other nodes become available sooner. Scheduler may also decide to give the resources on this node to a higher priority pod that is created after preemption. As a result, this field may be different than PodSpec.nodeName when the pod is scheduled.
     * 
     */
    private final @Nullable String nominatedNodeName;
    /**
     * The phase of a Pod is a simple, high-level summary of where the Pod is in its lifecycle. The conditions array, the reason and message fields, and the individual container status arrays contain more detail about the pod's status. There are five possible phase values:
     * 
     * Pending: The pod has been accepted by the Kubernetes system, but one or more of the container images has not been created. This includes time before being scheduled as well as time spent downloading images over the network, which could take a while. Running: The pod has been bound to a node, and all of the containers have been created. At least one container is still running, or is in the process of starting or restarting. Succeeded: All containers in the pod have terminated in success, and will not be restarted. Failed: All containers in the pod have terminated, and at least one container has terminated in failure. The container either exited with non-zero status or was terminated by the system. Unknown: For some reason the state of the pod could not be obtained, typically due to an error in communicating with the host of the pod.
     * 
     * More info: https://kubernetes.io/docs/concepts/workloads/pods/pod-lifecycle#pod-phase
     * 
     * Possible enum values:
     *  - `"Failed"` means that all containers in the pod have terminated, and at least one container has terminated in a failure (exited with a non-zero exit code or was stopped by the system).
     *  - `"Pending"` means the pod has been accepted by the system, but one or more of the containers has not been started. This includes time before being bound to a node, as well as time spent pulling images onto the host.
     *  - `"Running"` means the pod has been bound to a node and all of the containers have been started. At least one container is still running or is in the process of being restarted.
     *  - `"Succeeded"` means that all containers in the pod have voluntarily terminated with a container exit code of 0, and the system is not going to restart any of these containers.
     *  - `"Unknown"` means that for some reason the state of the pod could not be obtained, typically due to an error in communicating with the host of the pod. Deprecated: It isn't being set since 2015 (74da3b14b0c0f658b3bb8d2def5094686d0e9095)
     * 
     */
    private final @Nullable String phase;
    /**
     * IP address allocated to the pod. Routable at least within the cluster. Empty if not yet allocated.
     * 
     */
    private final @Nullable String podIP;
    /**
     * podIPs holds the IP addresses allocated to the pod. If this field is specified, the 0th entry must match the podIP field. Pods may be allocated at most 1 value for each of IPv4 and IPv6. This list is empty if no IPs have been allocated yet.
     * 
     */
    private final @Nullable List<PodIP> podIPs;
    /**
     * The Quality of Service (QOS) classification assigned to the pod based on resource requirements See PodQOSClass type for available QOS classes More info: https://git.k8s.io/community/contributors/design-proposals/node/resource-qos.md
     * 
     * Possible enum values:
     *  - `"BestEffort"` is the BestEffort qos class.
     *  - `"Burstable"` is the Burstable qos class.
     *  - `"Guaranteed"` is the Guaranteed qos class.
     * 
     */
    private final @Nullable String qosClass;
    /**
     * A brief CamelCase message indicating details about why the pod is in this state. e.g. 'Evicted'
     * 
     */
    private final @Nullable String reason;
    /**
     * RFC 3339 date and time at which the object was acknowledged by the Kubelet. This is before the Kubelet pulled the container image(s) for the pod.
     * 
     */
    private final @Nullable String startTime;

    @OutputCustomType.Constructor({"conditions","containerStatuses","ephemeralContainerStatuses","hostIP","initContainerStatuses","message","nominatedNodeName","phase","podIP","podIPs","qosClass","reason","startTime"})
    private PodStatus(
        @Nullable List<PodCondition> conditions,
        @Nullable List<ContainerStatus> containerStatuses,
        @Nullable List<ContainerStatus> ephemeralContainerStatuses,
        @Nullable String hostIP,
        @Nullable List<ContainerStatus> initContainerStatuses,
        @Nullable String message,
        @Nullable String nominatedNodeName,
        @Nullable String phase,
        @Nullable String podIP,
        @Nullable List<PodIP> podIPs,
        @Nullable String qosClass,
        @Nullable String reason,
        @Nullable String startTime) {
        this.conditions = conditions;
        this.containerStatuses = containerStatuses;
        this.ephemeralContainerStatuses = ephemeralContainerStatuses;
        this.hostIP = hostIP;
        this.initContainerStatuses = initContainerStatuses;
        this.message = message;
        this.nominatedNodeName = nominatedNodeName;
        this.phase = phase;
        this.podIP = podIP;
        this.podIPs = podIPs;
        this.qosClass = qosClass;
        this.reason = reason;
        this.startTime = startTime;
    }

    /**
     * Current service state of pod. More info: https://kubernetes.io/docs/concepts/workloads/pods/pod-lifecycle#pod-conditions
     * 
     */
    public List<PodCondition> getConditions() {
        return this.conditions == null ? List.of() : this.conditions;
    }
    /**
     * The list has one entry per container in the manifest. Each entry is currently the output of `docker inspect`. More info: https://kubernetes.io/docs/concepts/workloads/pods/pod-lifecycle#pod-and-container-status
     * 
     */
    public List<ContainerStatus> getContainerStatuses() {
        return this.containerStatuses == null ? List.of() : this.containerStatuses;
    }
    /**
     * Status for any ephemeral containers that have run in this pod. This field is beta-level and available on clusters that haven't disabled the EphemeralContainers feature gate.
     * 
     */
    public List<ContainerStatus> getEphemeralContainerStatuses() {
        return this.ephemeralContainerStatuses == null ? List.of() : this.ephemeralContainerStatuses;
    }
    /**
     * IP address of the host to which the pod is assigned. Empty if not yet scheduled.
     * 
     */
    public Optional<String> getHostIP() {
        return Optional.ofNullable(this.hostIP);
    }
    /**
     * The list has one entry per init container in the manifest. The most recent successful init container will have ready = true, the most recently started container will have startTime set. More info: https://kubernetes.io/docs/concepts/workloads/pods/pod-lifecycle#pod-and-container-status
     * 
     */
    public List<ContainerStatus> getInitContainerStatuses() {
        return this.initContainerStatuses == null ? List.of() : this.initContainerStatuses;
    }
    /**
     * A human readable message indicating details about why the pod is in this condition.
     * 
     */
    public Optional<String> getMessage() {
        return Optional.ofNullable(this.message);
    }
    /**
     * nominatedNodeName is set only when this pod preempts other pods on the node, but it cannot be scheduled right away as preemption victims receive their graceful termination periods. This field does not guarantee that the pod will be scheduled on this node. Scheduler may decide to place the pod elsewhere if other nodes become available sooner. Scheduler may also decide to give the resources on this node to a higher priority pod that is created after preemption. As a result, this field may be different than PodSpec.nodeName when the pod is scheduled.
     * 
     */
    public Optional<String> getNominatedNodeName() {
        return Optional.ofNullable(this.nominatedNodeName);
    }
    /**
     * The phase of a Pod is a simple, high-level summary of where the Pod is in its lifecycle. The conditions array, the reason and message fields, and the individual container status arrays contain more detail about the pod's status. There are five possible phase values:
     * 
     * Pending: The pod has been accepted by the Kubernetes system, but one or more of the container images has not been created. This includes time before being scheduled as well as time spent downloading images over the network, which could take a while. Running: The pod has been bound to a node, and all of the containers have been created. At least one container is still running, or is in the process of starting or restarting. Succeeded: All containers in the pod have terminated in success, and will not be restarted. Failed: All containers in the pod have terminated, and at least one container has terminated in failure. The container either exited with non-zero status or was terminated by the system. Unknown: For some reason the state of the pod could not be obtained, typically due to an error in communicating with the host of the pod.
     * 
     * More info: https://kubernetes.io/docs/concepts/workloads/pods/pod-lifecycle#pod-phase
     * 
     * Possible enum values:
     *  - `"Failed"` means that all containers in the pod have terminated, and at least one container has terminated in a failure (exited with a non-zero exit code or was stopped by the system).
     *  - `"Pending"` means the pod has been accepted by the system, but one or more of the containers has not been started. This includes time before being bound to a node, as well as time spent pulling images onto the host.
     *  - `"Running"` means the pod has been bound to a node and all of the containers have been started. At least one container is still running or is in the process of being restarted.
     *  - `"Succeeded"` means that all containers in the pod have voluntarily terminated with a container exit code of 0, and the system is not going to restart any of these containers.
     *  - `"Unknown"` means that for some reason the state of the pod could not be obtained, typically due to an error in communicating with the host of the pod. Deprecated: It isn't being set since 2015 (74da3b14b0c0f658b3bb8d2def5094686d0e9095)
     * 
     */
    public Optional<String> getPhase() {
        return Optional.ofNullable(this.phase);
    }
    /**
     * IP address allocated to the pod. Routable at least within the cluster. Empty if not yet allocated.
     * 
     */
    public Optional<String> getPodIP() {
        return Optional.ofNullable(this.podIP);
    }
    /**
     * podIPs holds the IP addresses allocated to the pod. If this field is specified, the 0th entry must match the podIP field. Pods may be allocated at most 1 value for each of IPv4 and IPv6. This list is empty if no IPs have been allocated yet.
     * 
     */
    public List<PodIP> getPodIPs() {
        return this.podIPs == null ? List.of() : this.podIPs;
    }
    /**
     * The Quality of Service (QOS) classification assigned to the pod based on resource requirements See PodQOSClass type for available QOS classes More info: https://git.k8s.io/community/contributors/design-proposals/node/resource-qos.md
     * 
     * Possible enum values:
     *  - `"BestEffort"` is the BestEffort qos class.
     *  - `"Burstable"` is the Burstable qos class.
     *  - `"Guaranteed"` is the Guaranteed qos class.
     * 
     */
    public Optional<String> getQosClass() {
        return Optional.ofNullable(this.qosClass);
    }
    /**
     * A brief CamelCase message indicating details about why the pod is in this state. e.g. 'Evicted'
     * 
     */
    public Optional<String> getReason() {
        return Optional.ofNullable(this.reason);
    }
    /**
     * RFC 3339 date and time at which the object was acknowledged by the Kubelet. This is before the Kubelet pulled the container image(s) for the pod.
     * 
     */
    public Optional<String> getStartTime() {
        return Optional.ofNullable(this.startTime);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(PodStatus defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable List<PodCondition> conditions;
        private @Nullable List<ContainerStatus> containerStatuses;
        private @Nullable List<ContainerStatus> ephemeralContainerStatuses;
        private @Nullable String hostIP;
        private @Nullable List<ContainerStatus> initContainerStatuses;
        private @Nullable String message;
        private @Nullable String nominatedNodeName;
        private @Nullable String phase;
        private @Nullable String podIP;
        private @Nullable List<PodIP> podIPs;
        private @Nullable String qosClass;
        private @Nullable String reason;
        private @Nullable String startTime;

        public Builder() {
    	      // Empty
        }

        public Builder(PodStatus defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.conditions = defaults.conditions;
    	      this.containerStatuses = defaults.containerStatuses;
    	      this.ephemeralContainerStatuses = defaults.ephemeralContainerStatuses;
    	      this.hostIP = defaults.hostIP;
    	      this.initContainerStatuses = defaults.initContainerStatuses;
    	      this.message = defaults.message;
    	      this.nominatedNodeName = defaults.nominatedNodeName;
    	      this.phase = defaults.phase;
    	      this.podIP = defaults.podIP;
    	      this.podIPs = defaults.podIPs;
    	      this.qosClass = defaults.qosClass;
    	      this.reason = defaults.reason;
    	      this.startTime = defaults.startTime;
        }

        public Builder setConditions(@Nullable List<PodCondition> conditions) {
            this.conditions = conditions;
            return this;
        }

        public Builder setContainerStatuses(@Nullable List<ContainerStatus> containerStatuses) {
            this.containerStatuses = containerStatuses;
            return this;
        }

        public Builder setEphemeralContainerStatuses(@Nullable List<ContainerStatus> ephemeralContainerStatuses) {
            this.ephemeralContainerStatuses = ephemeralContainerStatuses;
            return this;
        }

        public Builder setHostIP(@Nullable String hostIP) {
            this.hostIP = hostIP;
            return this;
        }

        public Builder setInitContainerStatuses(@Nullable List<ContainerStatus> initContainerStatuses) {
            this.initContainerStatuses = initContainerStatuses;
            return this;
        }

        public Builder setMessage(@Nullable String message) {
            this.message = message;
            return this;
        }

        public Builder setNominatedNodeName(@Nullable String nominatedNodeName) {
            this.nominatedNodeName = nominatedNodeName;
            return this;
        }

        public Builder setPhase(@Nullable String phase) {
            this.phase = phase;
            return this;
        }

        public Builder setPodIP(@Nullable String podIP) {
            this.podIP = podIP;
            return this;
        }

        public Builder setPodIPs(@Nullable List<PodIP> podIPs) {
            this.podIPs = podIPs;
            return this;
        }

        public Builder setQosClass(@Nullable String qosClass) {
            this.qosClass = qosClass;
            return this;
        }

        public Builder setReason(@Nullable String reason) {
            this.reason = reason;
            return this;
        }

        public Builder setStartTime(@Nullable String startTime) {
            this.startTime = startTime;
            return this;
        }

        public PodStatus build() {
            return new PodStatus(conditions, containerStatuses, ephemeralContainerStatuses, hostIP, initContainerStatuses, message, nominatedNodeName, phase, podIP, podIPs, qosClass, reason, startTime);
        }
    }
}
