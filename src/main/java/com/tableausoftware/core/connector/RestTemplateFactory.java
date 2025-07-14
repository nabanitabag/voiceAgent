package com.tableausoftware.core.connector;

import org.apache.hc.client5.http.classic.HttpClient;
import org.apache.hc.client5.http.impl.classic.HttpClients;
import org.apache.hc.client5.http.impl.io.PoolingHttpClientConnectionManagerBuilder;
import org.apache.hc.client5.http.io.HttpClientConnectionManager;
import org.apache.hc.client5.http.ssl.SSLConnectionSocketFactory;
import org.apache.hc.core5.ssl.SSLContextBuilder;
import org.apache.hc.core5.ssl.TrustStrategy;
import org.springframework.http.client.HttpComponentsClientHttpRequestFactory;
import org.springframework.web.client.RestTemplate;

import javax.net.ssl.SSLContext;
import java.security.cert.X509Certificate;

public class RestTemplateFactory {
    public static RestTemplate create() {
        try {
            // Create a trust strategy that trusts all certificates
            TrustStrategy trustAll = (X509Certificate[] chain, String authType) -> true;

            // Build SSL context with the trust strategy
            SSLContext sslContext = SSLContextBuilder.create()
                    .loadTrustMaterial(null, trustAll)
                    .build();

            // Create SSL socket factory
            SSLConnectionSocketFactory socketFactory = new SSLConnectionSocketFactory(sslContext);

            // Create connection manager with the SSL socket factory
            HttpClientConnectionManager connectionManager = PoolingHttpClientConnectionManagerBuilder.create()
                    .setSSLSocketFactory(socketFactory)
                    .build();

            // Build the HttpClient with the connection manager
            HttpClient httpClient = HttpClients.custom()
                    .setConnectionManager(connectionManager)
                    .build();

            // Create a custom HttpComponentsClientHttpRequestFactory for HttpClient 5
            HttpComponentsClientHttpRequestFactory factory = new HttpComponentsClientHttpRequestFactory(httpClient);

            return new RestTemplate(factory);
        } catch (Exception e) {
            throw new RuntimeException("Error creating RestTemplate", e);
        }
    }
}
