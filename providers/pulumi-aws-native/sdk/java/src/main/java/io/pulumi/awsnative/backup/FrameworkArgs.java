// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.backup;

import io.pulumi.awsnative.backup.inputs.FrameworkControlArgs;
import io.pulumi.awsnative.backup.inputs.FrameworkTagArgs;
import io.pulumi.core.Input;
import io.pulumi.core.internal.annotations.InputImport;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;


public final class FrameworkArgs extends io.pulumi.resources.ResourceArgs {

    public static final FrameworkArgs Empty = new FrameworkArgs();

    /**
     * Contains detailed information about all of the controls of a framework. Each framework must contain at least one control.
     * 
     */
    @InputImport(name="frameworkControls", required=true)
    private final Input<List<FrameworkControlArgs>> frameworkControls;

    public Input<List<FrameworkControlArgs>> getFrameworkControls() {
        return this.frameworkControls;
    }

    /**
     * An optional description of the framework with a maximum 1,024 characters.
     * 
     */
    @InputImport(name="frameworkDescription")
    private final @Nullable Input<String> frameworkDescription;

    public Input<String> getFrameworkDescription() {
        return this.frameworkDescription == null ? Input.empty() : this.frameworkDescription;
    }

    /**
     * The unique name of a framework. This name is between 1 and 256 characters, starting with a letter, and consisting of letters (a-z, A-Z), numbers (0-9), and underscores (_).
     * 
     */
    @InputImport(name="frameworkName")
    private final @Nullable Input<String> frameworkName;

    public Input<String> getFrameworkName() {
        return this.frameworkName == null ? Input.empty() : this.frameworkName;
    }

    /**
     * Metadata that you can assign to help organize the frameworks that you create. Each tag is a key-value pair.
     * 
     */
    @InputImport(name="frameworkTags")
    private final @Nullable Input<List<FrameworkTagArgs>> frameworkTags;

    public Input<List<FrameworkTagArgs>> getFrameworkTags() {
        return this.frameworkTags == null ? Input.empty() : this.frameworkTags;
    }

    public FrameworkArgs(
        Input<List<FrameworkControlArgs>> frameworkControls,
        @Nullable Input<String> frameworkDescription,
        @Nullable Input<String> frameworkName,
        @Nullable Input<List<FrameworkTagArgs>> frameworkTags) {
        this.frameworkControls = Objects.requireNonNull(frameworkControls, "expected parameter 'frameworkControls' to be non-null");
        this.frameworkDescription = frameworkDescription;
        this.frameworkName = frameworkName;
        this.frameworkTags = frameworkTags;
    }

    private FrameworkArgs() {
        this.frameworkControls = Input.empty();
        this.frameworkDescription = Input.empty();
        this.frameworkName = Input.empty();
        this.frameworkTags = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(FrameworkArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Input<List<FrameworkControlArgs>> frameworkControls;
        private @Nullable Input<String> frameworkDescription;
        private @Nullable Input<String> frameworkName;
        private @Nullable Input<List<FrameworkTagArgs>> frameworkTags;

        public Builder() {
    	      // Empty
        }

        public Builder(FrameworkArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.frameworkControls = defaults.frameworkControls;
    	      this.frameworkDescription = defaults.frameworkDescription;
    	      this.frameworkName = defaults.frameworkName;
    	      this.frameworkTags = defaults.frameworkTags;
        }

        public Builder setFrameworkControls(Input<List<FrameworkControlArgs>> frameworkControls) {
            this.frameworkControls = Objects.requireNonNull(frameworkControls);
            return this;
        }

        public Builder setFrameworkControls(List<FrameworkControlArgs> frameworkControls) {
            this.frameworkControls = Input.of(Objects.requireNonNull(frameworkControls));
            return this;
        }

        public Builder setFrameworkDescription(@Nullable Input<String> frameworkDescription) {
            this.frameworkDescription = frameworkDescription;
            return this;
        }

        public Builder setFrameworkDescription(@Nullable String frameworkDescription) {
            this.frameworkDescription = Input.ofNullable(frameworkDescription);
            return this;
        }

        public Builder setFrameworkName(@Nullable Input<String> frameworkName) {
            this.frameworkName = frameworkName;
            return this;
        }

        public Builder setFrameworkName(@Nullable String frameworkName) {
            this.frameworkName = Input.ofNullable(frameworkName);
            return this;
        }

        public Builder setFrameworkTags(@Nullable Input<List<FrameworkTagArgs>> frameworkTags) {
            this.frameworkTags = frameworkTags;
            return this;
        }

        public Builder setFrameworkTags(@Nullable List<FrameworkTagArgs> frameworkTags) {
            this.frameworkTags = Input.ofNullable(frameworkTags);
            return this;
        }

        public FrameworkArgs build() {
            return new FrameworkArgs(frameworkControls, frameworkDescription, frameworkName, frameworkTags);
        }
    }
}
