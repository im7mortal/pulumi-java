// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.cloudfunctions_v2beta.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.Boolean;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * Location of the source in a Google Cloud Source Repository.
 * 
 */
public final class RepoSourceArgs extends com.pulumi.resources.ResourceArgs {

    public static final RepoSourceArgs Empty = new RepoSourceArgs();

    /**
     * Regex matching branches to build. The syntax of the regular expressions accepted is the syntax accepted by RE2 and described at https://github.com/google/re2/wiki/Syntax
     * 
     */
    @Import(name="branchName")
    private @Nullable Output<String> branchName;

    /**
     * @return Regex matching branches to build. The syntax of the regular expressions accepted is the syntax accepted by RE2 and described at https://github.com/google/re2/wiki/Syntax
     * 
     */
    public Optional<Output<String>> branchName() {
        return Optional.ofNullable(this.branchName);
    }

    /**
     * Explicit commit SHA to build.
     * 
     */
    @Import(name="commitSha")
    private @Nullable Output<String> commitSha;

    /**
     * @return Explicit commit SHA to build.
     * 
     */
    public Optional<Output<String>> commitSha() {
        return Optional.ofNullable(this.commitSha);
    }

    /**
     * Directory, relative to the source root, in which to run the build. This must be a relative path. If a step&#39;s `dir` is specified and is an absolute path, this value is ignored for that step&#39;s execution. eg. helloworld (no leading slash allowed)
     * 
     */
    @Import(name="dir")
    private @Nullable Output<String> dir;

    /**
     * @return Directory, relative to the source root, in which to run the build. This must be a relative path. If a step&#39;s `dir` is specified and is an absolute path, this value is ignored for that step&#39;s execution. eg. helloworld (no leading slash allowed)
     * 
     */
    public Optional<Output<String>> dir() {
        return Optional.ofNullable(this.dir);
    }

    /**
     * Only trigger a build if the revision regex does NOT match the revision regex.
     * 
     */
    @Import(name="invertRegex")
    private @Nullable Output<Boolean> invertRegex;

    /**
     * @return Only trigger a build if the revision regex does NOT match the revision regex.
     * 
     */
    public Optional<Output<Boolean>> invertRegex() {
        return Optional.ofNullable(this.invertRegex);
    }

    /**
     * ID of the project that owns the Cloud Source Repository. If omitted, the project ID requesting the build is assumed.
     * 
     */
    @Import(name="project")
    private @Nullable Output<String> project;

    /**
     * @return ID of the project that owns the Cloud Source Repository. If omitted, the project ID requesting the build is assumed.
     * 
     */
    public Optional<Output<String>> project() {
        return Optional.ofNullable(this.project);
    }

    /**
     * Name of the Cloud Source Repository.
     * 
     */
    @Import(name="repoName")
    private @Nullable Output<String> repoName;

    /**
     * @return Name of the Cloud Source Repository.
     * 
     */
    public Optional<Output<String>> repoName() {
        return Optional.ofNullable(this.repoName);
    }

    /**
     * Regex matching tags to build. The syntax of the regular expressions accepted is the syntax accepted by RE2 and described at https://github.com/google/re2/wiki/Syntax
     * 
     */
    @Import(name="tagName")
    private @Nullable Output<String> tagName;

    /**
     * @return Regex matching tags to build. The syntax of the regular expressions accepted is the syntax accepted by RE2 and described at https://github.com/google/re2/wiki/Syntax
     * 
     */
    public Optional<Output<String>> tagName() {
        return Optional.ofNullable(this.tagName);
    }

    private RepoSourceArgs() {}

