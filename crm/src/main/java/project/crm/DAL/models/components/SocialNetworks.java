package project.crm.DAL.models.components;

import jakarta.persistence.Column;
import jakarta.persistence.Embeddable;

@Embeddable
public class SocialNetworks {

    public SocialNetworks(String facebookLink, String twitterLink, String linkedinLink, String instagramLink) {
        this.facebookLink = facebookLink;
        this.twitterLink = twitterLink;
        this.linkedinLink = linkedinLink;
        this.instagramLink = instagramLink;
    }

    @Column(name = "facebook_link")
    private String facebookLink;

    @Column(name = "twitter_link")
    private String twitterLink;

    @Column(name = "linkedin_link")
    private String linkedinLink;

    @Column(name = "instagram_link")
    private String instagramLink;

    public String getFacebookLink() {
        return facebookLink;
    }

    public void setFacebookLink(String facebookLink) {
        this.facebookLink = facebookLink;
    }

    public String getTwitterLink() {
        return twitterLink;
    }

    public void setTwitterLink(String twitterLink) {
        this.twitterLink = twitterLink;
    }

    public String getLinkedinLink() {
        return linkedinLink;
    }

    public void setLinkedinLink(String linkedinLink) {
        this.linkedinLink = linkedinLink;
    }

    public String getInstagramLink() {
        return instagramLink;
    }

    public void setInstagramLink(String instagramLink) {
        this.instagramLink = instagramLink;
    }
}