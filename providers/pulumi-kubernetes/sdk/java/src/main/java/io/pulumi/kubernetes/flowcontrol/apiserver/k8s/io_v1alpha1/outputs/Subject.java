// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.kubernetes.flowcontrol.apiserver.k8s.io_v1alpha1.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import io.pulumi.kubernetes.flowcontrol.apiserver.k8s.io_v1alpha1.outputs.GroupSubject;
import io.pulumi.kubernetes.flowcontrol.apiserver.k8s.io_v1alpha1.outputs.ServiceAccountSubject;
import io.pulumi.kubernetes.flowcontrol.apiserver.k8s.io_v1alpha1.outputs.UserSubject;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class Subject {
    private final @Nullable GroupSubject group;
    /**
     * Required
     * 
     */
    private final String kind;
    private final @Nullable ServiceAccountSubject serviceAccount;
    private final @Nullable UserSubject user;

    @OutputCustomType.Constructor({"group","kind","serviceAccount","user"})
    private Subject(
        @Nullable GroupSubject group,
        String kind,
        @Nullable ServiceAccountSubject serviceAccount,
        @Nullable UserSubject user) {
        this.group = group;
        this.kind = Objects.requireNonNull(kind);
        this.serviceAccount = serviceAccount;
        this.user = user;
    }

    public Optional<GroupSubject> getGroup() {
        return Optional.ofNullable(this.group);
    }
    /**
     * Required
     * 
    */
    public String getKind() {
        return this.kind;
    }
    public Optional<ServiceAccountSubject> getServiceAccount() {
        return Optional.ofNullable(this.serviceAccount);
    }
    public Optional<UserSubject> getUser() {
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

        public Builder setGroup(@Nullable GroupSubject group) {
            this.group = group;
            return this;
        }

        public Builder setKind(String kind) {
            this.kind = Objects.requireNonNull(kind);
            return this;
        }

        public Builder setServiceAccount(@Nullable ServiceAccountSubject serviceAccount) {
            this.serviceAccount = serviceAccount;
            return this;
        }

        public Builder setUser(@Nullable UserSubject user) {
            this.user = user;
            return this;
        }
        public Subject build() {
            return new Subject(group, kind, serviceAccount, user);
        }
    }
}
