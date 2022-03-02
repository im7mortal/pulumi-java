// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.connect.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class QueueOutboundCallerConfig {
    /**
     * Specifies the caller ID name.
     * 
     */
    private final @Nullable String outboundCallerIdName;
    /**
     * Specifies the caller ID number.
     * 
     */
    private final @Nullable String outboundCallerIdNumberId;
    /**
     * Specifies outbound whisper flow to be used during an outbound call.
     * 
     */
    private final @Nullable String outboundFlowId;

    @OutputCustomType.Constructor({"outboundCallerIdName","outboundCallerIdNumberId","outboundFlowId"})
    private QueueOutboundCallerConfig(
        @Nullable String outboundCallerIdName,
        @Nullable String outboundCallerIdNumberId,
        @Nullable String outboundFlowId) {
        this.outboundCallerIdName = outboundCallerIdName;
        this.outboundCallerIdNumberId = outboundCallerIdNumberId;
        this.outboundFlowId = outboundFlowId;
    }

    /**
     * Specifies the caller ID name.
     * 
    */
    public Optional<String> getOutboundCallerIdName() {
        return Optional.ofNullable(this.outboundCallerIdName);
    }
    /**
     * Specifies the caller ID number.
     * 
    */
    public Optional<String> getOutboundCallerIdNumberId() {
        return Optional.ofNullable(this.outboundCallerIdNumberId);
    }
    /**
     * Specifies outbound whisper flow to be used during an outbound call.
     * 
    */
    public Optional<String> getOutboundFlowId() {
        return Optional.ofNullable(this.outboundFlowId);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(QueueOutboundCallerConfig defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String outboundCallerIdName;
        private @Nullable String outboundCallerIdNumberId;
        private @Nullable String outboundFlowId;

        public Builder() {
    	      // Empty
        }

        public Builder(QueueOutboundCallerConfig defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.outboundCallerIdName = defaults.outboundCallerIdName;
    	      this.outboundCallerIdNumberId = defaults.outboundCallerIdNumberId;
    	      this.outboundFlowId = defaults.outboundFlowId;
        }

        public Builder setOutboundCallerIdName(@Nullable String outboundCallerIdName) {
            this.outboundCallerIdName = outboundCallerIdName;
            return this;
        }

        public Builder setOutboundCallerIdNumberId(@Nullable String outboundCallerIdNumberId) {
            this.outboundCallerIdNumberId = outboundCallerIdNumberId;
            return this;
        }

        public Builder setOutboundFlowId(@Nullable String outboundFlowId) {
            this.outboundFlowId = outboundFlowId;
            return this;
        }
        public QueueOutboundCallerConfig build() {
            return new QueueOutboundCallerConfig(outboundCallerIdName, outboundCallerIdNumberId, outboundFlowId);
        }
    }
}
