// *** WARNING: this file was generated by test. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.example.outputs;

import io.pulumi.core.internal.annotations.OutputCustomType;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class OutputOnlyObjectType {
    private final @Nullable String foo;

    @OutputCustomType.Constructor({"foo"})
    private OutputOnlyObjectType(@Nullable String foo) {
        this.foo = foo;
    }

    public Optional<String> getFoo() {
        return Optional.ofNullable(this.foo);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(OutputOnlyObjectType defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String foo;

        public Builder() {
    	      // Empty
        }

        public Builder(OutputOnlyObjectType defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.foo = defaults.foo;
        }

        public Builder setFoo(@Nullable String foo) {
            this.foo = foo;
            return this;
        }

        public OutputOnlyObjectType build() {
            return new OutputOnlyObjectType(foo);
        }
    }
}
