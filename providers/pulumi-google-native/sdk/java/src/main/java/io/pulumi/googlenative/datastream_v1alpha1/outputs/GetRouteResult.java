// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.datastream_v1alpha1.outputs;

import io.pulumi.core.internal.annotations.OutputCustomType;
import java.lang.Integer;
import java.lang.String;
import java.util.Map;
import java.util.Objects;

@OutputCustomType
public final class GetRouteResult {
    private final String createTime;
    private final String destinationAddress;
    private final Integer destinationPort;
    private final String displayName;
    private final Map<String,String> labels;
    private final String name;
    private final String updateTime;

    @OutputCustomType.Constructor({"createTime","destinationAddress","destinationPort","displayName","labels","name","updateTime"})
    private GetRouteResult(
        String createTime,
        String destinationAddress,
        Integer destinationPort,
        String displayName,
        Map<String,String> labels,
        String name,
        String updateTime) {
        this.createTime = Objects.requireNonNull(createTime);
        this.destinationAddress = Objects.requireNonNull(destinationAddress);
        this.destinationPort = Objects.requireNonNull(destinationPort);
        this.displayName = Objects.requireNonNull(displayName);
        this.labels = Objects.requireNonNull(labels);
        this.name = Objects.requireNonNull(name);
        this.updateTime = Objects.requireNonNull(updateTime);
    }

    public String getCreateTime() {
        return this.createTime;
    }
    public String getDestinationAddress() {
        return this.destinationAddress;
    }
    public Integer getDestinationPort() {
        return this.destinationPort;
    }
    public String getDisplayName() {
        return this.displayName;
    }
    public Map<String,String> getLabels() {
        return this.labels;
    }
    public String getName() {
        return this.name;
    }
    public String getUpdateTime() {
        return this.updateTime;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetRouteResult defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String createTime;
        private String destinationAddress;
        private Integer destinationPort;
        private String displayName;
        private Map<String,String> labels;
        private String name;
        private String updateTime;

        public Builder() {
    	      // Empty
        }

        public Builder(GetRouteResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.createTime = defaults.createTime;
    	      this.destinationAddress = defaults.destinationAddress;
    	      this.destinationPort = defaults.destinationPort;
    	      this.displayName = defaults.displayName;
    	      this.labels = defaults.labels;
    	      this.name = defaults.name;
    	      this.updateTime = defaults.updateTime;
        }

        public Builder setCreateTime(String createTime) {
            this.createTime = Objects.requireNonNull(createTime);
            return this;
        }

        public Builder setDestinationAddress(String destinationAddress) {
            this.destinationAddress = Objects.requireNonNull(destinationAddress);
            return this;
        }

        public Builder setDestinationPort(Integer destinationPort) {
            this.destinationPort = Objects.requireNonNull(destinationPort);
            return this;
        }

        public Builder setDisplayName(String displayName) {
            this.displayName = Objects.requireNonNull(displayName);
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

        public Builder setUpdateTime(String updateTime) {
            this.updateTime = Objects.requireNonNull(updateTime);
            return this;
        }

        public GetRouteResult build() {
            return new GetRouteResult(createTime, destinationAddress, destinationPort, displayName, labels, name, updateTime);
        }
    }
}