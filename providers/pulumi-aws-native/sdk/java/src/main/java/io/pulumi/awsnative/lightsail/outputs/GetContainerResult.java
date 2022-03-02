// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.lightsail.outputs;

import io.pulumi.awsnative.lightsail.outputs.ContainerPublicDomainName;
import io.pulumi.awsnative.lightsail.outputs.ContainerServiceDeployment;
import io.pulumi.awsnative.lightsail.outputs.ContainerTag;
import io.pulumi.core.annotations.OutputCustomType;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class GetContainerResult {
    private final @Nullable String containerArn;
    /**
     * Describes a container deployment configuration of an Amazon Lightsail container service.
     * 
     */
    private final @Nullable ContainerServiceDeployment containerServiceDeployment;
    /**
     * A Boolean value to indicate whether the container service is disabled.
     * 
     */
    private final @Nullable Boolean isDisabled;
    /**
     * The power specification for the container service.
     * 
     */
    private final @Nullable String power;
    /**
     * The public domain names to use with the container service, such as example.com and www.example.com.
     * 
     */
    private final @Nullable List<ContainerPublicDomainName> publicDomainNames;
    /**
     * The scale specification for the container service.
     * 
     */
    private final @Nullable Integer scale;
    /**
     * An array of key-value pairs to apply to this resource.
     * 
     */
    private final @Nullable List<ContainerTag> tags;
    /**
     * The publicly accessible URL of the container service.
     * 
     */
    private final @Nullable String url;

    @OutputCustomType.Constructor({"containerArn","containerServiceDeployment","isDisabled","power","publicDomainNames","scale","tags","url"})
    private GetContainerResult(
        @Nullable String containerArn,
        @Nullable ContainerServiceDeployment containerServiceDeployment,
        @Nullable Boolean isDisabled,
        @Nullable String power,
        @Nullable List<ContainerPublicDomainName> publicDomainNames,
        @Nullable Integer scale,
        @Nullable List<ContainerTag> tags,
        @Nullable String url) {
        this.containerArn = containerArn;
        this.containerServiceDeployment = containerServiceDeployment;
        this.isDisabled = isDisabled;
        this.power = power;
        this.publicDomainNames = publicDomainNames;
        this.scale = scale;
        this.tags = tags;
        this.url = url;
    }

    public Optional<String> getContainerArn() {
        return Optional.ofNullable(this.containerArn);
    }
    /**
     * Describes a container deployment configuration of an Amazon Lightsail container service.
     * 
    */
    public Optional<ContainerServiceDeployment> getContainerServiceDeployment() {
        return Optional.ofNullable(this.containerServiceDeployment);
    }
    /**
     * A Boolean value to indicate whether the container service is disabled.
     * 
    */
    public Optional<Boolean> getIsDisabled() {
        return Optional.ofNullable(this.isDisabled);
    }
    /**
     * The power specification for the container service.
     * 
    */
    public Optional<String> getPower() {
        return Optional.ofNullable(this.power);
    }
    /**
     * The public domain names to use with the container service, such as example.com and www.example.com.
     * 
    */
    public List<ContainerPublicDomainName> getPublicDomainNames() {
        return this.publicDomainNames == null ? List.of() : this.publicDomainNames;
    }
    /**
     * The scale specification for the container service.
     * 
    */
    public Optional<Integer> getScale() {
        return Optional.ofNullable(this.scale);
    }
    /**
     * An array of key-value pairs to apply to this resource.
     * 
    */
    public List<ContainerTag> getTags() {
        return this.tags == null ? List.of() : this.tags;
    }
    /**
     * The publicly accessible URL of the container service.
     * 
    */
    public Optional<String> getUrl() {
        return Optional.ofNullable(this.url);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetContainerResult defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String containerArn;
        private @Nullable ContainerServiceDeployment containerServiceDeployment;
        private @Nullable Boolean isDisabled;
        private @Nullable String power;
        private @Nullable List<ContainerPublicDomainName> publicDomainNames;
        private @Nullable Integer scale;
        private @Nullable List<ContainerTag> tags;
        private @Nullable String url;

        public Builder() {
    	      // Empty
        }

        public Builder(GetContainerResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.containerArn = defaults.containerArn;
    	      this.containerServiceDeployment = defaults.containerServiceDeployment;
    	      this.isDisabled = defaults.isDisabled;
    	      this.power = defaults.power;
    	      this.publicDomainNames = defaults.publicDomainNames;
    	      this.scale = defaults.scale;
    	      this.tags = defaults.tags;
    	      this.url = defaults.url;
        }

        public Builder setContainerArn(@Nullable String containerArn) {
            this.containerArn = containerArn;
            return this;
        }

        public Builder setContainerServiceDeployment(@Nullable ContainerServiceDeployment containerServiceDeployment) {
            this.containerServiceDeployment = containerServiceDeployment;
            return this;
        }

        public Builder setIsDisabled(@Nullable Boolean isDisabled) {
            this.isDisabled = isDisabled;
            return this;
        }

        public Builder setPower(@Nullable String power) {
            this.power = power;
            return this;
        }

        public Builder setPublicDomainNames(@Nullable List<ContainerPublicDomainName> publicDomainNames) {
            this.publicDomainNames = publicDomainNames;
            return this;
        }

        public Builder setScale(@Nullable Integer scale) {
            this.scale = scale;
            return this;
        }

        public Builder setTags(@Nullable List<ContainerTag> tags) {
            this.tags = tags;
            return this;
        }

        public Builder setUrl(@Nullable String url) {
            this.url = url;
            return this;
        }
        public GetContainerResult build() {
            return new GetContainerResult(containerArn, containerServiceDeployment, isDisabled, power, publicDomainNames, scale, tags, url);
        }
    }
}
