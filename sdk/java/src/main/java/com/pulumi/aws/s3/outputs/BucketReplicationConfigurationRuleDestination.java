// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.s3.outputs;

import com.pulumi.aws.s3.outputs.BucketReplicationConfigurationRuleDestinationAccessControlTranslation;
import com.pulumi.aws.s3.outputs.BucketReplicationConfigurationRuleDestinationMetrics;
import com.pulumi.aws.s3.outputs.BucketReplicationConfigurationRuleDestinationReplicationTime;
import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class BucketReplicationConfigurationRuleDestination {
    /**
     * @return Specifies the overrides to use for object owners on replication. Must be used in conjunction with `account_id` owner override configuration.
     * 
     */
    private @Nullable BucketReplicationConfigurationRuleDestinationAccessControlTranslation accessControlTranslation;
    /**
     * @return The Account ID to use for overriding the object owner on replication. Must be used in conjunction with `access_control_translation` override configuration.
     * 
     */
    private @Nullable String accountId;
    /**
     * @return The ARN of the S3 bucket where you want Amazon S3 to store replicas of the object identified by the rule.
     * 
     */
    private String bucket;
    /**
     * @return Enables replication metrics (required for S3 RTC) (documented below).
     * 
     */
    private @Nullable BucketReplicationConfigurationRuleDestinationMetrics metrics;
    /**
     * @return Destination KMS encryption key ARN for SSE-KMS replication. Must be used in conjunction with
     * `sse_kms_encrypted_objects` source selection criteria.
     * 
     */
    private @Nullable String replicaKmsKeyId;
    /**
     * @return Enables S3 Replication Time Control (S3 RTC) (documented below).
     * 
     */
    private @Nullable BucketReplicationConfigurationRuleDestinationReplicationTime replicationTime;
    /**
     * @return The [storage class](https://docs.aws.amazon.com/AmazonS3/latest/API/API_Destination.html#AmazonS3-Type-Destination-StorageClass) used to store the object. By default, Amazon S3 uses the storage class of the source object to create the object replica.
     * 
     */
    private @Nullable String storageClass;

    private BucketReplicationConfigurationRuleDestination() {}
    /**
     * @return Specifies the overrides to use for object owners on replication. Must be used in conjunction with `account_id` owner override configuration.
     * 
     */
    public Optional<BucketReplicationConfigurationRuleDestinationAccessControlTranslation> accessControlTranslation() {
        return Optional.ofNullable(this.accessControlTranslation);
    }
    /**
     * @return The Account ID to use for overriding the object owner on replication. Must be used in conjunction with `access_control_translation` override configuration.
     * 
     */
    public Optional<String> accountId() {
        return Optional.ofNullable(this.accountId);
    }
    /**
     * @return The ARN of the S3 bucket where you want Amazon S3 to store replicas of the object identified by the rule.
     * 
     */
    public String bucket() {
        return this.bucket;
    }
    /**
     * @return Enables replication metrics (required for S3 RTC) (documented below).
     * 
     */
    public Optional<BucketReplicationConfigurationRuleDestinationMetrics> metrics() {
        return Optional.ofNullable(this.metrics);
    }
    /**
     * @return Destination KMS encryption key ARN for SSE-KMS replication. Must be used in conjunction with
     * `sse_kms_encrypted_objects` source selection criteria.
     * 
     */
    public Optional<String> replicaKmsKeyId() {
        return Optional.ofNullable(this.replicaKmsKeyId);
    }
    /**
     * @return Enables S3 Replication Time Control (S3 RTC) (documented below).
     * 
     */
    public Optional<BucketReplicationConfigurationRuleDestinationReplicationTime> replicationTime() {
        return Optional.ofNullable(this.replicationTime);
    }
    /**
     * @return The [storage class](https://docs.aws.amazon.com/AmazonS3/latest/API/API_Destination.html#AmazonS3-Type-Destination-StorageClass) used to store the object. By default, Amazon S3 uses the storage class of the source object to create the object replica.
     * 
     */
    public Optional<String> storageClass() {
        return Optional.ofNullable(this.storageClass);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(BucketReplicationConfigurationRuleDestination defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable BucketReplicationConfigurationRuleDestinationAccessControlTranslation accessControlTranslation;
        private @Nullable String accountId;
        private String bucket;
        private @Nullable BucketReplicationConfigurationRuleDestinationMetrics metrics;
        private @Nullable String replicaKmsKeyId;
        private @Nullable BucketReplicationConfigurationRuleDestinationReplicationTime replicationTime;
        private @Nullable String storageClass;
        public Builder() {}
        public Builder(BucketReplicationConfigurationRuleDestination defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.accessControlTranslation = defaults.accessControlTranslation;
    	      this.accountId = defaults.accountId;
    	      this.bucket = defaults.bucket;
    	      this.metrics = defaults.metrics;
    	      this.replicaKmsKeyId = defaults.replicaKmsKeyId;
    	      this.replicationTime = defaults.replicationTime;
    	      this.storageClass = defaults.storageClass;
        }

        @CustomType.Setter
        public Builder accessControlTranslation(@Nullable BucketReplicationConfigurationRuleDestinationAccessControlTranslation accessControlTranslation) {
            this.accessControlTranslation = accessControlTranslation;
            return this;
        }
        @CustomType.Setter
        public Builder accountId(@Nullable String accountId) {
            this.accountId = accountId;
            return this;
        }
        @CustomType.Setter
        public Builder bucket(String bucket) {
            this.bucket = Objects.requireNonNull(bucket);
            return this;
        }
        @CustomType.Setter
        public Builder metrics(@Nullable BucketReplicationConfigurationRuleDestinationMetrics metrics) {
            this.metrics = metrics;
            return this;
        }
        @CustomType.Setter
        public Builder replicaKmsKeyId(@Nullable String replicaKmsKeyId) {
            this.replicaKmsKeyId = replicaKmsKeyId;
            return this;
        }
        @CustomType.Setter
        public Builder replicationTime(@Nullable BucketReplicationConfigurationRuleDestinationReplicationTime replicationTime) {
            this.replicationTime = replicationTime;
            return this;
        }
        @CustomType.Setter
        public Builder storageClass(@Nullable String storageClass) {
            this.storageClass = storageClass;
            return this;
        }
        public BucketReplicationConfigurationRuleDestination build() {
            final var o = new BucketReplicationConfigurationRuleDestination();
            o.accessControlTranslation = accessControlTranslation;
            o.accountId = accountId;
            o.bucket = bucket;
            o.metrics = metrics;
            o.replicaKmsKeyId = replicaKmsKeyId;
            o.replicationTime = replicationTime;
            o.storageClass = storageClass;
            return o;
        }
    }
}
