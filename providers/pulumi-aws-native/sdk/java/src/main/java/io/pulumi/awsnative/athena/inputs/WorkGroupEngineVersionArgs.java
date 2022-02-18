// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.athena.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.internal.annotations.InputImport;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * The Athena engine version for running queries.
 * 
 */
public final class WorkGroupEngineVersionArgs extends io.pulumi.resources.ResourceArgs {

    public static final WorkGroupEngineVersionArgs Empty = new WorkGroupEngineVersionArgs();

    @InputImport(name="effectiveEngineVersion")
    private final @Nullable Input<String> effectiveEngineVersion;

    public Input<String> getEffectiveEngineVersion() {
        return this.effectiveEngineVersion == null ? Input.empty() : this.effectiveEngineVersion;
    }

    @InputImport(name="selectedEngineVersion")
    private final @Nullable Input<String> selectedEngineVersion;

    public Input<String> getSelectedEngineVersion() {
        return this.selectedEngineVersion == null ? Input.empty() : this.selectedEngineVersion;
    }

    public WorkGroupEngineVersionArgs(
        @Nullable Input<String> effectiveEngineVersion,
        @Nullable Input<String> selectedEngineVersion) {
        this.effectiveEngineVersion = effectiveEngineVersion;
        this.selectedEngineVersion = selectedEngineVersion;
    }

    private WorkGroupEngineVersionArgs() {
        this.effectiveEngineVersion = Input.empty();
        this.selectedEngineVersion = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(WorkGroupEngineVersionArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<String> effectiveEngineVersion;
        private @Nullable Input<String> selectedEngineVersion;

        public Builder() {
    	      // Empty
        }

        public Builder(WorkGroupEngineVersionArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.effectiveEngineVersion = defaults.effectiveEngineVersion;
    	      this.selectedEngineVersion = defaults.selectedEngineVersion;
        }

        public Builder setEffectiveEngineVersion(@Nullable Input<String> effectiveEngineVersion) {
            this.effectiveEngineVersion = effectiveEngineVersion;
            return this;
        }

        public Builder setEffectiveEngineVersion(@Nullable String effectiveEngineVersion) {
            this.effectiveEngineVersion = Input.ofNullable(effectiveEngineVersion);
            return this;
        }

        public Builder setSelectedEngineVersion(@Nullable Input<String> selectedEngineVersion) {
            this.selectedEngineVersion = selectedEngineVersion;
            return this;
        }

        public Builder setSelectedEngineVersion(@Nullable String selectedEngineVersion) {
            this.selectedEngineVersion = Input.ofNullable(selectedEngineVersion);
            return this;
        }

        public WorkGroupEngineVersionArgs build() {
            return new WorkGroupEngineVersionArgs(effectiveEngineVersion, selectedEngineVersion);
        }
    }
}
