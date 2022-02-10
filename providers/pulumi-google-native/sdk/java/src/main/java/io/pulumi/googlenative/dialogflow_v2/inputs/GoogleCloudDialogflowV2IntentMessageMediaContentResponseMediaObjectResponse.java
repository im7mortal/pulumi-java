// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.dialogflow_v2.inputs;

import io.pulumi.core.internal.annotations.InputImport;
import io.pulumi.googlenative.dialogflow_v2.inputs.GoogleCloudDialogflowV2IntentMessageImageResponse;
import java.lang.String;
import java.util.Objects;


public final class GoogleCloudDialogflowV2IntentMessageMediaContentResponseMediaObjectResponse extends io.pulumi.resources.InvokeArgs {

    public static final GoogleCloudDialogflowV2IntentMessageMediaContentResponseMediaObjectResponse Empty = new GoogleCloudDialogflowV2IntentMessageMediaContentResponseMediaObjectResponse();

    @InputImport(name="contentUrl", required=true)
    private final String contentUrl;

    public String getContentUrl() {
        return this.contentUrl;
    }

    @InputImport(name="description", required=true)
    private final String description;

    public String getDescription() {
        return this.description;
    }

    @InputImport(name="icon", required=true)
    private final GoogleCloudDialogflowV2IntentMessageImageResponse icon;

    public GoogleCloudDialogflowV2IntentMessageImageResponse getIcon() {
        return this.icon;
    }

    @InputImport(name="largeImage", required=true)
    private final GoogleCloudDialogflowV2IntentMessageImageResponse largeImage;

    public GoogleCloudDialogflowV2IntentMessageImageResponse getLargeImage() {
        return this.largeImage;
    }

    @InputImport(name="name", required=true)
    private final String name;

    public String getName() {
        return this.name;
    }

    public GoogleCloudDialogflowV2IntentMessageMediaContentResponseMediaObjectResponse(
        String contentUrl,
        String description,
        GoogleCloudDialogflowV2IntentMessageImageResponse icon,
        GoogleCloudDialogflowV2IntentMessageImageResponse largeImage,
        String name) {
        this.contentUrl = Objects.requireNonNull(contentUrl, "expected parameter 'contentUrl' to be non-null");
        this.description = Objects.requireNonNull(description, "expected parameter 'description' to be non-null");
        this.icon = Objects.requireNonNull(icon, "expected parameter 'icon' to be non-null");
        this.largeImage = Objects.requireNonNull(largeImage, "expected parameter 'largeImage' to be non-null");
        this.name = Objects.requireNonNull(name, "expected parameter 'name' to be non-null");
    }

    private GoogleCloudDialogflowV2IntentMessageMediaContentResponseMediaObjectResponse() {
        this.contentUrl = null;
        this.description = null;
        this.icon = null;
        this.largeImage = null;
        this.name = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GoogleCloudDialogflowV2IntentMessageMediaContentResponseMediaObjectResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String contentUrl;
        private String description;
        private GoogleCloudDialogflowV2IntentMessageImageResponse icon;
        private GoogleCloudDialogflowV2IntentMessageImageResponse largeImage;
        private String name;

        public Builder() {
    	      // Empty
        }

        public Builder(GoogleCloudDialogflowV2IntentMessageMediaContentResponseMediaObjectResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.contentUrl = defaults.contentUrl;
    	      this.description = defaults.description;
    	      this.icon = defaults.icon;
    	      this.largeImage = defaults.largeImage;
    	      this.name = defaults.name;
        }

        public Builder setContentUrl(String contentUrl) {
            this.contentUrl = Objects.requireNonNull(contentUrl);
            return this;
        }

        public Builder setDescription(String description) {
            this.description = Objects.requireNonNull(description);
            return this;
        }

        public Builder setIcon(GoogleCloudDialogflowV2IntentMessageImageResponse icon) {
            this.icon = Objects.requireNonNull(icon);
            return this;
        }

        public Builder setLargeImage(GoogleCloudDialogflowV2IntentMessageImageResponse largeImage) {
            this.largeImage = Objects.requireNonNull(largeImage);
            return this;
        }

        public Builder setName(String name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }

        public GoogleCloudDialogflowV2IntentMessageMediaContentResponseMediaObjectResponse build() {
            return new GoogleCloudDialogflowV2IntentMessageMediaContentResponseMediaObjectResponse(contentUrl, description, icon, largeImage, name);
        }
    }
}