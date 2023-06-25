package com.midnightsun.productservice.service.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;
import org.springframework.data.annotation.ReadOnlyProperty;

import java.io.Serializable;
import java.time.Instant;

//TODO: Fix that thing!
@Data
public abstract class AbstractAuditingDTO implements Serializable {

    private static final long serialVersionUID = 1L;

    @ReadOnlyProperty
    @JsonProperty(access = JsonProperty.Access.READ_ONLY)
    private String createdBy;

    @ReadOnlyProperty
    @JsonProperty(access = JsonProperty.Access.READ_ONLY)
    private Instant createdDate;

    @ReadOnlyProperty
    @JsonProperty(access = JsonProperty.Access.READ_ONLY)
    private String lastModifiedBy;

    @ReadOnlyProperty
    @JsonProperty(access = JsonProperty.Access.READ_ONLY)
    private Instant lastModifiedDate;
}
