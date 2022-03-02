// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.lightsail.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.Boolean;
import java.lang.Double;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import javax.annotation.Nullable;


public final class InstanceState extends io.pulumi.resources.ResourceArgs {

    public static final InstanceState Empty = new InstanceState();

    /**
     * The ARN of the Lightsail instance (matches `id`).
     * 
     */
    @InputImport(name="arn")
      private final @Nullable Input<String> arn;

    public Input<String> getArn() {
        return this.arn == null ? Input.empty() : this.arn;
    }

    /**
     * The Availability Zone in which to create your
     * instance (see list below)
     * 
     */
    @InputImport(name="availabilityZone")
      private final @Nullable Input<String> availabilityZone;

    public Input<String> getAvailabilityZone() {
        return this.availabilityZone == null ? Input.empty() : this.availabilityZone;
    }

    /**
     * The ID for a virtual private server image. A list of available blueprint IDs can be obtained using the AWS CLI command: `aws lightsail get-blueprints`
     * 
     */
    @InputImport(name="blueprintId")
      private final @Nullable Input<String> blueprintId;

    public Input<String> getBlueprintId() {
        return this.blueprintId == null ? Input.empty() : this.blueprintId;
    }

    /**
     * The bundle of specification information (see list below)
     * 
     */
    @InputImport(name="bundleId")
      private final @Nullable Input<String> bundleId;

    public Input<String> getBundleId() {
        return this.bundleId == null ? Input.empty() : this.bundleId;
    }

    /**
     * The number of vCPUs the instance has.
     * 
     */
    @InputImport(name="cpuCount")
      private final @Nullable Input<Integer> cpuCount;

    public Input<Integer> getCpuCount() {
        return this.cpuCount == null ? Input.empty() : this.cpuCount;
    }

    /**
     * The timestamp when the instance was created.
     * 
     */
    @InputImport(name="createdAt")
      private final @Nullable Input<String> createdAt;

    public Input<String> getCreatedAt() {
        return this.createdAt == null ? Input.empty() : this.createdAt;
    }

    /**
     * (**Deprecated**) The first IPv6 address of the Lightsail instance. Use `ipv6_addresses` attribute instead.
     * 
     * @Deprecated
     * use `ipv6_addresses` attribute instead
     * 
     */
    @Deprecated /* use `ipv6_addresses` attribute instead */
    @InputImport(name="ipv6Address")
      private final @Nullable Input<String> ipv6Address;

    @Deprecated /* use `ipv6_addresses` attribute instead */
    public Input<String> getIpv6Address() {
        return this.ipv6Address == null ? Input.empty() : this.ipv6Address;
    }

    /**
     * List of IPv6 addresses for the Lightsail instance.
     * 
     */
    @InputImport(name="ipv6Addresses")
      private final @Nullable Input<List<String>> ipv6Addresses;

    public Input<List<String>> getIpv6Addresses() {
        return this.ipv6Addresses == null ? Input.empty() : this.ipv6Addresses;
    }

    /**
     * A Boolean value indicating whether this instance has a static IP assigned to it.
     * 
     */
    @InputImport(name="isStaticIp")
      private final @Nullable Input<Boolean> isStaticIp;

    public Input<Boolean> getIsStaticIp() {
        return this.isStaticIp == null ? Input.empty() : this.isStaticIp;
    }

    /**
     * The name of your key pair. Created in the
     * Lightsail console (cannot use `aws.ec2.KeyPair` at this time)
     * 
     */
    @InputImport(name="keyPairName")
      private final @Nullable Input<String> keyPairName;

    public Input<String> getKeyPairName() {
        return this.keyPairName == null ? Input.empty() : this.keyPairName;
    }

    /**
     * The name of the Lightsail Instance. Names be unique within each AWS Region in your Lightsail account.
     * 
     */
    @InputImport(name="name")
      private final @Nullable Input<String> name;

    public Input<String> getName() {
        return this.name == null ? Input.empty() : this.name;
    }

