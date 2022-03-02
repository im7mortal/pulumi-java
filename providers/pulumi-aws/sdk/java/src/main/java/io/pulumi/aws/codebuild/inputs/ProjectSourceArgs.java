// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.codebuild.inputs;

import io.pulumi.aws.codebuild.inputs.ProjectSourceAuthArgs;
import io.pulumi.aws.codebuild.inputs.ProjectSourceBuildStatusConfigArgs;
import io.pulumi.aws.codebuild.inputs.ProjectSourceGitSubmodulesConfigArgs;
import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


public final class ProjectSourceArgs extends io.pulumi.resources.ResourceArgs {

    public static final ProjectSourceArgs Empty = new ProjectSourceArgs();

    /**
     * Configuration block with the authorization settings for AWS CodeBuild to access the source code to be built. This information is for the AWS CodeBuild console's use only. Use the `aws.codebuild.SourceCredential` resource instead. Auth blocks are documented below.
     * 
     * @Deprecated
     * Use the aws_codebuild_source_credential resource instead
     * 
     */
    @Deprecated /* Use the aws_codebuild_source_credential resource instead */
    @InputImport(name="auth")
      private final @Nullable Input<ProjectSourceAuthArgs> auth;

    @Deprecated /* Use the aws_codebuild_source_credential resource instead */
    public Input<ProjectSourceAuthArgs> getAuth() {
        return this.auth == null ? Input.empty() : this.auth;
    }

    /**
     * Contains information that defines how the build project reports the build status to the source provider. This option is only used when the source provider is `GITHUB`, `GITHUB_ENTERPRISE`, or `BITBUCKET`.
     * 
     */
    @InputImport(name="buildStatusConfig")
      private final @Nullable Input<ProjectSourceBuildStatusConfigArgs> buildStatusConfig;

    public Input<ProjectSourceBuildStatusConfigArgs> getBuildStatusConfig() {
        return this.buildStatusConfig == null ? Input.empty() : this.buildStatusConfig;
    }

    /**
     * Build specification to use for this build project's related builds. This must be set when `type` is `NO_SOURCE`.
     * 
     */
    @InputImport(name="buildspec")
      private final @Nullable Input<String> buildspec;

    public Input<String> getBuildspec() {
        return this.buildspec == null ? Input.empty() : this.buildspec;
    }

    /**
     * Truncate git history to this many commits. Use `0` for a `Full` checkout which you need to run commands like `git branch --show-current`. See [AWS CodePipeline User Guide: Tutorial: Use full clone with a GitHub pipeline source](https://docs.aws.amazon.com/codepipeline/latest/userguide/tutorials-github-gitclone.html) for details.
     * 
     */
    @InputImport(name="gitCloneDepth")
      private final @Nullable Input<Integer> gitCloneDepth;

    public Input<Integer> getGitCloneDepth() {
        return this.gitCloneDepth == null ? Input.empty() : this.gitCloneDepth;
    }

    /**
     * Configuration block. Detailed below.
     * 
     */
    @InputImport(name="gitSubmodulesConfig")
      private final @Nullable Input<ProjectSourceGitSubmodulesConfigArgs> gitSubmodulesConfig;

    public Input<ProjectSourceGitSubmodulesConfigArgs> getGitSubmodulesConfig() {
        return this.gitSubmodulesConfig == null ? Input.empty() : this.gitSubmodulesConfig;
    }

    /**
     * Ignore SSL warnings when connecting to source control.
     * 
     */
    @InputImport(name="insecureSsl")
      private final @Nullable Input<Boolean> insecureSsl;

    public Input<Boolean> getInsecureSsl() {
        return this.insecureSsl == null ? Input.empty() : this.insecureSsl;
    }

    /**
     * Location of the source code from git or s3.
     * 
     */
    @InputImport(name="location")
      private final @Nullable Input<String> location;

    public Input<String> getLocation() {
        return this.location == null ? Input.empty() : this.location;
    }

    /**
     * Whether to report the status of a build's start and finish to your source provider. This option is only valid when the `type` is `BITBUCKET` or `GITHUB`.
     * 
     */
    @InputImport(name="reportBuildStatus")
      private final @Nullable Input<Boolean> reportBuildStatus;

    public Input<Boolean> getReportBuildStatus() {
        return this.reportBuildStatus == null ? Input.empty() : this.reportBuildStatus;
    }

    /**
     * Type of repository that contains the source code to be built. Valid values: `CODECOMMIT`, `CODEPIPELINE`, `GITHUB`, `GITHUB_ENTERPRISE`, `BITBUCKET`, `S3`, `NO_SOURCE`.
     * 
     */
    @InputImport(name="type", required=true)
      private final Input<String> type;

    public Input<String> getType() {
        return this.type;
    }

    public ProjectSourceArgs(
        @Nullable Input<ProjectSourceAuthArgs> auth,
        @Nullable Input<ProjectSourceBuildStatusConfigArgs> buildStatusConfig,
        @Nullable Input<String> buildspec,
        @Nullable Input<Integer> gitCloneDepth,
        @Nullable Input<ProjectSourceGitSubmodulesConfigArgs> gitSubmodulesConfig,
        @Nullable Input<Boolean> insecureSsl,
        @Nullable Input<String> location,
        @Nullable Input<Boolean> reportBuildStatus,
        Input<String> type) {
        this.auth = auth;
        this.buildStatusConfig = buildStatusConfig;
        this.buildspec = buildspec;
        this.gitCloneDepth = gitCloneDepth;
        this.gitSubmodulesConfig = gitSubmodulesConfig;
        this.insecureSsl = insecureSsl;
        this.location = location;
        this.reportBuildStatus = reportBuildStatus;
        this.type = Objects.requireNonNull(type, "expected parameter 'type' to be non-null");
    }

