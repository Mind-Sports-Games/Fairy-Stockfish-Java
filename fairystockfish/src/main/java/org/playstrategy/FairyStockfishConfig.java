package org.playstrategy;

import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;
import org.bytedeco.javacpp.tools.*;

@Properties(value = @Platform(compiler = "cpp17", include = { "fairystockfish.h" }, link = {
		"fairystockfish" }), target = "org.playstrategy.FairyStockfish")
public class FairyStockfishConfig implements InfoMapper {
	public void map(InfoMap infoMap) {
		infoMap.put(new Info("fairystockfish::PieceInfo").pointerTypes("PieceInfo").define());
		infoMap.put(new Info("fairystockfish::Piece").pointerTypes("Piece").define());
		infoMap.put(new Info("fairystockfish::Square").valueTypes("Square").enumerate());
		infoMap.put(new Info("std::map<std::string,fairystockfish::PieceInfo>").pointerTypes("PieceInfoMap").define());
		infoMap.put(new Info("std::map<std::string,fairystockfish::Piece>").pointerTypes("PieceMapUci").define());
		infoMap.put(
				new Info("std::map<fairystockfish::Square,fairystockfish::Piece>").pointerTypes("PieceMap").define());
		infoMap.put(new Info("std::map<fairystockfish::Square,bool>").pointerTypes("WallMap").define());
		infoMap.put(new Info("std::tuple<bool,int>").pointerTypes("BoolIntPair").define());
		infoMap.put(new Info("std::tuple<bool,bool>").pointerTypes("BoolBoolPair").define());
		infoMap.put(new Info("std::vector<std::string>").pointerTypes("VectorOfStrings").define());
		infoMap.put(new Info("std::vector<fairystockfish::Piece>").pointerTypes("VectorOfPieces").define());
		infoMap.put(
				new Info("std::uint8_t").cast().valueTypes("byte").pointerTypes("BytePointer", "ByteBuffer", "byte[]"));
	}
}
