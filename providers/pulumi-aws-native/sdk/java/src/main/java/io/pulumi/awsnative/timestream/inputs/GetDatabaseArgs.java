// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.timestream.inputs;

import io.pulumi.core.internal.annotations.InputImport;
import java.lang.String;
import java.util.Objects;


public final class GetDatabaseArgs extends io.pulumi.resources.InvokeArgs {

    public static final GetDatabaseArgs Empty = new GetDatabaseArgs();

    /**
     * The name for the database. If you don't specify a name, AWS CloudFormation generates a unique physical ID and uses that ID for the database name.
     * 
     */
    @InputImport(name="databaseName", required=true)
    private final String databaseName;

    public String getDatabaseName() {
        return this.databaseName;
    }

    public GetDatabaseArgs(String databaseName) {
        this.databaseName = Objects.requireNonNull(databaseName, "expected parameter 'databaseName' to be non-null");
    }

    private GetDatabaseArgs() {
        this.databaseName = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetDatabaseArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String databaseName;

        public Builder() {
    	      // Empty
        }

        public Builder(GetDatabaseArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.databaseName = defaults.databaseName;
        }

        public Builder setDatabaseName(String databaseName) {
            this.databaseName = Objects.requireNonNull(databaseName);
            return this;
        }

        public GetDatabaseArgs build() {
            return new GetDatabaseArgs(databaseName);
        }
    }
}
