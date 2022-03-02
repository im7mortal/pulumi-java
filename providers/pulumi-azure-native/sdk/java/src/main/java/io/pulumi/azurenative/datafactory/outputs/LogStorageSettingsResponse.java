// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.datafactory.outputs;

import io.pulumi.azurenative.datafactory.outputs.LinkedServiceReferenceResponse;
import io.pulumi.core.annotations.OutputCustomType;
import java.lang.Object;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class LogStorageSettingsResponse {
    /**
     * Specifies whether to enable reliable logging. Type: boolean (or Expression with resultType boolean).
     * 
     */
    private final @Nullable Object enableReliableLogging;
    /**
     * Log storage linked service reference.
     * 
     */
    private final LinkedServiceReferenceResponse linkedServiceName;
    /**
     * Gets or sets the log level, support: Info, Warning. Type: string (or Expression with resultType string).
     * 
     */
    private final @Nullable Object logLevel;
    /**
     * The path to storage for storing detailed logs of activity execution. Type: string (or Expression with resultType string).
     * 
     */
    private final @Nullable Object path;

    @OutputCustomType.Constructor({"enableReliableLogging","linkedServiceName","logLevel","path"})
    private LogStorageSettingsResponse(
        @Nullable Object enableReliableLogging,
        LinkedServiceReferenceResponse linkedServiceName,
        @Nullable Object logLevel,
        @Nullable Object path) {
        this.enableReliableLogging = enableReliableLogging;
        this.linkedServiceName = Objects.requireNonNull(linkedServiceName);
        this.logLevel = logLevel;
        this.path = path;
    }

    /**
     * Specifies whether to enable reliable logging. Type: boolean (or Expression with resultType boolean).
     * 
    */
    public Optional<Object> getEnableReliableLogging() {
        return Optional.ofNullable(this.enableReliableLogging);
    }
    /**
     * Log storage linked service reference.
     * 
    */
    public LinkedServiceReferenceResponse getLinkedServiceName() {
        return this.linkedServiceName;
    }
    /**
     * Gets or sets the log level, support: Info, Warning. Type: string (or Expression with resultType string).
     * 
    */
    public Optional<Object> getLogLevel() {
        return Optional.ofNullable(this.logLevel);
    }
    /**
     * The path to storage for storing detailed logs of activity execution. Type: string (or Expression with resultType string).
     * 
    */
    public Optional<Object> getPath() {
        return Optional.ofNullable(this.path);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(LogStorageSettingsResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Object enableReliableLogging;
        private LinkedServiceReferenceResponse linkedServiceName;
        private @Nullable Object logLevel;
        private @Nullable Object path;

        public Builder() {
    	      // Empty
        }

        public Builder(LogStorageSettingsResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.enableReliableLogging = defaults.enableReliableLogging;
    	      this.linkedServiceName = defaults.linkedServiceName;
    	      this.logLevel = defaults.logLevel;
    	      this.path = defaults.path;
        }

        public Builder setEnableReliableLogging(@Nullable Object enableReliableLogging) {
            this.enableReliableLogging = enableReliableLogging;
            return this;
        }

        public Builder setLinkedServiceName(LinkedServiceReferenceResponse linkedServiceName) {
            this.linkedServiceName = Objects.requireNonNull(linkedServiceName);
            return this;
        }

        public Builder setLogLevel(@Nullable Object logLevel) {
            this.logLevel = logLevel;
            return this;
        }

        public Builder setPath(@Nullable Object path) {
            this.path = path;
            return this;
        }
        public LogStorageSettingsResponse build() {
            return new LogStorageSettingsResponse(enableReliableLogging, linkedServiceName, logLevel, path);
        }
    }
}
