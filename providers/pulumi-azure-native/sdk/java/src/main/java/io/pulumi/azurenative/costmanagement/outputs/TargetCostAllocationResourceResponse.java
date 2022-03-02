// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.costmanagement.outputs;

import io.pulumi.azurenative.costmanagement.outputs.CostAllocationProportionResponse;
import io.pulumi.core.annotations.OutputCustomType;
import java.lang.String;
import java.util.List;
import java.util.Objects;

@OutputCustomType
public final class TargetCostAllocationResourceResponse {
    /**
     * If resource type is dimension, this must be either ResourceGroupName or SubscriptionId. If resource type is tag, this must be a valid Azure tag
     * 
     */
    private final String name;
    /**
     * Method of cost allocation for the rule
     * 
     */
    private final String policyType;
    /**
     * Type of resources contained in this cost allocation rule
     * 
     */
    private final String resourceType;
    /**
     * Target resources for cost allocation. This list cannot contain more than 25 values.
     * 
     */
    private final List<CostAllocationProportionResponse> values;

    @OutputCustomType.Constructor({"name","policyType","resourceType","values"})
    private TargetCostAllocationResourceResponse(
        String name,
        String policyType,
        String resourceType,
        List<CostAllocationProportionResponse> values) {
        this.name = Objects.requireNonNull(name);
        this.policyType = Objects.requireNonNull(policyType);
        this.resourceType = Objects.requireNonNull(resourceType);
        this.values = Objects.requireNonNull(values);
    }

    /**
     * If resource type is dimension, this must be either ResourceGroupName or SubscriptionId. If resource type is tag, this must be a valid Azure tag
     * 
    */
    public String getName() {
        return this.name;
    }
    /**
     * Method of cost allocation for the rule
     * 
    */
    public String getPolicyType() {
        return this.policyType;
    }
    /**
     * Type of resources contained in this cost allocation rule
     * 
    */
    public String getPropResourceType() {
        return this.resourceType;
    }
    /**
     * Target resources for cost allocation. This list cannot contain more than 25 values.
     * 
    */
    public List<CostAllocationProportionResponse> getValues() {
        return this.values;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(TargetCostAllocationResourceResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String name;
        private String policyType;
        private String resourceType;
        private List<CostAllocationProportionResponse> values;

        public Builder() {
    	      // Empty
        }

        public Builder(TargetCostAllocationResourceResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.name = defaults.name;
    	      this.policyType = defaults.policyType;
    	      this.resourceType = defaults.resourceType;
    	      this.values = defaults.values;
        }

        public Builder setName(String name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }

        public Builder setPolicyType(String policyType) {
            this.policyType = Objects.requireNonNull(policyType);
            return this;
        }

        public Builder setResourceType(String resourceType) {
            this.resourceType = Objects.requireNonNull(resourceType);
            return this;
        }

        public Builder setValues(List<CostAllocationProportionResponse> values) {
            this.values = Objects.requireNonNull(values);
            return this;
        }
        public TargetCostAllocationResourceResponse build() {
            return new TargetCostAllocationResourceResponse(name, policyType, resourceType, values);
        }
    }
}
