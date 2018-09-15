package com.pixel;

import org.apache.camel.builder.RouteBuilder;
import org.apache.camel.dataformat.bindy.annotation.DataField;
import org.apache.camel.dataformat.bindy.fixed.BindyFixedLengthDataFormat;
import org.apache.camel.spi.DataFormat;
import org.springframework.stereotype.Component;

@Component
public class FixedFileRoute extends RouteBuilder {
    @Override
    public void configure() throws Exception {

       DataFormat bindy = new BindyFixedLengthDataFormat(EmplPojo.class);

        from("file:data/fixed?fileName=fixedlength.txt&noop=true")
                .unmarshal(bindy)
                .split(body())
                .log("Unmarsheld ${body}")
                .end()
                .to("direct:output");

    }
}
