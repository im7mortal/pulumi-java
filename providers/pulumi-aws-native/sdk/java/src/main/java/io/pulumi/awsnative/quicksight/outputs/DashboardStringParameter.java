// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.quicksight.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import java.lang.String;
import java.util.List;
import java.util.Objects;

@OutputCustomType
public final class DashboardStringParameter {
    /**
     * <p>A display name for a string parameter.</p>
     * 
     */
    private final String name;
    /**
     * <p>The values of a string parameter.</p>
     * 
     */
    private final List<String> values;

    @OutputCustomType.Constructor({"name","values"})
    private DashboardStringParameter(
        String name,
        List<String> values) {
        this.name = Objects.requireNonNull(name);
        this.values = Objects.requireNonNull(values);
    }

    /**
     * <p>A display name for a string parameter.</p>
     * 
    */
    public String getName() {
        return this.name;
    }
    /**
     * <p>The values of a string parameter.</p>
     * 
    */
    public List<String> getValues() {
        return this.values;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(DashboardStringParameter defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String name;
        private List<String> values;

        public Builder() {
    	      // Empty
        }

        public Builder(DashboardStringParameter defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.name = defaults.name;
    	      this.values = defaults.values;
        }

        public Builder setName(String name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }

        public Builder setValues(List<String> values) {
            this.values = Objects.requireNonNull(values);
            return this;
        }
        public DashboardStringParameter build() {
            return new DashboardStringParameter(name, values);
        }
    }
}
