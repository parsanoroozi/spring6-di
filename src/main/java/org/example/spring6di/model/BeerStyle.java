package org.example.spring6di.model;

import lombok.AllArgsConstructor;

@AllArgsConstructor
public enum BeerStyle {

    PALE_ALE("PALE_ALE"),
    ALE("ALE"),
    IPA("IPA");

    private String value;


}
