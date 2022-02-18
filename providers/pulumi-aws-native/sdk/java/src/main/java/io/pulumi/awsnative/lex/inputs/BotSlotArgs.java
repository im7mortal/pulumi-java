// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.lex.inputs;

import io.pulumi.awsnative.lex.inputs.BotMultipleValuesSettingArgs;
import io.pulumi.awsnative.lex.inputs.BotObfuscationSettingArgs;
import io.pulumi.awsnative.lex.inputs.BotSlotValueElicitationSettingArgs;
import io.pulumi.core.Input;
import io.pulumi.core.internal.annotations.InputImport;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * A slot is a variable needed to fulfill an intent, where an intent can require zero or more slots.
 * 
 */
public final class BotSlotArgs extends io.pulumi.resources.ResourceArgs {

    public static final BotSlotArgs Empty = new BotSlotArgs();

    @InputImport(name="description")
    private final @Nullable Input<String> description;

    public Input<String> getDescription() {
        return this.description == null ? Input.empty() : this.description;
    }

    @InputImport(name="multipleValuesSetting")
    private final @Nullable Input<BotMultipleValuesSettingArgs> multipleValuesSetting;

    public Input<BotMultipleValuesSettingArgs> getMultipleValuesSetting() {
        return this.multipleValuesSetting == null ? Input.empty() : this.multipleValuesSetting;
    }

    @InputImport(name="name", required=true)
    private final Input<String> name;

    public Input<String> getName() {
        return this.name;
    }

    @InputImport(name="obfuscationSetting")
    private final @Nullable Input<BotObfuscationSettingArgs> obfuscationSetting;

    public Input<BotObfuscationSettingArgs> getObfuscationSetting() {
        return this.obfuscationSetting == null ? Input.empty() : this.obfuscationSetting;
    }

    @InputImport(name="slotTypeName", required=true)
    private final Input<String> slotTypeName;

    public Input<String> getSlotTypeName() {
        return this.slotTypeName;
    }

    @InputImport(name="valueElicitationSetting", required=true)
    private final Input<BotSlotValueElicitationSettingArgs> valueElicitationSetting;

    public Input<BotSlotValueElicitationSettingArgs> getValueElicitationSetting() {
        return this.valueElicitationSetting;
    }

    public BotSlotArgs(
        @Nullable Input<String> description,
        @Nullable Input<BotMultipleValuesSettingArgs> multipleValuesSetting,
        Input<String> name,
        @Nullable Input<BotObfuscationSettingArgs> obfuscationSetting,
        Input<String> slotTypeName,
        Input<BotSlotValueElicitationSettingArgs> valueElicitationSetting) {
        this.description = description;
        this.multipleValuesSetting = multipleValuesSetting;
        this.name = Objects.requireNonNull(name, "expected parameter 'name' to be non-null");
        this.obfuscationSetting = obfuscationSetting;
        this.slotTypeName = Objects.requireNonNull(slotTypeName, "expected parameter 'slotTypeName' to be non-null");
        this.valueElicitationSetting = Objects.requireNonNull(valueElicitationSetting, "expected parameter 'valueElicitationSetting' to be non-null");
    }

    private BotSlotArgs() {
        this.description = Input.empty();
        this.multipleValuesSetting = Input.empty();
        this.name = Input.empty();
        this.obfuscationSetting = Input.empty();
        this.slotTypeName = Input.empty();
        this.valueElicitationSetting = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(BotSlotArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<String> description;
        private @Nullable Input<BotMultipleValuesSettingArgs> multipleValuesSetting;
        private Input<String> name;
        private @Nullable Input<BotObfuscationSettingArgs> obfuscationSetting;
        private Input<String> slotTypeName;
        private Input<BotSlotValueElicitationSettingArgs> valueElicitationSetting;

        public Builder() {
    	      // Empty
        }

        public Builder(BotSlotArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.description = defaults.description;
    	      this.multipleValuesSetting = defaults.multipleValuesSetting;
    	      this.name = defaults.name;
    	      this.obfuscationSetting = defaults.obfuscationSetting;
    	      this.slotTypeName = defaults.slotTypeName;
    	      this.valueElicitationSetting = defaults.valueElicitationSetting;
        }

        public Builder setDescription(@Nullable Input<String> description) {
            this.description = description;
            return this;
        }

        public Builder setDescription(@Nullable String description) {
            this.description = Input.ofNullable(description);
            return this;
        }

        public Builder setMultipleValuesSetting(@Nullable Input<BotMultipleValuesSettingArgs> multipleValuesSetting) {
            this.multipleValuesSetting = multipleValuesSetting;
            return this;
        }

        public Builder setMultipleValuesSetting(@Nullable BotMultipleValuesSettingArgs multipleValuesSetting) {
            this.multipleValuesSetting = Input.ofNullable(multipleValuesSetting);
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

        public Builder setObfuscationSetting(@Nullable Input<BotObfuscationSettingArgs> obfuscationSetting) {
            this.obfuscationSetting = obfuscationSetting;
            return this;
        }

        public Builder setObfuscationSetting(@Nullable BotObfuscationSettingArgs obfuscationSetting) {
            this.obfuscationSetting = Input.ofNullable(obfuscationSetting);
            return this;
        }

        public Builder setSlotTypeName(Input<String> slotTypeName) {
            this.slotTypeName = Objects.requireNonNull(slotTypeName);
            return this;
        }

        public Builder setSlotTypeName(String slotTypeName) {
            this.slotTypeName = Input.of(Objects.requireNonNull(slotTypeName));
            return this;
        }

        public Builder setValueElicitationSetting(Input<BotSlotValueElicitationSettingArgs> valueElicitationSetting) {
            this.valueElicitationSetting = Objects.requireNonNull(valueElicitationSetting);
            return this;
        }

        public Builder setValueElicitationSetting(BotSlotValueElicitationSettingArgs valueElicitationSetting) {
            this.valueElicitationSetting = Input.of(Objects.requireNonNull(valueElicitationSetting));
            return this;
        }

        public BotSlotArgs build() {
            return new BotSlotArgs(description, multipleValuesSetting, name, obfuscationSetting, slotTypeName, valueElicitationSetting);
        }
    }
}
