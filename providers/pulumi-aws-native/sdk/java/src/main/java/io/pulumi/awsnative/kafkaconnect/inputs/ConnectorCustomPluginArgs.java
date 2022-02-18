// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.kafkaconnect.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.internal.annotations.InputImport;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;


/**
 * Details about a custom plugin.
 * 
 */
public final class ConnectorCustomPluginArgs extends io.pulumi.resources.ResourceArgs {

    public static final ConnectorCustomPluginArgs Empty = new ConnectorCustomPluginArgs();

    /**
     * The Amazon Resource Name (ARN) of the custom plugin to use.
     * 
     */
    @InputImport(name="customPluginArn", required=true)
    private final Input<String> customPluginArn;

    public Input<String> getCustomPluginArn() {
        return this.customPluginArn;
    }

    /**
     * The revision of the custom plugin to use.
     * 
     */
    @InputImport(name="revision", required=true)
    private final Input<Integer> revision;

    public Input<Integer> getRevision() {
        return this.revision;
    }

    public ConnectorCustomPluginArgs(
        Input<String> customPluginArn,
        Input<Integer> revision) {
        this.customPluginArn = Objects.requireNonNull(customPluginArn, "expected parameter 'customPluginArn' to be non-null");
        this.revision = Objects.requireNonNull(revision, "expected parameter 'revision' to be non-null");
    }

    private ConnectorCustomPluginArgs() {
        this.customPluginArn = Input.empty();
        this.revision = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ConnectorCustomPluginArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Input<String> customPluginArn;
        private Input<Integer> revision;

        public Builder() {
    	      // Empty
        }

        public Builder(ConnectorCustomPluginArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.customPluginArn = defaults.customPluginArn;
    	      this.revision = defaults.revision;
        }

        public Builder setCustomPluginArn(Input<String> customPluginArn) {
            this.customPluginArn = Objects.requireNonNull(customPluginArn);
            return this;
        }

        public Builder setCustomPluginArn(String customPluginArn) {
            this.customPluginArn = Input.of(Objects.requireNonNull(customPluginArn));
            return this;
        }

        public Builder setRevision(Input<Integer> revision) {
            this.revision = Objects.requireNonNull(revision);
            return this;
        }

        public Builder setRevision(Integer revision) {
            this.revision = Input.of(Objects.requireNonNull(revision));
            return this;
        }

        public ConnectorCustomPluginArgs build() {
            return new ConnectorCustomPluginArgs(customPluginArn, revision);
        }
    }
}
