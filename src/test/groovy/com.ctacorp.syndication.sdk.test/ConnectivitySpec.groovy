package com.ctacorp.syndication.sdk.test

import com.ctacorp.syndication.sdk.SyndicationClient
import spock.lang.*

class ConnectivitySpec extends Specification {
    SyndicationClient client
    def config

    def setup(){
        config = new ConfigSlurper().parse(new File('conf/testProperties.groovy').toURL())
        client = new SyndicationClient(config.getProperty('syndicationApiUrl'))
    }

    def "the client should be able to see the outside world"() {
        when: "an outside world address"
            String url = "http://www.example.com"
        then: "the client should be able to connect to it"
            client.ping(url) == true
    }

    def "the client should be able to see the syndication api"() {
        when: "the address to a syndication api"
            String url = config.syndicationApiUrl + "/resources/media.json"
        then: "the client should be able to connect to it"
            client.ping(url) == true
    }
}