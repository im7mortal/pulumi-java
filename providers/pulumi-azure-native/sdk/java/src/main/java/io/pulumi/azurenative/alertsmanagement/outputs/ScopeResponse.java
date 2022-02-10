// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.alertsmanagement.outputs;

import io.pulumi.core.internal.annotations.OutputCustomType;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class ScopeResponse {
    private final @Nullable String scopeType;
    private final @Nullable List<String> values;

    @OutputCustomType.Constructor({"scopeType","values"})
    private ScopeResponse(
        @Nullable String scopeType,
        @Nullable List<String> values) {
        this.scopeType = scopeType;
        this.values = values;
    }

    public Optional<String> getScopeType() {
        return Optional.ofNullable(this.scopeType);
    }
    public List<String> getValues() {
        return this.values == null ? List.of() : this.values;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ScopeResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String scopeType;
        private @Nullable List<String> values;

        public Builder() {
    	      // Empty
        }

        public Builder(ScopeResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.scopeType = defaults.scopeType;
    	      this.values = defaults.values;
        }

        public Builder setScopeType(@Nullable String scopeType) {
            this.scopeType = scopeType;
            return this;
        }

        public Builder setValues(@Nullable List<String> values) {
            this.values = values;
            return this;
        }

        public ScopeResponse build() {
            return new ScopeResponse(scopeType, values);
        }
    }
}