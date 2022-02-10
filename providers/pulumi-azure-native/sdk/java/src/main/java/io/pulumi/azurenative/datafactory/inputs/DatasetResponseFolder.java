// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.datafactory.inputs;

import io.pulumi.core.internal.annotations.InputImport;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class DatasetResponseFolder extends io.pulumi.resources.InvokeArgs {

    public static final DatasetResponseFolder Empty = new DatasetResponseFolder();

    @InputImport(name="name")
    private final @Nullable String name;

    public Optional<String> getName() {
        return this.name == null ? Optional.empty() : Optional.ofNullable(this.name);
    }

    public DatasetResponseFolder(@Nullable String name) {
        this.name = name;
    }

    private DatasetResponseFolder() {
        this.name = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(DatasetResponseFolder defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String name;

        public Builder() {
    	      // Empty
        }

        public Builder(DatasetResponseFolder defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.name = defaults.name;
        }

        public Builder setName(@Nullable String name) {
            this.name = name;
            return this;
        }

        public DatasetResponseFolder build() {
            return new DatasetResponseFolder(name);
        }
    }
}