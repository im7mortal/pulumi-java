// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.servicecatalog.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import java.lang.Boolean;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class ProvisionedProductProvisioningParameter {
    /**
     * Parameter key.
     * 
     */
    private final String key;
    /**
     * Whether to ignore `value` and keep the previous parameter value. Ignored when initially provisioning a product.
     * 
     */
    private final @Nullable Boolean usePreviousValue;
    /**
     * Parameter value.
     * 
     */
    private final @Nullable String value;

    @OutputCustomType.Constructor({"key","usePreviousValue","value"})
    private ProvisionedProductProvisioningParameter(
        String key,
        @Nullable Boolean usePreviousValue,
        @Nullable String value) {
        this.key = Objects.requireNonNull(key);
        this.usePreviousValue = usePreviousValue;
        this.value = value;
    }

    /**
     * Parameter key.
     * 
    */
    public String getKey() {
        return this.key;
    }
    /**
     * Whether to ignore `value` and keep the previous parameter value. Ignored when initially provisioning a product.
     * 
    */
    public Optional<Boolean> getUsePreviousValue() {
        return Optional.ofNullable(this.usePreviousValue);
    }
    /**
     * Parameter value.
     * 
    */
    public Optional<String> getValue() {
        return Optional.ofNullable(this.value);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ProvisionedProductProvisioningParameter defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String key;
        private @Nullable Boolean usePreviousValue;
        private @Nullable String value;

        public Builder() {
    	      // Empty
        }

        public Builder(ProvisionedProductProvisioningParameter defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.key = defaults.key;
    	      this.usePreviousValue = defaults.usePreviousValue;
    	      this.value = defaults.value;
        }

        public Builder setKey(String key) {
            this.key = Objects.requireNonNull(key);
            return this;
        }

        public Builder setUsePreviousValue(@Nullable Boolean usePreviousValue) {
            this.usePreviousValue = usePreviousValue;
            return this;
        }

        public Builder setValue(@Nullable String value) {
            this.value = value;
            return this;
        }
        public ProvisionedProductProvisioningParameter build() {
            return new ProvisionedProductProvisioningParameter(key, usePreviousValue, value);
        }
    }
}
