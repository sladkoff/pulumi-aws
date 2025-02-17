// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.kendra.inputs;

import com.pulumi.aws.kendra.inputs.DataSourceConfigurationS3ConfigurationAccessControlListConfigurationArgs;
import com.pulumi.aws.kendra.inputs.DataSourceConfigurationS3ConfigurationDocumentsMetadataConfigurationArgs;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class DataSourceConfigurationS3ConfigurationArgs extends com.pulumi.resources.ResourceArgs {

    public static final DataSourceConfigurationS3ConfigurationArgs Empty = new DataSourceConfigurationS3ConfigurationArgs();

    /**
     * A block that provides the path to the S3 bucket that contains the user context filtering files for the data source. For the format of the file, see [Access control for S3 data sources](https://docs.aws.amazon.com/kendra/latest/dg/s3-acl.html). Detailed below.
     * 
     */
    @Import(name="accessControlListConfiguration")
    private @Nullable Output<DataSourceConfigurationS3ConfigurationAccessControlListConfigurationArgs> accessControlListConfiguration;

    /**
     * @return A block that provides the path to the S3 bucket that contains the user context filtering files for the data source. For the format of the file, see [Access control for S3 data sources](https://docs.aws.amazon.com/kendra/latest/dg/s3-acl.html). Detailed below.
     * 
     */
    public Optional<Output<DataSourceConfigurationS3ConfigurationAccessControlListConfigurationArgs>> accessControlListConfiguration() {
        return Optional.ofNullable(this.accessControlListConfiguration);
    }

    /**
     * The name of the bucket that contains the documents.
     * 
     */
    @Import(name="bucketName", required=true)
    private Output<String> bucketName;

    /**
     * @return The name of the bucket that contains the documents.
     * 
     */
    public Output<String> bucketName() {
        return this.bucketName;
    }

    /**
     * A block that defines the Document metadata files that contain information such as the document access control information, source URI, document author, and custom attributes. Each metadata file contains metadata about a single document. Detailed below.
     * 
     */
    @Import(name="documentsMetadataConfiguration")
    private @Nullable Output<DataSourceConfigurationS3ConfigurationDocumentsMetadataConfigurationArgs> documentsMetadataConfiguration;

    /**
     * @return A block that defines the Document metadata files that contain information such as the document access control information, source URI, document author, and custom attributes. Each metadata file contains metadata about a single document. Detailed below.
     * 
     */
    public Optional<Output<DataSourceConfigurationS3ConfigurationDocumentsMetadataConfigurationArgs>> documentsMetadataConfiguration() {
        return Optional.ofNullable(this.documentsMetadataConfiguration);
    }

    /**
     * A list of glob patterns for documents that should not be indexed. If a document that matches an inclusion prefix or inclusion pattern also matches an exclusion pattern, the document is not indexed. Refer to [Exclusion Patterns for more examples](https://docs.aws.amazon.com/kendra/latest/dg/API_S3DataSourceConfiguration.html#Kendra-Type-S3DataSourceConfiguration-ExclusionPatterns).
     * 
     */
    @Import(name="exclusionPatterns")
    private @Nullable Output<List<String>> exclusionPatterns;

    /**
     * @return A list of glob patterns for documents that should not be indexed. If a document that matches an inclusion prefix or inclusion pattern also matches an exclusion pattern, the document is not indexed. Refer to [Exclusion Patterns for more examples](https://docs.aws.amazon.com/kendra/latest/dg/API_S3DataSourceConfiguration.html#Kendra-Type-S3DataSourceConfiguration-ExclusionPatterns).
     * 
     */
    public Optional<Output<List<String>>> exclusionPatterns() {
        return Optional.ofNullable(this.exclusionPatterns);
    }

    /**
     * A list of glob patterns for documents that should be indexed. If a document that matches an inclusion pattern also matches an exclusion pattern, the document is not indexed. Refer to [Inclusion Patterns for more examples](https://docs.aws.amazon.com/kendra/latest/dg/API_S3DataSourceConfiguration.html#Kendra-Type-S3DataSourceConfiguration-InclusionPatterns).
     * 
     */
    @Import(name="inclusionPatterns")
    private @Nullable Output<List<String>> inclusionPatterns;

    /**
     * @return A list of glob patterns for documents that should be indexed. If a document that matches an inclusion pattern also matches an exclusion pattern, the document is not indexed. Refer to [Inclusion Patterns for more examples](https://docs.aws.amazon.com/kendra/latest/dg/API_S3DataSourceConfiguration.html#Kendra-Type-S3DataSourceConfiguration-InclusionPatterns).
     * 
     */
    public Optional<Output<List<String>>> inclusionPatterns() {
        return Optional.ofNullable(this.inclusionPatterns);
    }

    /**
     * A list of S3 prefixes for the documents that should be included in the index.
     * 
     */
    @Import(name="inclusionPrefixes")
    private @Nullable Output<List<String>> inclusionPrefixes;

    /**
     * @return A list of S3 prefixes for the documents that should be included in the index.
     * 
     */
    public Optional<Output<List<String>>> inclusionPrefixes() {
        return Optional.ofNullable(this.inclusionPrefixes);
    }

    private DataSourceConfigurationS3ConfigurationArgs() {}

    private DataSourceConfigurationS3ConfigurationArgs(DataSourceConfigurationS3ConfigurationArgs $) {
        this.accessControlListConfiguration = $.accessControlListConfiguration;
        this.bucketName = $.bucketName;
        this.documentsMetadataConfiguration = $.documentsMetadataConfiguration;
        this.exclusionPatterns = $.exclusionPatterns;
        this.inclusionPatterns = $.inclusionPatterns;
        this.inclusionPrefixes = $.inclusionPrefixes;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(DataSourceConfigurationS3ConfigurationArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private DataSourceConfigurationS3ConfigurationArgs $;

        public Builder() {
            $ = new DataSourceConfigurationS3ConfigurationArgs();
        }

        public Builder(DataSourceConfigurationS3ConfigurationArgs defaults) {
            $ = new DataSourceConfigurationS3ConfigurationArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param accessControlListConfiguration A block that provides the path to the S3 bucket that contains the user context filtering files for the data source. For the format of the file, see [Access control for S3 data sources](https://docs.aws.amazon.com/kendra/latest/dg/s3-acl.html). Detailed below.
         * 
         * @return builder
         * 
         */
        public Builder accessControlListConfiguration(@Nullable Output<DataSourceConfigurationS3ConfigurationAccessControlListConfigurationArgs> accessControlListConfiguration) {
            $.accessControlListConfiguration = accessControlListConfiguration;
            return this;
        }

        /**
         * @param accessControlListConfiguration A block that provides the path to the S3 bucket that contains the user context filtering files for the data source. For the format of the file, see [Access control for S3 data sources](https://docs.aws.amazon.com/kendra/latest/dg/s3-acl.html). Detailed below.
         * 
         * @return builder
         * 
         */
        public Builder accessControlListConfiguration(DataSourceConfigurationS3ConfigurationAccessControlListConfigurationArgs accessControlListConfiguration) {
            return accessControlListConfiguration(Output.of(accessControlListConfiguration));
        }

        /**
         * @param bucketName The name of the bucket that contains the documents.
         * 
         * @return builder
         * 
         */
        public Builder bucketName(Output<String> bucketName) {
            $.bucketName = bucketName;
            return this;
        }

        /**
         * @param bucketName The name of the bucket that contains the documents.
         * 
         * @return builder
         * 
         */
        public Builder bucketName(String bucketName) {
            return bucketName(Output.of(bucketName));
        }

        /**
         * @param documentsMetadataConfiguration A block that defines the Document metadata files that contain information such as the document access control information, source URI, document author, and custom attributes. Each metadata file contains metadata about a single document. Detailed below.
         * 
         * @return builder
         * 
         */
        public Builder documentsMetadataConfiguration(@Nullable Output<DataSourceConfigurationS3ConfigurationDocumentsMetadataConfigurationArgs> documentsMetadataConfiguration) {
            $.documentsMetadataConfiguration = documentsMetadataConfiguration;
            return this;
        }

        /**
         * @param documentsMetadataConfiguration A block that defines the Document metadata files that contain information such as the document access control information, source URI, document author, and custom attributes. Each metadata file contains metadata about a single document. Detailed below.
         * 
         * @return builder
         * 
         */
        public Builder documentsMetadataConfiguration(DataSourceConfigurationS3ConfigurationDocumentsMetadataConfigurationArgs documentsMetadataConfiguration) {
            return documentsMetadataConfiguration(Output.of(documentsMetadataConfiguration));
        }

        /**
         * @param exclusionPatterns A list of glob patterns for documents that should not be indexed. If a document that matches an inclusion prefix or inclusion pattern also matches an exclusion pattern, the document is not indexed. Refer to [Exclusion Patterns for more examples](https://docs.aws.amazon.com/kendra/latest/dg/API_S3DataSourceConfiguration.html#Kendra-Type-S3DataSourceConfiguration-ExclusionPatterns).
         * 
         * @return builder
         * 
         */
        public Builder exclusionPatterns(@Nullable Output<List<String>> exclusionPatterns) {
            $.exclusionPatterns = exclusionPatterns;
            return this;
        }

        /**
         * @param exclusionPatterns A list of glob patterns for documents that should not be indexed. If a document that matches an inclusion prefix or inclusion pattern also matches an exclusion pattern, the document is not indexed. Refer to [Exclusion Patterns for more examples](https://docs.aws.amazon.com/kendra/latest/dg/API_S3DataSourceConfiguration.html#Kendra-Type-S3DataSourceConfiguration-ExclusionPatterns).
         * 
         * @return builder
         * 
         */
        public Builder exclusionPatterns(List<String> exclusionPatterns) {
            return exclusionPatterns(Output.of(exclusionPatterns));
        }

        /**
         * @param exclusionPatterns A list of glob patterns for documents that should not be indexed. If a document that matches an inclusion prefix or inclusion pattern also matches an exclusion pattern, the document is not indexed. Refer to [Exclusion Patterns for more examples](https://docs.aws.amazon.com/kendra/latest/dg/API_S3DataSourceConfiguration.html#Kendra-Type-S3DataSourceConfiguration-ExclusionPatterns).
         * 
         * @return builder
         * 
         */
        public Builder exclusionPatterns(String... exclusionPatterns) {
            return exclusionPatterns(List.of(exclusionPatterns));
        }

        /**
         * @param inclusionPatterns A list of glob patterns for documents that should be indexed. If a document that matches an inclusion pattern also matches an exclusion pattern, the document is not indexed. Refer to [Inclusion Patterns for more examples](https://docs.aws.amazon.com/kendra/latest/dg/API_S3DataSourceConfiguration.html#Kendra-Type-S3DataSourceConfiguration-InclusionPatterns).
         * 
         * @return builder
         * 
         */
        public Builder inclusionPatterns(@Nullable Output<List<String>> inclusionPatterns) {
            $.inclusionPatterns = inclusionPatterns;
            return this;
        }

        /**
         * @param inclusionPatterns A list of glob patterns for documents that should be indexed. If a document that matches an inclusion pattern also matches an exclusion pattern, the document is not indexed. Refer to [Inclusion Patterns for more examples](https://docs.aws.amazon.com/kendra/latest/dg/API_S3DataSourceConfiguration.html#Kendra-Type-S3DataSourceConfiguration-InclusionPatterns).
         * 
         * @return builder
         * 
         */
        public Builder inclusionPatterns(List<String> inclusionPatterns) {
            return inclusionPatterns(Output.of(inclusionPatterns));
        }

        /**
         * @param inclusionPatterns A list of glob patterns for documents that should be indexed. If a document that matches an inclusion pattern also matches an exclusion pattern, the document is not indexed. Refer to [Inclusion Patterns for more examples](https://docs.aws.amazon.com/kendra/latest/dg/API_S3DataSourceConfiguration.html#Kendra-Type-S3DataSourceConfiguration-InclusionPatterns).
         * 
         * @return builder
         * 
         */
        public Builder inclusionPatterns(String... inclusionPatterns) {
            return inclusionPatterns(List.of(inclusionPatterns));
        }

        /**
         * @param inclusionPrefixes A list of S3 prefixes for the documents that should be included in the index.
         * 
         * @return builder
         * 
         */
        public Builder inclusionPrefixes(@Nullable Output<List<String>> inclusionPrefixes) {
            $.inclusionPrefixes = inclusionPrefixes;
            return this;
        }

        /**
         * @param inclusionPrefixes A list of S3 prefixes for the documents that should be included in the index.
         * 
         * @return builder
         * 
         */
        public Builder inclusionPrefixes(List<String> inclusionPrefixes) {
            return inclusionPrefixes(Output.of(inclusionPrefixes));
        }

        /**
         * @param inclusionPrefixes A list of S3 prefixes for the documents that should be included in the index.
         * 
         * @return builder
         * 
         */
        public Builder inclusionPrefixes(String... inclusionPrefixes) {
            return inclusionPrefixes(List.of(inclusionPrefixes));
        }

        public DataSourceConfigurationS3ConfigurationArgs build() {
            $.bucketName = Objects.requireNonNull($.bucketName, "expected parameter 'bucketName' to be non-null");
            return $;
        }
    }

}