    /**
     * The private IP address of the instance.
     * 
     */
    @InputImport(name="privateIpAddress")
      private final @Nullable Input<String> privateIpAddress;

    public Input<String> getPrivateIpAddress() {
        return this.privateIpAddress == null ? Input.empty() : this.privateIpAddress;
    }

    /**
     * The public IP address of the instance.
     * 
     */
    @InputImport(name="publicIpAddress")
      private final @Nullable Input<String> publicIpAddress;

    public Input<String> getPublicIpAddress() {
        return this.publicIpAddress == null ? Input.empty() : this.publicIpAddress;
    }

    /**
     * The amount of RAM in GB on the instance (e.g., 1.0).
     * 
     */
    @InputImport(name="ramSize")
      private final @Nullable Input<Double> ramSize;

    public Input<Double> getRamSize() {
        return this.ramSize == null ? Input.empty() : this.ramSize;
    }

    /**
     * A map of tags to assign to the resource. To create a key-only tag, use an empty string as the value. .If configured with a provider `default_tags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
     * 
     */
    @InputImport(name="tags")
      private final @Nullable Input<Map<String,String>> tags;

    public Input<Map<String,String>> getTags() {
        return this.tags == null ? Input.empty() : this.tags;
    }

    /**
     * A map of tags assigned to the resource, including those inherited from the provider `default_tags` configuration block.
     * 
     */
    @InputImport(name="tagsAll")
      private final @Nullable Input<Map<String,String>> tagsAll;

    public Input<Map<String,String>> getTagsAll() {
        return this.tagsAll == null ? Input.empty() : this.tagsAll;
    }

    /**
     * launch script to configure server with additional user data
     * 
     */
    @InputImport(name="userData")
      private final @Nullable Input<String> userData;

    public Input<String> getUserData() {
        return this.userData == null ? Input.empty() : this.userData;
    }

    /**
     * The user name for connecting to the instance (e.g., ec2-user).
     * 
     */
    @InputImport(name="username")
      private final @Nullable Input<String> username;

    public Input<String> getUsername() {
        return this.username == null ? Input.empty() : this.username;
    }

    public InstanceState(
        @Nullable Input<String> arn,
        @Nullable Input<String> availabilityZone,
        @Nullable Input<String> blueprintId,
        @Nullable Input<String> bundleId,
        @Nullable Input<Integer> cpuCount,
        @Nullable Input<String> createdAt,
        @Nullable Input<String> ipv6Address,
        @Nullable Input<List<String>> ipv6Addresses,
        @Nullable Input<Boolean> isStaticIp,
        @Nullable Input<String> keyPairName,
        @Nullable Input<String> name,
        @Nullable Input<String> privateIpAddress,
        @Nullable Input<String> publicIpAddress,
        @Nullable Input<Double> ramSize,
        @Nullable Input<Map<String,String>> tags,
        @Nullable Input<Map<String,String>> tagsAll,
        @Nullable Input<String> userData,
        @Nullable Input<String> username) {
        this.arn = arn;
        this.availabilityZone = availabilityZone;
        this.blueprintId = blueprintId;
        this.bundleId = bundleId;
        this.cpuCount = cpuCount;
        this.createdAt = createdAt;
        this.ipv6Address = ipv6Address;
        this.ipv6Addresses = ipv6Addresses;
        this.isStaticIp = isStaticIp;
        this.keyPairName = keyPairName;
        this.name = name;
        this.privateIpAddress = privateIpAddress;
        this.publicIpAddress = publicIpAddress;
        this.ramSize = ramSize;
        this.tags = tags;
        this.tagsAll = tagsAll;
        this.userData = userData;
        this.username = username;
    }

