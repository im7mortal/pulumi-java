// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.datafactory.outputs;

import io.pulumi.azurenative.datafactory.outputs.ActivityDependencyResponse;
import io.pulumi.azurenative.datafactory.outputs.AppendVariableActivityResponse;
import io.pulumi.azurenative.datafactory.outputs.AzureDataExplorerCommandActivityResponse;
import io.pulumi.azurenative.datafactory.outputs.AzureFunctionActivityResponse;
import io.pulumi.azurenative.datafactory.outputs.AzureMLBatchExecutionActivityResponse;
import io.pulumi.azurenative.datafactory.outputs.AzureMLExecutePipelineActivityResponse;
import io.pulumi.azurenative.datafactory.outputs.AzureMLUpdateResourceActivityResponse;
import io.pulumi.azurenative.datafactory.outputs.ControlActivityResponse;
import io.pulumi.azurenative.datafactory.outputs.CopyActivityResponse;
import io.pulumi.azurenative.datafactory.outputs.CustomActivityResponse;
import io.pulumi.azurenative.datafactory.outputs.DataLakeAnalyticsUSQLActivityResponse;
import io.pulumi.azurenative.datafactory.outputs.DatabricksNotebookActivityResponse;
import io.pulumi.azurenative.datafactory.outputs.DatabricksSparkJarActivityResponse;
import io.pulumi.azurenative.datafactory.outputs.DatabricksSparkPythonActivityResponse;
import io.pulumi.azurenative.datafactory.outputs.DeleteActivityResponse;
import io.pulumi.azurenative.datafactory.outputs.ExecuteDataFlowActivityResponse;
import io.pulumi.azurenative.datafactory.outputs.ExecutePipelineActivityResponse;
import io.pulumi.azurenative.datafactory.outputs.ExecuteSSISPackageActivityResponse;
import io.pulumi.azurenative.datafactory.outputs.ExecuteWranglingDataflowActivityResponse;
import io.pulumi.azurenative.datafactory.outputs.ExecutionActivityResponse;
import io.pulumi.azurenative.datafactory.outputs.ExpressionResponse;
import io.pulumi.azurenative.datafactory.outputs.FailActivityResponse;
import io.pulumi.azurenative.datafactory.outputs.FilterActivityResponse;
import io.pulumi.azurenative.datafactory.outputs.ForEachActivityResponse;
import io.pulumi.azurenative.datafactory.outputs.GetMetadataActivityResponse;
import io.pulumi.azurenative.datafactory.outputs.HDInsightHiveActivityResponse;
import io.pulumi.azurenative.datafactory.outputs.HDInsightMapReduceActivityResponse;
import io.pulumi.azurenative.datafactory.outputs.HDInsightPigActivityResponse;
import io.pulumi.azurenative.datafactory.outputs.HDInsightSparkActivityResponse;
import io.pulumi.azurenative.datafactory.outputs.HDInsightStreamingActivityResponse;
import io.pulumi.azurenative.datafactory.outputs.IfConditionActivityResponse;
import io.pulumi.azurenative.datafactory.outputs.LookupActivityResponse;
import io.pulumi.azurenative.datafactory.outputs.SetVariableActivityResponse;
import io.pulumi.azurenative.datafactory.outputs.SqlServerStoredProcedureActivityResponse;
import io.pulumi.azurenative.datafactory.outputs.SwitchActivityResponse;
import io.pulumi.azurenative.datafactory.outputs.UserPropertyResponse;
import io.pulumi.azurenative.datafactory.outputs.ValidationActivityResponse;
import io.pulumi.azurenative.datafactory.outputs.WaitActivityResponse;
import io.pulumi.azurenative.datafactory.outputs.WebActivityResponse;
import io.pulumi.azurenative.datafactory.outputs.WebHookActivityResponse;
import io.pulumi.core.annotations.OutputCustomType;
import java.lang.Object;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class UntilActivityResponse {
    /**
     * List of activities to execute.
     * 
     */
    private final List<Object> activities;
    /**
     * Activity depends on condition.
     * 
     */
    private final @Nullable List<ActivityDependencyResponse> dependsOn;
    /**
     * Activity description.
     * 
     */
    private final @Nullable String description;
    /**
     * An expression that would evaluate to Boolean. The loop will continue until this expression evaluates to true
     * 
     */
    private final ExpressionResponse expression;
    /**
     * Activity name.
     * 
     */
    private final String name;
    /**
     * Specifies the timeout for the activity to run. If there is no value specified, it takes the value of TimeSpan.FromDays(7) which is 1 week as default. Type: string (or Expression with resultType string), pattern: ((\d+)\.)?(\d\d):(60|([0-5][0-9])):(60|([0-5][0-9])). Type: string (or Expression with resultType string), pattern: ((\d+)\.)?(\d\d):(60|([0-5][0-9])):(60|([0-5][0-9])).
     * 
     */
    private final @Nullable Object timeout;
    /**
     * Type of activity.
     * Expected value is 'Until'.
     * 
     */
    private final String type;
    /**
     * Activity user properties.
     * 
     */
    private final @Nullable List<UserPropertyResponse> userProperties;

    @OutputCustomType.Constructor({"activities","dependsOn","description","expression","name","timeout","type","userProperties"})
    private UntilActivityResponse(
        List<Object> activities,
        @Nullable List<ActivityDependencyResponse> dependsOn,
        @Nullable String description,
        ExpressionResponse expression,
        String name,
        @Nullable Object timeout,
        String type,
        @Nullable List<UserPropertyResponse> userProperties) {
        this.activities = Objects.requireNonNull(activities);
        this.dependsOn = dependsOn;
        this.description = description;
        this.expression = Objects.requireNonNull(expression);
        this.name = Objects.requireNonNull(name);
        this.timeout = timeout;
        this.type = Objects.requireNonNull(type);
        this.userProperties = userProperties;
    }

    /**
     * List of activities to execute.
     * 
    */
    public List<Object> getActivities() {
        return this.activities;
    }
    /**
     * Activity depends on condition.
     * 
    */
    public List<ActivityDependencyResponse> getDependsOn() {
        return this.dependsOn == null ? List.of() : this.dependsOn;
    }
    /**
     * Activity description.
     * 
    */
    public Optional<String> getDescription() {
        return Optional.ofNullable(this.description);
    }
    /**
     * An expression that would evaluate to Boolean. The loop will continue until this expression evaluates to true
     * 
    */
    public ExpressionResponse getExpression() {
        return this.expression;
    }
    /**
     * Activity name.
     * 
    */
    public String getName() {
        return this.name;
    }
    /**
     * Specifies the timeout for the activity to run. If there is no value specified, it takes the value of TimeSpan.FromDays(7) which is 1 week as default. Type: string (or Expression with resultType string), pattern: ((\d+)\.)?(\d\d):(60|([0-5][0-9])):(60|([0-5][0-9])). Type: string (or Expression with resultType string), pattern: ((\d+)\.)?(\d\d):(60|([0-5][0-9])):(60|([0-5][0-9])).
     * 
    */
    public Optional<Object> getTimeout() {
        return Optional.ofNullable(this.timeout);
    }
    /**
     * Type of activity.
     * Expected value is 'Until'.
     * 
    */
    public String getType() {
        return this.type;
    }
    /**
     * Activity user properties.
     * 
    */
    public List<UserPropertyResponse> getUserProperties() {
        return this.userProperties == null ? List.of() : this.userProperties;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(UntilActivityResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private List<Object> activities;
        private @Nullable List<ActivityDependencyResponse> dependsOn;
        private @Nullable String description;
        private ExpressionResponse expression;
        private String name;
        private @Nullable Object timeout;
        private String type;
        private @Nullable List<UserPropertyResponse> userProperties;

        public Builder() {
    	      // Empty
        }

        public Builder(UntilActivityResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.activities = defaults.activities;
    	      this.dependsOn = defaults.dependsOn;
    	      this.description = defaults.description;
    	      this.expression = defaults.expression;
    	      this.name = defaults.name;
    	      this.timeout = defaults.timeout;
    	      this.type = defaults.type;
    	      this.userProperties = defaults.userProperties;
        }

        public Builder setActivities(List<Object> activities) {
            this.activities = Objects.requireNonNull(activities);
            return this;
        }

        public Builder setDependsOn(@Nullable List<ActivityDependencyResponse> dependsOn) {
            this.dependsOn = dependsOn;
            return this;
        }

        public Builder setDescription(@Nullable String description) {
            this.description = description;
            return this;
        }

        public Builder setExpression(ExpressionResponse expression) {
            this.expression = Objects.requireNonNull(expression);
            return this;
        }

        public Builder setName(String name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }

        public Builder setTimeout(@Nullable Object timeout) {
            this.timeout = timeout;
            return this;
        }

        public Builder setType(String type) {
            this.type = Objects.requireNonNull(type);
            return this;
        }

        public Builder setUserProperties(@Nullable List<UserPropertyResponse> userProperties) {
            this.userProperties = userProperties;
            return this;
        }
        public UntilActivityResponse build() {
            return new UntilActivityResponse(activities, dependsOn, description, expression, name, timeout, type, userProperties);
        }
    }
}
