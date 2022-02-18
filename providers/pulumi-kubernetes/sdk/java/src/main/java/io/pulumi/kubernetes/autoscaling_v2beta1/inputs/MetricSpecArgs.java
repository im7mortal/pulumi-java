// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.kubernetes.autoscaling_v2beta1.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import io.pulumi.kubernetes.autoscaling_v2beta1.inputs.ContainerResourceMetricSourceArgs;
import io.pulumi.kubernetes.autoscaling_v2beta1.inputs.ExternalMetricSourceArgs;
import io.pulumi.kubernetes.autoscaling_v2beta1.inputs.ObjectMetricSourceArgs;
import io.pulumi.kubernetes.autoscaling_v2beta1.inputs.PodsMetricSourceArgs;
import io.pulumi.kubernetes.autoscaling_v2beta1.inputs.ResourceMetricSourceArgs;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * MetricSpec specifies how to scale based on a single metric (only `type` and one other matching field should be set at once).
 * 
 */
public final class MetricSpecArgs extends io.pulumi.resources.ResourceArgs {

    public static final MetricSpecArgs Empty = new MetricSpecArgs();

    /**
     * container resource refers to a resource metric (such as those specified in requests and limits) known to Kubernetes describing a single container in each pod of the current scale target (e.g. CPU or memory). Such metrics are built in to Kubernetes, and have special scaling options on top of those available to normal per-pod metrics using the "pods" source. This is an alpha feature and can be enabled by the HPAContainerMetrics feature flag.
     * 
     */
    @InputImport(name="containerResource")
    private final @Nullable Input<ContainerResourceMetricSourceArgs> containerResource;

    public Input<ContainerResourceMetricSourceArgs> getContainerResource() {
        return this.containerResource == null ? Input.empty() : this.containerResource;
    }

    /**
     * external refers to a global metric that is not associated with any Kubernetes object. It allows autoscaling based on information coming from components running outside of cluster (for example length of queue in cloud messaging service, or QPS from loadbalancer running outside of cluster).
     * 
     */
    @InputImport(name="external")
    private final @Nullable Input<ExternalMetricSourceArgs> external;

    public Input<ExternalMetricSourceArgs> getExternal() {
        return this.external == null ? Input.empty() : this.external;
    }

    /**
     * object refers to a metric describing a single kubernetes object (for example, hits-per-second on an Ingress object).
     * 
     */
    @InputImport(name="object")
    private final @Nullable Input<ObjectMetricSourceArgs> object;

    public Input<ObjectMetricSourceArgs> getObject() {
        return this.object == null ? Input.empty() : this.object;
    }

    /**
     * pods refers to a metric describing each pod in the current scale target (for example, transactions-processed-per-second).  The values will be averaged together before being compared to the target value.
     * 
     */
    @InputImport(name="pods")
    private final @Nullable Input<PodsMetricSourceArgs> pods;

    public Input<PodsMetricSourceArgs> getPods() {
        return this.pods == null ? Input.empty() : this.pods;
    }

    /**
     * resource refers to a resource metric (such as those specified in requests and limits) known to Kubernetes describing each pod in the current scale target (e.g. CPU or memory). Such metrics are built in to Kubernetes, and have special scaling options on top of those available to normal per-pod metrics using the "pods" source.
     * 
     */
    @InputImport(name="resource")
    private final @Nullable Input<ResourceMetricSourceArgs> resource;

    public Input<ResourceMetricSourceArgs> getResource() {
        return this.resource == null ? Input.empty() : this.resource;
    }

    /**
     * type is the type of metric source.  It should be one of "ContainerResource", "External", "Object", "Pods" or "Resource", each mapping to a matching field in the object. Note: "ContainerResource" type is available on when the feature-gate HPAContainerMetrics is enabled
     * 
     */
    @InputImport(name="type", required=true)
    private final Input<String> type;

    public Input<String> getType() {
        return this.type;
    }

    public MetricSpecArgs(
        @Nullable Input<ContainerResourceMetricSourceArgs> containerResource,
        @Nullable Input<ExternalMetricSourceArgs> external,
        @Nullable Input<ObjectMetricSourceArgs> object,
        @Nullable Input<PodsMetricSourceArgs> pods,
        @Nullable Input<ResourceMetricSourceArgs> resource,
        Input<String> type) {
        this.containerResource = containerResource;
        this.external = external;
        this.object = object;
        this.pods = pods;
        this.resource = resource;
        this.type = Objects.requireNonNull(type, "expected parameter 'type' to be non-null");
    }

    private MetricSpecArgs() {
        this.containerResource = Input.empty();
        this.external = Input.empty();
        this.object = Input.empty();
        this.pods = Input.empty();
        this.resource = Input.empty();
        this.type = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(MetricSpecArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<ContainerResourceMetricSourceArgs> containerResource;
        private @Nullable Input<ExternalMetricSourceArgs> external;
        private @Nullable Input<ObjectMetricSourceArgs> object;
        private @Nullable Input<PodsMetricSourceArgs> pods;
        private @Nullable Input<ResourceMetricSourceArgs> resource;
        private Input<String> type;

        public Builder() {
    	      // Empty
        }

        public Builder(MetricSpecArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.containerResource = defaults.containerResource;
    	      this.external = defaults.external;
    	      this.object = defaults.object;
    	      this.pods = defaults.pods;
    	      this.resource = defaults.resource;
    	      this.type = defaults.type;
        }

        public Builder setContainerResource(@Nullable Input<ContainerResourceMetricSourceArgs> containerResource) {
            this.containerResource = containerResource;
            return this;
        }

        public Builder setContainerResource(@Nullable ContainerResourceMetricSourceArgs containerResource) {
            this.containerResource = Input.ofNullable(containerResource);
            return this;
        }

        public Builder setExternal(@Nullable Input<ExternalMetricSourceArgs> external) {
            this.external = external;
            return this;
        }

        public Builder setExternal(@Nullable ExternalMetricSourceArgs external) {
            this.external = Input.ofNullable(external);
            return this;
        }

        public Builder setObject(@Nullable Input<ObjectMetricSourceArgs> object) {
            this.object = object;
            return this;
        }

        public Builder setObject(@Nullable ObjectMetricSourceArgs object) {
            this.object = Input.ofNullable(object);
            return this;
        }

        public Builder setPods(@Nullable Input<PodsMetricSourceArgs> pods) {
            this.pods = pods;
            return this;
        }

        public Builder setPods(@Nullable PodsMetricSourceArgs pods) {
            this.pods = Input.ofNullable(pods);
            return this;
        }

        public Builder setResource(@Nullable Input<ResourceMetricSourceArgs> resource) {
            this.resource = resource;
            return this;
        }

        public Builder setResource(@Nullable ResourceMetricSourceArgs resource) {
            this.resource = Input.ofNullable(resource);
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

        public MetricSpecArgs build() {
            return new MetricSpecArgs(containerResource, external, object, pods, resource, type);
        }
    }
}
