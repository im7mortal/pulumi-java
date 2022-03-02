// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.appmesh.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;

@OutputCustomType
public final class VirtualNodeSpecListenerTimeoutHttp2PerRequest {
    /**
     * The unit of time. Valid values: `ms`, `s`.
     * 
     */
    private final String unit;
    /**
     * The number of time units. Minimum value of `0`.
     * 
     */
    private final Integer value;

    @OutputCustomType.Constructor({"unit","value"})
    private VirtualNodeSpecListenerTimeoutHttp2PerRequest(
        String unit,
        Integer value) {
        this.unit = Objects.requireNonNull(unit);
        this.value = Objects.requireNonNull(value);
    }

    /**
     * The unit of time. Valid values: `ms`, `s`.
     * 
    */
    public String getUnit() {
        return this.unit;
    }
    /**
     * The number of time units. Minimum value of `0`.
     * 
    */
    public Integer getValue() {
        return this.value;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(VirtualNodeSpecListenerTimeoutHttp2PerRequest defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String unit;
        private Integer value;

        public Builder() {
    	      // Empty
        }

        public Builder(VirtualNodeSpecListenerTimeoutHttp2PerRequest defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.unit = defaults.unit;
    	      this.value = defaults.value;
        }

        public Builder setUnit(String unit) {
            this.unit = Objects.requireNonNull(unit);
            return this;
        }

        public Builder setValue(Integer value) {
            this.value = Objects.requireNonNull(value);
            return this;
        }
        public VirtualNodeSpecListenerTimeoutHttp2PerRequest build() {
            return new VirtualNodeSpecListenerTimeoutHttp2PerRequest(unit, value);
        }
    }
}
