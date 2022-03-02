// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.gamelift.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class FleetRuntimeConfigurationServerProcess {
    /**
     * Number of server processes using this configuration to run concurrently on an instance.
     * 
     */
    private final Integer concurrentExecutions;
    /**
     * Location of the server executable in a game build. All game builds are installed on instances at the root : for Windows instances `C:\game`, and for Linux instances `/local/game`.
     * 
     */
    private final String launchPath;
    /**
     * Optional list of parameters to pass to the server executable on launch.
     * 
     */
    private final @Nullable String parameters;

    @OutputCustomType.Constructor({"concurrentExecutions","launchPath","parameters"})
    private FleetRuntimeConfigurationServerProcess(
        Integer concurrentExecutions,
        String launchPath,
        @Nullable String parameters) {
        this.concurrentExecutions = Objects.requireNonNull(concurrentExecutions);
        this.launchPath = Objects.requireNonNull(launchPath);
        this.parameters = parameters;
    }

    /**
     * Number of server processes using this configuration to run concurrently on an instance.
     * 
    */
    public Integer getConcurrentExecutions() {
        return this.concurrentExecutions;
    }
    /**
     * Location of the server executable in a game build. All game builds are installed on instances at the root : for Windows instances `C:\game`, and for Linux instances `/local/game`.
     * 
    */
    public String getLaunchPath() {
        return this.launchPath;
    }
    /**
     * Optional list of parameters to pass to the server executable on launch.
     * 
    */
    public Optional<String> getParameters() {
        return Optional.ofNullable(this.parameters);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(FleetRuntimeConfigurationServerProcess defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Integer concurrentExecutions;
        private String launchPath;
        private @Nullable String parameters;

        public Builder() {
    	      // Empty
        }

        public Builder(FleetRuntimeConfigurationServerProcess defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.concurrentExecutions = defaults.concurrentExecutions;
    	      this.launchPath = defaults.launchPath;
    	      this.parameters = defaults.parameters;
        }

        public Builder setConcurrentExecutions(Integer concurrentExecutions) {
            this.concurrentExecutions = Objects.requireNonNull(concurrentExecutions);
            return this;
        }

        public Builder setLaunchPath(String launchPath) {
            this.launchPath = Objects.requireNonNull(launchPath);
            return this;
        }

        public Builder setParameters(@Nullable String parameters) {
            this.parameters = parameters;
            return this;
        }
        public FleetRuntimeConfigurationServerProcess build() {
            return new FleetRuntimeConfigurationServerProcess(concurrentExecutions, launchPath, parameters);
        }
    }
}
