// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.customerprofiles.inputs;

import io.pulumi.core.internal.annotations.InputImport;
import java.lang.String;
import java.util.Objects;


public final class GetObjectTypeArgs extends io.pulumi.resources.InvokeArgs {

    public static final GetObjectTypeArgs Empty = new GetObjectTypeArgs();

    /**
     * The unique name of the domain.
     * 
     */
    @InputImport(name="domainName", required=true)
    private final String domainName;

    public String getDomainName() {
        return this.domainName;
    }

    /**
     * The name of the profile object type.
     * 
     */
    @InputImport(name="objectTypeName", required=true)
    private final String objectTypeName;

    public String getObjectTypeName() {
        return this.objectTypeName;
    }

    public GetObjectTypeArgs(
        String domainName,
        String objectTypeName) {
        this.domainName = Objects.requireNonNull(domainName, "expected parameter 'domainName' to be non-null");
        this.objectTypeName = Objects.requireNonNull(objectTypeName, "expected parameter 'objectTypeName' to be non-null");
    }

    private GetObjectTypeArgs() {
        this.domainName = null;
        this.objectTypeName = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetObjectTypeArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String domainName;
        private String objectTypeName;

        public Builder() {
    	      // Empty
        }

        public Builder(GetObjectTypeArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.domainName = defaults.domainName;
    	      this.objectTypeName = defaults.objectTypeName;
        }

        public Builder setDomainName(String domainName) {
            this.domainName = Objects.requireNonNull(domainName);
            return this;
        }

        public Builder setObjectTypeName(String objectTypeName) {
            this.objectTypeName = Objects.requireNonNull(objectTypeName);
            return this;
        }

        public GetObjectTypeArgs build() {
            return new GetObjectTypeArgs(domainName, objectTypeName);
        }
    }
}
