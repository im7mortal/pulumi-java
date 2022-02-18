// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.iotevents.inputs;

import io.pulumi.awsnative.iotevents.inputs.DetectorModelPayloadArgs;
import io.pulumi.core.Input;
import io.pulumi.core.internal.annotations.InputImport;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * Writes to the DynamoDB table that you created. The default action payload contains all attribute-value pairs that have the information about the detector model instance and the event that triggered the action. You can also customize the [payload](https://docs.aws.amazon.com/iotevents/latest/apireference/API_Payload.html). One column of the DynamoDB table receives all attribute-value pairs in the payload that you specify. For more information, see [Actions](https://docs.aws.amazon.com/iotevents/latest/developerguide/iotevents-event-actions.html) in *AWS IoT Events Developer Guide*.
 * 
 */
public final class DetectorModelDynamoDBArgs extends io.pulumi.resources.ResourceArgs {

    public static final DetectorModelDynamoDBArgs Empty = new DetectorModelDynamoDBArgs();

    /**
     * The name of the hash key (also called the partition key).
     * 
     */
    @InputImport(name="hashKeyField", required=true)
    private final Input<String> hashKeyField;

    public Input<String> getHashKeyField() {
        return this.hashKeyField;
    }

    /**
     * The data type for the hash key (also called the partition key). You can specify the following values:
     * 
     * * `STRING` - The hash key is a string.
     * 
     * * `NUMBER` - The hash key is a number.
     * 
     * If you don't specify `hashKeyType`, the default value is `STRING`.
     * 
     */
    @InputImport(name="hashKeyType")
    private final @Nullable Input<String> hashKeyType;

    public Input<String> getHashKeyType() {
        return this.hashKeyType == null ? Input.empty() : this.hashKeyType;
    }

    /**
     * The value of the hash key (also called the partition key).
     * 
     */
    @InputImport(name="hashKeyValue", required=true)
    private final Input<String> hashKeyValue;

    public Input<String> getHashKeyValue() {
        return this.hashKeyValue;
    }

    /**
     * The type of operation to perform. You can specify the following values:
     * 
     * * `INSERT` - Insert data as a new item into the DynamoDB table. This item uses the specified hash key as a partition key. If you specified a range key, the item uses the range key as a sort key.
     * 
     * * `UPDATE` - Update an existing item of the DynamoDB table with new data. This item's partition key must match the specified hash key. If you specified a range key, the range key must match the item's sort key.
     * 
     * * `DELETE` - Delete an existing item of the DynamoDB table. This item's partition key must match the specified hash key. If you specified a range key, the range key must match the item's sort key.
     * 
     * If you don't specify this parameter, AWS IoT Events triggers the `INSERT` operation.
     * 
     */
    @InputImport(name="operation")
    private final @Nullable Input<String> operation;

    public Input<String> getOperation() {
        return this.operation == null ? Input.empty() : this.operation;
    }

    @InputImport(name="payload")
    private final @Nullable Input<DetectorModelPayloadArgs> payload;

    public Input<DetectorModelPayloadArgs> getPayload() {
        return this.payload == null ? Input.empty() : this.payload;
    }

    /**
     * The name of the DynamoDB column that receives the action payload.
     * 
     * If you don't specify this parameter, the name of the DynamoDB column is `payload`.
     * 
     */
    @InputImport(name="payloadField")
    private final @Nullable Input<String> payloadField;

    public Input<String> getPayloadField() {
        return this.payloadField == null ? Input.empty() : this.payloadField;
    }

    /**
     * The name of the range key (also called the sort key).
     * 
     */
    @InputImport(name="rangeKeyField")
    private final @Nullable Input<String> rangeKeyField;

    public Input<String> getRangeKeyField() {
        return this.rangeKeyField == null ? Input.empty() : this.rangeKeyField;
    }

    /**
     * The data type for the range key (also called the sort key), You can specify the following values:
     * 
     * * `STRING` - The range key is a string.
     * 
     * * `NUMBER` - The range key is number.
     * 
     * If you don't specify `rangeKeyField`, the default value is `STRING`.
     * 
     */
    @InputImport(name="rangeKeyType")
    private final @Nullable Input<String> rangeKeyType;

    public Input<String> getRangeKeyType() {
        return this.rangeKeyType == null ? Input.empty() : this.rangeKeyType;
    }

    /**
     * The value of the range key (also called the sort key).
     * 
     */
    @InputImport(name="rangeKeyValue")
    private final @Nullable Input<String> rangeKeyValue;

    public Input<String> getRangeKeyValue() {
        return this.rangeKeyValue == null ? Input.empty() : this.rangeKeyValue;
    }

    /**
     * The name of the DynamoDB table.
     * 
     */
    @InputImport(name="tableName", required=true)
    private final Input<String> tableName;

    public Input<String> getTableName() {
        return this.tableName;
    }

    public DetectorModelDynamoDBArgs(
        Input<String> hashKeyField,
        @Nullable Input<String> hashKeyType,
        Input<String> hashKeyValue,
        @Nullable Input<String> operation,
        @Nullable Input<DetectorModelPayloadArgs> payload,
        @Nullable Input<String> payloadField,
        @Nullable Input<String> rangeKeyField,
        @Nullable Input<String> rangeKeyType,
        @Nullable Input<String> rangeKeyValue,
        Input<String> tableName) {
        this.hashKeyField = Objects.requireNonNull(hashKeyField, "expected parameter 'hashKeyField' to be non-null");
        this.hashKeyType = hashKeyType;
        this.hashKeyValue = Objects.requireNonNull(hashKeyValue, "expected parameter 'hashKeyValue' to be non-null");
        this.operation = operation;
        this.payload = payload;
        this.payloadField = payloadField;
        this.rangeKeyField = rangeKeyField;
        this.rangeKeyType = rangeKeyType;
        this.rangeKeyValue = rangeKeyValue;
        this.tableName = Objects.requireNonNull(tableName, "expected parameter 'tableName' to be non-null");
    }

    private DetectorModelDynamoDBArgs() {
        this.hashKeyField = Input.empty();
        this.hashKeyType = Input.empty();
        this.hashKeyValue = Input.empty();
        this.operation = Input.empty();
        this.payload = Input.empty();
        this.payloadField = Input.empty();
        this.rangeKeyField = Input.empty();
        this.rangeKeyType = Input.empty();
        this.rangeKeyValue = Input.empty();
        this.tableName = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(DetectorModelDynamoDBArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Input<String> hashKeyField;
        private @Nullable Input<String> hashKeyType;
        private Input<String> hashKeyValue;
        private @Nullable Input<String> operation;
        private @Nullable Input<DetectorModelPayloadArgs> payload;
        private @Nullable Input<String> payloadField;
        private @Nullable Input<String> rangeKeyField;
        private @Nullable Input<String> rangeKeyType;
        private @Nullable Input<String> rangeKeyValue;
        private Input<String> tableName;

        public Builder() {
    	      // Empty
        }

        public Builder(DetectorModelDynamoDBArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.hashKeyField = defaults.hashKeyField;
    	      this.hashKeyType = defaults.hashKeyType;
    	      this.hashKeyValue = defaults.hashKeyValue;
    	      this.operation = defaults.operation;
    	      this.payload = defaults.payload;
    	      this.payloadField = defaults.payloadField;
    	      this.rangeKeyField = defaults.rangeKeyField;
    	      this.rangeKeyType = defaults.rangeKeyType;
    	      this.rangeKeyValue = defaults.rangeKeyValue;
    	      this.tableName = defaults.tableName;
        }

        public Builder setHashKeyField(Input<String> hashKeyField) {
            this.hashKeyField = Objects.requireNonNull(hashKeyField);
            return this;
        }

        public Builder setHashKeyField(String hashKeyField) {
            this.hashKeyField = Input.of(Objects.requireNonNull(hashKeyField));
            return this;
        }

        public Builder setHashKeyType(@Nullable Input<String> hashKeyType) {
            this.hashKeyType = hashKeyType;
            return this;
        }

        public Builder setHashKeyType(@Nullable String hashKeyType) {
            this.hashKeyType = Input.ofNullable(hashKeyType);
            return this;
        }

        public Builder setHashKeyValue(Input<String> hashKeyValue) {
            this.hashKeyValue = Objects.requireNonNull(hashKeyValue);
            return this;
        }

        public Builder setHashKeyValue(String hashKeyValue) {
            this.hashKeyValue = Input.of(Objects.requireNonNull(hashKeyValue));
            return this;
        }

        public Builder setOperation(@Nullable Input<String> operation) {
            this.operation = operation;
            return this;
        }

        public Builder setOperation(@Nullable String operation) {
            this.operation = Input.ofNullable(operation);
            return this;
        }

        public Builder setPayload(@Nullable Input<DetectorModelPayloadArgs> payload) {
            this.payload = payload;
            return this;
        }

        public Builder setPayload(@Nullable DetectorModelPayloadArgs payload) {
            this.payload = Input.ofNullable(payload);
            return this;
        }

        public Builder setPayloadField(@Nullable Input<String> payloadField) {
            this.payloadField = payloadField;
            return this;
        }

        public Builder setPayloadField(@Nullable String payloadField) {
            this.payloadField = Input.ofNullable(payloadField);
            return this;
        }

        public Builder setRangeKeyField(@Nullable Input<String> rangeKeyField) {
            this.rangeKeyField = rangeKeyField;
            return this;
        }

        public Builder setRangeKeyField(@Nullable String rangeKeyField) {
            this.rangeKeyField = Input.ofNullable(rangeKeyField);
            return this;
        }

        public Builder setRangeKeyType(@Nullable Input<String> rangeKeyType) {
            this.rangeKeyType = rangeKeyType;
            return this;
        }

        public Builder setRangeKeyType(@Nullable String rangeKeyType) {
            this.rangeKeyType = Input.ofNullable(rangeKeyType);
            return this;
        }

        public Builder setRangeKeyValue(@Nullable Input<String> rangeKeyValue) {
            this.rangeKeyValue = rangeKeyValue;
            return this;
        }

        public Builder setRangeKeyValue(@Nullable String rangeKeyValue) {
            this.rangeKeyValue = Input.ofNullable(rangeKeyValue);
            return this;
        }

        public Builder setTableName(Input<String> tableName) {
            this.tableName = Objects.requireNonNull(tableName);
            return this;
        }

        public Builder setTableName(String tableName) {
            this.tableName = Input.of(Objects.requireNonNull(tableName));
            return this;
        }

        public DetectorModelDynamoDBArgs build() {
            return new DetectorModelDynamoDBArgs(hashKeyField, hashKeyType, hashKeyValue, operation, payload, payloadField, rangeKeyField, rangeKeyType, rangeKeyValue, tableName);
        }
    }
}
