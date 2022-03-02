// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.imagebuilder.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class ImagePipelineSchedule {
    /**
     * Condition when the pipeline should trigger a new image build. Valid values are `EXPRESSION_MATCH_AND_DEPENDENCY_UPDATES_AVAILABLE` and `EXPRESSION_MATCH_ONLY`. Defaults to `EXPRESSION_MATCH_AND_DEPENDENCY_UPDATES_AVAILABLE`.
     * 
     */
    private final @Nullable String pipelineExecutionStartCondition;
    /**
     * Cron expression of how often the pipeline start condition is evaluated. For example, `cron(0 0 * * ? *)` is evaluated every day at midnight UTC. Configurations using the five field syntax that was previously accepted by the API, such as `cron(0 0 * * *)`, must be updated to the six field syntax. For more information, see the [Image Builder User Guide](https://docs.aws.amazon.com/imagebuilder/latest/userguide/cron-expressions.html).
     * 
     */
    private final String scheduleExpression;

    @OutputCustomType.Constructor({"pipelineExecutionStartCondition","scheduleExpression"})
    private ImagePipelineSchedule(
        @Nullable String pipelineExecutionStartCondition,
        String scheduleExpression) {
        this.pipelineExecutionStartCondition = pipelineExecutionStartCondition;
        this.scheduleExpression = Objects.requireNonNull(scheduleExpression);
    }

    /**
     * Condition when the pipeline should trigger a new image build. Valid values are `EXPRESSION_MATCH_AND_DEPENDENCY_UPDATES_AVAILABLE` and `EXPRESSION_MATCH_ONLY`. Defaults to `EXPRESSION_MATCH_AND_DEPENDENCY_UPDATES_AVAILABLE`.
     * 
    */
    public Optional<String> getPipelineExecutionStartCondition() {
        return Optional.ofNullable(this.pipelineExecutionStartCondition);
    }
    /**
     * Cron expression of how often the pipeline start condition is evaluated. For example, `cron(0 0 * * ? *)` is evaluated every day at midnight UTC. Configurations using the five field syntax that was previously accepted by the API, such as `cron(0 0 * * *)`, must be updated to the six field syntax. For more information, see the [Image Builder User Guide](https://docs.aws.amazon.com/imagebuilder/latest/userguide/cron-expressions.html).
     * 
    */
    public String getScheduleExpression() {
        return this.scheduleExpression;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ImagePipelineSchedule defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String pipelineExecutionStartCondition;
        private String scheduleExpression;

        public Builder() {
    	      // Empty
        }

        public Builder(ImagePipelineSchedule defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.pipelineExecutionStartCondition = defaults.pipelineExecutionStartCondition;
    	      this.scheduleExpression = defaults.scheduleExpression;
        }

        public Builder setPipelineExecutionStartCondition(@Nullable String pipelineExecutionStartCondition) {
            this.pipelineExecutionStartCondition = pipelineExecutionStartCondition;
            return this;
        }

        public Builder setScheduleExpression(String scheduleExpression) {
            this.scheduleExpression = Objects.requireNonNull(scheduleExpression);
            return this;
        }
        public ImagePipelineSchedule build() {
            return new ImagePipelineSchedule(pipelineExecutionStartCondition, scheduleExpression);
        }
    }
}
