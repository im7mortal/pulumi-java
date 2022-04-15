// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.kubernetes.core_v1.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import io.pulumi.core.internal.Codegen;
import io.pulumi.kubernetes.core_v1.inputs.ExecActionArgs;
import io.pulumi.kubernetes.core_v1.inputs.HTTPGetActionArgs;
import io.pulumi.kubernetes.core_v1.inputs.TCPSocketActionArgs;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * LifecycleHandler defines a specific action that should be taken in a lifecycle hook. One and only one of the fields, except TCPSocket must be specified.
 * 
 */
public final class LifecycleHandlerArgs extends io.pulumi.resources.ResourceArgs {

    public static final LifecycleHandlerArgs Empty = new LifecycleHandlerArgs();

    /**
     * Exec specifies the action to take.
     * 
     */
    @Import(name="exec")
      private final @Nullable Output<ExecActionArgs> exec;

    public Output<ExecActionArgs> exec() {
        return this.exec == null ? Codegen.empty() : this.exec;
    }

    /**
     * HTTPGet specifies the http request to perform.
     * 
     */
    @Import(name="httpGet")
      private final @Nullable Output<HTTPGetActionArgs> httpGet;

    public Output<HTTPGetActionArgs> httpGet() {
        return this.httpGet == null ? Codegen.empty() : this.httpGet;
    }

    /**
     * Deprecated. TCPSocket is NOT supported as a LifecycleHandler and kept for the backward compatibility. There are no validation of this field and lifecycle hooks will fail in runtime when tcp handler is specified.
     * 
     */
    @Import(name="tcpSocket")
      private final @Nullable Output<TCPSocketActionArgs> tcpSocket;

    public Output<TCPSocketActionArgs> tcpSocket() {
        return this.tcpSocket == null ? Codegen.empty() : this.tcpSocket;
    }

    public LifecycleHandlerArgs(
        @Nullable Output<ExecActionArgs> exec,
        @Nullable Output<HTTPGetActionArgs> httpGet,
        @Nullable Output<TCPSocketActionArgs> tcpSocket) {
        this.exec = exec;
        this.httpGet = httpGet;
        this.tcpSocket = tcpSocket;
    }

    private LifecycleHandlerArgs() {
        this.exec = Codegen.empty();
        this.httpGet = Codegen.empty();
        this.tcpSocket = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(LifecycleHandlerArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<ExecActionArgs> exec;
        private @Nullable Output<HTTPGetActionArgs> httpGet;
        private @Nullable Output<TCPSocketActionArgs> tcpSocket;

        public Builder() {
    	      // Empty
        }

        public Builder(LifecycleHandlerArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.exec = defaults.exec;
    	      this.httpGet = defaults.httpGet;
    	      this.tcpSocket = defaults.tcpSocket;
        }

        public Builder exec(@Nullable Output<ExecActionArgs> exec) {
            this.exec = exec;
            return this;
        }
        public Builder exec(@Nullable ExecActionArgs exec) {
            this.exec = Codegen.ofNullable(exec);
            return this;
        }
        public Builder httpGet(@Nullable Output<HTTPGetActionArgs> httpGet) {
            this.httpGet = httpGet;
            return this;
        }
        public Builder httpGet(@Nullable HTTPGetActionArgs httpGet) {
            this.httpGet = Codegen.ofNullable(httpGet);
            return this;
        }
        public Builder tcpSocket(@Nullable Output<TCPSocketActionArgs> tcpSocket) {
            this.tcpSocket = tcpSocket;
            return this;
        }
        public Builder tcpSocket(@Nullable TCPSocketActionArgs tcpSocket) {
            this.tcpSocket = Codegen.ofNullable(tcpSocket);
            return this;
        }        public LifecycleHandlerArgs build() {
            return new LifecycleHandlerArgs(exec, httpGet, tcpSocket);
        }
    }
}
