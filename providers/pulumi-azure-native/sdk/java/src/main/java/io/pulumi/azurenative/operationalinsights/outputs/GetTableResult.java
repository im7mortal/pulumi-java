// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.operationalinsights.outputs;

import io.pulumi.azurenative.operationalinsights.outputs.RestoredLogsResponse;
import io.pulumi.azurenative.operationalinsights.outputs.ResultStatisticsResponse;
import io.pulumi.azurenative.operationalinsights.outputs.SchemaResponse;
import io.pulumi.azurenative.operationalinsights.outputs.SearchResultsResponse;
import io.pulumi.azurenative.operationalinsights.outputs.SystemDataResponse;
import io.pulumi.core.internal.annotations.OutputCustomType;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class GetTableResult {
    private final Integer archiveRetentionInDays;
    private final String id;
    private final String lastPlanModifiedDate;
    private final String name;
    private final @Nullable String plan;
    private final String provisioningState;
    private final @Nullable RestoredLogsResponse restoredLogs;
    private final @Nullable ResultStatisticsResponse resultStatistics;
    private final @Nullable Integer retentionInDays;
    private final @Nullable SchemaResponse schema;
    private final @Nullable SearchResultsResponse searchResults;
    private final SystemDataResponse systemData;
    private final @Nullable Integer totalRetentionInDays;
    private final String type;

    @OutputCustomType.Constructor({"archiveRetentionInDays","id","lastPlanModifiedDate","name","plan","provisioningState","restoredLogs","resultStatistics","retentionInDays","schema","searchResults","systemData","totalRetentionInDays","type"})
    private GetTableResult(
        Integer archiveRetentionInDays,
        String id,
        String lastPlanModifiedDate,
        String name,
        @Nullable String plan,
        String provisioningState,
        @Nullable RestoredLogsResponse restoredLogs,
        @Nullable ResultStatisticsResponse resultStatistics,
        @Nullable Integer retentionInDays,
        @Nullable SchemaResponse schema,
        @Nullable SearchResultsResponse searchResults,
        SystemDataResponse systemData,
        @Nullable Integer totalRetentionInDays,
        String type) {
        this.archiveRetentionInDays = Objects.requireNonNull(archiveRetentionInDays);
        this.id = Objects.requireNonNull(id);
        this.lastPlanModifiedDate = Objects.requireNonNull(lastPlanModifiedDate);
        this.name = Objects.requireNonNull(name);
        this.plan = plan;
        this.provisioningState = Objects.requireNonNull(provisioningState);
        this.restoredLogs = restoredLogs;
        this.resultStatistics = resultStatistics;
        this.retentionInDays = retentionInDays;
        this.schema = schema;
        this.searchResults = searchResults;
        this.systemData = Objects.requireNonNull(systemData);
        this.totalRetentionInDays = totalRetentionInDays;
        this.type = Objects.requireNonNull(type);
    }

    public Integer getArchiveRetentionInDays() {
        return this.archiveRetentionInDays;
    }
    public String getId() {
        return this.id;
    }
    public String getLastPlanModifiedDate() {
        return this.lastPlanModifiedDate;
    }
    public String getName() {
        return this.name;
    }
    public Optional<String> getPlan() {
        return Optional.ofNullable(this.plan);
    }
    public String getProvisioningState() {
        return this.provisioningState;
    }
    public Optional<RestoredLogsResponse> getRestoredLogs() {
        return Optional.ofNullable(this.restoredLogs);
    }
    public Optional<ResultStatisticsResponse> getResultStatistics() {
        return Optional.ofNullable(this.resultStatistics);
    }
    public Optional<Integer> getRetentionInDays() {
        return Optional.ofNullable(this.retentionInDays);
    }
    public Optional<SchemaResponse> getSchema() {
        return Optional.ofNullable(this.schema);
    }
    public Optional<SearchResultsResponse> getSearchResults() {
        return Optional.ofNullable(this.searchResults);
    }
    public SystemDataResponse getSystemData() {
        return this.systemData;
    }
    public Optional<Integer> getTotalRetentionInDays() {
        return Optional.ofNullable(this.totalRetentionInDays);
    }
    public String getType() {
        return this.type;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetTableResult defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Integer archiveRetentionInDays;
        private String id;
        private String lastPlanModifiedDate;
        private String name;
        private @Nullable String plan;
        private String provisioningState;
        private @Nullable RestoredLogsResponse restoredLogs;
        private @Nullable ResultStatisticsResponse resultStatistics;
        private @Nullable Integer retentionInDays;
        private @Nullable SchemaResponse schema;
        private @Nullable SearchResultsResponse searchResults;
        private SystemDataResponse systemData;
        private @Nullable Integer totalRetentionInDays;
        private String type;

        public Builder() {
    	      // Empty
        }

        public Builder(GetTableResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.archiveRetentionInDays = defaults.archiveRetentionInDays;
    	      this.id = defaults.id;
    	      this.lastPlanModifiedDate = defaults.lastPlanModifiedDate;
    	      this.name = defaults.name;
    	      this.plan = defaults.plan;
    	      this.provisioningState = defaults.provisioningState;
    	      this.restoredLogs = defaults.restoredLogs;
    	      this.resultStatistics = defaults.resultStatistics;
    	      this.retentionInDays = defaults.retentionInDays;
    	      this.schema = defaults.schema;
    	      this.searchResults = defaults.searchResults;
    	      this.systemData = defaults.systemData;
    	      this.totalRetentionInDays = defaults.totalRetentionInDays;
    	      this.type = defaults.type;
        }

        public Builder setArchiveRetentionInDays(Integer archiveRetentionInDays) {
            this.archiveRetentionInDays = Objects.requireNonNull(archiveRetentionInDays);
            return this;
        }

        public Builder setId(String id) {
            this.id = Objects.requireNonNull(id);
            return this;
        }

        public Builder setLastPlanModifiedDate(String lastPlanModifiedDate) {
            this.lastPlanModifiedDate = Objects.requireNonNull(lastPlanModifiedDate);
            return this;
        }

        public Builder setName(String name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }

        public Builder setPlan(@Nullable String plan) {
            this.plan = plan;
            return this;
        }

        public Builder setProvisioningState(String provisioningState) {
            this.provisioningState = Objects.requireNonNull(provisioningState);
            return this;
        }

        public Builder setRestoredLogs(@Nullable RestoredLogsResponse restoredLogs) {
            this.restoredLogs = restoredLogs;
            return this;
        }

        public Builder setResultStatistics(@Nullable ResultStatisticsResponse resultStatistics) {
            this.resultStatistics = resultStatistics;
            return this;
        }

        public Builder setRetentionInDays(@Nullable Integer retentionInDays) {
            this.retentionInDays = retentionInDays;
            return this;
        }

        public Builder setSchema(@Nullable SchemaResponse schema) {
            this.schema = schema;
            return this;
        }

        public Builder setSearchResults(@Nullable SearchResultsResponse searchResults) {
            this.searchResults = searchResults;
            return this;
        }

        public Builder setSystemData(SystemDataResponse systemData) {
            this.systemData = Objects.requireNonNull(systemData);
            return this;
        }

        public Builder setTotalRetentionInDays(@Nullable Integer totalRetentionInDays) {
            this.totalRetentionInDays = totalRetentionInDays;
            return this;
        }

        public Builder setType(String type) {
            this.type = Objects.requireNonNull(type);
            return this;
        }

        public GetTableResult build() {
            return new GetTableResult(archiveRetentionInDays, id, lastPlanModifiedDate, name, plan, provisioningState, restoredLogs, resultStatistics, retentionInDays, schema, searchResults, systemData, totalRetentionInDays, type);
        }
    }
}