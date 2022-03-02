// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.cloudbuild.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import io.pulumi.gcp.cloudbuild.outputs.TriggerBuildStepVolume;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class TriggerBuildStep {
    /**
     * A list of arguments that will be presented to the step when it is started.
     * If the image used to run the step's container has an entrypoint, the args
     * are used as arguments to that entrypoint. If the image does not define an
     * entrypoint, the first element in args is used as the entrypoint, and the
     * remainder will be used as arguments.
     * 
     */
    private final @Nullable List<String> args;
    /**
     * Working directory to use when running this step's container.
     * If this value is a relative path, it is relative to the build's working
     * directory. If this value is absolute, it may be outside the build's working
     * directory, in which case the contents of the path may not be persisted
     * across build step executions, unless a `volume` for that path is specified.
     * If the build specifies a `RepoSource` with `dir` and a step with a
     * `dir`,
     * which specifies an absolute path, the `RepoSource` `dir` is ignored
     * for the step's execution.
     * 
     */
    private final @Nullable String dir;
    /**
     * Entrypoint to be used instead of the build step image's
     * default entrypoint.
     * If unset, the image's default entrypoint is used
     * 
     */
    private final @Nullable String entrypoint;
    /**
     * A list of global environment variable definitions that will exist for all build steps
     * in this build. If a variable is defined in both globally and in a build step,
     * the variable will use the build step value.
     * The elements are of the form "KEY=VALUE" for the environment variable "KEY" being given the value "VALUE".
     * 
     */
    private final @Nullable List<String> envs;
    /**
     * Unique identifier for this build step, used in `wait_for` to
     * reference this build step as a dependency.
     * 
     */
    private final @Nullable String id;
    /**
     * Name of the volume to mount.
     * Volume names must be unique per build step and must be valid names for Docker volumes.
     * Each named volume must be used by at least two build steps.
     * 
     */
    private final String name;
    /**
     * A list of global environment variables, which are encrypted using a Cloud Key Management
     * Service crypto key. These values must be specified in the build's Secret. These variables
     * will be available to all build steps in this build.
     * 
     */
    private final @Nullable List<String> secretEnvs;
    /**
     * Time limit for executing this build step. If not defined,
     * the step has no
     * time limit and will be allowed to continue to run until either it
     * completes or the build itself times out.
     * 
     */
    private final @Nullable String timeout;
    /**
     * - 
     * Output only. Stores timing information for pushing all artifact objects.
     * Structure is documented below.
     * 
     */
    private final @Nullable String timing;
    /**
     * Global list of volumes to mount for ALL build steps
     * Each volume is created as an empty volume prior to starting the build process.
     * Upon completion of the build, volumes and their contents are discarded. Global
     * volume names and paths cannot conflict with the volumes defined a build step.
     * Using a global volume in a build with only one step is not valid as it is indicative
     * of a build request with an incorrect configuration.
     * Structure is documented below.
     * 
     */
    private final @Nullable List<TriggerBuildStepVolume> volumes;
    /**
     * The ID(s) of the step(s) that this build step depends on.
     * This build step will not start until all the build steps in `wait_for`
     * have completed successfully. If `wait_for` is empty, this build step
     * will start when all previous build steps in the `Build.Steps` list
     * have completed successfully.
     * 
     */
    private final @Nullable List<String> waitFors;

    @OutputCustomType.Constructor({"args","dir","entrypoint","envs","id","name","secretEnvs","timeout","timing","volumes","waitFors"})
    private TriggerBuildStep(
        @Nullable List<String> args,
        @Nullable String dir,
        @Nullable String entrypoint,
        @Nullable List<String> envs,
        @Nullable String id,
        String name,
        @Nullable List<String> secretEnvs,
        @Nullable String timeout,
        @Nullable String timing,
        @Nullable List<TriggerBuildStepVolume> volumes,
        @Nullable List<String> waitFors) {
        this.args = args;
        this.dir = dir;
        this.entrypoint = entrypoint;
        this.envs = envs;
        this.id = id;
        this.name = Objects.requireNonNull(name);
        this.secretEnvs = secretEnvs;
        this.timeout = timeout;
        this.timing = timing;
        this.volumes = volumes;
        this.waitFors = waitFors;
    }

    /**
     * A list of arguments that will be presented to the step when it is started.
     * If the image used to run the step's container has an entrypoint, the args
     * are used as arguments to that entrypoint. If the image does not define an
     * entrypoint, the first element in args is used as the entrypoint, and the
     * remainder will be used as arguments.
     * 
    */
    public List<String> getArgs() {
        return this.args == null ? List.of() : this.args;
    }
    /**
     * Working directory to use when running this step's container.
     * If this value is a relative path, it is relative to the build's working
     * directory. If this value is absolute, it may be outside the build's working
     * directory, in which case the contents of the path may not be persisted
     * across build step executions, unless a `volume` for that path is specified.
     * If the build specifies a `RepoSource` with `dir` and a step with a
     * `dir`,
     * which specifies an absolute path, the `RepoSource` `dir` is ignored
     * for the step's execution.
     * 
    */
    public Optional<String> getDir() {
        return Optional.ofNullable(this.dir);
    }
    /**
     * Entrypoint to be used instead of the build step image's
     * default entrypoint.
     * If unset, the image's default entrypoint is used
     * 
    */
    public Optional<String> getEntrypoint() {
        return Optional.ofNullable(this.entrypoint);
    }
    /**
     * A list of global environment variable definitions that will exist for all build steps
     * in this build. If a variable is defined in both globally and in a build step,
     * the variable will use the build step value.
     * The elements are of the form "KEY=VALUE" for the environment variable "KEY" being given the value "VALUE".
     * 
    */
    public List<String> getEnvs() {
        return this.envs == null ? List.of() : this.envs;
    }
    /**
     * Unique identifier for this build step, used in `wait_for` to
     * reference this build step as a dependency.
     * 
    */
    public Optional<String> getId() {
        return Optional.ofNullable(this.id);
    }
    /**
     * Name of the volume to mount.
     * Volume names must be unique per build step and must be valid names for Docker volumes.
     * Each named volume must be used by at least two build steps.
     * 
    */
    public String getName() {
        return this.name;
    }
    /**
     * A list of global environment variables, which are encrypted using a Cloud Key Management
     * Service crypto key. These values must be specified in the build's Secret. These variables
     * will be available to all build steps in this build.
     * 
    */
    public List<String> getSecretEnvs() {
        return this.secretEnvs == null ? List.of() : this.secretEnvs;
    }
    /**
     * Time limit for executing this build step. If not defined,
     * the step has no
     * time limit and will be allowed to continue to run until either it
     * completes or the build itself times out.
     * 
    */
    public Optional<String> getTimeout() {
        return Optional.ofNullable(this.timeout);
    }
    /**
     * - 
     * Output only. Stores timing information for pushing all artifact objects.
     * Structure is documented below.
     * 
    */
    public Optional<String> getTiming() {
        return Optional.ofNullable(this.timing);
    }
    /**
     * Global list of volumes to mount for ALL build steps
     * Each volume is created as an empty volume prior to starting the build process.
     * Upon completion of the build, volumes and their contents are discarded. Global
     * volume names and paths cannot conflict with the volumes defined a build step.
     * Using a global volume in a build with only one step is not valid as it is indicative
     * of a build request with an incorrect configuration.
     * Structure is documented below.
     * 
    */
    public List<TriggerBuildStepVolume> getVolumes() {
        return this.volumes == null ? List.of() : this.volumes;
    }
    /**
     * The ID(s) of the step(s) that this build step depends on.
     * This build step will not start until all the build steps in `wait_for`
     * have completed successfully. If `wait_for` is empty, this build step
     * will start when all previous build steps in the `Build.Steps` list
     * have completed successfully.
     * 
    */
    public List<String> getWaitFors() {
        return this.waitFors == null ? List.of() : this.waitFors;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(TriggerBuildStep defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable List<String> args;
        private @Nullable String dir;
        private @Nullable String entrypoint;
        private @Nullable List<String> envs;
        private @Nullable String id;
        private String name;
        private @Nullable List<String> secretEnvs;
        private @Nullable String timeout;
        private @Nullable String timing;
        private @Nullable List<TriggerBuildStepVolume> volumes;
        private @Nullable List<String> waitFors;

        public Builder() {
    	      // Empty
        }

        public Builder(TriggerBuildStep defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.args = defaults.args;
    	      this.dir = defaults.dir;
    	      this.entrypoint = defaults.entrypoint;
    	      this.envs = defaults.envs;
    	      this.id = defaults.id;
    	      this.name = defaults.name;
    	      this.secretEnvs = defaults.secretEnvs;
    	      this.timeout = defaults.timeout;
    	      this.timing = defaults.timing;
    	      this.volumes = defaults.volumes;
    	      this.waitFors = defaults.waitFors;
        }

        public Builder setArgs(@Nullable List<String> args) {
            this.args = args;
            return this;
        }

        public Builder setDir(@Nullable String dir) {
            this.dir = dir;
            return this;
        }

        public Builder setEntrypoint(@Nullable String entrypoint) {
            this.entrypoint = entrypoint;
            return this;
        }

        public Builder setEnvs(@Nullable List<String> envs) {
            this.envs = envs;
            return this;
        }

        public Builder setId(@Nullable String id) {
            this.id = id;
            return this;
        }

        public Builder setName(String name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }

        public Builder setSecretEnvs(@Nullable List<String> secretEnvs) {
            this.secretEnvs = secretEnvs;
            return this;
        }

        public Builder setTimeout(@Nullable String timeout) {
            this.timeout = timeout;
            return this;
        }

        public Builder setTiming(@Nullable String timing) {
            this.timing = timing;
            return this;
        }

        public Builder setVolumes(@Nullable List<TriggerBuildStepVolume> volumes) {
            this.volumes = volumes;
            return this;
        }

        public Builder setWaitFors(@Nullable List<String> waitFors) {
            this.waitFors = waitFors;
            return this;
        }
        public TriggerBuildStep build() {
            return new TriggerBuildStep(args, dir, entrypoint, envs, id, name, secretEnvs, timeout, timing, volumes, waitFors);
        }
    }
}
