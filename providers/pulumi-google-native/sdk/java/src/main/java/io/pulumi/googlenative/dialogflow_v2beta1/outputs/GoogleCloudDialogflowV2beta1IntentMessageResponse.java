// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.dialogflow_v2beta1.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import io.pulumi.googlenative.dialogflow_v2beta1.outputs.GoogleCloudDialogflowV2beta1IntentMessageBasicCardResponse;
import io.pulumi.googlenative.dialogflow_v2beta1.outputs.GoogleCloudDialogflowV2beta1IntentMessageBrowseCarouselCardResponse;
import io.pulumi.googlenative.dialogflow_v2beta1.outputs.GoogleCloudDialogflowV2beta1IntentMessageCardResponse;
import io.pulumi.googlenative.dialogflow_v2beta1.outputs.GoogleCloudDialogflowV2beta1IntentMessageCarouselSelectResponse;
import io.pulumi.googlenative.dialogflow_v2beta1.outputs.GoogleCloudDialogflowV2beta1IntentMessageImageResponse;
import io.pulumi.googlenative.dialogflow_v2beta1.outputs.GoogleCloudDialogflowV2beta1IntentMessageLinkOutSuggestionResponse;
import io.pulumi.googlenative.dialogflow_v2beta1.outputs.GoogleCloudDialogflowV2beta1IntentMessageListSelectResponse;
import io.pulumi.googlenative.dialogflow_v2beta1.outputs.GoogleCloudDialogflowV2beta1IntentMessageMediaContentResponse;
import io.pulumi.googlenative.dialogflow_v2beta1.outputs.GoogleCloudDialogflowV2beta1IntentMessageQuickRepliesResponse;
import io.pulumi.googlenative.dialogflow_v2beta1.outputs.GoogleCloudDialogflowV2beta1IntentMessageRbmCarouselCardResponse;
import io.pulumi.googlenative.dialogflow_v2beta1.outputs.GoogleCloudDialogflowV2beta1IntentMessageRbmStandaloneCardResponse;
import io.pulumi.googlenative.dialogflow_v2beta1.outputs.GoogleCloudDialogflowV2beta1IntentMessageRbmTextResponse;
import io.pulumi.googlenative.dialogflow_v2beta1.outputs.GoogleCloudDialogflowV2beta1IntentMessageSimpleResponsesResponse;
import io.pulumi.googlenative.dialogflow_v2beta1.outputs.GoogleCloudDialogflowV2beta1IntentMessageSuggestionsResponse;
import io.pulumi.googlenative.dialogflow_v2beta1.outputs.GoogleCloudDialogflowV2beta1IntentMessageTableCardResponse;
import io.pulumi.googlenative.dialogflow_v2beta1.outputs.GoogleCloudDialogflowV2beta1IntentMessageTelephonyPlayAudioResponse;
import io.pulumi.googlenative.dialogflow_v2beta1.outputs.GoogleCloudDialogflowV2beta1IntentMessageTelephonySynthesizeSpeechResponse;
import io.pulumi.googlenative.dialogflow_v2beta1.outputs.GoogleCloudDialogflowV2beta1IntentMessageTelephonyTransferCallResponse;
import io.pulumi.googlenative.dialogflow_v2beta1.outputs.GoogleCloudDialogflowV2beta1IntentMessageTextResponse;
import java.lang.String;
import java.util.Map;
import java.util.Objects;

