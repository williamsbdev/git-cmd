package com.tw.go.plugin.cmd;

import java.util.List;

public class ConsoleResult {
    private int exitCode;
    private List<String> stdOut;
    private List<String> stdErr;

    public ConsoleResult(int exitCode, List<String> stdOut, List<String> stdErr) {
        this.exitCode = exitCode;
        this.stdOut = stdOut;
        this.stdErr = stdErr;
    }

    public int exitCode() {
        return exitCode;
    }

    public List<String> stdOut() {
        return stdOut;
    }

    public List<String> stdErr() {
        return stdErr;
    }
}
