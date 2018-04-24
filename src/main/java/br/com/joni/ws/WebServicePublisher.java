package br.com.joni.ws;

import javax.xml.ws.Endpoint;

public class WebServicePublisher {

    public static void main(String[] args) {
        Endpoint.publish("http://localhost:8080/ServerSoap/serverSoap", new BuscaPessoaImpl());
    }

}
