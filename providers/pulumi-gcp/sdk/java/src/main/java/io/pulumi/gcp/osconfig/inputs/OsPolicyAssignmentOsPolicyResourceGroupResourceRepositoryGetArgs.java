// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.osconfig.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.internal.annotations.InputImport;
import io.pulumi.gcp.osconfig.inputs.OsPolicyAssignmentOsPolicyResourceGroupResourceRepositoryAptGetArgs;
import io.pulumi.gcp.osconfig.inputs.OsPolicyAssignmentOsPolicyResourceGroupResourceRepositoryGooGetArgs;
import io.pulumi.gcp.osconfig.inputs.OsPolicyAssignmentOsPolicyResourceGroupResourceRepositoryYumGetArgs;
import io.pulumi.gcp.osconfig.inputs.OsPolicyAssignmentOsPolicyResourceGroupResourceRepositoryZypperGetArgs;
import java.util.Objects;
import javax.annotation.Nullable;


public final class OsPolicyAssignmentOsPolicyResourceGroupResourceRepositoryGetArgs extends io.pulumi.resources.ResourceArgs {

    public static final OsPolicyAssignmentOsPolicyResourceGroupResourceRepositoryGetArgs Empty = new OsPolicyAssignmentOsPolicyResourceGroupResourceRepositoryGetArgs();

    /**
     * An Apt Repository.
     * 
     */
    @InputImport(name="apt")
    private final @Nullable Input<OsPolicyAssignmentOsPolicyResourceGroupResourceRepositoryAptGetArgs> apt;

    public Input<OsPolicyAssignmentOsPolicyResourceGroupResourceRepositoryAptGetArgs> getApt() {
        return this.apt == null ? Input.empty() : this.apt;
    }

    /**
     * A Goo Repository.
     * 
     */
    @InputImport(name="goo")
    private final @Nullable Input<OsPolicyAssignmentOsPolicyResourceGroupResourceRepositoryGooGetArgs> goo;

    public Input<OsPolicyAssignmentOsPolicyResourceGroupResourceRepositoryGooGetArgs> getGoo() {
        return this.goo == null ? Input.empty() : this.goo;
    }

    /**
     * A Yum Repository.
     * 
     */
    @InputImport(name="yum")
    private final @Nullable Input<OsPolicyAssignmentOsPolicyResourceGroupResourceRepositoryYumGetArgs> yum;

    public Input<OsPolicyAssignmentOsPolicyResourceGroupResourceRepositoryYumGetArgs> getYum() {
        return this.yum == null ? Input.empty() : this.yum;
    }

    /**
     * A Zypper Repository.
     * 
     */
    @InputImport(name="zypper")
    private final @Nullable Input<OsPolicyAssignmentOsPolicyResourceGroupResourceRepositoryZypperGetArgs> zypper;

    public Input<OsPolicyAssignmentOsPolicyResourceGroupResourceRepositoryZypperGetArgs> getZypper() {
        return this.zypper == null ? Input.empty() : this.zypper;
    }

    public OsPolicyAssignmentOsPolicyResourceGroupResourceRepositoryGetArgs(
        @Nullable Input<OsPolicyAssignmentOsPolicyResourceGroupResourceRepositoryAptGetArgs> apt,
        @Nullable Input<OsPolicyAssignmentOsPolicyResourceGroupResourceRepositoryGooGetArgs> goo,
        @Nullable Input<OsPolicyAssignmentOsPolicyResourceGroupResourceRepositoryYumGetArgs> yum,
        @Nullable Input<OsPolicyAssignmentOsPolicyResourceGroupResourceRepositoryZypperGetArgs> zypper) {
        this.apt = apt;
        this.goo = goo;
        this.yum = yum;
        this.zypper = zypper;
    }

    private OsPolicyAssignmentOsPolicyResourceGroupResourceRepositoryGetArgs() {
        this.apt = Input.empty();
        this.goo = Input.empty();
        this.yum = Input.empty();
        this.zypper = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(OsPolicyAssignmentOsPolicyResourceGroupResourceRepositoryGetArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<OsPolicyAssignmentOsPolicyResourceGroupResourceRepositoryAptGetArgs> apt;
        private @Nullable Input<OsPolicyAssignmentOsPolicyResourceGroupResourceRepositoryGooGetArgs> goo;
        private @Nullable Input<OsPolicyAssignmentOsPolicyResourceGroupResourceRepositoryYumGetArgs> yum;
        private @Nullable Input<OsPolicyAssignmentOsPolicyResourceGroupResourceRepositoryZypperGetArgs> zypper;

        public Builder() {
    	      // Empty
        }

        public Builder(OsPolicyAssignmentOsPolicyResourceGroupResourceRepositoryGetArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.apt = defaults.apt;
    	      this.goo = defaults.goo;
    	      this.yum = defaults.yum;
    	      this.zypper = defaults.zypper;
        }

        public Builder setApt(@Nullable Input<OsPolicyAssignmentOsPolicyResourceGroupResourceRepositoryAptGetArgs> apt) {
            this.apt = apt;
            return this;
        }

        public Builder setApt(@Nullable OsPolicyAssignmentOsPolicyResourceGroupResourceRepositoryAptGetArgs apt) {
            this.apt = Input.ofNullable(apt);
            return this;
        }

        public Builder setGoo(@Nullable Input<OsPolicyAssignmentOsPolicyResourceGroupResourceRepositoryGooGetArgs> goo) {
            this.goo = goo;
            return this;
        }

        public Builder setGoo(@Nullable OsPolicyAssignmentOsPolicyResourceGroupResourceRepositoryGooGetArgs goo) {
            this.goo = Input.ofNullable(goo);
            return this;
        }

        public Builder setYum(@Nullable Input<OsPolicyAssignmentOsPolicyResourceGroupResourceRepositoryYumGetArgs> yum) {
            this.yum = yum;
            return this;
        }

        public Builder setYum(@Nullable OsPolicyAssignmentOsPolicyResourceGroupResourceRepositoryYumGetArgs yum) {
            this.yum = Input.ofNullable(yum);
            return this;
        }

        public Builder setZypper(@Nullable Input<OsPolicyAssignmentOsPolicyResourceGroupResourceRepositoryZypperGetArgs> zypper) {
            this.zypper = zypper;
            return this;
        }

        public Builder setZypper(@Nullable OsPolicyAssignmentOsPolicyResourceGroupResourceRepositoryZypperGetArgs zypper) {
            this.zypper = Input.ofNullable(zypper);
            return this;
        }

        public OsPolicyAssignmentOsPolicyResourceGroupResourceRepositoryGetArgs build() {
            return new OsPolicyAssignmentOsPolicyResourceGroupResourceRepositoryGetArgs(apt, goo, yum, zypper);
        }
    }
}