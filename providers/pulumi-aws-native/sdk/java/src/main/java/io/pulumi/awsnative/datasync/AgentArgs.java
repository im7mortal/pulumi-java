// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.datasync;

import io.pulumi.awsnative.datasync.inputs.AgentTagArgs;
import io.pulumi.core.Input;
import io.pulumi.core.internal.annotations.InputImport;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;


public final class AgentArgs extends io.pulumi.resources.ResourceArgs {

    public static final AgentArgs Empty = new AgentArgs();

    /**
     * Activation key of the Agent.
     * 
     */
    @InputImport(name="activationKey", required=true)
    private final Input<String> activationKey;

    public Input<String> getActivationKey() {
        return this.activationKey;
    }

    /**
     * The name configured for the agent. Text reference used to identify the agent in the console.
     * 
     */
    @InputImport(name="agentName")
    private final @Nullable Input<String> agentName;

    public Input<String> getAgentName() {
        return this.agentName == null ? Input.empty() : this.agentName;
    }

    /**
     * The ARNs of the security group used to protect your data transfer task subnets.
     * 
     */
    @InputImport(name="securityGroupArns")
    private final @Nullable Input<List<String>> securityGroupArns;

    public Input<List<String>> getSecurityGroupArns() {
        return this.securityGroupArns == null ? Input.empty() : this.securityGroupArns;
    }

    /**
     * The ARNs of the subnets in which DataSync will create elastic network interfaces for each data transfer task.
     * 
     */
    @InputImport(name="subnetArns")
    private final @Nullable Input<List<String>> subnetArns;

    public Input<List<String>> getSubnetArns() {
        return this.subnetArns == null ? Input.empty() : this.subnetArns;
    }

    /**
     * An array of key-value pairs to apply to this resource.
     * 
     */
    @InputImport(name="tags")
    private final @Nullable Input<List<AgentTagArgs>> tags;

    public Input<List<AgentTagArgs>> getTags() {
        return this.tags == null ? Input.empty() : this.tags;
    }

    /**
     * The ID of the VPC endpoint that the agent has access to.
     * 
     */
    @InputImport(name="vpcEndpointId")
    private final @Nullable Input<String> vpcEndpointId;

    public Input<String> getVpcEndpointId() {
        return this.vpcEndpointId == null ? Input.empty() : this.vpcEndpointId;
    }

    public AgentArgs(
        Input<String> activationKey,
        @Nullable Input<String> agentName,
        @Nullable Input<List<String>> securityGroupArns,
        @Nullable Input<List<String>> subnetArns,
        @Nullable Input<List<AgentTagArgs>> tags,
        @Nullable Input<String> vpcEndpointId) {
        this.activationKey = Objects.requireNonNull(activationKey, "expected parameter 'activationKey' to be non-null");
        this.agentName = agentName;
        this.securityGroupArns = securityGroupArns;
        this.subnetArns = subnetArns;
        this.tags = tags;
        this.vpcEndpointId = vpcEndpointId;
    }

    private AgentArgs() {
        this.activationKey = Input.empty();
        this.agentName = Input.empty();
        this.securityGroupArns = Input.empty();
        this.subnetArns = Input.empty();
        this.tags = Input.empty();
        this.vpcEndpointId = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(AgentArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Input<String> activationKey;
        private @Nullable Input<String> agentName;
        private @Nullable Input<List<String>> securityGroupArns;
        private @Nullable Input<List<String>> subnetArns;
        private @Nullable Input<List<AgentTagArgs>> tags;
        private @Nullable Input<String> vpcEndpointId;

        public Builder() {
    	      // Empty
        }

        public Builder(AgentArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.activationKey = defaults.activationKey;
    	      this.agentName = defaults.agentName;
    	      this.securityGroupArns = defaults.securityGroupArns;
    	      this.subnetArns = defaults.subnetArns;
    	      this.tags = defaults.tags;
    	      this.vpcEndpointId = defaults.vpcEndpointId;
        }

        public Builder setActivationKey(Input<String> activationKey) {
            this.activationKey = Objects.requireNonNull(activationKey);
            return this;
        }

        public Builder setActivationKey(String activationKey) {
            this.activationKey = Input.of(Objects.requireNonNull(activationKey));
            return this;
        }

        public Builder setAgentName(@Nullable Input<String> agentName) {
            this.agentName = agentName;
            return this;
        }

        public Builder setAgentName(@Nullable String agentName) {
            this.agentName = Input.ofNullable(agentName);
            return this;
        }

        public Builder setSecurityGroupArns(@Nullable Input<List<String>> securityGroupArns) {
            this.securityGroupArns = securityGroupArns;
            return this;
        }

        public Builder setSecurityGroupArns(@Nullable List<String> securityGroupArns) {
            this.securityGroupArns = Input.ofNullable(securityGroupArns);
            return this;
        }

        public Builder setSubnetArns(@Nullable Input<List<String>> subnetArns) {
            this.subnetArns = subnetArns;
            return this;
        }

        public Builder setSubnetArns(@Nullable List<String> subnetArns) {
            this.subnetArns = Input.ofNullable(subnetArns);
            return this;
        }

        public Builder setTags(@Nullable Input<List<AgentTagArgs>> tags) {
            this.tags = tags;
            return this;
        }

        public Builder setTags(@Nullable List<AgentTagArgs> tags) {
            this.tags = Input.ofNullable(tags);
            return this;
        }

        public Builder setVpcEndpointId(@Nullable Input<String> vpcEndpointId) {
            this.vpcEndpointId = vpcEndpointId;
            return this;
        }

        public Builder setVpcEndpointId(@Nullable String vpcEndpointId) {
            this.vpcEndpointId = Input.ofNullable(vpcEndpointId);
            return this;
        }

        public AgentArgs build() {
            return new AgentArgs(activationKey, agentName, securityGroupArns, subnetArns, tags, vpcEndpointId);
        }
    }
}
