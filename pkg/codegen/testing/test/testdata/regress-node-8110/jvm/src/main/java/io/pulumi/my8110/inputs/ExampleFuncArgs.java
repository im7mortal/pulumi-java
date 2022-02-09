// *** WARNING: this file was generated by test. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.my8110.inputs;

import io.pulumi.core.Either;
import io.pulumi.core.internal.annotations.InputImport;
import io.pulumi.my8110.enums.MyEnum;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class ExampleFuncArgs extends io.pulumi.resources.InvokeArgs {

    public static final ExampleFuncArgs Empty = new ExampleFuncArgs();

    @InputImport(name="enums")
    private final @Nullable List<Either<String,MyEnum>> enums;

    public List<Either<String,MyEnum>> getEnums() {
        return this.enums == null ? List.of() : this.enums;
    }

    public ExampleFuncArgs(@Nullable List<Either<String,MyEnum>> enums) {
        this.enums = enums;
    }

    private ExampleFuncArgs() {
        this.enums = List.of();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ExampleFuncArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable List<Either<String,MyEnum>> enums;

        public Builder() {
    	      // Empty
        }

        public Builder(ExampleFuncArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.enums = defaults.enums;
        }

        public Builder setEnums(@Nullable List<Either<String,MyEnum>> enums) {
            this.enums = enums;
            return this;
        }

        public ExampleFuncArgs build() {
            return new ExampleFuncArgs(enums);
        }
    }
}
