// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.fis.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class ExperimentTemplateActionParameter {
    /**
     * @return Parameter name.
     * 
     */
    private String key;
    /**
     * @return Parameter value.
     * 
     */
    private String value;

    private ExperimentTemplateActionParameter() {}
    /**
     * @return Parameter name.
     * 
     */
    public String key() {
        return this.key;
    }
    /**
     * @return Parameter value.
     * 
     */
    public String value() {
        return this.value;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ExperimentTemplateActionParameter defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private String key;
        private String value;
        public Builder() {}
        public Builder(ExperimentTemplateActionParameter defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.key = defaults.key;
    	      this.value = defaults.value;
        }

        @CustomType.Setter
        public Builder key(String key) {
            this.key = Objects.requireNonNull(key);
            return this;
        }
        @CustomType.Setter
        public Builder value(String value) {
            this.value = Objects.requireNonNull(value);
            return this;
        }
        public ExperimentTemplateActionParameter build() {
            final var o = new ExperimentTemplateActionParameter();
            o.key = key;
            o.value = value;
            return o;
        }
    }
}
