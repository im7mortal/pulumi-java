// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.composer_v1beta1.outputs;

import io.pulumi.core.internal.annotations.OutputCustomType;
import io.pulumi.googlenative.composer_v1beta1.outputs.EnvironmentConfigResponse;
import java.lang.String;
import java.util.Map;
import java.util.Objects;

@OutputCustomType
public final class GetEnvironmentResult {
    private final EnvironmentConfigResponse config;
    private final String createTime;
    private final Map<String,String> labels;
    private final String name;
    private final String state;
    private final String updateTime;
    private final String uuid;

    @OutputCustomType.Constructor({"config","createTime","labels","name","state","updateTime","uuid"})
    private GetEnvironmentResult(
        EnvironmentConfigResponse config,
        String createTime,
        Map<String,String> labels,
        String name,
        String state,
        String updateTime,
        String uuid) {
        this.config = Objects.requireNonNull(config);
        this.createTime = Objects.requireNonNull(createTime);
        this.labels = Objects.requireNonNull(labels);
        this.name = Objects.requireNonNull(name);
        this.state = Objects.requireNonNull(state);
        this.updateTime = Objects.requireNonNull(updateTime);
        this.uuid = Objects.requireNonNull(uuid);
    }

    public EnvironmentConfigResponse getConfig() {
        return this.config;
    }
    public String getCreateTime() {
        return this.createTime;
    }
    public Map<String,String> getLabels() {
        return this.labels;
    }
    public String getName() {
        return this.name;
    }
    public String getState() {
        return this.state;
    }
    public String getUpdateTime() {
        return this.updateTime;
    }
    public String getUuid() {
        return this.uuid;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetEnvironmentResult defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private EnvironmentConfigResponse config;
        private String createTime;
        private Map<String,String> labels;
        private String name;
        private String state;
        private String updateTime;
        private String uuid;

        public Builder() {
    	      // Empty
        }

        public Builder(GetEnvironmentResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.config = defaults.config;
    	      this.createTime = defaults.createTime;
    	      this.labels = defaults.labels;
    	      this.name = defaults.name;
    	      this.state = defaults.state;
    	      this.updateTime = defaults.updateTime;
    	      this.uuid = defaults.uuid;
        }

        public Builder setConfig(EnvironmentConfigResponse config) {
            this.config = Objects.requireNonNull(config);
            return this;
        }

        public Builder setCreateTime(String createTime) {
            this.createTime = Objects.requireNonNull(createTime);
            return this;
        }

        public Builder setLabels(Map<String,String> labels) {
            this.labels = Objects.requireNonNull(labels);
            return this;
        }

        public Builder setName(String name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }

        public Builder setState(String state) {
            this.state = Objects.requireNonNull(state);
            return this;
        }

        public Builder setUpdateTime(String updateTime) {
            this.updateTime = Objects.requireNonNull(updateTime);
            return this;
        }

        public Builder setUuid(String uuid) {
            this.uuid = Objects.requireNonNull(uuid);
            return this;
        }

        public GetEnvironmentResult build() {
            return new GetEnvironmentResult(config, createTime, labels, name, state, updateTime, uuid);
        }
    }
}