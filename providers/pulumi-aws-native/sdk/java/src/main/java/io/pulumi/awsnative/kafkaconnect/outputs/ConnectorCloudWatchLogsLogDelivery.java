// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.kafkaconnect.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import java.lang.Boolean;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class ConnectorCloudWatchLogsLogDelivery {
    /**
     * Specifies whether the logs get sent to the specified CloudWatch Logs destination.
     * 
     */
    private final Boolean enabled;
    /**
     * The CloudWatch log group that is the destination for log delivery.
     * 
     */
    private final @Nullable String logGroup;

    @OutputCustomType.Constructor({"enabled","logGroup"})
    private ConnectorCloudWatchLogsLogDelivery(
        Boolean enabled,
        @Nullable String logGroup) {
        this.enabled = Objects.requireNonNull(enabled);
        this.logGroup = logGroup;
    }

    /**
     * Specifies whether the logs get sent to the specified CloudWatch Logs destination.
     * 
    */
    public Boolean getEnabled() {
        return this.enabled;
    }
    /**
     * The CloudWatch log group that is the destination for log delivery.
     * 
    */
    public Optional<String> getLogGroup() {
        return Optional.ofNullable(this.logGroup);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ConnectorCloudWatchLogsLogDelivery defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Boolean enabled;
        private @Nullable String logGroup;

        public Builder() {
    	      // Empty
        }

        public Builder(ConnectorCloudWatchLogsLogDelivery defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.enabled = defaults.enabled;
    	      this.logGroup = defaults.logGroup;
        }

        public Builder setEnabled(Boolean enabled) {
            this.enabled = Objects.requireNonNull(enabled);
            return this;
        }

        public Builder setLogGroup(@Nullable String logGroup) {
            this.logGroup = logGroup;
            return this;
        }
        public ConnectorCloudWatchLogsLogDelivery build() {
            return new ConnectorCloudWatchLogsLogDelivery(enabled, logGroup);
        }
    }
}
