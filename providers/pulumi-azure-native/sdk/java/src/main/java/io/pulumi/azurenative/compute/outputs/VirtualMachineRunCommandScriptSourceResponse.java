// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.compute.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class VirtualMachineRunCommandScriptSourceResponse {
    /**
     * Specifies a commandId of predefined built-in script.
     * 
     */
    private final @Nullable String commandId;
    /**
     * Specifies the script content to be executed on the VM.
     * 
     */
    private final @Nullable String script;
    /**
     * Specifies the script download location.
     * 
     */
    private final @Nullable String scriptUri;

    @OutputCustomType.Constructor({"commandId","script","scriptUri"})
    private VirtualMachineRunCommandScriptSourceResponse(
        @Nullable String commandId,
        @Nullable String script,
        @Nullable String scriptUri) {
        this.commandId = commandId;
        this.script = script;
        this.scriptUri = scriptUri;
    }

    /**
     * Specifies a commandId of predefined built-in script.
     * 
    */
    public Optional<String> getCommandId() {
        return Optional.ofNullable(this.commandId);
    }
    /**
     * Specifies the script content to be executed on the VM.
     * 
    */
    public Optional<String> getScript() {
        return Optional.ofNullable(this.script);
    }
    /**
     * Specifies the script download location.
     * 
    */
    public Optional<String> getScriptUri() {
        return Optional.ofNullable(this.scriptUri);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(VirtualMachineRunCommandScriptSourceResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String commandId;
        private @Nullable String script;
        private @Nullable String scriptUri;

        public Builder() {
    	      // Empty
        }

        public Builder(VirtualMachineRunCommandScriptSourceResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.commandId = defaults.commandId;
    	      this.script = defaults.script;
    	      this.scriptUri = defaults.scriptUri;
        }

        public Builder setCommandId(@Nullable String commandId) {
            this.commandId = commandId;
            return this;
        }

        public Builder setScript(@Nullable String script) {
            this.script = script;
            return this;
        }

        public Builder setScriptUri(@Nullable String scriptUri) {
            this.scriptUri = scriptUri;
            return this;
        }
        public VirtualMachineRunCommandScriptSourceResponse build() {
            return new VirtualMachineRunCommandScriptSourceResponse(commandId, script, scriptUri);
        }
    }
}
