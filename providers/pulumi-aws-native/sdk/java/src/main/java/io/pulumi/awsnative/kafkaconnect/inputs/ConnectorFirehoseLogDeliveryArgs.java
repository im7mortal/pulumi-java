// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.kafkaconnect.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.internal.annotations.InputImport;
import java.lang.Boolean;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * Details about delivering logs to Amazon Kinesis Data Firehose.
 * 
 */
public final class ConnectorFirehoseLogDeliveryArgs extends io.pulumi.resources.ResourceArgs {

    public static final ConnectorFirehoseLogDeliveryArgs Empty = new ConnectorFirehoseLogDeliveryArgs();

    /**
     * The Kinesis Data Firehose delivery stream that is the destination for log delivery.
     * 
     */
    @InputImport(name="deliveryStream")
    private final @Nullable Input<String> deliveryStream;

    public Input<String> getDeliveryStream() {
        return this.deliveryStream == null ? Input.empty() : this.deliveryStream;
    }

    /**
     * Specifies whether the logs get sent to the specified Kinesis Data Firehose delivery stream.
     * 
     */
    @InputImport(name="enabled", required=true)
    private final Input<Boolean> enabled;

    public Input<Boolean> getEnabled() {
        return this.enabled;
    }

    public ConnectorFirehoseLogDeliveryArgs(
        @Nullable Input<String> deliveryStream,
        Input<Boolean> enabled) {
        this.deliveryStream = deliveryStream;
        this.enabled = Objects.requireNonNull(enabled, "expected parameter 'enabled' to be non-null");
    }

    private ConnectorFirehoseLogDeliveryArgs() {
        this.deliveryStream = Input.empty();
        this.enabled = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ConnectorFirehoseLogDeliveryArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<String> deliveryStream;
        private Input<Boolean> enabled;

        public Builder() {
    	      // Empty
        }

        public Builder(ConnectorFirehoseLogDeliveryArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.deliveryStream = defaults.deliveryStream;
    	      this.enabled = defaults.enabled;
        }

        public Builder setDeliveryStream(@Nullable Input<String> deliveryStream) {
            this.deliveryStream = deliveryStream;
            return this;
        }

        public Builder setDeliveryStream(@Nullable String deliveryStream) {
            this.deliveryStream = Input.ofNullable(deliveryStream);
            return this;
        }

        public Builder setEnabled(Input<Boolean> enabled) {
            this.enabled = Objects.requireNonNull(enabled);
            return this;
        }

        public Builder setEnabled(Boolean enabled) {
            this.enabled = Input.of(Objects.requireNonNull(enabled));
            return this;
        }

        public ConnectorFirehoseLogDeliveryArgs build() {
            return new ConnectorFirehoseLogDeliveryArgs(deliveryStream, enabled);
        }
    }
}
