// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.ec2;

import io.pulumi.awsnative.Utilities;
import io.pulumi.awsnative.ec2.DHCPOptionsArgs;
import io.pulumi.awsnative.ec2.outputs.DHCPOptionsTag;
import io.pulumi.core.Input;
import io.pulumi.core.Output;
import io.pulumi.core.internal.annotations.OutputExport;
import io.pulumi.core.internal.annotations.ResourceType;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import javax.annotation.Nullable;

/**
 * Resource Type definition for AWS::EC2::DHCPOptions
 * 
 */
@ResourceType(type="aws-native:ec2:DHCPOptions")
public class DHCPOptions extends io.pulumi.resources.CustomResource {
    @OutputExport(name="dhcpOptionsId", type=String.class, parameters={})
    private Output<String> dhcpOptionsId;

    public Output<String> getDhcpOptionsId() {
        return this.dhcpOptionsId;
    }
    /**
     * This value is used to complete unqualified DNS hostnames.
     * 
     */
    @OutputExport(name="domainName", type=String.class, parameters={})
    private Output</* @Nullable */ String> domainName;

    /**
     * @return This value is used to complete unqualified DNS hostnames.
     * 
     */
    public Output</* @Nullable */ String> getDomainName() {
        return this.domainName;
    }
    /**
     * The IPv4 addresses of up to four domain name servers, or AmazonProvidedDNS.
     * 
     */
    @OutputExport(name="domainNameServers", type=List.class, parameters={String.class})
    private Output</* @Nullable */ List<String>> domainNameServers;

    /**
     * @return The IPv4 addresses of up to four domain name servers, or AmazonProvidedDNS.
     * 
     */
    public Output</* @Nullable */ List<String>> getDomainNameServers() {
        return this.domainNameServers;
    }
    /**
     * The IPv4 addresses of up to four NetBIOS name servers.
     * 
     */
    @OutputExport(name="netbiosNameServers", type=List.class, parameters={String.class})
    private Output</* @Nullable */ List<String>> netbiosNameServers;

    /**
     * @return The IPv4 addresses of up to four NetBIOS name servers.
     * 
     */
    public Output</* @Nullable */ List<String>> getNetbiosNameServers() {
        return this.netbiosNameServers;
    }
    /**
     * The NetBIOS node type (1, 2, 4, or 8).
     * 
     */
    @OutputExport(name="netbiosNodeType", type=Integer.class, parameters={})
    private Output</* @Nullable */ Integer> netbiosNodeType;

    /**
     * @return The NetBIOS node type (1, 2, 4, or 8).
     * 
     */
    public Output</* @Nullable */ Integer> getNetbiosNodeType() {
        return this.netbiosNodeType;
    }
    /**
     * The IPv4 addresses of up to four Network Time Protocol (NTP) servers.
     * 
     */
    @OutputExport(name="ntpServers", type=List.class, parameters={String.class})
    private Output</* @Nullable */ List<String>> ntpServers;

    /**
     * @return The IPv4 addresses of up to four Network Time Protocol (NTP) servers.
     * 
     */
    public Output</* @Nullable */ List<String>> getNtpServers() {
        return this.ntpServers;
    }
    /**
     * Any tags assigned to the DHCP options set.
     * 
     */
    @OutputExport(name="tags", type=List.class, parameters={DHCPOptionsTag.class})
    private Output</* @Nullable */ List<DHCPOptionsTag>> tags;

    /**
     * @return Any tags assigned to the DHCP options set.
     * 
     */
    public Output</* @Nullable */ List<DHCPOptionsTag>> getTags() {
        return this.tags;
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public DHCPOptions(String name, @Nullable DHCPOptionsArgs args, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("aws-native:ec2:DHCPOptions", name, args == null ? DHCPOptionsArgs.Empty : args, makeResourceOptions(options, Input.empty()));
    }

    private DHCPOptions(String name, Input<String> id, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("aws-native:ec2:DHCPOptions", name, null, makeResourceOptions(options, id));
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
    public static DHCPOptions get(String name, Input<String> id, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        return new DHCPOptions(name, id, options);
    }
}
