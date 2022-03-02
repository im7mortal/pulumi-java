// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.virtualmachineimages.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class ImageTemplatePowerShellCustomizerResponse {
    /**
     * Array of PowerShell commands to execute
     * 
     */
    private final @Nullable List<String> inline;
    /**
     * Friendly Name to provide context on what this customization step does
     * 
     */
    private final @Nullable String name;
    /**
     * If specified, the PowerShell script will be run with elevated privileges using the Local System user. Can only be true when the runElevated field above is set to true.
     * 
     */
    private final @Nullable Boolean runAsSystem;
    /**
     * If specified, the PowerShell script will be run with elevated privileges
     * 
     */
    private final @Nullable Boolean runElevated;
    /**
     * URI of the PowerShell script to be run for customizing. It can be a github link, SAS URI for Azure Storage, etc
     * 
     */
    private final @Nullable String scriptUri;
    /**
     * SHA256 checksum of the power shell script provided in the scriptUri field above
     * 
     */
    private final @Nullable String sha256Checksum;
    /**
     * The type of customization tool you want to use on the Image. For example, "Shell" can be shell customizer
     * Expected value is 'PowerShell'.
     * 
     */
    private final String type;
    /**
     * Valid exit codes for the PowerShell script. [Default: 0]
     * 
     */
    private final @Nullable List<Integer> validExitCodes;

    @OutputCustomType.Constructor({"inline","name","runAsSystem","runElevated","scriptUri","sha256Checksum","type","validExitCodes"})
    private ImageTemplatePowerShellCustomizerResponse(
        @Nullable List<String> inline,
        @Nullable String name,
        @Nullable Boolean runAsSystem,
        @Nullable Boolean runElevated,
        @Nullable String scriptUri,
        @Nullable String sha256Checksum,
        String type,
        @Nullable List<Integer> validExitCodes) {
        this.inline = inline;
        this.name = name;
        this.runAsSystem = runAsSystem;
        this.runElevated = runElevated;
        this.scriptUri = scriptUri;
        this.sha256Checksum = sha256Checksum;
        this.type = Objects.requireNonNull(type);
        this.validExitCodes = validExitCodes;
    }

    /**
     * Array of PowerShell commands to execute
     * 
    */
    public List<String> getInline() {
        return this.inline == null ? List.of() : this.inline;
    }
    /**
     * Friendly Name to provide context on what this customization step does
     * 
    */
    public Optional<String> getName() {
        return Optional.ofNullable(this.name);
    }
    /**
     * If specified, the PowerShell script will be run with elevated privileges using the Local System user. Can only be true when the runElevated field above is set to true.
     * 
    */
    public Optional<Boolean> getRunAsSystem() {
        return Optional.ofNullable(this.runAsSystem);
    }
    /**
     * If specified, the PowerShell script will be run with elevated privileges
     * 
    */
    public Optional<Boolean> getRunElevated() {
        return Optional.ofNullable(this.runElevated);
    }
    /**
     * URI of the PowerShell script to be run for customizing. It can be a github link, SAS URI for Azure Storage, etc
     * 
    */
    public Optional<String> getScriptUri() {
        return Optional.ofNullable(this.scriptUri);
    }
    /**
     * SHA256 checksum of the power shell script provided in the scriptUri field above
     * 
    */
    public Optional<String> getSha256Checksum() {
        return Optional.ofNullable(this.sha256Checksum);
    }
    /**
     * The type of customization tool you want to use on the Image. For example, "Shell" can be shell customizer
     * Expected value is 'PowerShell'.
     * 
    */
    public String getType() {
        return this.type;
    }
    /**
     * Valid exit codes for the PowerShell script. [Default: 0]
     * 
    */
    public List<Integer> getValidExitCodes() {
        return this.validExitCodes == null ? List.of() : this.validExitCodes;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ImageTemplatePowerShellCustomizerResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable List<String> inline;
        private @Nullable String name;
        private @Nullable Boolean runAsSystem;
        private @Nullable Boolean runElevated;
        private @Nullable String scriptUri;
        private @Nullable String sha256Checksum;
        private String type;
        private @Nullable List<Integer> validExitCodes;

        public Builder() {
    	      // Empty
        }

        public Builder(ImageTemplatePowerShellCustomizerResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.inline = defaults.inline;
    	      this.name = defaults.name;
    	      this.runAsSystem = defaults.runAsSystem;
    	      this.runElevated = defaults.runElevated;
    	      this.scriptUri = defaults.scriptUri;
    	      this.sha256Checksum = defaults.sha256Checksum;
    	      this.type = defaults.type;
    	      this.validExitCodes = defaults.validExitCodes;
        }

        public Builder setInline(@Nullable List<String> inline) {
            this.inline = inline;
            return this;
        }

        public Builder setName(@Nullable String name) {
            this.name = name;
            return this;
        }

        public Builder setRunAsSystem(@Nullable Boolean runAsSystem) {
            this.runAsSystem = runAsSystem;
            return this;
        }

        public Builder setRunElevated(@Nullable Boolean runElevated) {
            this.runElevated = runElevated;
            return this;
        }

        public Builder setScriptUri(@Nullable String scriptUri) {
            this.scriptUri = scriptUri;
            return this;
        }

        public Builder setSha256Checksum(@Nullable String sha256Checksum) {
            this.sha256Checksum = sha256Checksum;
            return this;
        }

        public Builder setType(String type) {
            this.type = Objects.requireNonNull(type);
            return this;
        }

        public Builder setValidExitCodes(@Nullable List<Integer> validExitCodes) {
            this.validExitCodes = validExitCodes;
            return this;
        }
        public ImageTemplatePowerShellCustomizerResponse build() {
            return new ImageTemplatePowerShellCustomizerResponse(inline, name, runAsSystem, runElevated, scriptUri, sha256Checksum, type, validExitCodes);
        }
    }
}
