// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.datasync;

import io.pulumi.awsnative.datasync.inputs.LocationFSxWindowsTagArgs;
import io.pulumi.core.Input;
import io.pulumi.core.internal.annotations.InputImport;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;


public final class LocationFSxWindowsArgs extends io.pulumi.resources.ResourceArgs {

    public static final LocationFSxWindowsArgs Empty = new LocationFSxWindowsArgs();

    /**
     * The name of the Windows domain that the FSx for Windows server belongs to.
     * 
     */
    @InputImport(name="domain")
    private final @Nullable Input<String> domain;

    public Input<String> getDomain() {
        return this.domain == null ? Input.empty() : this.domain;
    }

    /**
     * The Amazon Resource Name (ARN) for the FSx for Windows file system.
     * 
     */
    @InputImport(name="fsxFilesystemArn", required=true)
    private final Input<String> fsxFilesystemArn;

    public Input<String> getFsxFilesystemArn() {
        return this.fsxFilesystemArn;
    }

    /**
     * The password of the user who has the permissions to access files and folders in the FSx for Windows file system.
     * 
     */
    @InputImport(name="password", required=true)
    private final Input<String> password;

    public Input<String> getPassword() {
        return this.password;
    }

    /**
     * The ARNs of the security groups that are to use to configure the FSx for Windows file system.
     * 
     */
    @InputImport(name="securityGroupArns", required=true)
    private final Input<List<String>> securityGroupArns;

    public Input<List<String>> getSecurityGroupArns() {
        return this.securityGroupArns;
    }

    /**
     * A subdirectory in the location's path.
     * 
     */
    @InputImport(name="subdirectory")
    private final @Nullable Input<String> subdirectory;

    public Input<String> getSubdirectory() {
        return this.subdirectory == null ? Input.empty() : this.subdirectory;
    }

    /**
     * An array of key-value pairs to apply to this resource.
     * 
     */
    @InputImport(name="tags")
    private final @Nullable Input<List<LocationFSxWindowsTagArgs>> tags;

    public Input<List<LocationFSxWindowsTagArgs>> getTags() {
        return this.tags == null ? Input.empty() : this.tags;
    }

    /**
     * The user who has the permissions to access files and folders in the FSx for Windows file system.
     * 
     */
    @InputImport(name="user", required=true)
    private final Input<String> user;

    public Input<String> getUser() {
        return this.user;
    }

    public LocationFSxWindowsArgs(
        @Nullable Input<String> domain,
        Input<String> fsxFilesystemArn,
        Input<String> password,
        Input<List<String>> securityGroupArns,
        @Nullable Input<String> subdirectory,
        @Nullable Input<List<LocationFSxWindowsTagArgs>> tags,
        Input<String> user) {
        this.domain = domain;
        this.fsxFilesystemArn = Objects.requireNonNull(fsxFilesystemArn, "expected parameter 'fsxFilesystemArn' to be non-null");
        this.password = Objects.requireNonNull(password, "expected parameter 'password' to be non-null");
        this.securityGroupArns = Objects.requireNonNull(securityGroupArns, "expected parameter 'securityGroupArns' to be non-null");
        this.subdirectory = subdirectory;
        this.tags = tags;
        this.user = Objects.requireNonNull(user, "expected parameter 'user' to be non-null");
    }

    private LocationFSxWindowsArgs() {
        this.domain = Input.empty();
        this.fsxFilesystemArn = Input.empty();
        this.password = Input.empty();
        this.securityGroupArns = Input.empty();
        this.subdirectory = Input.empty();
        this.tags = Input.empty();
        this.user = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(LocationFSxWindowsArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<String> domain;
        private Input<String> fsxFilesystemArn;
        private Input<String> password;
        private Input<List<String>> securityGroupArns;
        private @Nullable Input<String> subdirectory;
        private @Nullable Input<List<LocationFSxWindowsTagArgs>> tags;
        private Input<String> user;

        public Builder() {
    	      // Empty
        }

        public Builder(LocationFSxWindowsArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.domain = defaults.domain;
    	      this.fsxFilesystemArn = defaults.fsxFilesystemArn;
    	      this.password = defaults.password;
    	      this.securityGroupArns = defaults.securityGroupArns;
    	      this.subdirectory = defaults.subdirectory;
    	      this.tags = defaults.tags;
    	      this.user = defaults.user;
        }

        public Builder setDomain(@Nullable Input<String> domain) {
            this.domain = domain;
            return this;
        }

        public Builder setDomain(@Nullable String domain) {
            this.domain = Input.ofNullable(domain);
            return this;
        }

        public Builder setFsxFilesystemArn(Input<String> fsxFilesystemArn) {
            this.fsxFilesystemArn = Objects.requireNonNull(fsxFilesystemArn);
            return this;
        }

        public Builder setFsxFilesystemArn(String fsxFilesystemArn) {
            this.fsxFilesystemArn = Input.of(Objects.requireNonNull(fsxFilesystemArn));
            return this;
        }

        public Builder setPassword(Input<String> password) {
            this.password = Objects.requireNonNull(password);
            return this;
        }

        public Builder setPassword(String password) {
            this.password = Input.of(Objects.requireNonNull(password));
            return this;
        }

        public Builder setSecurityGroupArns(Input<List<String>> securityGroupArns) {
            this.securityGroupArns = Objects.requireNonNull(securityGroupArns);
            return this;
        }

        public Builder setSecurityGroupArns(List<String> securityGroupArns) {
            this.securityGroupArns = Input.of(Objects.requireNonNull(securityGroupArns));
            return this;
        }

        public Builder setSubdirectory(@Nullable Input<String> subdirectory) {
            this.subdirectory = subdirectory;
            return this;
        }

        public Builder setSubdirectory(@Nullable String subdirectory) {
            this.subdirectory = Input.ofNullable(subdirectory);
            return this;
        }

        public Builder setTags(@Nullable Input<List<LocationFSxWindowsTagArgs>> tags) {
            this.tags = tags;
            return this;
        }

        public Builder setTags(@Nullable List<LocationFSxWindowsTagArgs> tags) {
            this.tags = Input.ofNullable(tags);
            return this;
        }

        public Builder setUser(Input<String> user) {
            this.user = Objects.requireNonNull(user);
            return this;
        }

        public Builder setUser(String user) {
            this.user = Input.of(Objects.requireNonNull(user));
            return this;
        }

        public LocationFSxWindowsArgs build() {
            return new LocationFSxWindowsArgs(domain, fsxFilesystemArn, password, securityGroupArns, subdirectory, tags, user);
        }
    }
}
