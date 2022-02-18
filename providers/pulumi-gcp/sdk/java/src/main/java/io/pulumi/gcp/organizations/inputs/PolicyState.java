// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.organizations.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.internal.annotations.InputImport;
import io.pulumi.gcp.organizations.inputs.PolicyBooleanPolicyGetArgs;
import io.pulumi.gcp.organizations.inputs.PolicyListPolicyGetArgs;
import io.pulumi.gcp.organizations.inputs.PolicyRestorePolicyGetArgs;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


public final class PolicyState extends io.pulumi.resources.ResourceArgs {

    public static final PolicyState Empty = new PolicyState();

    /**
     * A boolean policy is a constraint that is either enforced or not. Structure is documented
     * below.
     * 
     */
    @InputImport(name="booleanPolicy")
    private final @Nullable Input<PolicyBooleanPolicyGetArgs> booleanPolicy;

    public Input<PolicyBooleanPolicyGetArgs> getBooleanPolicy() {
        return this.booleanPolicy == null ? Input.empty() : this.booleanPolicy;
    }

    /**
     * The name of the Constraint the Policy is configuring, for example, `serviceuser.services`. Check out the [complete list of available constraints](https://cloud.google.com/resource-manager/docs/organization-policy/understanding-constraints#available_constraints).
     * 
     */
    @InputImport(name="constraint")
    private final @Nullable Input<String> constraint;

    public Input<String> getConstraint() {
        return this.constraint == null ? Input.empty() : this.constraint;
    }

    /**
     * (Computed) The etag of the organization policy. `etag` is used for optimistic concurrency control as a way to help prevent simultaneous updates of a policy from overwriting each other.
     * 
     */
    @InputImport(name="etag")
    private final @Nullable Input<String> etag;

    public Input<String> getEtag() {
        return this.etag == null ? Input.empty() : this.etag;
    }

    /**
     * A policy that can define specific values that are allowed or denied for the given constraint. It can also be used to allow or deny all values. Structure is documented below.
     * 
     */
    @InputImport(name="listPolicy")
    private final @Nullable Input<PolicyListPolicyGetArgs> listPolicy;

    public Input<PolicyListPolicyGetArgs> getListPolicy() {
        return this.listPolicy == null ? Input.empty() : this.listPolicy;
    }

    /**
     * The numeric ID of the organization to set the policy for.
     * 
     */
    @InputImport(name="orgId")
    private final @Nullable Input<String> orgId;

    public Input<String> getOrgId() {
        return this.orgId == null ? Input.empty() : this.orgId;
    }

    /**
     * A restore policy is a constraint to restore the default policy. Structure is documented below.
     * 
     */
    @InputImport(name="restorePolicy")
    private final @Nullable Input<PolicyRestorePolicyGetArgs> restorePolicy;

    public Input<PolicyRestorePolicyGetArgs> getRestorePolicy() {
        return this.restorePolicy == null ? Input.empty() : this.restorePolicy;
    }

    /**
     * (Computed) The timestamp in RFC3339 UTC "Zulu" format, accurate to nanoseconds, representing when the variable was last updated. Example: "2016-10-09T12:33:37.578138407Z".
     * 
     */
    @InputImport(name="updateTime")
    private final @Nullable Input<String> updateTime;

    public Input<String> getUpdateTime() {
        return this.updateTime == null ? Input.empty() : this.updateTime;
    }

    /**
     * Version of the Policy. Default version is 0.
     * 
     */
    @InputImport(name="version")
    private final @Nullable Input<Integer> version;

    public Input<Integer> getVersion() {
        return this.version == null ? Input.empty() : this.version;
    }

    public PolicyState(
        @Nullable Input<PolicyBooleanPolicyGetArgs> booleanPolicy,
        @Nullable Input<String> constraint,
        @Nullable Input<String> etag,
        @Nullable Input<PolicyListPolicyGetArgs> listPolicy,
        @Nullable Input<String> orgId,
        @Nullable Input<PolicyRestorePolicyGetArgs> restorePolicy,
        @Nullable Input<String> updateTime,
        @Nullable Input<Integer> version) {
        this.booleanPolicy = booleanPolicy;
        this.constraint = constraint;
        this.etag = etag;
        this.listPolicy = listPolicy;
        this.orgId = orgId;
        this.restorePolicy = restorePolicy;
        this.updateTime = updateTime;
        this.version = version;
    }

