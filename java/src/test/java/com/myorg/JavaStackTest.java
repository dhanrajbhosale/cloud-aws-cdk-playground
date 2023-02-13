package com.myorg;

import software.amazon.awscdk.App;
import software.amazon.awscdk.assertions.Template;
import software.amazon.awscdk.assertions.Match;
import java.io.IOException;

import java.util.HashMap;

import org.junit.jupiter.api.Test;

public class JavaStackTest {

    @Test
    public void testStack() throws IOException {
        App app = new App();
        JavaStack stack = new JavaStack(app, "test");

        Template template = Template.fromStack(stack);

        template.hasResourceProperties("AWS::SQS::Queue", new HashMap<String, Number>() {{
          put("VisibilityTimeout", 300);
        }});

        template.resourceCountIs("AWS::SNS::Topic", 1);
    }
}
