package org.example.redis;

import lombok.Getter;
import lombok.Setter;

import java.math.BigDecimal;

public class Language {
    private String language;
    private Boolean isOfficial;
    private BigDecimal percentage;

    //Getters and Setters omitted

    public void setLanguage(String language) {
        this.language = language;
    }

    public void setOfficial(Boolean official) {
        this.isOfficial = official;
    }

    public void setPercentage(BigDecimal percentage) {
        this.percentage = percentage;
    }

    public String getLanguage() {
        return language;
    }

    public Boolean getOfficial() {
        return isOfficial;
    }

    public BigDecimal getPercentage() {
        return percentage;
    }
}
