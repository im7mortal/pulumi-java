// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.osconfig.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.internal.annotations.InputImport;
import io.pulumi.gcp.osconfig.inputs.GuestPoliciesRecipeInstallStepArchiveExtractionArgs;
import io.pulumi.gcp.osconfig.inputs.GuestPoliciesRecipeInstallStepDpkgInstallationArgs;
import io.pulumi.gcp.osconfig.inputs.GuestPoliciesRecipeInstallStepFileCopyArgs;
import io.pulumi.gcp.osconfig.inputs.GuestPoliciesRecipeInstallStepFileExecArgs;
import io.pulumi.gcp.osconfig.inputs.GuestPoliciesRecipeInstallStepMsiInstallationArgs;
import io.pulumi.gcp.osconfig.inputs.GuestPoliciesRecipeInstallStepRpmInstallationArgs;
import io.pulumi.gcp.osconfig.inputs.GuestPoliciesRecipeInstallStepScriptRunArgs;
import java.util.Objects;
import javax.annotation.Nullable;


public final class GuestPoliciesRecipeInstallStepArgs extends io.pulumi.resources.ResourceArgs {

    public static final GuestPoliciesRecipeInstallStepArgs Empty = new GuestPoliciesRecipeInstallStepArgs();

    /**
     * Extracts an archive into the specified directory.
     * Structure is documented below.
     * 
     */
    @InputImport(name="archiveExtraction")
    private final @Nullable Input<GuestPoliciesRecipeInstallStepArchiveExtractionArgs> archiveExtraction;

    public Input<GuestPoliciesRecipeInstallStepArchiveExtractionArgs> getArchiveExtraction() {
        return this.archiveExtraction == null ? Input.empty() : this.archiveExtraction;
    }

    /**
     * Installs a deb file via dpkg.
     * Structure is documented below.
     * 
     */
    @InputImport(name="dpkgInstallation")
    private final @Nullable Input<GuestPoliciesRecipeInstallStepDpkgInstallationArgs> dpkgInstallation;

    public Input<GuestPoliciesRecipeInstallStepDpkgInstallationArgs> getDpkgInstallation() {
        return this.dpkgInstallation == null ? Input.empty() : this.dpkgInstallation;
    }

    /**
     * Copies a file onto the instance.
     * Structure is documented below.
     * 
     */
    @InputImport(name="fileCopy")
    private final @Nullable Input<GuestPoliciesRecipeInstallStepFileCopyArgs> fileCopy;

    public Input<GuestPoliciesRecipeInstallStepFileCopyArgs> getFileCopy() {
        return this.fileCopy == null ? Input.empty() : this.fileCopy;
    }

    /**
     * Executes an artifact or local file.
     * Structure is documented below.
     * 
     */
    @InputImport(name="fileExec")
    private final @Nullable Input<GuestPoliciesRecipeInstallStepFileExecArgs> fileExec;

    public Input<GuestPoliciesRecipeInstallStepFileExecArgs> getFileExec() {
        return this.fileExec == null ? Input.empty() : this.fileExec;
    }

    /**
     * Installs an MSI file.
     * Structure is documented below.
     * 
     */
    @InputImport(name="msiInstallation")
    private final @Nullable Input<GuestPoliciesRecipeInstallStepMsiInstallationArgs> msiInstallation;

    public Input<GuestPoliciesRecipeInstallStepMsiInstallationArgs> getMsiInstallation() {
        return this.msiInstallation == null ? Input.empty() : this.msiInstallation;
    }

    /**
     * Installs an rpm file via the rpm utility.
     * Structure is documented below.
     * 
     */
    @InputImport(name="rpmInstallation")
    private final @Nullable Input<GuestPoliciesRecipeInstallStepRpmInstallationArgs> rpmInstallation;

    public Input<GuestPoliciesRecipeInstallStepRpmInstallationArgs> getRpmInstallation() {
        return this.rpmInstallation == null ? Input.empty() : this.rpmInstallation;
    }

    /**
     * Runs commands in a shell.
     * Structure is documented below.
     * 
     */
    @InputImport(name="scriptRun")
    private final @Nullable Input<GuestPoliciesRecipeInstallStepScriptRunArgs> scriptRun;

    public Input<GuestPoliciesRecipeInstallStepScriptRunArgs> getScriptRun() {
        return this.scriptRun == null ? Input.empty() : this.scriptRun;
    }

    public GuestPoliciesRecipeInstallStepArgs(
        @Nullable Input<GuestPoliciesRecipeInstallStepArchiveExtractionArgs> archiveExtraction,
        @Nullable Input<GuestPoliciesRecipeInstallStepDpkgInstallationArgs> dpkgInstallation,
        @Nullable Input<GuestPoliciesRecipeInstallStepFileCopyArgs> fileCopy,
        @Nullable Input<GuestPoliciesRecipeInstallStepFileExecArgs> fileExec,
        @Nullable Input<GuestPoliciesRecipeInstallStepMsiInstallationArgs> msiInstallation,
        @Nullable Input<GuestPoliciesRecipeInstallStepRpmInstallationArgs> rpmInstallation,
        @Nullable Input<GuestPoliciesRecipeInstallStepScriptRunArgs> scriptRun) {
        this.archiveExtraction = archiveExtraction;
        this.dpkgInstallation = dpkgInstallation;
        this.fileCopy = fileCopy;
        this.fileExec = fileExec;
        this.msiInstallation = msiInstallation;
        this.rpmInstallation = rpmInstallation;
        this.scriptRun = scriptRun;
    }

