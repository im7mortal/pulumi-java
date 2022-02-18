// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.gamelift.outputs;

import io.pulumi.core.internal.annotations.OutputCustomType;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class FleetServerProcess {
    /**
     * The number of server processes that use this configuration to run concurrently on an instance.
     * 
     */
    private final Integer concurrentExecutions;
    /**
     * The location of the server executable in a custom game build or the name of the Realtime script file that contains the Init() function. Game builds and Realtime scripts are installed on instances at the root:
     * 
     * Windows (for custom game builds only): C:\game. Example: "C:\game\MyGame\server.exe"
     * 
     * Linux: /local/game. Examples: "/local/game/MyGame/server.exe" or "/local/game/MyRealtimeScript.js"
     * 
     */
    private final String launchPath;
    /**
     * An optional list of parameters to pass to the server executable or Realtime script on launch.
     * 
     */
    private final @Nullable String parameters;

    @OutputCustomType.Constructor({"concurrentExecutions","launchPath","parameters"})
    private FleetServerProcess(
        Integer concurrentExecutions,
        String launchPath,
        @Nullable String parameters) {
        this.concurrentExecutions = Objects.requireNonNull(concurrentExecutions);
        this.launchPath = Objects.requireNonNull(launchPath);
        this.parameters = parameters;
    }

    /**
     * The number of server processes that use this configuration to run concurrently on an instance.
     * 
     */
    public Integer getConcurrentExecutions() {
        return this.concurrentExecutions;
    }
    /**
     * The location of the server executable in a custom game build or the name of the Realtime script file that contains the Init() function. Game builds and Realtime scripts are installed on instances at the root:
     * 
     * Windows (for custom game builds only): C:\game. Example: "C:\game\MyGame\server.exe"
     * 
     * Linux: /local/game. Examples: "/local/game/MyGame/server.exe" or "/local/game/MyRealtimeScript.js"
     * 
     */
    public String getLaunchPath() {
        return this.launchPath;
    }
    /**
     * An optional list of parameters to pass to the server executable or Realtime script on launch.
     * 
     */
    public Optional<String> getParameters() {
        return Optional.ofNullable(this.parameters);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(FleetServerProcess defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Integer concurrentExecutions;
        private String launchPath;
        private @Nullable String parameters;

        public Builder() {
    	      // Empty
        }

        public Builder(FleetServerProcess defaults) {
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

        public FleetServerProcess build() {
            return new FleetServerProcess(concurrentExecutions, launchPath, parameters);
        }
    }
}
