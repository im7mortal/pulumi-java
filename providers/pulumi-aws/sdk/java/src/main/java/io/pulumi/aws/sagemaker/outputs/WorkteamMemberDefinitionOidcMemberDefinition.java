// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.sagemaker.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import java.lang.String;
import java.util.List;
import java.util.Objects;

@OutputCustomType
public final class WorkteamMemberDefinitionOidcMemberDefinition {
    /**
     * A list of comma separated strings that identifies user groups in your OIDC IdP. Each user group is made up of a group of private workers.
     * 
     */
    private final List<String> groups;

    @OutputCustomType.Constructor({"groups"})
    private WorkteamMemberDefinitionOidcMemberDefinition(List<String> groups) {
        this.groups = Objects.requireNonNull(groups);
    }

    /**
     * A list of comma separated strings that identifies user groups in your OIDC IdP. Each user group is made up of a group of private workers.
     * 
    */
    public List<String> getGroups() {
        return this.groups;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(WorkteamMemberDefinitionOidcMemberDefinition defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private List<String> groups;

        public Builder() {
    	      // Empty
        }

        public Builder(WorkteamMemberDefinitionOidcMemberDefinition defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.groups = defaults.groups;
        }

        public Builder setGroups(List<String> groups) {
            this.groups = Objects.requireNonNull(groups);
            return this;
        }
        public WorkteamMemberDefinitionOidcMemberDefinition build() {
            return new WorkteamMemberDefinitionOidcMemberDefinition(groups);
        }
    }
}
