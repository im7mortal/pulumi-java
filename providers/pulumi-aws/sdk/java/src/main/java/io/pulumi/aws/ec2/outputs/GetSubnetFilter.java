// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.ec2.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import java.lang.String;
import java.util.List;
import java.util.Objects;

@OutputCustomType
public final class GetSubnetFilter {
    /**
     * The name of the field to filter by, as defined by [the underlying AWS API](http://docs.aws.amazon.com/AWSEC2/latest/APIReference/API_DescribeSubnets.html).
     * 
     */
    private final String name;
    /**
     * Set of values that are accepted for the given field. A subnet will be selected if any one of the given values matches.
     * 
     */
    private final List<String> values;

    @OutputCustomType.Constructor({"name","values"})
    private GetSubnetFilter(
        String name,
        List<String> values) {
        this.name = Objects.requireNonNull(name);
        this.values = Objects.requireNonNull(values);
    }

    /**
     * The name of the field to filter by, as defined by [the underlying AWS API](http://docs.aws.amazon.com/AWSEC2/latest/APIReference/API_DescribeSubnets.html).
     * 
    */
    public String getName() {
        return this.name;
    }
    /**
     * Set of values that are accepted for the given field. A subnet will be selected if any one of the given values matches.
     * 
    */
    public List<String> getValues() {
        return this.values;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetSubnetFilter defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String name;
        private List<String> values;

        public Builder() {
    	      // Empty
        }

        public Builder(GetSubnetFilter defaults) {
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
        public GetSubnetFilter build() {
            return new GetSubnetFilter(name, values);
        }
    }
}
