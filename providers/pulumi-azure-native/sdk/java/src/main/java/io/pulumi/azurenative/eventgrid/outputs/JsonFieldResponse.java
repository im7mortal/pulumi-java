// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.eventgrid.outputs;

import io.pulumi.core.internal.annotations.OutputCustomType;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class JsonFieldResponse {
    private final @Nullable String sourceField;

    @OutputCustomType.Constructor({"sourceField"})
    private JsonFieldResponse(@Nullable String sourceField) {
        this.sourceField = sourceField;
    }

    public Optional<String> getSourceField() {
        return Optional.ofNullable(this.sourceField);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(JsonFieldResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String sourceField;

        public Builder() {
    	      // Empty
        }

        public Builder(JsonFieldResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.sourceField = defaults.sourceField;
        }

        public Builder setSourceField(@Nullable String sourceField) {
            this.sourceField = sourceField;
            return this;
        }

        public JsonFieldResponse build() {
            return new JsonFieldResponse(sourceField);
        }
    }
}