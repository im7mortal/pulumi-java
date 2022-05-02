// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.compute_beta;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.googlenative.compute_beta.inputs.LicenseResourceRequirementsArgs;
import java.lang.Boolean;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class LicenseArgs extends com.pulumi.resources.ResourceArgs {

    public static final LicenseArgs Empty = new LicenseArgs();

    /**
     * An optional textual description of the resource; provided by the client when the resource is created.
     * 
     */
    @Import(name="description")
    private @Nullable Output<String> description;

    /**
     * @return An optional textual description of the resource; provided by the client when the resource is created.
     * 
     */
    public Optional<Output<String>> description() {
        return Optional.ofNullable(this.description);
    }

    /**
     * Name of the resource. The name must be 1-63 characters long and comply with RFC1035.
     * 
     */
    @Import(name="name")
    private @Nullable Output<String> name;

    /**
     * @return Name of the resource. The name must be 1-63 characters long and comply with RFC1035.
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

    @Import(name="resourceRequirements")
    private @Nullable Output<LicenseResourceRequirementsArgs> resourceRequirements;

    public Optional<Output<LicenseResourceRequirementsArgs>> resourceRequirements() {
        return Optional.ofNullable(this.resourceRequirements);
    }

    /**
     * If false, licenses will not be copied from the source resource when creating an image from a disk, disk from snapshot, or snapshot from disk.
     * 
     */
    @Import(name="transferable")
    private @Nullable Output<Boolean> transferable;

    /**
     * @return If false, licenses will not be copied from the source resource when creating an image from a disk, disk from snapshot, or snapshot from disk.
     * 
     */
    public Optional<Output<Boolean>> transferable() {
        return Optional.ofNullable(this.transferable);
    }

    private LicenseArgs() {}

    private LicenseArgs(LicenseArgs $) {
        this.description = $.description;
        this.name = $.name;
        this.project = $.project;
        this.requestId = $.requestId;
        this.resourceRequirements = $.resourceRequirements;
        this.transferable = $.transferable;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(LicenseArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private LicenseArgs $;

        public Builder() {
            $ = new LicenseArgs();
        }

        public Builder(LicenseArgs defaults) {
            $ = new LicenseArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param description An optional textual description of the resource; provided by the client when the resource is created.
         * 
         * @return builder
         * 
         */
        public Builder description(@Nullable Output<String> description) {
            $.description = description;
            return this;
        }

        /**
         * @param description An optional textual description of the resource; provided by the client when the resource is created.
         * 
         * @return builder
         * 
         */
        public Builder description(String description) {
            return description(Output.of(description));
        }

        /**
         * @param name Name of the resource. The name must be 1-63 characters long and comply with RFC1035.
         * 
         * @return builder
         * 
         */
        public Builder name(@Nullable Output<String> name) {
            $.name = name;
            return this;
        }

        /**
         * @param name Name of the resource. The name must be 1-63 characters long and comply with RFC1035.
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

        public Builder resourceRequirements(@Nullable Output<LicenseResourceRequirementsArgs> resourceRequirements) {
            $.resourceRequirements = resourceRequirements;
            return this;
        }

        public Builder resourceRequirements(LicenseResourceRequirementsArgs resourceRequirements) {
            return resourceRequirements(Output.of(resourceRequirements));
        }

        /**
         * @param transferable If false, licenses will not be copied from the source resource when creating an image from a disk, disk from snapshot, or snapshot from disk.
         * 
         * @return builder
         * 
         */
        public Builder transferable(@Nullable Output<Boolean> transferable) {
            $.transferable = transferable;
            return this;
        }

        /**
         * @param transferable If false, licenses will not be copied from the source resource when creating an image from a disk, disk from snapshot, or snapshot from disk.
         * 
         * @return builder
         * 
         */
        public Builder transferable(Boolean transferable) {
            return transferable(Output.of(transferable));
        }

        public LicenseArgs build() {
            return $;
        }
    }

}
