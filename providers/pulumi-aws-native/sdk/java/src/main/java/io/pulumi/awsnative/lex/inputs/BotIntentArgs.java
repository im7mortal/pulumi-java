// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.lex.inputs;

import io.pulumi.awsnative.lex.inputs.BotDialogCodeHookSettingArgs;
import io.pulumi.awsnative.lex.inputs.BotFulfillmentCodeHookSettingArgs;
import io.pulumi.awsnative.lex.inputs.BotInputContextArgs;
import io.pulumi.awsnative.lex.inputs.BotIntentClosingSettingArgs;
import io.pulumi.awsnative.lex.inputs.BotIntentConfirmationSettingArgs;
import io.pulumi.awsnative.lex.inputs.BotKendraConfigurationArgs;
import io.pulumi.awsnative.lex.inputs.BotOutputContextArgs;
import io.pulumi.awsnative.lex.inputs.BotSampleUtteranceArgs;
import io.pulumi.awsnative.lex.inputs.BotSlotArgs;
import io.pulumi.awsnative.lex.inputs.BotSlotPriorityArgs;
import io.pulumi.core.Input;
import io.pulumi.core.internal.annotations.InputImport;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * An intent represents an action that the user wants to perform. You create a bot to support one or more related intents.
 * 
 */
public final class BotIntentArgs extends io.pulumi.resources.ResourceArgs {

    public static final BotIntentArgs Empty = new BotIntentArgs();

    @InputImport(name="description")
    private final @Nullable Input<String> description;

    public Input<String> getDescription() {
        return this.description == null ? Input.empty() : this.description;
    }

    @InputImport(name="dialogCodeHook")
    private final @Nullable Input<BotDialogCodeHookSettingArgs> dialogCodeHook;

    public Input<BotDialogCodeHookSettingArgs> getDialogCodeHook() {
        return this.dialogCodeHook == null ? Input.empty() : this.dialogCodeHook;
    }

    @InputImport(name="fulfillmentCodeHook")
    private final @Nullable Input<BotFulfillmentCodeHookSettingArgs> fulfillmentCodeHook;

    public Input<BotFulfillmentCodeHookSettingArgs> getFulfillmentCodeHook() {
        return this.fulfillmentCodeHook == null ? Input.empty() : this.fulfillmentCodeHook;
    }

    @InputImport(name="inputContexts")
    private final @Nullable Input<List<BotInputContextArgs>> inputContexts;

    public Input<List<BotInputContextArgs>> getInputContexts() {
        return this.inputContexts == null ? Input.empty() : this.inputContexts;
    }

    @InputImport(name="intentClosingSetting")
    private final @Nullable Input<BotIntentClosingSettingArgs> intentClosingSetting;

    public Input<BotIntentClosingSettingArgs> getIntentClosingSetting() {
        return this.intentClosingSetting == null ? Input.empty() : this.intentClosingSetting;
    }

    @InputImport(name="intentConfirmationSetting")
    private final @Nullable Input<BotIntentConfirmationSettingArgs> intentConfirmationSetting;

    public Input<BotIntentConfirmationSettingArgs> getIntentConfirmationSetting() {
        return this.intentConfirmationSetting == null ? Input.empty() : this.intentConfirmationSetting;
    }

    @InputImport(name="kendraConfiguration")
    private final @Nullable Input<BotKendraConfigurationArgs> kendraConfiguration;

    public Input<BotKendraConfigurationArgs> getKendraConfiguration() {
        return this.kendraConfiguration == null ? Input.empty() : this.kendraConfiguration;
    }

    @InputImport(name="name", required=true)
    private final Input<String> name;

    public Input<String> getName() {
        return this.name;
    }

    @InputImport(name="outputContexts")
    private final @Nullable Input<List<BotOutputContextArgs>> outputContexts;

    public Input<List<BotOutputContextArgs>> getOutputContexts() {
        return this.outputContexts == null ? Input.empty() : this.outputContexts;
    }

    @InputImport(name="parentIntentSignature")
    private final @Nullable Input<String> parentIntentSignature;

    public Input<String> getParentIntentSignature() {
        return this.parentIntentSignature == null ? Input.empty() : this.parentIntentSignature;
    }

    @InputImport(name="sampleUtterances")
    private final @Nullable Input<List<BotSampleUtteranceArgs>> sampleUtterances;

    public Input<List<BotSampleUtteranceArgs>> getSampleUtterances() {
        return this.sampleUtterances == null ? Input.empty() : this.sampleUtterances;
    }

    @InputImport(name="slotPriorities")
    private final @Nullable Input<List<BotSlotPriorityArgs>> slotPriorities;

    public Input<List<BotSlotPriorityArgs>> getSlotPriorities() {
        return this.slotPriorities == null ? Input.empty() : this.slotPriorities;
    }

