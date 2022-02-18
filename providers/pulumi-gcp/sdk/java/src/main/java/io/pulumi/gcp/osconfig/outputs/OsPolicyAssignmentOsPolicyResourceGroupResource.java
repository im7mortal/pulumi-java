// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.osconfig.outputs;

import io.pulumi.core.internal.annotations.OutputCustomType;
import io.pulumi.gcp.osconfig.outputs.OsPolicyAssignmentOsPolicyResourceGroupResourceExec;
import io.pulumi.gcp.osconfig.outputs.OsPolicyAssignmentOsPolicyResourceGroupResourceFile;
import io.pulumi.gcp.osconfig.outputs.OsPolicyAssignmentOsPolicyResourceGroupResourcePkg;
import io.pulumi.gcp.osconfig.outputs.OsPolicyAssignmentOsPolicyResourceGroupResourceRepository;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class OsPolicyAssignmentOsPolicyResourceGroupResource {
    /**
     * Exec resource
     * 
     */
    private final @Nullable OsPolicyAssignmentOsPolicyResourceGroupResourceExec exec;
    /**
     * A remote or local source.
     * 
     */
    private final @Nullable OsPolicyAssignmentOsPolicyResourceGroupResourceFile file;
    /**
     * Required. A one word, unique name for this repository. This is the `repo id` in the zypper config file and also the `display_name` if `display_name` is omitted. This id is also used as the unique identifier when checking for GuestPolicy conflicts.
     * 
     */
    private final String id;
    /**
     * Package resource
     * 
     */
    private final @Nullable OsPolicyAssignmentOsPolicyResourceGroupResourcePkg pkg;
    /**
     * Package repository resource
     * 
     */
    private final @Nullable OsPolicyAssignmentOsPolicyResourceGroupResourceRepository repository;

    @OutputCustomType.Constructor({"exec","file","id","pkg","repository"})
    private OsPolicyAssignmentOsPolicyResourceGroupResource(
        @Nullable OsPolicyAssignmentOsPolicyResourceGroupResourceExec exec,
        @Nullable OsPolicyAssignmentOsPolicyResourceGroupResourceFile file,
        String id,
        @Nullable OsPolicyAssignmentOsPolicyResourceGroupResourcePkg pkg,
        @Nullable OsPolicyAssignmentOsPolicyResourceGroupResourceRepository repository) {
        this.exec = exec;
        this.file = file;
        this.id = Objects.requireNonNull(id);
        this.pkg = pkg;
        this.repository = repository;
    }

    /**
     * Exec resource
     * 
     */
    public Optional<OsPolicyAssignmentOsPolicyResourceGroupResourceExec> getExec() {
        return Optional.ofNullable(this.exec);
    }
    /**
     * A remote or local source.
     * 
     */
    public Optional<OsPolicyAssignmentOsPolicyResourceGroupResourceFile> getFile() {
        return Optional.ofNullable(this.file);
    }
    /**
     * Required. A one word, unique name for this repository. This is the `repo id` in the zypper config file and also the `display_name` if `display_name` is omitted. This id is also used as the unique identifier when checking for GuestPolicy conflicts.
     * 
     */
    public String getId() {
        return this.id;
    }
    /**
     * Package resource
     * 
     */
    public Optional<OsPolicyAssignmentOsPolicyResourceGroupResourcePkg> getPkg() {
        return Optional.ofNullable(this.pkg);
    }
    /**
     * Package repository resource
     * 
     */
    public Optional<OsPolicyAssignmentOsPolicyResourceGroupResourceRepository> getRepository() {
        return Optional.ofNullable(this.repository);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(OsPolicyAssignmentOsPolicyResourceGroupResource defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable OsPolicyAssignmentOsPolicyResourceGroupResourceExec exec;
        private @Nullable OsPolicyAssignmentOsPolicyResourceGroupResourceFile file;
        private String id;
        private @Nullable OsPolicyAssignmentOsPolicyResourceGroupResourcePkg pkg;
        private @Nullable OsPolicyAssignmentOsPolicyResourceGroupResourceRepository repository;

        public Builder() {
    	      // Empty
        }

        public Builder(OsPolicyAssignmentOsPolicyResourceGroupResource defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.exec = defaults.exec;
    	      this.file = defaults.file;
    	      this.id = defaults.id;
    	      this.pkg = defaults.pkg;
    	      this.repository = defaults.repository;
        }

        public Builder setExec(@Nullable OsPolicyAssignmentOsPolicyResourceGroupResourceExec exec) {
            this.exec = exec;
            return this;
        }

        public Builder setFile(@Nullable OsPolicyAssignmentOsPolicyResourceGroupResourceFile file) {
            this.file = file;
            return this;
        }

        public Builder setId(String id) {
            this.id = Objects.requireNonNull(id);
            return this;
        }

        public Builder setPkg(@Nullable OsPolicyAssignmentOsPolicyResourceGroupResourcePkg pkg) {
            this.pkg = pkg;
            return this;
        }

        public Builder setRepository(@Nullable OsPolicyAssignmentOsPolicyResourceGroupResourceRepository repository) {
            this.repository = repository;
            return this;
        }

        public OsPolicyAssignmentOsPolicyResourceGroupResource build() {
            return new OsPolicyAssignmentOsPolicyResourceGroupResource(exec, file, id, pkg, repository);
        }
    }
}