// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.glue.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.internal.annotations.InputImport;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * Identifier for the schema where the schema version will be created.
 * 
 */
public final class SchemaVersionSchemaArgs extends io.pulumi.resources.ResourceArgs {

    public static final SchemaVersionSchemaArgs Empty = new SchemaVersionSchemaArgs();

    /**
     * Name of the registry to identify where the Schema is located.
     * 
     */
    @InputImport(name="registryName")
    private final @Nullable Input<String> registryName;

    public Input<String> getRegistryName() {
        return this.registryName == null ? Input.empty() : this.registryName;
    }

    /**
     * Amazon Resource Name for the Schema. This attribute can be used to uniquely represent the Schema.
     * 
     */
    @InputImport(name="schemaArn")
    private final @Nullable Input<String> schemaArn;

    public Input<String> getSchemaArn() {
        return this.schemaArn == null ? Input.empty() : this.schemaArn;
    }

    /**
     * Name of the schema. This parameter requires RegistryName to be provided.
     * 
     */
    @InputImport(name="schemaName")
    private final @Nullable Input<String> schemaName;

    public Input<String> getSchemaName() {
        return this.schemaName == null ? Input.empty() : this.schemaName;
    }

    public SchemaVersionSchemaArgs(
        @Nullable Input<String> registryName,
        @Nullable Input<String> schemaArn,
        @Nullable Input<String> schemaName) {
        this.registryName = registryName;
        this.schemaArn = schemaArn;
        this.schemaName = schemaName;
    }

    private SchemaVersionSchemaArgs() {
        this.registryName = Input.empty();
        this.schemaArn = Input.empty();
        this.schemaName = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(SchemaVersionSchemaArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<String> registryName;
        private @Nullable Input<String> schemaArn;
        private @Nullable Input<String> schemaName;

        public Builder() {
    	      // Empty
        }

        public Builder(SchemaVersionSchemaArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.registryName = defaults.registryName;
    	      this.schemaArn = defaults.schemaArn;
    	      this.schemaName = defaults.schemaName;
        }

        public Builder setRegistryName(@Nullable Input<String> registryName) {
            this.registryName = registryName;
            return this;
        }

        public Builder setRegistryName(@Nullable String registryName) {
            this.registryName = Input.ofNullable(registryName);
            return this;
        }

        public Builder setSchemaArn(@Nullable Input<String> schemaArn) {
            this.schemaArn = schemaArn;
            return this;
        }

        public Builder setSchemaArn(@Nullable String schemaArn) {
            this.schemaArn = Input.ofNullable(schemaArn);
            return this;
        }

        public Builder setSchemaName(@Nullable Input<String> schemaName) {
            this.schemaName = schemaName;
            return this;
        }

        public Builder setSchemaName(@Nullable String schemaName) {
            this.schemaName = Input.ofNullable(schemaName);
            return this;
        }

        public SchemaVersionSchemaArgs build() {
            return new SchemaVersionSchemaArgs(registryName, schemaArn, schemaName);
        }
    }
}
