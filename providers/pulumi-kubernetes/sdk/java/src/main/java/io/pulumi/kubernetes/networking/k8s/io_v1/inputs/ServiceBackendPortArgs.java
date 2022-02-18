// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.kubernetes.networking.k8s.io_v1.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * ServiceBackendPort is the service port being referenced.
 * 
 */
public final class ServiceBackendPortArgs extends io.pulumi.resources.ResourceArgs {

    public static final ServiceBackendPortArgs Empty = new ServiceBackendPortArgs();

    /**
     * Name is the name of the port on the Service. This is a mutually exclusive setting with "Number".
     * 
     */
    @InputImport(name="name")
    private final @Nullable Input<String> name;

    public Input<String> getName() {
        return this.name == null ? Input.empty() : this.name;
    }

    /**
     * Number is the numerical port number (e.g. 80) on the Service. This is a mutually exclusive setting with "Name".
     * 
     */
    @InputImport(name="number")
    private final @Nullable Input<Integer> number;

    public Input<Integer> getNumber() {
        return this.number == null ? Input.empty() : this.number;
    }

    public ServiceBackendPortArgs(
        @Nullable Input<String> name,
        @Nullable Input<Integer> number) {
        this.name = name;
        this.number = number;
    }

    private ServiceBackendPortArgs() {
        this.name = Input.empty();
        this.number = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ServiceBackendPortArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<String> name;
        private @Nullable Input<Integer> number;

        public Builder() {
    	      // Empty
        }

        public Builder(ServiceBackendPortArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.name = defaults.name;
    	      this.number = defaults.number;
        }

        public Builder setName(@Nullable Input<String> name) {
            this.name = name;
            return this;
        }

        public Builder setName(@Nullable String name) {
            this.name = Input.ofNullable(name);
            return this;
        }

        public Builder setNumber(@Nullable Input<Integer> number) {
            this.number = number;
            return this;
        }

        public Builder setNumber(@Nullable Integer number) {
            this.number = Input.ofNullable(number);
            return this;
        }

        public ServiceBackendPortArgs build() {
            return new ServiceBackendPortArgs(name, number);
        }
    }
}
