// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.dialogflow_v2beta1.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import java.lang.String;
import java.util.Objects;

@OutputCustomType
public final class GoogleCloudDialogflowV2beta1IntentMessageBasicCardButtonOpenUriActionResponse {
    /**
     * The HTTP or HTTPS scheme URI.
     * 
     */
    private final String uri;

    @OutputCustomType.Constructor({"uri"})
    private GoogleCloudDialogflowV2beta1IntentMessageBasicCardButtonOpenUriActionResponse(String uri) {
        this.uri = Objects.requireNonNull(uri);
    }

    /**
     * The HTTP or HTTPS scheme URI.
     * 
    */
    public String getUri() {
        return this.uri;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GoogleCloudDialogflowV2beta1IntentMessageBasicCardButtonOpenUriActionResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String uri;

        public Builder() {
    	      // Empty
        }

        public Builder(GoogleCloudDialogflowV2beta1IntentMessageBasicCardButtonOpenUriActionResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.uri = defaults.uri;
        }

        public Builder setUri(String uri) {
            this.uri = Objects.requireNonNull(uri);
            return this;
        }
        public GoogleCloudDialogflowV2beta1IntentMessageBasicCardButtonOpenUriActionResponse build() {
            return new GoogleCloudDialogflowV2beta1IntentMessageBasicCardButtonOpenUriActionResponse(uri);
        }
    }
}
