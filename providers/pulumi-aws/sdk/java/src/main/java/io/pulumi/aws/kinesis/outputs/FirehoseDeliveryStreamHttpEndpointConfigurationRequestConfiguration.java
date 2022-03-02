// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.kinesis.outputs;

import io.pulumi.aws.kinesis.outputs.FirehoseDeliveryStreamHttpEndpointConfigurationRequestConfigurationCommonAttribute;
import io.pulumi.core.annotations.OutputCustomType;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class FirehoseDeliveryStreamHttpEndpointConfigurationRequestConfiguration {
    /**
     * Describes the metadata sent to the HTTP endpoint destination. More details are given below
     * 
     */
    private final @Nullable List<FirehoseDeliveryStreamHttpEndpointConfigurationRequestConfigurationCommonAttribute> commonAttributes;
    /**
     * Kinesis Data Firehose uses the content encoding to compress the body of a request before sending the request to the destination. Valid values are `NONE` and `GZIP`.  Default value is `NONE`.
     * 
     */
    private final @Nullable String contentEncoding;

    @OutputCustomType.Constructor({"commonAttributes","contentEncoding"})
    private FirehoseDeliveryStreamHttpEndpointConfigurationRequestConfiguration(
        @Nullable List<FirehoseDeliveryStreamHttpEndpointConfigurationRequestConfigurationCommonAttribute> commonAttributes,
        @Nullable String contentEncoding) {
        this.commonAttributes = commonAttributes;
        this.contentEncoding = contentEncoding;
    }

    /**
     * Describes the metadata sent to the HTTP endpoint destination. More details are given below
     * 
    */
    public List<FirehoseDeliveryStreamHttpEndpointConfigurationRequestConfigurationCommonAttribute> getCommonAttributes() {
        return this.commonAttributes == null ? List.of() : this.commonAttributes;
    }
    /**
     * Kinesis Data Firehose uses the content encoding to compress the body of a request before sending the request to the destination. Valid values are `NONE` and `GZIP`.  Default value is `NONE`.
     * 
    */
    public Optional<String> getContentEncoding() {
        return Optional.ofNullable(this.contentEncoding);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(FirehoseDeliveryStreamHttpEndpointConfigurationRequestConfiguration defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable List<FirehoseDeliveryStreamHttpEndpointConfigurationRequestConfigurationCommonAttribute> commonAttributes;
        private @Nullable String contentEncoding;

        public Builder() {
    	      // Empty
        }

        public Builder(FirehoseDeliveryStreamHttpEndpointConfigurationRequestConfiguration defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.commonAttributes = defaults.commonAttributes;
    	      this.contentEncoding = defaults.contentEncoding;
        }

        public Builder setCommonAttributes(@Nullable List<FirehoseDeliveryStreamHttpEndpointConfigurationRequestConfigurationCommonAttribute> commonAttributes) {
            this.commonAttributes = commonAttributes;
            return this;
        }

        public Builder setContentEncoding(@Nullable String contentEncoding) {
            this.contentEncoding = contentEncoding;
            return this;
        }
        public FirehoseDeliveryStreamHttpEndpointConfigurationRequestConfiguration build() {
            return new FirehoseDeliveryStreamHttpEndpointConfigurationRequestConfiguration(commonAttributes, contentEncoding);
        }
    }
}
