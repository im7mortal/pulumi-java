// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.containeranalysis_v1.inputs;

import io.pulumi.core.internal.annotations.InputImport;
import java.lang.String;
import java.util.Objects;


public final class BuildNoteResponse extends io.pulumi.resources.InvokeArgs {

    public static final BuildNoteResponse Empty = new BuildNoteResponse();

    @InputImport(name="builderVersion", required=true)
    private final String builderVersion;

    public String getBuilderVersion() {
        return this.builderVersion;
    }

    public BuildNoteResponse(String builderVersion) {
        this.builderVersion = Objects.requireNonNull(builderVersion, "expected parameter 'builderVersion' to be non-null");
    }

    private BuildNoteResponse() {
        this.builderVersion = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(BuildNoteResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String builderVersion;

        public Builder() {
    	      // Empty
        }

        public Builder(BuildNoteResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.builderVersion = defaults.builderVersion;
        }

        public Builder setBuilderVersion(String builderVersion) {
            this.builderVersion = Objects.requireNonNull(builderVersion);
            return this;
        }

        public BuildNoteResponse build() {
            return new BuildNoteResponse(builderVersion);
        }
    }
}