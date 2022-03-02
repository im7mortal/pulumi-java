// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.osconfig_v1alpha.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import io.pulumi.googlenative.osconfig_v1alpha.outputs.OSPolicyResourceExecResourceResponse;
import io.pulumi.googlenative.osconfig_v1alpha.outputs.OSPolicyResourceFileResourceResponse;
import io.pulumi.googlenative.osconfig_v1alpha.outputs.OSPolicyResourcePackageResourceResponse;
import io.pulumi.googlenative.osconfig_v1alpha.outputs.OSPolicyResourceRepositoryResourceResponse;
import java.util.Objects;

@OutputCustomType
public final class OSPolicyResourceResponse {
    /**
     * Exec resource
     * 
     */
    private final OSPolicyResourceExecResourceResponse exec;
    /**
     * File resource
     * 
     */
    private final OSPolicyResourceFileResourceResponse file;
    /**
     * Package resource
     * 
     */
    private final OSPolicyResourcePackageResourceResponse pkg;
    /**
     * Package repository resource
     * 
     */
    private final OSPolicyResourceRepositoryResourceResponse repository;

    @OutputCustomType.Constructor({"exec","file","pkg","repository"})
    private OSPolicyResourceResponse(
        OSPolicyResourceExecResourceResponse exec,
        OSPolicyResourceFileResourceResponse file,
        OSPolicyResourcePackageResourceResponse pkg,
        OSPolicyResourceRepositoryResourceResponse repository) {
        this.exec = Objects.requireNonNull(exec);
        this.file = Objects.requireNonNull(file);
        this.pkg = Objects.requireNonNull(pkg);
        this.repository = Objects.requireNonNull(repository);
    }

    /**
     * Exec resource
     * 
    */
    public OSPolicyResourceExecResourceResponse getExec() {
        return this.exec;
    }
    /**
     * File resource
     * 
    */
    public OSPolicyResourceFileResourceResponse getFile() {
        return this.file;
    }
    /**
     * Package resource
     * 
    */
    public OSPolicyResourcePackageResourceResponse getPkg() {
        return this.pkg;
    }
    /**
     * Package repository resource
     * 
    */
    public OSPolicyResourceRepositoryResourceResponse getRepository() {
        return this.repository;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(OSPolicyResourceResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private OSPolicyResourceExecResourceResponse exec;
        private OSPolicyResourceFileResourceResponse file;
        private OSPolicyResourcePackageResourceResponse pkg;
        private OSPolicyResourceRepositoryResourceResponse repository;

        public Builder() {
    	      // Empty
        }

        public Builder(OSPolicyResourceResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.exec = defaults.exec;
    	      this.file = defaults.file;
    	      this.pkg = defaults.pkg;
    	      this.repository = defaults.repository;
        }

        public Builder setExec(OSPolicyResourceExecResourceResponse exec) {
            this.exec = Objects.requireNonNull(exec);
            return this;
        }

        public Builder setFile(OSPolicyResourceFileResourceResponse file) {
            this.file = Objects.requireNonNull(file);
            return this;
        }

        public Builder setPkg(OSPolicyResourcePackageResourceResponse pkg) {
            this.pkg = Objects.requireNonNull(pkg);
            return this;
        }

        public Builder setRepository(OSPolicyResourceRepositoryResourceResponse repository) {
            this.repository = Objects.requireNonNull(repository);
            return this;
        }
        public OSPolicyResourceResponse build() {
            return new OSPolicyResourceResponse(exec, file, pkg, repository);
        }
    }
}
