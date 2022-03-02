// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.kinesisanalyticsv2.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class ApplicationApplicationConfigurationSqlApplicationConfigurationInputInputSchemaRecordColumn {
    /**
     * A reference to the data element in the streaming input or the reference data source.
     * 
     */
    private final @Nullable String mapping;
    /**
     * The name of the column that is created in the in-application input stream or reference table.
     * 
     */
    private final String name;
    /**
     * The type of column created in the in-application input stream or reference table.
     * 
     */
    private final String sqlType;

    @OutputCustomType.Constructor({"mapping","name","sqlType"})
    private ApplicationApplicationConfigurationSqlApplicationConfigurationInputInputSchemaRecordColumn(
        @Nullable String mapping,
        String name,
        String sqlType) {
        this.mapping = mapping;
        this.name = Objects.requireNonNull(name);
        this.sqlType = Objects.requireNonNull(sqlType);
    }

    /**
     * A reference to the data element in the streaming input or the reference data source.
     * 
    */
    public Optional<String> getMapping() {
        return Optional.ofNullable(this.mapping);
    }
    /**
     * The name of the column that is created in the in-application input stream or reference table.
     * 
    */
    public String getName() {
        return this.name;
    }
    /**
     * The type of column created in the in-application input stream or reference table.
     * 
    */
    public String getSqlType() {
        return this.sqlType;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ApplicationApplicationConfigurationSqlApplicationConfigurationInputInputSchemaRecordColumn defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String mapping;
        private String name;
        private String sqlType;

        public Builder() {
    	      // Empty
        }

        public Builder(ApplicationApplicationConfigurationSqlApplicationConfigurationInputInputSchemaRecordColumn defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.mapping = defaults.mapping;
    	      this.name = defaults.name;
    	      this.sqlType = defaults.sqlType;
        }

        public Builder setMapping(@Nullable String mapping) {
            this.mapping = mapping;
            return this;
        }

        public Builder setName(String name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }

        public Builder setSqlType(String sqlType) {
            this.sqlType = Objects.requireNonNull(sqlType);
            return this;
        }
        public ApplicationApplicationConfigurationSqlApplicationConfigurationInputInputSchemaRecordColumn build() {
            return new ApplicationApplicationConfigurationSqlApplicationConfigurationInputInputSchemaRecordColumn(mapping, name, sqlType);
        }
    }
}
