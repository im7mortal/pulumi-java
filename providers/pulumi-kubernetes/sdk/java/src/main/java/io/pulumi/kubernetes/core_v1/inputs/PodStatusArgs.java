// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.kubernetes.core_v1.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import io.pulumi.kubernetes.core_v1.inputs.ContainerStatusArgs;
import io.pulumi.kubernetes.core_v1.inputs.PodConditionArgs;
import io.pulumi.kubernetes.core_v1.inputs.PodIPArgs;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * PodStatus represents information about the status of a pod. Status may trail the actual state of a system, especially if the node that hosts the pod cannot contact the control plane.
 * 
 */
public final class PodStatusArgs extends io.pulumi.resources.ResourceArgs {

    public static final PodStatusArgs Empty = new PodStatusArgs();

    /**
     * Current service state of pod. More info: https://kubernetes.io/docs/concepts/workloads/pods/pod-lifecycle#pod-conditions
     * 
     */
    @InputImport(name="conditions")
    private final @Nullable Input<List<PodConditionArgs>> conditions;

    public Input<List<PodConditionArgs>> getConditions() {
        return this.conditions == null ? Input.empty() : this.conditions;
    }

    /**
     * The list has one entry per container in the manifest. Each entry is currently the output of `docker inspect`. More info: https://kubernetes.io/docs/concepts/workloads/pods/pod-lifecycle#pod-and-container-status
     * 
     */
    @InputImport(name="containerStatuses")
    private final @Nullable Input<List<ContainerStatusArgs>> containerStatuses;

    public Input<List<ContainerStatusArgs>> getContainerStatuses() {
        return this.containerStatuses == null ? Input.empty() : this.containerStatuses;
    }

    /**
     * Status for any ephemeral containers that have run in this pod. This field is beta-level and available on clusters that haven't disabled the EphemeralContainers feature gate.
     * 
     */
    @InputImport(name="ephemeralContainerStatuses")
    private final @Nullable Input<List<ContainerStatusArgs>> ephemeralContainerStatuses;

    public Input<List<ContainerStatusArgs>> getEphemeralContainerStatuses() {
        return this.ephemeralContainerStatuses == null ? Input.empty() : this.ephemeralContainerStatuses;
    }

    /**
     * IP address of the host to which the pod is assigned. Empty if not yet scheduled.
     * 
     */
    @InputImport(name="hostIP")
    private final @Nullable Input<String> hostIP;

    public Input<String> getHostIP() {
        return this.hostIP == null ? Input.empty() : this.hostIP;
    }

    /**
     * The list has one entry per init container in the manifest. The most recent successful init container will have ready = true, the most recently started container will have startTime set. More info: https://kubernetes.io/docs/concepts/workloads/pods/pod-lifecycle#pod-and-container-status
     * 
     */
    @InputImport(name="initContainerStatuses")
    private final @Nullable Input<List<ContainerStatusArgs>> initContainerStatuses;

    public Input<List<ContainerStatusArgs>> getInitContainerStatuses() {
        return this.initContainerStatuses == null ? Input.empty() : this.initContainerStatuses;
    }

    /**
     * A human readable message indicating details about why the pod is in this condition.
     * 
     */
    @InputImport(name="message")
    private final @Nullable Input<String> message;

    public Input<String> getMessage() {
        return this.message == null ? Input.empty() : this.message;
    }

    /**
     * nominatedNodeName is set only when this pod preempts other pods on the node, but it cannot be scheduled right away as preemption victims receive their graceful termination periods. This field does not guarantee that the pod will be scheduled on this node. Scheduler may decide to place the pod elsewhere if other nodes become available sooner. Scheduler may also decide to give the resources on this node to a higher priority pod that is created after preemption. As a result, this field may be different than PodSpec.nodeName when the pod is scheduled.
     * 
     */
    @InputImport(name="nominatedNodeName")
    private final @Nullable Input<String> nominatedNodeName;

