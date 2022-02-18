// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.glue;

import io.pulumi.awsnative.glue.inputs.SchemaVersionSchemaArgs;
import io.pulumi.core.Input;
import io.pulumi.core.internal.annotations.InputImport;
import java.lang.String;
import java.util.Objects;


public final class SchemaVersionArgs extends io.pulumi.resources.ResourceArgs {

    public static final SchemaVersionArgs Empty = new SchemaVersionArgs();

    @InputImport(name="schema", required=true)
    private final Input<SchemaVersionSchemaArgs> schema;

    public Input<SchemaVersionSchemaArgs> getSchema() {
        return this.schema;
    }

    /**
     * Complete definition of the schema in plain-text.
     * 
     */
    @InputImport(name="schemaDefinition", required=true)
    private final Input<String> schemaDefinition;

    public Input<String> getSchemaDefinition() {
        return this.schemaDefinition;
    }

    public SchemaVersionArgs(
        Input<SchemaVersionSchemaArgs> schema,
        Input<String> schemaDefinition) {
        this.schema = Objects.requireNonNull(schema, "expected parameter 'schema' to be non-null");
        this.schemaDefinition = Objects.requireNonNull(schemaDefinition, "expected parameter 'schemaDefinition' to be non-null");
    }

    private SchemaVersionArgs() {
        this.schema = Input.empty();
        this.schemaDefinition = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(SchemaVersionArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Input<SchemaVersionSchemaArgs> schema;
        private Input<String> schemaDefinition;

        public Builder() {
    	      // Empty
        }

        public Builder(SchemaVersionArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.schema = defaults.schema;
    	      this.schemaDefinition = defaults.schemaDefinition;
        }

        public Builder setSchema(Input<SchemaVersionSchemaArgs> schema) {
            this.schema = Objects.requireNonNull(schema);
            return this;
        }

        public Builder setSchema(SchemaVersionSchemaArgs schema) {
            this.schema = Input.of(Objects.requireNonNull(schema));
            return this;
        }

        public Builder setSchemaDefinition(Input<String> schemaDefinition) {
            this.schemaDefinition = Objects.requireNonNull(schemaDefinition);
            return this;
        }

        public Builder setSchemaDefinition(String schemaDefinition) {
            this.schemaDefinition = Input.of(Objects.requireNonNull(schemaDefinition));
            return this;
        }

        public SchemaVersionArgs build() {
            return new SchemaVersionArgs(schema, schemaDefinition);
        }
    }
}
