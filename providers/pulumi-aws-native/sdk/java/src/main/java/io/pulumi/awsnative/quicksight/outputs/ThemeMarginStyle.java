// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.quicksight.outputs;

import io.pulumi.core.internal.annotations.OutputCustomType;
import java.lang.Boolean;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class ThemeMarginStyle {
    /**
     * <p>This Boolean value controls whether to display sheet margins.</p>
     * 
     */
    private final @Nullable Boolean show;

    @OutputCustomType.Constructor({"show"})
    private ThemeMarginStyle(@Nullable Boolean show) {
        this.show = show;
    }

    /**
     * <p>This Boolean value controls whether to display sheet margins.</p>
     * 
     */
    public Optional<Boolean> getShow() {
        return Optional.ofNullable(this.show);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ThemeMarginStyle defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Boolean show;

        public Builder() {
    	      // Empty
        }

        public Builder(ThemeMarginStyle defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.show = defaults.show;
        }

        public Builder setShow(@Nullable Boolean show) {
            this.show = show;
            return this;
        }

        public ThemeMarginStyle build() {
            return new ThemeMarginStyle(show);
        }
    }
}
