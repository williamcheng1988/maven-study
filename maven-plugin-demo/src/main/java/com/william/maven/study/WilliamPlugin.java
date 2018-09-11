package com.william.maven.study;

import javafx.beans.DefaultProperty;
import org.apache.maven.plugin.AbstractMojo;
import org.apache.maven.plugin.MojoExecutionException;
import org.apache.maven.plugin.MojoFailureException;
import org.apache.maven.plugins.annotations.LifecyclePhase;
import org.apache.maven.plugins.annotations.Mojo;
import org.apache.maven.plugins.annotations.Parameter;

@Mojo(name = "william", defaultPhase = LifecyclePhase.PACKAGE)
public class WilliamPlugin extends AbstractMojo {
    @Parameter
    String sex;

    @Parameter
    String describe;

    public void execute() throws MojoExecutionException, MojoFailureException {
        getLog().info(String.format("William's profile is sex=%s describe=%s", sex, describe));
    }
}
