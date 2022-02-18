// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.lex.outputs;

import io.pulumi.core.internal.annotations.OutputCustomType;
import java.lang.String;
import java.util.Objects;

@OutputCustomType
public final class BotAliasCloudWatchLogGroupLogDestination {
    /**
     * A string used to identify this tag
     * 
     */
    private final String cloudWatchLogGroupArn;
    /**
     * A string containing the value for the tag
     * 
     */
    private final String logPrefix;

    @OutputCustomType.Constructor({"cloudWatchLogGroupArn","logPrefix"})
    private BotAliasCloudWatchLogGroupLogDestination(
        String cloudWatchLogGroupArn,
        String logPrefix) {
        this.cloudWatchLogGroupArn = Objects.requireNonNull(cloudWatchLogGroupArn);
        this.logPrefix = Objects.requireNonNull(logPrefix);
    }

    /**
     * A string used to identify this tag
     * 
     */
    public String getCloudWatchLogGroupArn() {
        return this.cloudWatchLogGroupArn;
    }
    /**
     * A string containing the value for the tag
     * 
     */
    public String getLogPrefix() {
        return this.logPrefix;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(BotAliasCloudWatchLogGroupLogDestination defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String cloudWatchLogGroupArn;
        private String logPrefix;

        public Builder() {
    	      // Empty
        }

        public Builder(BotAliasCloudWatchLogGroupLogDestination defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.cloudWatchLogGroupArn = defaults.cloudWatchLogGroupArn;
    	      this.logPrefix = defaults.logPrefix;
        }

        public Builder setCloudWatchLogGroupArn(String cloudWatchLogGroupArn) {
            this.cloudWatchLogGroupArn = Objects.requireNonNull(cloudWatchLogGroupArn);
            return this;
        }

        public Builder setLogPrefix(String logPrefix) {
            this.logPrefix = Objects.requireNonNull(logPrefix);
            return this;
        }

        public BotAliasCloudWatchLogGroupLogDestination build() {
            return new BotAliasCloudWatchLogGroupLogDestination(cloudWatchLogGroupArn, logPrefix);
        }
    }
}
