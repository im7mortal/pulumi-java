// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.dataloss.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import java.lang.String;
import java.util.Objects;

@OutputCustomType
public final class PreventionDeidentifyTemplateDeidentifyConfigInfoTypeTransformationsTransformationPrimitiveTransformationCryptoReplaceFfxFpeConfigCryptoKeyUnwrapped {
    /**
     * A 128/192/256 bit key.
     * A base64-encoded string.
     * 
     */
    private final String key;

    @OutputCustomType.Constructor({"key"})
    private PreventionDeidentifyTemplateDeidentifyConfigInfoTypeTransformationsTransformationPrimitiveTransformationCryptoReplaceFfxFpeConfigCryptoKeyUnwrapped(String key) {
        this.key = Objects.requireNonNull(key);
    }

    /**
     * A 128/192/256 bit key.
     * A base64-encoded string.
     * 
    */
    public String getKey() {
        return this.key;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(PreventionDeidentifyTemplateDeidentifyConfigInfoTypeTransformationsTransformationPrimitiveTransformationCryptoReplaceFfxFpeConfigCryptoKeyUnwrapped defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String key;

        public Builder() {
    	      // Empty
        }

        public Builder(PreventionDeidentifyTemplateDeidentifyConfigInfoTypeTransformationsTransformationPrimitiveTransformationCryptoReplaceFfxFpeConfigCryptoKeyUnwrapped defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.key = defaults.key;
        }

        public Builder setKey(String key) {
            this.key = Objects.requireNonNull(key);
            return this;
        }
        public PreventionDeidentifyTemplateDeidentifyConfigInfoTypeTransformationsTransformationPrimitiveTransformationCryptoReplaceFfxFpeConfigCryptoKeyUnwrapped build() {
            return new PreventionDeidentifyTemplateDeidentifyConfigInfoTypeTransformationsTransformationPrimitiveTransformationCryptoReplaceFfxFpeConfigCryptoKeyUnwrapped(key);
        }
    }
}
