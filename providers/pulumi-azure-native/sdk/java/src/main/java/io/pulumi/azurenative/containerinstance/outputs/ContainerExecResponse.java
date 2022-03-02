// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.containerinstance.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;

@OutputCustomType
public final class ContainerExecResponse {
    /**
     * The commands to execute within the container.
     * 
     */
    private final @Nullable List<String> command;

    @OutputCustomType.Constructor({"command"})
    private ContainerExecResponse(@Nullable List<String> command) {
        this.command = command;
    }

    /**
     * The commands to execute within the container.
     * 
    */
    public List<String> getCommand() {
        return this.command == null ? List.of() : this.command;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ContainerExecResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable List<String> command;

        public Builder() {
    	      // Empty
        }

        public Builder(ContainerExecResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.command = defaults.command;
        }

        public Builder setCommand(@Nullable List<String> command) {
            this.command = command;
            return this;
        }
        public ContainerExecResponse build() {
            return new ContainerExecResponse(command);
        }
    }
}
