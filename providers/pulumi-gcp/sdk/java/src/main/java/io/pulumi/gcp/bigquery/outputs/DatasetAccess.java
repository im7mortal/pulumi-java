// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.bigquery.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import io.pulumi.gcp.bigquery.outputs.DatasetAccessView;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class DatasetAccess {
    /**
     * A domain to grant access to. Any users signed in with the
     * domain specified will be granted the specified access
     * 
     */
    private final @Nullable String domain;
    /**
     * An email address of a Google Group to grant access to.
     * 
     */
    private final @Nullable String groupByEmail;
    /**
     * Describes the rights granted to the user specified by the other
     * member of the access object. Basic, predefined, and custom roles
     * are supported. Predefined roles that have equivalent basic roles
     * are swapped by the API to their basic counterparts. See
     * [official docs](https://cloud.google.com/bigquery/docs/access-control).
     * 
     */
    private final @Nullable String role;
    /**
     * A special group to grant access to. Possible values include:
     * 
     */
    private final @Nullable String specialGroup;
    /**
     * An email address of a user to grant access to. For example:
     * fred@example.com
     * 
     */
    private final @Nullable String userByEmail;
    /**
     * A view from a different dataset to grant access to. Queries
     * executed against that view will have read access to tables in
     * this dataset. The role field is not required when this field is
     * set. If that view is updated by any user, access to the view
     * needs to be granted again via an update operation.
     * Structure is documented below.
     * 
     */
    private final @Nullable DatasetAccessView view;

    @OutputCustomType.Constructor({"domain","groupByEmail","role","specialGroup","userByEmail","view"})
    private DatasetAccess(
        @Nullable String domain,
        @Nullable String groupByEmail,
        @Nullable String role,
        @Nullable String specialGroup,
        @Nullable String userByEmail,
        @Nullable DatasetAccessView view) {
        this.domain = domain;
        this.groupByEmail = groupByEmail;
        this.role = role;
        this.specialGroup = specialGroup;
        this.userByEmail = userByEmail;
        this.view = view;
    }

    /**
     * A domain to grant access to. Any users signed in with the
     * domain specified will be granted the specified access
     * 
    */
    public Optional<String> getDomain() {
        return Optional.ofNullable(this.domain);
    }
    /**
     * An email address of a Google Group to grant access to.
     * 
    */
    public Optional<String> getGroupByEmail() {
        return Optional.ofNullable(this.groupByEmail);
    }
    /**
     * Describes the rights granted to the user specified by the other
     * member of the access object. Basic, predefined, and custom roles
     * are supported. Predefined roles that have equivalent basic roles
     * are swapped by the API to their basic counterparts. See
     * [official docs](https://cloud.google.com/bigquery/docs/access-control).
     * 
    */
    public Optional<String> getRole() {
        return Optional.ofNullable(this.role);
    }
    /**
     * A special group to grant access to. Possible values include:
     * 
    */
    public Optional<String> getSpecialGroup() {
        return Optional.ofNullable(this.specialGroup);
    }
    /**
     * An email address of a user to grant access to. For example:
     * fred@example.com
     * 
    */
    public Optional<String> getUserByEmail() {
        return Optional.ofNullable(this.userByEmail);
    }
    /**
     * A view from a different dataset to grant access to. Queries
     * executed against that view will have read access to tables in
     * this dataset. The role field is not required when this field is
     * set. If that view is updated by any user, access to the view
     * needs to be granted again via an update operation.
     * Structure is documented below.
     * 
    */
    public Optional<DatasetAccessView> getView() {
        return Optional.ofNullable(this.view);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(DatasetAccess defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String domain;
        private @Nullable String groupByEmail;
        private @Nullable String role;
        private @Nullable String specialGroup;
        private @Nullable String userByEmail;
        private @Nullable DatasetAccessView view;

        public Builder() {
    	      // Empty
        }

        public Builder(DatasetAccess defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.domain = defaults.domain;
    	      this.groupByEmail = defaults.groupByEmail;
    	      this.role = defaults.role;
    	      this.specialGroup = defaults.specialGroup;
    	      this.userByEmail = defaults.userByEmail;
    	      this.view = defaults.view;
        }

        public Builder setDomain(@Nullable String domain) {
            this.domain = domain;
            return this;
        }

        public Builder setGroupByEmail(@Nullable String groupByEmail) {
            this.groupByEmail = groupByEmail;
            return this;
        }

        public Builder setRole(@Nullable String role) {
            this.role = role;
            return this;
        }

        public Builder setSpecialGroup(@Nullable String specialGroup) {
            this.specialGroup = specialGroup;
            return this;
        }

        public Builder setUserByEmail(@Nullable String userByEmail) {
            this.userByEmail = userByEmail;
            return this;
        }

        public Builder setView(@Nullable DatasetAccessView view) {
            this.view = view;
            return this;
        }
        public DatasetAccess build() {
            return new DatasetAccess(domain, groupByEmail, role, specialGroup, userByEmail, view);
        }
    }
}
