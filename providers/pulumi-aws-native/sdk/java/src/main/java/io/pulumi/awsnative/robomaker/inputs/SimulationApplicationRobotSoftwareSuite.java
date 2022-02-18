// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.robomaker.inputs;

import io.pulumi.awsnative.robomaker.enums.SimulationApplicationRobotSoftwareSuiteName;
import io.pulumi.awsnative.robomaker.enums.SimulationApplicationRobotSoftwareSuiteVersion;
import io.pulumi.core.internal.annotations.InputImport;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * Information about a robot software suite.
 * 
 */
public final class SimulationApplicationRobotSoftwareSuite extends io.pulumi.resources.InvokeArgs {

    public static final SimulationApplicationRobotSoftwareSuite Empty = new SimulationApplicationRobotSoftwareSuite();

    /**
     * The name of the robot software suite.
     * 
     */
    @InputImport(name="name", required=true)
    private final SimulationApplicationRobotSoftwareSuiteName name;

    public SimulationApplicationRobotSoftwareSuiteName getName() {
        return this.name;
    }

    /**
     * The version of the robot software suite.
     * 
     */
    @InputImport(name="version")
    private final @Nullable SimulationApplicationRobotSoftwareSuiteVersion version;

    public Optional<SimulationApplicationRobotSoftwareSuiteVersion> getVersion() {
        return this.version == null ? Optional.empty() : Optional.ofNullable(this.version);
    }

    public SimulationApplicationRobotSoftwareSuite(
        SimulationApplicationRobotSoftwareSuiteName name,
        @Nullable SimulationApplicationRobotSoftwareSuiteVersion version) {
        this.name = Objects.requireNonNull(name, "expected parameter 'name' to be non-null");
        this.version = version;
    }

    private SimulationApplicationRobotSoftwareSuite() {
        this.name = null;
        this.version = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(SimulationApplicationRobotSoftwareSuite defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private SimulationApplicationRobotSoftwareSuiteName name;
        private @Nullable SimulationApplicationRobotSoftwareSuiteVersion version;

        public Builder() {
    	      // Empty
        }

        public Builder(SimulationApplicationRobotSoftwareSuite defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.name = defaults.name;
    	      this.version = defaults.version;
        }

        public Builder setName(SimulationApplicationRobotSoftwareSuiteName name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }

        public Builder setVersion(@Nullable SimulationApplicationRobotSoftwareSuiteVersion version) {
            this.version = version;
            return this;
        }

        public SimulationApplicationRobotSoftwareSuite build() {
            return new SimulationApplicationRobotSoftwareSuite(name, version);
        }
    }
}
