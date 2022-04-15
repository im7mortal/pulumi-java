// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.kubernetes.batch_v1beta1.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import io.pulumi.core.internal.Codegen;
import io.pulumi.kubernetes.batch_v1.inputs.JobSpecArgs;
import io.pulumi.kubernetes.meta_v1.inputs.ObjectMetaArgs;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * JobTemplateSpec describes the data a Job should have when created from a template
 * 
 */
public final class JobTemplateSpecArgs extends io.pulumi.resources.ResourceArgs {

    public static final JobTemplateSpecArgs Empty = new JobTemplateSpecArgs();

    /**
     * Standard object's metadata of the jobs created from this template. More info: https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#metadata
     * 
     */
    @Import(name="metadata")
      private final @Nullable Output<ObjectMetaArgs> metadata;

    public Output<ObjectMetaArgs> metadata() {
        return this.metadata == null ? Codegen.empty() : this.metadata;
    }

    /**
     * Specification of the desired behavior of the job. More info: https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#spec-and-status
     * 
     */
    @Import(name="spec")
      private final @Nullable Output<JobSpecArgs> spec;

    public Output<JobSpecArgs> spec() {
        return this.spec == null ? Codegen.empty() : this.spec;
    }

    public JobTemplateSpecArgs(
        @Nullable Output<ObjectMetaArgs> metadata,
        @Nullable Output<JobSpecArgs> spec) {
        this.metadata = metadata;
        this.spec = spec;
    }

    private JobTemplateSpecArgs() {
        this.metadata = Codegen.empty();
        this.spec = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(JobTemplateSpecArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<ObjectMetaArgs> metadata;
        private @Nullable Output<JobSpecArgs> spec;

        public Builder() {
    	      // Empty
        }

        public Builder(JobTemplateSpecArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.metadata = defaults.metadata;
    	      this.spec = defaults.spec;
        }

        public Builder metadata(@Nullable Output<ObjectMetaArgs> metadata) {
            this.metadata = metadata;
            return this;
        }
        public Builder metadata(@Nullable ObjectMetaArgs metadata) {
            this.metadata = Codegen.ofNullable(metadata);
            return this;
        }
        public Builder spec(@Nullable Output<JobSpecArgs> spec) {
            this.spec = spec;
            return this;
        }
        public Builder spec(@Nullable JobSpecArgs spec) {
            this.spec = Codegen.ofNullable(spec);
            return this;
        }        public JobTemplateSpecArgs build() {
            return new JobTemplateSpecArgs(metadata, spec);
        }
    }
}
