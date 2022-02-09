// *** WARNING: this file was generated by test. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.example.mod1.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.internal.annotations.InputImport;
import io.pulumi.example.Utilities;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


public final class TypArgs extends io.pulumi.resources.ResourceArgs {

    public static final TypArgs Empty = new TypArgs();

    @InputImport(name="val")
    private final @Nullable Input<String> val;

    public Input<String> getVal() {
        return this.val == null ? Input.empty() : this.val;
    }

    public TypArgs(@Nullable Input<String> val) {
        this.val = val == null ? Input.ofNullable(Utilities.getEnv("PULUMI_EXAMPLE_MOD1_DEFAULT").orElse(null) == null ? "mod1" : Utilities.getEnv("PULUMI_EXAMPLE_MOD1_DEFAULT").orElse(null)) : val;
    }

    private TypArgs() {
        this.val = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(TypArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<String> val;

        public Builder() {
    	      // Empty
        }

        public Builder(TypArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.val = defaults.val;
        }

        public Builder setVal(@Nullable Input<String> val) {
            this.val = val;
            return this;
        }

        public Builder setVal(@Nullable String val) {
            this.val = Input.ofNullable(val);
            return this;
        }

        public TypArgs build() {
            return new TypArgs(val);
        }
    }
}
