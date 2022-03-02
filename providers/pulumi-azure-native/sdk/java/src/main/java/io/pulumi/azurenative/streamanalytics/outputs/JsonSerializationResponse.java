// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.streamanalytics.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class JsonSerializationResponse {
    /**
     * Specifies the encoding of the incoming data in the case of input and the encoding of outgoing data in the case of output. Required on PUT (CreateOrReplace) requests.
     * 
     */
    private final @Nullable String encoding;
    /**
     * This property only applies to JSON serialization of outputs only. It is not applicable to inputs. This property specifies the format of the JSON the output will be written in. The currently supported values are 'lineSeparated' indicating the output will be formatted by having each JSON object separated by a new line and 'array' indicating the output will be formatted as an array of JSON objects. Default value is 'lineSeparated' if left null.
     * 
     */
    private final @Nullable String format;
    /**
     * Indicates the type of serialization that the input or output uses. Required on PUT (CreateOrReplace) requests.
     * Expected value is 'Json'.
     * 
     */
    private final String type;

    @OutputCustomType.Constructor({"encoding","format","type"})
    private JsonSerializationResponse(
        @Nullable String encoding,
        @Nullable String format,
        String type) {
        this.encoding = encoding;
        this.format = format;
        this.type = Objects.requireNonNull(type);
    }

    /**
     * Specifies the encoding of the incoming data in the case of input and the encoding of outgoing data in the case of output. Required on PUT (CreateOrReplace) requests.
     * 
    */
    public Optional<String> getEncoding() {
        return Optional.ofNullable(this.encoding);
    }
    /**
     * This property only applies to JSON serialization of outputs only. It is not applicable to inputs. This property specifies the format of the JSON the output will be written in. The currently supported values are 'lineSeparated' indicating the output will be formatted by having each JSON object separated by a new line and 'array' indicating the output will be formatted as an array of JSON objects. Default value is 'lineSeparated' if left null.
     * 
    */
    public Optional<String> getFormat() {
        return Optional.ofNullable(this.format);
    }
    /**
     * Indicates the type of serialization that the input or output uses. Required on PUT (CreateOrReplace) requests.
     * Expected value is 'Json'.
     * 
    */
    public String getType() {
        return this.type;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(JsonSerializationResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String encoding;
        private @Nullable String format;
        private String type;

        public Builder() {
    	      // Empty
        }

        public Builder(JsonSerializationResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.encoding = defaults.encoding;
    	      this.format = defaults.format;
    	      this.type = defaults.type;
        }

        public Builder setEncoding(@Nullable String encoding) {
            this.encoding = encoding;
            return this;
        }

        public Builder setFormat(@Nullable String format) {
            this.format = format;
            return this;
        }

        public Builder setType(String type) {
            this.type = Objects.requireNonNull(type);
            return this;
        }
        public JsonSerializationResponse build() {
            return new JsonSerializationResponse(encoding, format, type);
        }
    }
}