    private InstanceState() {
        this.arn = Input.empty();
        this.availabilityZone = Input.empty();
        this.blueprintId = Input.empty();
        this.bundleId = Input.empty();
        this.cpuCount = Input.empty();
        this.createdAt = Input.empty();
        this.ipv6Address = Input.empty();
        this.ipv6Addresses = Input.empty();
        this.isStaticIp = Input.empty();
        this.keyPairName = Input.empty();
        this.name = Input.empty();
        this.privateIpAddress = Input.empty();
        this.publicIpAddress = Input.empty();
        this.ramSize = Input.empty();
        this.tags = Input.empty();
        this.tagsAll = Input.empty();
        this.userData = Input.empty();
        this.username = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(InstanceState defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<String> arn;
        private @Nullable Input<String> availabilityZone;
        private @Nullable Input<String> blueprintId;
        private @Nullable Input<String> bundleId;
        private @Nullable Input<Integer> cpuCount;
        private @Nullable Input<String> createdAt;
        private @Nullable Input<String> ipv6Address;
        private @Nullable Input<List<String>> ipv6Addresses;
        private @Nullable Input<Boolean> isStaticIp;
        private @Nullable Input<String> keyPairName;
        private @Nullable Input<String> name;
        private @Nullable Input<String> privateIpAddress;
        private @Nullable Input<String> publicIpAddress;
        private @Nullable Input<Double> ramSize;
        private @Nullable Input<Map<String,String>> tags;
        private @Nullable Input<Map<String,String>> tagsAll;
        private @Nullable Input<String> userData;
        private @Nullable Input<String> username;

        public Builder() {
    	      // Empty
        }

        public Builder(InstanceState defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.arn = defaults.arn;
    	      this.availabilityZone = defaults.availabilityZone;
    	      this.blueprintId = defaults.blueprintId;
    	      this.bundleId = defaults.bundleId;
    	      this.cpuCount = defaults.cpuCount;
    	      this.createdAt = defaults.createdAt;
    	      this.ipv6Address = defaults.ipv6Address;
    	      this.ipv6Addresses = defaults.ipv6Addresses;
    	      this.isStaticIp = defaults.isStaticIp;
    	      this.keyPairName = defaults.keyPairName;
    	      this.name = defaults.name;
    	      this.privateIpAddress = defaults.privateIpAddress;
    	      this.publicIpAddress = defaults.publicIpAddress;
    	      this.ramSize = defaults.ramSize;
    	      this.tags = defaults.tags;
    	      this.tagsAll = defaults.tagsAll;
    	      this.userData = defaults.userData;
    	      this.username = defaults.username;
        }

        public Builder setArn(@Nullable Input<String> arn) {
            this.arn = arn;
            return this;
        }

        public Builder setArn(@Nullable String arn) {
            this.arn = Input.ofNullable(arn);
            return this;
        }

        public Builder setAvailabilityZone(@Nullable Input<String> availabilityZone) {
            this.availabilityZone = availabilityZone;
            return this;
        }

        public Builder setAvailabilityZone(@Nullable String availabilityZone) {
            this.availabilityZone = Input.ofNullable(availabilityZone);
            return this;
        }

        public Builder setBlueprintId(@Nullable Input<String> blueprintId) {
            this.blueprintId = blueprintId;
            return this;
        }

        public Builder setBlueprintId(@Nullable String blueprintId) {
            this.blueprintId = Input.ofNullable(blueprintId);
            return this;
        }

        public Builder setBundleId(@Nullable Input<String> bundleId) {
            this.bundleId = bundleId;
            return this;
        }

        public Builder setBundleId(@Nullable String bundleId) {
            this.bundleId = Input.ofNullable(bundleId);
            return this;
        }

        public Builder setCpuCount(@Nullable Input<Integer> cpuCount) {
            this.cpuCount = cpuCount;
            return this;
        }

        public Builder setCpuCount(@Nullable Integer cpuCount) {
            this.cpuCount = Input.ofNullable(cpuCount);
            return this;
        }

        public Builder setCreatedAt(@Nullable Input<String> createdAt) {
            this.createdAt = createdAt;
            return this;
        }

        public Builder setCreatedAt(@Nullable String createdAt) {
            this.createdAt = Input.ofNullable(createdAt);
            return this;
        }

        public Builder setIpv6Address(@Nullable Input<String> ipv6Address) {
            this.ipv6Address = ipv6Address;
            return this;
        }

        public Builder setIpv6Address(@Nullable String ipv6Address) {
            this.ipv6Address = Input.ofNullable(ipv6Address);
            return this;
        }

        public Builder setIpv6Addresses(@Nullable Input<List<String>> ipv6Addresses) {
            this.ipv6Addresses = ipv6Addresses;
            return this;
        }

        public Builder setIpv6Addresses(@Nullable List<String> ipv6Addresses) {
            this.ipv6Addresses = Input.ofNullable(ipv6Addresses);
            return this;
        }

        public Builder setIsStaticIp(@Nullable Input<Boolean> isStaticIp) {
            this.isStaticIp = isStaticIp;
            return this;
        }

        public Builder setIsStaticIp(@Nullable Boolean isStaticIp) {
            this.isStaticIp = Input.ofNullable(isStaticIp);
            return this;
        }

        public Builder setKeyPairName(@Nullable Input<String> keyPairName) {
            this.keyPairName = keyPairName;
            return this;
        }

        public Builder setKeyPairName(@Nullable String keyPairName) {
            this.keyPairName = Input.ofNullable(keyPairName);
            return this;
        }

        public Builder setName(@Nullable Input<String> name) {
            this.name = name;
            return this;
        }

        public Builder setName(@Nullable String name) {
            this.name = Input.ofNullable(name);
            return this;
        }

        public Builder setPrivateIpAddress(@Nullable Input<String> privateIpAddress) {
            this.privateIpAddress = privateIpAddress;
            return this;
        }

        public Builder setPrivateIpAddress(@Nullable String privateIpAddress) {
            this.privateIpAddress = Input.ofNullable(privateIpAddress);
            return this;
        }

        public Builder setPublicIpAddress(@Nullable Input<String> publicIpAddress) {
            this.publicIpAddress = publicIpAddress;
            return this;
        }

        public Builder setPublicIpAddress(@Nullable String publicIpAddress) {
            this.publicIpAddress = Input.ofNullable(publicIpAddress);
            return this;
        }

        public Builder setRamSize(@Nullable Input<Double> ramSize) {
            this.ramSize = ramSize;
            return this;
        }

        public Builder setRamSize(@Nullable Double ramSize) {
            this.ramSize = Input.ofNullable(ramSize);
            return this;
        }

        public Builder setTags(@Nullable Input<Map<String,String>> tags) {
            this.tags = tags;
            return this;
        }

        public Builder setTags(@Nullable Map<String,String> tags) {
            this.tags = Input.ofNullable(tags);
            return this;
        }

        public Builder setTagsAll(@Nullable Input<Map<String,String>> tagsAll) {
            this.tagsAll = tagsAll;
            return this;
        }

        public Builder setTagsAll(@Nullable Map<String,String> tagsAll) {
            this.tagsAll = Input.ofNullable(tagsAll);
            return this;
        }

        public Builder setUserData(@Nullable Input<String> userData) {
            this.userData = userData;
            return this;
        }

        public Builder setUserData(@Nullable String userData) {
            this.userData = Input.ofNullable(userData);
            return this;
        }

        public Builder setUsername(@Nullable Input<String> username) {
            this.username = username;
            return this;
        }

        public Builder setUsername(@Nullable String username) {
            this.username = Input.ofNullable(username);
            return this;
        }
        public InstanceState build() {
            return new InstanceState(arn, availabilityZone, blueprintId, bundleId, cpuCount, createdAt, ipv6Address, ipv6Addresses, isStaticIp, keyPairName, name, privateIpAddress, publicIpAddress, ramSize, tags, tagsAll, userData, username);
        }
    }
}
