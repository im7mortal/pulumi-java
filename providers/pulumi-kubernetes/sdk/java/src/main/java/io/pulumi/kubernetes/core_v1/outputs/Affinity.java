// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.kubernetes.core_v1.outputs;

import io.pulumi.core.annotations.CustomType;
import io.pulumi.kubernetes.core_v1.outputs.NodeAffinity;
import io.pulumi.kubernetes.core_v1.outputs.PodAffinity;
import io.pulumi.kubernetes.core_v1.outputs.PodAntiAffinity;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class Affinity {
    /**
     * Describes node affinity scheduling rules for the pod.
     * 
     */
    private final @Nullable NodeAffinity nodeAffinity;
    /**
     * Describes pod affinity scheduling rules (e.g. co-locate this pod in the same node, zone, etc. as some other pod(s)).
     * 
     */
    private final @Nullable PodAffinity podAffinity;
    /**
     * Describes pod anti-affinity scheduling rules (e.g. avoid putting this pod in the same node, zone, etc. as some other pod(s)).
     * 
     */
    private final @Nullable PodAntiAffinity podAntiAffinity;

    @CustomType.Constructor
    private Affinity(
        @CustomType.Parameter("nodeAffinity") @Nullable NodeAffinity nodeAffinity,
        @CustomType.Parameter("podAffinity") @Nullable PodAffinity podAffinity,
        @CustomType.Parameter("podAntiAffinity") @Nullable PodAntiAffinity podAntiAffinity) {
        this.nodeAffinity = nodeAffinity;
        this.podAffinity = podAffinity;
        this.podAntiAffinity = podAntiAffinity;
    }

    /**
     * Describes node affinity scheduling rules for the pod.
     * 
    */
    public Optional<NodeAffinity> nodeAffinity() {
        return Optional.ofNullable(this.nodeAffinity);
    }
    /**
     * Describes pod affinity scheduling rules (e.g. co-locate this pod in the same node, zone, etc. as some other pod(s)).
     * 
    */
    public Optional<PodAffinity> podAffinity() {
        return Optional.ofNullable(this.podAffinity);
    }
    /**
     * Describes pod anti-affinity scheduling rules (e.g. avoid putting this pod in the same node, zone, etc. as some other pod(s)).
     * 
    */
    public Optional<PodAntiAffinity> podAntiAffinity() {
        return Optional.ofNullable(this.podAntiAffinity);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(Affinity defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable NodeAffinity nodeAffinity;
        private @Nullable PodAffinity podAffinity;
        private @Nullable PodAntiAffinity podAntiAffinity;

        public Builder() {
    	      // Empty
        }

        public Builder(Affinity defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.nodeAffinity = defaults.nodeAffinity;
    	      this.podAffinity = defaults.podAffinity;
    	      this.podAntiAffinity = defaults.podAntiAffinity;
        }

        public Builder nodeAffinity(@Nullable NodeAffinity nodeAffinity) {
            this.nodeAffinity = nodeAffinity;
            return this;
        }
        public Builder podAffinity(@Nullable PodAffinity podAffinity) {
            this.podAffinity = podAffinity;
            return this;
        }
        public Builder podAntiAffinity(@Nullable PodAntiAffinity podAntiAffinity) {
            this.podAntiAffinity = podAntiAffinity;
            return this;
        }        public Affinity build() {
            return new Affinity(nodeAffinity, podAffinity, podAntiAffinity);
        }
    }
}
