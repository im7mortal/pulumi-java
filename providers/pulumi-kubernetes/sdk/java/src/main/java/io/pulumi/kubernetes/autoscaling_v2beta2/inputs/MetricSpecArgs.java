// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.kubernetes.autoscaling_v2beta2.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import io.pulumi.core.internal.Codegen;
import io.pulumi.kubernetes.autoscaling_v2beta2.inputs.ContainerResourceMetricSourceArgs;
import io.pulumi.kubernetes.autoscaling_v2beta2.inputs.ExternalMetricSourceArgs;
import io.pulumi.kubernetes.autoscaling_v2beta2.inputs.ObjectMetricSourceArgs;
import io.pulumi.kubernetes.autoscaling_v2beta2.inputs.PodsMetricSourceArgs;
import io.pulumi.kubernetes.autoscaling_v2beta2.inputs.ResourceMetricSourceArgs;
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
    @Import(name="containerResource")
      private final @Nullable Output<ContainerResourceMetricSourceArgs> containerResource;

    public Output<ContainerResourceMetricSourceArgs> containerResource() {
        return this.containerResource == null ? Codegen.empty() : this.containerResource;
    }

    /**
     * external refers to a global metric that is not associated with any Kubernetes object. It allows autoscaling based on information coming from components running outside of cluster (for example length of queue in cloud messaging service, or QPS from loadbalancer running outside of cluster).
     * 
     */
    @Import(name="external")
      private final @Nullable Output<ExternalMetricSourceArgs> external;

    public Output<ExternalMetricSourceArgs> external() {
        return this.external == null ? Codegen.empty() : this.external;
    }

    /**
     * object refers to a metric describing a single kubernetes object (for example, hits-per-second on an Ingress object).
     * 
     */
    @Import(name="object")
      private final @Nullable Output<ObjectMetricSourceArgs> object;

    public Output<ObjectMetricSourceArgs> object() {
        return this.object == null ? Codegen.empty() : this.object;
    }

    /**
     * pods refers to a metric describing each pod in the current scale target (for example, transactions-processed-per-second).  The values will be averaged together before being compared to the target value.
     * 
     */
    @Import(name="pods")
      private final @Nullable Output<PodsMetricSourceArgs> pods;

    public Output<PodsMetricSourceArgs> pods() {
        return this.pods == null ? Codegen.empty() : this.pods;
    }

    /**
     * resource refers to a resource metric (such as those specified in requests and limits) known to Kubernetes describing each pod in the current scale target (e.g. CPU or memory). Such metrics are built in to Kubernetes, and have special scaling options on top of those available to normal per-pod metrics using the "pods" source.
     * 
     */
    @Import(name="resource")
      private final @Nullable Output<ResourceMetricSourceArgs> resource;

    public Output<ResourceMetricSourceArgs> resource() {
        return this.resource == null ? Codegen.empty() : this.resource;
    }

    /**
     * type is the type of metric source.  It should be one of "ContainerResource", "External", "Object", "Pods" or "Resource", each mapping to a matching field in the object. Note: "ContainerResource" type is available on when the feature-gate HPAContainerMetrics is enabled
     * 
     */
    @Import(name="type", required=true)
      private final Output<String> type;

    public Output<String> type() {
        return this.type;
    }

    public MetricSpecArgs(
        @Nullable Output<ContainerResourceMetricSourceArgs> containerResource,
        @Nullable Output<ExternalMetricSourceArgs> external,
        @Nullable Output<ObjectMetricSourceArgs> object,
        @Nullable Output<PodsMetricSourceArgs> pods,
        @Nullable Output<ResourceMetricSourceArgs> resource,
        Output<String> type) {
        this.containerResource = containerResource;
        this.external = external;
        this.object = object;
        this.pods = pods;
        this.resource = resource;
        this.type = Objects.requireNonNull(type, "expected parameter 'type' to be non-null");
    }

    private MetricSpecArgs() {
        this.containerResource = Codegen.empty();
        this.external = Codegen.empty();
        this.object = Codegen.empty();
        this.pods = Codegen.empty();
        this.resource = Codegen.empty();
        this.type = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(MetricSpecArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<ContainerResourceMetricSourceArgs> containerResource;
        private @Nullable Output<ExternalMetricSourceArgs> external;
        private @Nullable Output<ObjectMetricSourceArgs> object;
        private @Nullable Output<PodsMetricSourceArgs> pods;
        private @Nullable Output<ResourceMetricSourceArgs> resource;
        private Output<String> type;

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

        public Builder containerResource(@Nullable Output<ContainerResourceMetricSourceArgs> containerResource) {
            this.containerResource = containerResource;
            return this;
        }
        public Builder containerResource(@Nullable ContainerResourceMetricSourceArgs containerResource) {
            this.containerResource = Codegen.ofNullable(containerResource);
            return this;
        }
        public Builder external(@Nullable Output<ExternalMetricSourceArgs> external) {
            this.external = external;
            return this;
        }
        public Builder external(@Nullable ExternalMetricSourceArgs external) {
            this.external = Codegen.ofNullable(external);
            return this;
        }
        public Builder object(@Nullable Output<ObjectMetricSourceArgs> object) {
            this.object = object;
            return this;
        }
        public Builder object(@Nullable ObjectMetricSourceArgs object) {
            this.object = Codegen.ofNullable(object);
            return this;
        }
        public Builder pods(@Nullable Output<PodsMetricSourceArgs> pods) {
            this.pods = pods;
            return this;
        }
        public Builder pods(@Nullable PodsMetricSourceArgs pods) {
            this.pods = Codegen.ofNullable(pods);
            return this;
        }
        public Builder resource(@Nullable Output<ResourceMetricSourceArgs> resource) {
            this.resource = resource;
            return this;
        }
        public Builder resource(@Nullable ResourceMetricSourceArgs resource) {
            this.resource = Codegen.ofNullable(resource);
            return this;
        }
        public Builder type(Output<String> type) {
            this.type = Objects.requireNonNull(type);
            return this;
        }
        public Builder type(String type) {
            this.type = Output.of(Objects.requireNonNull(type));
            return this;
        }        public MetricSpecArgs build() {
            return new MetricSpecArgs(containerResource, external, object, pods, resource, type);
        }
    }
}
