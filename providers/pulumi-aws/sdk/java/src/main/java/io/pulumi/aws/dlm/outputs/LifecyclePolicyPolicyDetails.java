// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.dlm.outputs;

import io.pulumi.aws.dlm.outputs.LifecyclePolicyPolicyDetailsSchedule;
import io.pulumi.core.annotations.OutputCustomType;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Objects;

@OutputCustomType
public final class LifecyclePolicyPolicyDetails {
    /**
     * A list of resource types that should be targeted by the lifecycle policy. `VOLUME` is currently the only allowed value.
     * 
     */
    private final List<String> resourceTypes;
    /**
     * See the `schedule` configuration block.
     * 
     */
    private final List<LifecyclePolicyPolicyDetailsSchedule> schedules;
    /**
     * A map of tag keys and their values. Any resources that match the `resource_types` and are tagged with _any_ of these tags will be targeted.
     * 
     */
    private final Map<String,String> targetTags;

    @OutputCustomType.Constructor({"resourceTypes","schedules","targetTags"})
    private LifecyclePolicyPolicyDetails(
        List<String> resourceTypes,
        List<LifecyclePolicyPolicyDetailsSchedule> schedules,
        Map<String,String> targetTags) {
        this.resourceTypes = Objects.requireNonNull(resourceTypes);
        this.schedules = Objects.requireNonNull(schedules);
        this.targetTags = Objects.requireNonNull(targetTags);
    }

    /**
     * A list of resource types that should be targeted by the lifecycle policy. `VOLUME` is currently the only allowed value.
     * 
    */
    public List<String> getResourceTypes() {
        return this.resourceTypes;
    }
    /**
     * See the `schedule` configuration block.
     * 
    */
    public List<LifecyclePolicyPolicyDetailsSchedule> getSchedules() {
        return this.schedules;
    }
    /**
     * A map of tag keys and their values. Any resources that match the `resource_types` and are tagged with _any_ of these tags will be targeted.
     * 
    */
    public Map<String,String> getTargetTags() {
        return this.targetTags;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(LifecyclePolicyPolicyDetails defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private List<String> resourceTypes;
        private List<LifecyclePolicyPolicyDetailsSchedule> schedules;
        private Map<String,String> targetTags;

        public Builder() {
    	      // Empty
        }

        public Builder(LifecyclePolicyPolicyDetails defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.resourceTypes = defaults.resourceTypes;
    	      this.schedules = defaults.schedules;
    	      this.targetTags = defaults.targetTags;
        }

        public Builder setResourceTypes(List<String> resourceTypes) {
            this.resourceTypes = Objects.requireNonNull(resourceTypes);
            return this;
        }

        public Builder setSchedules(List<LifecyclePolicyPolicyDetailsSchedule> schedules) {
            this.schedules = Objects.requireNonNull(schedules);
            return this;
        }

        public Builder setTargetTags(Map<String,String> targetTags) {
            this.targetTags = Objects.requireNonNull(targetTags);
            return this;
        }
        public LifecyclePolicyPolicyDetails build() {
            return new LifecyclePolicyPolicyDetails(resourceTypes, schedules, targetTags);
        }
    }
}
