// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.random;

import io.pulumi.core.Input;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.OutputExport;
import io.pulumi.core.annotations.ResourceType;
import io.pulumi.random.RandomPasswordArgs;
import io.pulumi.random.Utilities;
import io.pulumi.random.inputs.RandomPasswordState;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.Object;
import java.lang.String;
import java.util.Map;
import javax.annotation.Nullable;

/**
 * Identical to random.RandomString with the exception that the result is treated as sensitive and, thus, _not_ displayed in console output.
 * 
 * This resource *does* use a cryptographic random number generator.
 * 
 * ## Example Usage
 * 
 * ## Import
 * 
 * # Random Password can be imported by specifying the value of the string
 * 
 * ```sh
 *  $ pulumi import random:index/randomPassword:RandomPassword password securepassword
 * ```
 * 
 */
@ResourceType(type="random:index/randomPassword:RandomPassword")
public class RandomPassword extends io.pulumi.resources.CustomResource {
    /**
     * Arbitrary map of values that, when changed, will trigger recreation of resource. See the main provider documentation for more information.
     * 
     */
    @OutputExport(name="keepers", type=Map.class, parameters={String.class, Object.class})
    private Output</* @Nullable */ Map<String,Object>> keepers;

    /**
     * @return Arbitrary map of values that, when changed, will trigger recreation of resource. See the main provider documentation for more information.
     * 
     */
    public Output</* @Nullable */ Map<String,Object>> getKeepers() {
        return this.keepers;
    }
    /**
     * The length of the string desired.
     * 
     */
    @OutputExport(name="length", type=Integer.class, parameters={})
    private Output<Integer> length;

    /**
     * @return The length of the string desired.
     * 
     */
    public Output<Integer> getLength() {
        return this.length;
    }
    /**
     * Include lowercase alphabet characters in the result.
     * 
     */
    @OutputExport(name="lower", type=Boolean.class, parameters={})
    private Output</* @Nullable */ Boolean> lower;

    /**
     * @return Include lowercase alphabet characters in the result.
     * 
     */
    public Output</* @Nullable */ Boolean> getLower() {
        return this.lower;
    }
    /**
     * Minimum number of lowercase alphabet characters in the result.
     * 
     */
    @OutputExport(name="minLower", type=Integer.class, parameters={})
    private Output</* @Nullable */ Integer> minLower;

    /**
     * @return Minimum number of lowercase alphabet characters in the result.
     * 
     */
    public Output</* @Nullable */ Integer> getMinLower() {
        return this.minLower;
    }
    /**
     * Minimum number of numeric characters in the result.
     * 
     */
    @OutputExport(name="minNumeric", type=Integer.class, parameters={})
    private Output</* @Nullable */ Integer> minNumeric;

    /**
     * @return Minimum number of numeric characters in the result.
     * 
     */
    public Output</* @Nullable */ Integer> getMinNumeric() {
        return this.minNumeric;
    }
    /**
     * Minimum number of special characters in the result.
     * 
     */
    @OutputExport(name="minSpecial", type=Integer.class, parameters={})
    private Output</* @Nullable */ Integer> minSpecial;

    /**
     * @return Minimum number of special characters in the result.
     * 
     */
    public Output</* @Nullable */ Integer> getMinSpecial() {
        return this.minSpecial;
    }
    /**
     * Minimum number of uppercase alphabet characters in the result.
     * 
     */
    @OutputExport(name="minUpper", type=Integer.class, parameters={})
    private Output</* @Nullable */ Integer> minUpper;

    /**
     * @return Minimum number of uppercase alphabet characters in the result.
     * 
     */
    public Output</* @Nullable */ Integer> getMinUpper() {
        return this.minUpper;
    }
    /**
     * Include numeric characters in the result.
     * 
     */
    @OutputExport(name="number", type=Boolean.class, parameters={})
    private Output</* @Nullable */ Boolean> number;

    /**
     * @return Include numeric characters in the result.
     * 
     */
    public Output</* @Nullable */ Boolean> getNumber() {
        return this.number;
    }
    /**
     * Supply your own list of special characters to use for string generation.  This overrides the default character list in the special argument.  The `special` argument must still be set to true for any overwritten characters to be used in generation.
     * 
     */
    @OutputExport(name="overrideSpecial", type=String.class, parameters={})
    private Output</* @Nullable */ String> overrideSpecial;

    /**
     * @return Supply your own list of special characters to use for string generation.  This overrides the default character list in the special argument.  The `special` argument must still be set to true for any overwritten characters to be used in generation.
     * 
     */
    public Output</* @Nullable */ String> getOverrideSpecial() {
        return this.overrideSpecial;
    }
    /**
     * The generated random string.
     * 
     */
    @OutputExport(name="result", type=String.class, parameters={})
    private Output<String> result;

    /**
     * @return The generated random string.
     * 
     */
    public Output<String> getResult() {
        return this.result;
    }
    /**
     * Include special characters in the result. These are `!@#$%&*()-_=+[]{}<>:?`
     * 
     */
    @OutputExport(name="special", type=Boolean.class, parameters={})
    private Output</* @Nullable */ Boolean> special;

    /**
     * @return Include special characters in the result. These are `!@#$%&*()-_=+[]{}<>:?`
     * 
     */
    public Output</* @Nullable */ Boolean> getSpecial() {
        return this.special;
    }
    /**
     * Include uppercase alphabet characters in the result.
     * 
     */
    @OutputExport(name="upper", type=Boolean.class, parameters={})
    private Output</* @Nullable */ Boolean> upper;

    /**
     * @return Include uppercase alphabet characters in the result.
     * 
     */
    public Output</* @Nullable */ Boolean> getUpper() {
        return this.upper;
    }

    public interface BuilderApplicator {
        public void apply(RandomPasswordArgs.Builder a);
    }
    private static io.pulumi.random.RandomPasswordArgs buildArgs(BuilderApplicator argsBuilder) {
        final var builder = io.pulumi.random.RandomPasswordArgs.builder();
        argsBuilder.apply(builder);
        return builder.build();
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param argsBuilder A function that configures a passed builder.
     */
    public RandomPassword(String name, BuilderApplicator argsBuilder) {
        this(name, buildArgs(argsBuilder), null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public RandomPassword(String name) {
        this(name, RandomPasswordArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public RandomPassword(String name, RandomPasswordArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public RandomPassword(String name, RandomPasswordArgs args, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("random:index/randomPassword:RandomPassword", name, args == null ? RandomPasswordArgs.Empty : args, makeResourceOptions(options, Input.empty()));
    }

    private RandomPassword(String name, Input<String> id, @Nullable RandomPasswordState state, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("random:index/randomPassword:RandomPassword", name, state, makeResourceOptions(options, id));
    }

    private static io.pulumi.resources.CustomResourceOptions makeResourceOptions(@Nullable io.pulumi.resources.CustomResourceOptions options, @Nullable Input<String> id) {
        var defaultOptions = io.pulumi.resources.CustomResourceOptions.builder()
            .setVersion(Utilities.getVersion())
            .build();
        return io.pulumi.resources.CustomResourceOptions.merge(defaultOptions, options, id);
    }

    /**
     * Get an existing Host resource's state with the given name, ID, and optional extra
     * properties used to qualify the lookup.
     *
     * @param name The _unique_ name of the resulting resource.
     * @param id The _unique_ provider ID of the resource to lookup.
     * @param state
     * @param options Optional settings to control the behavior of the CustomResource.
     */
    public static RandomPassword get(String name, Input<String> id, @Nullable RandomPasswordState state, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        return new RandomPassword(name, id, state, options);
    }
}
