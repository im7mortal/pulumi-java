// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.compute_alpha.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.googlenative.compute_alpha.outputs.FixedOrPercentResponse;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class InstanceGroupManagerVersionResponse {
    /**
     * @return The URL of the instance template that is specified for this managed instance group. The group uses this template to create new instances in the managed instance group until the `targetSize` for this version is reached. The templates for existing instances in the group do not change unless you run recreateInstances, run applyUpdatesToInstances, or set the group&#39;s updatePolicy.type to PROACTIVE; in those cases, existing instances are updated until the `targetSize` for this version is reached.
     * 
     */
    private final String instanceTemplate;
    /**
     * @return Name of the version. Unique among all versions in the scope of this managed instance group.
     * 
     */
    private final String name;
    /**
     * @return Tag describing the version. Used to trigger rollout of a target version even if instance_template remains unchanged. Deprecated in favor of &#39;name&#39;.
     * 
     * @deprecated
     * Tag describing the version. Used to trigger rollout of a target version even if instance_template remains unchanged. Deprecated in favor of &#39;name&#39;.
     * 
     */
    @Deprecated /* Tag describing the version. Used to trigger rollout of a target version even if instance_template remains unchanged. Deprecated in favor of 'name'. */
    private final String tag;
    /**
     * @return Specifies the intended number of instances to be created from the instanceTemplate. The final number of instances created from the template will be equal to: - If expressed as a fixed number, the minimum of either targetSize.fixed or instanceGroupManager.targetSize is used. - if expressed as a percent, the targetSize would be (targetSize.percent/100 * InstanceGroupManager.targetSize) If there is a remainder, the number is rounded. If unset, this version will update any remaining instances not updated by another version. Read Starting a canary update for more information.
     * 
     */
    private final FixedOrPercentResponse targetSize;

    @CustomType.Constructor
    private InstanceGroupManagerVersionResponse(
        @CustomType.Parameter("instanceTemplate") String instanceTemplate,
        @CustomType.Parameter("name") String name,
        @CustomType.Parameter("tag") String tag,
        @CustomType.Parameter("targetSize") FixedOrPercentResponse targetSize) {
        this.instanceTemplate = instanceTemplate;
        this.name = name;
        this.tag = tag;
        this.targetSize = targetSize;
    }

    /**
     * @return The URL of the instance template that is specified for this managed instance group. The group uses this template to create new instances in the managed instance group until the `targetSize` for this version is reached. The templates for existing instances in the group do not change unless you run recreateInstances, run applyUpdatesToInstances, or set the group&#39;s updatePolicy.type to PROACTIVE; in those cases, existing instances are updated until the `targetSize` for this version is reached.
     * 
     */
    public String instanceTemplate() {
        return this.instanceTemplate;
    }
    /**
     * @return Name of the version. Unique among all versions in the scope of this managed instance group.
     * 
     */
    public String name() {
        return this.name;
    }
    /**
     * @return Tag describing the version. Used to trigger rollout of a target version even if instance_template remains unchanged. Deprecated in favor of &#39;name&#39;.
     * 
     * @deprecated
     * Tag describing the version. Used to trigger rollout of a target version even if instance_template remains unchanged. Deprecated in favor of &#39;name&#39;.
     * 
     */
    @Deprecated /* Tag describing the version. Used to trigger rollout of a target version even if instance_template remains unchanged. Deprecated in favor of 'name'. */
    public String tag() {
        return this.tag;
    }
    /**
     * @return Specifies the intended number of instances to be created from the instanceTemplate. The final number of instances created from the template will be equal to: - If expressed as a fixed number, the minimum of either targetSize.fixed or instanceGroupManager.targetSize is used. - if expressed as a percent, the targetSize would be (targetSize.percent/100 * InstanceGroupManager.targetSize) If there is a remainder, the number is rounded. If unset, this version will update any remaining instances not updated by another version. Read Starting a canary update for more information.
     * 
     */
    public FixedOrPercentResponse targetSize() {
        return this.targetSize;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(InstanceGroupManagerVersionResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String instanceTemplate;
        private String name;
        private String tag;
        private FixedOrPercentResponse targetSize;

        public Builder() {
    	      // Empty
        }

        public Builder(InstanceGroupManagerVersionResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.instanceTemplate = defaults.instanceTemplate;
    	      this.name = defaults.name;
    	      this.tag = defaults.tag;
    	      this.targetSize = defaults.targetSize;
        }

        public Builder instanceTemplate(String instanceTemplate) {
            this.instanceTemplate = Objects.requireNonNull(instanceTemplate);
            return this;
        }
        public Builder name(String name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }
        public Builder tag(String tag) {
            this.tag = Objects.requireNonNull(tag);
            return this;
        }
        public Builder targetSize(FixedOrPercentResponse targetSize) {
            this.targetSize = Objects.requireNonNull(targetSize);
            return this;
        }        public InstanceGroupManagerVersionResponse build() {
            return new InstanceGroupManagerVersionResponse(instanceTemplate, name, tag, targetSize);
        }
    }
}
