// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.sagemaker.outputs;

import io.pulumi.awsnative.sagemaker.outputs.ParallelismConfigurationProperties;
import io.pulumi.awsnative.sagemaker.outputs.PipelineTag;
import io.pulumi.core.annotations.OutputCustomType;
import java.lang.Object;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class GetPipelineResult {
    private final @Nullable ParallelismConfigurationProperties parallelismConfiguration;
    private final @Nullable Object pipelineDefinition;
    /**
     * The description of the Pipeline.
     * 
     */
    private final @Nullable String pipelineDescription;
    /**
     * The display name of the Pipeline.
     * 
     */
    private final @Nullable String pipelineDisplayName;
    /**
     * Role Arn
     * 
     */
    private final @Nullable String roleArn;
    private final @Nullable List<PipelineTag> tags;

    @OutputCustomType.Constructor({"parallelismConfiguration","pipelineDefinition","pipelineDescription","pipelineDisplayName","roleArn","tags"})
    private GetPipelineResult(
        @Nullable ParallelismConfigurationProperties parallelismConfiguration,
        @Nullable Object pipelineDefinition,
        @Nullable String pipelineDescription,
        @Nullable String pipelineDisplayName,
        @Nullable String roleArn,
        @Nullable List<PipelineTag> tags) {
        this.parallelismConfiguration = parallelismConfiguration;
        this.pipelineDefinition = pipelineDefinition;
        this.pipelineDescription = pipelineDescription;
        this.pipelineDisplayName = pipelineDisplayName;
        this.roleArn = roleArn;
        this.tags = tags;
    }

    public Optional<ParallelismConfigurationProperties> getParallelismConfiguration() {
        return Optional.ofNullable(this.parallelismConfiguration);
    }
    public Optional<Object> getPipelineDefinition() {
        return Optional.ofNullable(this.pipelineDefinition);
    }
    /**
     * The description of the Pipeline.
     * 
    */
    public Optional<String> getPipelineDescription() {
        return Optional.ofNullable(this.pipelineDescription);
    }
    /**
     * The display name of the Pipeline.
     * 
    */
    public Optional<String> getPipelineDisplayName() {
        return Optional.ofNullable(this.pipelineDisplayName);
    }
    /**
     * Role Arn
     * 
    */
    public Optional<String> getRoleArn() {
        return Optional.ofNullable(this.roleArn);
    }
    public List<PipelineTag> getTags() {
        return this.tags == null ? List.of() : this.tags;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetPipelineResult defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable ParallelismConfigurationProperties parallelismConfiguration;
        private @Nullable Object pipelineDefinition;
        private @Nullable String pipelineDescription;
        private @Nullable String pipelineDisplayName;
        private @Nullable String roleArn;
        private @Nullable List<PipelineTag> tags;

        public Builder() {
    	      // Empty
        }

        public Builder(GetPipelineResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.parallelismConfiguration = defaults.parallelismConfiguration;
    	      this.pipelineDefinition = defaults.pipelineDefinition;
    	      this.pipelineDescription = defaults.pipelineDescription;
    	      this.pipelineDisplayName = defaults.pipelineDisplayName;
    	      this.roleArn = defaults.roleArn;
    	      this.tags = defaults.tags;
        }

        public Builder setParallelismConfiguration(@Nullable ParallelismConfigurationProperties parallelismConfiguration) {
            this.parallelismConfiguration = parallelismConfiguration;
            return this;
        }

        public Builder setPipelineDefinition(@Nullable Object pipelineDefinition) {
            this.pipelineDefinition = pipelineDefinition;
            return this;
        }

        public Builder setPipelineDescription(@Nullable String pipelineDescription) {
            this.pipelineDescription = pipelineDescription;
            return this;
        }

        public Builder setPipelineDisplayName(@Nullable String pipelineDisplayName) {
            this.pipelineDisplayName = pipelineDisplayName;
            return this;
        }

        public Builder setRoleArn(@Nullable String roleArn) {
            this.roleArn = roleArn;
            return this;
        }

        public Builder setTags(@Nullable List<PipelineTag> tags) {
            this.tags = tags;
            return this;
        }
        public GetPipelineResult build() {
            return new GetPipelineResult(parallelismConfiguration, pipelineDefinition, pipelineDescription, pipelineDisplayName, roleArn, tags);
        }
    }
}
