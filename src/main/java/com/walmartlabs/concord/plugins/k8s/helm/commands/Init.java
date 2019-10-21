package com.walmartlabs.concord.plugins.k8s.helm.commands;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.walmartlabs.concord.plugins.tool.Flag;
import com.walmartlabs.concord.plugins.tool.ToolCommandSupport;
import io.airlift.airline.Option;

import javax.inject.Named;
import javax.inject.Singleton;

@Named("helm/init")
public class Init extends ToolCommandSupport {

    @JsonProperty
    @Option(name = {"--service-account"})
    private String serviceAccount;

    @JsonProperty
    @Flag(name = {"--wait"})
    private boolean wait;

    public String serviceAccount() { return serviceAccount; }

    public boolean waitForCompletion() {
        return wait;
    }
}