    private PolicyState() {
        this.booleanPolicy = Input.empty();
        this.constraint = Input.empty();
        this.etag = Input.empty();
        this.listPolicy = Input.empty();
        this.orgId = Input.empty();
        this.restorePolicy = Input.empty();
        this.updateTime = Input.empty();
        this.version = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(PolicyState defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<PolicyBooleanPolicyGetArgs> booleanPolicy;
        private @Nullable Input<String> constraint;
        private @Nullable Input<String> etag;
        private @Nullable Input<PolicyListPolicyGetArgs> listPolicy;
        private @Nullable Input<String> orgId;
        private @Nullable Input<PolicyRestorePolicyGetArgs> restorePolicy;
        private @Nullable Input<String> updateTime;
        private @Nullable Input<Integer> version;

        public Builder() {
    	      // Empty
        }

        public Builder(PolicyState defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.booleanPolicy = defaults.booleanPolicy;
    	      this.constraint = defaults.constraint;
    	      this.etag = defaults.etag;
    	      this.listPolicy = defaults.listPolicy;
    	      this.orgId = defaults.orgId;
    	      this.restorePolicy = defaults.restorePolicy;
    	      this.updateTime = defaults.updateTime;
    	      this.version = defaults.version;
        }

        public Builder setBooleanPolicy(@Nullable Input<PolicyBooleanPolicyGetArgs> booleanPolicy) {
            this.booleanPolicy = booleanPolicy;
            return this;
        }

        public Builder setBooleanPolicy(@Nullable PolicyBooleanPolicyGetArgs booleanPolicy) {
            this.booleanPolicy = Input.ofNullable(booleanPolicy);
            return this;
        }

        public Builder setConstraint(@Nullable Input<String> constraint) {
            this.constraint = constraint;
            return this;
        }

        public Builder setConstraint(@Nullable String constraint) {
            this.constraint = Input.ofNullable(constraint);
            return this;
        }

        public Builder setEtag(@Nullable Input<String> etag) {
            this.etag = etag;
            return this;
        }

        public Builder setEtag(@Nullable String etag) {
            this.etag = Input.ofNullable(etag);
            return this;
        }

        public Builder setListPolicy(@Nullable Input<PolicyListPolicyGetArgs> listPolicy) {
            this.listPolicy = listPolicy;
            return this;
        }

        public Builder setListPolicy(@Nullable PolicyListPolicyGetArgs listPolicy) {
            this.listPolicy = Input.ofNullable(listPolicy);
            return this;
        }

        public Builder setOrgId(@Nullable Input<String> orgId) {
            this.orgId = orgId;
            return this;
        }

        public Builder setOrgId(@Nullable String orgId) {
            this.orgId = Input.ofNullable(orgId);
            return this;
        }

        public Builder setRestorePolicy(@Nullable Input<PolicyRestorePolicyGetArgs> restorePolicy) {
            this.restorePolicy = restorePolicy;
            return this;
        }

        public Builder setRestorePolicy(@Nullable PolicyRestorePolicyGetArgs restorePolicy) {
            this.restorePolicy = Input.ofNullable(restorePolicy);
            return this;
        }

        public Builder setUpdateTime(@Nullable Input<String> updateTime) {
            this.updateTime = updateTime;
            return this;
        }

        public Builder setUpdateTime(@Nullable String updateTime) {
            this.updateTime = Input.ofNullable(updateTime);
            return this;
        }

        public Builder setVersion(@Nullable Input<Integer> version) {
            this.version = version;
            return this;
        }

        public Builder setVersion(@Nullable Integer version) {
            this.version = Input.ofNullable(version);
            return this;
        }

        public PolicyState build() {
            return new PolicyState(booleanPolicy, constraint, etag, listPolicy, orgId, restorePolicy, updateTime, version);
        }
    }
}