    private ProjectSourceArgs() {
        this.auth = Input.empty();
        this.buildStatusConfig = Input.empty();
        this.buildspec = Input.empty();
        this.gitCloneDepth = Input.empty();
        this.gitSubmodulesConfig = Input.empty();
        this.insecureSsl = Input.empty();
        this.location = Input.empty();
        this.reportBuildStatus = Input.empty();
        this.type = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ProjectSourceArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<ProjectSourceAuthArgs> auth;
        private @Nullable Input<ProjectSourceBuildStatusConfigArgs> buildStatusConfig;
        private @Nullable Input<String> buildspec;
        private @Nullable Input<Integer> gitCloneDepth;
        private @Nullable Input<ProjectSourceGitSubmodulesConfigArgs> gitSubmodulesConfig;
        private @Nullable Input<Boolean> insecureSsl;
        private @Nullable Input<String> location;
        private @Nullable Input<Boolean> reportBuildStatus;
        private Input<String> type;

        public Builder() {
    	      // Empty
        }

        public Builder(ProjectSourceArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.auth = defaults.auth;
    	      this.buildStatusConfig = defaults.buildStatusConfig;
    	      this.buildspec = defaults.buildspec;
    	      this.gitCloneDepth = defaults.gitCloneDepth;
    	      this.gitSubmodulesConfig = defaults.gitSubmodulesConfig;
    	      this.insecureSsl = defaults.insecureSsl;
    	      this.location = defaults.location;
    	      this.reportBuildStatus = defaults.reportBuildStatus;
    	      this.type = defaults.type;
        }

        public Builder setAuth(@Nullable Input<ProjectSourceAuthArgs> auth) {
            this.auth = auth;
            return this;
        }

        public Builder setAuth(@Nullable ProjectSourceAuthArgs auth) {
            this.auth = Input.ofNullable(auth);
            return this;
        }

        public Builder setBuildStatusConfig(@Nullable Input<ProjectSourceBuildStatusConfigArgs> buildStatusConfig) {
            this.buildStatusConfig = buildStatusConfig;
            return this;
        }

        public Builder setBuildStatusConfig(@Nullable ProjectSourceBuildStatusConfigArgs buildStatusConfig) {
            this.buildStatusConfig = Input.ofNullable(buildStatusConfig);
            return this;
        }

        public Builder setBuildspec(@Nullable Input<String> buildspec) {
            this.buildspec = buildspec;
            return this;
        }

        public Builder setBuildspec(@Nullable String buildspec) {
            this.buildspec = Input.ofNullable(buildspec);
            return this;
        }

        public Builder setGitCloneDepth(@Nullable Input<Integer> gitCloneDepth) {
            this.gitCloneDepth = gitCloneDepth;
            return this;
        }

        public Builder setGitCloneDepth(@Nullable Integer gitCloneDepth) {
            this.gitCloneDepth = Input.ofNullable(gitCloneDepth);
            return this;
        }

        public Builder setGitSubmodulesConfig(@Nullable Input<ProjectSourceGitSubmodulesConfigArgs> gitSubmodulesConfig) {
            this.gitSubmodulesConfig = gitSubmodulesConfig;
            return this;
        }

        public Builder setGitSubmodulesConfig(@Nullable ProjectSourceGitSubmodulesConfigArgs gitSubmodulesConfig) {
            this.gitSubmodulesConfig = Input.ofNullable(gitSubmodulesConfig);
            return this;
        }

        public Builder setInsecureSsl(@Nullable Input<Boolean> insecureSsl) {
            this.insecureSsl = insecureSsl;
            return this;
        }

        public Builder setInsecureSsl(@Nullable Boolean insecureSsl) {
            this.insecureSsl = Input.ofNullable(insecureSsl);
            return this;
        }

        public Builder setLocation(@Nullable Input<String> location) {
            this.location = location;
            return this;
        }

        public Builder setLocation(@Nullable String location) {
            this.location = Input.ofNullable(location);
            return this;
        }

        public Builder setReportBuildStatus(@Nullable Input<Boolean> reportBuildStatus) {
            this.reportBuildStatus = reportBuildStatus;
            return this;
        }

        public Builder setReportBuildStatus(@Nullable Boolean reportBuildStatus) {
            this.reportBuildStatus = Input.ofNullable(reportBuildStatus);
            return this;
        }

        public Builder setType(Input<String> type) {
            this.type = Objects.requireNonNull(type);
            return this;
        }

        public Builder setType(String type) {
            this.type = Input.of(Objects.requireNonNull(type));
            return this;
        }
        public ProjectSourceArgs build() {
            return new ProjectSourceArgs(auth, buildStatusConfig, buildspec, gitCloneDepth, gitSubmodulesConfig, insecureSsl, location, reportBuildStatus, type);
        }
    }
}
