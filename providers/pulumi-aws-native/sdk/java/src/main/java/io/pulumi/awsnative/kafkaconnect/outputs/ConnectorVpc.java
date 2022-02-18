// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.kafkaconnect.outputs;

import io.pulumi.core.internal.annotations.OutputCustomType;
import java.lang.String;
import java.util.List;
import java.util.Objects;

@OutputCustomType
public final class ConnectorVpc {
    /**
     * The AWS security groups to associate with the elastic network interfaces in order to specify what the connector has access to.
     * 
     */
    private final List<String> securityGroups;
    /**
     * The list of subnets to connect to in the virtual private cloud (VPC). AWS creates elastic network interfaces inside these subnets.
     * 
     */
    private final List<String> subnets;

    @OutputCustomType.Constructor({"securityGroups","subnets"})
    private ConnectorVpc(
        List<String> securityGroups,
        List<String> subnets) {
        this.securityGroups = Objects.requireNonNull(securityGroups);
        this.subnets = Objects.requireNonNull(subnets);
    }

    /**
     * The AWS security groups to associate with the elastic network interfaces in order to specify what the connector has access to.
     * 
     */
    public List<String> getSecurityGroups() {
        return this.securityGroups;
    }
    /**
     * The list of subnets to connect to in the virtual private cloud (VPC). AWS creates elastic network interfaces inside these subnets.
     * 
     */
    public List<String> getSubnets() {
        return this.subnets;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ConnectorVpc defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private List<String> securityGroups;
        private List<String> subnets;

        public Builder() {
    	      // Empty
        }

        public Builder(ConnectorVpc defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.securityGroups = defaults.securityGroups;
    	      this.subnets = defaults.subnets;
        }

        public Builder setSecurityGroups(List<String> securityGroups) {
            this.securityGroups = Objects.requireNonNull(securityGroups);
            return this;
        }

        public Builder setSubnets(List<String> subnets) {
            this.subnets = Objects.requireNonNull(subnets);
            return this;
        }

        public ConnectorVpc build() {
            return new ConnectorVpc(securityGroups, subnets);
        }
    }
}
