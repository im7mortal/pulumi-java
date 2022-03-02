// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.cfg.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class RuleScope {
    /**
     * The IDs of the only AWS resource that you want to trigger an evaluation for the rule. If you specify a resource ID, you must specify one resource type for `compliance_resource_types`.
     * 
     */
    private final @Nullable String complianceResourceId;
    /**
     * A list of resource types of only those AWS resources that you want to trigger an evaluation for the ruleE.g., `AWS::EC2::Instance`. You can only specify one type if you also specify a resource ID for `compliance_resource_id`. See [relevant part of AWS Docs](http://docs.aws.amazon.com/config/latest/APIReference/API_ResourceIdentifier.html#config-Type-ResourceIdentifier-resourceType) for available types.
     * 
     */
    private final @Nullable List<String> complianceResourceTypes;
    /**
     * The tag key that is applied to only those AWS resources that you want you want to trigger an evaluation for the rule.
     * 
     */
    private final @Nullable String tagKey;
    /**
     * The tag value applied to only those AWS resources that you want to trigger an evaluation for the rule.
     * 
     */
    private final @Nullable String tagValue;

    @OutputCustomType.Constructor({"complianceResourceId","complianceResourceTypes","tagKey","tagValue"})
    private RuleScope(
        @Nullable String complianceResourceId,
        @Nullable List<String> complianceResourceTypes,
        @Nullable String tagKey,
        @Nullable String tagValue) {
        this.complianceResourceId = complianceResourceId;
        this.complianceResourceTypes = complianceResourceTypes;
        this.tagKey = tagKey;
        this.tagValue = tagValue;
    }

    /**
     * The IDs of the only AWS resource that you want to trigger an evaluation for the rule. If you specify a resource ID, you must specify one resource type for `compliance_resource_types`.
     * 
    */
    public Optional<String> getComplianceResourceId() {
        return Optional.ofNullable(this.complianceResourceId);
    }
    /**
     * A list of resource types of only those AWS resources that you want to trigger an evaluation for the ruleE.g., `AWS::EC2::Instance`. You can only specify one type if you also specify a resource ID for `compliance_resource_id`. See [relevant part of AWS Docs](http://docs.aws.amazon.com/config/latest/APIReference/API_ResourceIdentifier.html#config-Type-ResourceIdentifier-resourceType) for available types.
     * 
    */
    public List<String> getComplianceResourceTypes() {
        return this.complianceResourceTypes == null ? List.of() : this.complianceResourceTypes;
    }
    /**
     * The tag key that is applied to only those AWS resources that you want you want to trigger an evaluation for the rule.
     * 
    */
    public Optional<String> getTagKey() {
        return Optional.ofNullable(this.tagKey);
    }
    /**
     * The tag value applied to only those AWS resources that you want to trigger an evaluation for the rule.
     * 
    */
    public Optional<String> getTagValue() {
        return Optional.ofNullable(this.tagValue);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(RuleScope defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String complianceResourceId;
        private @Nullable List<String> complianceResourceTypes;
        private @Nullable String tagKey;
        private @Nullable String tagValue;

        public Builder() {
    	      // Empty
        }

        public Builder(RuleScope defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.complianceResourceId = defaults.complianceResourceId;
    	      this.complianceResourceTypes = defaults.complianceResourceTypes;
    	      this.tagKey = defaults.tagKey;
    	      this.tagValue = defaults.tagValue;
        }

        public Builder setComplianceResourceId(@Nullable String complianceResourceId) {
            this.complianceResourceId = complianceResourceId;
            return this;
        }

        public Builder setComplianceResourceTypes(@Nullable List<String> complianceResourceTypes) {
            this.complianceResourceTypes = complianceResourceTypes;
            return this;
        }

        public Builder setTagKey(@Nullable String tagKey) {
            this.tagKey = tagKey;
            return this;
        }

        public Builder setTagValue(@Nullable String tagValue) {
            this.tagValue = tagValue;
            return this;
        }
        public RuleScope build() {
            return new RuleScope(complianceResourceId, complianceResourceTypes, tagKey, tagValue);
        }
    }
}
