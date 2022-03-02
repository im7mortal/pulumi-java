// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.tpu_v1alpha1.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import io.pulumi.googlenative.tpu_v1alpha1.outputs.NetworkEndpointResponse;
import io.pulumi.googlenative.tpu_v1alpha1.outputs.SchedulingConfigResponse;
import io.pulumi.googlenative.tpu_v1alpha1.outputs.SymptomResponse;
import java.lang.Boolean;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Objects;

@OutputCustomType
public final class GetNodeResult {
    /**
     * The type of hardware accelerators associated with this node.
     * 
     */
    private final String acceleratorType;
    /**
     * The API version that created this Node.
     * 
     */
    private final String apiVersion;
    /**
     * The CIDR block that the TPU node will use when selecting an IP address. This CIDR block must be a /29 block; the Compute Engine networks API forbids a smaller block, and using a larger block would be wasteful (a node can only consume one IP address). Errors will occur if the CIDR block has already been used for a currently existing TPU node, the CIDR block conflicts with any subnetworks in the user's provided network, or the provided network is peered with another network that is using that CIDR block.
     * 
     */
    private final String cidrBlock;
    /**
     * The time when the node was created.
     * 
     */
    private final String createTime;
    /**
     * The user-supplied description of the TPU. Maximum of 512 characters.
     * 
     */
    private final String description;
    /**
     * The health status of the TPU node.
     * 
     */
    private final String health;
    /**
     * If this field is populated, it contains a description of why the TPU Node is unhealthy.
     * 
     */
    private final String healthDescription;
    /**
     * Resource labels to represent user-provided metadata.
     * 
     */
    private final Map<String,String> labels;
    /**
     * Immutable. The name of the TPU
     * 
     */
    private final String name;
    /**
     * The name of a network they wish to peer the TPU node to. It must be a preexisting Compute Engine network inside of the project on which this API has been activated. If none is provided, "default" will be used.
     * 
     */
    private final String network;
    /**
     * The network endpoints where TPU workers can be accessed and sent work. It is recommended that Tensorflow clients of the node reach out to the 0th entry in this map first.
     * 
     */
    private final List<NetworkEndpointResponse> networkEndpoints;
    /**
     * The scheduling options for this node.
     * 
     */
    private final SchedulingConfigResponse schedulingConfig;
    /**
     * The service account used to run the tensor flow services within the node. To share resources, including Google Cloud Storage data, with the Tensorflow job running in the Node, this account must have permissions to that data.
     * 
     */
    private final String serviceAccount;
    /**
     * The current state for the TPU Node.
     * 
     */
    private final String state;
    /**
     * The Symptoms that have occurred to the TPU Node.
     * 
     */
    private final List<SymptomResponse> symptoms;
    /**
     * The version of Tensorflow running in the Node.
     * 
     */
    private final String tensorflowVersion;
    /**
     * Whether the VPC peering for the node is set up through Service Networking API. The VPC Peering should be set up before provisioning the node. If this field is set, cidr_block field should not be specified. If the network, that you want to peer the TPU Node to, is Shared VPC networks, the node must be created with this this field enabled.
     * 
     */
    private final Boolean useServiceNetworking;

    @OutputCustomType.Constructor({"acceleratorType","apiVersion","cidrBlock","createTime","description","health","healthDescription","labels","name","network","networkEndpoints","schedulingConfig","serviceAccount","state","symptoms","tensorflowVersion","useServiceNetworking"})
    private GetNodeResult(
        String acceleratorType,
        String apiVersion,
        String cidrBlock,
        String createTime,
        String description,
        String health,
        String healthDescription,
        Map<String,String> labels,
        String name,
        String network,
        List<NetworkEndpointResponse> networkEndpoints,
        SchedulingConfigResponse schedulingConfig,
        String serviceAccount,
        String state,
        List<SymptomResponse> symptoms,
        String tensorflowVersion,
        Boolean useServiceNetworking) {
        this.acceleratorType = Objects.requireNonNull(acceleratorType);
        this.apiVersion = Objects.requireNonNull(apiVersion);
        this.cidrBlock = Objects.requireNonNull(cidrBlock);
        this.createTime = Objects.requireNonNull(createTime);
        this.description = Objects.requireNonNull(description);
        this.health = Objects.requireNonNull(health);
        this.healthDescription = Objects.requireNonNull(healthDescription);
        this.labels = Objects.requireNonNull(labels);
        this.name = Objects.requireNonNull(name);
        this.network = Objects.requireNonNull(network);
        this.networkEndpoints = Objects.requireNonNull(networkEndpoints);
        this.schedulingConfig = Objects.requireNonNull(schedulingConfig);
        this.serviceAccount = Objects.requireNonNull(serviceAccount);
        this.state = Objects.requireNonNull(state);
        this.symptoms = Objects.requireNonNull(symptoms);
        this.tensorflowVersion = Objects.requireNonNull(tensorflowVersion);
        this.useServiceNetworking = Objects.requireNonNull(useServiceNetworking);
    }

