package org.playstrategy;

import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;
import org.bytedeco.javacpp.tools.*;

@Properties(
    value = @Platform(
        includepath = {"/home/lakin/work/mso/Fairy-Stockfish-Java/thirdparty/Fairy-Stockfish-Lib/src/", "/home/lakin/work/mso/Fairy-Stockfish-Java/thirdparty/Fairy-Stockfish-Lib/vendor/Fairy-Stockfish/src/"},
        linkpath = {"/home/lakin/work/mso/Fairy-Stockfish-Java/thirdparty/Fairy-Stockfish-Lib/build/"},
        include = {"fairystockfish.h"},
        link = {"fairystockfish"}
    ),
    target = "FairyStockfish"
)
public class FairyStockfishConfig implements InfoMapper {
    public void map(InfoMap infoMap) {
    }
}
