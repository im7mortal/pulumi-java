// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.kubernetes.core_v1.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import io.pulumi.core.internal.Codegen;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * ContainerStateWaiting is a waiting state of a container.
 * 
 */
public final class ContainerStateWaitingArgs extends io.pulumi.resources.ResourceArgs {

    public static final ContainerStateWaitingArgs Empty = new ContainerStateWaitingArgs();

    /**
     * Message regarding why the container is not yet running.
     * 
     */
    @Import(name="message")
      private final @Nullable Output<String> message;

    public Output<String> message() {
        return this.message == null ? Codegen.empty() : this.message;
    }

    /**
     * (brief) reason the container is not yet running.
     * 
     */
    @Import(name="reason")
      private final @Nullable Output<String> reason;

    public Output<String> reason() {
        return this.reason == null ? Codegen.empty() : this.reason;
    }

    public ContainerStateWaitingArgs(
        @Nullable Output<String> message,
        @Nullable Output<String> reason) {
        this.message = message;
        this.reason = reason;
    }

    private ContainerStateWaitingArgs() {
        this.message = Codegen.empty();
        this.reason = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ContainerStateWaitingArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<String> message;
        private @Nullable Output<String> reason;

        public Builder() {
    	      // Empty
        }

        public Builder(ContainerStateWaitingArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.message = defaults.message;
    	      this.reason = defaults.reason;
        }

        public Builder message(@Nullable Output<String> message) {
            this.message = message;
            return this;
        }
        public Builder message(@Nullable String message) {
            this.message = Codegen.ofNullable(message);
            return this;
        }
        public Builder reason(@Nullable Output<String> reason) {
            this.reason = reason;
            return this;
        }
        public Builder reason(@Nullable String reason) {
            this.reason = Codegen.ofNullable(reason);
            return this;
        }        public ContainerStateWaitingArgs build() {
            return new ContainerStateWaitingArgs(message, reason);
        }
    }
}
