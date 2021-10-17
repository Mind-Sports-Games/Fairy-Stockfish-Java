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
    target = "org.playstrategy.FairyStockfish"
)
public class FairyStockfishConfig implements InfoMapper {
    public void map(InfoMap infoMap) {
        infoMap.put(new Info("fairystockfish::PieceInfo").pointerTypes("PieceInfo").define());
        infoMap.put(new Info("std::map<std::string,fairystockfish::PieceInfo>").pointerTypes("PieceInfoMap").define());
        infoMap.put(new Info("std::vector<std::string>").pointerTypes("VectorOfStrings").define());
    }
}
