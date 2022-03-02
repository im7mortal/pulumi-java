// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.operationalinsights.outputs;

import io.pulumi.azurenative.operationalinsights.outputs.ColumnResponse;
import io.pulumi.azurenative.operationalinsights.outputs.RestoredLogsResponse;
import io.pulumi.azurenative.operationalinsights.outputs.SearchResultsResponse;
import io.pulumi.core.annotations.OutputCustomType;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class SchemaResponse {
    /**
     * Table category.
     * 
     */
    private final List<String> categories;
    /**
     * A list of table custom columns.
     * 
     */
    private final @Nullable List<ColumnResponse> columns;
    /**
     * Table description.
     * 
     */
    private final @Nullable String description;
    /**
     * Table display name.
     * 
     */
    private final @Nullable String displayName;
    /**
     * Table labels.
     * 
     */
    private final List<String> labels;
    /**
     * Table name.
     * 
     */
    private final @Nullable String name;
    /**
     * Parameters of the restore operation that initiated this table.
     * 
     */
    private final RestoredLogsResponse restoredLogs;
    /**
     * Parameters of the search job that initiated this table.
     * 
     */
    private final SearchResultsResponse searchResults;
    /**
     * List of solutions the table is affiliated with
     * 
     */
    private final List<String> solutions;
    /**
     * Table's creator.
     * 
     */
    private final String source;
    /**
     * A list of table standard columns.
     * 
     */
    private final List<ColumnResponse> standardColumns;
    /**
     * The subtype describes what APIs can be used to interact with the table, and what features are available against it.
     * 
     */
    private final String tableSubType;
    /**
     * Table's creator.
     * 
     */
    private final String tableType;

    @OutputCustomType.Constructor({"categories","columns","description","displayName","labels","name","restoredLogs","searchResults","solutions","source","standardColumns","tableSubType","tableType"})
    private SchemaResponse(
        List<String> categories,
        @Nullable List<ColumnResponse> columns,
        @Nullable String description,
        @Nullable String displayName,
        List<String> labels,
        @Nullable String name,
        RestoredLogsResponse restoredLogs,
        SearchResultsResponse searchResults,
        List<String> solutions,
        String source,
        List<ColumnResponse> standardColumns,
        String tableSubType,
        String tableType) {
        this.categories = Objects.requireNonNull(categories);
        this.columns = columns;
        this.description = description;
        this.displayName = displayName;
        this.labels = Objects.requireNonNull(labels);
        this.name = name;
        this.restoredLogs = Objects.requireNonNull(restoredLogs);
        this.searchResults = Objects.requireNonNull(searchResults);
        this.solutions = Objects.requireNonNull(solutions);
        this.source = Objects.requireNonNull(source);
        this.standardColumns = Objects.requireNonNull(standardColumns);
        this.tableSubType = Objects.requireNonNull(tableSubType);
        this.tableType = Objects.requireNonNull(tableType);
    }

    /**
     * Table category.
     * 
    */
    public List<String> getCategories() {
        return this.categories;
    }
    /**
     * A list of table custom columns.
     * 
    */
    public List<ColumnResponse> getColumns() {
        return this.columns == null ? List.of() : this.columns;
    }
    /**
     * Table description.
     * 
    */
    public Optional<String> getDescription() {
        return Optional.ofNullable(this.description);
    }
    /**
     * Table display name.
     * 
    */
    public Optional<String> getDisplayName() {
        return Optional.ofNullable(this.displayName);
    }
    /**
     * Table labels.
     * 
    */
    public List<String> getLabels() {
        return this.labels;
    }
    /**
     * Table name.
     * 
    */
    public Optional<String> getName() {
        return Optional.ofNullable(this.name);
    }
    /**
     * Parameters of the restore operation that initiated this table.
     * 
    */
    public RestoredLogsResponse getRestoredLogs() {
        return this.restoredLogs;
    }
    /**
     * Parameters of the search job that initiated this table.
     * 
    */
    public SearchResultsResponse getSearchResults() {
        return this.searchResults;
    }
    /**
     * List of solutions the table is affiliated with
     * 
    */
    public List<String> getSolutions() {
        return this.solutions;
    }
    /**
     * Table's creator.
     * 
    */
    public String getSource() {
        return this.source;
    }
    /**
     * A list of table standard columns.
     * 
    */
    public List<ColumnResponse> getStandardColumns() {
        return this.standardColumns;
    }
    /**
     * The subtype describes what APIs can be used to interact with the table, and what features are available against it.
     * 
    */
    public String getTableSubType() {
        return this.tableSubType;
    }
    /**
     * Table's creator.
     * 
    */
    public String getTableType() {
        return this.tableType;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(SchemaResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private List<String> categories;
        private @Nullable List<ColumnResponse> columns;
        private @Nullable String description;
        private @Nullable String displayName;
        private List<String> labels;
        private @Nullable String name;
        private RestoredLogsResponse restoredLogs;
        private SearchResultsResponse searchResults;
        private List<String> solutions;
        private String source;
        private List<ColumnResponse> standardColumns;
        private String tableSubType;
        private String tableType;

        public Builder() {
    	      // Empty
        }

        public Builder(SchemaResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.categories = defaults.categories;
    	      this.columns = defaults.columns;
    	      this.description = defaults.description;
    	      this.displayName = defaults.displayName;
    	      this.labels = defaults.labels;
    	      this.name = defaults.name;
    	      this.restoredLogs = defaults.restoredLogs;
    	      this.searchResults = defaults.searchResults;
    	      this.solutions = defaults.solutions;
    	      this.source = defaults.source;
    	      this.standardColumns = defaults.standardColumns;
    	      this.tableSubType = defaults.tableSubType;
    	      this.tableType = defaults.tableType;
        }

        public Builder setCategories(List<String> categories) {
            this.categories = Objects.requireNonNull(categories);
            return this;
        }

        public Builder setColumns(@Nullable List<ColumnResponse> columns) {
            this.columns = columns;
            return this;
        }

        public Builder setDescription(@Nullable String description) {
            this.description = description;
            return this;
        }

        public Builder setDisplayName(@Nullable String displayName) {
            this.displayName = displayName;
            return this;
        }

        public Builder setLabels(List<String> labels) {
            this.labels = Objects.requireNonNull(labels);
            return this;
        }

        public Builder setName(@Nullable String name) {
            this.name = name;
            return this;
        }

        public Builder setRestoredLogs(RestoredLogsResponse restoredLogs) {
            this.restoredLogs = Objects.requireNonNull(restoredLogs);
            return this;
        }

        public Builder setSearchResults(SearchResultsResponse searchResults) {
            this.searchResults = Objects.requireNonNull(searchResults);
            return this;
        }

        public Builder setSolutions(List<String> solutions) {
            this.solutions = Objects.requireNonNull(solutions);
            return this;
        }

        public Builder setSource(String source) {
            this.source = Objects.requireNonNull(source);
            return this;
        }

        public Builder setStandardColumns(List<ColumnResponse> standardColumns) {
            this.standardColumns = Objects.requireNonNull(standardColumns);
            return this;
        }

        public Builder setTableSubType(String tableSubType) {
            this.tableSubType = Objects.requireNonNull(tableSubType);
            return this;
        }

        public Builder setTableType(String tableType) {
            this.tableType = Objects.requireNonNull(tableType);
            return this;
        }
        public SchemaResponse build() {
            return new SchemaResponse(categories, columns, description, displayName, labels, name, restoredLogs, searchResults, solutions, source, standardColumns, tableSubType, tableType);
        }
    }
}
