// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.networkfirewall.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.internal.annotations.InputImport;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


public final class FirewallPolicyStatefulRuleGroupReferenceArgs extends io.pulumi.resources.ResourceArgs {

    public static final FirewallPolicyStatefulRuleGroupReferenceArgs Empty = new FirewallPolicyStatefulRuleGroupReferenceArgs();

    @InputImport(name="priority")
    private final @Nullable Input<Integer> priority;

    public Input<Integer> getPriority() {
        return this.priority == null ? Input.empty() : this.priority;
    }

    @InputImport(name="resourceArn", required=true)
    private final Input<String> resourceArn;

    public Input<String> getResourceArn() {
        return this.resourceArn;
    }

    public FirewallPolicyStatefulRuleGroupReferenceArgs(
        @Nullable Input<Integer> priority,
        Input<String> resourceArn) {
        this.priority = priority;
        this.resourceArn = Objects.requireNonNull(resourceArn, "expected parameter 'resourceArn' to be non-null");
    }

    private FirewallPolicyStatefulRuleGroupReferenceArgs() {
        this.priority = Input.empty();
        this.resourceArn = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(FirewallPolicyStatefulRuleGroupReferenceArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<Integer> priority;
        private Input<String> resourceArn;

        public Builder() {
    	      // Empty
        }

        public Builder(FirewallPolicyStatefulRuleGroupReferenceArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.priority = defaults.priority;
    	      this.resourceArn = defaults.resourceArn;
        }

        public Builder setPriority(@Nullable Input<Integer> priority) {
            this.priority = priority;
            return this;
        }

        public Builder setPriority(@Nullable Integer priority) {
            this.priority = Input.ofNullable(priority);
            return this;
        }

        public Builder setResourceArn(Input<String> resourceArn) {
            this.resourceArn = Objects.requireNonNull(resourceArn);
            return this;
        }

        public Builder setResourceArn(String resourceArn) {
            this.resourceArn = Input.of(Objects.requireNonNull(resourceArn));
            return this;
        }

        public FirewallPolicyStatefulRuleGroupReferenceArgs build() {
            return new FirewallPolicyStatefulRuleGroupReferenceArgs(priority, resourceArn);
        }
    }
}