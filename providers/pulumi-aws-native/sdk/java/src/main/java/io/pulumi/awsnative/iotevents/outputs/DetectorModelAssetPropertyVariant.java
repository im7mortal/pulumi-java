// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.iotevents.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class DetectorModelAssetPropertyVariant {
    /**
     * The asset property value is a Boolean value that must be `TRUE` or `FALSE`. You can also specify an expression. If you use an expression, the evaluated result should be a Boolean value.
     * 
     */
    private final @Nullable String booleanValue;
    /**
     * The asset property value is a double. You can also specify an expression. If you use an expression, the evaluated result should be a double.
     * 
     */
    private final @Nullable String doubleValue;
    /**
     * The asset property value is an integer. You can also specify an expression. If you use an expression, the evaluated result should be an integer.
     * 
     */
    private final @Nullable String integerValue;
    /**
     * The asset property value is a string. You can also specify an expression. If you use an expression, the evaluated result should be a string.
     * 
     */
    private final @Nullable String stringValue;

    @OutputCustomType.Constructor({"booleanValue","doubleValue","integerValue","stringValue"})
    private DetectorModelAssetPropertyVariant(
        @Nullable String booleanValue,
        @Nullable String doubleValue,
        @Nullable String integerValue,
        @Nullable String stringValue) {
        this.booleanValue = booleanValue;
        this.doubleValue = doubleValue;
        this.integerValue = integerValue;
        this.stringValue = stringValue;
    }

    /**
     * The asset property value is a Boolean value that must be `TRUE` or `FALSE`. You can also specify an expression. If you use an expression, the evaluated result should be a Boolean value.
     * 
    */
    public Optional<String> getBooleanValue() {
        return Optional.ofNullable(this.booleanValue);
    }
    /**
     * The asset property value is a double. You can also specify an expression. If you use an expression, the evaluated result should be a double.
     * 
    */
    public Optional<String> getDoubleValue() {
        return Optional.ofNullable(this.doubleValue);
    }
    /**
     * The asset property value is an integer. You can also specify an expression. If you use an expression, the evaluated result should be an integer.
     * 
    */
    public Optional<String> getIntegerValue() {
        return Optional.ofNullable(this.integerValue);
    }
    /**
     * The asset property value is a string. You can also specify an expression. If you use an expression, the evaluated result should be a string.
     * 
    */
    public Optional<String> getStringValue() {
        return Optional.ofNullable(this.stringValue);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(DetectorModelAssetPropertyVariant defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String booleanValue;
        private @Nullable String doubleValue;
        private @Nullable String integerValue;
        private @Nullable String stringValue;

        public Builder() {
    	      // Empty
        }

        public Builder(DetectorModelAssetPropertyVariant defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.booleanValue = defaults.booleanValue;
    	      this.doubleValue = defaults.doubleValue;
    	      this.integerValue = defaults.integerValue;
    	      this.stringValue = defaults.stringValue;
        }

        public Builder setBooleanValue(@Nullable String booleanValue) {
            this.booleanValue = booleanValue;
            return this;
        }

        public Builder setDoubleValue(@Nullable String doubleValue) {
            this.doubleValue = doubleValue;
            return this;
        }

        public Builder setIntegerValue(@Nullable String integerValue) {
            this.integerValue = integerValue;
            return this;
        }

        public Builder setStringValue(@Nullable String stringValue) {
            this.stringValue = stringValue;
            return this;
        }
        public DetectorModelAssetPropertyVariant build() {
            return new DetectorModelAssetPropertyVariant(booleanValue, doubleValue, integerValue, stringValue);
        }
    }
}