    /**
     * The type of hardware accelerators associated with this node.
     * 
    */
    public String getAcceleratorType() {
        return this.acceleratorType;
    }
    /**
     * The API version that created this Node.
     * 
    */
    public String getApiVersion() {
        return this.apiVersion;
    }
    /**
     * The CIDR block that the TPU node will use when selecting an IP address. This CIDR block must be a /29 block; the Compute Engine networks API forbids a smaller block, and using a larger block would be wasteful (a node can only consume one IP address). Errors will occur if the CIDR block has already been used for a currently existing TPU node, the CIDR block conflicts with any subnetworks in the user's provided network, or the provided network is peered with another network that is using that CIDR block.
     * 
    */
    public String getCidrBlock() {
        return this.cidrBlock;
    }
    /**
     * The time when the node was created.
     * 
    */
    public String getCreateTime() {
        return this.createTime;
    }
    /**
     * The user-supplied description of the TPU. Maximum of 512 characters.
     * 
    */
    public String getDescription() {
        return this.description;
    }
    /**
     * The health status of the TPU node.
     * 
    */
    public String getHealth() {
        return this.health;
    }
    /**
     * If this field is populated, it contains a description of why the TPU Node is unhealthy.
     * 
    */
    public String getHealthDescription() {
        return this.healthDescription;
    }
    /**
     * Resource labels to represent user-provided metadata.
     * 
    */
    public Map<String,String> getLabels() {
        return this.labels;
    }
    /**
     * Immutable. The name of the TPU
     * 
    */
    public String getName() {
        return this.name;
    }
    /**
     * The name of a network they wish to peer the TPU node to. It must be a preexisting Compute Engine network inside of the project on which this API has been activated. If none is provided, "default" will be used.
     * 
    */
    public String getNetwork() {
        return this.network;
    }
    /**
     * The network endpoints where TPU workers can be accessed and sent work. It is recommended that Tensorflow clients of the node reach out to the 0th entry in this map first.
     * 
    */
    public List<NetworkEndpointResponse> getNetworkEndpoints() {
        return this.networkEndpoints;
    }
    /**
     * The scheduling options for this node.
     * 
    */
    public SchedulingConfigResponse getSchedulingConfig() {
        return this.schedulingConfig;
    }
    /**
     * The service account used to run the tensor flow services within the node. To share resources, including Google Cloud Storage data, with the Tensorflow job running in the Node, this account must have permissions to that data.
     * 
    */
    public String getServiceAccount() {
        return this.serviceAccount;
    }
    /**
     * The current state for the TPU Node.
     * 
    */
    public String getState() {
        return this.state;
    }
    /**
     * The Symptoms that have occurred to the TPU Node.
     * 
    */
    public List<SymptomResponse> getSymptoms() {
        return this.symptoms;
    }
    /**
     * The version of Tensorflow running in the Node.
     * 
    */
    public String getTensorflowVersion() {
        return this.tensorflowVersion;
    }
    /**
     * Whether the VPC peering for the node is set up through Service Networking API. The VPC Peering should be set up before provisioning the node. If this field is set, cidr_block field should not be specified. If the network, that you want to peer the TPU Node to, is Shared VPC networks, the node must be created with this this field enabled.
     * 
    */
    public Boolean getUseServiceNetworking() {
        return this.useServiceNetworking;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetNodeResult defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String acceleratorType;
        private String apiVersion;
        private String cidrBlock;
        private String createTime;
        private String description;
        private String health;
        private String healthDescription;
        private Map<String,String> labels;
        private String name;
        private String network;
        private List<NetworkEndpointResponse> networkEndpoints;
        private SchedulingConfigResponse schedulingConfig;
        private String serviceAccount;
        private String state;
        private List<SymptomResponse> symptoms;
        private String tensorflowVersion;
        private Boolean useServiceNetworking;

        public Builder() {
    	      // Empty
        }

        public Builder(GetNodeResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.acceleratorType = defaults.acceleratorType;
    	      this.apiVersion = defaults.apiVersion;
    	      this.cidrBlock = defaults.cidrBlock;
    	      this.createTime = defaults.createTime;
    	      this.description = defaults.description;
    	      this.health = defaults.health;
    	      this.healthDescription = defaults.healthDescription;
    	      this.labels = defaults.labels;
    	      this.name = defaults.name;
    	      this.network = defaults.network;
    	      this.networkEndpoints = defaults.networkEndpoints;
    	      this.schedulingConfig = defaults.schedulingConfig;
    	      this.serviceAccount = defaults.serviceAccount;
    	      this.state = defaults.state;
    	      this.symptoms = defaults.symptoms;
    	      this.tensorflowVersion = defaults.tensorflowVersion;
    	      this.useServiceNetworking = defaults.useServiceNetworking;
        }

        public Builder setAcceleratorType(String acceleratorType) {
            this.acceleratorType = Objects.requireNonNull(acceleratorType);
            return this;
        }

        public Builder setApiVersion(String apiVersion) {
            this.apiVersion = Objects.requireNonNull(apiVersion);
            return this;
        }

        public Builder setCidrBlock(String cidrBlock) {
            this.cidrBlock = Objects.requireNonNull(cidrBlock);
            return this;
        }

        public Builder setCreateTime(String createTime) {
            this.createTime = Objects.requireNonNull(createTime);
            return this;
        }

        public Builder setDescription(String description) {
            this.description = Objects.requireNonNull(description);
            return this;
        }

        public Builder setHealth(String health) {
            this.health = Objects.requireNonNull(health);
            return this;
        }

        public Builder setHealthDescription(String healthDescription) {
            this.healthDescription = Objects.requireNonNull(healthDescription);
            return this;
        }

        public Builder setLabels(Map<String,String> labels) {
            this.labels = Objects.requireNonNull(labels);
            return this;
        }

        public Builder setName(String name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }

        public Builder setNetwork(String network) {
            this.network = Objects.requireNonNull(network);
            return this;
        }

        public Builder setNetworkEndpoints(List<NetworkEndpointResponse> networkEndpoints) {
            this.networkEndpoints = Objects.requireNonNull(networkEndpoints);
            return this;
        }

        public Builder setSchedulingConfig(SchedulingConfigResponse schedulingConfig) {
            this.schedulingConfig = Objects.requireNonNull(schedulingConfig);
            return this;
        }

        public Builder setServiceAccount(String serviceAccount) {
            this.serviceAccount = Objects.requireNonNull(serviceAccount);
            return this;
        }

        public Builder setState(String state) {
            this.state = Objects.requireNonNull(state);
            return this;
        }

        public Builder setSymptoms(List<SymptomResponse> symptoms) {
            this.symptoms = Objects.requireNonNull(symptoms);
            return this;
        }

        public Builder setTensorflowVersion(String tensorflowVersion) {
            this.tensorflowVersion = Objects.requireNonNull(tensorflowVersion);
            return this;
        }

        public Builder setUseServiceNetworking(Boolean useServiceNetworking) {
            this.useServiceNetworking = Objects.requireNonNull(useServiceNetworking);
            return this;
        }
        public GetNodeResult build() {
            return new GetNodeResult(acceleratorType, apiVersion, cidrBlock, createTime, description, health, healthDescription, labels, name, network, networkEndpoints, schedulingConfig, serviceAccount, state, symptoms, tensorflowVersion, useServiceNetworking);
        }
    }
}
