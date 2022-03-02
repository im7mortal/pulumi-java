// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.projects;

import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import io.pulumi.gcp.projects.inputs.AccessApprovalSettingsEnrolledServiceArgs;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;


public final class AccessApprovalSettingsArgs extends io.pulumi.resources.ResourceArgs {

    public static final AccessApprovalSettingsArgs Empty = new AccessApprovalSettingsArgs();

    /**
     * A list of Google Cloud Services for which the given resource has Access Approval enrolled.
     * Access requests for the resource given by name against any of these services contained here will be required
     * to have explicit approval. Enrollment can only be done on an all or nothing basis.
     * A maximum of 10 enrolled services will be enforced, to be expanded as the set of supported services is expanded.
     * Structure is documented below.
     * 
     */
    @InputImport(name="enrolledServices", required=true)
      private final Input<List<AccessApprovalSettingsEnrolledServiceArgs>> enrolledServices;

    public Input<List<AccessApprovalSettingsEnrolledServiceArgs>> getEnrolledServices() {
        return this.enrolledServices;
    }

    /**
     * A list of email addresses to which notifications relating to approval requests should be sent.
     * Notifications relating to a resource will be sent to all emails in the settings of ancestor
     * resources of that resource. A maximum of 50 email addresses are allowed.
     * 
     */
    @InputImport(name="notificationEmails")
      private final @Nullable Input<List<String>> notificationEmails;

    public Input<List<String>> getNotificationEmails() {
        return this.notificationEmails == null ? Input.empty() : this.notificationEmails;
    }

    /**
     * - 
     * (Optional, Deprecated)
     * Deprecated in favor of `project_id`
     * 
     * @Deprecated
     * Deprecated in favor of `project_id`
     * 
     */
    @Deprecated /* Deprecated in favor of `project_id` */
    @InputImport(name="project")
      private final @Nullable Input<String> project;

    @Deprecated /* Deprecated in favor of `project_id` */
    public Input<String> getProject() {
        return this.project == null ? Input.empty() : this.project;
    }

    /**
     * ID of the project of the access approval settings.
     * 
     */
    @InputImport(name="projectId", required=true)
      private final Input<String> projectId;

    public Input<String> getProjectId() {
        return this.projectId;
    }

    public AccessApprovalSettingsArgs(
        Input<List<AccessApprovalSettingsEnrolledServiceArgs>> enrolledServices,
        @Nullable Input<List<String>> notificationEmails,
        @Nullable Input<String> project,
        Input<String> projectId) {
        this.enrolledServices = Objects.requireNonNull(enrolledServices, "expected parameter 'enrolledServices' to be non-null");
        this.notificationEmails = notificationEmails;
        this.project = project;
        this.projectId = Objects.requireNonNull(projectId, "expected parameter 'projectId' to be non-null");
    }

    private AccessApprovalSettingsArgs() {
        this.enrolledServices = Input.empty();
        this.notificationEmails = Input.empty();
        this.project = Input.empty();
        this.projectId = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(AccessApprovalSettingsArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Input<List<AccessApprovalSettingsEnrolledServiceArgs>> enrolledServices;
        private @Nullable Input<List<String>> notificationEmails;
        private @Nullable Input<String> project;
        private Input<String> projectId;

        public Builder() {
    	      // Empty
        }

        public Builder(AccessApprovalSettingsArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.enrolledServices = defaults.enrolledServices;
    	      this.notificationEmails = defaults.notificationEmails;
    	      this.project = defaults.project;
    	      this.projectId = defaults.projectId;
        }

        public Builder setEnrolledServices(Input<List<AccessApprovalSettingsEnrolledServiceArgs>> enrolledServices) {
            this.enrolledServices = Objects.requireNonNull(enrolledServices);
            return this;
        }

        public Builder setEnrolledServices(List<AccessApprovalSettingsEnrolledServiceArgs> enrolledServices) {
            this.enrolledServices = Input.of(Objects.requireNonNull(enrolledServices));
            return this;
        }

        public Builder setNotificationEmails(@Nullable Input<List<String>> notificationEmails) {
            this.notificationEmails = notificationEmails;
            return this;
        }

        public Builder setNotificationEmails(@Nullable List<String> notificationEmails) {
            this.notificationEmails = Input.ofNullable(notificationEmails);
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

        public Builder setProjectId(Input<String> projectId) {
            this.projectId = Objects.requireNonNull(projectId);
            return this;
        }

        public Builder setProjectId(String projectId) {
            this.projectId = Input.of(Objects.requireNonNull(projectId));
            return this;
        }
        public AccessApprovalSettingsArgs build() {
            return new AccessApprovalSettingsArgs(enrolledServices, notificationEmails, project, projectId);
        }
    }
}
