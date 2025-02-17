// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.dlm.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class LifecyclePolicyPolicyDetailsScheduleFastRestoreRule {
    /**
     * @return The Availability Zones in which to enable fast snapshot restore.
     * 
     */
    private List<String> availabilityZones;
    /**
     * @return Specifies the number of oldest AMIs to deprecate. Must be an integer between `1` and `1000`.
     * 
     */
    private @Nullable Integer count;
    /**
     * @return How often this lifecycle policy should be evaluated. `1`, `2`,`3`,`4`,`6`,`8`,`12` or `24` are valid values.
     * 
     */
    private @Nullable Integer interval;
    /**
     * @return The unit for how often the lifecycle policy should be evaluated. `HOURS` is currently the only allowed value and also the default value.
     * 
     */
    private @Nullable String intervalUnit;

    private LifecyclePolicyPolicyDetailsScheduleFastRestoreRule() {}
    /**
     * @return The Availability Zones in which to enable fast snapshot restore.
     * 
     */
    public List<String> availabilityZones() {
        return this.availabilityZones;
    }
    /**
     * @return Specifies the number of oldest AMIs to deprecate. Must be an integer between `1` and `1000`.
     * 
     */
    public Optional<Integer> count() {
        return Optional.ofNullable(this.count);
    }
    /**
     * @return How often this lifecycle policy should be evaluated. `1`, `2`,`3`,`4`,`6`,`8`,`12` or `24` are valid values.
     * 
     */
    public Optional<Integer> interval() {
        return Optional.ofNullable(this.interval);
    }
    /**
     * @return The unit for how often the lifecycle policy should be evaluated. `HOURS` is currently the only allowed value and also the default value.
     * 
     */
    public Optional<String> intervalUnit() {
        return Optional.ofNullable(this.intervalUnit);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(LifecyclePolicyPolicyDetailsScheduleFastRestoreRule defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private List<String> availabilityZones;
        private @Nullable Integer count;
        private @Nullable Integer interval;
        private @Nullable String intervalUnit;
        public Builder() {}
        public Builder(LifecyclePolicyPolicyDetailsScheduleFastRestoreRule defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.availabilityZones = defaults.availabilityZones;
    	      this.count = defaults.count;
    	      this.interval = defaults.interval;
    	      this.intervalUnit = defaults.intervalUnit;
        }

        @CustomType.Setter
        public Builder availabilityZones(List<String> availabilityZones) {
            this.availabilityZones = Objects.requireNonNull(availabilityZones);
            return this;
        }
        public Builder availabilityZones(String... availabilityZones) {
            return availabilityZones(List.of(availabilityZones));
        }
        @CustomType.Setter
        public Builder count(@Nullable Integer count) {
            this.count = count;
            return this;
        }
        @CustomType.Setter
        public Builder interval(@Nullable Integer interval) {
            this.interval = interval;
            return this;
        }
        @CustomType.Setter
        public Builder intervalUnit(@Nullable String intervalUnit) {
            this.intervalUnit = intervalUnit;
            return this;
        }
        public LifecyclePolicyPolicyDetailsScheduleFastRestoreRule build() {
            final var o = new LifecyclePolicyPolicyDetailsScheduleFastRestoreRule();
            o.availabilityZones = availabilityZones;
            o.count = count;
            o.interval = interval;
            o.intervalUnit = intervalUnit;
            return o;
        }
    }
}
