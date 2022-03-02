// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.quicksight.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import java.lang.Double;
import java.lang.String;
import java.util.List;
import java.util.Objects;

@OutputCustomType
public final class DashboardDecimalParameter {
    /**
     * <p>A display name for the decimal parameter.</p>
     * 
     */
    private final String name;
    /**
     * <p>The values for the decimal parameter.</p>
     * 
     */
    private final List<Double> values;

    @OutputCustomType.Constructor({"name","values"})
    private DashboardDecimalParameter(
        String name,
        List<Double> values) {
        this.name = Objects.requireNonNull(name);
        this.values = Objects.requireNonNull(values);
    }

    /**
     * <p>A display name for the decimal parameter.</p>
     * 
    */
    public String getName() {
        return this.name;
    }
    /**
     * <p>The values for the decimal parameter.</p>
     * 
    */
    public List<Double> getValues() {
        return this.values;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(DashboardDecimalParameter defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String name;
        private List<Double> values;

        public Builder() {
    	      // Empty
        }

        public Builder(DashboardDecimalParameter defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.name = defaults.name;
    	      this.values = defaults.values;
        }

        public Builder setName(String name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }

        public Builder setValues(List<Double> values) {
            this.values = Objects.requireNonNull(values);
            return this;
        }
        public DashboardDecimalParameter build() {
            return new DashboardDecimalParameter(name, values);
        }
    }
}
