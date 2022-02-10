// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.healthcare_v1beta1.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.internal.annotations.InputImport;
import io.pulumi.googlenative.healthcare_v1beta1.inputs.VersionSourceArgs;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import javax.annotation.Nullable;


public final class Hl7SchemaConfigArgs extends io.pulumi.resources.ResourceArgs {

    public static final Hl7SchemaConfigArgs Empty = new Hl7SchemaConfigArgs();

    @InputImport(name="messageSchemaConfigs")
    private final @Nullable Input<Map<String,String>> messageSchemaConfigs;

    public Input<Map<String,String>> getMessageSchemaConfigs() {
        return this.messageSchemaConfigs == null ? Input.empty() : this.messageSchemaConfigs;
    }

    @InputImport(name="version")
    private final @Nullable Input<List<VersionSourceArgs>> version;

    public Input<List<VersionSourceArgs>> getVersion() {
        return this.version == null ? Input.empty() : this.version;
    }

    public Hl7SchemaConfigArgs(
        @Nullable Input<Map<String,String>> messageSchemaConfigs,
        @Nullable Input<List<VersionSourceArgs>> version) {
        this.messageSchemaConfigs = messageSchemaConfigs;
        this.version = version;
    }

    private Hl7SchemaConfigArgs() {
        this.messageSchemaConfigs = Input.empty();
        this.version = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(Hl7SchemaConfigArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<Map<String,String>> messageSchemaConfigs;
        private @Nullable Input<List<VersionSourceArgs>> version;

        public Builder() {
    	      // Empty
        }

        public Builder(Hl7SchemaConfigArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.messageSchemaConfigs = defaults.messageSchemaConfigs;
    	      this.version = defaults.version;
        }

        public Builder setMessageSchemaConfigs(@Nullable Input<Map<String,String>> messageSchemaConfigs) {
            this.messageSchemaConfigs = messageSchemaConfigs;
            return this;
        }

        public Builder setMessageSchemaConfigs(@Nullable Map<String,String> messageSchemaConfigs) {
            this.messageSchemaConfigs = Input.ofNullable(messageSchemaConfigs);
            return this;
        }

        public Builder setVersion(@Nullable Input<List<VersionSourceArgs>> version) {
            this.version = version;
            return this;
        }

        public Builder setVersion(@Nullable List<VersionSourceArgs> version) {
            this.version = Input.ofNullable(version);
            return this;
        }

        public Hl7SchemaConfigArgs build() {
            return new Hl7SchemaConfigArgs(messageSchemaConfigs, version);
        }
    }
}