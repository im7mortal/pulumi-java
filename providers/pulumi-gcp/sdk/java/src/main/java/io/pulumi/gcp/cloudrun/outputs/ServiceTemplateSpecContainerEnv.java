// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.cloudrun.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import io.pulumi.gcp.cloudrun.outputs.ServiceTemplateSpecContainerEnvValueFrom;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class ServiceTemplateSpecContainerEnv {
    /**
     * Volume's name.
     * 
     */
    private final @Nullable String name;
    /**
     * Variable references $(VAR_NAME) are expanded
     * using the previous defined environment variables in the container and
     * any route environment variables. If a variable cannot be resolved,
     * the reference in the input string will be unchanged. The $(VAR_NAME)
     * syntax can be escaped with a double $$, ie: $$(VAR_NAME). Escaped
     * references will never be expanded, regardless of whether the variable
     * exists or not.
     * Defaults to "".
     * 
     */
    private final @Nullable String value;
    /**
     * Source for the environment variable's value. Only supports secret_key_ref.
     * Structure is documented below.
     * 
     */
    private final @Nullable ServiceTemplateSpecContainerEnvValueFrom valueFrom;

    @OutputCustomType.Constructor({"name","value","valueFrom"})
    private ServiceTemplateSpecContainerEnv(
        @Nullable String name,
        @Nullable String value,
        @Nullable ServiceTemplateSpecContainerEnvValueFrom valueFrom) {
        this.name = name;
        this.value = value;
        this.valueFrom = valueFrom;
    }

    /**
     * Volume's name.
     * 
    */
    public Optional<String> getName() {
        return Optional.ofNullable(this.name);
    }
    /**
     * Variable references $(VAR_NAME) are expanded
     * using the previous defined environment variables in the container and
     * any route environment variables. If a variable cannot be resolved,
     * the reference in the input string will be unchanged. The $(VAR_NAME)
     * syntax can be escaped with a double $$, ie: $$(VAR_NAME). Escaped
     * references will never be expanded, regardless of whether the variable
     * exists or not.
     * Defaults to "".
     * 
    */
    public Optional<String> getValue() {
        return Optional.ofNullable(this.value);
    }
    /**
     * Source for the environment variable's value. Only supports secret_key_ref.
     * Structure is documented below.
     * 
    */
    public Optional<ServiceTemplateSpecContainerEnvValueFrom> getValueFrom() {
        return Optional.ofNullable(this.valueFrom);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ServiceTemplateSpecContainerEnv defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String name;
        private @Nullable String value;
        private @Nullable ServiceTemplateSpecContainerEnvValueFrom valueFrom;

        public Builder() {
    	      // Empty
        }

        public Builder(ServiceTemplateSpecContainerEnv defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.name = defaults.name;
    	      this.value = defaults.value;
    	      this.valueFrom = defaults.valueFrom;
        }

        public Builder setName(@Nullable String name) {
            this.name = name;
            return this;
        }

        public Builder setValue(@Nullable String value) {
            this.value = value;
            return this;
        }

        public Builder setValueFrom(@Nullable ServiceTemplateSpecContainerEnvValueFrom valueFrom) {
            this.valueFrom = valueFrom;
            return this;
        }
        public ServiceTemplateSpecContainerEnv build() {
            return new ServiceTemplateSpecContainerEnv(name, value, valueFrom);
        }
    }
}
