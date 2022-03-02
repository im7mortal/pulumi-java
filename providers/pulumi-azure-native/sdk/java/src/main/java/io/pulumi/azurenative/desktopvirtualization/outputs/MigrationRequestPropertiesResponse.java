// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.desktopvirtualization.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class MigrationRequestPropertiesResponse {
    /**
     * The path to the legacy object to migrate.
     * 
     */
    private final @Nullable String migrationPath;
    /**
     * The type of operation for migration.
     * 
     */
    private final @Nullable String operation;

    @OutputCustomType.Constructor({"migrationPath","operation"})
    private MigrationRequestPropertiesResponse(
        @Nullable String migrationPath,
        @Nullable String operation) {
        this.migrationPath = migrationPath;
        this.operation = operation;
    }

    /**
     * The path to the legacy object to migrate.
     * 
    */
    public Optional<String> getMigrationPath() {
        return Optional.ofNullable(this.migrationPath);
    }
    /**
     * The type of operation for migration.
     * 
    */
    public Optional<String> getOperation() {
        return Optional.ofNullable(this.operation);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(MigrationRequestPropertiesResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String migrationPath;
        private @Nullable String operation;

        public Builder() {
    	      // Empty
        }

        public Builder(MigrationRequestPropertiesResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.migrationPath = defaults.migrationPath;
    	      this.operation = defaults.operation;
        }

        public Builder setMigrationPath(@Nullable String migrationPath) {
            this.migrationPath = migrationPath;
            return this;
        }

        public Builder setOperation(@Nullable String operation) {
            this.operation = operation;
            return this;
        }
        public MigrationRequestPropertiesResponse build() {
            return new MigrationRequestPropertiesResponse(migrationPath, operation);
        }
    }
}
