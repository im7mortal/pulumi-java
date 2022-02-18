// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.kubernetes.autoscaling_v2beta2.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import io.pulumi.kubernetes.autoscaling_v2beta2.outputs.ContainerResourceMetricStatus;
import io.pulumi.kubernetes.autoscaling_v2beta2.outputs.ExternalMetricStatus;
import io.pulumi.kubernetes.autoscaling_v2beta2.outputs.ObjectMetricStatus;
import io.pulumi.kubernetes.autoscaling_v2beta2.outputs.PodsMetricStatus;
import io.pulumi.kubernetes.autoscaling_v2beta2.outputs.ResourceMetricStatus;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class MetricStatus {
    /**
     * container resource refers to a resource metric (such as those specified in requests and limits) known to Kubernetes describing a single container in each pod in the current scale target (e.g. CPU or memory). Such metrics are built in to Kubernetes, and have special scaling options on top of those available to normal per-pod metrics using the "pods" source.
     * 
     */
    private final @Nullable ContainerResourceMetricStatus containerResource;
    /**
     * external refers to a global metric that is not associated with any Kubernetes object. It allows autoscaling based on information coming from components running outside of cluster (for example length of queue in cloud messaging service, or QPS from loadbalancer running outside of cluster).
     * 
     */
    private final @Nullable ExternalMetricStatus external;
    /**
     * object refers to a metric describing a single kubernetes object (for example, hits-per-second on an Ingress object).
     * 
     */
    private final @Nullable ObjectMetricStatus object;
    /**
     * pods refers to a metric describing each pod in the current scale target (for example, transactions-processed-per-second).  The values will be averaged together before being compared to the target value.
     * 
     */
    private final @Nullable PodsMetricStatus pods;
    /**
     * resource refers to a resource metric (such as those specified in requests and limits) known to Kubernetes describing each pod in the current scale target (e.g. CPU or memory). Such metrics are built in to Kubernetes, and have special scaling options on top of those available to normal per-pod metrics using the "pods" source.
     * 
     */
    private final @Nullable ResourceMetricStatus resource;
    /**
     * type is the type of metric source.  It will be one of "ContainerResource", "External", "Object", "Pods" or "Resource", each corresponds to a matching field in the object. Note: "ContainerResource" type is available on when the feature-gate HPAContainerMetrics is enabled
     * 
     */
    private final String type;

    @OutputCustomType.Constructor({"containerResource","external","object","pods","resource","type"})
    private MetricStatus(
        @Nullable ContainerResourceMetricStatus containerResource,
        @Nullable ExternalMetricStatus external,
        @Nullable ObjectMetricStatus object,
        @Nullable PodsMetricStatus pods,
        @Nullable ResourceMetricStatus resource,
        String type) {
        this.containerResource = containerResource;
        this.external = external;
        this.object = object;
        this.pods = pods;
        this.resource = resource;
        this.type = Objects.requireNonNull(type);
    }

    /**
     * container resource refers to a resource metric (such as those specified in requests and limits) known to Kubernetes describing a single container in each pod in the current scale target (e.g. CPU or memory). Such metrics are built in to Kubernetes, and have special scaling options on top of those available to normal per-pod metrics using the "pods" source.
     * 
     */
    public Optional<ContainerResourceMetricStatus> getContainerResource() {
        return Optional.ofNullable(this.containerResource);
    }
    /**
     * external refers to a global metric that is not associated with any Kubernetes object. It allows autoscaling based on information coming from components running outside of cluster (for example length of queue in cloud messaging service, or QPS from loadbalancer running outside of cluster).
     * 
     */
    public Optional<ExternalMetricStatus> getExternal() {
        return Optional.ofNullable(this.external);
    }
    /**
     * object refers to a metric describing a single kubernetes object (for example, hits-per-second on an Ingress object).
     * 
     */
    public Optional<ObjectMetricStatus> getObject() {
        return Optional.ofNullable(this.object);
    }
    /**
     * pods refers to a metric describing each pod in the current scale target (for example, transactions-processed-per-second).  The values will be averaged together before being compared to the target value.
     * 
     */
    public Optional<PodsMetricStatus> getPods() {
        return Optional.ofNullable(this.pods);
    }
    /**
     * resource refers to a resource metric (such as those specified in requests and limits) known to Kubernetes describing each pod in the current scale target (e.g. CPU or memory). Such metrics are built in to Kubernetes, and have special scaling options on top of those available to normal per-pod metrics using the "pods" source.
     * 
     */
    public Optional<ResourceMetricStatus> getResource() {
        return Optional.ofNullable(this.resource);
    }
    /**
     * type is the type of metric source.  It will be one of "ContainerResource", "External", "Object", "Pods" or "Resource", each corresponds to a matching field in the object. Note: "ContainerResource" type is available on when the feature-gate HPAContainerMetrics is enabled
     * 
     */
    public String getType() {
        return this.type;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(MetricStatus defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable ContainerResourceMetricStatus containerResource;
        private @Nullable ExternalMetricStatus external;
        private @Nullable ObjectMetricStatus object;
        private @Nullable PodsMetricStatus pods;
        private @Nullable ResourceMetricStatus resource;
        private String type;

        public Builder() {
    	      // Empty
        }

        public Builder(MetricStatus defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.containerResource = defaults.containerResource;
    	      this.external = defaults.external;
    	      this.object = defaults.object;
    	      this.pods = defaults.pods;
    	      this.resource = defaults.resource;
    	      this.type = defaults.type;
        }

        public Builder setContainerResource(@Nullable ContainerResourceMetricStatus containerResource) {
            this.containerResource = containerResource;
            return this;
        }

        public Builder setExternal(@Nullable ExternalMetricStatus external) {
            this.external = external;
            return this;
        }

        public Builder setObject(@Nullable ObjectMetricStatus object) {
            this.object = object;
            return this;
        }

        public Builder setPods(@Nullable PodsMetricStatus pods) {
            this.pods = pods;
            return this;
        }

        public Builder setResource(@Nullable ResourceMetricStatus resource) {
            this.resource = resource;
            return this;
        }

        public Builder setType(String type) {
            this.type = Objects.requireNonNull(type);
            return this;
        }

        public MetricStatus build() {
            return new MetricStatus(containerResource, external, object, pods, resource, type);
        }
    }
}
