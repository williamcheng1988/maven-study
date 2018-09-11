package com.william.maven.study;

import org.apache.maven.plugin.AbstractMojo;
import org.apache.maven.plugin.MojoExecutionException;
import org.apache.maven.plugin.MojoFailureException;

/**
 * User: William Cheng
 * Create Time: 2018/8/19 14:37
 * Description:
 * @goal my
 * @phase compile
 */
public class MyMojo extends AbstractMojo {

    public void execute() throws MojoExecutionException, MojoFailureException {
        getLog().info(String.format("my plugin test..."));
    }
}