// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.kafkaconnect.inputs;

import io.pulumi.awsnative.kafkaconnect.inputs.ConnectorApacheKafkaClusterArgs;
import io.pulumi.core.Input;
import io.pulumi.core.internal.annotations.InputImport;
import java.util.Objects;


/**
 * Details of how to connect to the Kafka cluster.
 * 
 */
public final class ConnectorKafkaClusterArgs extends io.pulumi.resources.ResourceArgs {

    public static final ConnectorKafkaClusterArgs Empty = new ConnectorKafkaClusterArgs();

    @InputImport(name="apacheKafkaCluster", required=true)
    private final Input<ConnectorApacheKafkaClusterArgs> apacheKafkaCluster;

    public Input<ConnectorApacheKafkaClusterArgs> getApacheKafkaCluster() {
        return this.apacheKafkaCluster;
    }

    public ConnectorKafkaClusterArgs(Input<ConnectorApacheKafkaClusterArgs> apacheKafkaCluster) {
        this.apacheKafkaCluster = Objects.requireNonNull(apacheKafkaCluster, "expected parameter 'apacheKafkaCluster' to be non-null");
    }

    private ConnectorKafkaClusterArgs() {
        this.apacheKafkaCluster = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ConnectorKafkaClusterArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Input<ConnectorApacheKafkaClusterArgs> apacheKafkaCluster;

        public Builder() {
    	      // Empty
        }

        public Builder(ConnectorKafkaClusterArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.apacheKafkaCluster = defaults.apacheKafkaCluster;
        }

        public Builder setApacheKafkaCluster(Input<ConnectorApacheKafkaClusterArgs> apacheKafkaCluster) {
            this.apacheKafkaCluster = Objects.requireNonNull(apacheKafkaCluster);
            return this;
        }

        public Builder setApacheKafkaCluster(ConnectorApacheKafkaClusterArgs apacheKafkaCluster) {
            this.apacheKafkaCluster = Input.of(Objects.requireNonNull(apacheKafkaCluster));
            return this;
        }

        public ConnectorKafkaClusterArgs build() {
            return new ConnectorKafkaClusterArgs(apacheKafkaCluster);
        }
    }
}