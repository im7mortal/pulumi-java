// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.containerinstance.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import java.lang.String;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class LogAnalyticsResponse {
    /**
     * The log type to be used.
     * 
     */
    private final @Nullable String logType;
    /**
     * Metadata for log analytics.
     * 
     */
    private final @Nullable Map<String,String> metadata;
    /**
     * The workspace id for log analytics
     * 
     */
    private final String workspaceId;
    /**
     * The workspace key for log analytics
     * 
     */
    private final String workspaceKey;
    /**
     * The workspace resource id for log analytics
     * 
     */
    private final @Nullable Map<String,String> workspaceResourceId;

    @OutputCustomType.Constructor({"logType","metadata","workspaceId","workspaceKey","workspaceResourceId"})
    private LogAnalyticsResponse(
        @Nullable String logType,
        @Nullable Map<String,String> metadata,
        String workspaceId,
        String workspaceKey,
        @Nullable Map<String,String> workspaceResourceId) {
        this.logType = logType;
        this.metadata = metadata;
        this.workspaceId = Objects.requireNonNull(workspaceId);
        this.workspaceKey = Objects.requireNonNull(workspaceKey);
        this.workspaceResourceId = workspaceResourceId;
    }

    /**
     * The log type to be used.
     * 
    */
    public Optional<String> getLogType() {
        return Optional.ofNullable(this.logType);
    }
    /**
     * Metadata for log analytics.
     * 
    */
    public Map<String,String> getMetadata() {
        return this.metadata == null ? Map.of() : this.metadata;
    }
    /**
     * The workspace id for log analytics
     * 
    */
    public String getWorkspaceId() {
        return this.workspaceId;
    }
    /**
     * The workspace key for log analytics
     * 
    */
    public String getWorkspaceKey() {
        return this.workspaceKey;
    }
    /**
     * The workspace resource id for log analytics
     * 
    */
    public Map<String,String> getWorkspaceResourceId() {
        return this.workspaceResourceId == null ? Map.of() : this.workspaceResourceId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(LogAnalyticsResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String logType;
        private @Nullable Map<String,String> metadata;
        private String workspaceId;
        private String workspaceKey;
        private @Nullable Map<String,String> workspaceResourceId;

        public Builder() {
    	      // Empty
        }

        public Builder(LogAnalyticsResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.logType = defaults.logType;
    	      this.metadata = defaults.metadata;
    	      this.workspaceId = defaults.workspaceId;
    	      this.workspaceKey = defaults.workspaceKey;
    	      this.workspaceResourceId = defaults.workspaceResourceId;
        }

        public Builder setLogType(@Nullable String logType) {
            this.logType = logType;
            return this;
        }

        public Builder setMetadata(@Nullable Map<String,String> metadata) {
            this.metadata = metadata;
            return this;
        }

        public Builder setWorkspaceId(String workspaceId) {
            this.workspaceId = Objects.requireNonNull(workspaceId);
            return this;
        }

        public Builder setWorkspaceKey(String workspaceKey) {
            this.workspaceKey = Objects.requireNonNull(workspaceKey);
            return this;
        }

        public Builder setWorkspaceResourceId(@Nullable Map<String,String> workspaceResourceId) {
            this.workspaceResourceId = workspaceResourceId;
            return this;
        }
        public LogAnalyticsResponse build() {
            return new LogAnalyticsResponse(logType, metadata, workspaceId, workspaceKey, workspaceResourceId);
        }
    }
}