    /**
     * List of slots
     * 
     */
    @InputImport(name="slots")
    private final @Nullable Input<List<BotSlotArgs>> slots;

    public Input<List<BotSlotArgs>> getSlots() {
        return this.slots == null ? Input.empty() : this.slots;
    }

    public BotIntentArgs(
        @Nullable Input<String> description,
        @Nullable Input<BotDialogCodeHookSettingArgs> dialogCodeHook,
        @Nullable Input<BotFulfillmentCodeHookSettingArgs> fulfillmentCodeHook,
        @Nullable Input<List<BotInputContextArgs>> inputContexts,
        @Nullable Input<BotIntentClosingSettingArgs> intentClosingSetting,
        @Nullable Input<BotIntentConfirmationSettingArgs> intentConfirmationSetting,
        @Nullable Input<BotKendraConfigurationArgs> kendraConfiguration,
        Input<String> name,
        @Nullable Input<List<BotOutputContextArgs>> outputContexts,
        @Nullable Input<String> parentIntentSignature,
        @Nullable Input<List<BotSampleUtteranceArgs>> sampleUtterances,
        @Nullable Input<List<BotSlotPriorityArgs>> slotPriorities,
        @Nullable Input<List<BotSlotArgs>> slots) {
        this.description = description;
        this.dialogCodeHook = dialogCodeHook;
        this.fulfillmentCodeHook = fulfillmentCodeHook;
        this.inputContexts = inputContexts;
        this.intentClosingSetting = intentClosingSetting;
        this.intentConfirmationSetting = intentConfirmationSetting;
        this.kendraConfiguration = kendraConfiguration;
        this.name = Objects.requireNonNull(name, "expected parameter 'name' to be non-null");
        this.outputContexts = outputContexts;
        this.parentIntentSignature = parentIntentSignature;
        this.sampleUtterances = sampleUtterances;
        this.slotPriorities = slotPriorities;
        this.slots = slots;
    }