@OutputCustomType
public final class GoogleCloudDialogflowV2beta1IntentMessageResponse {
    /**
     * Displays a basic card for Actions on Google.
     * 
     */
    private final GoogleCloudDialogflowV2beta1IntentMessageBasicCardResponse basicCard;
    /**
     * Browse carousel card for Actions on Google.
     * 
     */
    private final GoogleCloudDialogflowV2beta1IntentMessageBrowseCarouselCardResponse browseCarouselCard;
    /**
     * Displays a card.
     * 
     */
    private final GoogleCloudDialogflowV2beta1IntentMessageCardResponse card;
    /**
     * Displays a carousel card for Actions on Google.
     * 
     */
    private final GoogleCloudDialogflowV2beta1IntentMessageCarouselSelectResponse carouselSelect;
    /**
     * Displays an image.
     * 
     */
    private final GoogleCloudDialogflowV2beta1IntentMessageImageResponse image;
    /**
     * Displays a link out suggestion chip for Actions on Google.
     * 
     */
    private final GoogleCloudDialogflowV2beta1IntentMessageLinkOutSuggestionResponse linkOutSuggestion;
    /**
     * Displays a list card for Actions on Google.
     * 
     */
    private final GoogleCloudDialogflowV2beta1IntentMessageListSelectResponse listSelect;
    /**
     * The media content card for Actions on Google.
     * 
     */
    private final GoogleCloudDialogflowV2beta1IntentMessageMediaContentResponse mediaContent;
    /**
     * A custom platform-specific response.
     * 
     */
    private final Map<String,String> payload;
    /**
     * Optional. The platform that this message is intended for.
     * 
     */
    private final String platform;
    /**
     * Displays quick replies.
     * 
     */
    private final GoogleCloudDialogflowV2beta1IntentMessageQuickRepliesResponse quickReplies;
    /**
     * Rich Business Messaging (RBM) carousel rich card response.
     * 
     */
    private final GoogleCloudDialogflowV2beta1IntentMessageRbmCarouselCardResponse rbmCarouselRichCard;
    /**
     * Standalone Rich Business Messaging (RBM) rich card response.
     * 
     */
    private final GoogleCloudDialogflowV2beta1IntentMessageRbmStandaloneCardResponse rbmStandaloneRichCard;
    /**
     * Rich Business Messaging (RBM) text response. RBM allows businesses to send enriched and branded versions of SMS. See https://jibe.google.com/business-messaging.
     * 
     */
    private final GoogleCloudDialogflowV2beta1IntentMessageRbmTextResponse rbmText;
    /**
     * Returns a voice or text-only response for Actions on Google.
     * 
     */
    private final GoogleCloudDialogflowV2beta1IntentMessageSimpleResponsesResponse simpleResponses;
    /**
     * Displays suggestion chips for Actions on Google.
     * 
     */
    private final GoogleCloudDialogflowV2beta1IntentMessageSuggestionsResponse suggestions;
    /**
     * Table card for Actions on Google.
     * 
     */
    private final GoogleCloudDialogflowV2beta1IntentMessageTableCardResponse tableCard;
    /**
     * Plays audio from a file in Telephony Gateway.
     * 
     */
    private final GoogleCloudDialogflowV2beta1IntentMessageTelephonyPlayAudioResponse telephonyPlayAudio;
    /**
     * Synthesizes speech in Telephony Gateway.
     * 
     */
    private final GoogleCloudDialogflowV2beta1IntentMessageTelephonySynthesizeSpeechResponse telephonySynthesizeSpeech;
    /**
     * Transfers the call in Telephony Gateway.
     * 
     */
    private final GoogleCloudDialogflowV2beta1IntentMessageTelephonyTransferCallResponse telephonyTransferCall;
    /**
     * Returns a text response.
     * 
     */
    private final GoogleCloudDialogflowV2beta1IntentMessageTextResponse text;

