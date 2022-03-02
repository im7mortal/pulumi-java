// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.dialogflow_v2beta1.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import java.lang.String;
import java.util.Objects;

@OutputCustomType
public final class GoogleCloudDialogflowV2beta1IntentMessageSimpleResponseResponse {
    /**
     * Optional. The text to display.
     * 
     */
    private final String displayText;
    /**
     * One of text_to_speech or ssml must be provided. Structured spoken response to the user in the SSML format. Mutually exclusive with text_to_speech.
     * 
     */
    private final String ssml;
    /**
     * One of text_to_speech or ssml must be provided. The plain text of the speech output. Mutually exclusive with ssml.
     * 
     */
    private final String textToSpeech;

    @OutputCustomType.Constructor({"displayText","ssml","textToSpeech"})
    private GoogleCloudDialogflowV2beta1IntentMessageSimpleResponseResponse(
        String displayText,
        String ssml,
        String textToSpeech) {
        this.displayText = Objects.requireNonNull(displayText);
        this.ssml = Objects.requireNonNull(ssml);
        this.textToSpeech = Objects.requireNonNull(textToSpeech);
    }

    /**
     * Optional. The text to display.
     * 
    */
    public String getDisplayText() {
        return this.displayText;
    }
    /**
     * One of text_to_speech or ssml must be provided. Structured spoken response to the user in the SSML format. Mutually exclusive with text_to_speech.
     * 
    */
    public String getSsml() {
        return this.ssml;
    }
    /**
     * One of text_to_speech or ssml must be provided. The plain text of the speech output. Mutually exclusive with ssml.
     * 
    */
    public String getTextToSpeech() {
        return this.textToSpeech;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GoogleCloudDialogflowV2beta1IntentMessageSimpleResponseResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String displayText;
        private String ssml;
        private String textToSpeech;

        public Builder() {
    	      // Empty
        }

        public Builder(GoogleCloudDialogflowV2beta1IntentMessageSimpleResponseResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.displayText = defaults.displayText;
    	      this.ssml = defaults.ssml;
    	      this.textToSpeech = defaults.textToSpeech;
        }

        public Builder setDisplayText(String displayText) {
            this.displayText = Objects.requireNonNull(displayText);
            return this;
        }

        public Builder setSsml(String ssml) {
            this.ssml = Objects.requireNonNull(ssml);
            return this;
        }

        public Builder setTextToSpeech(String textToSpeech) {
            this.textToSpeech = Objects.requireNonNull(textToSpeech);
            return this;
        }
        public GoogleCloudDialogflowV2beta1IntentMessageSimpleResponseResponse build() {
            return new GoogleCloudDialogflowV2beta1IntentMessageSimpleResponseResponse(displayText, ssml, textToSpeech);
        }
    }
}
