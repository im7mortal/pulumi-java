// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.kubernetesconfiguration.inputs;

import io.pulumi.azurenative.kubernetesconfiguration.enums.KustomizationValidationType;
import io.pulumi.azurenative.kubernetesconfiguration.inputs.DependsOnDefinitionArgs;
import io.pulumi.core.Either;
import io.pulumi.core.Input;
import io.pulumi.core.internal.annotations.InputImport;
import java.lang.Boolean;
import java.lang.Double;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;


public final class KustomizationDefinitionArgs extends io.pulumi.resources.ResourceArgs {

    public static final KustomizationDefinitionArgs Empty = new KustomizationDefinitionArgs();

    @InputImport(name="dependsOn")
    private final @Nullable Input<List<DependsOnDefinitionArgs>> dependsOn;

    public Input<List<DependsOnDefinitionArgs>> getDependsOn() {
        return this.dependsOn == null ? Input.empty() : this.dependsOn;
    }

    @InputImport(name="force")
    private final @Nullable Input<Boolean> force;

    public Input<Boolean> getForce() {
        return this.force == null ? Input.empty() : this.force;
    }

    @InputImport(name="path")
    private final @Nullable Input<String> path;

    public Input<String> getPath() {
        return this.path == null ? Input.empty() : this.path;
    }

    @InputImport(name="prune")
    private final @Nullable Input<Boolean> prune;

    public Input<Boolean> getPrune() {
        return this.prune == null ? Input.empty() : this.prune;
    }

    @InputImport(name="retryIntervalInSeconds")
    private final @Nullable Input<Double> retryIntervalInSeconds;

    public Input<Double> getRetryIntervalInSeconds() {
        return this.retryIntervalInSeconds == null ? Input.empty() : this.retryIntervalInSeconds;
    }

    @InputImport(name="syncIntervalInSeconds")
    private final @Nullable Input<Double> syncIntervalInSeconds;

    public Input<Double> getSyncIntervalInSeconds() {
        return this.syncIntervalInSeconds == null ? Input.empty() : this.syncIntervalInSeconds;
    }

    @InputImport(name="timeoutInSeconds")
    private final @Nullable Input<Double> timeoutInSeconds;

    public Input<Double> getTimeoutInSeconds() {
        return this.timeoutInSeconds == null ? Input.empty() : this.timeoutInSeconds;
    }

    @InputImport(name="validation")
    private final @Nullable Input<Either<String,KustomizationValidationType>> validation;

    public Input<Either<String,KustomizationValidationType>> getValidation() {
        return this.validation == null ? Input.empty() : this.validation;
    }

    public KustomizationDefinitionArgs(
        @Nullable Input<List<DependsOnDefinitionArgs>> dependsOn,
        @Nullable Input<Boolean> force,
        @Nullable Input<String> path,
        @Nullable Input<Boolean> prune,
        @Nullable Input<Double> retryIntervalInSeconds,
        @Nullable Input<Double> syncIntervalInSeconds,
        @Nullable Input<Double> timeoutInSeconds,
        @Nullable Input<Either<String,KustomizationValidationType>> validation) {
        this.dependsOn = dependsOn;
        this.force = force == null ? Input.ofNullable(false) : force;
        this.path = path == null ? Input.ofNullable("") : path;
        this.prune = prune == null ? Input.ofNullable(false) : prune;
        this.retryIntervalInSeconds = retryIntervalInSeconds;
        this.syncIntervalInSeconds = syncIntervalInSeconds == null ? Input.ofNullable(6e+02) : syncIntervalInSeconds;
        this.timeoutInSeconds = timeoutInSeconds == null ? Input.ofNullable(6e+02) : timeoutInSeconds;
        this.validation = validation;
    }

