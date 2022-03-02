// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.labservices.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class ConnectionProfileResponse {
    /**
     * The enabled access level for Client Access over RDP.
     * 
     */
    private final @Nullable String clientRdpAccess;
    /**
     * The enabled access level for Client Access over SSH.
     * 
     */
    private final @Nullable String clientSshAccess;
    /**
     * The enabled access level for Web Access over RDP.
     * 
     */
    private final @Nullable String webRdpAccess;
    /**
     * The enabled access level for Web Access over SSH.
     * 
     */
    private final @Nullable String webSshAccess;

    @OutputCustomType.Constructor({"clientRdpAccess","clientSshAccess","webRdpAccess","webSshAccess"})
    private ConnectionProfileResponse(
        @Nullable String clientRdpAccess,
        @Nullable String clientSshAccess,
        @Nullable String webRdpAccess,
        @Nullable String webSshAccess) {
        this.clientRdpAccess = clientRdpAccess;
        this.clientSshAccess = clientSshAccess;
        this.webRdpAccess = webRdpAccess;
        this.webSshAccess = webSshAccess;
    }

    /**
     * The enabled access level for Client Access over RDP.
     * 
    */
    public Optional<String> getClientRdpAccess() {
        return Optional.ofNullable(this.clientRdpAccess);
    }
    /**
     * The enabled access level for Client Access over SSH.
     * 
    */
    public Optional<String> getClientSshAccess() {
        return Optional.ofNullable(this.clientSshAccess);
    }
    /**
     * The enabled access level for Web Access over RDP.
     * 
    */
    public Optional<String> getWebRdpAccess() {
        return Optional.ofNullable(this.webRdpAccess);
    }
    /**
     * The enabled access level for Web Access over SSH.
     * 
    */
    public Optional<String> getWebSshAccess() {
        return Optional.ofNullable(this.webSshAccess);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ConnectionProfileResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String clientRdpAccess;
        private @Nullable String clientSshAccess;
        private @Nullable String webRdpAccess;
        private @Nullable String webSshAccess;

        public Builder() {
    	      // Empty
        }

        public Builder(ConnectionProfileResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.clientRdpAccess = defaults.clientRdpAccess;
    	      this.clientSshAccess = defaults.clientSshAccess;
    	      this.webRdpAccess = defaults.webRdpAccess;
    	      this.webSshAccess = defaults.webSshAccess;
        }

        public Builder setClientRdpAccess(@Nullable String clientRdpAccess) {
            this.clientRdpAccess = clientRdpAccess;
            return this;
        }

        public Builder setClientSshAccess(@Nullable String clientSshAccess) {
            this.clientSshAccess = clientSshAccess;
            return this;
        }

        public Builder setWebRdpAccess(@Nullable String webRdpAccess) {
            this.webRdpAccess = webRdpAccess;
            return this;
        }

        public Builder setWebSshAccess(@Nullable String webSshAccess) {
            this.webSshAccess = webSshAccess;
            return this;
        }
        public ConnectionProfileResponse build() {
            return new ConnectionProfileResponse(clientRdpAccess, clientSshAccess, webRdpAccess, webSshAccess);
        }
    }
}
