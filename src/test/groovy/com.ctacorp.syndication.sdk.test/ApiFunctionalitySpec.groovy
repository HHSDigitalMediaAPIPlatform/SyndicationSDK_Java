package com.ctacorp.syndication.sdk.test

import com.ctacorp.syndication.sdk.SyndicationClient
import com.ctacorp.syndication.sdk.exception.InvalidRequestException
import spock.lang.*

class ApiFunctionalitySpec extends Specification {
    SyndicationClient client
    def config

    def setup(){
        config = new ConfigSlurper().parse(new File('conf/testProperties.groovy').toURL())
        client = new SyndicationClient(config.getProperty('syndicationApiUrl'))
    }

    def "getAllMediaTypes should return a list of items"() {
        when: "the getAllMediaTypes method is called"
            def mediaTypes = client.getAllMediaTypes()
        then: "mediaTypes should not be null"
            mediaTypes != null
        and: "there should be at least 1 media type in the list"
            mediaTypes.length > 1
    }

    def "getting all organizations should return a non-empty list of organizations"(){
        when: "getAllOrganizations is called"
            def organizations = client.getAllOrganizations()
        then: "organizations should be not null"
            organizations != null
        and: "it should be larger than 0"
            organizations.length > 0
    }

    def "getting an organization by id should return an organization"(){
        when: "getOrganizationById is called"
            def organization = client.getOrganizationById(id)
        then: "The organization shouldn't be null"
            organization != null
        and: "The organization should have the expected fields"
            organization.abv != null
            organization.name != null
            organization.url != null
            organization.id == id

        where:
            id = 1
    }

    def "getting an organization by an invalid id should throw an exception"(){
        when: "getOrganizationById is called with a bad id"
            def organization = client.getOrganizationById(-1)
        then: "The organization should be null"
            thrown(InvalidRequestException)
        and: "organization should be null"
            organization == null
    }

    def "getting all campaigns should return a non-empty list of campaigns"(){
        when: "getAllCampaigns is called"
            def campaigns = client.getAllCampaigns()
        then: "the campaigns list should be non-null"
            campaigns != null
        and: "there should be at least 1 campaign"
            campaigns.length > 0
    }

    def "getting a campaign by id should return a campaign"(){
        when: "getCampaignById is called"
            def campaign = client.getCampaignById(id)
        then: "The campaign shouldn't be null"
            campaign != null
        and: "the campaign should have the expected fields"
            campaign.id == id
            campaign.name != null
            campaign.description != null
            campaign.startDate != null

        where:
            id = 1
    }

    def "getting a campaign by an invalid id should throw an exception"(){
        when: "getCampaignById is called with a bad id"
            def campaign = client.getCampaignById(-1)
        then: "The organization should be null"
            thrown(InvalidRequestException)
        and: "campaign should be null"
            campaign == null
    }

    def "getting all languages should return a non-empty list of languages"(){
        when: "getAllLanguages is called"
            def languages = client.getAllLanguages()
        then: "languages should be non-null"
            languages != null
        and: "It should have at least 1 item"
            languages.length > 0
    }

    def "getting a language by id should return a language"(){
        when: "getlanguageById is called"
            def language = client.getLanguageById(id)
        then: "The campaign shouldn't be null"
            language != null
        and: "the campaign should have the expected fields"
            language.id == id
            language.name != null
            language.value != null

        where:
            id = 1
    }

    def "getting a language by an invalid id should throw an exception"(){
        when: "getLanguageById is called with a bad id"
            def language = client.getLanguageById(-1)
        then: "The organization should be null"
            thrown(InvalidRequestException)
        and: "language should be null"
            language == null
    }
}