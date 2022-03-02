// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.kubernetes.autoscaling_v2.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import io.pulumi.kubernetes.autoscaling_v2.outputs.MetricTarget;
import java.lang.String;
import java.util.Objects;

@OutputCustomType
public final class ContainerResourceMetricSource {
    /**
     * container is the name of the container in the pods of the scaling target
     * 
     */
    private final String container;
    /**
     * name is the name of the resource in question.
     * 
     */
    private final String name;
    /**
     * target specifies the target value for the given metric
     * 
     */
    private final MetricTarget target;

    @OutputCustomType.Constructor({"container","name","target"})
    private ContainerResourceMetricSource(
        String container,
        String name,
        MetricTarget target) {
        this.container = Objects.requireNonNull(container);
        this.name = Objects.requireNonNull(name);
        this.target = Objects.requireNonNull(target);
    }

    /**
     * container is the name of the container in the pods of the scaling target
     * 
    */
    public String getContainer() {
        return this.container;
    }
    /**
     * name is the name of the resource in question.
     * 
    */
    public String getName() {
        return this.name;
    }
    /**
     * target specifies the target value for the given metric
     * 
    */
    public MetricTarget getTarget() {
        return this.target;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ContainerResourceMetricSource defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String container;
        private String name;
        private MetricTarget target;

        public Builder() {
    	      // Empty
        }

        public Builder(ContainerResourceMetricSource defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.container = defaults.container;
    	      this.name = defaults.name;
    	      this.target = defaults.target;
        }

        public Builder setContainer(String container) {
            this.container = Objects.requireNonNull(container);
            return this;
        }

        public Builder setName(String name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }

        public Builder setTarget(MetricTarget target) {
            this.target = Objects.requireNonNull(target);
            return this;
        }
        public ContainerResourceMetricSource build() {
            return new ContainerResourceMetricSource(container, name, target);
        }
    }
}
