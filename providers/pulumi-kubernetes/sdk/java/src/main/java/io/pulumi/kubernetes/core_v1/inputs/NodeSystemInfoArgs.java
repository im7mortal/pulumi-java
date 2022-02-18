// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.kubernetes.core_v1.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.Objects;


/**
 * NodeSystemInfo is a set of ids/uuids to uniquely identify the node.
 * 
 */
public final class NodeSystemInfoArgs extends io.pulumi.resources.ResourceArgs {

    public static final NodeSystemInfoArgs Empty = new NodeSystemInfoArgs();

    /**
     * The Architecture reported by the node
     * 
     */
    @InputImport(name="architecture", required=true)
    private final Input<String> architecture;

    public Input<String> getArchitecture() {
        return this.architecture;
    }

    /**
     * Boot ID reported by the node.
     * 
     */
    @InputImport(name="bootID", required=true)
    private final Input<String> bootID;

    public Input<String> getBootID() {
        return this.bootID;
    }

    /**
     * ContainerRuntime Version reported by the node through runtime remote API (e.g. docker://1.5.0).
     * 
     */
    @InputImport(name="containerRuntimeVersion", required=true)
    private final Input<String> containerRuntimeVersion;

    public Input<String> getContainerRuntimeVersion() {
        return this.containerRuntimeVersion;
    }

    /**
     * Kernel Version reported by the node from 'uname -r' (e.g. 3.16.0-0.bpo.4-amd64).
     * 
     */
    @InputImport(name="kernelVersion", required=true)
    private final Input<String> kernelVersion;

    public Input<String> getKernelVersion() {
        return this.kernelVersion;
    }

    /**
     * KubeProxy Version reported by the node.
     * 
     */
    @InputImport(name="kubeProxyVersion", required=true)
    private final Input<String> kubeProxyVersion;

    public Input<String> getKubeProxyVersion() {
        return this.kubeProxyVersion;
    }

    /**
     * Kubelet Version reported by the node.
     * 
     */
    @InputImport(name="kubeletVersion", required=true)
    private final Input<String> kubeletVersion;

    public Input<String> getKubeletVersion() {
        return this.kubeletVersion;
    }

    /**
     * MachineID reported by the node. For unique machine identification in the cluster this field is preferred. Learn more from man(5) machine-id: http://man7.org/linux/man-pages/man5/machine-id.5.html
     * 
     */
    @InputImport(name="machineID", required=true)
    private final Input<String> machineID;

    public Input<String> getMachineID() {
        return this.machineID;
    }

    /**
     * The Operating System reported by the node
     * 
     */
    @InputImport(name="operatingSystem", required=true)
    private final Input<String> operatingSystem;

    public Input<String> getOperatingSystem() {
        return this.operatingSystem;
    }

    /**
     * OS Image reported by the node from /etc/os-release (e.g. Debian GNU/Linux 7 (wheezy)).
     * 
     */
    @InputImport(name="osImage", required=true)
    private final Input<String> osImage;

    public Input<String> getOsImage() {
        return this.osImage;
    }

    /**
     * SystemUUID reported by the node. For unique machine identification MachineID is preferred. This field is specific to Red Hat hosts https://access.redhat.com/documentation/en-us/red_hat_subscription_management/1/html/rhsm/uuid
     * 
     */
    @InputImport(name="systemUUID", required=true)
    private final Input<String> systemUUID;

    public Input<String> getSystemUUID() {
        return this.systemUUID;
    }

    public NodeSystemInfoArgs(
        Input<String> architecture,
        Input<String> bootID,
        Input<String> containerRuntimeVersion,
        Input<String> kernelVersion,
        Input<String> kubeProxyVersion,
        Input<String> kubeletVersion,
        Input<String> machineID,
        Input<String> operatingSystem,
        Input<String> osImage,
        Input<String> systemUUID) {
        this.architecture = Objects.requireNonNull(architecture, "expected parameter 'architecture' to be non-null");
        this.bootID = Objects.requireNonNull(bootID, "expected parameter 'bootID' to be non-null");
        this.containerRuntimeVersion = Objects.requireNonNull(containerRuntimeVersion, "expected parameter 'containerRuntimeVersion' to be non-null");
        this.kernelVersion = Objects.requireNonNull(kernelVersion, "expected parameter 'kernelVersion' to be non-null");
        this.kubeProxyVersion = Objects.requireNonNull(kubeProxyVersion, "expected parameter 'kubeProxyVersion' to be non-null");
        this.kubeletVersion = Objects.requireNonNull(kubeletVersion, "expected parameter 'kubeletVersion' to be non-null");
        this.machineID = Objects.requireNonNull(machineID, "expected parameter 'machineID' to be non-null");
        this.operatingSystem = Objects.requireNonNull(operatingSystem, "expected parameter 'operatingSystem' to be non-null");
        this.osImage = Objects.requireNonNull(osImage, "expected parameter 'osImage' to be non-null");
        this.systemUUID = Objects.requireNonNull(systemUUID, "expected parameter 'systemUUID' to be non-null");
    }