    private BotIntentArgs() {
        this.description = Input.empty();
        this.dialogCodeHook = Input.empty();
        this.fulfillmentCodeHook = Input.empty();
        this.inputContexts = Input.empty();
        this.intentClosingSetting = Input.empty();
        this.intentConfirmationSetting = Input.empty();
        this.kendraConfiguration = Input.empty();
        this.name = Input.empty();
        this.outputContexts = Input.empty();
        this.parentIntentSignature = Input.empty();
        this.sampleUtterances = Input.empty();
        this.slotPriorities = Input.empty();
        this.slots = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(BotIntentArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<String> description;
        private @Nullable Input<BotDialogCodeHookSettingArgs> dialogCodeHook;
        private @Nullable Input<BotFulfillmentCodeHookSettingArgs> fulfillmentCodeHook;
        private @Nullable Input<List<BotInputContextArgs>> inputContexts;
        private @Nullable Input<BotIntentClosingSettingArgs> intentClosingSetting;
        private @Nullable Input<BotIntentConfirmationSettingArgs> intentConfirmationSetting;
        private @Nullable Input<BotKendraConfigurationArgs> kendraConfiguration;
        private Input<String> name;
        private @Nullable Input<List<BotOutputContextArgs>> outputContexts;
        private @Nullable Input<String> parentIntentSignature;
        private @Nullable Input<List<BotSampleUtteranceArgs>> sampleUtterances;
        private @Nullable Input<List<BotSlotPriorityArgs>> slotPriorities;
        private @Nullable Input<List<BotSlotArgs>> slots;

        public Builder() {
    	      // Empty
        }

        public Builder(BotIntentArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.description = defaults.description;
    	      this.dialogCodeHook = defaults.dialogCodeHook;
    	      this.fulfillmentCodeHook = defaults.fulfillmentCodeHook;
    	      this.inputContexts = defaults.inputContexts;
    	      this.intentClosingSetting = defaults.intentClosingSetting;
    	      this.intentConfirmationSetting = defaults.intentConfirmationSetting;
    	      this.kendraConfiguration = defaults.kendraConfiguration;
    	      this.name = defaults.name;
    	      this.outputContexts = defaults.outputContexts;
    	      this.parentIntentSignature = defaults.parentIntentSignature;
    	      this.sampleUtterances = defaults.sampleUtterances;
    	      this.slotPriorities = defaults.slotPriorities;
    	      this.slots = defaults.slots;
        }

        public Builder setDescription(@Nullable Input<String> description) {
            this.description = description;
            return this;
        }

        public Builder setDescription(@Nullable String description) {
            this.description = Input.ofNullable(description);
            return this;
        }

        public Builder setDialogCodeHook(@Nullable Input<BotDialogCodeHookSettingArgs> dialogCodeHook) {
            this.dialogCodeHook = dialogCodeHook;
            return this;
        }

        public Builder setDialogCodeHook(@Nullable BotDialogCodeHookSettingArgs dialogCodeHook) {
            this.dialogCodeHook = Input.ofNullable(dialogCodeHook);
            return this;
        }

        public Builder setFulfillmentCodeHook(@Nullable Input<BotFulfillmentCodeHookSettingArgs> fulfillmentCodeHook) {
            this.fulfillmentCodeHook = fulfillmentCodeHook;
            return this;
        }

        public Builder setFulfillmentCodeHook(@Nullable BotFulfillmentCodeHookSettingArgs fulfillmentCodeHook) {
            this.fulfillmentCodeHook = Input.ofNullable(fulfillmentCodeHook);
            return this;
        }

        public Builder setInputContexts(@Nullable Input<List<BotInputContextArgs>> inputContexts) {
            this.inputContexts = inputContexts;
            return this;
        }

        public Builder setInputContexts(@Nullable List<BotInputContextArgs> inputContexts) {
            this.inputContexts = Input.ofNullable(inputContexts);
            return this;
        }

        public Builder setIntentClosingSetting(@Nullable Input<BotIntentClosingSettingArgs> intentClosingSetting) {
            this.intentClosingSetting = intentClosingSetting;
            return this;
        }

        public Builder setIntentClosingSetting(@Nullable BotIntentClosingSettingArgs intentClosingSetting) {
            this.intentClosingSetting = Input.ofNullable(intentClosingSetting);
            return this;
        }

        public Builder setIntentConfirmationSetting(@Nullable Input<BotIntentConfirmationSettingArgs> intentConfirmationSetting) {
            this.intentConfirmationSetting = intentConfirmationSetting;
            return this;
        }

        public Builder setIntentConfirmationSetting(@Nullable BotIntentConfirmationSettingArgs intentConfirmationSetting) {
            this.intentConfirmationSetting = Input.ofNullable(intentConfirmationSetting);
            return this;
        }

        public Builder setKendraConfiguration(@Nullable Input<BotKendraConfigurationArgs> kendraConfiguration) {
            this.kendraConfiguration = kendraConfiguration;
            return this;
        }

        public Builder setKendraConfiguration(@Nullable BotKendraConfigurationArgs kendraConfiguration) {
            this.kendraConfiguration = Input.ofNullable(kendraConfiguration);
            return this;
        }

        public Builder setName(Input<String> name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }

        public Builder setName(String name) {
            this.name = Input.of(Objects.requireNonNull(name));
            return this;
        }

        public Builder setOutputContexts(@Nullable Input<List<BotOutputContextArgs>> outputContexts) {
            this.outputContexts = outputContexts;
            return this;
        }

        public Builder setOutputContexts(@Nullable List<BotOutputContextArgs> outputContexts) {
            this.outputContexts = Input.ofNullable(outputContexts);
            return this;
        }

        public Builder setParentIntentSignature(@Nullable Input<String> parentIntentSignature) {
            this.parentIntentSignature = parentIntentSignature;
            return this;
        }

        public Builder setParentIntentSignature(@Nullable String parentIntentSignature) {
            this.parentIntentSignature = Input.ofNullable(parentIntentSignature);
            return this;
        }

        public Builder setSampleUtterances(@Nullable Input<List<BotSampleUtteranceArgs>> sampleUtterances) {
            this.sampleUtterances = sampleUtterances;
            return this;
        }

        public Builder setSampleUtterances(@Nullable List<BotSampleUtteranceArgs> sampleUtterances) {
            this.sampleUtterances = Input.ofNullable(sampleUtterances);
            return this;
        }

        public Builder setSlotPriorities(@Nullable Input<List<BotSlotPriorityArgs>> slotPriorities) {
            this.slotPriorities = slotPriorities;
            return this;
        }

        public Builder setSlotPriorities(@Nullable List<BotSlotPriorityArgs> slotPriorities) {
            this.slotPriorities = Input.ofNullable(slotPriorities);
            return this;
        }

        public Builder setSlots(@Nullable Input<List<BotSlotArgs>> slots) {
            this.slots = slots;
            return this;
        }

        public Builder setSlots(@Nullable List<BotSlotArgs> slots) {
            this.slots = Input.ofNullable(slots);
            return this;
        }

        public BotIntentArgs build() {
            return new BotIntentArgs(description, dialogCodeHook, fulfillmentCodeHook, inputContexts, intentClosingSetting, intentConfirmationSetting, kendraConfiguration, name, outputContexts, parentIntentSignature, sampleUtterances, slotPriorities, slots);
        }
    }
}
