// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.iam.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import java.lang.String;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class GetPolicyResult {
    private final String arn;
    /**
     * The description of the policy.
     * 
     */
    private final String description;
    /**
     * The provider-assigned unique ID for this managed resource.
     * 
     */
    private final String id;
    private final String name;
    /**
     * The path to the policy.
     * 
     */
    private final String path;
    private final @Nullable String pathPrefix;
    /**
     * The policy document of the policy.
     * 
     */
    private final String policy;
    /**
     * The policy's ID.
     * 
     */
    private final String policyId;
    /**
     * Key-value mapping of tags for the IAM Policy.
     * 
     */
    private final Map<String,String> tags;

    @OutputCustomType.Constructor({"arn","description","id","name","path","pathPrefix","policy","policyId","tags"})
    private GetPolicyResult(
        String arn,
        String description,
        String id,
        String name,
        String path,
        @Nullable String pathPrefix,
        String policy,
        String policyId,
        Map<String,String> tags) {
        this.arn = Objects.requireNonNull(arn);
        this.description = Objects.requireNonNull(description);
        this.id = Objects.requireNonNull(id);
        this.name = Objects.requireNonNull(name);
        this.path = Objects.requireNonNull(path);
        this.pathPrefix = pathPrefix;
        this.policy = Objects.requireNonNull(policy);
        this.policyId = Objects.requireNonNull(policyId);
        this.tags = Objects.requireNonNull(tags);
    }

    public String getArn() {
        return this.arn;
    }
    /**
     * The description of the policy.
     * 
    */
    public String getDescription() {
        return this.description;
    }
    /**
     * The provider-assigned unique ID for this managed resource.
     * 
    */
    public String getId() {
        return this.id;
    }
    public String getName() {
        return this.name;
    }
    /**
     * The path to the policy.
     * 
    */
    public String getPath() {
        return this.path;
    }
    public Optional<String> getPathPrefix() {
        return Optional.ofNullable(this.pathPrefix);
    }
    /**
     * The policy document of the policy.
     * 
    */
    public String getPolicy() {
        return this.policy;
    }
    /**
     * The policy's ID.
     * 
    */
    public String getPolicyId() {
        return this.policyId;
    }
    /**
     * Key-value mapping of tags for the IAM Policy.
     * 
    */
    public Map<String,String> getTags() {
        return this.tags;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetPolicyResult defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String arn;
        private String description;
        private String id;
        private String name;
        private String path;
        private @Nullable String pathPrefix;
        private String policy;
        private String policyId;
        private Map<String,String> tags;

        public Builder() {
    	      // Empty
        }

        public Builder(GetPolicyResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.arn = defaults.arn;
    	      this.description = defaults.description;
    	      this.id = defaults.id;
    	      this.name = defaults.name;
    	      this.path = defaults.path;
    	      this.pathPrefix = defaults.pathPrefix;
    	      this.policy = defaults.policy;
    	      this.policyId = defaults.policyId;
    	      this.tags = defaults.tags;
        }

        public Builder setArn(String arn) {
            this.arn = Objects.requireNonNull(arn);
            return this;
        }

        public Builder setDescription(String description) {
            this.description = Objects.requireNonNull(description);
            return this;
        }

        public Builder setId(String id) {
            this.id = Objects.requireNonNull(id);
            return this;
        }

        public Builder setName(String name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }

        public Builder setPath(String path) {
            this.path = Objects.requireNonNull(path);
            return this;
        }

        public Builder setPathPrefix(@Nullable String pathPrefix) {
            this.pathPrefix = pathPrefix;
            return this;
        }

        public Builder setPolicy(String policy) {
            this.policy = Objects.requireNonNull(policy);
            return this;
        }

        public Builder setPolicyId(String policyId) {
            this.policyId = Objects.requireNonNull(policyId);
            return this;
        }

        public Builder setTags(Map<String,String> tags) {
            this.tags = Objects.requireNonNull(tags);
            return this;
        }
        public GetPolicyResult build() {
            return new GetPolicyResult(arn, description, id, name, path, pathPrefix, policy, policyId, tags);
        }
    }
}
