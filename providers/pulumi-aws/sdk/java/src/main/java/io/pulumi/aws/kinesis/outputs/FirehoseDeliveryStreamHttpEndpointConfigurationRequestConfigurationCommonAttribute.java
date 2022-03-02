// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.kinesis.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import java.lang.String;
import java.util.Objects;

@OutputCustomType
public final class FirehoseDeliveryStreamHttpEndpointConfigurationRequestConfigurationCommonAttribute {
    /**
     * The name of the HTTP endpoint common attribute.
     * 
     */
    private final String name;
    /**
     * The value of the HTTP endpoint common attribute.
     * 
     */
    private final String value;

    @OutputCustomType.Constructor({"name","value"})
    private FirehoseDeliveryStreamHttpEndpointConfigurationRequestConfigurationCommonAttribute(
        String name,
        String value) {
        this.name = Objects.requireNonNull(name);
        this.value = Objects.requireNonNull(value);
    }

    /**
     * The name of the HTTP endpoint common attribute.
     * 
    */
    public String getName() {
        return this.name;
    }
    /**
     * The value of the HTTP endpoint common attribute.
     * 
    */
    public String getValue() {
        return this.value;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(FirehoseDeliveryStreamHttpEndpointConfigurationRequestConfigurationCommonAttribute defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String name;
        private String value;

        public Builder() {
    	      // Empty
        }

        public Builder(FirehoseDeliveryStreamHttpEndpointConfigurationRequestConfigurationCommonAttribute defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.name = defaults.name;
    	      this.value = defaults.value;
        }

        public Builder setName(String name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }

        public Builder setValue(String value) {
            this.value = Objects.requireNonNull(value);
            return this;
        }
        public FirehoseDeliveryStreamHttpEndpointConfigurationRequestConfigurationCommonAttribute build() {
            return new FirehoseDeliveryStreamHttpEndpointConfigurationRequestConfigurationCommonAttribute(name, value);
        }
    }
}
