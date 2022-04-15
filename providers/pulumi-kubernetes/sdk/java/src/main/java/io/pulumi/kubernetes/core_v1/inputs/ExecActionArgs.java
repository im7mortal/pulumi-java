// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.kubernetes.core_v1.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import io.pulumi.core.internal.Codegen;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * ExecAction describes a "run in container" action.
 * 
 */
public final class ExecActionArgs extends io.pulumi.resources.ResourceArgs {

    public static final ExecActionArgs Empty = new ExecActionArgs();

    /**
     * Command is the command line to execute inside the container, the working directory for the command  is root ('/') in the container's filesystem. The command is simply exec'd, it is not run inside a shell, so traditional shell instructions ('|', etc) won't work. To use a shell, you need to explicitly call out to that shell. Exit status of 0 is treated as live/healthy and non-zero is unhealthy.
     * 
     */
    @Import(name="command")
      private final @Nullable Output<List<String>> command;

    public Output<List<String>> command() {
        return this.command == null ? Codegen.empty() : this.command;
    }

    public ExecActionArgs(@Nullable Output<List<String>> command) {
        this.command = command;
    }

    private ExecActionArgs() {
        this.command = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ExecActionArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<List<String>> command;

        public Builder() {
    	      // Empty
        }

        public Builder(ExecActionArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.command = defaults.command;
        }

        public Builder command(@Nullable Output<List<String>> command) {
            this.command = command;
            return this;
        }
        public Builder command(@Nullable List<String> command) {
            this.command = Codegen.ofNullable(command);
            return this;
        }
        public Builder command(String... command) {
            return command(List.of(command));
        }        public ExecActionArgs build() {
            return new ExecActionArgs(command);
        }
    }
}
