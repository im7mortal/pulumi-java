// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.firebasehosting_v1beta1.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import java.lang.String;
import java.util.Objects;

@OutputCustomType
public final class ActingUserResponse {
    /**
     * The email address of the user when the user performed the action.
     * 
     */
    private final String email;
    /**
     * A profile image URL for the user. May not be present if the user has changed their email address or deleted their account.
     * 
     */
    private final String imageUrl;

    @OutputCustomType.Constructor({"email","imageUrl"})
    private ActingUserResponse(
        String email,
        String imageUrl) {
        this.email = Objects.requireNonNull(email);
        this.imageUrl = Objects.requireNonNull(imageUrl);
    }

    /**
     * The email address of the user when the user performed the action.
     * 
    */
    public String getEmail() {
        return this.email;
    }
    /**
     * A profile image URL for the user. May not be present if the user has changed their email address or deleted their account.
     * 
    */
    public String getImageUrl() {
        return this.imageUrl;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ActingUserResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String email;
        private String imageUrl;

        public Builder() {
    	      // Empty
        }

        public Builder(ActingUserResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.email = defaults.email;
    	      this.imageUrl = defaults.imageUrl;
        }

        public Builder setEmail(String email) {
            this.email = Objects.requireNonNull(email);
            return this;
        }

        public Builder setImageUrl(String imageUrl) {
            this.imageUrl = Objects.requireNonNull(imageUrl);
            return this;
        }
        public ActingUserResponse build() {
            return new ActingUserResponse(email, imageUrl);
        }
    }
}
