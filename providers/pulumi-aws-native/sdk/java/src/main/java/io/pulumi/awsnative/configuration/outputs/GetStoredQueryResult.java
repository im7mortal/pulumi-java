// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.configuration.outputs;

import io.pulumi.awsnative.configuration.outputs.StoredQueryTag;
import io.pulumi.core.annotations.OutputCustomType;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class GetStoredQueryResult {
    private final @Nullable String queryArn;
    private final @Nullable String queryDescription;
    private final @Nullable String queryExpression;
    private final @Nullable String queryId;
    /**
     * The tags for the stored query.
     * 
     */
    private final @Nullable List<StoredQueryTag> tags;

    @OutputCustomType.Constructor({"queryArn","queryDescription","queryExpression","queryId","tags"})
    private GetStoredQueryResult(
        @Nullable String queryArn,
        @Nullable String queryDescription,
        @Nullable String queryExpression,
        @Nullable String queryId,
        @Nullable List<StoredQueryTag> tags) {
        this.queryArn = queryArn;
        this.queryDescription = queryDescription;
        this.queryExpression = queryExpression;
        this.queryId = queryId;
        this.tags = tags;
    }

    public Optional<String> getQueryArn() {
        return Optional.ofNullable(this.queryArn);
    }
    public Optional<String> getQueryDescription() {
        return Optional.ofNullable(this.queryDescription);
    }
    public Optional<String> getQueryExpression() {
        return Optional.ofNullable(this.queryExpression);
    }
    public Optional<String> getQueryId() {
        return Optional.ofNullable(this.queryId);
    }
    /**
     * The tags for the stored query.
     * 
    */
    public List<StoredQueryTag> getTags() {
        return this.tags == null ? List.of() : this.tags;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetStoredQueryResult defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String queryArn;
        private @Nullable String queryDescription;
        private @Nullable String queryExpression;
        private @Nullable String queryId;
        private @Nullable List<StoredQueryTag> tags;

        public Builder() {
    	      // Empty
        }

        public Builder(GetStoredQueryResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.queryArn = defaults.queryArn;
    	      this.queryDescription = defaults.queryDescription;
    	      this.queryExpression = defaults.queryExpression;
    	      this.queryId = defaults.queryId;
    	      this.tags = defaults.tags;
        }

        public Builder setQueryArn(@Nullable String queryArn) {
            this.queryArn = queryArn;
            return this;
        }

        public Builder setQueryDescription(@Nullable String queryDescription) {
            this.queryDescription = queryDescription;
            return this;
        }

        public Builder setQueryExpression(@Nullable String queryExpression) {
            this.queryExpression = queryExpression;
            return this;
        }

        public Builder setQueryId(@Nullable String queryId) {
            this.queryId = queryId;
            return this;
        }

        public Builder setTags(@Nullable List<StoredQueryTag> tags) {
            this.tags = tags;
            return this;
        }
        public GetStoredQueryResult build() {
            return new GetStoredQueryResult(queryArn, queryDescription, queryExpression, queryId, tags);
        }
    }
}
