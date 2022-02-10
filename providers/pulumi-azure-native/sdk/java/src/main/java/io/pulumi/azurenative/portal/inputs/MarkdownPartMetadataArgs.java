// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.portal.inputs;

import io.pulumi.azurenative.portal.inputs.MarkdownPartMetadataSettingsArgs;
import io.pulumi.core.Input;
import io.pulumi.core.internal.annotations.InputImport;
import java.lang.Object;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;


public final class MarkdownPartMetadataArgs extends io.pulumi.resources.ResourceArgs {

    public static final MarkdownPartMetadataArgs Empty = new MarkdownPartMetadataArgs();

    @InputImport(name="inputs")
    private final @Nullable Input<List<Object>> inputs;

    public Input<List<Object>> getInputs() {
        return this.inputs == null ? Input.empty() : this.inputs;
    }

    @InputImport(name="settings")
    private final @Nullable Input<MarkdownPartMetadataSettingsArgs> settings;

    public Input<MarkdownPartMetadataSettingsArgs> getSettings() {
        return this.settings == null ? Input.empty() : this.settings;
    }

    @InputImport(name="type", required=true)
    private final Input<String> type;

    public Input<String> getType() {
        return this.type;
    }

    public MarkdownPartMetadataArgs(
        @Nullable Input<List<Object>> inputs,
        @Nullable Input<MarkdownPartMetadataSettingsArgs> settings,
        Input<String> type) {
        this.inputs = inputs;
        this.settings = settings;
        this.type = Objects.requireNonNull(type, "expected parameter 'type' to be non-null");
    }

    private MarkdownPartMetadataArgs() {
        this.inputs = Input.empty();
        this.settings = Input.empty();
        this.type = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(MarkdownPartMetadataArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<List<Object>> inputs;
        private @Nullable Input<MarkdownPartMetadataSettingsArgs> settings;
        private Input<String> type;

        public Builder() {
    	      // Empty
        }

        public Builder(MarkdownPartMetadataArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.inputs = defaults.inputs;
    	      this.settings = defaults.settings;
    	      this.type = defaults.type;
        }

        public Builder setInputs(@Nullable Input<List<Object>> inputs) {
            this.inputs = inputs;
            return this;
        }

        public Builder setInputs(@Nullable List<Object> inputs) {
            this.inputs = Input.ofNullable(inputs);
            return this;
        }

        public Builder setSettings(@Nullable Input<MarkdownPartMetadataSettingsArgs> settings) {
            this.settings = settings;
            return this;
        }

        public Builder setSettings(@Nullable MarkdownPartMetadataSettingsArgs settings) {
            this.settings = Input.ofNullable(settings);
            return this;
        }

        public Builder setType(Input<String> type) {
            this.type = Objects.requireNonNull(type);
            return this;
        }

        public Builder setType(String type) {
            this.type = Input.of(Objects.requireNonNull(type));
            return this;
        }

        public MarkdownPartMetadataArgs build() {
            return new MarkdownPartMetadataArgs(inputs, settings, type);
        }
    }
}