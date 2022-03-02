// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.authorization.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;

@OutputCustomType
public final class PermissionResponse {
    /**
     * Allowed actions.
     * 
     */
    private final @Nullable List<String> actions;
    /**
     * Allowed Data actions.
     * 
     */
    private final @Nullable List<String> dataActions;
    /**
     * Denied actions.
     * 
     */
    private final @Nullable List<String> notActions;
    /**
     * Denied Data actions.
     * 
     */
    private final @Nullable List<String> notDataActions;

    @OutputCustomType.Constructor({"actions","dataActions","notActions","notDataActions"})
    private PermissionResponse(
        @Nullable List<String> actions,
        @Nullable List<String> dataActions,
        @Nullable List<String> notActions,
        @Nullable List<String> notDataActions) {
        this.actions = actions;
        this.dataActions = dataActions;
        this.notActions = notActions;
        this.notDataActions = notDataActions;
    }

    /**
     * Allowed actions.
     * 
    */
    public List<String> getActions() {
        return this.actions == null ? List.of() : this.actions;
    }
    /**
     * Allowed Data actions.
     * 
    */
    public List<String> getDataActions() {
        return this.dataActions == null ? List.of() : this.dataActions;
    }
    /**
     * Denied actions.
     * 
    */
    public List<String> getNotActions() {
        return this.notActions == null ? List.of() : this.notActions;
    }
    /**
     * Denied Data actions.
     * 
    */
    public List<String> getNotDataActions() {
        return this.notDataActions == null ? List.of() : this.notDataActions;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(PermissionResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable List<String> actions;
        private @Nullable List<String> dataActions;
        private @Nullable List<String> notActions;
        private @Nullable List<String> notDataActions;

        public Builder() {
    	      // Empty
        }

        public Builder(PermissionResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.actions = defaults.actions;
    	      this.dataActions = defaults.dataActions;
    	      this.notActions = defaults.notActions;
    	      this.notDataActions = defaults.notDataActions;
        }

        public Builder setActions(@Nullable List<String> actions) {
            this.actions = actions;
            return this;
        }

        public Builder setDataActions(@Nullable List<String> dataActions) {
            this.dataActions = dataActions;
            return this;
        }

        public Builder setNotActions(@Nullable List<String> notActions) {
            this.notActions = notActions;
            return this;
        }

        public Builder setNotDataActions(@Nullable List<String> notDataActions) {
            this.notDataActions = notDataActions;
            return this;
        }
        public PermissionResponse build() {
            return new PermissionResponse(actions, dataActions, notActions, notDataActions);
        }
    }
}
