// *** WARNING: this file was generated by test. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.mypkg.inputs;

import io.pulumi.core.internal.annotations.InputImport;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class FuncWithListParamArgs extends io.pulumi.resources.InvokeArgs {

    public static final FuncWithListParamArgs Empty = new FuncWithListParamArgs();

    @InputImport(name="a")
    private final @Nullable List<String> a;

    public List<String> getA() {
        return this.a == null ? List.of() : this.a;
    }

    @InputImport(name="b")
    private final @Nullable String b;

    public Optional<String> getB() {
        return this.b == null ? Optional.empty() : Optional.ofNullable(this.b);
    }

    public FuncWithListParamArgs(
        @Nullable List<String> a,
        @Nullable String b) {
        this.a = a;
        this.b = b;
    }

    private FuncWithListParamArgs() {
        this.a = List.of();
        this.b = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(FuncWithListParamArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable List<String> a;
        private @Nullable String b;

        public Builder() {
    	      // Empty
        }

        public Builder(FuncWithListParamArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.a = defaults.a;
    	      this.b = defaults.b;
        }

        public Builder setA(@Nullable List<String> a) {
            this.a = a;
            return this;
        }

        public Builder setB(@Nullable String b) {
            this.b = b;
            return this;
        }

        public FuncWithListParamArgs build() {
            return new FuncWithListParamArgs(a, b);
        }
    }
}
