// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.kubernetes.discovery.k8s.io_v1beta1.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import java.lang.Boolean;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class EndpointConditions {
    /**
     * ready indicates that this endpoint is prepared to receive traffic, according to whatever system is managing the endpoint. A nil value indicates an unknown state. In most cases consumers should interpret this unknown state as ready. For compatibility reasons, ready should never be "true" for terminating endpoints.
     * 
     */
    private final @Nullable Boolean ready;
    /**
     * serving is identical to ready except that it is set regardless of the terminating state of endpoints. This condition should be set to true for a ready endpoint that is terminating. If nil, consumers should defer to the ready condition. This field can be enabled with the EndpointSliceTerminatingCondition feature gate.
     * 
     */
    private final @Nullable Boolean serving;
    /**
     * terminating indicates that this endpoint is terminating. A nil value indicates an unknown state. Consumers should interpret this unknown state to mean that the endpoint is not terminating. This field can be enabled with the EndpointSliceTerminatingCondition feature gate.
     * 
     */
    private final @Nullable Boolean terminating;

    @OutputCustomType.Constructor({"ready","serving","terminating"})
    private EndpointConditions(
        @Nullable Boolean ready,
        @Nullable Boolean serving,
        @Nullable Boolean terminating) {
        this.ready = ready;
        this.serving = serving;
        this.terminating = terminating;
    }

    /**
     * ready indicates that this endpoint is prepared to receive traffic, according to whatever system is managing the endpoint. A nil value indicates an unknown state. In most cases consumers should interpret this unknown state as ready. For compatibility reasons, ready should never be "true" for terminating endpoints.
     * 
    */
    public Optional<Boolean> getReady() {
        return Optional.ofNullable(this.ready);
    }
    /**
     * serving is identical to ready except that it is set regardless of the terminating state of endpoints. This condition should be set to true for a ready endpoint that is terminating. If nil, consumers should defer to the ready condition. This field can be enabled with the EndpointSliceTerminatingCondition feature gate.
     * 
    */
    public Optional<Boolean> getServing() {
        return Optional.ofNullable(this.serving);
    }
    /**
     * terminating indicates that this endpoint is terminating. A nil value indicates an unknown state. Consumers should interpret this unknown state to mean that the endpoint is not terminating. This field can be enabled with the EndpointSliceTerminatingCondition feature gate.
     * 
    */
    public Optional<Boolean> getTerminating() {
        return Optional.ofNullable(this.terminating);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(EndpointConditions defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Boolean ready;
        private @Nullable Boolean serving;
        private @Nullable Boolean terminating;

        public Builder() {
    	      // Empty
        }

        public Builder(EndpointConditions defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.ready = defaults.ready;
    	      this.serving = defaults.serving;
    	      this.terminating = defaults.terminating;
        }

        public Builder setReady(@Nullable Boolean ready) {
            this.ready = ready;
            return this;
        }

        public Builder setServing(@Nullable Boolean serving) {
            this.serving = serving;
            return this;
        }

        public Builder setTerminating(@Nullable Boolean terminating) {
            this.terminating = terminating;
            return this;
        }
        public EndpointConditions build() {
            return new EndpointConditions(ready, serving, terminating);
        }
    }
}
