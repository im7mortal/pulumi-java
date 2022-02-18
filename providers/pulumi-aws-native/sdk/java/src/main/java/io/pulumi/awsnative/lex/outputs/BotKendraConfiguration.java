// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.lex.outputs;

import io.pulumi.core.internal.annotations.OutputCustomType;
import java.lang.Boolean;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class BotKendraConfiguration {
    private final String kendraIndex;
    private final @Nullable String queryFilterString;
    /**
     * Determines whether the AMAZON.KendraSearchIntent intent uses a custom query string to query the Amazon Kendra index.
     * 
     */
    private final @Nullable Boolean queryFilterStringEnabled;

    @OutputCustomType.Constructor({"kendraIndex","queryFilterString","queryFilterStringEnabled"})
    private BotKendraConfiguration(
        String kendraIndex,
        @Nullable String queryFilterString,
        @Nullable Boolean queryFilterStringEnabled) {
        this.kendraIndex = Objects.requireNonNull(kendraIndex);
        this.queryFilterString = queryFilterString;
        this.queryFilterStringEnabled = queryFilterStringEnabled;
    }

    public String getKendraIndex() {
        return this.kendraIndex;
    }
    public Optional<String> getQueryFilterString() {
        return Optional.ofNullable(this.queryFilterString);
    }
    /**
     * Determines whether the AMAZON.KendraSearchIntent intent uses a custom query string to query the Amazon Kendra index.
     * 
     */
    public Optional<Boolean> getQueryFilterStringEnabled() {
        return Optional.ofNullable(this.queryFilterStringEnabled);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(BotKendraConfiguration defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String kendraIndex;
        private @Nullable String queryFilterString;
        private @Nullable Boolean queryFilterStringEnabled;

        public Builder() {
    	      // Empty
        }

        public Builder(BotKendraConfiguration defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.kendraIndex = defaults.kendraIndex;
    	      this.queryFilterString = defaults.queryFilterString;
    	      this.queryFilterStringEnabled = defaults.queryFilterStringEnabled;
        }

        public Builder setKendraIndex(String kendraIndex) {
            this.kendraIndex = Objects.requireNonNull(kendraIndex);
            return this;
        }

        public Builder setQueryFilterString(@Nullable String queryFilterString) {
            this.queryFilterString = queryFilterString;
            return this;
        }

        public Builder setQueryFilterStringEnabled(@Nullable Boolean queryFilterStringEnabled) {
            this.queryFilterStringEnabled = queryFilterStringEnabled;
            return this;
        }

        public BotKendraConfiguration build() {
            return new BotKendraConfiguration(kendraIndex, queryFilterString, queryFilterStringEnabled);
        }
    }
}
