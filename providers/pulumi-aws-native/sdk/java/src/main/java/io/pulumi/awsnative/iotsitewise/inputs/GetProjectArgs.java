// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.iotsitewise.inputs;

import io.pulumi.core.internal.annotations.InputImport;
import java.lang.String;
import java.util.Objects;


public final class GetProjectArgs extends io.pulumi.resources.InvokeArgs {

    public static final GetProjectArgs Empty = new GetProjectArgs();

    /**
     * The ID of the project.
     * 
     */
    @InputImport(name="projectId", required=true)
    private final String projectId;

    public String getProjectId() {
        return this.projectId;
    }

    public GetProjectArgs(String projectId) {
        this.projectId = Objects.requireNonNull(projectId, "expected parameter 'projectId' to be non-null");
    }

    private GetProjectArgs() {
        this.projectId = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetProjectArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String projectId;

        public Builder() {
    	      // Empty
        }

        public Builder(GetProjectArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.projectId = defaults.projectId;
        }

        public Builder setProjectId(String projectId) {
            this.projectId = Objects.requireNonNull(projectId);
            return this;
        }

        public GetProjectArgs build() {
            return new GetProjectArgs(projectId);
        }
    }
}
