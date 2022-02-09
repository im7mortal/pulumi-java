// *** WARNING: this file was generated by test. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.mypkg.outputs;

import io.pulumi.core.internal.annotations.OutputCustomType;
import io.pulumi.mypkg.outputs.SsisEnvironmentResponse;
import io.pulumi.mypkg.outputs.SsisFolderResponse;
import io.pulumi.mypkg.outputs.SsisPackageResponse;
import io.pulumi.mypkg.outputs.SsisProjectResponse;
import java.lang.Object;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class GetIntegrationRuntimeObjectMetadatumResult {
    private final @Nullable String nextLink;
    private final @Nullable List<Object> value;

    @OutputCustomType.Constructor({"nextLink","value"})
    private GetIntegrationRuntimeObjectMetadatumResult(
        @Nullable String nextLink,
        @Nullable List<Object> value) {
        this.nextLink = nextLink;
        this.value = value;
    }

    public Optional<String> getNextLink() {
        return Optional.ofNullable(this.nextLink);
    }
    public List<Object> getValue() {
        return this.value == null ? List.of() : this.value;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetIntegrationRuntimeObjectMetadatumResult defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String nextLink;
        private @Nullable List<Object> value;

        public Builder() {
    	      // Empty
        }

        public Builder(GetIntegrationRuntimeObjectMetadatumResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.nextLink = defaults.nextLink;
    	      this.value = defaults.value;
        }

        public Builder setNextLink(@Nullable String nextLink) {
            this.nextLink = nextLink;
            return this;
        }

        public Builder setValue(@Nullable List<Object> value) {
            this.value = value;
            return this;
        }

        public GetIntegrationRuntimeObjectMetadatumResult build() {
            return new GetIntegrationRuntimeObjectMetadatumResult(nextLink, value);
        }
    }
}
