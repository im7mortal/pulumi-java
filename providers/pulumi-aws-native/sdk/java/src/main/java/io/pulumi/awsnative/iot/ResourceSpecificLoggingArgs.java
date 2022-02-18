// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.iot;

import io.pulumi.awsnative.iot.enums.ResourceSpecificLoggingLogLevel;
import io.pulumi.awsnative.iot.enums.ResourceSpecificLoggingTargetType;
import io.pulumi.core.Input;
import io.pulumi.core.internal.annotations.InputImport;
import java.lang.String;
import java.util.Objects;


public final class ResourceSpecificLoggingArgs extends io.pulumi.resources.ResourceArgs {

    public static final ResourceSpecificLoggingArgs Empty = new ResourceSpecificLoggingArgs();

    /**
     * The log level for a specific target. Valid values are: ERROR, WARN, INFO, DEBUG, or DISABLED.
     * 
     */
    @InputImport(name="logLevel", required=true)
    private final Input<ResourceSpecificLoggingLogLevel> logLevel;

    public Input<ResourceSpecificLoggingLogLevel> getLogLevel() {
        return this.logLevel;
    }

    /**
     * The target name.
     * 
     */
    @InputImport(name="targetName", required=true)
    private final Input<String> targetName;

    public Input<String> getTargetName() {
        return this.targetName;
    }

    /**
     * The target type. Value must be THING_GROUP.
     * 
     */
    @InputImport(name="targetType", required=true)
    private final Input<ResourceSpecificLoggingTargetType> targetType;

    public Input<ResourceSpecificLoggingTargetType> getTargetType() {
        return this.targetType;
    }

    public ResourceSpecificLoggingArgs(
        Input<ResourceSpecificLoggingLogLevel> logLevel,
        Input<String> targetName,
        Input<ResourceSpecificLoggingTargetType> targetType) {
        this.logLevel = Objects.requireNonNull(logLevel, "expected parameter 'logLevel' to be non-null");
        this.targetName = Objects.requireNonNull(targetName, "expected parameter 'targetName' to be non-null");
        this.targetType = Objects.requireNonNull(targetType, "expected parameter 'targetType' to be non-null");
    }

    private ResourceSpecificLoggingArgs() {
        this.logLevel = Input.empty();
        this.targetName = Input.empty();
        this.targetType = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ResourceSpecificLoggingArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Input<ResourceSpecificLoggingLogLevel> logLevel;
        private Input<String> targetName;
        private Input<ResourceSpecificLoggingTargetType> targetType;

        public Builder() {
    	      // Empty
        }

        public Builder(ResourceSpecificLoggingArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.logLevel = defaults.logLevel;
    	      this.targetName = defaults.targetName;
    	      this.targetType = defaults.targetType;
        }

        public Builder setLogLevel(Input<ResourceSpecificLoggingLogLevel> logLevel) {
            this.logLevel = Objects.requireNonNull(logLevel);
            return this;
        }

        public Builder setLogLevel(ResourceSpecificLoggingLogLevel logLevel) {
            this.logLevel = Input.of(Objects.requireNonNull(logLevel));
            return this;
        }

        public Builder setTargetName(Input<String> targetName) {
            this.targetName = Objects.requireNonNull(targetName);
            return this;
        }

        public Builder setTargetName(String targetName) {
            this.targetName = Input.of(Objects.requireNonNull(targetName));
            return this;
        }

        public Builder setTargetType(Input<ResourceSpecificLoggingTargetType> targetType) {
            this.targetType = Objects.requireNonNull(targetType);
            return this;
        }

        public Builder setTargetType(ResourceSpecificLoggingTargetType targetType) {
            this.targetType = Input.of(Objects.requireNonNull(targetType));
            return this;
        }

        public ResourceSpecificLoggingArgs build() {
            return new ResourceSpecificLoggingArgs(logLevel, targetName, targetType);
        }
    }
}
