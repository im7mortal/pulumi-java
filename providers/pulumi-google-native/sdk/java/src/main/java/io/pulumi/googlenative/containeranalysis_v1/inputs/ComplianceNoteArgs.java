// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.containeranalysis_v1.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.internal.annotations.InputImport;
import io.pulumi.googlenative.containeranalysis_v1.inputs.CisBenchmarkArgs;
import io.pulumi.googlenative.containeranalysis_v1.inputs.ComplianceVersionArgs;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;


public final class ComplianceNoteArgs extends io.pulumi.resources.ResourceArgs {

    public static final ComplianceNoteArgs Empty = new ComplianceNoteArgs();

    @InputImport(name="cisBenchmark")
    private final @Nullable Input<CisBenchmarkArgs> cisBenchmark;

    public Input<CisBenchmarkArgs> getCisBenchmark() {
        return this.cisBenchmark == null ? Input.empty() : this.cisBenchmark;
    }

    @InputImport(name="description")
    private final @Nullable Input<String> description;

    public Input<String> getDescription() {
        return this.description == null ? Input.empty() : this.description;
    }

    @InputImport(name="rationale")
    private final @Nullable Input<String> rationale;

    public Input<String> getRationale() {
        return this.rationale == null ? Input.empty() : this.rationale;
    }

    @InputImport(name="remediation")
    private final @Nullable Input<String> remediation;

    public Input<String> getRemediation() {
        return this.remediation == null ? Input.empty() : this.remediation;
    }

    @InputImport(name="scanInstructions")
    private final @Nullable Input<String> scanInstructions;

    public Input<String> getScanInstructions() {
        return this.scanInstructions == null ? Input.empty() : this.scanInstructions;
    }

    @InputImport(name="title")
    private final @Nullable Input<String> title;

    public Input<String> getTitle() {
        return this.title == null ? Input.empty() : this.title;
    }

    @InputImport(name="version")
    private final @Nullable Input<List<ComplianceVersionArgs>> version;

    public Input<List<ComplianceVersionArgs>> getVersion() {
        return this.version == null ? Input.empty() : this.version;
    }

    public ComplianceNoteArgs(
        @Nullable Input<CisBenchmarkArgs> cisBenchmark,
        @Nullable Input<String> description,
        @Nullable Input<String> rationale,
        @Nullable Input<String> remediation,
        @Nullable Input<String> scanInstructions,
        @Nullable Input<String> title,
        @Nullable Input<List<ComplianceVersionArgs>> version) {
        this.cisBenchmark = cisBenchmark;
        this.description = description;
        this.rationale = rationale;
        this.remediation = remediation;
        this.scanInstructions = scanInstructions;
        this.title = title;
        this.version = version;
    }

    private ComplianceNoteArgs() {
        this.cisBenchmark = Input.empty();
        this.description = Input.empty();
        this.rationale = Input.empty();
        this.remediation = Input.empty();
        this.scanInstructions = Input.empty();
        this.title = Input.empty();
        this.version = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ComplianceNoteArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<CisBenchmarkArgs> cisBenchmark;
        private @Nullable Input<String> description;
        private @Nullable Input<String> rationale;
        private @Nullable Input<String> remediation;
        private @Nullable Input<String> scanInstructions;
        private @Nullable Input<String> title;
        private @Nullable Input<List<ComplianceVersionArgs>> version;

        public Builder() {
    	      // Empty
        }

        public Builder(ComplianceNoteArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.cisBenchmark = defaults.cisBenchmark;
    	      this.description = defaults.description;
    	      this.rationale = defaults.rationale;
    	      this.remediation = defaults.remediation;
    	      this.scanInstructions = defaults.scanInstructions;
    	      this.title = defaults.title;
    	      this.version = defaults.version;
        }

        public Builder setCisBenchmark(@Nullable Input<CisBenchmarkArgs> cisBenchmark) {
            this.cisBenchmark = cisBenchmark;
            return this;
        }

        public Builder setCisBenchmark(@Nullable CisBenchmarkArgs cisBenchmark) {
            this.cisBenchmark = Input.ofNullable(cisBenchmark);
            return this;
        }

        public Builder setDescription(@Nullable Input<String> description) {
            this.description = description;
            return this;
        }

        public Builder setDescription(@Nullable String description) {
            this.description = Input.ofNullable(description);
            return this;
        }

        public Builder setRationale(@Nullable Input<String> rationale) {
            this.rationale = rationale;
            return this;
        }

        public Builder setRationale(@Nullable String rationale) {
            this.rationale = Input.ofNullable(rationale);
            return this;
        }

        public Builder setRemediation(@Nullable Input<String> remediation) {
            this.remediation = remediation;
            return this;
        }

        public Builder setRemediation(@Nullable String remediation) {
            this.remediation = Input.ofNullable(remediation);
            return this;
        }

        public Builder setScanInstructions(@Nullable Input<String> scanInstructions) {
            this.scanInstructions = scanInstructions;
            return this;
        }

        public Builder setScanInstructions(@Nullable String scanInstructions) {
            this.scanInstructions = Input.ofNullable(scanInstructions);
            return this;
        }

        public Builder setTitle(@Nullable Input<String> title) {
            this.title = title;
            return this;
        }

        public Builder setTitle(@Nullable String title) {
            this.title = Input.ofNullable(title);
            return this;
        }

        public Builder setVersion(@Nullable Input<List<ComplianceVersionArgs>> version) {
            this.version = version;
            return this;
        }

        public Builder setVersion(@Nullable List<ComplianceVersionArgs> version) {
            this.version = Input.ofNullable(version);
            return this;
        }

        public ComplianceNoteArgs build() {
            return new ComplianceNoteArgs(cisBenchmark, description, rationale, remediation, scanInstructions, title, version);
        }
    }
}