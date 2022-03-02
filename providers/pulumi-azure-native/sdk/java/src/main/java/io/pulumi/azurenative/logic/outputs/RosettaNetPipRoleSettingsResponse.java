// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.logic.outputs;

import io.pulumi.azurenative.logic.outputs.RosettaNetPipBusinessDocumentResponse;
import io.pulumi.core.annotations.OutputCustomType;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class RosettaNetPipRoleSettingsResponse {
    /**
     * The action name.
     * 
     */
    private final String action;
    /**
     * The RosettaNet ProcessConfiguration business document.
     * 
     */
    private final RosettaNetPipBusinessDocumentResponse businessDocument;
    /**
     * The description.
     * 
     */
    private final @Nullable String description;
    /**
     * The role name.
     * 
     */
    private final String role;
    /**
     * The RosettaNet ProcessConfiguration role type.
     * 
     */
    private final String roleType;
    /**
     * The service name.
     * 
     */
    private final String service;
    /**
     * The service classification name.
     * 
     */
    private final String serviceClassification;

    @OutputCustomType.Constructor({"action","businessDocument","description","role","roleType","service","serviceClassification"})
    private RosettaNetPipRoleSettingsResponse(
        String action,
        RosettaNetPipBusinessDocumentResponse businessDocument,
        @Nullable String description,
        String role,
        String roleType,
        String service,
        String serviceClassification) {
        this.action = Objects.requireNonNull(action);
        this.businessDocument = Objects.requireNonNull(businessDocument);
        this.description = description;
        this.role = Objects.requireNonNull(role);
        this.roleType = Objects.requireNonNull(roleType);
        this.service = Objects.requireNonNull(service);
        this.serviceClassification = Objects.requireNonNull(serviceClassification);
    }

    /**
     * The action name.
     * 
    */
    public String getAction() {
        return this.action;
    }
    /**
     * The RosettaNet ProcessConfiguration business document.
     * 
    */
    public RosettaNetPipBusinessDocumentResponse getBusinessDocument() {
        return this.businessDocument;
    }
    /**
     * The description.
     * 
    */
    public Optional<String> getDescription() {
        return Optional.ofNullable(this.description);
    }
    /**
     * The role name.
     * 
    */
    public String getRole() {
        return this.role;
    }
    /**
     * The RosettaNet ProcessConfiguration role type.
     * 
    */
    public String getRoleType() {
        return this.roleType;
    }
    /**
     * The service name.
     * 
    */
    public String getService() {
        return this.service;
    }
    /**
     * The service classification name.
     * 
    */
    public String getServiceClassification() {
        return this.serviceClassification;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(RosettaNetPipRoleSettingsResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String action;
        private RosettaNetPipBusinessDocumentResponse businessDocument;
        private @Nullable String description;
        private String role;
        private String roleType;
        private String service;
        private String serviceClassification;

        public Builder() {
    	      // Empty
        }

        public Builder(RosettaNetPipRoleSettingsResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.action = defaults.action;
    	      this.businessDocument = defaults.businessDocument;
    	      this.description = defaults.description;
    	      this.role = defaults.role;
    	      this.roleType = defaults.roleType;
    	      this.service = defaults.service;
    	      this.serviceClassification = defaults.serviceClassification;
        }

        public Builder setAction(String action) {
            this.action = Objects.requireNonNull(action);
            return this;
        }

        public Builder setBusinessDocument(RosettaNetPipBusinessDocumentResponse businessDocument) {
            this.businessDocument = Objects.requireNonNull(businessDocument);
            return this;
        }

        public Builder setDescription(@Nullable String description) {
            this.description = description;
            return this;
        }

        public Builder setRole(String role) {
            this.role = Objects.requireNonNull(role);
            return this;
        }

        public Builder setRoleType(String roleType) {
            this.roleType = Objects.requireNonNull(roleType);
            return this;
        }

        public Builder setService(String service) {
            this.service = Objects.requireNonNull(service);
            return this;
        }

        public Builder setServiceClassification(String serviceClassification) {
            this.serviceClassification = Objects.requireNonNull(serviceClassification);
            return this;
        }
        public RosettaNetPipRoleSettingsResponse build() {
            return new RosettaNetPipRoleSettingsResponse(action, businessDocument, description, role, roleType, service, serviceClassification);
        }
    }
}
