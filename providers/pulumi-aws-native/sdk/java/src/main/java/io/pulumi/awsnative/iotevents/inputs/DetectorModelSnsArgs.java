// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.iotevents.inputs;

import io.pulumi.awsnative.iotevents.inputs.DetectorModelPayloadArgs;
import io.pulumi.core.Input;
import io.pulumi.core.internal.annotations.InputImport;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * Information required to publish the Amazon SNS message.
 * 
 */
public final class DetectorModelSnsArgs extends io.pulumi.resources.ResourceArgs {

    public static final DetectorModelSnsArgs Empty = new DetectorModelSnsArgs();

    @InputImport(name="payload")
    private final @Nullable Input<DetectorModelPayloadArgs> payload;

    public Input<DetectorModelPayloadArgs> getPayload() {
        return this.payload == null ? Input.empty() : this.payload;
    }

    /**
     * The ARN of the Amazon SNS target where the message is sent.
     * 
     */
    @InputImport(name="targetArn", required=true)
    private final Input<String> targetArn;

    public Input<String> getTargetArn() {
        return this.targetArn;
    }

    public DetectorModelSnsArgs(
        @Nullable Input<DetectorModelPayloadArgs> payload,
        Input<String> targetArn) {
        this.payload = payload;
        this.targetArn = Objects.requireNonNull(targetArn, "expected parameter 'targetArn' to be non-null");
    }

    private DetectorModelSnsArgs() {
        this.payload = Input.empty();
        this.targetArn = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(DetectorModelSnsArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<DetectorModelPayloadArgs> payload;
        private Input<String> targetArn;

        public Builder() {
    	      // Empty
        }

        public Builder(DetectorModelSnsArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.payload = defaults.payload;
    	      this.targetArn = defaults.targetArn;
        }

        public Builder setPayload(@Nullable Input<DetectorModelPayloadArgs> payload) {
            this.payload = payload;
            return this;
        }

        public Builder setPayload(@Nullable DetectorModelPayloadArgs payload) {
            this.payload = Input.ofNullable(payload);
            return this;
        }

        public Builder setTargetArn(Input<String> targetArn) {
            this.targetArn = Objects.requireNonNull(targetArn);
            return this;
        }

        public Builder setTargetArn(String targetArn) {
            this.targetArn = Input.of(Objects.requireNonNull(targetArn));
            return this;
        }

        public DetectorModelSnsArgs build() {
            return new DetectorModelSnsArgs(payload, targetArn);
        }
    }
}
