// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.lex;

import io.pulumi.awsnative.Utilities;
import io.pulumi.awsnative.lex.BotArgs;
import io.pulumi.awsnative.lex.outputs.BotLocale;
import io.pulumi.awsnative.lex.outputs.BotS3Location;
import io.pulumi.awsnative.lex.outputs.BotTag;
import io.pulumi.awsnative.lex.outputs.DataPrivacyProperties;
import io.pulumi.core.Input;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.OutputExport;
import io.pulumi.core.annotations.ResourceType;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import javax.annotation.Nullable;

/**
 * Amazon Lex conversational bot performing automated tasks such as ordering a pizza, booking a hotel, and so on.
 * 
 * ## Example Usage
 * 
 */
@ResourceType(type="aws-native:lex:Bot")
public class Bot extends io.pulumi.resources.CustomResource {
    @OutputExport(name="arn", type=String.class, parameters={})
    private Output<String> arn;

    public Output<String> getArn() {
        return this.arn;
    }
    /**
     * Specifies whether to build the bot locales after bot creation completes.
     * 
     */
    @OutputExport(name="autoBuildBotLocales", type=Boolean.class, parameters={})
    private Output</* @Nullable */ Boolean> autoBuildBotLocales;

    /**
     * @return Specifies whether to build the bot locales after bot creation completes.
     * 
     */
    public Output</* @Nullable */ Boolean> getAutoBuildBotLocales() {
        return this.autoBuildBotLocales;
    }
    @OutputExport(name="botFileS3Location", type=BotS3Location.class, parameters={})
    private Output</* @Nullable */ BotS3Location> botFileS3Location;

    public Output</* @Nullable */ BotS3Location> getBotFileS3Location() {
        return this.botFileS3Location;
    }
    /**
     * List of bot locales
     * 
     */
    @OutputExport(name="botLocales", type=List.class, parameters={BotLocale.class})
    private Output</* @Nullable */ List<BotLocale>> botLocales;

    /**
     * @return List of bot locales
     * 
     */
    public Output</* @Nullable */ List<BotLocale>> getBotLocales() {
        return this.botLocales;
    }
    /**
     * A list of tags to add to the bot, which can only be added at bot creation.
     * 
     */
    @OutputExport(name="botTags", type=List.class, parameters={BotTag.class})
    private Output</* @Nullable */ List<BotTag>> botTags;

    /**
     * @return A list of tags to add to the bot, which can only be added at bot creation.
     * 
     */
    public Output</* @Nullable */ List<BotTag>> getBotTags() {
        return this.botTags;
    }
    /**
     * Data privacy setting of the Bot.
     * 
     */
    @OutputExport(name="dataPrivacy", type=DataPrivacyProperties.class, parameters={})
    private Output<DataPrivacyProperties> dataPrivacy;

    /**
     * @return Data privacy setting of the Bot.
     * 
     */
    public Output<DataPrivacyProperties> getDataPrivacy() {
        return this.dataPrivacy;
    }
    @OutputExport(name="description", type=String.class, parameters={})
    private Output</* @Nullable */ String> description;

    public Output</* @Nullable */ String> getDescription() {
        return this.description;
    }
    /**
     * IdleSessionTTLInSeconds of the resource
     * 
     */
    @OutputExport(name="idleSessionTTLInSeconds", type=Integer.class, parameters={})
    private Output<Integer> idleSessionTTLInSeconds;

    /**
     * @return IdleSessionTTLInSeconds of the resource
     * 
     */
    public Output<Integer> getIdleSessionTTLInSeconds() {
        return this.idleSessionTTLInSeconds;
    }
    @OutputExport(name="name", type=String.class, parameters={})
    private Output<String> name;

    public Output<String> getName() {
        return this.name;
    }
    @OutputExport(name="roleArn", type=String.class, parameters={})
    private Output<String> roleArn;

    public Output<String> getRoleArn() {
        return this.roleArn;
    }
    /**
     * A list of tags to add to the test alias for a bot, , which can only be added at bot/bot alias creation.
     * 
     */
    @OutputExport(name="testBotAliasTags", type=List.class, parameters={BotTag.class})
    private Output</* @Nullable */ List<BotTag>> testBotAliasTags;

    /**
     * @return A list of tags to add to the test alias for a bot, , which can only be added at bot/bot alias creation.
     * 
     */
    public Output</* @Nullable */ List<BotTag>> getTestBotAliasTags() {
        return this.testBotAliasTags;
    }

    public interface BuilderApplicator {
        public void apply(BotArgs.Builder a);
    }
    private static io.pulumi.awsnative.lex.BotArgs buildArgs(BuilderApplicator argsBuilder) {
        final var builder = io.pulumi.awsnative.lex.BotArgs.builder();
        argsBuilder.apply(builder);
        return builder.build();
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param argsBuilder A function that configures a passed builder.
     */
    public Bot(String name, BuilderApplicator argsBuilder) {
        this(name, buildArgs(argsBuilder), null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public Bot(String name) {
        this(name, BotArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public Bot(String name, BotArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public Bot(String name, BotArgs args, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("aws-native:lex:Bot", name, args == null ? BotArgs.Empty : args, makeResourceOptions(options, Input.empty()));
    }

    private Bot(String name, Input<String> id, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("aws-native:lex:Bot", name, null, makeResourceOptions(options, id));
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
     * @param options Optional settings to control the behavior of the CustomResource.
     */
    public static Bot get(String name, Input<String> id, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        return new Bot(name, id, options);
    }
}
