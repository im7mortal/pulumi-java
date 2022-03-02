// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.dataloss.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import java.lang.String;
import java.util.List;
import java.util.Objects;

@OutputCustomType
public final class PreventionInspectTemplateInspectConfigRuleSetRuleExclusionRuleDictionaryWordList {
    /**
     * Words or phrases defining the dictionary. The dictionary must contain at least one
     * phrase and every phrase must contain at least 2 characters that are letters or digits.
     * 
     */
    private final List<String> words;

    @OutputCustomType.Constructor({"words"})
    private PreventionInspectTemplateInspectConfigRuleSetRuleExclusionRuleDictionaryWordList(List<String> words) {
        this.words = Objects.requireNonNull(words);
    }

    /**
     * Words or phrases defining the dictionary. The dictionary must contain at least one
     * phrase and every phrase must contain at least 2 characters that are letters or digits.
     * 
    */
    public List<String> getWords() {
        return this.words;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(PreventionInspectTemplateInspectConfigRuleSetRuleExclusionRuleDictionaryWordList defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private List<String> words;

        public Builder() {
    	      // Empty
        }

        public Builder(PreventionInspectTemplateInspectConfigRuleSetRuleExclusionRuleDictionaryWordList defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.words = defaults.words;
        }

        public Builder setWords(List<String> words) {
            this.words = Objects.requireNonNull(words);
            return this;
        }
        public PreventionInspectTemplateInspectConfigRuleSetRuleExclusionRuleDictionaryWordList build() {
            return new PreventionInspectTemplateInspectConfigRuleSetRuleExclusionRuleDictionaryWordList(words);
        }
    }
}