    @OutputCustomType.Constructor({"basicCard","browseCarouselCard","card","carouselSelect","image","linkOutSuggestion","listSelect","mediaContent","payload","platform","quickReplies","rbmCarouselRichCard","rbmStandaloneRichCard","rbmText","simpleResponses","suggestions","tableCard","telephonyPlayAudio","telephonySynthesizeSpeech","telephonyTransferCall","text"})
    private GoogleCloudDialogflowV2beta1IntentMessageResponse(
        GoogleCloudDialogflowV2beta1IntentMessageBasicCardResponse basicCard,
        GoogleCloudDialogflowV2beta1IntentMessageBrowseCarouselCardResponse browseCarouselCard,
        GoogleCloudDialogflowV2beta1IntentMessageCardResponse card,
        GoogleCloudDialogflowV2beta1IntentMessageCarouselSelectResponse carouselSelect,
        GoogleCloudDialogflowV2beta1IntentMessageImageResponse image,
        GoogleCloudDialogflowV2beta1IntentMessageLinkOutSuggestionResponse linkOutSuggestion,
        GoogleCloudDialogflowV2beta1IntentMessageListSelectResponse listSelect,
        GoogleCloudDialogflowV2beta1IntentMessageMediaContentResponse mediaContent,
        Map<String,String> payload,
        String platform,
        GoogleCloudDialogflowV2beta1IntentMessageQuickRepliesResponse quickReplies,
        GoogleCloudDialogflowV2beta1IntentMessageRbmCarouselCardResponse rbmCarouselRichCard,
        GoogleCloudDialogflowV2beta1IntentMessageRbmStandaloneCardResponse rbmStandaloneRichCard,
        GoogleCloudDialogflowV2beta1IntentMessageRbmTextResponse rbmText,
        GoogleCloudDialogflowV2beta1IntentMessageSimpleResponsesResponse simpleResponses,
        GoogleCloudDialogflowV2beta1IntentMessageSuggestionsResponse suggestions,
        GoogleCloudDialogflowV2beta1IntentMessageTableCardResponse tableCard,
        GoogleCloudDialogflowV2beta1IntentMessageTelephonyPlayAudioResponse telephonyPlayAudio,
        GoogleCloudDialogflowV2beta1IntentMessageTelephonySynthesizeSpeechResponse telephonySynthesizeSpeech,
        GoogleCloudDialogflowV2beta1IntentMessageTelephonyTransferCallResponse telephonyTransferCall,
        GoogleCloudDialogflowV2beta1IntentMessageTextResponse text) {
        this.basicCard = Objects.requireNonNull(basicCard);
        this.browseCarouselCard = Objects.requireNonNull(browseCarouselCard);
        this.card = Objects.requireNonNull(card);
        this.carouselSelect = Objects.requireNonNull(carouselSelect);
        this.image = Objects.requireNonNull(image);
        this.linkOutSuggestion = Objects.requireNonNull(linkOutSuggestion);
        this.listSelect = Objects.requireNonNull(listSelect);
        this.mediaContent = Objects.requireNonNull(mediaContent);
        this.payload = Objects.requireNonNull(payload);
        this.platform = Objects.requireNonNull(platform);
        this.quickReplies = Objects.requireNonNull(quickReplies);
        this.rbmCarouselRichCard = Objects.requireNonNull(rbmCarouselRichCard);
        this.rbmStandaloneRichCard = Objects.requireNonNull(rbmStandaloneRichCard);
        this.rbmText = Objects.requireNonNull(rbmText);
        this.simpleResponses = Objects.requireNonNull(simpleResponses);
        this.suggestions = Objects.requireNonNull(suggestions);
        this.tableCard = Objects.requireNonNull(tableCard);
        this.telephonyPlayAudio = Objects.requireNonNull(telephonyPlayAudio);
        this.telephonySynthesizeSpeech = Objects.requireNonNull(telephonySynthesizeSpeech);
        this.telephonyTransferCall = Objects.requireNonNull(telephonyTransferCall);
        this.text = Objects.requireNonNull(text);
    }

