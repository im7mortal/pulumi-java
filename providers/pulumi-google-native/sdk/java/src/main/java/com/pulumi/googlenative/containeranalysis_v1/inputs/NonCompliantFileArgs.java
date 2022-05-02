// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.containeranalysis_v1.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * Details about files that caused a compliance check to fail. display_command is a single command that can be used to display a list of non compliant files. When there is no such command, we can also iterate a list of non compliant file using &#39;path&#39;.
 * 
 */
public final class NonCompliantFileArgs extends com.pulumi.resources.ResourceArgs {

    public static final NonCompliantFileArgs Empty = new NonCompliantFileArgs();

    /**
     * Command to display the non-compliant files.
     * 
     */
    @Import(name="displayCommand")
    private @Nullable Output<String> displayCommand;

    /**
     * @return Command to display the non-compliant files.
     * 
     */
    public Optional<Output<String>> displayCommand() {
        return Optional.ofNullable(this.displayCommand);
    }

    /**
     * Empty if `display_command` is set.
     * 
     */
    @Import(name="path")
    private @Nullable Output<String> path;

    /**
     * @return Empty if `display_command` is set.
     * 
     */
    public Optional<Output<String>> path() {
        return Optional.ofNullable(this.path);
    }

    /**
     * Explains why a file is non compliant for a CIS check.
     * 
     */
    @Import(name="reason")
    private @Nullable Output<String> reason;

    /**
     * @return Explains why a file is non compliant for a CIS check.
     * 
     */
    public Optional<Output<String>> reason() {
        return Optional.ofNullable(this.reason);
    }

    private NonCompliantFileArgs() {}

    private NonCompliantFileArgs(NonCompliantFileArgs $) {
        this.displayCommand = $.displayCommand;
        this.path = $.path;
        this.reason = $.reason;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(NonCompliantFileArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private NonCompliantFileArgs $;

        public Builder() {
            $ = new NonCompliantFileArgs();
        }

        public Builder(NonCompliantFileArgs defaults) {
            $ = new NonCompliantFileArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param displayCommand Command to display the non-compliant files.
         * 
         * @return builder
         * 
         */
        public Builder displayCommand(@Nullable Output<String> displayCommand) {
            $.displayCommand = displayCommand;
            return this;
        }

        /**
         * @param displayCommand Command to display the non-compliant files.
         * 
         * @return builder
         * 
         */
        public Builder displayCommand(String displayCommand) {
            return displayCommand(Output.of(displayCommand));
        }

        /**
         * @param path Empty if `display_command` is set.
         * 
         * @return builder
         * 
         */
        public Builder path(@Nullable Output<String> path) {
            $.path = path;
            return this;
        }

        /**
         * @param path Empty if `display_command` is set.
         * 
         * @return builder
         * 
         */
        public Builder path(String path) {
            return path(Output.of(path));
        }

        /**
         * @param reason Explains why a file is non compliant for a CIS check.
         * 
         * @return builder
         * 
         */
        public Builder reason(@Nullable Output<String> reason) {
            $.reason = reason;
            return this;
        }

        /**
         * @param reason Explains why a file is non compliant for a CIS check.
         * 
         * @return builder
         * 
         */
        public Builder reason(String reason) {
            return reason(Output.of(reason));
        }

        public NonCompliantFileArgs build() {
            return $;
        }
    }

}
