// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.kinesis.outputs;

import io.pulumi.aws.kinesis.outputs.FirehoseDeliveryStreamSplunkConfigurationProcessingConfigurationProcessorParameter;
import io.pulumi.core.annotations.OutputCustomType;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;

@OutputCustomType
public final class FirehoseDeliveryStreamSplunkConfigurationProcessingConfigurationProcessor {
    /**
     * Array of processor parameters. More details are given below
     * 
     */
    private final @Nullable List<FirehoseDeliveryStreamSplunkConfigurationProcessingConfigurationProcessorParameter> parameters;
    /**
     * The type of processor. Valid Values: `Lambda`
     * 
     */
    private final String type;

    @OutputCustomType.Constructor({"parameters","type"})
    private FirehoseDeliveryStreamSplunkConfigurationProcessingConfigurationProcessor(
        @Nullable List<FirehoseDeliveryStreamSplunkConfigurationProcessingConfigurationProcessorParameter> parameters,
        String type) {
        this.parameters = parameters;
        this.type = Objects.requireNonNull(type);
    }

    /**
     * Array of processor parameters. More details are given below
     * 
    */
    public List<FirehoseDeliveryStreamSplunkConfigurationProcessingConfigurationProcessorParameter> getParameters() {
        return this.parameters == null ? List.of() : this.parameters;
    }
    /**
     * The type of processor. Valid Values: `Lambda`
     * 
    */
    public String getType() {
        return this.type;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(FirehoseDeliveryStreamSplunkConfigurationProcessingConfigurationProcessor defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable List<FirehoseDeliveryStreamSplunkConfigurationProcessingConfigurationProcessorParameter> parameters;
        private String type;

        public Builder() {
    	      // Empty
        }

        public Builder(FirehoseDeliveryStreamSplunkConfigurationProcessingConfigurationProcessor defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.parameters = defaults.parameters;
    	      this.type = defaults.type;
        }

        public Builder setParameters(@Nullable List<FirehoseDeliveryStreamSplunkConfigurationProcessingConfigurationProcessorParameter> parameters) {
            this.parameters = parameters;
            return this;
        }

        public Builder setType(String type) {
            this.type = Objects.requireNonNull(type);
            return this;
        }
        public FirehoseDeliveryStreamSplunkConfigurationProcessingConfigurationProcessor build() {
            return new FirehoseDeliveryStreamSplunkConfigurationProcessingConfigurationProcessor(parameters, type);
        }
    }
}
