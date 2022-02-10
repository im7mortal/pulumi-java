// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.databoxedge.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.internal.annotations.InputImport;
import java.lang.String;
import java.util.Objects;


public final class FileSourceInfoArgs extends io.pulumi.resources.ResourceArgs {

    public static final FileSourceInfoArgs Empty = new FileSourceInfoArgs();

    @InputImport(name="shareId", required=true)
    private final Input<String> shareId;

    public Input<String> getShareId() {
        return this.shareId;
    }

    public FileSourceInfoArgs(Input<String> shareId) {
        this.shareId = Objects.requireNonNull(shareId, "expected parameter 'shareId' to be non-null");
    }

    private FileSourceInfoArgs() {
        this.shareId = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(FileSourceInfoArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Input<String> shareId;

        public Builder() {
    	      // Empty
        }

        public Builder(FileSourceInfoArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.shareId = defaults.shareId;
        }

        public Builder setShareId(Input<String> shareId) {
            this.shareId = Objects.requireNonNull(shareId);
            return this;
        }

        public Builder setShareId(String shareId) {
            this.shareId = Input.of(Objects.requireNonNull(shareId));
            return this;
        }

        public FileSourceInfoArgs build() {
            return new FileSourceInfoArgs(shareId);
        }
    }
}