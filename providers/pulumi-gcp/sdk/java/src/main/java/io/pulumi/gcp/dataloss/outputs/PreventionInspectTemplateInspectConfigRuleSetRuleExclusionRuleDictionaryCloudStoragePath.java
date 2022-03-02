// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.dataloss.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import java.lang.String;
import java.util.Objects;

@OutputCustomType
public final class PreventionInspectTemplateInspectConfigRuleSetRuleExclusionRuleDictionaryCloudStoragePath {
    /**
     * A url representing a file or path (no wildcards) in Cloud Storage. Example: `gs://[BUCKET_NAME]/dictionary.txt`
     * 
     */
    private final String path;

    @OutputCustomType.Constructor({"path"})
    private PreventionInspectTemplateInspectConfigRuleSetRuleExclusionRuleDictionaryCloudStoragePath(String path) {
        this.path = Objects.requireNonNull(path);
    }

    /**
     * A url representing a file or path (no wildcards) in Cloud Storage. Example: `gs://[BUCKET_NAME]/dictionary.txt`
     * 
    */
    public String getPath() {
        return this.path;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(PreventionInspectTemplateInspectConfigRuleSetRuleExclusionRuleDictionaryCloudStoragePath defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String path;

        public Builder() {
    	      // Empty
        }

        public Builder(PreventionInspectTemplateInspectConfigRuleSetRuleExclusionRuleDictionaryCloudStoragePath defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.path = defaults.path;
        }

        public Builder setPath(String path) {
            this.path = Objects.requireNonNull(path);
            return this;
        }
        public PreventionInspectTemplateInspectConfigRuleSetRuleExclusionRuleDictionaryCloudStoragePath build() {
            return new PreventionInspectTemplateInspectConfigRuleSetRuleExclusionRuleDictionaryCloudStoragePath(path);
        }
    }
}
