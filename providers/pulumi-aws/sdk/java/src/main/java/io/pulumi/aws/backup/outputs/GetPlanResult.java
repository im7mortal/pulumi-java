// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.backup.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import java.lang.String;
import java.util.Map;
import java.util.Objects;

@OutputCustomType
public final class GetPlanResult {
    /**
     * The ARN of the backup plan.
     * 
     */
    private final String arn;
    /**
     * The provider-assigned unique ID for this managed resource.
     * 
     */
    private final String id;
    /**
     * The display name of a backup plan.
     * 
     */
    private final String name;
    private final String planId;
    /**
     * Metadata that you can assign to help organize the plans you create.
     * 
     */
    private final Map<String,String> tags;
    /**
     * Unique, randomly generated, Unicode, UTF-8 encoded string that serves as the version ID of the backup plan.
     * 
     */
    private final String version;

    @OutputCustomType.Constructor({"arn","id","name","planId","tags","version"})
    private GetPlanResult(
        String arn,
        String id,
        String name,
        String planId,
        Map<String,String> tags,
        String version) {
        this.arn = Objects.requireNonNull(arn);
        this.id = Objects.requireNonNull(id);
        this.name = Objects.requireNonNull(name);
        this.planId = Objects.requireNonNull(planId);
        this.tags = Objects.requireNonNull(tags);
        this.version = Objects.requireNonNull(version);
    }

    /**
     * The ARN of the backup plan.
     * 
    */
    public String getArn() {
        return this.arn;
    }
    /**
     * The provider-assigned unique ID for this managed resource.
     * 
    */
    public String getId() {
        return this.id;
    }
    /**
     * The display name of a backup plan.
     * 
    */
    public String getName() {
        return this.name;
    }
    public String getPlanId() {
        return this.planId;
    }
    /**
     * Metadata that you can assign to help organize the plans you create.
     * 
    */
    public Map<String,String> getTags() {
        return this.tags;
    }
    /**
     * Unique, randomly generated, Unicode, UTF-8 encoded string that serves as the version ID of the backup plan.
     * 
    */
    public String getVersion() {
        return this.version;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetPlanResult defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String arn;
        private String id;
        private String name;
        private String planId;
        private Map<String,String> tags;
        private String version;

        public Builder() {
    	      // Empty
        }

        public Builder(GetPlanResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.arn = defaults.arn;
    	      this.id = defaults.id;
    	      this.name = defaults.name;
    	      this.planId = defaults.planId;
    	      this.tags = defaults.tags;
    	      this.version = defaults.version;
        }

        public Builder setArn(String arn) {
            this.arn = Objects.requireNonNull(arn);
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

        public Builder setPlanId(String planId) {
            this.planId = Objects.requireNonNull(planId);
            return this;
        }

        public Builder setTags(Map<String,String> tags) {
            this.tags = Objects.requireNonNull(tags);
            return this;
        }

        public Builder setVersion(String version) {
            this.version = Objects.requireNonNull(version);
            return this;
        }
        public GetPlanResult build() {
            return new GetPlanResult(arn, id, name, planId, tags, version);
        }
    }
}
