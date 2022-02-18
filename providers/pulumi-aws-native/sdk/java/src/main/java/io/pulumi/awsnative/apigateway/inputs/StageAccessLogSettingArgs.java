// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.apigateway.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.internal.annotations.InputImport;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * Specifies settings for logging access in this stage.
 * 
 */
public final class StageAccessLogSettingArgs extends io.pulumi.resources.ResourceArgs {

    public static final StageAccessLogSettingArgs Empty = new StageAccessLogSettingArgs();

    /**
     * The Amazon Resource Name (ARN) of the CloudWatch Logs log group or Kinesis Data Firehose delivery stream to receive access logs. If you specify a Kinesis Data Firehose delivery stream, the stream name must begin with amazon-apigateway-. This parameter is required to enable access logging.
     * 
     */
    @InputImport(name="destinationArn")
    private final @Nullable Input<String> destinationArn;

    public Input<String> getDestinationArn() {
        return this.destinationArn == null ? Input.empty() : this.destinationArn;
    }

    /**
     * A single line format of the access logs of data, as specified by selected $context variables (https://docs.aws.amazon.com/apigateway/latest/developerguide/api-gateway-mapping-template-reference.html#context-variable-reference). The format must include at least $context.requestId. This parameter is required to enable access logging.
     * 
     */
    @InputImport(name="format")
    private final @Nullable Input<String> format;

    public Input<String> getFormat() {
        return this.format == null ? Input.empty() : this.format;
    }

    public StageAccessLogSettingArgs(
        @Nullable Input<String> destinationArn,
        @Nullable Input<String> format) {
        this.destinationArn = destinationArn;
        this.format = format;
    }

    private StageAccessLogSettingArgs() {
        this.destinationArn = Input.empty();
        this.format = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(StageAccessLogSettingArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<String> destinationArn;
        private @Nullable Input<String> format;

        public Builder() {
    	      // Empty
        }

        public Builder(StageAccessLogSettingArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.destinationArn = defaults.destinationArn;
    	      this.format = defaults.format;
        }

        public Builder setDestinationArn(@Nullable Input<String> destinationArn) {
            this.destinationArn = destinationArn;
            return this;
        }

        public Builder setDestinationArn(@Nullable String destinationArn) {
            this.destinationArn = Input.ofNullable(destinationArn);
            return this;
        }

        public Builder setFormat(@Nullable Input<String> format) {
            this.format = format;
            return this;
        }

        public Builder setFormat(@Nullable String format) {
            this.format = Input.ofNullable(format);
            return this;
        }

        public StageAccessLogSettingArgs build() {
            return new StageAccessLogSettingArgs(destinationArn, format);
        }
    }
}
