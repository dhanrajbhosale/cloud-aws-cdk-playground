package com.myorg;

import software.amazon.awscdk.App;

public final class JavaApp {
    public static void main(final String[] args) {
        App app = new App();

        new JavaStack(app, "JavaStack");

        app.synth();
    }
}
