package org.playstrategy;

import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;
import org.bytedeco.javacpp.tools.*;

@Properties(
    value = @Platform(
        compiler = "cpp17",
        include = {"fairystockfish.h"},
        link = {"fairystockfish"}
    ),
    target = "FairyStockfish"
)
public class FairyStockfishConfig implements InfoMapper {
    public void map(InfoMap infoMap) {
    }
}
