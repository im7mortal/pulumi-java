// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.kubernetes.core_v1.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class ContainerStateRunning {
    /**
     * Time at which the container was last (re-)started
     * 
     */
    private final @Nullable String startedAt;

    @OutputCustomType.Constructor({"startedAt"})
    private ContainerStateRunning(@Nullable String startedAt) {
        this.startedAt = startedAt;
    }

    /**
     * Time at which the container was last (re-)started
     * 
    */
    public Optional<String> getStartedAt() {
        return Optional.ofNullable(this.startedAt);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ContainerStateRunning defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String startedAt;

        public Builder() {
    	      // Empty
        }

        public Builder(ContainerStateRunning defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.startedAt = defaults.startedAt;
        }

        public Builder setStartedAt(@Nullable String startedAt) {
            this.startedAt = startedAt;
            return this;
        }
        public ContainerStateRunning build() {
            return new ContainerStateRunning(startedAt);
        }
    }
}
