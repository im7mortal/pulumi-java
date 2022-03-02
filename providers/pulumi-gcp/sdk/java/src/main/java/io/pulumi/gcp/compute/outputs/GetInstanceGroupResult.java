// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.compute.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import io.pulumi.gcp.compute.outputs.GetInstanceGroupNamedPort;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class GetInstanceGroupResult {
    /**
     * Textual description of the instance group.
     * 
     */
    private final String description;
    /**
     * The provider-assigned unique ID for this managed resource.
     * 
     */
    private final String id;
    /**
     * List of instances in the group.
     * 
     */
    private final List<String> instances;
    private final @Nullable String name;
    /**
     * List of named ports in the group.
     * 
     */
    private final List<GetInstanceGroupNamedPort> namedPorts;
    /**
     * The URL of the network the instance group is in.
     * 
     */
    private final String network;
    private final String project;
    /**
     * The URI of the resource.
     * 
     */
    private final String selfLink;
    /**
     * The number of instances in the group.
     * 
     */
    private final Integer size;
    private final String zone;

    @OutputCustomType.Constructor({"description","id","instances","name","namedPorts","network","project","selfLink","size","zone"})
    private GetInstanceGroupResult(
        String description,
        String id,
        List<String> instances,
        @Nullable String name,
        List<GetInstanceGroupNamedPort> namedPorts,
        String network,
        String project,
        String selfLink,
        Integer size,
        String zone) {
        this.description = Objects.requireNonNull(description);
        this.id = Objects.requireNonNull(id);
        this.instances = Objects.requireNonNull(instances);
        this.name = name;
        this.namedPorts = Objects.requireNonNull(namedPorts);
        this.network = Objects.requireNonNull(network);
        this.project = Objects.requireNonNull(project);
        this.selfLink = Objects.requireNonNull(selfLink);
        this.size = Objects.requireNonNull(size);
        this.zone = Objects.requireNonNull(zone);
    }

    /**
     * Textual description of the instance group.
     * 
    */
    public String getDescription() {
        return this.description;
    }
    /**
     * The provider-assigned unique ID for this managed resource.
     * 
    */
    public String getId() {
        return this.id;
    }
    /**
     * List of instances in the group.
     * 
    */
    public List<String> getInstances() {
        return this.instances;
    }
    public Optional<String> getName() {
        return Optional.ofNullable(this.name);
    }
    /**
     * List of named ports in the group.
     * 
    */
    public List<GetInstanceGroupNamedPort> getNamedPorts() {
        return this.namedPorts;
    }
    /**
     * The URL of the network the instance group is in.
     * 
    */
    public String getNetwork() {
        return this.network;
    }
    public String getProject() {
        return this.project;
    }
    /**
     * The URI of the resource.
     * 
    */
    public String getSelfLink() {
        return this.selfLink;
    }
    /**
     * The number of instances in the group.
     * 
    */
    public Integer getSize() {
        return this.size;
    }
    public String getZone() {
        return this.zone;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetInstanceGroupResult defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String description;
        private String id;
        private List<String> instances;
        private @Nullable String name;
        private List<GetInstanceGroupNamedPort> namedPorts;
        private String network;
        private String project;
        private String selfLink;
        private Integer size;
        private String zone;

        public Builder() {
    	      // Empty
        }

        public Builder(GetInstanceGroupResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.description = defaults.description;
    	      this.id = defaults.id;
    	      this.instances = defaults.instances;
    	      this.name = defaults.name;
    	      this.namedPorts = defaults.namedPorts;
    	      this.network = defaults.network;
    	      this.project = defaults.project;
    	      this.selfLink = defaults.selfLink;
    	      this.size = defaults.size;
    	      this.zone = defaults.zone;
        }

        public Builder setDescription(String description) {
            this.description = Objects.requireNonNull(description);
            return this;
        }

        public Builder setId(String id) {
            this.id = Objects.requireNonNull(id);
            return this;
        }

        public Builder setInstances(List<String> instances) {
            this.instances = Objects.requireNonNull(instances);
            return this;
        }

        public Builder setName(@Nullable String name) {
            this.name = name;
            return this;
        }

        public Builder setNamedPorts(List<GetInstanceGroupNamedPort> namedPorts) {
            this.namedPorts = Objects.requireNonNull(namedPorts);
            return this;
        }

        public Builder setNetwork(String network) {
            this.network = Objects.requireNonNull(network);
            return this;
        }

        public Builder setProject(String project) {
            this.project = Objects.requireNonNull(project);
            return this;
        }

        public Builder setSelfLink(String selfLink) {
            this.selfLink = Objects.requireNonNull(selfLink);
            return this;
        }

        public Builder setSize(Integer size) {
            this.size = Objects.requireNonNull(size);
            return this;
        }

        public Builder setZone(String zone) {
            this.zone = Objects.requireNonNull(zone);
            return this;
        }
        public GetInstanceGroupResult build() {
            return new GetInstanceGroupResult(description, id, instances, name, namedPorts, network, project, selfLink, size, zone);
        }
    }
}
