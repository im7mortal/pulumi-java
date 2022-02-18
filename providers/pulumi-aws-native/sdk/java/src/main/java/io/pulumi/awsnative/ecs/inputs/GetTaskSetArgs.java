// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.ecs.inputs;

import io.pulumi.core.internal.annotations.InputImport;
import java.lang.String;
import java.util.Objects;


public final class GetTaskSetArgs extends io.pulumi.resources.InvokeArgs {

    public static final GetTaskSetArgs Empty = new GetTaskSetArgs();

    /**
     * The short name or full Amazon Resource Name (ARN) of the cluster that hosts the service to create the task set in.
     * 
     */
    @InputImport(name="cluster", required=true)
    private final String cluster;

    public String getCluster() {
        return this.cluster;
    }

    /**
     * The ID of the task set.
     * 
     */
    @InputImport(name="id", required=true)
    private final String id;

    public String getId() {
        return this.id;
    }

    /**
     * The short name or full Amazon Resource Name (ARN) of the service to create the task set in.
     * 
     */
    @InputImport(name="service", required=true)
    private final String service;

    public String getService() {
        return this.service;
    }

    public GetTaskSetArgs(
        String cluster,
        String id,
        String service) {
        this.cluster = Objects.requireNonNull(cluster, "expected parameter 'cluster' to be non-null");
        this.id = Objects.requireNonNull(id, "expected parameter 'id' to be non-null");
        this.service = Objects.requireNonNull(service, "expected parameter 'service' to be non-null");
    }

    private GetTaskSetArgs() {
        this.cluster = null;
        this.id = null;
        this.service = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetTaskSetArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String cluster;
        private String id;
        private String service;

        public Builder() {
    	      // Empty
        }

        public Builder(GetTaskSetArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.cluster = defaults.cluster;
    	      this.id = defaults.id;
    	      this.service = defaults.service;
        }

        public Builder setCluster(String cluster) {
            this.cluster = Objects.requireNonNull(cluster);
            return this;
        }

        public Builder setId(String id) {
            this.id = Objects.requireNonNull(id);
            return this;
        }

        public Builder setService(String service) {
            this.service = Objects.requireNonNull(service);
            return this;
        }

        public GetTaskSetArgs build() {
            return new GetTaskSetArgs(cluster, id, service);
        }
    }
}