    private RepoSourceArgs(RepoSourceArgs $) {
        this.branchName = $.branchName;
        this.commitSha = $.commitSha;
        this.dir = $.dir;
        this.invertRegex = $.invertRegex;
        this.project = $.project;
        this.repoName = $.repoName;
        this.tagName = $.tagName;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(RepoSourceArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private RepoSourceArgs $;

        public Builder() {
            $ = new RepoSourceArgs();
        }

        public Builder(RepoSourceArgs defaults) {
            $ = new RepoSourceArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param branchName Regex matching branches to build. The syntax of the regular expressions accepted is the syntax accepted by RE2 and described at https://github.com/google/re2/wiki/Syntax
         * 
         * @return builder
         * 
         */
        public Builder branchName(@Nullable Output<String> branchName) {
            $.branchName = branchName;
            return this;
        }

        /**
         * @param branchName Regex matching branches to build. The syntax of the regular expressions accepted is the syntax accepted by RE2 and described at https://github.com/google/re2/wiki/Syntax
         * 
         * @return builder
         * 
         */
        public Builder branchName(String branchName) {
            return branchName(Output.of(branchName));
        }

        /**
         * @param commitSha Explicit commit SHA to build.
         * 
         * @return builder
         * 
         */
        public Builder commitSha(@Nullable Output<String> commitSha) {
            $.commitSha = commitSha;
            return this;
        }

        /**
         * @param commitSha Explicit commit SHA to build.
         * 
         * @return builder
         * 
         */
        public Builder commitSha(String commitSha) {
            return commitSha(Output.of(commitSha));
        }

        /**
         * @param dir Directory, relative to the source root, in which to run the build. This must be a relative path. If a step&#39;s `dir` is specified and is an absolute path, this value is ignored for that step&#39;s execution. eg. helloworld (no leading slash allowed)
         * 
         * @return builder
         * 
         */
        public Builder dir(@Nullable Output<String> dir) {
            $.dir = dir;
            return this;
        }

        /**
         * @param dir Directory, relative to the source root, in which to run the build. This must be a relative path. If a step&#39;s `dir` is specified and is an absolute path, this value is ignored for that step&#39;s execution. eg. helloworld (no leading slash allowed)
         * 
         * @return builder
         * 
         */
        public Builder dir(String dir) {
            return dir(Output.of(dir));
        }

        /**
         * @param invertRegex Only trigger a build if the revision regex does NOT match the revision regex.
         * 
         * @return builder
         * 
         */
        public Builder invertRegex(@Nullable Output<Boolean> invertRegex) {
            $.invertRegex = invertRegex;
            return this;
        }

        /**
         * @param invertRegex Only trigger a build if the revision regex does NOT match the revision regex.
         * 
         * @return builder
         * 
         */
        public Builder invertRegex(Boolean invertRegex) {
            return invertRegex(Output.of(invertRegex));
        }

        /**
         * @param project ID of the project that owns the Cloud Source Repository. If omitted, the project ID requesting the build is assumed.
         * 
         * @return builder
         * 
         */
        public Builder project(@Nullable Output<String> project) {
            $.project = project;
            return this;
        }

        /**
         * @param project ID of the project that owns the Cloud Source Repository. If omitted, the project ID requesting the build is assumed.
         * 
         * @return builder
         * 
         */
        public Builder project(String project) {
            return project(Output.of(project));
        }

        /**
         * @param repoName Name of the Cloud Source Repository.
         * 
         * @return builder
         * 
         */
        public Builder repoName(@Nullable Output<String> repoName) {
            $.repoName = repoName;
            return this;
        }

        /**
         * @param repoName Name of the Cloud Source Repository.
         * 
         * @return builder
         * 
         */
        public Builder repoName(String repoName) {
            return repoName(Output.of(repoName));
        }

        /**
         * @param tagName Regex matching tags to build. The syntax of the regular expressions accepted is the syntax accepted by RE2 and described at https://github.com/google/re2/wiki/Syntax
         * 
         * @return builder
         * 
         */
        public Builder tagName(@Nullable Output<String> tagName) {
            $.tagName = tagName;
            return this;
        }

        /**
         * @param tagName Regex matching tags to build. The syntax of the regular expressions accepted is the syntax accepted by RE2 and described at https://github.com/google/re2/wiki/Syntax
         * 
         * @return builder
         * 
         */
        public Builder tagName(String tagName) {
            return tagName(Output.of(tagName));
        }

        public RepoSourceArgs build() {
            return $;
        }
    }

}
