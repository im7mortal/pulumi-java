// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.kubernetes.core_v1.outputs;

import io.pulumi.core.internal.annotations.OutputCustomType;
import io.pulumi.kubernetes.core_v1.outputs.ScopeSelector;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class ResourceQuotaSpec {
    private final @Nullable Map<String,String> hard;
    private final @Nullable ScopeSelector scopeSelector;
    private final @Nullable List<String> scopes;

    @OutputCustomType.Constructor({"hard","scopeSelector","scopes"})
    private ResourceQuotaSpec(
        @Nullable Map<String,String> hard,
        @Nullable ScopeSelector scopeSelector,
        @Nullable List<String> scopes) {
        this.hard = hard;
        this.scopeSelector = scopeSelector;
        this.scopes = scopes;
    }

    public Map<String,String> getHard() {
        return this.hard == null ? Map.of() : this.hard;
    }
    public Optional<ScopeSelector> getScopeSelector() {
        return Optional.ofNullable(this.scopeSelector);
    }
    public List<String> getScopes() {
        return this.scopes == null ? List.of() : this.scopes;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ResourceQuotaSpec defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Map<String,String> hard;
        private @Nullable ScopeSelector scopeSelector;
        private @Nullable List<String> scopes;

        public Builder() {
    	      // Empty
        }

        public Builder(ResourceQuotaSpec defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.hard = defaults.hard;
    	      this.scopeSelector = defaults.scopeSelector;
    	      this.scopes = defaults.scopes;
        }

        public Builder setHard(@Nullable Map<String,String> hard) {
            this.hard = hard;
            return this;
        }

        public Builder setScopeSelector(@Nullable ScopeSelector scopeSelector) {
            this.scopeSelector = scopeSelector;
            return this;
        }

        public Builder setScopes(@Nullable List<String> scopes) {
            this.scopes = scopes;
            return this;
        }

        public ResourceQuotaSpec build() {
            return new ResourceQuotaSpec(hard, scopeSelector, scopes);
        }
    }
}