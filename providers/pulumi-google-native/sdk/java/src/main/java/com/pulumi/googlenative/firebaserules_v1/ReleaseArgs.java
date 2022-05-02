// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.firebaserules_v1;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class ReleaseArgs extends com.pulumi.resources.ResourceArgs {

    public static final ReleaseArgs Empty = new ReleaseArgs();

    /**
     * Format: `projects/{project_id}/releases/{release_id}`
     * 
     */
    @Import(name="name")
    private @Nullable Output<String> name;

    /**
     * @return Format: `projects/{project_id}/releases/{release_id}`
     * 
     */
    public Optional<Output<String>> name() {
        return Optional.ofNullable(this.name);
    }

    @Import(name="project")
    private @Nullable Output<String> project;

    public Optional<Output<String>> project() {
        return Optional.ofNullable(this.project);
    }

    /**
     * Name of the `Ruleset` referred to by this `Release`. The `Ruleset` must exist the `Release` to be created.
     * 
     */
    @Import(name="rulesetName", required=true)
    private Output<String> rulesetName;

    /**
     * @return Name of the `Ruleset` referred to by this `Release`. The `Ruleset` must exist the `Release` to be created.
     * 
     */
    public Output<String> rulesetName() {
        return this.rulesetName;
    }

    private ReleaseArgs() {}

    private ReleaseArgs(ReleaseArgs $) {
        this.name = $.name;
        this.project = $.project;
        this.rulesetName = $.rulesetName;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(ReleaseArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private ReleaseArgs $;

        public Builder() {
            $ = new ReleaseArgs();
        }

        public Builder(ReleaseArgs defaults) {
            $ = new ReleaseArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param name Format: `projects/{project_id}/releases/{release_id}`
         * 
         * @return builder
         * 
         */
        public Builder name(@Nullable Output<String> name) {
            $.name = name;
            return this;
        }

        /**
         * @param name Format: `projects/{project_id}/releases/{release_id}`
         * 
         * @return builder
         * 
         */
        public Builder name(String name) {
            return name(Output.of(name));
        }

        public Builder project(@Nullable Output<String> project) {
            $.project = project;
            return this;
        }

        public Builder project(String project) {
            return project(Output.of(project));
        }

        /**
         * @param rulesetName Name of the `Ruleset` referred to by this `Release`. The `Ruleset` must exist the `Release` to be created.
         * 
         * @return builder
         * 
         */
        public Builder rulesetName(Output<String> rulesetName) {
            $.rulesetName = rulesetName;
            return this;
        }

        /**
         * @param rulesetName Name of the `Ruleset` referred to by this `Release`. The `Ruleset` must exist the `Release` to be created.
         * 
         * @return builder
         * 
         */
        public Builder rulesetName(String rulesetName) {
            return rulesetName(Output.of(rulesetName));
        }

        public ReleaseArgs build() {
            $.rulesetName = Objects.requireNonNull($.rulesetName, "expected parameter 'rulesetName' to be non-null");
            return $;
        }
    }

}
