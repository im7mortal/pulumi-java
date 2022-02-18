// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.backup.inputs;

import io.pulumi.awsnative.backup.inputs.FrameworkTagArgs;
import io.pulumi.core.Input;
import io.pulumi.core.internal.annotations.InputImport;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * The scope of a control. The control scope defines what the control will evaluate. Three examples of control scopes are: a specific backup plan, all backup plans with a specific tag, or all backup plans.
 * 
 */
public final class FrameworkControlControlScopePropertiesArgs extends io.pulumi.resources.ResourceArgs {

    public static final FrameworkControlControlScopePropertiesArgs Empty = new FrameworkControlControlScopePropertiesArgs();

    /**
     * The ID of the only AWS resource that you want your control scope to contain.
     * 
     */
    @InputImport(name="complianceResourceIds")
    private final @Nullable Input<List<String>> complianceResourceIds;

    public Input<List<String>> getComplianceResourceIds() {
        return this.complianceResourceIds == null ? Input.empty() : this.complianceResourceIds;
    }

    /**
     * Describes whether the control scope includes one or more types of resources, such as `EFS` or `RDS`.
     * 
     */
    @InputImport(name="complianceResourceTypes")
    private final @Nullable Input<List<String>> complianceResourceTypes;

    public Input<List<String>> getComplianceResourceTypes() {
        return this.complianceResourceTypes == null ? Input.empty() : this.complianceResourceTypes;
    }

    /**
     * Describes whether the control scope includes resources with one or more tags. Each tag is a key-value pair.
     * 
     */
    @InputImport(name="tags")
    private final @Nullable Input<List<FrameworkTagArgs>> tags;

    public Input<List<FrameworkTagArgs>> getTags() {
        return this.tags == null ? Input.empty() : this.tags;
    }

    public FrameworkControlControlScopePropertiesArgs(
        @Nullable Input<List<String>> complianceResourceIds,
        @Nullable Input<List<String>> complianceResourceTypes,
        @Nullable Input<List<FrameworkTagArgs>> tags) {
        this.complianceResourceIds = complianceResourceIds;
        this.complianceResourceTypes = complianceResourceTypes;
        this.tags = tags;
    }

    private FrameworkControlControlScopePropertiesArgs() {
        this.complianceResourceIds = Input.empty();
        this.complianceResourceTypes = Input.empty();
        this.tags = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(FrameworkControlControlScopePropertiesArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<List<String>> complianceResourceIds;
        private @Nullable Input<List<String>> complianceResourceTypes;
        private @Nullable Input<List<FrameworkTagArgs>> tags;

        public Builder() {
    	      // Empty
        }

        public Builder(FrameworkControlControlScopePropertiesArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.complianceResourceIds = defaults.complianceResourceIds;
    	      this.complianceResourceTypes = defaults.complianceResourceTypes;
    	      this.tags = defaults.tags;
        }

        public Builder setComplianceResourceIds(@Nullable Input<List<String>> complianceResourceIds) {
            this.complianceResourceIds = complianceResourceIds;
            return this;
        }

        public Builder setComplianceResourceIds(@Nullable List<String> complianceResourceIds) {
            this.complianceResourceIds = Input.ofNullable(complianceResourceIds);
            return this;
        }

        public Builder setComplianceResourceTypes(@Nullable Input<List<String>> complianceResourceTypes) {
            this.complianceResourceTypes = complianceResourceTypes;
            return this;
        }

        public Builder setComplianceResourceTypes(@Nullable List<String> complianceResourceTypes) {
            this.complianceResourceTypes = Input.ofNullable(complianceResourceTypes);
            return this;
        }

        public Builder setTags(@Nullable Input<List<FrameworkTagArgs>> tags) {
            this.tags = tags;
            return this;
        }

        public Builder setTags(@Nullable List<FrameworkTagArgs> tags) {
            this.tags = Input.ofNullable(tags);
            return this;
        }

        public FrameworkControlControlScopePropertiesArgs build() {
            return new FrameworkControlControlScopePropertiesArgs(complianceResourceIds, complianceResourceTypes, tags);
        }
    }
}
