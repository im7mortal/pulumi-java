// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.imagebuilder.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import java.lang.String;
import java.util.Objects;

@OutputCustomType
public final class ImageRecipeComponent {
    /**
     * Amazon Resource Name (ARN) of the Image Builder Component to associate.
     * 
     */
    private final String componentArn;

    @OutputCustomType.Constructor({"componentArn"})
    private ImageRecipeComponent(String componentArn) {
        this.componentArn = Objects.requireNonNull(componentArn);
    }

    /**
     * Amazon Resource Name (ARN) of the Image Builder Component to associate.
     * 
    */
    public String getComponentArn() {
        return this.componentArn;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ImageRecipeComponent defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String componentArn;

        public Builder() {
    	      // Empty
        }

        public Builder(ImageRecipeComponent defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.componentArn = defaults.componentArn;
        }

        public Builder setComponentArn(String componentArn) {
            this.componentArn = Objects.requireNonNull(componentArn);
            return this;
        }
        public ImageRecipeComponent build() {
            return new ImageRecipeComponent(componentArn);
        }
    }
}
