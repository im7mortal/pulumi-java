// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.elasticsearch.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;

@OutputCustomType
public final class DomainAutoTuneOptionsMaintenanceScheduleDuration {
    /**
     * The unit of time specifying the duration of an Auto-Tune maintenance window. Valid values: `HOURS`.
     * 
     */
    private final String unit;
    /**
     * An integer specifying the value of the duration of an Auto-Tune maintenance window.
     * 
     */
    private final Integer value;

    @OutputCustomType.Constructor({"unit","value"})
    private DomainAutoTuneOptionsMaintenanceScheduleDuration(
        String unit,
        Integer value) {
        this.unit = Objects.requireNonNull(unit);
        this.value = Objects.requireNonNull(value);
    }

    /**
     * The unit of time specifying the duration of an Auto-Tune maintenance window. Valid values: `HOURS`.
     * 
    */
    public String getUnit() {
        return this.unit;
    }
    /**
     * An integer specifying the value of the duration of an Auto-Tune maintenance window.
     * 
    */
    public Integer getValue() {
        return this.value;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(DomainAutoTuneOptionsMaintenanceScheduleDuration defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String unit;
        private Integer value;

        public Builder() {
    	      // Empty
        }

        public Builder(DomainAutoTuneOptionsMaintenanceScheduleDuration defaults) {
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
        public DomainAutoTuneOptionsMaintenanceScheduleDuration build() {
            return new DomainAutoTuneOptionsMaintenanceScheduleDuration(unit, value);
        }
    }
}
