// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.kubernetes.core_v1.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import io.pulumi.kubernetes.core_v1.outputs.LifecycleHandler;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class Lifecycle {
    /**
     * PostStart is called immediately after a container is created. If the handler fails, the container is terminated and restarted according to its restart policy. Other management of the container blocks until the hook completes. More info: https://kubernetes.io/docs/concepts/containers/container-lifecycle-hooks/#container-hooks
     * 
     */
    private final @Nullable LifecycleHandler postStart;
    /**
     * PreStop is called immediately before a container is terminated due to an API request or management event such as liveness/startup probe failure, preemption, resource contention, etc. The handler is not called if the container crashes or exits. The Pod's termination grace period countdown begins before the PreStop hook is executed. Regardless of the outcome of the handler, the container will eventually terminate within the Pod's termination grace period (unless delayed by finalizers). Other management of the container blocks until the hook completes or until the termination grace period is reached. More info: https://kubernetes.io/docs/concepts/containers/container-lifecycle-hooks/#container-hooks
     * 
     */
    private final @Nullable LifecycleHandler preStop;

    @OutputCustomType.Constructor({"postStart","preStop"})
    private Lifecycle(
        @Nullable LifecycleHandler postStart,
        @Nullable LifecycleHandler preStop) {
        this.postStart = postStart;
        this.preStop = preStop;
    }

    /**
     * PostStart is called immediately after a container is created. If the handler fails, the container is terminated and restarted according to its restart policy. Other management of the container blocks until the hook completes. More info: https://kubernetes.io/docs/concepts/containers/container-lifecycle-hooks/#container-hooks
     * 
    */
    public Optional<LifecycleHandler> getPostStart() {
        return Optional.ofNullable(this.postStart);
    }
    /**
     * PreStop is called immediately before a container is terminated due to an API request or management event such as liveness/startup probe failure, preemption, resource contention, etc. The handler is not called if the container crashes or exits. The Pod's termination grace period countdown begins before the PreStop hook is executed. Regardless of the outcome of the handler, the container will eventually terminate within the Pod's termination grace period (unless delayed by finalizers). Other management of the container blocks until the hook completes or until the termination grace period is reached. More info: https://kubernetes.io/docs/concepts/containers/container-lifecycle-hooks/#container-hooks
     * 
    */
    public Optional<LifecycleHandler> getPreStop() {
        return Optional.ofNullable(this.preStop);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(Lifecycle defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable LifecycleHandler postStart;
        private @Nullable LifecycleHandler preStop;

        public Builder() {
    	      // Empty
        }

        public Builder(Lifecycle defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.postStart = defaults.postStart;
    	      this.preStop = defaults.preStop;
        }

        public Builder setPostStart(@Nullable LifecycleHandler postStart) {
            this.postStart = postStart;
            return this;
        }

        public Builder setPreStop(@Nullable LifecycleHandler preStop) {
            this.preStop = preStop;
            return this;
        }
        public Lifecycle build() {
            return new Lifecycle(postStart, preStop);
        }
    }
}
