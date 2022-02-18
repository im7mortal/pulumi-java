// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.apigateway.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.internal.annotations.InputImport;
import io.pulumi.gcp.apigateway.inputs.ApiConfigIamMemberConditionGetArgs;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


public final class ApiConfigIamMemberState extends io.pulumi.resources.ResourceArgs {

    public static final ApiConfigIamMemberState Empty = new ApiConfigIamMemberState();

    /**
     * The API to attach the config to.
     * Used to find the parent resource to bind the IAM policy to
     * 
     */
    @InputImport(name="api")
    private final @Nullable Input<String> api;

    public Input<String> getApi() {
        return this.api == null ? Input.empty() : this.api;
    }

    @InputImport(name="apiConfig")
    private final @Nullable Input<String> apiConfig;

    public Input<String> getApiConfig() {
        return this.apiConfig == null ? Input.empty() : this.apiConfig;
    }

    @InputImport(name="condition")
    private final @Nullable Input<ApiConfigIamMemberConditionGetArgs> condition;

    public Input<ApiConfigIamMemberConditionGetArgs> getCondition() {
        return this.condition == null ? Input.empty() : this.condition;
    }

    /**
     * (Computed) The etag of the IAM policy.
     * 
     */
    @InputImport(name="etag")
    private final @Nullable Input<String> etag;

    public Input<String> getEtag() {
        return this.etag == null ? Input.empty() : this.etag;
    }

    @InputImport(name="member")
    private final @Nullable Input<String> member;

    public Input<String> getMember() {
        return this.member == null ? Input.empty() : this.member;
    }

    /**
     * The ID of the project in which the resource belongs.
     * If it is not provided, the project will be parsed from the identifier of the parent resource. If no project is provided in the parent identifier and no project is specified, the provider project is used.
     * 
     */
    @InputImport(name="project")
    private final @Nullable Input<String> project;

    public Input<String> getProject() {
        return this.project == null ? Input.empty() : this.project;
    }

    /**
     * The role that should be applied. Only one
     * `gcp.apigateway.ApiConfigIamBinding` can be used per role. Note that custom roles must be of the format
     * `[projects|organizations]/{parent-name}/roles/{role-name}`.
     * 
     */
    @InputImport(name="role")
    private final @Nullable Input<String> role;

    public Input<String> getRole() {
        return this.role == null ? Input.empty() : this.role;
    }

    public ApiConfigIamMemberState(
        @Nullable Input<String> api,
        @Nullable Input<String> apiConfig,
        @Nullable Input<ApiConfigIamMemberConditionGetArgs> condition,
        @Nullable Input<String> etag,
        @Nullable Input<String> member,
        @Nullable Input<String> project,
        @Nullable Input<String> role) {
        this.api = api;
        this.apiConfig = apiConfig;
        this.condition = condition;
        this.etag = etag;
        this.member = member;
        this.project = project;
        this.role = role;
    }

    private ApiConfigIamMemberState() {
        this.api = Input.empty();
        this.apiConfig = Input.empty();
        this.condition = Input.empty();
        this.etag = Input.empty();
        this.member = Input.empty();
        this.project = Input.empty();
        this.role = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ApiConfigIamMemberState defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<String> api;
        private @Nullable Input<String> apiConfig;
        private @Nullable Input<ApiConfigIamMemberConditionGetArgs> condition;
        private @Nullable Input<String> etag;
        private @Nullable Input<String> member;
        private @Nullable Input<String> project;
        private @Nullable Input<String> role;

        public Builder() {
    	      // Empty
        }

        public Builder(ApiConfigIamMemberState defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.api = defaults.api;
    	      this.apiConfig = defaults.apiConfig;
    	      this.condition = defaults.condition;
    	      this.etag = defaults.etag;
    	      this.member = defaults.member;
    	      this.project = defaults.project;
    	      this.role = defaults.role;
        }

        public Builder setApi(@Nullable Input<String> api) {
            this.api = api;
            return this;
        }

        public Builder setApi(@Nullable String api) {
            this.api = Input.ofNullable(api);
            return this;
        }

        public Builder setApiConfig(@Nullable Input<String> apiConfig) {
            this.apiConfig = apiConfig;
            return this;
        }

        public Builder setApiConfig(@Nullable String apiConfig) {
            this.apiConfig = Input.ofNullable(apiConfig);
            return this;
        }

        public Builder setCondition(@Nullable Input<ApiConfigIamMemberConditionGetArgs> condition) {
            this.condition = condition;
            return this;
        }

        public Builder setCondition(@Nullable ApiConfigIamMemberConditionGetArgs condition) {
            this.condition = Input.ofNullable(condition);
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

        public Builder setMember(@Nullable Input<String> member) {
            this.member = member;
            return this;
        }

        public Builder setMember(@Nullable String member) {
            this.member = Input.ofNullable(member);
            return this;
        }

        public Builder setProject(@Nullable Input<String> project) {
            this.project = project;
            return this;
        }

        public Builder setProject(@Nullable String project) {
            this.project = Input.ofNullable(project);
            return this;
        }

        public Builder setRole(@Nullable Input<String> role) {
            this.role = role;
            return this;
        }

        public Builder setRole(@Nullable String role) {
            this.role = Input.ofNullable(role);
            return this;
        }

        public ApiConfigIamMemberState build() {
            return new ApiConfigIamMemberState(api, apiConfig, condition, etag, member, project, role);
        }
    }
}