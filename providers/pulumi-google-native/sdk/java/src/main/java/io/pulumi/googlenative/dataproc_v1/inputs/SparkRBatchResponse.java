// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.dataproc_v1.inputs;

import io.pulumi.core.internal.annotations.InputImport;
import java.lang.String;
import java.util.List;
import java.util.Objects;


public final class SparkRBatchResponse extends io.pulumi.resources.InvokeArgs {

    public static final SparkRBatchResponse Empty = new SparkRBatchResponse();

    @InputImport(name="archiveUris", required=true)
    private final List<String> archiveUris;

    public List<String> getArchiveUris() {
        return this.archiveUris;
    }

    @InputImport(name="args", required=true)
    private final List<String> args;

    public List<String> getArgs() {
        return this.args;
    }

    @InputImport(name="fileUris", required=true)
    private final List<String> fileUris;

    public List<String> getFileUris() {
        return this.fileUris;
    }

    @InputImport(name="mainRFileUri", required=true)
    private final String mainRFileUri;

    public String getMainRFileUri() {
        return this.mainRFileUri;
    }

    public SparkRBatchResponse(
        List<String> archiveUris,
        List<String> args,
        List<String> fileUris,
        String mainRFileUri) {
        this.archiveUris = Objects.requireNonNull(archiveUris, "expected parameter 'archiveUris' to be non-null");
        this.args = Objects.requireNonNull(args, "expected parameter 'args' to be non-null");
        this.fileUris = Objects.requireNonNull(fileUris, "expected parameter 'fileUris' to be non-null");
        this.mainRFileUri = Objects.requireNonNull(mainRFileUri, "expected parameter 'mainRFileUri' to be non-null");
    }

    private SparkRBatchResponse() {
        this.archiveUris = List.of();
        this.args = List.of();
        this.fileUris = List.of();
        this.mainRFileUri = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(SparkRBatchResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private List<String> archiveUris;
        private List<String> args;
        private List<String> fileUris;
        private String mainRFileUri;

        public Builder() {
    	      // Empty
        }

        public Builder(SparkRBatchResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.archiveUris = defaults.archiveUris;
    	      this.args = defaults.args;
    	      this.fileUris = defaults.fileUris;
    	      this.mainRFileUri = defaults.mainRFileUri;
        }

        public Builder setArchiveUris(List<String> archiveUris) {
            this.archiveUris = Objects.requireNonNull(archiveUris);
            return this;
        }

        public Builder setArgs(List<String> args) {
            this.args = Objects.requireNonNull(args);
            return this;
        }

        public Builder setFileUris(List<String> fileUris) {
            this.fileUris = Objects.requireNonNull(fileUris);
            return this;
        }

        public Builder setMainRFileUri(String mainRFileUri) {
            this.mainRFileUri = Objects.requireNonNull(mainRFileUri);
            return this;
        }

        public SparkRBatchResponse build() {
            return new SparkRBatchResponse(archiveUris, args, fileUris, mainRFileUri);
        }
    }
}