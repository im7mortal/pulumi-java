// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.dialogflow_v2.outputs;

import io.pulumi.core.internal.annotations.OutputCustomType;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import java.util.Map;
import java.util.Objects;

@OutputCustomType
public final class GoogleCloudDialogflowV2TextToSpeechSettingsResponse {
    private final Boolean enableTextToSpeech;
    private final String outputAudioEncoding;
    private final Integer sampleRateHertz;
    private final Map<String,String> synthesizeSpeechConfigs;

    @OutputCustomType.Constructor({"enableTextToSpeech","outputAudioEncoding","sampleRateHertz","synthesizeSpeechConfigs"})
    private GoogleCloudDialogflowV2TextToSpeechSettingsResponse(
        Boolean enableTextToSpeech,
        String outputAudioEncoding,
        Integer sampleRateHertz,
        Map<String,String> synthesizeSpeechConfigs) {
        this.enableTextToSpeech = Objects.requireNonNull(enableTextToSpeech);
        this.outputAudioEncoding = Objects.requireNonNull(outputAudioEncoding);
        this.sampleRateHertz = Objects.requireNonNull(sampleRateHertz);
        this.synthesizeSpeechConfigs = Objects.requireNonNull(synthesizeSpeechConfigs);
    }

    public Boolean getEnableTextToSpeech() {
        return this.enableTextToSpeech;
    }
    public String getOutputAudioEncoding() {
        return this.outputAudioEncoding;
    }
    public Integer getSampleRateHertz() {
        return this.sampleRateHertz;
    }
    public Map<String,String> getSynthesizeSpeechConfigs() {
        return this.synthesizeSpeechConfigs;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GoogleCloudDialogflowV2TextToSpeechSettingsResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Boolean enableTextToSpeech;
        private String outputAudioEncoding;
        private Integer sampleRateHertz;
        private Map<String,String> synthesizeSpeechConfigs;

        public Builder() {
    	      // Empty
        }

        public Builder(GoogleCloudDialogflowV2TextToSpeechSettingsResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.enableTextToSpeech = defaults.enableTextToSpeech;
    	      this.outputAudioEncoding = defaults.outputAudioEncoding;
    	      this.sampleRateHertz = defaults.sampleRateHertz;
    	      this.synthesizeSpeechConfigs = defaults.synthesizeSpeechConfigs;
        }

        public Builder setEnableTextToSpeech(Boolean enableTextToSpeech) {
            this.enableTextToSpeech = Objects.requireNonNull(enableTextToSpeech);
            return this;
        }

        public Builder setOutputAudioEncoding(String outputAudioEncoding) {
            this.outputAudioEncoding = Objects.requireNonNull(outputAudioEncoding);
            return this;
        }

        public Builder setSampleRateHertz(Integer sampleRateHertz) {
            this.sampleRateHertz = Objects.requireNonNull(sampleRateHertz);
            return this;
        }

        public Builder setSynthesizeSpeechConfigs(Map<String,String> synthesizeSpeechConfigs) {
            this.synthesizeSpeechConfigs = Objects.requireNonNull(synthesizeSpeechConfigs);
            return this;
        }

        public GoogleCloudDialogflowV2TextToSpeechSettingsResponse build() {
            return new GoogleCloudDialogflowV2TextToSpeechSettingsResponse(enableTextToSpeech, outputAudioEncoding, sampleRateHertz, synthesizeSpeechConfigs);
        }
    }
}