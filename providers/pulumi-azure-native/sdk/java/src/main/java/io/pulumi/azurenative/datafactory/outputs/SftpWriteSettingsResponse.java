// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.datafactory.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import java.lang.Object;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class SftpWriteSettingsResponse {
    /**
     * The type of copy behavior for copy sink.
     * 
     */
    private final @Nullable Object copyBehavior;
    /**
     * If true, disable data store metrics collection. Default is false. Type: boolean (or Expression with resultType boolean).
     * 
     */
    private final @Nullable Object disableMetricsCollection;
    /**
     * The maximum concurrent connection count for the source data store. Type: integer (or Expression with resultType integer).
     * 
     */
    private final @Nullable Object maxConcurrentConnections;
    /**
     * Specifies the timeout for writing each chunk to SFTP server. Default value: 01:00:00 (one hour). Type: string (or Expression with resultType string).
     * 
     */
    private final @Nullable Object operationTimeout;
    /**
     * The write setting type.
     * Expected value is 'SftpWriteSettings'.
     * 
     */
    private final String type;
    /**
     * Upload to temporary file(s) and rename. Disable this option if your SFTP server doesn't support rename operation. Type: boolean (or Expression with resultType boolean).
     * 
     */
    private final @Nullable Object useTempFileRename;

    @OutputCustomType.Constructor({"copyBehavior","disableMetricsCollection","maxConcurrentConnections","operationTimeout","type","useTempFileRename"})
    private SftpWriteSettingsResponse(
        @Nullable Object copyBehavior,
        @Nullable Object disableMetricsCollection,
        @Nullable Object maxConcurrentConnections,
        @Nullable Object operationTimeout,
        String type,
        @Nullable Object useTempFileRename) {
        this.copyBehavior = copyBehavior;
        this.disableMetricsCollection = disableMetricsCollection;
        this.maxConcurrentConnections = maxConcurrentConnections;
        this.operationTimeout = operationTimeout;
        this.type = Objects.requireNonNull(type);
        this.useTempFileRename = useTempFileRename;
    }

    /**
     * The type of copy behavior for copy sink.
     * 
    */
    public Optional<Object> getCopyBehavior() {
        return Optional.ofNullable(this.copyBehavior);
    }
    /**
     * If true, disable data store metrics collection. Default is false. Type: boolean (or Expression with resultType boolean).
     * 
    */
    public Optional<Object> getDisableMetricsCollection() {
        return Optional.ofNullable(this.disableMetricsCollection);
    }
    /**
     * The maximum concurrent connection count for the source data store. Type: integer (or Expression with resultType integer).
     * 
    */
    public Optional<Object> getMaxConcurrentConnections() {
        return Optional.ofNullable(this.maxConcurrentConnections);
    }
    /**
     * Specifies the timeout for writing each chunk to SFTP server. Default value: 01:00:00 (one hour). Type: string (or Expression with resultType string).
     * 
    */
    public Optional<Object> getOperationTimeout() {
        return Optional.ofNullable(this.operationTimeout);
    }
    /**
     * The write setting type.
     * Expected value is 'SftpWriteSettings'.
     * 
    */
    public String getType() {
        return this.type;
    }
    /**
     * Upload to temporary file(s) and rename. Disable this option if your SFTP server doesn't support rename operation. Type: boolean (or Expression with resultType boolean).
     * 
    */
    public Optional<Object> getUseTempFileRename() {
        return Optional.ofNullable(this.useTempFileRename);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(SftpWriteSettingsResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Object copyBehavior;
        private @Nullable Object disableMetricsCollection;
        private @Nullable Object maxConcurrentConnections;
        private @Nullable Object operationTimeout;
        private String type;
        private @Nullable Object useTempFileRename;

        public Builder() {
    	      // Empty
        }

        public Builder(SftpWriteSettingsResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.copyBehavior = defaults.copyBehavior;
    	      this.disableMetricsCollection = defaults.disableMetricsCollection;
    	      this.maxConcurrentConnections = defaults.maxConcurrentConnections;
    	      this.operationTimeout = defaults.operationTimeout;
    	      this.type = defaults.type;
    	      this.useTempFileRename = defaults.useTempFileRename;
        }

        public Builder setCopyBehavior(@Nullable Object copyBehavior) {
            this.copyBehavior = copyBehavior;
            return this;
        }

        public Builder setDisableMetricsCollection(@Nullable Object disableMetricsCollection) {
            this.disableMetricsCollection = disableMetricsCollection;
            return this;
        }

        public Builder setMaxConcurrentConnections(@Nullable Object maxConcurrentConnections) {
            this.maxConcurrentConnections = maxConcurrentConnections;
            return this;
        }

        public Builder setOperationTimeout(@Nullable Object operationTimeout) {
            this.operationTimeout = operationTimeout;
            return this;
        }

        public Builder setType(String type) {
            this.type = Objects.requireNonNull(type);
            return this;
        }

        public Builder setUseTempFileRename(@Nullable Object useTempFileRename) {
            this.useTempFileRename = useTempFileRename;
            return this;
        }
        public SftpWriteSettingsResponse build() {
            return new SftpWriteSettingsResponse(copyBehavior, disableMetricsCollection, maxConcurrentConnections, operationTimeout, type, useTempFileRename);
        }
    }
}
