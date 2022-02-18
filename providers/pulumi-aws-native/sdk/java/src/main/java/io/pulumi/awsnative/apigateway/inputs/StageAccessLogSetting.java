// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.apigateway.inputs;

import io.pulumi.core.internal.annotations.InputImport;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * Specifies settings for logging access in this stage.
 * 
 */
public final class StageAccessLogSetting extends io.pulumi.resources.InvokeArgs {

    public static final StageAccessLogSetting Empty = new StageAccessLogSetting();

    /**
     * The Amazon Resource Name (ARN) of the CloudWatch Logs log group or Kinesis Data Firehose delivery stream to receive access logs. If you specify a Kinesis Data Firehose delivery stream, the stream name must begin with amazon-apigateway-. This parameter is required to enable access logging.
     * 
     */
    @InputImport(name="destinationArn")
    private final @Nullable String destinationArn;

    public Optional<String> getDestinationArn() {
        return this.destinationArn == null ? Optional.empty() : Optional.ofNullable(this.destinationArn);
    }

    /**
     * A single line format of the access logs of data, as specified by selected $context variables (https://docs.aws.amazon.com/apigateway/latest/developerguide/api-gateway-mapping-template-reference.html#context-variable-reference). The format must include at least $context.requestId. This parameter is required to enable access logging.
     * 
     */
    @InputImport(name="format")
    private final @Nullable String format;

    public Optional<String> getFormat() {
        return this.format == null ? Optional.empty() : Optional.ofNullable(this.format);
    }

    public StageAccessLogSetting(
        @Nullable String destinationArn,
        @Nullable String format) {
        this.destinationArn = destinationArn;
        this.format = format;
    }

    private StageAccessLogSetting() {
        this.destinationArn = null;
        this.format = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(StageAccessLogSetting defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String destinationArn;
        private @Nullable String format;

        public Builder() {
    	      // Empty
        }

        public Builder(StageAccessLogSetting defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.destinationArn = defaults.destinationArn;
    	      this.format = defaults.format;
        }

        public Builder setDestinationArn(@Nullable String destinationArn) {
            this.destinationArn = destinationArn;
            return this;
        }

        public Builder setFormat(@Nullable String format) {
            this.format = format;
            return this;
        }

        public StageAccessLogSetting build() {
            return new StageAccessLogSetting(destinationArn, format);
        }
    }
}
