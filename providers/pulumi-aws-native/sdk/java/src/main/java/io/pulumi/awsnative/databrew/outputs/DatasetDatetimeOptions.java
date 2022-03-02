// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.databrew.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class DatasetDatetimeOptions {
    /**
     * Date/time format of a date parameter
     * 
     */
    private final String format;
    /**
     * Locale code for a date parameter
     * 
     */
    private final @Nullable String localeCode;
    /**
     * Timezone offset
     * 
     */
    private final @Nullable String timezoneOffset;

    @OutputCustomType.Constructor({"format","localeCode","timezoneOffset"})
    private DatasetDatetimeOptions(
        String format,
        @Nullable String localeCode,
        @Nullable String timezoneOffset) {
        this.format = Objects.requireNonNull(format);
        this.localeCode = localeCode;
        this.timezoneOffset = timezoneOffset;
    }

    /**
     * Date/time format of a date parameter
     * 
    */
    public String getFormat() {
        return this.format;
    }
    /**
     * Locale code for a date parameter
     * 
    */
    public Optional<String> getLocaleCode() {
        return Optional.ofNullable(this.localeCode);
    }
    /**
     * Timezone offset
     * 
    */
    public Optional<String> getTimezoneOffset() {
        return Optional.ofNullable(this.timezoneOffset);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(DatasetDatetimeOptions defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String format;
        private @Nullable String localeCode;
        private @Nullable String timezoneOffset;

        public Builder() {
    	      // Empty
        }

        public Builder(DatasetDatetimeOptions defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.format = defaults.format;
    	      this.localeCode = defaults.localeCode;
    	      this.timezoneOffset = defaults.timezoneOffset;
        }

        public Builder setFormat(String format) {
            this.format = Objects.requireNonNull(format);
            return this;
        }

        public Builder setLocaleCode(@Nullable String localeCode) {
            this.localeCode = localeCode;
            return this;
        }

        public Builder setTimezoneOffset(@Nullable String timezoneOffset) {
            this.timezoneOffset = timezoneOffset;
            return this;
        }
        public DatasetDatetimeOptions build() {
            return new DatasetDatetimeOptions(format, localeCode, timezoneOffset);
        }
    }
}
