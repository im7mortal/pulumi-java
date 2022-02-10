// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.datafactory.inputs;

import io.pulumi.azurenative.datafactory.inputs.TarGZipReadSettingsArgs;
import io.pulumi.azurenative.datafactory.inputs.TarReadSettingsArgs;
import io.pulumi.azurenative.datafactory.inputs.ZipDeflateReadSettingsArgs;
import io.pulumi.core.Input;
import io.pulumi.core.internal.annotations.InputImport;
import java.lang.Object;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


public final class JsonReadSettingsArgs extends io.pulumi.resources.ResourceArgs {

    public static final JsonReadSettingsArgs Empty = new JsonReadSettingsArgs();

    @InputImport(name="compressionProperties")
    private final @Nullable Input<Object> compressionProperties;

    public Input<Object> getCompressionProperties() {
        return this.compressionProperties == null ? Input.empty() : this.compressionProperties;
    }

    @InputImport(name="type", required=true)
    private final Input<String> type;

    public Input<String> getType() {
        return this.type;
    }

    public JsonReadSettingsArgs(
        @Nullable Input<Object> compressionProperties,
        Input<String> type) {
        this.compressionProperties = compressionProperties;
        this.type = Objects.requireNonNull(type, "expected parameter 'type' to be non-null");
    }

    private JsonReadSettingsArgs() {
        this.compressionProperties = Input.empty();
        this.type = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(JsonReadSettingsArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<Object> compressionProperties;
        private Input<String> type;

        public Builder() {
    	      // Empty
        }

        public Builder(JsonReadSettingsArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.compressionProperties = defaults.compressionProperties;
    	      this.type = defaults.type;
        }

        public Builder setCompressionProperties(@Nullable Input<Object> compressionProperties) {
            this.compressionProperties = compressionProperties;
            return this;
        }

        public Builder setCompressionProperties(@Nullable Object compressionProperties) {
            this.compressionProperties = Input.ofNullable(compressionProperties);
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

        public JsonReadSettingsArgs build() {
            return new JsonReadSettingsArgs(compressionProperties, type);
        }
    }
}