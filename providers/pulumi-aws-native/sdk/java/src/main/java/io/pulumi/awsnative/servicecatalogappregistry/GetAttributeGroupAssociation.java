// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.servicecatalogappregistry;

import io.pulumi.awsnative.Utilities;
import io.pulumi.awsnative.servicecatalogappregistry.inputs.GetAttributeGroupAssociationArgs;
import io.pulumi.awsnative.servicecatalogappregistry.outputs.GetAttributeGroupAssociationResult;
import io.pulumi.core.internal.Reflection.TypeShape;
import io.pulumi.deployment.Deployment;
import io.pulumi.deployment.InvokeOptions;
import java.util.concurrent.CompletableFuture;
import javax.annotation.Nullable;

public class GetAttributeGroupAssociation {
/**
 * Resource Schema for AWS::ServiceCatalogAppRegistry::AttributeGroupAssociation.
 * 
 */
    public static CompletableFuture<GetAttributeGroupAssociationResult> invokeAsync(GetAttributeGroupAssociationArgs args, @Nullable InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("aws-native:servicecatalogappregistry:getAttributeGroupAssociation", TypeShape.of(GetAttributeGroupAssociationResult.class), args == null ? GetAttributeGroupAssociationArgs.Empty : args, Utilities.withVersion(options));
    }
}
