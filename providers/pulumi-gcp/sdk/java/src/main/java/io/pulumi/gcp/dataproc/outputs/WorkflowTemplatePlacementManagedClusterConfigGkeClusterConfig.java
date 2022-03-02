// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.dataproc.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import io.pulumi.gcp.dataproc.outputs.WorkflowTemplatePlacementManagedClusterConfigGkeClusterConfigNamespacedGkeDeploymentTarget;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class WorkflowTemplatePlacementManagedClusterConfigGkeClusterConfig {
    /**
     * Optional. A target for the deployment.
     * 
     */
    private final @Nullable WorkflowTemplatePlacementManagedClusterConfigGkeClusterConfigNamespacedGkeDeploymentTarget namespacedGkeDeploymentTarget;

    @OutputCustomType.Constructor({"namespacedGkeDeploymentTarget"})
    private WorkflowTemplatePlacementManagedClusterConfigGkeClusterConfig(@Nullable WorkflowTemplatePlacementManagedClusterConfigGkeClusterConfigNamespacedGkeDeploymentTarget namespacedGkeDeploymentTarget) {
        this.namespacedGkeDeploymentTarget = namespacedGkeDeploymentTarget;
    }

    /**
     * Optional. A target for the deployment.
     * 
    */
    public Optional<WorkflowTemplatePlacementManagedClusterConfigGkeClusterConfigNamespacedGkeDeploymentTarget> getNamespacedGkeDeploymentTarget() {
        return Optional.ofNullable(this.namespacedGkeDeploymentTarget);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(WorkflowTemplatePlacementManagedClusterConfigGkeClusterConfig defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable WorkflowTemplatePlacementManagedClusterConfigGkeClusterConfigNamespacedGkeDeploymentTarget namespacedGkeDeploymentTarget;

        public Builder() {
    	      // Empty
        }

        public Builder(WorkflowTemplatePlacementManagedClusterConfigGkeClusterConfig defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.namespacedGkeDeploymentTarget = defaults.namespacedGkeDeploymentTarget;
        }

        public Builder setNamespacedGkeDeploymentTarget(@Nullable WorkflowTemplatePlacementManagedClusterConfigGkeClusterConfigNamespacedGkeDeploymentTarget namespacedGkeDeploymentTarget) {
            this.namespacedGkeDeploymentTarget = namespacedGkeDeploymentTarget;
            return this;
        }
        public WorkflowTemplatePlacementManagedClusterConfigGkeClusterConfig build() {
            return new WorkflowTemplatePlacementManagedClusterConfigGkeClusterConfig(namespacedGkeDeploymentTarget);
        }
    }
}
