// *** WARNING: this file was generated by test. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.alertsmanagement.inputs;

import io.pulumi.core.internal.annotations.InputImport;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * Action rule with action group configuration
 * 
 */
public final class ActionGroupResponse extends io.pulumi.resources.InvokeArgs {

    public static final ActionGroupResponse Empty = new ActionGroupResponse();

    /**
     * Action group to trigger if action rule matches
     * 
     */
    @InputImport(name="actionGroupId", required=true)
    private final String actionGroupId;

    public String getActionGroupId() {
        return this.actionGroupId;
    }

    /**
     * Creation time of action rule. Date-Time in ISO-8601 format.
     * 
     */
    @InputImport(name="createdAt", required=true)
    private final String createdAt;

    public String getCreatedAt() {
        return this.createdAt;
    }

    /**
     * Created by user name.
     * 
     */
    @InputImport(name="createdBy", required=true)
    private final String createdBy;

    public String getCreatedBy() {
        return this.createdBy;
    }

    /**
     * Description of action rule
     * 
     */
    @InputImport(name="description")
    private final @Nullable String description;

    public Optional<String> getDescription() {
        return this.description == null ? Optional.empty() : Optional.ofNullable(this.description);
    }

    /**
     * Last updated time of action rule. Date-Time in ISO-8601 format.
     * 
     */
    @InputImport(name="lastModifiedAt", required=true)
    private final String lastModifiedAt;

    public String getLastModifiedAt() {
        return this.lastModifiedAt;
    }

    /**
     * Last modified by user name.
     * 
     */
    @InputImport(name="lastModifiedBy", required=true)
    private final String lastModifiedBy;

    public String getLastModifiedBy() {
        return this.lastModifiedBy;
    }

    /**
     * Indicates if the given action rule is enabled or disabled
     * 
     */
    @InputImport(name="status")
    private final @Nullable String status;

    public Optional<String> getStatus() {
        return this.status == null ? Optional.empty() : Optional.ofNullable(this.status);
    }

    /**
     * Indicates type of action rule
     * Expected value is 'ActionGroup'.
     * 
     */
    @InputImport(name="type", required=true)
    private final String type;

    public String getType() {
        return this.type;
    }

    public ActionGroupResponse(
        String actionGroupId,
        String createdAt,
        String createdBy,
        @Nullable String description,
        String lastModifiedAt,
        String lastModifiedBy,
        @Nullable String status,
        String type) {
        this.actionGroupId = Objects.requireNonNull(actionGroupId, "expected parameter 'actionGroupId' to be non-null");
        this.createdAt = Objects.requireNonNull(createdAt, "expected parameter 'createdAt' to be non-null");
        this.createdBy = Objects.requireNonNull(createdBy, "expected parameter 'createdBy' to be non-null");
        this.description = description;
        this.lastModifiedAt = Objects.requireNonNull(lastModifiedAt, "expected parameter 'lastModifiedAt' to be non-null");
        this.lastModifiedBy = Objects.requireNonNull(lastModifiedBy, "expected parameter 'lastModifiedBy' to be non-null");
        this.status = status;
        this.type = Objects.requireNonNull(type, "expected parameter 'type' to be non-null");
    }

    private ActionGroupResponse() {
        this.actionGroupId = null;
        this.createdAt = null;
        this.createdBy = null;
        this.description = null;
        this.lastModifiedAt = null;
        this.lastModifiedBy = null;
        this.status = null;
        this.type = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ActionGroupResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String actionGroupId;
        private String createdAt;
        private String createdBy;
        private @Nullable String description;
        private String lastModifiedAt;
        private String lastModifiedBy;
        private @Nullable String status;
        private String type;

        public Builder() {
    	      // Empty
        }

        public Builder(ActionGroupResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.actionGroupId = defaults.actionGroupId;
    	      this.createdAt = defaults.createdAt;
    	      this.createdBy = defaults.createdBy;
    	      this.description = defaults.description;
    	      this.lastModifiedAt = defaults.lastModifiedAt;
    	      this.lastModifiedBy = defaults.lastModifiedBy;
    	      this.status = defaults.status;
    	      this.type = defaults.type;
        }

        public Builder setActionGroupId(String actionGroupId) {
            this.actionGroupId = Objects.requireNonNull(actionGroupId);
            return this;
        }

        public Builder setCreatedAt(String createdAt) {
            this.createdAt = Objects.requireNonNull(createdAt);
            return this;
        }

        public Builder setCreatedBy(String createdBy) {
            this.createdBy = Objects.requireNonNull(createdBy);
            return this;
        }

        public Builder setDescription(@Nullable String description) {
            this.description = description;
            return this;
        }

        public Builder setLastModifiedAt(String lastModifiedAt) {
            this.lastModifiedAt = Objects.requireNonNull(lastModifiedAt);
            return this;
        }

        public Builder setLastModifiedBy(String lastModifiedBy) {
            this.lastModifiedBy = Objects.requireNonNull(lastModifiedBy);
            return this;
        }

        public Builder setStatus(@Nullable String status) {
            this.status = status;
            return this;
        }

        public Builder setType(String type) {
            this.type = Objects.requireNonNull(type);
            return this;
        }

        public ActionGroupResponse build() {
            return new ActionGroupResponse(actionGroupId, createdAt, createdBy, description, lastModifiedAt, lastModifiedBy, status, type);
        }
    }
}
