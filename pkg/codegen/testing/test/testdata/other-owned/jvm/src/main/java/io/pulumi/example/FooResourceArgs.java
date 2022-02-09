// *** WARNING: this file was generated by test. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.example;

import io.pulumi.core.Input;
import io.pulumi.core.internal.annotations.InputImport;
import io.pulumi.example.Resource;
import java.util.Objects;
import javax.annotation.Nullable;


public final class FooResourceArgs extends io.pulumi.resources.ResourceArgs {

    public static final FooResourceArgs Empty = new FooResourceArgs();

    @InputImport(name="foo")
    private final @Nullable Input<Resource> foo;

    public Input<Resource> getFoo() {
        return this.foo == null ? Input.empty() : this.foo;
    }

    public FooResourceArgs(@Nullable Input<Resource> foo) {
        this.foo = foo;
    }

    private FooResourceArgs() {
        this.foo = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(FooResourceArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<Resource> foo;

        public Builder() {
    	      // Empty
        }

        public Builder(FooResourceArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.foo = defaults.foo;
        }

        public Builder setFoo(@Nullable Input<Resource> foo) {
            this.foo = foo;
            return this;
        }

        public Builder setFoo(@Nullable Resource foo) {
            this.foo = Input.ofNullable(foo);
            return this;
        }

        public FooResourceArgs build() {
            return new FooResourceArgs(foo);
        }
    }
}
