// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.contactcenterinsights_v1.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.internal.annotations.InputImport;
import java.lang.Boolean;
import java.util.Objects;
import javax.annotation.Nullable;


public final class GoogleCloudContactcenterinsightsV1ExactMatchConfigArgs extends io.pulumi.resources.ResourceArgs {

    public static final GoogleCloudContactcenterinsightsV1ExactMatchConfigArgs Empty = new GoogleCloudContactcenterinsightsV1ExactMatchConfigArgs();

    @InputImport(name="caseSensitive")
    private final @Nullable Input<Boolean> caseSensitive;

    public Input<Boolean> getCaseSensitive() {
        return this.caseSensitive == null ? Input.empty() : this.caseSensitive;
    }

    public GoogleCloudContactcenterinsightsV1ExactMatchConfigArgs(@Nullable Input<Boolean> caseSensitive) {
        this.caseSensitive = caseSensitive;
    }

    private GoogleCloudContactcenterinsightsV1ExactMatchConfigArgs() {
        this.caseSensitive = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GoogleCloudContactcenterinsightsV1ExactMatchConfigArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<Boolean> caseSensitive;

        public Builder() {
    	      // Empty
        }

        public Builder(GoogleCloudContactcenterinsightsV1ExactMatchConfigArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.caseSensitive = defaults.caseSensitive;
        }

        public Builder setCaseSensitive(@Nullable Input<Boolean> caseSensitive) {
            this.caseSensitive = caseSensitive;
            return this;
        }

        public Builder setCaseSensitive(@Nullable Boolean caseSensitive) {
            this.caseSensitive = Input.ofNullable(caseSensitive);
            return this;
        }

        public GoogleCloudContactcenterinsightsV1ExactMatchConfigArgs build() {
            return new GoogleCloudContactcenterinsightsV1ExactMatchConfigArgs(caseSensitive);
        }
    }
}