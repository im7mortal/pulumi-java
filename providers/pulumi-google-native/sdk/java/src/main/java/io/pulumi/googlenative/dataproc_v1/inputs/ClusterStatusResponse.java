// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.dataproc_v1.inputs;

import io.pulumi.core.internal.annotations.InputImport;
import java.lang.String;
import java.util.Objects;


public final class ClusterStatusResponse extends io.pulumi.resources.InvokeArgs {

    public static final ClusterStatusResponse Empty = new ClusterStatusResponse();

    @InputImport(name="detail", required=true)
    private final String detail;

    public String getDetail() {
        return this.detail;
    }

    @InputImport(name="state", required=true)
    private final String state;

    public String getState() {
        return this.state;
    }

    @InputImport(name="stateStartTime", required=true)
    private final String stateStartTime;

    public String getStateStartTime() {
        return this.stateStartTime;
    }

    @InputImport(name="substate", required=true)
    private final String substate;

    public String getSubstate() {
        return this.substate;
    }

    public ClusterStatusResponse(
        String detail,
        String state,
        String stateStartTime,
        String substate) {
        this.detail = Objects.requireNonNull(detail, "expected parameter 'detail' to be non-null");
        this.state = Objects.requireNonNull(state, "expected parameter 'state' to be non-null");
        this.stateStartTime = Objects.requireNonNull(stateStartTime, "expected parameter 'stateStartTime' to be non-null");
        this.substate = Objects.requireNonNull(substate, "expected parameter 'substate' to be non-null");
    }

    private ClusterStatusResponse() {
        this.detail = null;
        this.state = null;
        this.stateStartTime = null;
        this.substate = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ClusterStatusResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String detail;
        private String state;
        private String stateStartTime;
        private String substate;

        public Builder() {
    	      // Empty
        }

        public Builder(ClusterStatusResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.detail = defaults.detail;
    	      this.state = defaults.state;
    	      this.stateStartTime = defaults.stateStartTime;
    	      this.substate = defaults.substate;
        }

        public Builder setDetail(String detail) {
            this.detail = Objects.requireNonNull(detail);
            return this;
        }

        public Builder setState(String state) {
            this.state = Objects.requireNonNull(state);
            return this;
        }

        public Builder setStateStartTime(String stateStartTime) {
            this.stateStartTime = Objects.requireNonNull(stateStartTime);
            return this;
        }

        public Builder setSubstate(String substate) {
            this.substate = Objects.requireNonNull(substate);
            return this;
        }

        public ClusterStatusResponse build() {
            return new ClusterStatusResponse(detail, state, stateStartTime, substate);
        }
    }
}