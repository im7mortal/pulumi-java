// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.osconfig_v1alpha.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import io.pulumi.googlenative.osconfig_v1alpha.outputs.OSPolicyResourceRepositoryResourceAptRepositoryResponse;
import io.pulumi.googlenative.osconfig_v1alpha.outputs.OSPolicyResourceRepositoryResourceGooRepositoryResponse;
import io.pulumi.googlenative.osconfig_v1alpha.outputs.OSPolicyResourceRepositoryResourceYumRepositoryResponse;
import io.pulumi.googlenative.osconfig_v1alpha.outputs.OSPolicyResourceRepositoryResourceZypperRepositoryResponse;
import java.util.Objects;

@OutputCustomType
public final class OSPolicyResourceRepositoryResourceResponse {
    /**
     * An Apt Repository.
     * 
     */
    private final OSPolicyResourceRepositoryResourceAptRepositoryResponse apt;
    /**
     * A Goo Repository.
     * 
     */
    private final OSPolicyResourceRepositoryResourceGooRepositoryResponse goo;
    /**
     * A Yum Repository.
     * 
     */
    private final OSPolicyResourceRepositoryResourceYumRepositoryResponse yum;
    /**
     * A Zypper Repository.
     * 
     */
    private final OSPolicyResourceRepositoryResourceZypperRepositoryResponse zypper;

    @OutputCustomType.Constructor({"apt","goo","yum","zypper"})
    private OSPolicyResourceRepositoryResourceResponse(
        OSPolicyResourceRepositoryResourceAptRepositoryResponse apt,
        OSPolicyResourceRepositoryResourceGooRepositoryResponse goo,
        OSPolicyResourceRepositoryResourceYumRepositoryResponse yum,
        OSPolicyResourceRepositoryResourceZypperRepositoryResponse zypper) {
        this.apt = Objects.requireNonNull(apt);
        this.goo = Objects.requireNonNull(goo);
        this.yum = Objects.requireNonNull(yum);
        this.zypper = Objects.requireNonNull(zypper);
    }

    /**
     * An Apt Repository.
     * 
    */
    public OSPolicyResourceRepositoryResourceAptRepositoryResponse getApt() {
        return this.apt;
    }
    /**
     * A Goo Repository.
     * 
    */
    public OSPolicyResourceRepositoryResourceGooRepositoryResponse getGoo() {
        return this.goo;
    }
    /**
     * A Yum Repository.
     * 
    */
    public OSPolicyResourceRepositoryResourceYumRepositoryResponse getYum() {
        return this.yum;
    }
    /**
     * A Zypper Repository.
     * 
    */
    public OSPolicyResourceRepositoryResourceZypperRepositoryResponse getZypper() {
        return this.zypper;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(OSPolicyResourceRepositoryResourceResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private OSPolicyResourceRepositoryResourceAptRepositoryResponse apt;
        private OSPolicyResourceRepositoryResourceGooRepositoryResponse goo;
        private OSPolicyResourceRepositoryResourceYumRepositoryResponse yum;
        private OSPolicyResourceRepositoryResourceZypperRepositoryResponse zypper;

        public Builder() {
    	      // Empty
        }

        public Builder(OSPolicyResourceRepositoryResourceResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.apt = defaults.apt;
    	      this.goo = defaults.goo;
    	      this.yum = defaults.yum;
    	      this.zypper = defaults.zypper;
        }

        public Builder setApt(OSPolicyResourceRepositoryResourceAptRepositoryResponse apt) {
            this.apt = Objects.requireNonNull(apt);
            return this;
        }

        public Builder setGoo(OSPolicyResourceRepositoryResourceGooRepositoryResponse goo) {
            this.goo = Objects.requireNonNull(goo);
            return this;
        }

        public Builder setYum(OSPolicyResourceRepositoryResourceYumRepositoryResponse yum) {
            this.yum = Objects.requireNonNull(yum);
            return this;
        }

        public Builder setZypper(OSPolicyResourceRepositoryResourceZypperRepositoryResponse zypper) {
            this.zypper = Objects.requireNonNull(zypper);
            return this;
        }
        public OSPolicyResourceRepositoryResourceResponse build() {
            return new OSPolicyResourceRepositoryResourceResponse(apt, goo, yum, zypper);
        }
    }
}
