// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.kubernetes.core_v1.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class ContainerStateTerminated {
    /**
     * Container's ID in the format 'docker://<container_id>'
     * 
     */
    private final @Nullable String containerID;
    /**
     * Exit status from the last termination of the container
     * 
     */
    private final Integer exitCode;
    /**
     * Time at which the container last terminated
     * 
     */
    private final @Nullable String finishedAt;
    /**
     * Message regarding the last termination of the container
     * 
     */
    private final @Nullable String message;
    /**
     * (brief) reason from the last termination of the container
     * 
     */
    private final @Nullable String reason;
    /**
     * Signal from the last termination of the container
     * 
     */
    private final @Nullable Integer signal;
    /**
     * Time at which previous execution of the container started
     * 
     */
    private final @Nullable String startedAt;

    @OutputCustomType.Constructor({"containerID","exitCode","finishedAt","message","reason","signal","startedAt"})
    private ContainerStateTerminated(
        @Nullable String containerID,
        Integer exitCode,
        @Nullable String finishedAt,
        @Nullable String message,
        @Nullable String reason,
        @Nullable Integer signal,
        @Nullable String startedAt) {
        this.containerID = containerID;
        this.exitCode = Objects.requireNonNull(exitCode);
        this.finishedAt = finishedAt;
        this.message = message;
        this.reason = reason;
        this.signal = signal;
        this.startedAt = startedAt;
    }

    /**
     * Container's ID in the format 'docker://<container_id>'
     * 
    */
    public Optional<String> getContainerID() {
        return Optional.ofNullable(this.containerID);
    }
    /**
     * Exit status from the last termination of the container
     * 
    */
    public Integer getExitCode() {
        return this.exitCode;
    }
    /**
     * Time at which the container last terminated
     * 
    */
    public Optional<String> getFinishedAt() {
        return Optional.ofNullable(this.finishedAt);
    }
    /**
     * Message regarding the last termination of the container
     * 
    */
    public Optional<String> getMessage() {
        return Optional.ofNullable(this.message);
    }
    /**
     * (brief) reason from the last termination of the container
     * 
    */
    public Optional<String> getReason() {
        return Optional.ofNullable(this.reason);
    }
    /**
     * Signal from the last termination of the container
     * 
    */
    public Optional<Integer> getSignal() {
        return Optional.ofNullable(this.signal);
    }
    /**
     * Time at which previous execution of the container started
     * 
    */
    public Optional<String> getStartedAt() {
        return Optional.ofNullable(this.startedAt);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ContainerStateTerminated defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String containerID;
        private Integer exitCode;
        private @Nullable String finishedAt;
        private @Nullable String message;
        private @Nullable String reason;
        private @Nullable Integer signal;
        private @Nullable String startedAt;

        public Builder() {
    	      // Empty
        }

        public Builder(ContainerStateTerminated defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.containerID = defaults.containerID;
    	      this.exitCode = defaults.exitCode;
    	      this.finishedAt = defaults.finishedAt;
    	      this.message = defaults.message;
    	      this.reason = defaults.reason;
    	      this.signal = defaults.signal;
    	      this.startedAt = defaults.startedAt;
        }

        public Builder setContainerID(@Nullable String containerID) {
            this.containerID = containerID;
            return this;
        }

        public Builder setExitCode(Integer exitCode) {
            this.exitCode = Objects.requireNonNull(exitCode);
            return this;
        }

        public Builder setFinishedAt(@Nullable String finishedAt) {
            this.finishedAt = finishedAt;
            return this;
        }

        public Builder setMessage(@Nullable String message) {
            this.message = message;
            return this;
        }

        public Builder setReason(@Nullable String reason) {
            this.reason = reason;
            return this;
        }

        public Builder setSignal(@Nullable Integer signal) {
            this.signal = signal;
            return this;
        }

        public Builder setStartedAt(@Nullable String startedAt) {
            this.startedAt = startedAt;
            return this;
        }
        public ContainerStateTerminated build() {
            return new ContainerStateTerminated(containerID, exitCode, finishedAt, message, reason, signal, startedAt);
        }
    }
}
