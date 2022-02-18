// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.gkehub.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.internal.annotations.InputImport;
import io.pulumi.gcp.gkehub.inputs.FeatureResourceStateGetArgs;
import io.pulumi.gcp.gkehub.inputs.FeatureSpecGetArgs;
import io.pulumi.gcp.gkehub.inputs.FeatureStateGetArgs;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import javax.annotation.Nullable;


public final class FeatureState extends io.pulumi.resources.ResourceArgs {

    public static final FeatureState Empty = new FeatureState();

    /**
     * Output only. When the Feature resource was created.
     * 
     */
    @InputImport(name="createTime")
    private final @Nullable Input<String> createTime;

    public Input<String> getCreateTime() {
        return this.createTime == null ? Input.empty() : this.createTime;
    }

    /**
     * Output only. When the Feature resource was deleted.
     * 
     */
    @InputImport(name="deleteTime")
    private final @Nullable Input<String> deleteTime;

    public Input<String> getDeleteTime() {
        return this.deleteTime == null ? Input.empty() : this.deleteTime;
    }

    /**
     * GCP labels for this Feature.
     * 
     */
    @InputImport(name="labels")
    private final @Nullable Input<Map<String,String>> labels;

    public Input<Map<String,String>> getLabels() {
        return this.labels == null ? Input.empty() : this.labels;
    }

    /**
     * The location for the resource
     * 
     */
    @InputImport(name="location")
    private final @Nullable Input<String> location;

    public Input<String> getLocation() {
        return this.location == null ? Input.empty() : this.location;
    }

    /**
     * The full, unique name of this Feature resource
     * 
     */
    @InputImport(name="name")
    private final @Nullable Input<String> name;

    public Input<String> getName() {
        return this.name == null ? Input.empty() : this.name;
    }

    /**
     * The project for the resource
     * 
     */
    @InputImport(name="project")
    private final @Nullable Input<String> project;

    public Input<String> getProject() {
        return this.project == null ? Input.empty() : this.project;
    }

    /**
     * State of the Feature resource itself.
     * 
     */
    @InputImport(name="resourceStates")
    private final @Nullable Input<List<FeatureResourceStateGetArgs>> resourceStates;

    public Input<List<FeatureResourceStateGetArgs>> getResourceStates() {
        return this.resourceStates == null ? Input.empty() : this.resourceStates;
    }

    /**
     * Optional. Hub-wide Feature configuration. If this Feature does not support any Hub-wide configuration, this field may be unused.
     * 
     */
    @InputImport(name="spec")
    private final @Nullable Input<FeatureSpecGetArgs> spec;

    public Input<FeatureSpecGetArgs> getSpec() {
        return this.spec == null ? Input.empty() : this.spec;
    }

    /**
     * Output only. The Hub-wide Feature state
     * 
     */
    @InputImport(name="states")
    private final @Nullable Input<List<FeatureStateGetArgs>> states;

    public Input<List<FeatureStateGetArgs>> getStates() {
        return this.states == null ? Input.empty() : this.states;
    }

    /**
     * Output only. When the Feature resource was last updated.
     * 
     */
    @InputImport(name="updateTime")
    private final @Nullable Input<String> updateTime;

    public Input<String> getUpdateTime() {
        return this.updateTime == null ? Input.empty() : this.updateTime;
    }

    public FeatureState(
        @Nullable Input<String> createTime,
        @Nullable Input<String> deleteTime,
        @Nullable Input<Map<String,String>> labels,
        @Nullable Input<String> location,
        @Nullable Input<String> name,
        @Nullable Input<String> project,
        @Nullable Input<List<FeatureResourceStateGetArgs>> resourceStates,
        @Nullable Input<FeatureSpecGetArgs> spec,
        @Nullable Input<List<FeatureStateGetArgs>> states,
        @Nullable Input<String> updateTime) {
        this.createTime = createTime;
        this.deleteTime = deleteTime;
        this.labels = labels;
        this.location = location;
        this.name = name;
        this.project = project;
        this.resourceStates = resourceStates;
        this.spec = spec;
        this.states = states;
        this.updateTime = updateTime;
    }

