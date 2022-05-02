// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.compute_alpha;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.googlenative.compute_alpha.inputs.InstancePropertiesArgs;
import com.pulumi.googlenative.compute_alpha.inputs.SourceInstanceParamsArgs;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class InstanceTemplateArgs extends com.pulumi.resources.ResourceArgs {

    public static final InstanceTemplateArgs Empty = new InstanceTemplateArgs();

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
     * Name of the resource; provided by the client when the resource is created. The name must be 1-63 characters long, and comply with RFC1035. Specifically, the name must be 1-63 characters long and match the regular expression `[a-z]([-a-z0-9]*[a-z0-9])?` which means the first character must be a lowercase letter, and all following characters must be a dash, lowercase letter, or digit, except the last character, which cannot be a dash.
     * 
     */
    @Import(name="name")
    private @Nullable Output<String> name;

    /**
     * @return Name of the resource; provided by the client when the resource is created. The name must be 1-63 characters long, and comply with RFC1035. Specifically, the name must be 1-63 characters long and match the regular expression `[a-z]([-a-z0-9]*[a-z0-9])?` which means the first character must be a lowercase letter, and all following characters must be a dash, lowercase letter, or digit, except the last character, which cannot be a dash.
     * 
     */
    public Optional<Output<String>> name() {
        return Optional.ofNullable(this.name);
    }

    @Import(name="project")
    private @Nullable Output<String> project;

    public Optional<Output<String>> project() {
        return Optional.ofNullable(this.project);
    }

    /**
     * The instance properties for this instance template.
     * 
     */
    @Import(name="properties")
    private @Nullable Output<InstancePropertiesArgs> properties;

    /**
     * @return The instance properties for this instance template.
     * 
     */
    public Optional<Output<InstancePropertiesArgs>> properties() {
        return Optional.ofNullable(this.properties);
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

    /**
     * The source instance used to create the template. You can provide this as a partial or full URL to the resource. For example, the following are valid values: - https://www.googleapis.com/compute/v1/projects/project/zones/zone /instances/instance - projects/project/zones/zone/instances/instance
     * 
     */
    @Import(name="sourceInstance")
    private @Nullable Output<String> sourceInstance;

    /**
     * @return The source instance used to create the template. You can provide this as a partial or full URL to the resource. For example, the following are valid values: - https://www.googleapis.com/compute/v1/projects/project/zones/zone /instances/instance - projects/project/zones/zone/instances/instance
     * 
     */
    public Optional<Output<String>> sourceInstance() {
        return Optional.ofNullable(this.sourceInstance);
    }

    /**
     * The source instance params to use to create this instance template.
     * 
     */
    @Import(name="sourceInstanceParams")
    private @Nullable Output<SourceInstanceParamsArgs> sourceInstanceParams;

    /**
     * @return The source instance params to use to create this instance template.
     * 
     */
    public Optional<Output<SourceInstanceParamsArgs>> sourceInstanceParams() {
        return Optional.ofNullable(this.sourceInstanceParams);
    }

    private InstanceTemplateArgs() {}

    private InstanceTemplateArgs(InstanceTemplateArgs $) {
        this.description = $.description;
        this.name = $.name;
        this.project = $.project;
        this.properties = $.properties;
        this.requestId = $.requestId;
        this.sourceInstance = $.sourceInstance;
        this.sourceInstanceParams = $.sourceInstanceParams;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(InstanceTemplateArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private InstanceTemplateArgs $;

        public Builder() {
            $ = new InstanceTemplateArgs();
        }

        public Builder(InstanceTemplateArgs defaults) {
            $ = new InstanceTemplateArgs(Objects.requireNonNull(defaults));
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
         * @param name Name of the resource; provided by the client when the resource is created. The name must be 1-63 characters long, and comply with RFC1035. Specifically, the name must be 1-63 characters long and match the regular expression `[a-z]([-a-z0-9]*[a-z0-9])?` which means the first character must be a lowercase letter, and all following characters must be a dash, lowercase letter, or digit, except the last character, which cannot be a dash.
         * 
         * @return builder
         * 
         */
        public Builder name(@Nullable Output<String> name) {
            $.name = name;
            return this;
        }

        /**
         * @param name Name of the resource; provided by the client when the resource is created. The name must be 1-63 characters long, and comply with RFC1035. Specifically, the name must be 1-63 characters long and match the regular expression `[a-z]([-a-z0-9]*[a-z0-9])?` which means the first character must be a lowercase letter, and all following characters must be a dash, lowercase letter, or digit, except the last character, which cannot be a dash.
         * 
         * @return builder
         * 
         */
        public Builder name(String name) {
            return name(Output.of(name));
        }

        public Builder project(@Nullable Output<String> project) {
            $.project = project;
            return this;
        }

        public Builder project(String project) {
            return project(Output.of(project));
        }

        /**
         * @param properties The instance properties for this instance template.
         * 
         * @return builder
         * 
         */
        public Builder properties(@Nullable Output<InstancePropertiesArgs> properties) {
            $.properties = properties;
            return this;
        }

        /**
         * @param properties The instance properties for this instance template.
         * 
         * @return builder
         * 
         */
        public Builder properties(InstancePropertiesArgs properties) {
            return properties(Output.of(properties));
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

        /**
         * @param sourceInstance The source instance used to create the template. You can provide this as a partial or full URL to the resource. For example, the following are valid values: - https://www.googleapis.com/compute/v1/projects/project/zones/zone /instances/instance - projects/project/zones/zone/instances/instance
         * 
         * @return builder
         * 
         */
        public Builder sourceInstance(@Nullable Output<String> sourceInstance) {
            $.sourceInstance = sourceInstance;
            return this;
        }

        /**
         * @param sourceInstance The source instance used to create the template. You can provide this as a partial or full URL to the resource. For example, the following are valid values: - https://www.googleapis.com/compute/v1/projects/project/zones/zone /instances/instance - projects/project/zones/zone/instances/instance
         * 
         * @return builder
         * 
         */
        public Builder sourceInstance(String sourceInstance) {
            return sourceInstance(Output.of(sourceInstance));
        }

        /**
         * @param sourceInstanceParams The source instance params to use to create this instance template.
         * 
         * @return builder
         * 
         */
        public Builder sourceInstanceParams(@Nullable Output<SourceInstanceParamsArgs> sourceInstanceParams) {
            $.sourceInstanceParams = sourceInstanceParams;
            return this;
        }

        /**
         * @param sourceInstanceParams The source instance params to use to create this instance template.
         * 
         * @return builder
         * 
         */
        public Builder sourceInstanceParams(SourceInstanceParamsArgs sourceInstanceParams) {
            return sourceInstanceParams(Output.of(sourceInstanceParams));
        }

        public InstanceTemplateArgs build() {
            return $;
        }
    }

}
