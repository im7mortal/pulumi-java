// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.translate_v3.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import io.pulumi.googlenative.translate_v3.outputs.GlossaryInputConfigResponse;
import io.pulumi.googlenative.translate_v3.outputs.LanguageCodePairResponse;
import io.pulumi.googlenative.translate_v3.outputs.LanguageCodesSetResponse;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;

@OutputCustomType
public final class GetGlossaryResult {
    /**
     * When the glossary creation was finished.
     * 
     */
    private final String endTime;
    /**
     * The number of entries defined in the glossary.
     * 
     */
    private final Integer entryCount;
    /**
     * Provides examples to build the glossary from. Total glossary must not exceed 10M Unicode codepoints.
     * 
     */
    private final GlossaryInputConfigResponse inputConfig;
    /**
     * Used with equivalent term set glossaries.
     * 
     */
    private final LanguageCodesSetResponse languageCodesSet;
    /**
     * Used with unidirectional glossaries.
     * 
     */
    private final LanguageCodePairResponse languagePair;
    /**
     * The resource name of the glossary. Glossary names have the form `projects/{project-number-or-id}/locations/{location-id}/glossaries/{glossary-id}`.
     * 
     */
    private final String name;
    /**
     * When CreateGlossary was called.
     * 
     */
    private final String submitTime;

    @OutputCustomType.Constructor({"endTime","entryCount","inputConfig","languageCodesSet","languagePair","name","submitTime"})
    private GetGlossaryResult(
        String endTime,
        Integer entryCount,
        GlossaryInputConfigResponse inputConfig,
        LanguageCodesSetResponse languageCodesSet,
        LanguageCodePairResponse languagePair,
        String name,
        String submitTime) {
        this.endTime = Objects.requireNonNull(endTime);
        this.entryCount = Objects.requireNonNull(entryCount);
        this.inputConfig = Objects.requireNonNull(inputConfig);
        this.languageCodesSet = Objects.requireNonNull(languageCodesSet);
        this.languagePair = Objects.requireNonNull(languagePair);
        this.name = Objects.requireNonNull(name);
        this.submitTime = Objects.requireNonNull(submitTime);
    }

    /**
     * When the glossary creation was finished.
     * 
    */
    public String getEndTime() {
        return this.endTime;
    }
    /**
     * The number of entries defined in the glossary.
     * 
    */
    public Integer getEntryCount() {
        return this.entryCount;
    }
    /**
     * Provides examples to build the glossary from. Total glossary must not exceed 10M Unicode codepoints.
     * 
    */
    public GlossaryInputConfigResponse getInputConfig() {
        return this.inputConfig;
    }
    /**
     * Used with equivalent term set glossaries.
     * 
    */
    public LanguageCodesSetResponse getLanguageCodesSet() {
        return this.languageCodesSet;
    }
    /**
     * Used with unidirectional glossaries.
     * 
    */
    public LanguageCodePairResponse getLanguagePair() {
        return this.languagePair;
    }
    /**
     * The resource name of the glossary. Glossary names have the form `projects/{project-number-or-id}/locations/{location-id}/glossaries/{glossary-id}`.
     * 
    */
    public String getName() {
        return this.name;
    }
    /**
     * When CreateGlossary was called.
     * 
    */
    public String getSubmitTime() {
        return this.submitTime;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetGlossaryResult defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String endTime;
        private Integer entryCount;
        private GlossaryInputConfigResponse inputConfig;
        private LanguageCodesSetResponse languageCodesSet;
        private LanguageCodePairResponse languagePair;
        private String name;
        private String submitTime;

        public Builder() {
    	      // Empty
        }

        public Builder(GetGlossaryResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.endTime = defaults.endTime;
    	      this.entryCount = defaults.entryCount;
    	      this.inputConfig = defaults.inputConfig;
    	      this.languageCodesSet = defaults.languageCodesSet;
    	      this.languagePair = defaults.languagePair;
    	      this.name = defaults.name;
    	      this.submitTime = defaults.submitTime;
        }

        public Builder setEndTime(String endTime) {
            this.endTime = Objects.requireNonNull(endTime);
            return this;
        }

        public Builder setEntryCount(Integer entryCount) {
            this.entryCount = Objects.requireNonNull(entryCount);
            return this;
        }

        public Builder setInputConfig(GlossaryInputConfigResponse inputConfig) {
            this.inputConfig = Objects.requireNonNull(inputConfig);
            return this;
        }

        public Builder setLanguageCodesSet(LanguageCodesSetResponse languageCodesSet) {
            this.languageCodesSet = Objects.requireNonNull(languageCodesSet);
            return this;
        }

        public Builder setLanguagePair(LanguageCodePairResponse languagePair) {
            this.languagePair = Objects.requireNonNull(languagePair);
            return this;
        }

        public Builder setName(String name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }

        public Builder setSubmitTime(String submitTime) {
            this.submitTime = Objects.requireNonNull(submitTime);
            return this;
        }
        public GetGlossaryResult build() {
            return new GetGlossaryResult(endTime, entryCount, inputConfig, languageCodesSet, languagePair, name, submitTime);
        }
    }
}