    private NodeSystemInfoArgs() {
        this.architecture = Input.empty();
        this.bootID = Input.empty();
        this.containerRuntimeVersion = Input.empty();
        this.kernelVersion = Input.empty();
        this.kubeProxyVersion = Input.empty();
        this.kubeletVersion = Input.empty();
        this.machineID = Input.empty();
        this.operatingSystem = Input.empty();
        this.osImage = Input.empty();
        this.systemUUID = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(NodeSystemInfoArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Input<String> architecture;
        private Input<String> bootID;
        private Input<String> containerRuntimeVersion;
        private Input<String> kernelVersion;
        private Input<String> kubeProxyVersion;
        private Input<String> kubeletVersion;
        private Input<String> machineID;
        private Input<String> operatingSystem;
        private Input<String> osImage;
        private Input<String> systemUUID;

        public Builder() {
    	      // Empty
        }

        public Builder(NodeSystemInfoArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.architecture = defaults.architecture;
    	      this.bootID = defaults.bootID;
    	      this.containerRuntimeVersion = defaults.containerRuntimeVersion;
    	      this.kernelVersion = defaults.kernelVersion;
    	      this.kubeProxyVersion = defaults.kubeProxyVersion;
    	      this.kubeletVersion = defaults.kubeletVersion;
    	      this.machineID = defaults.machineID;
    	      this.operatingSystem = defaults.operatingSystem;
    	      this.osImage = defaults.osImage;
    	      this.systemUUID = defaults.systemUUID;
        }

        public Builder setArchitecture(Input<String> architecture) {
            this.architecture = Objects.requireNonNull(architecture);
            return this;
        }

        public Builder setArchitecture(String architecture) {
            this.architecture = Input.of(Objects.requireNonNull(architecture));
            return this;
        }

        public Builder setBootID(Input<String> bootID) {
            this.bootID = Objects.requireNonNull(bootID);
            return this;
        }

        public Builder setBootID(String bootID) {
            this.bootID = Input.of(Objects.requireNonNull(bootID));
            return this;
        }

        public Builder setContainerRuntimeVersion(Input<String> containerRuntimeVersion) {
            this.containerRuntimeVersion = Objects.requireNonNull(containerRuntimeVersion);
            return this;
        }

        public Builder setContainerRuntimeVersion(String containerRuntimeVersion) {
            this.containerRuntimeVersion = Input.of(Objects.requireNonNull(containerRuntimeVersion));
            return this;
        }

        public Builder setKernelVersion(Input<String> kernelVersion) {
            this.kernelVersion = Objects.requireNonNull(kernelVersion);
            return this;
        }

        public Builder setKernelVersion(String kernelVersion) {
            this.kernelVersion = Input.of(Objects.requireNonNull(kernelVersion));
            return this;
        }

        public Builder setKubeProxyVersion(Input<String> kubeProxyVersion) {
            this.kubeProxyVersion = Objects.requireNonNull(kubeProxyVersion);
            return this;
        }

        public Builder setKubeProxyVersion(String kubeProxyVersion) {
            this.kubeProxyVersion = Input.of(Objects.requireNonNull(kubeProxyVersion));
            return this;
        }

        public Builder setKubeletVersion(Input<String> kubeletVersion) {
            this.kubeletVersion = Objects.requireNonNull(kubeletVersion);
            return this;
        }

        public Builder setKubeletVersion(String kubeletVersion) {
            this.kubeletVersion = Input.of(Objects.requireNonNull(kubeletVersion));
            return this;
        }

        public Builder setMachineID(Input<String> machineID) {
            this.machineID = Objects.requireNonNull(machineID);
            return this;
        }

        public Builder setMachineID(String machineID) {
            this.machineID = Input.of(Objects.requireNonNull(machineID));
            return this;
        }

        public Builder setOperatingSystem(Input<String> operatingSystem) {
            this.operatingSystem = Objects.requireNonNull(operatingSystem);
            return this;
        }

        public Builder setOperatingSystem(String operatingSystem) {
            this.operatingSystem = Input.of(Objects.requireNonNull(operatingSystem));
            return this;
        }

        public Builder setOsImage(Input<String> osImage) {
            this.osImage = Objects.requireNonNull(osImage);
            return this;
        }

        public Builder setOsImage(String osImage) {
            this.osImage = Input.of(Objects.requireNonNull(osImage));
            return this;
        }

        public Builder setSystemUUID(Input<String> systemUUID) {
            this.systemUUID = Objects.requireNonNull(systemUUID);
            return this;
        }

        public Builder setSystemUUID(String systemUUID) {
            this.systemUUID = Input.of(Objects.requireNonNull(systemUUID));
            return this;
        }

        public NodeSystemInfoArgs build() {
            return new NodeSystemInfoArgs(architecture, bootID, containerRuntimeVersion, kernelVersion, kubeProxyVersion, kubeletVersion, machineID, operatingSystem, osImage, systemUUID);
        }
    }
}