    private GuestPoliciesRecipeInstallStepArgs() {
        this.archiveExtraction = Input.empty();
        this.dpkgInstallation = Input.empty();
        this.fileCopy = Input.empty();
        this.fileExec = Input.empty();
        this.msiInstallation = Input.empty();
        this.rpmInstallation = Input.empty();
        this.scriptRun = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GuestPoliciesRecipeInstallStepArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<GuestPoliciesRecipeInstallStepArchiveExtractionArgs> archiveExtraction;
        private @Nullable Input<GuestPoliciesRecipeInstallStepDpkgInstallationArgs> dpkgInstallation;
        private @Nullable Input<GuestPoliciesRecipeInstallStepFileCopyArgs> fileCopy;
        private @Nullable Input<GuestPoliciesRecipeInstallStepFileExecArgs> fileExec;
        private @Nullable Input<GuestPoliciesRecipeInstallStepMsiInstallationArgs> msiInstallation;
        private @Nullable Input<GuestPoliciesRecipeInstallStepRpmInstallationArgs> rpmInstallation;
        private @Nullable Input<GuestPoliciesRecipeInstallStepScriptRunArgs> scriptRun;

        public Builder() {
    	      // Empty
        }

        public Builder(GuestPoliciesRecipeInstallStepArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.archiveExtraction = defaults.archiveExtraction;
    	      this.dpkgInstallation = defaults.dpkgInstallation;
    	      this.fileCopy = defaults.fileCopy;
    	      this.fileExec = defaults.fileExec;
    	      this.msiInstallation = defaults.msiInstallation;
    	      this.rpmInstallation = defaults.rpmInstallation;
    	      this.scriptRun = defaults.scriptRun;
        }

        public Builder setArchiveExtraction(@Nullable Input<GuestPoliciesRecipeInstallStepArchiveExtractionArgs> archiveExtraction) {
            this.archiveExtraction = archiveExtraction;
            return this;
        }

        public Builder setArchiveExtraction(@Nullable GuestPoliciesRecipeInstallStepArchiveExtractionArgs archiveExtraction) {
            this.archiveExtraction = Input.ofNullable(archiveExtraction);
            return this;
        }

        public Builder setDpkgInstallation(@Nullable Input<GuestPoliciesRecipeInstallStepDpkgInstallationArgs> dpkgInstallation) {
            this.dpkgInstallation = dpkgInstallation;
            return this;
        }

        public Builder setDpkgInstallation(@Nullable GuestPoliciesRecipeInstallStepDpkgInstallationArgs dpkgInstallation) {
            this.dpkgInstallation = Input.ofNullable(dpkgInstallation);
            return this;
        }

        public Builder setFileCopy(@Nullable Input<GuestPoliciesRecipeInstallStepFileCopyArgs> fileCopy) {
            this.fileCopy = fileCopy;
            return this;
        }

        public Builder setFileCopy(@Nullable GuestPoliciesRecipeInstallStepFileCopyArgs fileCopy) {
            this.fileCopy = Input.ofNullable(fileCopy);
            return this;
        }

        public Builder setFileExec(@Nullable Input<GuestPoliciesRecipeInstallStepFileExecArgs> fileExec) {
            this.fileExec = fileExec;
            return this;
        }

        public Builder setFileExec(@Nullable GuestPoliciesRecipeInstallStepFileExecArgs fileExec) {
            this.fileExec = Input.ofNullable(fileExec);
            return this;
        }

        public Builder setMsiInstallation(@Nullable Input<GuestPoliciesRecipeInstallStepMsiInstallationArgs> msiInstallation) {
            this.msiInstallation = msiInstallation;
            return this;
        }

        public Builder setMsiInstallation(@Nullable GuestPoliciesRecipeInstallStepMsiInstallationArgs msiInstallation) {
            this.msiInstallation = Input.ofNullable(msiInstallation);
            return this;
        }

        public Builder setRpmInstallation(@Nullable Input<GuestPoliciesRecipeInstallStepRpmInstallationArgs> rpmInstallation) {
            this.rpmInstallation = rpmInstallation;
            return this;
        }

        public Builder setRpmInstallation(@Nullable GuestPoliciesRecipeInstallStepRpmInstallationArgs rpmInstallation) {
            this.rpmInstallation = Input.ofNullable(rpmInstallation);
            return this;
        }

        public Builder setScriptRun(@Nullable Input<GuestPoliciesRecipeInstallStepScriptRunArgs> scriptRun) {
            this.scriptRun = scriptRun;
            return this;
        }

        public Builder setScriptRun(@Nullable GuestPoliciesRecipeInstallStepScriptRunArgs scriptRun) {
            this.scriptRun = Input.ofNullable(scriptRun);
            return this;
        }

        public GuestPoliciesRecipeInstallStepArgs build() {
            return new GuestPoliciesRecipeInstallStepArgs(archiveExtraction, dpkgInstallation, fileCopy, fileExec, msiInstallation, rpmInstallation, scriptRun);
        }
    }
}