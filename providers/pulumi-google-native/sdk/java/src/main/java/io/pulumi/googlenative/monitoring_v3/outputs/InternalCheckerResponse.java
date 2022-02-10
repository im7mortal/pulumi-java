// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.monitoring_v3.outputs;

import io.pulumi.core.internal.annotations.OutputCustomType;
import java.lang.String;
import java.util.Objects;

@OutputCustomType
public final class InternalCheckerResponse {
    private final String displayName;
    private final String gcpZone;
    private final String name;
    private final String network;
    private final String peerProjectId;
    private final String state;

    @OutputCustomType.Constructor({"displayName","gcpZone","name","network","peerProjectId","state"})
    private InternalCheckerResponse(
        String displayName,
        String gcpZone,
        String name,
        String network,
        String peerProjectId,
        String state) {
        this.displayName = Objects.requireNonNull(displayName);
        this.gcpZone = Objects.requireNonNull(gcpZone);
        this.name = Objects.requireNonNull(name);
        this.network = Objects.requireNonNull(network);
        this.peerProjectId = Objects.requireNonNull(peerProjectId);
        this.state = Objects.requireNonNull(state);
    }

    public String getDisplayName() {
        return this.displayName;
    }
    public String getGcpZone() {
        return this.gcpZone;
    }
    public String getName() {
        return this.name;
    }
    public String getNetwork() {
        return this.network;
    }
    public String getPeerProjectId() {
        return this.peerProjectId;
    }
    public String getState() {
        return this.state;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(InternalCheckerResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String displayName;
        private String gcpZone;
        private String name;
        private String network;
        private String peerProjectId;
        private String state;

        public Builder() {
    	      // Empty
        }

        public Builder(InternalCheckerResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.displayName = defaults.displayName;
    	      this.gcpZone = defaults.gcpZone;
    	      this.name = defaults.name;
    	      this.network = defaults.network;
    	      this.peerProjectId = defaults.peerProjectId;
    	      this.state = defaults.state;
        }

        public Builder setDisplayName(String displayName) {
            this.displayName = Objects.requireNonNull(displayName);
            return this;
        }

        public Builder setGcpZone(String gcpZone) {
            this.gcpZone = Objects.requireNonNull(gcpZone);
            return this;
        }

        public Builder setName(String name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }

        public Builder setNetwork(String network) {
            this.network = Objects.requireNonNull(network);
            return this;
        }

        public Builder setPeerProjectId(String peerProjectId) {
            this.peerProjectId = Objects.requireNonNull(peerProjectId);
            return this;
        }

        public Builder setState(String state) {
            this.state = Objects.requireNonNull(state);
            return this;
        }

        public InternalCheckerResponse build() {
            return new InternalCheckerResponse(displayName, gcpZone, name, network, peerProjectId, state);
        }
    }
}