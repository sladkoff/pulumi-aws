// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.fsx.inputs;

import com.pulumi.aws.fsx.inputs.FileCacheDataRepositoryAssociationArgs;
import com.pulumi.aws.fsx.inputs.FileCacheLustreConfigurationArgs;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class FileCacheState extends com.pulumi.resources.ResourceArgs {

    public static final FileCacheState Empty = new FileCacheState();

    /**
     * The Amazon Resource Name (ARN) for the resource.
     * 
     */
    @Import(name="arn")
    private @Nullable Output<String> arn;

    /**
     * @return The Amazon Resource Name (ARN) for the resource.
     * 
     */
    public Optional<Output<String>> arn() {
        return Optional.ofNullable(this.arn);
    }

    /**
     * A boolean flag indicating whether tags for the cache should be copied to data repository associations. This value defaults to false.
     * 
     */
    @Import(name="copyTagsToDataRepositoryAssociations")
    private @Nullable Output<Boolean> copyTagsToDataRepositoryAssociations;

    /**
     * @return A boolean flag indicating whether tags for the cache should be copied to data repository associations. This value defaults to false.
     * 
     */
    public Optional<Output<Boolean>> copyTagsToDataRepositoryAssociations() {
        return Optional.ofNullable(this.copyTagsToDataRepositoryAssociations);
    }

    /**
     * A list of IDs of data repository associations that are associated with this cache.
     * 
     */
    @Import(name="dataRepositoryAssociationIds")
    private @Nullable Output<List<String>> dataRepositoryAssociationIds;

    /**
     * @return A list of IDs of data repository associations that are associated with this cache.
     * 
     */
    public Optional<Output<List<String>>> dataRepositoryAssociationIds() {
        return Optional.ofNullable(this.dataRepositoryAssociationIds);
    }

    /**
     * See the `data_repository_association` configuration block. Max of 8.
     * A list of up to 8 configurations for data repository associations (DRAs) to be created during the cache creation. The DRAs link the cache to either an Amazon S3 data repository or a Network File System (NFS) data repository that supports the NFSv3 protocol. The DRA configurations must meet the following requirements: 1) All configurations on the list must be of the same data repository type, either all S3 or all NFS. A cache can&#39;t link to different data repository types at the same time. 2) An NFS DRA must link to an NFS file system that supports the NFSv3 protocol. DRA automatic import and automatic export is not supported.
     * 
     */
    @Import(name="dataRepositoryAssociations")
    private @Nullable Output<List<FileCacheDataRepositoryAssociationArgs>> dataRepositoryAssociations;

    /**
     * @return See the `data_repository_association` configuration block. Max of 8.
     * A list of up to 8 configurations for data repository associations (DRAs) to be created during the cache creation. The DRAs link the cache to either an Amazon S3 data repository or a Network File System (NFS) data repository that supports the NFSv3 protocol. The DRA configurations must meet the following requirements: 1) All configurations on the list must be of the same data repository type, either all S3 or all NFS. A cache can&#39;t link to different data repository types at the same time. 2) An NFS DRA must link to an NFS file system that supports the NFSv3 protocol. DRA automatic import and automatic export is not supported.
     * 
     */
    public Optional<Output<List<FileCacheDataRepositoryAssociationArgs>>> dataRepositoryAssociations() {
        return Optional.ofNullable(this.dataRepositoryAssociations);
    }

    /**
     * The Domain Name System (DNS) name for the cache.
     * 
     */
    @Import(name="dnsName")
    private @Nullable Output<String> dnsName;

    /**
     * @return The Domain Name System (DNS) name for the cache.
     * 
     */
    public Optional<Output<String>> dnsName() {
        return Optional.ofNullable(this.dnsName);
    }

    /**
     * The system-generated, unique ID of the cache.
     * 
     */
    @Import(name="fileCacheId")
    private @Nullable Output<String> fileCacheId;

    /**
     * @return The system-generated, unique ID of the cache.
     * 
     */
    public Optional<Output<String>> fileCacheId() {
        return Optional.ofNullable(this.fileCacheId);
    }

    /**
     * The type of cache that you&#39;re creating. The only supported value is `LUSTRE`.
     * 
     */
    @Import(name="fileCacheType")
    private @Nullable Output<String> fileCacheType;

    /**
     * @return The type of cache that you&#39;re creating. The only supported value is `LUSTRE`.
     * 
     */
    public Optional<Output<String>> fileCacheType() {
        return Optional.ofNullable(this.fileCacheType);
    }

    /**
     * The version for the type of cache that you&#39;re creating. The only supported value is `2.12`.
     * 
     */
    @Import(name="fileCacheTypeVersion")
    private @Nullable Output<String> fileCacheTypeVersion;

    /**
     * @return The version for the type of cache that you&#39;re creating. The only supported value is `2.12`.
     * 
     */
    public Optional<Output<String>> fileCacheTypeVersion() {
        return Optional.ofNullable(this.fileCacheTypeVersion);
    }

    /**
     * Specifies the ID of the AWS Key Management Service (AWS KMS) key to use for encrypting data on an Amazon File Cache. If a KmsKeyId isn&#39;t specified, the Amazon FSx-managed AWS KMS key for your account is used.
     * 
     */
    @Import(name="kmsKeyId")
    private @Nullable Output<String> kmsKeyId;

    /**
     * @return Specifies the ID of the AWS Key Management Service (AWS KMS) key to use for encrypting data on an Amazon File Cache. If a KmsKeyId isn&#39;t specified, the Amazon FSx-managed AWS KMS key for your account is used.
     * 
     */
    public Optional<Output<String>> kmsKeyId() {
        return Optional.ofNullable(this.kmsKeyId);
    }

    /**
     * See the `lustre_configuration` block. Required when `file_cache_type` is `LUSTRE`.
     * 
     */
    @Import(name="lustreConfigurations")
    private @Nullable Output<List<FileCacheLustreConfigurationArgs>> lustreConfigurations;

    /**
     * @return See the `lustre_configuration` block. Required when `file_cache_type` is `LUSTRE`.
     * 
     */
    public Optional<Output<List<FileCacheLustreConfigurationArgs>>> lustreConfigurations() {
        return Optional.ofNullable(this.lustreConfigurations);
    }

    /**
     * A list of network interface IDs.
     * 
     */
    @Import(name="networkInterfaceIds")
    private @Nullable Output<List<String>> networkInterfaceIds;

    /**
     * @return A list of network interface IDs.
     * 
     */
    public Optional<Output<List<String>>> networkInterfaceIds() {
        return Optional.ofNullable(this.networkInterfaceIds);
    }

    @Import(name="ownerId")
    private @Nullable Output<String> ownerId;

    public Optional<Output<String>> ownerId() {
        return Optional.ofNullable(this.ownerId);
    }

    /**
     * A list of IDs specifying the security groups to apply to all network interfaces created for Amazon File Cache access.
     * 
     */
    @Import(name="securityGroupIds")
    private @Nullable Output<List<String>> securityGroupIds;

    /**
     * @return A list of IDs specifying the security groups to apply to all network interfaces created for Amazon File Cache access.
     * 
     */
    public Optional<Output<List<String>>> securityGroupIds() {
        return Optional.ofNullable(this.securityGroupIds);
    }

    /**
     * The storage capacity of the cache in gibibytes (GiB). Valid values are `1200` GiB, `2400` GiB, and increments of `2400` GiB.
     * 
     */
    @Import(name="storageCapacity")
    private @Nullable Output<Integer> storageCapacity;

    /**
     * @return The storage capacity of the cache in gibibytes (GiB). Valid values are `1200` GiB, `2400` GiB, and increments of `2400` GiB.
     * 
     */
    public Optional<Output<Integer>> storageCapacity() {
        return Optional.ofNullable(this.storageCapacity);
    }

    /**
     * A list of subnet IDs that the cache will be accessible from. You can specify only one subnet ID.
     * 
     */
    @Import(name="subnetIds")
    private @Nullable Output<List<String>> subnetIds;

    /**
     * @return A list of subnet IDs that the cache will be accessible from. You can specify only one subnet ID.
     * 
     */
    public Optional<Output<List<String>>> subnetIds() {
        return Optional.ofNullable(this.subnetIds);
    }

    /**
     * A map of tags to assign to the file cache. If configured with a provider `default_tags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
     * 
     */
    @Import(name="tags")
    private @Nullable Output<Map<String,String>> tags;

    /**
     * @return A map of tags to assign to the file cache. If configured with a provider `default_tags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
     * 
     */
    public Optional<Output<Map<String,String>>> tags() {
        return Optional.ofNullable(this.tags);
    }

    @Import(name="tagsAll")
    private @Nullable Output<Map<String,String>> tagsAll;

    public Optional<Output<Map<String,String>>> tagsAll() {
        return Optional.ofNullable(this.tagsAll);
    }

    /**
     * The ID of your virtual private cloud (VPC).
     * 
     */
    @Import(name="vpcId")
    private @Nullable Output<String> vpcId;

    /**
     * @return The ID of your virtual private cloud (VPC).
     * 
     */
    public Optional<Output<String>> vpcId() {
        return Optional.ofNullable(this.vpcId);
    }

    private FileCacheState() {}

    private FileCacheState(FileCacheState $) {
        this.arn = $.arn;
        this.copyTagsToDataRepositoryAssociations = $.copyTagsToDataRepositoryAssociations;
        this.dataRepositoryAssociationIds = $.dataRepositoryAssociationIds;
        this.dataRepositoryAssociations = $.dataRepositoryAssociations;
        this.dnsName = $.dnsName;
        this.fileCacheId = $.fileCacheId;
        this.fileCacheType = $.fileCacheType;
        this.fileCacheTypeVersion = $.fileCacheTypeVersion;
        this.kmsKeyId = $.kmsKeyId;
        this.lustreConfigurations = $.lustreConfigurations;
        this.networkInterfaceIds = $.networkInterfaceIds;
        this.ownerId = $.ownerId;
        this.securityGroupIds = $.securityGroupIds;
        this.storageCapacity = $.storageCapacity;
        this.subnetIds = $.subnetIds;
        this.tags = $.tags;
        this.tagsAll = $.tagsAll;
        this.vpcId = $.vpcId;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(FileCacheState defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private FileCacheState $;

        public Builder() {
            $ = new FileCacheState();
        }

        public Builder(FileCacheState defaults) {
            $ = new FileCacheState(Objects.requireNonNull(defaults));
        }

        /**
         * @param arn The Amazon Resource Name (ARN) for the resource.
         * 
         * @return builder
         * 
         */
        public Builder arn(@Nullable Output<String> arn) {
            $.arn = arn;
            return this;
        }

        /**
         * @param arn The Amazon Resource Name (ARN) for the resource.
         * 
         * @return builder
         * 
         */
        public Builder arn(String arn) {
            return arn(Output.of(arn));
        }

        /**
         * @param copyTagsToDataRepositoryAssociations A boolean flag indicating whether tags for the cache should be copied to data repository associations. This value defaults to false.
         * 
         * @return builder
         * 
         */
        public Builder copyTagsToDataRepositoryAssociations(@Nullable Output<Boolean> copyTagsToDataRepositoryAssociations) {
            $.copyTagsToDataRepositoryAssociations = copyTagsToDataRepositoryAssociations;
            return this;
        }

        /**
         * @param copyTagsToDataRepositoryAssociations A boolean flag indicating whether tags for the cache should be copied to data repository associations. This value defaults to false.
         * 
         * @return builder
         * 
         */
        public Builder copyTagsToDataRepositoryAssociations(Boolean copyTagsToDataRepositoryAssociations) {
            return copyTagsToDataRepositoryAssociations(Output.of(copyTagsToDataRepositoryAssociations));
        }

        /**
         * @param dataRepositoryAssociationIds A list of IDs of data repository associations that are associated with this cache.
         * 
         * @return builder
         * 
         */
        public Builder dataRepositoryAssociationIds(@Nullable Output<List<String>> dataRepositoryAssociationIds) {
            $.dataRepositoryAssociationIds = dataRepositoryAssociationIds;
            return this;
        }

        /**
         * @param dataRepositoryAssociationIds A list of IDs of data repository associations that are associated with this cache.
         * 
         * @return builder
         * 
         */
        public Builder dataRepositoryAssociationIds(List<String> dataRepositoryAssociationIds) {
            return dataRepositoryAssociationIds(Output.of(dataRepositoryAssociationIds));
        }

        /**
         * @param dataRepositoryAssociationIds A list of IDs of data repository associations that are associated with this cache.
         * 
         * @return builder
         * 
         */
        public Builder dataRepositoryAssociationIds(String... dataRepositoryAssociationIds) {
            return dataRepositoryAssociationIds(List.of(dataRepositoryAssociationIds));
        }

        /**
         * @param dataRepositoryAssociations See the `data_repository_association` configuration block. Max of 8.
         * A list of up to 8 configurations for data repository associations (DRAs) to be created during the cache creation. The DRAs link the cache to either an Amazon S3 data repository or a Network File System (NFS) data repository that supports the NFSv3 protocol. The DRA configurations must meet the following requirements: 1) All configurations on the list must be of the same data repository type, either all S3 or all NFS. A cache can&#39;t link to different data repository types at the same time. 2) An NFS DRA must link to an NFS file system that supports the NFSv3 protocol. DRA automatic import and automatic export is not supported.
         * 
         * @return builder
         * 
         */
        public Builder dataRepositoryAssociations(@Nullable Output<List<FileCacheDataRepositoryAssociationArgs>> dataRepositoryAssociations) {
            $.dataRepositoryAssociations = dataRepositoryAssociations;
            return this;
        }

        /**
         * @param dataRepositoryAssociations See the `data_repository_association` configuration block. Max of 8.
         * A list of up to 8 configurations for data repository associations (DRAs) to be created during the cache creation. The DRAs link the cache to either an Amazon S3 data repository or a Network File System (NFS) data repository that supports the NFSv3 protocol. The DRA configurations must meet the following requirements: 1) All configurations on the list must be of the same data repository type, either all S3 or all NFS. A cache can&#39;t link to different data repository types at the same time. 2) An NFS DRA must link to an NFS file system that supports the NFSv3 protocol. DRA automatic import and automatic export is not supported.
         * 
         * @return builder
         * 
         */
        public Builder dataRepositoryAssociations(List<FileCacheDataRepositoryAssociationArgs> dataRepositoryAssociations) {
            return dataRepositoryAssociations(Output.of(dataRepositoryAssociations));
        }

        /**
         * @param dataRepositoryAssociations See the `data_repository_association` configuration block. Max of 8.
         * A list of up to 8 configurations for data repository associations (DRAs) to be created during the cache creation. The DRAs link the cache to either an Amazon S3 data repository or a Network File System (NFS) data repository that supports the NFSv3 protocol. The DRA configurations must meet the following requirements: 1) All configurations on the list must be of the same data repository type, either all S3 or all NFS. A cache can&#39;t link to different data repository types at the same time. 2) An NFS DRA must link to an NFS file system that supports the NFSv3 protocol. DRA automatic import and automatic export is not supported.
         * 
         * @return builder
         * 
         */
        public Builder dataRepositoryAssociations(FileCacheDataRepositoryAssociationArgs... dataRepositoryAssociations) {
            return dataRepositoryAssociations(List.of(dataRepositoryAssociations));
        }

        /**
         * @param dnsName The Domain Name System (DNS) name for the cache.
         * 
         * @return builder
         * 
         */
        public Builder dnsName(@Nullable Output<String> dnsName) {
            $.dnsName = dnsName;
            return this;
        }

        /**
         * @param dnsName The Domain Name System (DNS) name for the cache.
         * 
         * @return builder
         * 
         */
        public Builder dnsName(String dnsName) {
            return dnsName(Output.of(dnsName));
        }

        /**
         * @param fileCacheId The system-generated, unique ID of the cache.
         * 
         * @return builder
         * 
         */
        public Builder fileCacheId(@Nullable Output<String> fileCacheId) {
            $.fileCacheId = fileCacheId;
            return this;
        }

        /**
         * @param fileCacheId The system-generated, unique ID of the cache.
         * 
         * @return builder
         * 
         */
        public Builder fileCacheId(String fileCacheId) {
            return fileCacheId(Output.of(fileCacheId));
        }

        /**
         * @param fileCacheType The type of cache that you&#39;re creating. The only supported value is `LUSTRE`.
         * 
         * @return builder
         * 
         */
        public Builder fileCacheType(@Nullable Output<String> fileCacheType) {
            $.fileCacheType = fileCacheType;
            return this;
        }

        /**
         * @param fileCacheType The type of cache that you&#39;re creating. The only supported value is `LUSTRE`.
         * 
         * @return builder
         * 
         */
        public Builder fileCacheType(String fileCacheType) {
            return fileCacheType(Output.of(fileCacheType));
        }

        /**
         * @param fileCacheTypeVersion The version for the type of cache that you&#39;re creating. The only supported value is `2.12`.
         * 
         * @return builder
         * 
         */
        public Builder fileCacheTypeVersion(@Nullable Output<String> fileCacheTypeVersion) {
            $.fileCacheTypeVersion = fileCacheTypeVersion;
            return this;
        }

        /**
         * @param fileCacheTypeVersion The version for the type of cache that you&#39;re creating. The only supported value is `2.12`.
         * 
         * @return builder
         * 
         */
        public Builder fileCacheTypeVersion(String fileCacheTypeVersion) {
            return fileCacheTypeVersion(Output.of(fileCacheTypeVersion));
        }

        /**
         * @param kmsKeyId Specifies the ID of the AWS Key Management Service (AWS KMS) key to use for encrypting data on an Amazon File Cache. If a KmsKeyId isn&#39;t specified, the Amazon FSx-managed AWS KMS key for your account is used.
         * 
         * @return builder
         * 
         */
        public Builder kmsKeyId(@Nullable Output<String> kmsKeyId) {
            $.kmsKeyId = kmsKeyId;
            return this;
        }

        /**
         * @param kmsKeyId Specifies the ID of the AWS Key Management Service (AWS KMS) key to use for encrypting data on an Amazon File Cache. If a KmsKeyId isn&#39;t specified, the Amazon FSx-managed AWS KMS key for your account is used.
         * 
         * @return builder
         * 
         */
        public Builder kmsKeyId(String kmsKeyId) {
            return kmsKeyId(Output.of(kmsKeyId));
        }

        /**
         * @param lustreConfigurations See the `lustre_configuration` block. Required when `file_cache_type` is `LUSTRE`.
         * 
         * @return builder
         * 
         */
        public Builder lustreConfigurations(@Nullable Output<List<FileCacheLustreConfigurationArgs>> lustreConfigurations) {
            $.lustreConfigurations = lustreConfigurations;
            return this;
        }

        /**
         * @param lustreConfigurations See the `lustre_configuration` block. Required when `file_cache_type` is `LUSTRE`.
         * 
         * @return builder
         * 
         */
        public Builder lustreConfigurations(List<FileCacheLustreConfigurationArgs> lustreConfigurations) {
            return lustreConfigurations(Output.of(lustreConfigurations));
        }

        /**
         * @param lustreConfigurations See the `lustre_configuration` block. Required when `file_cache_type` is `LUSTRE`.
         * 
         * @return builder
         * 
         */
        public Builder lustreConfigurations(FileCacheLustreConfigurationArgs... lustreConfigurations) {
            return lustreConfigurations(List.of(lustreConfigurations));
        }

        /**
         * @param networkInterfaceIds A list of network interface IDs.
         * 
         * @return builder
         * 
         */
        public Builder networkInterfaceIds(@Nullable Output<List<String>> networkInterfaceIds) {
            $.networkInterfaceIds = networkInterfaceIds;
            return this;
        }

        /**
         * @param networkInterfaceIds A list of network interface IDs.
         * 
         * @return builder
         * 
         */
        public Builder networkInterfaceIds(List<String> networkInterfaceIds) {
            return networkInterfaceIds(Output.of(networkInterfaceIds));
        }

        /**
         * @param networkInterfaceIds A list of network interface IDs.
         * 
         * @return builder
         * 
         */
        public Builder networkInterfaceIds(String... networkInterfaceIds) {
            return networkInterfaceIds(List.of(networkInterfaceIds));
        }

        public Builder ownerId(@Nullable Output<String> ownerId) {
            $.ownerId = ownerId;
            return this;
        }

        public Builder ownerId(String ownerId) {
            return ownerId(Output.of(ownerId));
        }

        /**
         * @param securityGroupIds A list of IDs specifying the security groups to apply to all network interfaces created for Amazon File Cache access.
         * 
         * @return builder
         * 
         */
        public Builder securityGroupIds(@Nullable Output<List<String>> securityGroupIds) {
            $.securityGroupIds = securityGroupIds;
            return this;
        }

        /**
         * @param securityGroupIds A list of IDs specifying the security groups to apply to all network interfaces created for Amazon File Cache access.
         * 
         * @return builder
         * 
         */
        public Builder securityGroupIds(List<String> securityGroupIds) {
            return securityGroupIds(Output.of(securityGroupIds));
        }

        /**
         * @param securityGroupIds A list of IDs specifying the security groups to apply to all network interfaces created for Amazon File Cache access.
         * 
         * @return builder
         * 
         */
        public Builder securityGroupIds(String... securityGroupIds) {
            return securityGroupIds(List.of(securityGroupIds));
        }

        /**
         * @param storageCapacity The storage capacity of the cache in gibibytes (GiB). Valid values are `1200` GiB, `2400` GiB, and increments of `2400` GiB.
         * 
         * @return builder
         * 
         */
        public Builder storageCapacity(@Nullable Output<Integer> storageCapacity) {
            $.storageCapacity = storageCapacity;
            return this;
        }

        /**
         * @param storageCapacity The storage capacity of the cache in gibibytes (GiB). Valid values are `1200` GiB, `2400` GiB, and increments of `2400` GiB.
         * 
         * @return builder
         * 
         */
        public Builder storageCapacity(Integer storageCapacity) {
            return storageCapacity(Output.of(storageCapacity));
        }

        /**
         * @param subnetIds A list of subnet IDs that the cache will be accessible from. You can specify only one subnet ID.
         * 
         * @return builder
         * 
         */
        public Builder subnetIds(@Nullable Output<List<String>> subnetIds) {
            $.subnetIds = subnetIds;
            return this;
        }

        /**
         * @param subnetIds A list of subnet IDs that the cache will be accessible from. You can specify only one subnet ID.
         * 
         * @return builder
         * 
         */
        public Builder subnetIds(List<String> subnetIds) {
            return subnetIds(Output.of(subnetIds));
        }

        /**
         * @param subnetIds A list of subnet IDs that the cache will be accessible from. You can specify only one subnet ID.
         * 
         * @return builder
         * 
         */
        public Builder subnetIds(String... subnetIds) {
            return subnetIds(List.of(subnetIds));
        }

        /**
         * @param tags A map of tags to assign to the file cache. If configured with a provider `default_tags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
         * 
         * @return builder
         * 
         */
        public Builder tags(@Nullable Output<Map<String,String>> tags) {
            $.tags = tags;
            return this;
        }

        /**
         * @param tags A map of tags to assign to the file cache. If configured with a provider `default_tags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
         * 
         * @return builder
         * 
         */
        public Builder tags(Map<String,String> tags) {
            return tags(Output.of(tags));
        }

        public Builder tagsAll(@Nullable Output<Map<String,String>> tagsAll) {
            $.tagsAll = tagsAll;
            return this;
        }

        public Builder tagsAll(Map<String,String> tagsAll) {
            return tagsAll(Output.of(tagsAll));
        }

        /**
         * @param vpcId The ID of your virtual private cloud (VPC).
         * 
         * @return builder
         * 
         */
        public Builder vpcId(@Nullable Output<String> vpcId) {
            $.vpcId = vpcId;
            return this;
        }

        /**
         * @param vpcId The ID of your virtual private cloud (VPC).
         * 
         * @return builder
         * 
         */
        public Builder vpcId(String vpcId) {
            return vpcId(Output.of(vpcId));
        }

        public FileCacheState build() {
            return $;
        }
    }

}
