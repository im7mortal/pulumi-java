// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.servicemanagement_v1.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import io.pulumi.googlenative.servicemanagement_v1.outputs.MonitoringDestinationResponse;
import java.util.List;
import java.util.Objects;

@OutputCustomType
public final class MonitoringResponse {
    /**
     * Monitoring configurations for sending metrics to the consumer project. There can be multiple consumer destinations. A monitored resource type may appear in multiple monitoring destinations if different aggregations are needed for different sets of metrics associated with that monitored resource type. A monitored resource and metric pair may only be used once in the Monitoring configuration.
     * 
     */
    private final List<MonitoringDestinationResponse> consumerDestinations;
    /**
     * Monitoring configurations for sending metrics to the producer project. There can be multiple producer destinations. A monitored resource type may appear in multiple monitoring destinations if different aggregations are needed for different sets of metrics associated with that monitored resource type. A monitored resource and metric pair may only be used once in the Monitoring configuration.
     * 
     */
    private final List<MonitoringDestinationResponse> producerDestinations;

    @OutputCustomType.Constructor({"consumerDestinations","producerDestinations"})
    private MonitoringResponse(
        List<MonitoringDestinationResponse> consumerDestinations,
        List<MonitoringDestinationResponse> producerDestinations) {
        this.consumerDestinations = Objects.requireNonNull(consumerDestinations);
        this.producerDestinations = Objects.requireNonNull(producerDestinations);
    }

    /**
     * Monitoring configurations for sending metrics to the consumer project. There can be multiple consumer destinations. A monitored resource type may appear in multiple monitoring destinations if different aggregations are needed for different sets of metrics associated with that monitored resource type. A monitored resource and metric pair may only be used once in the Monitoring configuration.
     * 
    */
    public List<MonitoringDestinationResponse> getConsumerDestinations() {
        return this.consumerDestinations;
    }
    /**
     * Monitoring configurations for sending metrics to the producer project. There can be multiple producer destinations. A monitored resource type may appear in multiple monitoring destinations if different aggregations are needed for different sets of metrics associated with that monitored resource type. A monitored resource and metric pair may only be used once in the Monitoring configuration.
     * 
    */
    public List<MonitoringDestinationResponse> getProducerDestinations() {
        return this.producerDestinations;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(MonitoringResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private List<MonitoringDestinationResponse> consumerDestinations;
        private List<MonitoringDestinationResponse> producerDestinations;

        public Builder() {
    	      // Empty
        }

        public Builder(MonitoringResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.consumerDestinations = defaults.consumerDestinations;
    	      this.producerDestinations = defaults.producerDestinations;
        }

        public Builder setConsumerDestinations(List<MonitoringDestinationResponse> consumerDestinations) {
            this.consumerDestinations = Objects.requireNonNull(consumerDestinations);
            return this;
        }

        public Builder setProducerDestinations(List<MonitoringDestinationResponse> producerDestinations) {
            this.producerDestinations = Objects.requireNonNull(producerDestinations);
            return this;
        }
        public MonitoringResponse build() {
            return new MonitoringResponse(consumerDestinations, producerDestinations);
        }
    }
}
