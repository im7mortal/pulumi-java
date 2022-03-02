// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.glue.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class GetSchemaVersionResult {
    /**
     * Represents the version ID associated with the schema version.
     * 
     */
    private final @Nullable String versionId;

    @OutputCustomType.Constructor({"versionId"})
    private GetSchemaVersionResult(@Nullable String versionId) {
        this.versionId = versionId;
    }

    /**
     * Represents the version ID associated with the schema version.
     * 
    */
    public Optional<String> getVersionId() {
        return Optional.ofNullable(this.versionId);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetSchemaVersionResult defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String versionId;

        public Builder() {
    	      // Empty
        }

        public Builder(GetSchemaVersionResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.versionId = defaults.versionId;
        }

        public Builder setVersionId(@Nullable String versionId) {
            this.versionId = versionId;
            return this;
        }
        public GetSchemaVersionResult build() {
            return new GetSchemaVersionResult(versionId);
        }
    }
}
