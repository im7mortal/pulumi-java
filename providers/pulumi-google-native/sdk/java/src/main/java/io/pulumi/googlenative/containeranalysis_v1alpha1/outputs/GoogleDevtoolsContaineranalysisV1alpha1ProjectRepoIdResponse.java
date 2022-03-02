// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.containeranalysis_v1alpha1.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import java.lang.String;
import java.util.Objects;

@OutputCustomType
public final class GoogleDevtoolsContaineranalysisV1alpha1ProjectRepoIdResponse {
    /**
     * The ID of the project.
     * 
     */
    private final String project;
    /**
     * The name of the repo. Leave empty for the default repo.
     * 
     */
    private final String repoName;

    @OutputCustomType.Constructor({"project","repoName"})
    private GoogleDevtoolsContaineranalysisV1alpha1ProjectRepoIdResponse(
        String project,
        String repoName) {
        this.project = Objects.requireNonNull(project);
        this.repoName = Objects.requireNonNull(repoName);
    }

    /**
     * The ID of the project.
     * 
    */
    public String getProject() {
        return this.project;
    }
    /**
     * The name of the repo. Leave empty for the default repo.
     * 
    */
    public String getRepoName() {
        return this.repoName;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GoogleDevtoolsContaineranalysisV1alpha1ProjectRepoIdResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String project;
        private String repoName;

        public Builder() {
    	      // Empty
        }

        public Builder(GoogleDevtoolsContaineranalysisV1alpha1ProjectRepoIdResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.project = defaults.project;
    	      this.repoName = defaults.repoName;
        }

        public Builder setProject(String project) {
            this.project = Objects.requireNonNull(project);
            return this;
        }

        public Builder setRepoName(String repoName) {
            this.repoName = Objects.requireNonNull(repoName);
            return this;
        }
        public GoogleDevtoolsContaineranalysisV1alpha1ProjectRepoIdResponse build() {
            return new GoogleDevtoolsContaineranalysisV1alpha1ProjectRepoIdResponse(project, repoName);
        }
    }
}
