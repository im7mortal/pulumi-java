// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.recoveryservices.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import java.lang.Boolean;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class SettingsResponse {
    /**
     * Workload compression flag. This has been added so that 'isSqlCompression'
     * will be deprecated once clients upgrade to consider this flag.
     * 
     */
    private final @Nullable Boolean isCompression;
    /**
     * SQL compression flag
     * 
     */
    private final @Nullable Boolean issqlcompression;
    /**
     * TimeZone optional input as string. For example: TimeZone = "Pacific Standard Time".
     * 
     */
    private final @Nullable String timeZone;

    @OutputCustomType.Constructor({"isCompression","issqlcompression","timeZone"})
    private SettingsResponse(
        @Nullable Boolean isCompression,
        @Nullable Boolean issqlcompression,
        @Nullable String timeZone) {
        this.isCompression = isCompression;
        this.issqlcompression = issqlcompression;
        this.timeZone = timeZone;
    }

    /**
     * Workload compression flag. This has been added so that 'isSqlCompression'
     * will be deprecated once clients upgrade to consider this flag.
     * 
    */
    public Optional<Boolean> getIsCompression() {
        return Optional.ofNullable(this.isCompression);
    }
    /**
     * SQL compression flag
     * 
    */
    public Optional<Boolean> getIssqlcompression() {
        return Optional.ofNullable(this.issqlcompression);
    }
    /**
     * TimeZone optional input as string. For example: TimeZone = "Pacific Standard Time".
     * 
    */
    public Optional<String> getTimeZone() {
        return Optional.ofNullable(this.timeZone);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(SettingsResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Boolean isCompression;
        private @Nullable Boolean issqlcompression;
        private @Nullable String timeZone;

        public Builder() {
    	      // Empty
        }

        public Builder(SettingsResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.isCompression = defaults.isCompression;
    	      this.issqlcompression = defaults.issqlcompression;
    	      this.timeZone = defaults.timeZone;
        }

        public Builder setIsCompression(@Nullable Boolean isCompression) {
            this.isCompression = isCompression;
            return this;
        }

        public Builder setIssqlcompression(@Nullable Boolean issqlcompression) {
            this.issqlcompression = issqlcompression;
            return this;
        }

        public Builder setTimeZone(@Nullable String timeZone) {
            this.timeZone = timeZone;
            return this;
        }
        public SettingsResponse build() {
            return new SettingsResponse(isCompression, issqlcompression, timeZone);
        }
    }
}
