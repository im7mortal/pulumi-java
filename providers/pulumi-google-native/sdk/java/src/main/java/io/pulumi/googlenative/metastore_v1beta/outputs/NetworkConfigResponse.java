// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.metastore_v1beta.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import io.pulumi.googlenative.metastore_v1beta.outputs.ConsumerResponse;
import java.util.List;
import java.util.Objects;

@OutputCustomType
public final class NetworkConfigResponse {
    /**
     * Immutable. The consumer-side network configuration for the Dataproc Metastore instance.
     * 
     */
    private final List<ConsumerResponse> consumers;

    @OutputCustomType.Constructor({"consumers"})
    private NetworkConfigResponse(List<ConsumerResponse> consumers) {
        this.consumers = Objects.requireNonNull(consumers);
    }

    /**
     * Immutable. The consumer-side network configuration for the Dataproc Metastore instance.
     * 
    */
    public List<ConsumerResponse> getConsumers() {
        return this.consumers;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(NetworkConfigResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private List<ConsumerResponse> consumers;

        public Builder() {
    	      // Empty
        }

        public Builder(NetworkConfigResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.consumers = defaults.consumers;
        }

        public Builder setConsumers(List<ConsumerResponse> consumers) {
            this.consumers = Objects.requireNonNull(consumers);
            return this;
        }
        public NetworkConfigResponse build() {
            return new NetworkConfigResponse(consumers);
        }
    }
}
