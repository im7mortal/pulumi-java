// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.iotwireless;

import io.pulumi.awsnative.Utilities;
import io.pulumi.awsnative.iotwireless.DeviceProfileArgs;
import io.pulumi.awsnative.iotwireless.outputs.DeviceProfileLoRaWANDeviceProfile;
import io.pulumi.awsnative.iotwireless.outputs.DeviceProfileTag;
import io.pulumi.core.Input;
import io.pulumi.core.Output;
import io.pulumi.core.internal.annotations.OutputExport;
import io.pulumi.core.internal.annotations.ResourceType;
import java.lang.String;
import java.util.List;
import javax.annotation.Nullable;

/**
 * Device Profile's resource schema demonstrating some basic constructs and validation rules.
 * 
 */
@ResourceType(type="aws-native:iotwireless:DeviceProfile")
public class DeviceProfile extends io.pulumi.resources.CustomResource {
    /**
     * Service profile Arn. Returned after successful create.
     * 
     */
    @OutputExport(name="arn", type=String.class, parameters={})
    private Output<String> arn;

    /**
     * @return Service profile Arn. Returned after successful create.
     * 
     */
    public Output<String> getArn() {
        return this.arn;
    }
    /**
     * LoRaWANDeviceProfile supports all LoRa specific attributes for service profile for CreateDeviceProfile operation
     * 
     */
    @OutputExport(name="loRaWAN", type=DeviceProfileLoRaWANDeviceProfile.class, parameters={})
    private Output</* @Nullable */ DeviceProfileLoRaWANDeviceProfile> loRaWAN;

    /**
     * @return LoRaWANDeviceProfile supports all LoRa specific attributes for service profile for CreateDeviceProfile operation
     * 
     */
    public Output</* @Nullable */ DeviceProfileLoRaWANDeviceProfile> getLoRaWAN() {
        return this.loRaWAN;
    }
    /**
     * Name of service profile
     * 
     */
    @OutputExport(name="name", type=String.class, parameters={})
    private Output</* @Nullable */ String> name;

    /**
     * @return Name of service profile
     * 
     */
    public Output</* @Nullable */ String> getName() {
        return this.name;
    }
    /**
     * A list of key-value pairs that contain metadata for the device profile.
     * 
     */
    @OutputExport(name="tags", type=List.class, parameters={DeviceProfileTag.class})
    private Output</* @Nullable */ List<DeviceProfileTag>> tags;

    /**
     * @return A list of key-value pairs that contain metadata for the device profile.
     * 
     */
    public Output</* @Nullable */ List<DeviceProfileTag>> getTags() {
        return this.tags;
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public DeviceProfile(String name, @Nullable DeviceProfileArgs args, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("aws-native:iotwireless:DeviceProfile", name, args == null ? DeviceProfileArgs.Empty : args, makeResourceOptions(options, Input.empty()));
    }

    private DeviceProfile(String name, Input<String> id, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("aws-native:iotwireless:DeviceProfile", name, null, makeResourceOptions(options, id));
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
    public static DeviceProfile get(String name, Input<String> id, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        return new DeviceProfile(name, id, options);
    }
}