    private KustomizationDefinitionArgs() {
        this.dependsOn = Input.empty();
        this.force = Input.empty();
        this.path = Input.empty();
        this.prune = Input.empty();
        this.retryIntervalInSeconds = Input.empty();
        this.syncIntervalInSeconds = Input.empty();
        this.timeoutInSeconds = Input.empty();
        this.validation = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(KustomizationDefinitionArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<List<DependsOnDefinitionArgs>> dependsOn;
        private @Nullable Input<Boolean> force;
        private @Nullable Input<String> path;
        private @Nullable Input<Boolean> prune;
        private @Nullable Input<Double> retryIntervalInSeconds;
        private @Nullable Input<Double> syncIntervalInSeconds;
        private @Nullable Input<Double> timeoutInSeconds;
        private @Nullable Input<Either<String,KustomizationValidationType>> validation;

        public Builder() {
    	      // Empty
        }

        public Builder(KustomizationDefinitionArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.dependsOn = defaults.dependsOn;
    	      this.force = defaults.force;
    	      this.path = defaults.path;
    	      this.prune = defaults.prune;
    	      this.retryIntervalInSeconds = defaults.retryIntervalInSeconds;
    	      this.syncIntervalInSeconds = defaults.syncIntervalInSeconds;
    	      this.timeoutInSeconds = defaults.timeoutInSeconds;
    	      this.validation = defaults.validation;
        }

        public Builder setDependsOn(@Nullable Input<List<DependsOnDefinitionArgs>> dependsOn) {
            this.dependsOn = dependsOn;
            return this;
        }

        public Builder setDependsOn(@Nullable List<DependsOnDefinitionArgs> dependsOn) {
            this.dependsOn = Input.ofNullable(dependsOn);
            return this;
        }

        public Builder setForce(@Nullable Input<Boolean> force) {
            this.force = force;
            return this;
        }

        public Builder setForce(@Nullable Boolean force) {
            this.force = Input.ofNullable(force);
            return this;
        }

        public Builder setPath(@Nullable Input<String> path) {
            this.path = path;
            return this;
        }

        public Builder setPath(@Nullable String path) {
            this.path = Input.ofNullable(path);
            return this;
        }

        public Builder setPrune(@Nullable Input<Boolean> prune) {
            this.prune = prune;
            return this;
        }

        public Builder setPrune(@Nullable Boolean prune) {
            this.prune = Input.ofNullable(prune);
            return this;
        }

        public Builder setRetryIntervalInSeconds(@Nullable Input<Double> retryIntervalInSeconds) {
            this.retryIntervalInSeconds = retryIntervalInSeconds;
            return this;
        }

        public Builder setRetryIntervalInSeconds(@Nullable Double retryIntervalInSeconds) {
            this.retryIntervalInSeconds = Input.ofNullable(retryIntervalInSeconds);
            return this;
        }

        public Builder setSyncIntervalInSeconds(@Nullable Input<Double> syncIntervalInSeconds) {
            this.syncIntervalInSeconds = syncIntervalInSeconds;
            return this;
        }

        public Builder setSyncIntervalInSeconds(@Nullable Double syncIntervalInSeconds) {
            this.syncIntervalInSeconds = Input.ofNullable(syncIntervalInSeconds);
            return this;
        }

        public Builder setTimeoutInSeconds(@Nullable Input<Double> timeoutInSeconds) {
            this.timeoutInSeconds = timeoutInSeconds;
            return this;
        }

        public Builder setTimeoutInSeconds(@Nullable Double timeoutInSeconds) {
            this.timeoutInSeconds = Input.ofNullable(timeoutInSeconds);
            return this;
        }

        public Builder setValidation(@Nullable Input<Either<String,KustomizationValidationType>> validation) {
            this.validation = validation;
            return this;
        }

        public Builder setValidation(@Nullable Either<String,KustomizationValidationType> validation) {
            this.validation = Input.ofNullable(validation);
            return this;
        }

        public KustomizationDefinitionArgs build() {
            return new KustomizationDefinitionArgs(dependsOn, force, path, prune, retryIntervalInSeconds, syncIntervalInSeconds, timeoutInSeconds, validation);
        }
    }
}