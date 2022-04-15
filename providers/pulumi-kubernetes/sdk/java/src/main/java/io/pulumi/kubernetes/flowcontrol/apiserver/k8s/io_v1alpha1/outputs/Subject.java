// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.kubernetes.flowcontrol.apiserver.k8s.io_v1alpha1.outputs;

import io.pulumi.core.annotations.CustomType;
import io.pulumi.kubernetes.flowcontrol.apiserver.k8s.io_v1alpha1.outputs.GroupSubject;
import io.pulumi.kubernetes.flowcontrol.apiserver.k8s.io_v1alpha1.outputs.ServiceAccountSubject;
import io.pulumi.kubernetes.flowcontrol.apiserver.k8s.io_v1alpha1.outputs.UserSubject;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class Subject {
    private final @Nullable GroupSubject group;
    /**
     * Required
     * 
     */
    private final String kind;
    private final @Nullable ServiceAccountSubject serviceAccount;
    private final @Nullable UserSubject user;

    @CustomType.Constructor
    private Subject(
        @CustomType.Parameter("group") @Nullable GroupSubject group,
        @CustomType.Parameter("kind") String kind,
        @CustomType.Parameter("serviceAccount") @Nullable ServiceAccountSubject serviceAccount,
        @CustomType.Parameter("user") @Nullable UserSubject user) {
        this.group = group;
        this.kind = kind;
        this.serviceAccount = serviceAccount;
        this.user = user;
    }

    public Optional<GroupSubject> group() {
        return Optional.ofNullable(this.group);
    }
    /**
     * Required
     * 
    */
    public String kind() {
        return this.kind;
    }
    public Optional<ServiceAccountSubject> serviceAccount() {
        return Optional.ofNullable(this.serviceAccount);
    }
    public Optional<UserSubject> user() {
        return Optional.ofNullable(this.user);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(Subject defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable GroupSubject group;
        private String kind;
        private @Nullable ServiceAccountSubject serviceAccount;
        private @Nullable UserSubject user;

        public Builder() {
    	      // Empty
        }

        public Builder(Subject defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.group = defaults.group;
    	      this.kind = defaults.kind;
    	      this.serviceAccount = defaults.serviceAccount;
    	      this.user = defaults.user;
        }

        public Builder group(@Nullable GroupSubject group) {
            this.group = group;
            return this;
        }
        public Builder kind(String kind) {
            this.kind = Objects.requireNonNull(kind);
            return this;
        }
        public Builder serviceAccount(@Nullable ServiceAccountSubject serviceAccount) {
            this.serviceAccount = serviceAccount;
            return this;
        }
        public Builder user(@Nullable UserSubject user) {
            this.user = user;
            return this;
        }        public Subject build() {
            return new Subject(group, kind, serviceAccount, user);
        }
    }
}
