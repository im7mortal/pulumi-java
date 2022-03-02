// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.dataloss.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import io.pulumi.gcp.dataloss.outputs.PreventionDeidentifyTemplateDeidentifyConfigInfoTypeTransformationsTransformationPrimitiveTransformationCharacterMaskConfigCharactersToIgnore;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class PreventionDeidentifyTemplateDeidentifyConfigInfoTypeTransformationsTransformationPrimitiveTransformationCharacterMaskConfig {
    /**
     * Characters to skip when doing de-identification of a value. These will be left alone and skipped.
     * Structure is documented below.
     * 
     */
    private final @Nullable List<PreventionDeidentifyTemplateDeidentifyConfigInfoTypeTransformationsTransformationPrimitiveTransformationCharacterMaskConfigCharactersToIgnore> charactersToIgnores;
    /**
     * Character to use to mask the sensitive values—for example, * for an alphabetic string such as a name, or 0 for a numeric string
     * such as ZIP code or credit card number. This string must have a length of 1. If not supplied, this value defaults to * for
     * strings, and 0 for digits.
     * 
     */
    private final @Nullable String maskingCharacter;
    /**
     * Number of characters to mask. If not set, all matching chars will be masked. Skipped characters do not count towards this tally.
     * 
     */
    private final @Nullable Integer numberToMask;
    /**
     * Mask characters in reverse order. For example, if masking_character is 0, number_to_mask is 14, and reverse_order is `false`, then the
     * input string `1234-5678-9012-3456` is masked as `00000000000000-3456`.
     * 
     */
    private final @Nullable Boolean reverseOrder;

    @OutputCustomType.Constructor({"charactersToIgnores","maskingCharacter","numberToMask","reverseOrder"})
    private PreventionDeidentifyTemplateDeidentifyConfigInfoTypeTransformationsTransformationPrimitiveTransformationCharacterMaskConfig(
        @Nullable List<PreventionDeidentifyTemplateDeidentifyConfigInfoTypeTransformationsTransformationPrimitiveTransformationCharacterMaskConfigCharactersToIgnore> charactersToIgnores,
        @Nullable String maskingCharacter,
        @Nullable Integer numberToMask,
        @Nullable Boolean reverseOrder) {
        this.charactersToIgnores = charactersToIgnores;
        this.maskingCharacter = maskingCharacter;
        this.numberToMask = numberToMask;
        this.reverseOrder = reverseOrder;
    }

    /**
     * Characters to skip when doing de-identification of a value. These will be left alone and skipped.
     * Structure is documented below.
     * 
    */
    public List<PreventionDeidentifyTemplateDeidentifyConfigInfoTypeTransformationsTransformationPrimitiveTransformationCharacterMaskConfigCharactersToIgnore> getCharactersToIgnores() {
        return this.charactersToIgnores == null ? List.of() : this.charactersToIgnores;
    }
    /**
     * Character to use to mask the sensitive values—for example, * for an alphabetic string such as a name, or 0 for a numeric string
     * such as ZIP code or credit card number. This string must have a length of 1. If not supplied, this value defaults to * for
     * strings, and 0 for digits.
     * 
    */
    public Optional<String> getMaskingCharacter() {
        return Optional.ofNullable(this.maskingCharacter);
    }
    /**
     * Number of characters to mask. If not set, all matching chars will be masked. Skipped characters do not count towards this tally.
     * 
    */
    public Optional<Integer> getNumberToMask() {
        return Optional.ofNullable(this.numberToMask);
    }
    /**
     * Mask characters in reverse order. For example, if masking_character is 0, number_to_mask is 14, and reverse_order is `false`, then the
     * input string `1234-5678-9012-3456` is masked as `00000000000000-3456`.
     * 
    */
    public Optional<Boolean> getReverseOrder() {
        return Optional.ofNullable(this.reverseOrder);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(PreventionDeidentifyTemplateDeidentifyConfigInfoTypeTransformationsTransformationPrimitiveTransformationCharacterMaskConfig defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable List<PreventionDeidentifyTemplateDeidentifyConfigInfoTypeTransformationsTransformationPrimitiveTransformationCharacterMaskConfigCharactersToIgnore> charactersToIgnores;
        private @Nullable String maskingCharacter;
        private @Nullable Integer numberToMask;
        private @Nullable Boolean reverseOrder;

        public Builder() {
    	      // Empty
        }

        public Builder(PreventionDeidentifyTemplateDeidentifyConfigInfoTypeTransformationsTransformationPrimitiveTransformationCharacterMaskConfig defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.charactersToIgnores = defaults.charactersToIgnores;
    	      this.maskingCharacter = defaults.maskingCharacter;
    	      this.numberToMask = defaults.numberToMask;
    	      this.reverseOrder = defaults.reverseOrder;
        }

        public Builder setCharactersToIgnores(@Nullable List<PreventionDeidentifyTemplateDeidentifyConfigInfoTypeTransformationsTransformationPrimitiveTransformationCharacterMaskConfigCharactersToIgnore> charactersToIgnores) {
            this.charactersToIgnores = charactersToIgnores;
            return this;
        }

        public Builder setMaskingCharacter(@Nullable String maskingCharacter) {
            this.maskingCharacter = maskingCharacter;
            return this;
        }

        public Builder setNumberToMask(@Nullable Integer numberToMask) {
            this.numberToMask = numberToMask;
            return this;
        }

        public Builder setReverseOrder(@Nullable Boolean reverseOrder) {
            this.reverseOrder = reverseOrder;
            return this;
        }
        public PreventionDeidentifyTemplateDeidentifyConfigInfoTypeTransformationsTransformationPrimitiveTransformationCharacterMaskConfig build() {
            return new PreventionDeidentifyTemplateDeidentifyConfigInfoTypeTransformationsTransformationPrimitiveTransformationCharacterMaskConfig(charactersToIgnores, maskingCharacter, numberToMask, reverseOrder);
        }
    }
}