    private FeatureState() {
        this.createTime = Input.empty();
        this.deleteTime = Input.empty();
        this.labels = Input.empty();
        this.location = Input.empty();
        this.name = Input.empty();
        this.project = Input.empty();
        this.resourceStates = Input.empty();
        this.spec = Input.empty();
        this.states = Input.empty();
        this.updateTime = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(FeatureState defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<String> createTime;
        private @Nullable Input<String> deleteTime;
        private @Nullable Input<Map<String,String>> labels;
        private @Nullable Input<String> location;
        private @Nullable Input<String> name;
        private @Nullable Input<String> project;
        private @Nullable Input<List<FeatureResourceStateGetArgs>> resourceStates;
        private @Nullable Input<FeatureSpecGetArgs> spec;
        private @Nullable Input<List<FeatureStateGetArgs>> states;
        private @Nullable Input<String> updateTime;

        public Builder() {
    	      // Empty
        }

        public Builder(FeatureState defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.createTime = defaults.createTime;
    	      this.deleteTime = defaults.deleteTime;
    	      this.labels = defaults.labels;
    	      this.location = defaults.location;
    	      this.name = defaults.name;
    	      this.project = defaults.project;
    	      this.resourceStates = defaults.resourceStates;
    	      this.spec = defaults.spec;
    	      this.states = defaults.states;
    	      this.updateTime = defaults.updateTime;
        }

        public Builder setCreateTime(@Nullable Input<String> createTime) {
            this.createTime = createTime;
            return this;
        }

        public Builder setCreateTime(@Nullable String createTime) {
            this.createTime = Input.ofNullable(createTime);
            return this;
        }

        public Builder setDeleteTime(@Nullable Input<String> deleteTime) {
            this.deleteTime = deleteTime;
            return this;
        }

        public Builder setDeleteTime(@Nullable String deleteTime) {
            this.deleteTime = Input.ofNullable(deleteTime);
            return this;
        }

        public Builder setLabels(@Nullable Input<Map<String,String>> labels) {
            this.labels = labels;
            return this;
        }

        public Builder setLabels(@Nullable Map<String,String> labels) {
            this.labels = Input.ofNullable(labels);
            return this;
        }

        public Builder setLocation(@Nullable Input<String> location) {
            this.location = location;
            return this;
        }

        public Builder setLocation(@Nullable String location) {
            this.location = Input.ofNullable(location);
            return this;
        }

        public Builder setName(@Nullable Input<String> name) {
            this.name = name;
            return this;
        }

        public Builder setName(@Nullable String name) {
            this.name = Input.ofNullable(name);
            return this;
        }

        public Builder setProject(@Nullable Input<String> project) {
            this.project = project;
            return this;
        }

        public Builder setProject(@Nullable String project) {
            this.project = Input.ofNullable(project);
            return this;
        }

        public Builder setResourceStates(@Nullable Input<List<FeatureResourceStateGetArgs>> resourceStates) {
            this.resourceStates = resourceStates;
            return this;
        }

        public Builder setResourceStates(@Nullable List<FeatureResourceStateGetArgs> resourceStates) {
            this.resourceStates = Input.ofNullable(resourceStates);
            return this;
        }

        public Builder setSpec(@Nullable Input<FeatureSpecGetArgs> spec) {
            this.spec = spec;
            return this;
        }

        public Builder setSpec(@Nullable FeatureSpecGetArgs spec) {
            this.spec = Input.ofNullable(spec);
            return this;
        }

        public Builder setStates(@Nullable Input<List<FeatureStateGetArgs>> states) {
            this.states = states;
            return this;
        }

        public Builder setStates(@Nullable List<FeatureStateGetArgs> states) {
            this.states = Input.ofNullable(states);
            return this;
        }

        public Builder setUpdateTime(@Nullable Input<String> updateTime) {
            this.updateTime = updateTime;
            return this;
        }

        public Builder setUpdateTime(@Nullable String updateTime) {
            this.updateTime = Input.ofNullable(updateTime);
            return this;
        }

        public FeatureState build() {
            return new FeatureState(createTime, deleteTime, labels, location, name, project, resourceStates, spec, states, updateTime);
        }
    }
}