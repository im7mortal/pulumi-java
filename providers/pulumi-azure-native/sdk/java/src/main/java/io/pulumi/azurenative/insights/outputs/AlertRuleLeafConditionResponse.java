// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.insights.outputs;

import io.pulumi.core.internal.annotations.OutputCustomType;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class AlertRuleLeafConditionResponse {
    private final @Nullable List<String> containsAny;
    private final @Nullable String equals;
    private final @Nullable String field;

    @OutputCustomType.Constructor({"containsAny","equals","field"})
    private AlertRuleLeafConditionResponse(
        @Nullable List<String> containsAny,
        @Nullable String equals,
        @Nullable String field) {
        this.containsAny = containsAny;
        this.equals = equals;
        this.field = field;
    }

    public List<String> getContainsAny() {
        return this.containsAny == null ? List.of() : this.containsAny;
    }
    public Optional<String> getEquals() {
        return Optional.ofNullable(this.equals);
    }
    public Optional<String> getField() {
        return Optional.ofNullable(this.field);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(AlertRuleLeafConditionResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable List<String> containsAny;
        private @Nullable String equals;
        private @Nullable String field;

        public Builder() {
    	      // Empty
        }

        public Builder(AlertRuleLeafConditionResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.containsAny = defaults.containsAny;
    	      this.equals = defaults.equals;
    	      this.field = defaults.field;
        }

        public Builder setContainsAny(@Nullable List<String> containsAny) {
            this.containsAny = containsAny;
            return this;
        }

        public Builder setEquals(@Nullable String equals) {
            this.equals = equals;
            return this;
        }

        public Builder setField(@Nullable String field) {
            this.field = field;
            return this;
        }

        public AlertRuleLeafConditionResponse build() {
            return new AlertRuleLeafConditionResponse(containsAny, equals, field);
        }
    }
}