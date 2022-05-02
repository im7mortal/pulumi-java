// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.compute_alpha;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.googlenative.compute_alpha.inputs.NamedPortArgs;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class InstanceGroupArgs extends com.pulumi.resources.ResourceArgs {

    public static final InstanceGroupArgs Empty = new InstanceGroupArgs();

    /**
     * An optional description of this resource. Provide this property when you create the resource.
     * 
     */
    @Import(name="description")
    private @Nullable Output<String> description;

    /**
     * @return An optional description of this resource. Provide this property when you create the resource.
     * 
     */
    public Optional<Output<String>> description() {
        return Optional.ofNullable(this.description);
    }

    /**
     * The name of the instance group. The name must be 1-63 characters long, and comply with RFC1035.
     * 
     */
    @Import(name="name")
    private @Nullable Output<String> name;

    /**
     * @return The name of the instance group. The name must be 1-63 characters long, and comply with RFC1035.
     * 
     */
    public Optional<Output<String>> name() {
        return Optional.ofNullable(this.name);
    }

    /**
     *  Assigns a name to a port number. For example: {name: &#34;http&#34;, port: 80} This allows the system to reference ports by the assigned name instead of a port number. Named ports can also contain multiple ports. For example: [{name: &#34;app1&#34;, port: 8080}, {name: &#34;app1&#34;, port: 8081}, {name: &#34;app2&#34;, port: 8082}] Named ports apply to all instances in this instance group.
     * 
     */
    @Import(name="namedPorts")
    private @Nullable Output<List<NamedPortArgs>> namedPorts;

    /**
     * @return  Assigns a name to a port number. For example: {name: &#34;http&#34;, port: 80} This allows the system to reference ports by the assigned name instead of a port number. Named ports can also contain multiple ports. For example: [{name: &#34;app1&#34;, port: 8080}, {name: &#34;app1&#34;, port: 8081}, {name: &#34;app2&#34;, port: 8082}] Named ports apply to all instances in this instance group.
     * 
     */
    public Optional<Output<List<NamedPortArgs>>> namedPorts() {
        return Optional.ofNullable(this.namedPorts);
    }

    @Import(name="project")
    private @Nullable Output<String> project;

    public Optional<Output<String>> project() {
        return Optional.ofNullable(this.project);
    }

    /**
     * An optional request ID to identify requests. Specify a unique request ID so that if you must retry your request, the server will know to ignore the request if it has already been completed. For example, consider a situation where you make an initial request and the request times out. If you make the request again with the same request ID, the server can check if original operation with the same request ID was received, and if so, will ignore the second request. This prevents clients from accidentally creating duplicate commitments. The request ID must be a valid UUID with the exception that zero UUID is not supported ( 00000000-0000-0000-0000-000000000000).
     * 
     */
    @Import(name="requestId")
    private @Nullable Output<String> requestId;

    /**
     * @return An optional request ID to identify requests. Specify a unique request ID so that if you must retry your request, the server will know to ignore the request if it has already been completed. For example, consider a situation where you make an initial request and the request times out. If you make the request again with the same request ID, the server can check if original operation with the same request ID was received, and if so, will ignore the second request. This prevents clients from accidentally creating duplicate commitments. The request ID must be a valid UUID with the exception that zero UUID is not supported ( 00000000-0000-0000-0000-000000000000).
     * 
     */
    public Optional<Output<String>> requestId() {
        return Optional.ofNullable(this.requestId);
    }

    @Import(name="zone")
    private @Nullable Output<String> zone;

    public Optional<Output<String>> zone() {
        return Optional.ofNullable(this.zone);
    }

    private InstanceGroupArgs() {}

    private InstanceGroupArgs(InstanceGroupArgs $) {
        this.description = $.description;
        this.name = $.name;
        this.namedPorts = $.namedPorts;
        this.project = $.project;
        this.requestId = $.requestId;
        this.zone = $.zone;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(InstanceGroupArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private InstanceGroupArgs $;

        public Builder() {
            $ = new InstanceGroupArgs();
        }

        public Builder(InstanceGroupArgs defaults) {
            $ = new InstanceGroupArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param description An optional description of this resource. Provide this property when you create the resource.
         * 
         * @return builder
         * 
         */
        public Builder description(@Nullable Output<String> description) {
            $.description = description;
            return this;
        }

        /**
         * @param description An optional description of this resource. Provide this property when you create the resource.
         * 
         * @return builder
         * 
         */
        public Builder description(String description) {
            return description(Output.of(description));
        }

        /**
         * @param name The name of the instance group. The name must be 1-63 characters long, and comply with RFC1035.
         * 
         * @return builder
         * 
         */
        public Builder name(@Nullable Output<String> name) {
            $.name = name;
            return this;
        }

        /**
         * @param name The name of the instance group. The name must be 1-63 characters long, and comply with RFC1035.
         * 
         * @return builder
         * 
         */
        public Builder name(String name) {
            return name(Output.of(name));
        }

        /**
         * @param namedPorts  Assigns a name to a port number. For example: {name: &#34;http&#34;, port: 80} This allows the system to reference ports by the assigned name instead of a port number. Named ports can also contain multiple ports. For example: [{name: &#34;app1&#34;, port: 8080}, {name: &#34;app1&#34;, port: 8081}, {name: &#34;app2&#34;, port: 8082}] Named ports apply to all instances in this instance group.
         * 
         * @return builder
         * 
         */
        public Builder namedPorts(@Nullable Output<List<NamedPortArgs>> namedPorts) {
            $.namedPorts = namedPorts;
            return this;
        }

        /**
         * @param namedPorts  Assigns a name to a port number. For example: {name: &#34;http&#34;, port: 80} This allows the system to reference ports by the assigned name instead of a port number. Named ports can also contain multiple ports. For example: [{name: &#34;app1&#34;, port: 8080}, {name: &#34;app1&#34;, port: 8081}, {name: &#34;app2&#34;, port: 8082}] Named ports apply to all instances in this instance group.
         * 
         * @return builder
         * 
         */
        public Builder namedPorts(List<NamedPortArgs> namedPorts) {
            return namedPorts(Output.of(namedPorts));
        }

        /**
         * @param namedPorts  Assigns a name to a port number. For example: {name: &#34;http&#34;, port: 80} This allows the system to reference ports by the assigned name instead of a port number. Named ports can also contain multiple ports. For example: [{name: &#34;app1&#34;, port: 8080}, {name: &#34;app1&#34;, port: 8081}, {name: &#34;app2&#34;, port: 8082}] Named ports apply to all instances in this instance group.
         * 
         * @return builder
         * 
         */
        public Builder namedPorts(NamedPortArgs... namedPorts) {
            return namedPorts(List.of(namedPorts));
        }

        public Builder project(@Nullable Output<String> project) {
            $.project = project;
            return this;
        }

        public Builder project(String project) {
            return project(Output.of(project));
        }

        /**
         * @param requestId An optional request ID to identify requests. Specify a unique request ID so that if you must retry your request, the server will know to ignore the request if it has already been completed. For example, consider a situation where you make an initial request and the request times out. If you make the request again with the same request ID, the server can check if original operation with the same request ID was received, and if so, will ignore the second request. This prevents clients from accidentally creating duplicate commitments. The request ID must be a valid UUID with the exception that zero UUID is not supported ( 00000000-0000-0000-0000-000000000000).
         * 
         * @return builder
         * 
         */
        public Builder requestId(@Nullable Output<String> requestId) {
            $.requestId = requestId;
            return this;
        }

        /**
         * @param requestId An optional request ID to identify requests. Specify a unique request ID so that if you must retry your request, the server will know to ignore the request if it has already been completed. For example, consider a situation where you make an initial request and the request times out. If you make the request again with the same request ID, the server can check if original operation with the same request ID was received, and if so, will ignore the second request. This prevents clients from accidentally creating duplicate commitments. The request ID must be a valid UUID with the exception that zero UUID is not supported ( 00000000-0000-0000-0000-000000000000).
         * 
         * @return builder
         * 
         */
        public Builder requestId(String requestId) {
            return requestId(Output.of(requestId));
        }

        public Builder zone(@Nullable Output<String> zone) {
            $.zone = zone;
            return this;
        }

        public Builder zone(String zone) {
            return zone(Output.of(zone));
        }

        public InstanceGroupArgs build() {
            return $;
        }
    }

}
