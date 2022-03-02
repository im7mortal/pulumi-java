// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.servicemanagement_v1.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import io.pulumi.googlenative.servicemanagement_v1.outputs.CustomErrorRuleResponse;
import java.lang.String;
import java.util.List;
import java.util.Objects;

@OutputCustomType
public final class CustomErrorResponse {
    /**
     * The list of custom error rules that apply to individual API messages. **NOTE:** All service configuration rules follow "last one wins" order.
     * 
     */
    private final List<CustomErrorRuleResponse> rules;
    /**
     * The list of custom error detail types, e.g. 'google.foo.v1.CustomError'.
     * 
     */
    private final List<String> types;

    @OutputCustomType.Constructor({"rules","types"})
    private CustomErrorResponse(
        List<CustomErrorRuleResponse> rules,
        List<String> types) {
        this.rules = Objects.requireNonNull(rules);
        this.types = Objects.requireNonNull(types);
    }

    /**
     * The list of custom error rules that apply to individual API messages. **NOTE:** All service configuration rules follow "last one wins" order.
     * 
    */
    public List<CustomErrorRuleResponse> getRules() {
        return this.rules;
    }
    /**
     * The list of custom error detail types, e.g. 'google.foo.v1.CustomError'.
     * 
    */
    public List<String> getTypes() {
        return this.types;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(CustomErrorResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private List<CustomErrorRuleResponse> rules;
        private List<String> types;

        public Builder() {
    	      // Empty
        }

        public Builder(CustomErrorResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.rules = defaults.rules;
    	      this.types = defaults.types;
        }

        public Builder setRules(List<CustomErrorRuleResponse> rules) {
            this.rules = Objects.requireNonNull(rules);
            return this;
        }

        public Builder setTypes(List<String> types) {
            this.types = Objects.requireNonNull(types);
            return this;
        }
        public CustomErrorResponse build() {
            return new CustomErrorResponse(rules, types);
        }
    }
}
