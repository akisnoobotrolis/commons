package com.municipal.reporter.commons.events.issue;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class PhotoData {

    @JsonProperty("dataType")
    private String dataType;

    @JsonProperty("base64")
    private String base64;

    public String dataType() {
        return dataType;
    }

    public String base64() {
        return base64;
    }
}
