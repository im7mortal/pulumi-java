// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.quicksight.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.internal.annotations.InputImport;
import java.lang.String;
import java.util.List;
import java.util.Objects;


/**
 * <p>Permission for the resource.</p>
 * 
 */
public final class DataSetResourcePermissionArgs extends io.pulumi.resources.ResourceArgs {

    public static final DataSetResourcePermissionArgs Empty = new DataSetResourcePermissionArgs();

    /**
     * <p>The IAM action to grant or revoke permissions on.</p>
     * 
     */
    @InputImport(name="actions", required=true)
    private final Input<List<String>> actions;

    public Input<List<String>> getActions() {
        return this.actions;
    }

    /**
     * <p>The Amazon Resource Name (ARN) of the principal. This can be one of the
     *             following:</p>
     *         <ul>
     *             <li>
     *                 <p>The ARN of an Amazon QuickSight user or group associated with a data source or dataset. (This is common.)</p>
     *             </li>
     *             <li>
     *                 <p>The ARN of an Amazon QuickSight user, group, or namespace associated with an analysis, dashboard, template, or theme. (This is common.)</p>
     *             </li>
     *             <li>
     *                 <p>The ARN of an AWS account root: This is an IAM ARN rather than a QuickSight
     *                     ARN. Use this option only to share resources (templates) across AWS accounts.
     *                     (This is less common.) </p>
     *             </li>
     *          </ul>
     * 
     */
    @InputImport(name="principal", required=true)
    private final Input<String> principal;

    public Input<String> getPrincipal() {
        return this.principal;
    }

    public DataSetResourcePermissionArgs(
        Input<List<String>> actions,
        Input<String> principal) {
        this.actions = Objects.requireNonNull(actions, "expected parameter 'actions' to be non-null");
        this.principal = Objects.requireNonNull(principal, "expected parameter 'principal' to be non-null");
    }

    private DataSetResourcePermissionArgs() {
        this.actions = Input.empty();
        this.principal = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(DataSetResourcePermissionArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Input<List<String>> actions;
        private Input<String> principal;

        public Builder() {
    	      // Empty
        }

        public Builder(DataSetResourcePermissionArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.actions = defaults.actions;
    	      this.principal = defaults.principal;
        }

        public Builder setActions(Input<List<String>> actions) {
            this.actions = Objects.requireNonNull(actions);
            return this;
        }

        public Builder setActions(List<String> actions) {
            this.actions = Input.of(Objects.requireNonNull(actions));
            return this;
        }

        public Builder setPrincipal(Input<String> principal) {
            this.principal = Objects.requireNonNull(principal);
            return this;
        }

        public Builder setPrincipal(String principal) {
            this.principal = Input.of(Objects.requireNonNull(principal));
            return this;
        }

        public DataSetResourcePermissionArgs build() {
            return new DataSetResourcePermissionArgs(actions, principal);
        }
    }
}
