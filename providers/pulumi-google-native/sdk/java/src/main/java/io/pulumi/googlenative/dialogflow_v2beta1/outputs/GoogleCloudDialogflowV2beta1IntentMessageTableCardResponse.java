// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.dialogflow_v2beta1.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import io.pulumi.googlenative.dialogflow_v2beta1.outputs.GoogleCloudDialogflowV2beta1IntentMessageBasicCardButtonResponse;
import io.pulumi.googlenative.dialogflow_v2beta1.outputs.GoogleCloudDialogflowV2beta1IntentMessageColumnPropertiesResponse;
import io.pulumi.googlenative.dialogflow_v2beta1.outputs.GoogleCloudDialogflowV2beta1IntentMessageImageResponse;
import io.pulumi.googlenative.dialogflow_v2beta1.outputs.GoogleCloudDialogflowV2beta1IntentMessageTableCardRowResponse;
import java.lang.String;
import java.util.List;
import java.util.Objects;

@OutputCustomType
public final class GoogleCloudDialogflowV2beta1IntentMessageTableCardResponse {
    /**
     * Optional. List of buttons for the card.
     * 
     */
    private final List<GoogleCloudDialogflowV2beta1IntentMessageBasicCardButtonResponse> buttons;
    /**
     * Optional. Display properties for the columns in this table.
     * 
     */
    private final List<GoogleCloudDialogflowV2beta1IntentMessageColumnPropertiesResponse> columnProperties;
    /**
     * Optional. Image which should be displayed on the card.
     * 
     */
    private final GoogleCloudDialogflowV2beta1IntentMessageImageResponse image;
    /**
     * Optional. Rows in this table of data.
     * 
     */
    private final List<GoogleCloudDialogflowV2beta1IntentMessageTableCardRowResponse> rows;
    /**
     * Optional. Subtitle to the title.
     * 
     */
    private final String subtitle;
    /**
     * Title of the card.
     * 
     */
    private final String title;

    @OutputCustomType.Constructor({"buttons","columnProperties","image","rows","subtitle","title"})
    private GoogleCloudDialogflowV2beta1IntentMessageTableCardResponse(
        List<GoogleCloudDialogflowV2beta1IntentMessageBasicCardButtonResponse> buttons,
        List<GoogleCloudDialogflowV2beta1IntentMessageColumnPropertiesResponse> columnProperties,
        GoogleCloudDialogflowV2beta1IntentMessageImageResponse image,
        List<GoogleCloudDialogflowV2beta1IntentMessageTableCardRowResponse> rows,
        String subtitle,
        String title) {
        this.buttons = Objects.requireNonNull(buttons);
        this.columnProperties = Objects.requireNonNull(columnProperties);
        this.image = Objects.requireNonNull(image);
        this.rows = Objects.requireNonNull(rows);
        this.subtitle = Objects.requireNonNull(subtitle);
        this.title = Objects.requireNonNull(title);
    }

    /**
     * Optional. List of buttons for the card.
     * 
    */
    public List<GoogleCloudDialogflowV2beta1IntentMessageBasicCardButtonResponse> getButtons() {
        return this.buttons;
    }
    /**
     * Optional. Display properties for the columns in this table.
     * 
    */
    public List<GoogleCloudDialogflowV2beta1IntentMessageColumnPropertiesResponse> getColumnProperties() {
        return this.columnProperties;
    }
    /**
     * Optional. Image which should be displayed on the card.
     * 
    */
    public GoogleCloudDialogflowV2beta1IntentMessageImageResponse getImage() {
        return this.image;
    }
    /**
     * Optional. Rows in this table of data.
     * 
    */
    public List<GoogleCloudDialogflowV2beta1IntentMessageTableCardRowResponse> getRows() {
        return this.rows;
    }
    /**
     * Optional. Subtitle to the title.
     * 
    */
    public String getSubtitle() {
        return this.subtitle;
    }
    /**
     * Title of the card.
     * 
    */
    public String getTitle() {
        return this.title;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GoogleCloudDialogflowV2beta1IntentMessageTableCardResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private List<GoogleCloudDialogflowV2beta1IntentMessageBasicCardButtonResponse> buttons;
        private List<GoogleCloudDialogflowV2beta1IntentMessageColumnPropertiesResponse> columnProperties;
        private GoogleCloudDialogflowV2beta1IntentMessageImageResponse image;
        private List<GoogleCloudDialogflowV2beta1IntentMessageTableCardRowResponse> rows;
        private String subtitle;
        private String title;

        public Builder() {
    	      // Empty
        }

        public Builder(GoogleCloudDialogflowV2beta1IntentMessageTableCardResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.buttons = defaults.buttons;
    	      this.columnProperties = defaults.columnProperties;
    	      this.image = defaults.image;
    	      this.rows = defaults.rows;
    	      this.subtitle = defaults.subtitle;
    	      this.title = defaults.title;
        }

        public Builder setButtons(List<GoogleCloudDialogflowV2beta1IntentMessageBasicCardButtonResponse> buttons) {
            this.buttons = Objects.requireNonNull(buttons);
            return this;
        }

        public Builder setColumnProperties(List<GoogleCloudDialogflowV2beta1IntentMessageColumnPropertiesResponse> columnProperties) {
            this.columnProperties = Objects.requireNonNull(columnProperties);
            return this;
        }

        public Builder setImage(GoogleCloudDialogflowV2beta1IntentMessageImageResponse image) {
            this.image = Objects.requireNonNull(image);
            return this;
        }

        public Builder setRows(List<GoogleCloudDialogflowV2beta1IntentMessageTableCardRowResponse> rows) {
            this.rows = Objects.requireNonNull(rows);
            return this;
        }

        public Builder setSubtitle(String subtitle) {
            this.subtitle = Objects.requireNonNull(subtitle);
            return this;
        }

        public Builder setTitle(String title) {
            this.title = Objects.requireNonNull(title);
            return this;
        }
        public GoogleCloudDialogflowV2beta1IntentMessageTableCardResponse build() {
            return new GoogleCloudDialogflowV2beta1IntentMessageTableCardResponse(buttons, columnProperties, image, rows, subtitle, title);
        }
    }
}
