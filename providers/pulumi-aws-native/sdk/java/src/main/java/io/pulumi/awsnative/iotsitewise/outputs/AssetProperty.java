// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.iotsitewise.outputs;

import io.pulumi.awsnative.iotsitewise.enums.AssetPropertyNotificationState;
import io.pulumi.core.internal.annotations.OutputCustomType;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class AssetProperty {
    /**
     * The property alias that identifies the property.
     * 
     */
    private final @Nullable String alias;
    /**
     * Customer provided ID for property.
     * 
     */
    private final String logicalId;
    /**
     * The MQTT notification state (ENABLED or DISABLED) for this asset property.
     * 
     */
    private final @Nullable AssetPropertyNotificationState notificationState;

    @OutputCustomType.Constructor({"alias","logicalId","notificationState"})
    private AssetProperty(
        @Nullable String alias,
        String logicalId,
        @Nullable AssetPropertyNotificationState notificationState) {
        this.alias = alias;
        this.logicalId = Objects.requireNonNull(logicalId);
        this.notificationState = notificationState;
    }

    /**
     * The property alias that identifies the property.
     * 
     */
    public Optional<String> getAlias() {
        return Optional.ofNullable(this.alias);
    }
    /**
     * Customer provided ID for property.
     * 
     */
    public String getLogicalId() {
        return this.logicalId;
    }
    /**
     * The MQTT notification state (ENABLED or DISABLED) for this asset property.
     * 
     */
    public Optional<AssetPropertyNotificationState> getNotificationState() {
        return Optional.ofNullable(this.notificationState);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(AssetProperty defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String alias;
        private String logicalId;
        private @Nullable AssetPropertyNotificationState notificationState;

        public Builder() {
    	      // Empty
        }

        public Builder(AssetProperty defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.alias = defaults.alias;
    	      this.logicalId = defaults.logicalId;
    	      this.notificationState = defaults.notificationState;
        }

        public Builder setAlias(@Nullable String alias) {
            this.alias = alias;
            return this;
        }

        public Builder setLogicalId(String logicalId) {
            this.logicalId = Objects.requireNonNull(logicalId);
            return this;
        }

        public Builder setNotificationState(@Nullable AssetPropertyNotificationState notificationState) {
            this.notificationState = notificationState;
            return this;
        }

        public AssetProperty build() {
            return new AssetProperty(alias, logicalId, notificationState);
        }
    }
}
