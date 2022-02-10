// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.bigquerydatatransfer_v1.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.internal.annotations.InputImport;
import java.lang.Boolean;
import java.util.Objects;
import javax.annotation.Nullable;


public final class EmailPreferencesArgs extends io.pulumi.resources.ResourceArgs {

    public static final EmailPreferencesArgs Empty = new EmailPreferencesArgs();

    @InputImport(name="enableFailureEmail")
    private final @Nullable Input<Boolean> enableFailureEmail;

    public Input<Boolean> getEnableFailureEmail() {
        return this.enableFailureEmail == null ? Input.empty() : this.enableFailureEmail;
    }

    public EmailPreferencesArgs(@Nullable Input<Boolean> enableFailureEmail) {
        this.enableFailureEmail = enableFailureEmail;
    }

    private EmailPreferencesArgs() {
        this.enableFailureEmail = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(EmailPreferencesArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<Boolean> enableFailureEmail;

        public Builder() {
    	      // Empty
        }

        public Builder(EmailPreferencesArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.enableFailureEmail = defaults.enableFailureEmail;
        }

        public Builder setEnableFailureEmail(@Nullable Input<Boolean> enableFailureEmail) {
            this.enableFailureEmail = enableFailureEmail;
            return this;
        }

        public Builder setEnableFailureEmail(@Nullable Boolean enableFailureEmail) {
            this.enableFailureEmail = Input.ofNullable(enableFailureEmail);
            return this;
        }

        public EmailPreferencesArgs build() {
            return new EmailPreferencesArgs(enableFailureEmail);
        }
    }
}