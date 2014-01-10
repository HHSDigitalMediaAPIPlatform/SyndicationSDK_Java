package com.ctacorp.syndication.sdk.test

import com.ctacorp.syndication.sdk.SyndicationClient
import spock.lang.*

class ApiAvailabilitySpec extends Specification {
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
            mediaTypes.size() > 1
            println mediaTypes
    }
}