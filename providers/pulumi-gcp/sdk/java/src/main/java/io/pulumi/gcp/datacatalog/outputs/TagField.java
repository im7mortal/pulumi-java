// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.datacatalog.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import java.lang.Boolean;
import java.lang.Double;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class TagField {
    /**
     * Holds the value for a tag field with boolean type.
     * 
     */
    private final @Nullable Boolean boolValue;
    /**
     * - 
     * The display name of this field
     * 
     */
    private final @Nullable String displayName;
    /**
     * Holds the value for a tag field with double type.
     * 
     */
    private final @Nullable Double doubleValue;
    /**
     * Holds the value for a tag field with enum type. This value must be one of the allowed values in the definition of this enum.
     * Structure is documented below.
     * 
     */
    private final @Nullable String enumValue;
    /**
     * The identifier for this object. Format specified above.
     * 
     */
    private final String fieldName;
    /**
     * - 
     * The order of this field with respect to other fields in this tag. For example, a higher value can indicate
     * a more important field. The value can be negative. Multiple fields can have the same order, and field orders
     * within a tag do not have to be sequential.
     * 
     */
    private final @Nullable Integer order;
    /**
     * Holds the value for a tag field with string type.
     * 
     */
    private final @Nullable String stringValue;
    /**
     * Holds the value for a tag field with timestamp type.
     * 
     */
    private final @Nullable String timestampValue;

    @OutputCustomType.Constructor({"boolValue","displayName","doubleValue","enumValue","fieldName","order","stringValue","timestampValue"})
    private TagField(
        @Nullable Boolean boolValue,
        @Nullable String displayName,
        @Nullable Double doubleValue,
        @Nullable String enumValue,
        String fieldName,
        @Nullable Integer order,
        @Nullable String stringValue,
        @Nullable String timestampValue) {
        this.boolValue = boolValue;
        this.displayName = displayName;
        this.doubleValue = doubleValue;
        this.enumValue = enumValue;
        this.fieldName = Objects.requireNonNull(fieldName);
        this.order = order;
        this.stringValue = stringValue;
        this.timestampValue = timestampValue;
    }

    /**
     * Holds the value for a tag field with boolean type.
     * 
    */
    public Optional<Boolean> getBoolValue() {
        return Optional.ofNullable(this.boolValue);
    }
    /**
     * - 
     * The display name of this field
     * 
    */
    public Optional<String> getDisplayName() {
        return Optional.ofNullable(this.displayName);
    }
    /**
     * Holds the value for a tag field with double type.
     * 
    */
    public Optional<Double> getDoubleValue() {
        return Optional.ofNullable(this.doubleValue);
    }
    /**
     * Holds the value for a tag field with enum type. This value must be one of the allowed values in the definition of this enum.
     * Structure is documented below.
     * 
    */
    public Optional<String> getEnumValue() {
        return Optional.ofNullable(this.enumValue);
    }
    /**
     * The identifier for this object. Format specified above.
     * 
    */
    public String getFieldName() {
        return this.fieldName;
    }
    /**
     * - 
     * The order of this field with respect to other fields in this tag. For example, a higher value can indicate
     * a more important field. The value can be negative. Multiple fields can have the same order, and field orders
     * within a tag do not have to be sequential.
     * 
    */
    public Optional<Integer> getOrder() {
        return Optional.ofNullable(this.order);
    }
    /**
     * Holds the value for a tag field with string type.
     * 
    */
    public Optional<String> getStringValue() {
        return Optional.ofNullable(this.stringValue);
    }
    /**
     * Holds the value for a tag field with timestamp type.
     * 
    */
    public Optional<String> getTimestampValue() {
        return Optional.ofNullable(this.timestampValue);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(TagField defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Boolean boolValue;
        private @Nullable String displayName;
        private @Nullable Double doubleValue;
        private @Nullable String enumValue;
        private String fieldName;
        private @Nullable Integer order;
        private @Nullable String stringValue;
        private @Nullable String timestampValue;

        public Builder() {
    	      // Empty
        }

        public Builder(TagField defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.boolValue = defaults.boolValue;
    	      this.displayName = defaults.displayName;
    	      this.doubleValue = defaults.doubleValue;
    	      this.enumValue = defaults.enumValue;
    	      this.fieldName = defaults.fieldName;
    	      this.order = defaults.order;
    	      this.stringValue = defaults.stringValue;
    	      this.timestampValue = defaults.timestampValue;
        }

        public Builder setBoolValue(@Nullable Boolean boolValue) {
            this.boolValue = boolValue;
            return this;
        }

        public Builder setDisplayName(@Nullable String displayName) {
            this.displayName = displayName;
            return this;
        }

        public Builder setDoubleValue(@Nullable Double doubleValue) {
            this.doubleValue = doubleValue;
            return this;
        }

        public Builder setEnumValue(@Nullable String enumValue) {
            this.enumValue = enumValue;
            return this;
        }

        public Builder setFieldName(String fieldName) {
            this.fieldName = Objects.requireNonNull(fieldName);
            return this;
        }

        public Builder setOrder(@Nullable Integer order) {
            this.order = order;
            return this;
        }

        public Builder setStringValue(@Nullable String stringValue) {
            this.stringValue = stringValue;
            return this;
        }

        public Builder setTimestampValue(@Nullable String timestampValue) {
            this.timestampValue = timestampValue;
            return this;
        }
        public TagField build() {
            return new TagField(boolValue, displayName, doubleValue, enumValue, fieldName, order, stringValue, timestampValue);
        }
    }
}
