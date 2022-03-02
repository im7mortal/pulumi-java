// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.codebuild.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import java.lang.Boolean;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class WebhookFilterGroupFilter {
    /**
     * If set to `true`, the specified filter does *not* trigger a build. Defaults to `false`.
     * 
     */
    private final @Nullable Boolean excludeMatchedPattern;
    /**
     * For a filter that uses `EVENT` type, a comma-separated string that specifies one event: `PUSH`, `PULL_REQUEST_CREATED`, `PULL_REQUEST_UPDATED`, `PULL_REQUEST_REOPENED`. `PULL_REQUEST_MERGED` works with GitHub & GitHub Enterprise only. For a filter that uses any of the other filter types, a regular expression.
     * 
     */
    private final String pattern;
    /**
     * The webhook filter group's type. Valid values for this parameter are: `EVENT`, `BASE_REF`, `HEAD_REF`, `ACTOR_ACCOUNT_ID`, `FILE_PATH`, `COMMIT_MESSAGE`. At least one filter group must specify `EVENT` as its type.
     * 
     */
    private final String type;

    @OutputCustomType.Constructor({"excludeMatchedPattern","pattern","type"})
    private WebhookFilterGroupFilter(
        @Nullable Boolean excludeMatchedPattern,
        String pattern,
        String type) {
        this.excludeMatchedPattern = excludeMatchedPattern;
        this.pattern = Objects.requireNonNull(pattern);
        this.type = Objects.requireNonNull(type);
    }

    /**
     * If set to `true`, the specified filter does *not* trigger a build. Defaults to `false`.
     * 
    */
    public Optional<Boolean> getExcludeMatchedPattern() {
        return Optional.ofNullable(this.excludeMatchedPattern);
    }
    /**
     * For a filter that uses `EVENT` type, a comma-separated string that specifies one event: `PUSH`, `PULL_REQUEST_CREATED`, `PULL_REQUEST_UPDATED`, `PULL_REQUEST_REOPENED`. `PULL_REQUEST_MERGED` works with GitHub & GitHub Enterprise only. For a filter that uses any of the other filter types, a regular expression.
     * 
    */
    public String getPattern() {
        return this.pattern;
    }
    /**
     * The webhook filter group's type. Valid values for this parameter are: `EVENT`, `BASE_REF`, `HEAD_REF`, `ACTOR_ACCOUNT_ID`, `FILE_PATH`, `COMMIT_MESSAGE`. At least one filter group must specify `EVENT` as its type.
     * 
    */
    public String getType() {
        return this.type;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(WebhookFilterGroupFilter defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Boolean excludeMatchedPattern;
        private String pattern;
        private String type;

        public Builder() {
    	      // Empty
        }

        public Builder(WebhookFilterGroupFilter defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.excludeMatchedPattern = defaults.excludeMatchedPattern;
    	      this.pattern = defaults.pattern;
    	      this.type = defaults.type;
        }

        public Builder setExcludeMatchedPattern(@Nullable Boolean excludeMatchedPattern) {
            this.excludeMatchedPattern = excludeMatchedPattern;
            return this;
        }

        public Builder setPattern(String pattern) {
            this.pattern = Objects.requireNonNull(pattern);
            return this;
        }

        public Builder setType(String type) {
            this.type = Objects.requireNonNull(type);
            return this;
        }
        public WebhookFilterGroupFilter build() {
            return new WebhookFilterGroupFilter(excludeMatchedPattern, pattern, type);
        }
    }
}
