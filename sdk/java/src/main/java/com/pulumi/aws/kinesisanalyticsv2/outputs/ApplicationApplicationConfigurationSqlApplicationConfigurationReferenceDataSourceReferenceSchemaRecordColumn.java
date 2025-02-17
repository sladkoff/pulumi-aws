// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.kinesisanalyticsv2.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class ApplicationApplicationConfigurationSqlApplicationConfigurationReferenceDataSourceReferenceSchemaRecordColumn {
    /**
     * @return A reference to the data element in the streaming input or the reference data source.
     * 
     */
    private @Nullable String mapping;
    /**
     * @return The name of the column that is created in the in-application input stream or reference table.
     * 
     */
    private String name;
    /**
     * @return The type of column created in the in-application input stream or reference table.
     * 
     */
    private String sqlType;

    private ApplicationApplicationConfigurationSqlApplicationConfigurationReferenceDataSourceReferenceSchemaRecordColumn() {}
    /**
     * @return A reference to the data element in the streaming input or the reference data source.
     * 
     */
    public Optional<String> mapping() {
        return Optional.ofNullable(this.mapping);
    }
    /**
     * @return The name of the column that is created in the in-application input stream or reference table.
     * 
     */
    public String name() {
        return this.name;
    }
    /**
     * @return The type of column created in the in-application input stream or reference table.
     * 
     */
    public String sqlType() {
        return this.sqlType;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ApplicationApplicationConfigurationSqlApplicationConfigurationReferenceDataSourceReferenceSchemaRecordColumn defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable String mapping;
        private String name;
        private String sqlType;
        public Builder() {}
        public Builder(ApplicationApplicationConfigurationSqlApplicationConfigurationReferenceDataSourceReferenceSchemaRecordColumn defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.mapping = defaults.mapping;
    	      this.name = defaults.name;
    	      this.sqlType = defaults.sqlType;
        }

        @CustomType.Setter
        public Builder mapping(@Nullable String mapping) {
            this.mapping = mapping;
            return this;
        }
        @CustomType.Setter
        public Builder name(String name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }
        @CustomType.Setter
        public Builder sqlType(String sqlType) {
            this.sqlType = Objects.requireNonNull(sqlType);
            return this;
        }
        public ApplicationApplicationConfigurationSqlApplicationConfigurationReferenceDataSourceReferenceSchemaRecordColumn build() {
            final var o = new ApplicationApplicationConfigurationSqlApplicationConfigurationReferenceDataSourceReferenceSchemaRecordColumn();
            o.mapping = mapping;
            o.name = name;
            o.sqlType = sqlType;
            return o;
        }
    }
}