    /**
     * Displays a basic card for Actions on Google.
     * 
    */
    public GoogleCloudDialogflowV2beta1IntentMessageBasicCardResponse getBasicCard() {
        return this.basicCard;
    }
    /**
     * Browse carousel card for Actions on Google.
     * 
    */
    public GoogleCloudDialogflowV2beta1IntentMessageBrowseCarouselCardResponse getBrowseCarouselCard() {
        return this.browseCarouselCard;
    }
    /**
     * Displays a card.
     * 
    */
    public GoogleCloudDialogflowV2beta1IntentMessageCardResponse getCard() {
        return this.card;
    }
    /**
     * Displays a carousel card for Actions on Google.
     * 
    */
    public GoogleCloudDialogflowV2beta1IntentMessageCarouselSelectResponse getCarouselSelect() {
        return this.carouselSelect;
    }
    /**
     * Displays an image.
     * 
    */
    public GoogleCloudDialogflowV2beta1IntentMessageImageResponse getImage() {
        return this.image;
    }
    /**
     * Displays a link out suggestion chip for Actions on Google.
     * 
    */
    public GoogleCloudDialogflowV2beta1IntentMessageLinkOutSuggestionResponse getLinkOutSuggestion() {
        return this.linkOutSuggestion;
    }
    /**
     * Displays a list card for Actions on Google.
     * 
    */
    public GoogleCloudDialogflowV2beta1IntentMessageListSelectResponse getListSelect() {
        return this.listSelect;
    }
    /**
     * The media content card for Actions on Google.
     * 
    */
    public GoogleCloudDialogflowV2beta1IntentMessageMediaContentResponse getMediaContent() {
        return this.mediaContent;
    }
    /**
     * A custom platform-specific response.
     * 
    */
    public Map<String,String> getPayload() {
        return this.payload;
    }
    /**
     * Optional. The platform that this message is intended for.
     * 
    */
    public String getPlatform() {
        return this.platform;
    }
    /**
     * Displays quick replies.
     * 
    */
    public GoogleCloudDialogflowV2beta1IntentMessageQuickRepliesResponse getQuickReplies() {
        return this.quickReplies;
    }
    /**
     * Rich Business Messaging (RBM) carousel rich card response.
     * 
    */
    public GoogleCloudDialogflowV2beta1IntentMessageRbmCarouselCardResponse getRbmCarouselRichCard() {
        return this.rbmCarouselRichCard;
    }
    /**
     * Standalone Rich Business Messaging (RBM) rich card response.
     * 
    */
    public GoogleCloudDialogflowV2beta1IntentMessageRbmStandaloneCardResponse getRbmStandaloneRichCard() {
        return this.rbmStandaloneRichCard;
    }
    /**
     * Rich Business Messaging (RBM) text response. RBM allows businesses to send enriched and branded versions of SMS. See https://jibe.google.com/business-messaging.
     * 
    */
    public GoogleCloudDialogflowV2beta1IntentMessageRbmTextResponse getRbmText() {
        return this.rbmText;
    }
    /**
     * Returns a voice or text-only response for Actions on Google.
     * 
    */
    public GoogleCloudDialogflowV2beta1IntentMessageSimpleResponsesResponse getSimpleResponses() {
        return this.simpleResponses;
    }
    /**
     * Displays suggestion chips for Actions on Google.
     * 
    */
    public GoogleCloudDialogflowV2beta1IntentMessageSuggestionsResponse getSuggestions() {
        return this.suggestions;
    }
    /**
     * Table card for Actions on Google.
     * 
    */
    public GoogleCloudDialogflowV2beta1IntentMessageTableCardResponse getTableCard() {
        return this.tableCard;
    }
    /**
     * Plays audio from a file in Telephony Gateway.
     * 
    */
    public GoogleCloudDialogflowV2beta1IntentMessageTelephonyPlayAudioResponse getTelephonyPlayAudio() {
        return this.telephonyPlayAudio;
    }
    /**
     * Synthesizes speech in Telephony Gateway.
     * 
    */
    public GoogleCloudDialogflowV2beta1IntentMessageTelephonySynthesizeSpeechResponse getTelephonySynthesizeSpeech() {
        return this.telephonySynthesizeSpeech;
    }
    /**
     * Transfers the call in Telephony Gateway.
     * 
    */
    public GoogleCloudDialogflowV2beta1IntentMessageTelephonyTransferCallResponse getTelephonyTransferCall() {
        return this.telephonyTransferCall;
    }
    /**
     * Returns a text response.
     * 
    */
    public GoogleCloudDialogflowV2beta1IntentMessageTextResponse getText() {
        return this.text;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GoogleCloudDialogflowV2beta1IntentMessageResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GoogleCloudDialogflowV2beta1IntentMessageBasicCardResponse basicCard;
        private GoogleCloudDialogflowV2beta1IntentMessageBrowseCarouselCardResponse browseCarouselCard;
        private GoogleCloudDialogflowV2beta1IntentMessageCardResponse card;
        private GoogleCloudDialogflowV2beta1IntentMessageCarouselSelectResponse carouselSelect;
        private GoogleCloudDialogflowV2beta1IntentMessageImageResponse image;
        private GoogleCloudDialogflowV2beta1IntentMessageLinkOutSuggestionResponse linkOutSuggestion;
        private GoogleCloudDialogflowV2beta1IntentMessageListSelectResponse listSelect;
        private GoogleCloudDialogflowV2beta1IntentMessageMediaContentResponse mediaContent;
        private Map<String,String> payload;
        private String platform;
        private GoogleCloudDialogflowV2beta1IntentMessageQuickRepliesResponse quickReplies;
        private GoogleCloudDialogflowV2beta1IntentMessageRbmCarouselCardResponse rbmCarouselRichCard;
        private GoogleCloudDialogflowV2beta1IntentMessageRbmStandaloneCardResponse rbmStandaloneRichCard;
        private GoogleCloudDialogflowV2beta1IntentMessageRbmTextResponse rbmText;
        private GoogleCloudDialogflowV2beta1IntentMessageSimpleResponsesResponse simpleResponses;
        private GoogleCloudDialogflowV2beta1IntentMessageSuggestionsResponse suggestions;
        private GoogleCloudDialogflowV2beta1IntentMessageTableCardResponse tableCard;
        private GoogleCloudDialogflowV2beta1IntentMessageTelephonyPlayAudioResponse telephonyPlayAudio;
        private GoogleCloudDialogflowV2beta1IntentMessageTelephonySynthesizeSpeechResponse telephonySynthesizeSpeech;
        private GoogleCloudDialogflowV2beta1IntentMessageTelephonyTransferCallResponse telephonyTransferCall;
        private GoogleCloudDialogflowV2beta1IntentMessageTextResponse text;

        public Builder() {
    	      // Empty
        }

        public Builder(GoogleCloudDialogflowV2beta1IntentMessageResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.basicCard = defaults.basicCard;
    	      this.browseCarouselCard = defaults.browseCarouselCard;
    	      this.card = defaults.card;
    	      this.carouselSelect = defaults.carouselSelect;
    	      this.image = defaults.image;
    	      this.linkOutSuggestion = defaults.linkOutSuggestion;
    	      this.listSelect = defaults.listSelect;
    	      this.mediaContent = defaults.mediaContent;
    	      this.payload = defaults.payload;
    	      this.platform = defaults.platform;
    	      this.quickReplies = defaults.quickReplies;
    	      this.rbmCarouselRichCard = defaults.rbmCarouselRichCard;
    	      this.rbmStandaloneRichCard = defaults.rbmStandaloneRichCard;
    	      this.rbmText = defaults.rbmText;
    	      this.simpleResponses = defaults.simpleResponses;
    	      this.suggestions = defaults.suggestions;
    	      this.tableCard = defaults.tableCard;
    	      this.telephonyPlayAudio = defaults.telephonyPlayAudio;
    	      this.telephonySynthesizeSpeech = defaults.telephonySynthesizeSpeech;
    	      this.telephonyTransferCall = defaults.telephonyTransferCall;
    	      this.text = defaults.text;
        }

        public Builder setBasicCard(GoogleCloudDialogflowV2beta1IntentMessageBasicCardResponse basicCard) {
            this.basicCard = Objects.requireNonNull(basicCard);
            return this;
        }

        public Builder setBrowseCarouselCard(GoogleCloudDialogflowV2beta1IntentMessageBrowseCarouselCardResponse browseCarouselCard) {
            this.browseCarouselCard = Objects.requireNonNull(browseCarouselCard);
            return this;
        }

        public Builder setCard(GoogleCloudDialogflowV2beta1IntentMessageCardResponse card) {
            this.card = Objects.requireNonNull(card);
            return this;
        }

        public Builder setCarouselSelect(GoogleCloudDialogflowV2beta1IntentMessageCarouselSelectResponse carouselSelect) {
            this.carouselSelect = Objects.requireNonNull(carouselSelect);
            return this;
        }

        public Builder setImage(GoogleCloudDialogflowV2beta1IntentMessageImageResponse image) {
            this.image = Objects.requireNonNull(image);
            return this;
        }

        public Builder setLinkOutSuggestion(GoogleCloudDialogflowV2beta1IntentMessageLinkOutSuggestionResponse linkOutSuggestion) {
            this.linkOutSuggestion = Objects.requireNonNull(linkOutSuggestion);
            return this;
        }

        public Builder setListSelect(GoogleCloudDialogflowV2beta1IntentMessageListSelectResponse listSelect) {
            this.listSelect = Objects.requireNonNull(listSelect);
            return this;
        }

        public Builder setMediaContent(GoogleCloudDialogflowV2beta1IntentMessageMediaContentResponse mediaContent) {
            this.mediaContent = Objects.requireNonNull(mediaContent);
            return this;
        }

        public Builder setPayload(Map<String,String> payload) {
            this.payload = Objects.requireNonNull(payload);
            return this;
        }

        public Builder setPlatform(String platform) {
            this.platform = Objects.requireNonNull(platform);
            return this;
        }

        public Builder setQuickReplies(GoogleCloudDialogflowV2beta1IntentMessageQuickRepliesResponse quickReplies) {
            this.quickReplies = Objects.requireNonNull(quickReplies);
            return this;
        }

        public Builder setRbmCarouselRichCard(GoogleCloudDialogflowV2beta1IntentMessageRbmCarouselCardResponse rbmCarouselRichCard) {
            this.rbmCarouselRichCard = Objects.requireNonNull(rbmCarouselRichCard);
            return this;
        }

        public Builder setRbmStandaloneRichCard(GoogleCloudDialogflowV2beta1IntentMessageRbmStandaloneCardResponse rbmStandaloneRichCard) {
            this.rbmStandaloneRichCard = Objects.requireNonNull(rbmStandaloneRichCard);
            return this;
        }

        public Builder setRbmText(GoogleCloudDialogflowV2beta1IntentMessageRbmTextResponse rbmText) {
            this.rbmText = Objects.requireNonNull(rbmText);
            return this;
        }

        public Builder setSimpleResponses(GoogleCloudDialogflowV2beta1IntentMessageSimpleResponsesResponse simpleResponses) {
            this.simpleResponses = Objects.requireNonNull(simpleResponses);
            return this;
        }

        public Builder setSuggestions(GoogleCloudDialogflowV2beta1IntentMessageSuggestionsResponse suggestions) {
            this.suggestions = Objects.requireNonNull(suggestions);
            return this;
        }

        public Builder setTableCard(GoogleCloudDialogflowV2beta1IntentMessageTableCardResponse tableCard) {
            this.tableCard = Objects.requireNonNull(tableCard);
            return this;
        }

        public Builder setTelephonyPlayAudio(GoogleCloudDialogflowV2beta1IntentMessageTelephonyPlayAudioResponse telephonyPlayAudio) {
            this.telephonyPlayAudio = Objects.requireNonNull(telephonyPlayAudio);
            return this;
        }

        public Builder setTelephonySynthesizeSpeech(GoogleCloudDialogflowV2beta1IntentMessageTelephonySynthesizeSpeechResponse telephonySynthesizeSpeech) {
            this.telephonySynthesizeSpeech = Objects.requireNonNull(telephonySynthesizeSpeech);
            return this;
        }

        public Builder setTelephonyTransferCall(GoogleCloudDialogflowV2beta1IntentMessageTelephonyTransferCallResponse telephonyTransferCall) {
            this.telephonyTransferCall = Objects.requireNonNull(telephonyTransferCall);
            return this;
        }

        public Builder setText(GoogleCloudDialogflowV2beta1IntentMessageTextResponse text) {
            this.text = Objects.requireNonNull(text);
            return this;
        }
        public GoogleCloudDialogflowV2beta1IntentMessageResponse build() {
            return new GoogleCloudDialogflowV2beta1IntentMessageResponse(basicCard, browseCarouselCard, card, carouselSelect, image, linkOutSuggestion, listSelect, mediaContent, payload, platform, quickReplies, rbmCarouselRichCard, rbmStandaloneRichCard, rbmText, simpleResponses, suggestions, tableCard, telephonyPlayAudio, telephonySynthesizeSpeech, telephonyTransferCall, text);
        }
    }
}
