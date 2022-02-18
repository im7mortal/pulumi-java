// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.outputs;

import io.pulumi.core.Input;
import io.pulumi.core.internal.annotations.OutputCustomType;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import javax.annotation.Nullable;

@OutputCustomType
public final class ProviderAssumeRoleArgs {
    /**
     * Number of seconds to restrict the assume role session duration.
     * 
     */
    private final @Nullable Input<Integer> durationSeconds;
    /**
     * External identifier to use when assuming the role.
     * 
     */
    private final @Nullable Input<String> externalId;
    /**
     * IAM Policy JSON describing further restricting permissions for the IAM Role being assumed.
     * 
     */
    private final @Nullable Input<String> policy;
    /**
     * Set of Amazon Resource Names (ARNs) of IAM Policies describing further restricting permissions for the role.
     * 
     */
    private final @Nullable Input<List<String>> policyArns;
    /**
     * Amazon Resource Name (ARN) of the IAM Role to assume.
     * 
     */
    private final @Nullable Input<String> roleArn;
    /**
     * Session name to use when assuming the role.
     * 
     */
    private final @Nullable Input<String> sessionName;
    /**
     * Map of assume role session tags.
     * 
     */
    private final @Nullable Input<Map<String,String>> tags;
    /**
     * A list of keys for session tags that you want to set as transitive. If you set a tag key as transitive, the corresponding key and value passes to subsequent sessions in a role chain.
     * 
     */
    private final @Nullable Input<List<String>> transitiveTagKeys;

    @OutputCustomType.Constructor({"durationSeconds","externalId","policy","policyArns","roleArn","sessionName","tags","transitiveTagKeys"})
    private ProviderAssumeRoleArgs(
        @Nullable Input<Integer> durationSeconds,
        @Nullable Input<String> externalId,
        @Nullable Input<String> policy,
        @Nullable Input<List<String>> policyArns,
        @Nullable Input<String> roleArn,
        @Nullable Input<String> sessionName,
        @Nullable Input<Map<String,String>> tags,
        @Nullable Input<List<String>> transitiveTagKeys) {
        this.durationSeconds = durationSeconds;
        this.externalId = externalId;
        this.policy = policy;
        this.policyArns = policyArns;
        this.roleArn = roleArn;
        this.sessionName = sessionName;
        this.tags = tags;
        this.transitiveTagKeys = transitiveTagKeys;
    }

    /**
     * Number of seconds to restrict the assume role session duration.
     * 
     */
    public @Nullable Input<Integer> getDurationSeconds() {
        return this.durationSeconds;
    }
    /**
     * External identifier to use when assuming the role.
     * 
     */
    public @Nullable Input<String> getExternalId() {
        return this.externalId;
    }
    /**
     * IAM Policy JSON describing further restricting permissions for the IAM Role being assumed.
     * 
     */
    public @Nullable Input<String> getPolicy() {
        return this.policy;
    }
    /**
     * Set of Amazon Resource Names (ARNs) of IAM Policies describing further restricting permissions for the role.
     * 
     */
    public @Nullable Input<List<String>> getPolicyArns() {
        return this.policyArns;
    }
    /**
     * Amazon Resource Name (ARN) of the IAM Role to assume.
     * 
     */
    public @Nullable Input<String> getRoleArn() {
        return this.roleArn;
    }
    /**
     * Session name to use when assuming the role.
     * 
     */
    public @Nullable Input<String> getSessionName() {
        return this.sessionName;
    }
    /**
     * Map of assume role session tags.
     * 
     */
    public @Nullable Input<Map<String,String>> getTags() {
        return this.tags;
    }
    /**
     * A list of keys for session tags that you want to set as transitive. If you set a tag key as transitive, the corresponding key and value passes to subsequent sessions in a role chain.
     * 
     */
    public @Nullable Input<List<String>> getTransitiveTagKeys() {
        return this.transitiveTagKeys;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ProviderAssumeRoleArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<Integer> durationSeconds;
        private @Nullable Input<String> externalId;
        private @Nullable Input<String> policy;
        private @Nullable Input<List<String>> policyArns;
        private @Nullable Input<String> roleArn;
        private @Nullable Input<String> sessionName;
        private @Nullable Input<Map<String,String>> tags;
        private @Nullable Input<List<String>> transitiveTagKeys;

        public Builder() {
    	      // Empty
        }

        public Builder(ProviderAssumeRoleArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.durationSeconds = defaults.durationSeconds;
    	      this.externalId = defaults.externalId;
    	      this.policy = defaults.policy;
    	      this.policyArns = defaults.policyArns;
    	      this.roleArn = defaults.roleArn;
    	      this.sessionName = defaults.sessionName;
    	      this.tags = defaults.tags;
    	      this.transitiveTagKeys = defaults.transitiveTagKeys;
        }

        public Builder setDurationSeconds(@Nullable Input<Integer> durationSeconds) {
            this.durationSeconds = durationSeconds;
            return this;
        }

        public Builder setExternalId(@Nullable Input<String> externalId) {
            this.externalId = externalId;
            return this;
        }

        public Builder setPolicy(@Nullable Input<String> policy) {
            this.policy = policy;
            return this;
        }

        public Builder setPolicyArns(@Nullable Input<List<String>> policyArns) {
            this.policyArns = policyArns;
            return this;
        }

        public Builder setRoleArn(@Nullable Input<String> roleArn) {
            this.roleArn = roleArn;
            return this;
        }

        public Builder setSessionName(@Nullable Input<String> sessionName) {
            this.sessionName = sessionName;
            return this;
        }

        public Builder setTags(@Nullable Input<Map<String,String>> tags) {
            this.tags = tags;
            return this;
        }

        public Builder setTransitiveTagKeys(@Nullable Input<List<String>> transitiveTagKeys) {
            this.transitiveTagKeys = transitiveTagKeys;
            return this;
        }

        public ProviderAssumeRoleArgs build() {
            return new ProviderAssumeRoleArgs(durationSeconds, externalId, policy, policyArns, roleArn, sessionName, tags, transitiveTagKeys);
        }
    }
}
