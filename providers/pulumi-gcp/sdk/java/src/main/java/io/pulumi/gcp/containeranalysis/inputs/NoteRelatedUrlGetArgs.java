// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.containeranalysis.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.internal.annotations.InputImport;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


public final class NoteRelatedUrlGetArgs extends io.pulumi.resources.ResourceArgs {

    public static final NoteRelatedUrlGetArgs Empty = new NoteRelatedUrlGetArgs();

    /**
     * Label to describe usage of the URL
     * 
     */
    @InputImport(name="label")
    private final @Nullable Input<String> label;

    public Input<String> getLabel() {
        return this.label == null ? Input.empty() : this.label;
    }

    /**
     * Specific URL associated with the resource.
     * 
     */
    @InputImport(name="url", required=true)
    private final Input<String> url;

    public Input<String> getUrl() {
        return this.url;
    }

    public NoteRelatedUrlGetArgs(
        @Nullable Input<String> label,
        Input<String> url) {
        this.label = label;
        this.url = Objects.requireNonNull(url, "expected parameter 'url' to be non-null");
    }

    private NoteRelatedUrlGetArgs() {
        this.label = Input.empty();
        this.url = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(NoteRelatedUrlGetArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<String> label;
        private Input<String> url;

        public Builder() {
    	      // Empty
        }

        public Builder(NoteRelatedUrlGetArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.label = defaults.label;
    	      this.url = defaults.url;
        }

        public Builder setLabel(@Nullable Input<String> label) {
            this.label = label;
            return this;
        }

        public Builder setLabel(@Nullable String label) {
            this.label = Input.ofNullable(label);
            return this;
        }

        public Builder setUrl(Input<String> url) {
            this.url = Objects.requireNonNull(url);
            return this;
        }

        public Builder setUrl(String url) {
            this.url = Input.of(Objects.requireNonNull(url));
            return this;
        }

        public NoteRelatedUrlGetArgs build() {
            return new NoteRelatedUrlGetArgs(label, url);
        }
    }
}