// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.quicksight.outputs;

import io.pulumi.core.internal.annotations.OutputCustomType;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class TemplateColumnGroupColumnSchema {
    /**
     * <p>The name of the column group's column schema.</p>
     * 
     */
    private final @Nullable String name;

    @OutputCustomType.Constructor({"name"})
    private TemplateColumnGroupColumnSchema(@Nullable String name) {
        this.name = name;
    }

    /**
     * <p>The name of the column group's column schema.</p>
     * 
     */
    public Optional<String> getName() {
        return Optional.ofNullable(this.name);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(TemplateColumnGroupColumnSchema defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String name;

        public Builder() {
    	      // Empty
        }

        public Builder(TemplateColumnGroupColumnSchema defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.name = defaults.name;
        }

        public Builder setName(@Nullable String name) {
            this.name = name;
            return this;
        }

        public TemplateColumnGroupColumnSchema build() {
            return new TemplateColumnGroupColumnSchema(name);
        }
    }
}
