// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.cloudformation.outputs;

import io.pulumi.awsnative.cloudformation.outputs.StackSetDeploymentTargets;
import io.pulumi.awsnative.cloudformation.outputs.StackSetParameter;
import io.pulumi.core.annotations.OutputCustomType;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;

@OutputCustomType
public final class StackSetStackInstances {
    private final StackSetDeploymentTargets deploymentTargets;
    /**
     * A list of stack set parameters whose values you want to override in the selected stack instances.
     * 
     */
    private final @Nullable List<StackSetParameter> parameterOverrides;
    /**
     * The names of one or more Regions where you want to create stack instances using the specified AWS account(s).
     * 
     */
    private final List<String> regions;

    @OutputCustomType.Constructor({"deploymentTargets","parameterOverrides","regions"})
    private StackSetStackInstances(
        StackSetDeploymentTargets deploymentTargets,
        @Nullable List<StackSetParameter> parameterOverrides,
        List<String> regions) {
        this.deploymentTargets = Objects.requireNonNull(deploymentTargets);
        this.parameterOverrides = parameterOverrides;
        this.regions = Objects.requireNonNull(regions);
    }

    public StackSetDeploymentTargets getDeploymentTargets() {
        return this.deploymentTargets;
    }
    /**
     * A list of stack set parameters whose values you want to override in the selected stack instances.
     * 
    */
    public List<StackSetParameter> getParameterOverrides() {
        return this.parameterOverrides == null ? List.of() : this.parameterOverrides;
    }
    /**
     * The names of one or more Regions where you want to create stack instances using the specified AWS account(s).
     * 
    */
    public List<String> getRegions() {
        return this.regions;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(StackSetStackInstances defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private StackSetDeploymentTargets deploymentTargets;
        private @Nullable List<StackSetParameter> parameterOverrides;
        private List<String> regions;

        public Builder() {
    	      // Empty
        }

        public Builder(StackSetStackInstances defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.deploymentTargets = defaults.deploymentTargets;
    	      this.parameterOverrides = defaults.parameterOverrides;
    	      this.regions = defaults.regions;
        }

        public Builder setDeploymentTargets(StackSetDeploymentTargets deploymentTargets) {
            this.deploymentTargets = Objects.requireNonNull(deploymentTargets);
            return this;
        }

        public Builder setParameterOverrides(@Nullable List<StackSetParameter> parameterOverrides) {
            this.parameterOverrides = parameterOverrides;
            return this;
        }

        public Builder setRegions(List<String> regions) {
            this.regions = Objects.requireNonNull(regions);
            return this;
        }
        public StackSetStackInstances build() {
            return new StackSetStackInstances(deploymentTargets, parameterOverrides, regions);
        }
    }
}
