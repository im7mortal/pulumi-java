// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.datasync;

import io.pulumi.awsnative.Utilities;
import io.pulumi.awsnative.datasync.LocationFSxWindowsArgs;
import io.pulumi.awsnative.datasync.outputs.LocationFSxWindowsTag;
import io.pulumi.core.Input;
import io.pulumi.core.Output;
import io.pulumi.core.internal.annotations.OutputExport;
import io.pulumi.core.internal.annotations.ResourceType;
import java.lang.String;
import java.util.List;
import javax.annotation.Nullable;

/**
 * Resource schema for AWS::DataSync::LocationFSxWindows.
 * 
 */
@ResourceType(type="aws-native:datasync:LocationFSxWindows")
public class LocationFSxWindows extends io.pulumi.resources.CustomResource {
    /**
     * The name of the Windows domain that the FSx for Windows server belongs to.
     * 
     */
    @OutputExport(name="domain", type=String.class, parameters={})
    private Output</* @Nullable */ String> domain;

    /**
     * @return The name of the Windows domain that the FSx for Windows server belongs to.
     * 
     */
    public Output</* @Nullable */ String> getDomain() {
        return this.domain;
    }
    /**
     * The Amazon Resource Name (ARN) for the FSx for Windows file system.
     * 
     */
    @OutputExport(name="fsxFilesystemArn", type=String.class, parameters={})
    private Output<String> fsxFilesystemArn;

    /**
     * @return The Amazon Resource Name (ARN) for the FSx for Windows file system.
     * 
     */
    public Output<String> getFsxFilesystemArn() {
        return this.fsxFilesystemArn;
    }
    /**
     * The Amazon Resource Name (ARN) of the Amazon FSx for Windows file system location that is created.
     * 
     */
    @OutputExport(name="locationArn", type=String.class, parameters={})
    private Output<String> locationArn;

    /**
     * @return The Amazon Resource Name (ARN) of the Amazon FSx for Windows file system location that is created.
     * 
     */
    public Output<String> getLocationArn() {
        return this.locationArn;
    }
    /**
     * The URL of the FSx for Windows location that was described.
     * 
     */
    @OutputExport(name="locationUri", type=String.class, parameters={})
    private Output<String> locationUri;

    /**
     * @return The URL of the FSx for Windows location that was described.
     * 
     */
    public Output<String> getLocationUri() {
        return this.locationUri;
    }
    /**
     * The password of the user who has the permissions to access files and folders in the FSx for Windows file system.
     * 
     */
    @OutputExport(name="password", type=String.class, parameters={})
    private Output<String> password;

    /**
     * @return The password of the user who has the permissions to access files and folders in the FSx for Windows file system.
     * 
     */
    public Output<String> getPassword() {
        return this.password;
    }
    /**
     * The ARNs of the security groups that are to use to configure the FSx for Windows file system.
     * 
     */
    @OutputExport(name="securityGroupArns", type=List.class, parameters={String.class})
    private Output<List<String>> securityGroupArns;

    /**
     * @return The ARNs of the security groups that are to use to configure the FSx for Windows file system.
     * 
     */
    public Output<List<String>> getSecurityGroupArns() {
        return this.securityGroupArns;
    }
    /**
     * A subdirectory in the location's path.
     * 
     */
    @OutputExport(name="subdirectory", type=String.class, parameters={})
    private Output</* @Nullable */ String> subdirectory;

    /**
     * @return A subdirectory in the location's path.
     * 
     */
    public Output</* @Nullable */ String> getSubdirectory() {
        return this.subdirectory;
    }
    /**
     * An array of key-value pairs to apply to this resource.
     * 
     */
    @OutputExport(name="tags", type=List.class, parameters={LocationFSxWindowsTag.class})
    private Output</* @Nullable */ List<LocationFSxWindowsTag>> tags;

    /**
     * @return An array of key-value pairs to apply to this resource.
     * 
     */
    public Output</* @Nullable */ List<LocationFSxWindowsTag>> getTags() {
        return this.tags;
    }
    /**
     * The user who has the permissions to access files and folders in the FSx for Windows file system.
     * 
     */
    @OutputExport(name="user", type=String.class, parameters={})
    private Output<String> user;

    /**
     * @return The user who has the permissions to access files and folders in the FSx for Windows file system.
     * 
     */
    public Output<String> getUser() {
        return this.user;
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public LocationFSxWindows(String name, LocationFSxWindowsArgs args, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("aws-native:datasync:LocationFSxWindows", name, args == null ? LocationFSxWindowsArgs.Empty : args, makeResourceOptions(options, Input.empty()));
    }

    private LocationFSxWindows(String name, Input<String> id, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("aws-native:datasync:LocationFSxWindows", name, null, makeResourceOptions(options, id));
    }

    private static io.pulumi.resources.CustomResourceOptions makeResourceOptions(@Nullable io.pulumi.resources.CustomResourceOptions options, @Nullable Input<String> id) {
        var defaultOptions = io.pulumi.resources.CustomResourceOptions.builder()
            .setVersion(Utilities.getVersion())
            .build();
        return io.pulumi.resources.CustomResourceOptions.merge(defaultOptions, options, id);
    }

    /**
     * Get an existing Host resource's state with the given name, ID, and optional extra
     * properties used to qualify the lookup.
     *
     * @param name The _unique_ name of the resulting resource.
     * @param id The _unique_ provider ID of the resource to lookup.
     * @param options Optional settings to control the behavior of the CustomResource.
     */
    public static LocationFSxWindows get(String name, Input<String> id, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        return new LocationFSxWindows(name, id, options);
    }
}