    public Input<String> getNominatedNodeName() {
        return this.nominatedNodeName == null ? Input.empty() : this.nominatedNodeName;
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
    @InputImport(name="phase")
    private final @Nullable Input<String> phase;

    public Input<String> getPhase() {
        return this.phase == null ? Input.empty() : this.phase;
    }

    /**
     * IP address allocated to the pod. Routable at least within the cluster. Empty if not yet allocated.
     * 
     */
    @InputImport(name="podIP")
    private final @Nullable Input<String> podIP;

    public Input<String> getPodIP() {
        return this.podIP == null ? Input.empty() : this.podIP;
    }

    /**
     * podIPs holds the IP addresses allocated to the pod. If this field is specified, the 0th entry must match the podIP field. Pods may be allocated at most 1 value for each of IPv4 and IPv6. This list is empty if no IPs have been allocated yet.
     * 
     */
    @InputImport(name="podIPs")
    private final @Nullable Input<List<PodIPArgs>> podIPs;

    public Input<List<PodIPArgs>> getPodIPs() {
        return this.podIPs == null ? Input.empty() : this.podIPs;
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
    @InputImport(name="qosClass")
    private final @Nullable Input<String> qosClass;

    public Input<String> getQosClass() {
        return this.qosClass == null ? Input.empty() : this.qosClass;
    }

    /**
     * A brief CamelCase message indicating details about why the pod is in this state. e.g. 'Evicted'
     * 
     */
    @InputImport(name="reason")
    private final @Nullable Input<String> reason;

    public Input<String> getReason() {
        return this.reason == null ? Input.empty() : this.reason;
    }

    /**
     * RFC 3339 date and time at which the object was acknowledged by the Kubelet. This is before the Kubelet pulled the container image(s) for the pod.
     * 
     */
    @InputImport(name="startTime")
    private final @Nullable Input<String> startTime;

    public Input<String> getStartTime() {
        return this.startTime == null ? Input.empty() : this.startTime;
    }

    public PodStatusArgs(
        @Nullable Input<List<PodConditionArgs>> conditions,
        @Nullable Input<List<ContainerStatusArgs>> containerStatuses,
        @Nullable Input<List<ContainerStatusArgs>> ephemeralContainerStatuses,
        @Nullable Input<String> hostIP,
        @Nullable Input<List<ContainerStatusArgs>> initContainerStatuses,
        @Nullable Input<String> message,
        @Nullable Input<String> nominatedNodeName,
        @Nullable Input<String> phase,
        @Nullable Input<String> podIP,
        @Nullable Input<List<PodIPArgs>> podIPs,
        @Nullable Input<String> qosClass,
        @Nullable Input<String> reason,
        @Nullable Input<String> startTime) {
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

    private PodStatusArgs() {
        this.conditions = Input.empty();
        this.containerStatuses = Input.empty();
        this.ephemeralContainerStatuses = Input.empty();
        this.hostIP = Input.empty();
        this.initContainerStatuses = Input.empty();
        this.message = Input.empty();
        this.nominatedNodeName = Input.empty();
        this.phase = Input.empty();
        this.podIP = Input.empty();
        this.podIPs = Input.empty();
        this.qosClass = Input.empty();
        this.reason = Input.empty();
        this.startTime = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(PodStatusArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<List<PodConditionArgs>> conditions;
        private @Nullable Input<List<ContainerStatusArgs>> containerStatuses;
        private @Nullable Input<List<ContainerStatusArgs>> ephemeralContainerStatuses;
        private @Nullable Input<String> hostIP;
        private @Nullable Input<List<ContainerStatusArgs>> initContainerStatuses;
        private @Nullable Input<String> message;
        private @Nullable Input<String> nominatedNodeName;
        private @Nullable Input<String> phase;
        private @Nullable Input<String> podIP;
        private @Nullable Input<List<PodIPArgs>> podIPs;
        private @Nullable Input<String> qosClass;
        private @Nullable Input<String> reason;
        private @Nullable Input<String> startTime;

        public Builder() {
    	      // Empty
        }

        public Builder(PodStatusArgs defaults) {
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

        public Builder setConditions(@Nullable Input<List<PodConditionArgs>> conditions) {
            this.conditions = conditions;
            return this;
        }

        public Builder setConditions(@Nullable List<PodConditionArgs> conditions) {
            this.conditions = Input.ofNullable(conditions);
            return this;
        }

        public Builder setContainerStatuses(@Nullable Input<List<ContainerStatusArgs>> containerStatuses) {
            this.containerStatuses = containerStatuses;
            return this;
        }

        public Builder setContainerStatuses(@Nullable List<ContainerStatusArgs> containerStatuses) {
            this.containerStatuses = Input.ofNullable(containerStatuses);
            return this;
        }

        public Builder setEphemeralContainerStatuses(@Nullable Input<List<ContainerStatusArgs>> ephemeralContainerStatuses) {
            this.ephemeralContainerStatuses = ephemeralContainerStatuses;
            return this;
        }

        public Builder setEphemeralContainerStatuses(@Nullable List<ContainerStatusArgs> ephemeralContainerStatuses) {
            this.ephemeralContainerStatuses = Input.ofNullable(ephemeralContainerStatuses);
            return this;
        }

        public Builder setHostIP(@Nullable Input<String> hostIP) {
            this.hostIP = hostIP;
            return this;
        }

        public Builder setHostIP(@Nullable String hostIP) {
            this.hostIP = Input.ofNullable(hostIP);
            return this;
        }

        public Builder setInitContainerStatuses(@Nullable Input<List<ContainerStatusArgs>> initContainerStatuses) {
            this.initContainerStatuses = initContainerStatuses;
            return this;
        }

        public Builder setInitContainerStatuses(@Nullable List<ContainerStatusArgs> initContainerStatuses) {
            this.initContainerStatuses = Input.ofNullable(initContainerStatuses);
            return this;
        }

        public Builder setMessage(@Nullable Input<String> message) {
            this.message = message;
            return this;
        }

        public Builder setMessage(@Nullable String message) {
            this.message = Input.ofNullable(message);
            return this;
        }

        public Builder setNominatedNodeName(@Nullable Input<String> nominatedNodeName) {
            this.nominatedNodeName = nominatedNodeName;
            return this;
        }

        public Builder setNominatedNodeName(@Nullable String nominatedNodeName) {
            this.nominatedNodeName = Input.ofNullable(nominatedNodeName);
            return this;
        }

        public Builder setPhase(@Nullable Input<String> phase) {
            this.phase = phase;
            return this;
        }

        public Builder setPhase(@Nullable String phase) {
            this.phase = Input.ofNullable(phase);
            return this;
        }

        public Builder setPodIP(@Nullable Input<String> podIP) {
            this.podIP = podIP;
            return this;
        }

        public Builder setPodIP(@Nullable String podIP) {
            this.podIP = Input.ofNullable(podIP);
            return this;
        }

        public Builder setPodIPs(@Nullable Input<List<PodIPArgs>> podIPs) {
            this.podIPs = podIPs;
            return this;
        }

        public Builder setPodIPs(@Nullable List<PodIPArgs> podIPs) {
            this.podIPs = Input.ofNullable(podIPs);
            return this;
        }

        public Builder setQosClass(@Nullable Input<String> qosClass) {
            this.qosClass = qosClass;
            return this;
        }

        public Builder setQosClass(@Nullable String qosClass) {
            this.qosClass = Input.ofNullable(qosClass);
            return this;
        }

        public Builder setReason(@Nullable Input<String> reason) {
            this.reason = reason;
            return this;
        }

        public Builder setReason(@Nullable String reason) {
            this.reason = Input.ofNullable(reason);
            return this;
        }

        public Builder setStartTime(@Nullable Input<String> startTime) {
            this.startTime = startTime;
            return this;
        }

        public Builder setStartTime(@Nullable String startTime) {
            this.startTime = Input.ofNullable(startTime);
            return this;
        }

        public PodStatusArgs build() {
            return new PodStatusArgs(conditions, containerStatuses, ephemeralContainerStatuses, hostIP, initContainerStatuses, message, nominatedNodeName, phase, podIP, podIPs, qosClass, reason, startTime);
        }
    }
}
