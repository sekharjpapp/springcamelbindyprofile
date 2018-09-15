package com.pixel;

import org.apache.camel.builder.RouteBuilder;
import org.apache.camel.dataformat.bindy.fixed.BindyFixedLengthDataFormat;
import org.apache.camel.spi.DataFormat;
import org.springframework.stereotype.Component;

@Component
public class TfileRoute extends RouteBuilder {

    DataFormat bindy1 = new BindyFixedLengthDataFormat(TfilePojo.class);
    @Override
    public void configure() throws Exception {
        from("file:data/fixed?fileName=tfile1.txt&noop=true")
                .unmarshal(bindy1)
                .split(body())
                .log("Unmarsheld tfile is ${body}")
                .end()
                .to("direct:output");

    }
}
