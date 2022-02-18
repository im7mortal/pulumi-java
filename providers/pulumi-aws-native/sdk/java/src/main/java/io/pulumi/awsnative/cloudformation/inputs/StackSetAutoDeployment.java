// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.cloudformation.inputs;

import io.pulumi.core.internal.annotations.InputImport;
import java.lang.Boolean;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class StackSetAutoDeployment extends io.pulumi.resources.InvokeArgs {

    public static final StackSetAutoDeployment Empty = new StackSetAutoDeployment();

    /**
     * If set to true, StackSets automatically deploys additional stack instances to AWS Organizations accounts that are added to a target organization or organizational unit (OU) in the specified Regions. If an account is removed from a target organization or OU, StackSets deletes stack instances from the account in the specified Regions.
     * 
     */
    @InputImport(name="enabled")
    private final @Nullable Boolean enabled;

    public Optional<Boolean> getEnabled() {
        return this.enabled == null ? Optional.empty() : Optional.ofNullable(this.enabled);
    }

    /**
     * If set to true, stack resources are retained when an account is removed from a target organization or OU. If set to false, stack resources are deleted. Specify only if Enabled is set to True.
     * 
     */
    @InputImport(name="retainStacksOnAccountRemoval")
    private final @Nullable Boolean retainStacksOnAccountRemoval;

    public Optional<Boolean> getRetainStacksOnAccountRemoval() {
        return this.retainStacksOnAccountRemoval == null ? Optional.empty() : Optional.ofNullable(this.retainStacksOnAccountRemoval);
    }

    public StackSetAutoDeployment(
        @Nullable Boolean enabled,
        @Nullable Boolean retainStacksOnAccountRemoval) {
        this.enabled = enabled;
        this.retainStacksOnAccountRemoval = retainStacksOnAccountRemoval;
    }

    private StackSetAutoDeployment() {
        this.enabled = null;
        this.retainStacksOnAccountRemoval = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(StackSetAutoDeployment defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Boolean enabled;
        private @Nullable Boolean retainStacksOnAccountRemoval;

        public Builder() {
    	      // Empty
        }

        public Builder(StackSetAutoDeployment defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.enabled = defaults.enabled;
    	      this.retainStacksOnAccountRemoval = defaults.retainStacksOnAccountRemoval;
        }

        public Builder setEnabled(@Nullable Boolean enabled) {
            this.enabled = enabled;
            return this;
        }

        public Builder setRetainStacksOnAccountRemoval(@Nullable Boolean retainStacksOnAccountRemoval) {
            this.retainStacksOnAccountRemoval = retainStacksOnAccountRemoval;
            return this;
        }

        public StackSetAutoDeployment build() {
            return new StackSetAutoDeployment(enabled, retainStacksOnAccountRemoval);
        }
    }
}
