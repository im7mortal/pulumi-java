// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.eventgrid.inputs;

import io.pulumi.azurenative.eventgrid.inputs.BoolEqualsAdvancedFilterResponse;
import io.pulumi.azurenative.eventgrid.inputs.NumberGreaterThanAdvancedFilterResponse;
import io.pulumi.azurenative.eventgrid.inputs.NumberGreaterThanOrEqualsAdvancedFilterResponse;
import io.pulumi.azurenative.eventgrid.inputs.NumberInAdvancedFilterResponse;
import io.pulumi.azurenative.eventgrid.inputs.NumberLessThanAdvancedFilterResponse;
import io.pulumi.azurenative.eventgrid.inputs.NumberLessThanOrEqualsAdvancedFilterResponse;
import io.pulumi.azurenative.eventgrid.inputs.NumberNotInAdvancedFilterResponse;
import io.pulumi.azurenative.eventgrid.inputs.StringBeginsWithAdvancedFilterResponse;
import io.pulumi.azurenative.eventgrid.inputs.StringContainsAdvancedFilterResponse;
import io.pulumi.azurenative.eventgrid.inputs.StringEndsWithAdvancedFilterResponse;
import io.pulumi.azurenative.eventgrid.inputs.StringInAdvancedFilterResponse;
import io.pulumi.azurenative.eventgrid.inputs.StringNotInAdvancedFilterResponse;
import io.pulumi.core.internal.annotations.InputImport;
import java.lang.Boolean;
import java.lang.Object;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class EventSubscriptionFilterResponse extends io.pulumi.resources.InvokeArgs {

    public static final EventSubscriptionFilterResponse Empty = new EventSubscriptionFilterResponse();

    @InputImport(name="advancedFilters")
    private final @Nullable List<Object> advancedFilters;

    public List<Object> getAdvancedFilters() {
        return this.advancedFilters == null ? List.of() : this.advancedFilters;
    }

    @InputImport(name="includedEventTypes")
    private final @Nullable List<String> includedEventTypes;

    public List<String> getIncludedEventTypes() {
        return this.includedEventTypes == null ? List.of() : this.includedEventTypes;
    }

    @InputImport(name="isSubjectCaseSensitive")
    private final @Nullable Boolean isSubjectCaseSensitive;

    public Optional<Boolean> getIsSubjectCaseSensitive() {
        return this.isSubjectCaseSensitive == null ? Optional.empty() : Optional.ofNullable(this.isSubjectCaseSensitive);
    }

    @InputImport(name="subjectBeginsWith")
    private final @Nullable String subjectBeginsWith;

    public Optional<String> getSubjectBeginsWith() {
        return this.subjectBeginsWith == null ? Optional.empty() : Optional.ofNullable(this.subjectBeginsWith);
    }

    @InputImport(name="subjectEndsWith")
    private final @Nullable String subjectEndsWith;

    public Optional<String> getSubjectEndsWith() {
        return this.subjectEndsWith == null ? Optional.empty() : Optional.ofNullable(this.subjectEndsWith);
    }

    public EventSubscriptionFilterResponse(
        @Nullable List<Object> advancedFilters,
        @Nullable List<String> includedEventTypes,
        @Nullable Boolean isSubjectCaseSensitive,
        @Nullable String subjectBeginsWith,
        @Nullable String subjectEndsWith) {
        this.advancedFilters = advancedFilters;
        this.includedEventTypes = includedEventTypes;
        this.isSubjectCaseSensitive = isSubjectCaseSensitive == null ? false : isSubjectCaseSensitive;
        this.subjectBeginsWith = subjectBeginsWith;
        this.subjectEndsWith = subjectEndsWith;
    }

    private EventSubscriptionFilterResponse() {
        this.advancedFilters = List.of();
        this.includedEventTypes = List.of();
        this.isSubjectCaseSensitive = null;
        this.subjectBeginsWith = null;
        this.subjectEndsWith = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(EventSubscriptionFilterResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable List<Object> advancedFilters;
        private @Nullable List<String> includedEventTypes;
        private @Nullable Boolean isSubjectCaseSensitive;
        private @Nullable String subjectBeginsWith;
        private @Nullable String subjectEndsWith;

        public Builder() {
    	      // Empty
        }

        public Builder(EventSubscriptionFilterResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.advancedFilters = defaults.advancedFilters;
    	      this.includedEventTypes = defaults.includedEventTypes;
    	      this.isSubjectCaseSensitive = defaults.isSubjectCaseSensitive;
    	      this.subjectBeginsWith = defaults.subjectBeginsWith;
    	      this.subjectEndsWith = defaults.subjectEndsWith;
        }

        public Builder setAdvancedFilters(@Nullable List<Object> advancedFilters) {
            this.advancedFilters = advancedFilters;
            return this;
        }

        public Builder setIncludedEventTypes(@Nullable List<String> includedEventTypes) {
            this.includedEventTypes = includedEventTypes;
            return this;
        }

        public Builder setIsSubjectCaseSensitive(@Nullable Boolean isSubjectCaseSensitive) {
            this.isSubjectCaseSensitive = isSubjectCaseSensitive;
            return this;
        }

        public Builder setSubjectBeginsWith(@Nullable String subjectBeginsWith) {
            this.subjectBeginsWith = subjectBeginsWith;
            return this;
        }

        public Builder setSubjectEndsWith(@Nullable String subjectEndsWith) {
            this.subjectEndsWith = subjectEndsWith;
            return this;
        }

        public EventSubscriptionFilterResponse build() {
            return new EventSubscriptionFilterResponse(advancedFilters, includedEventTypes, isSubjectCaseSensitive, subjectBeginsWith, subjectEndsWith);
        }
    }
}