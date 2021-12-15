cd ../thirdparty/Fairy-Stockfish-Lib/
cmake -H. -Bbuild -DCMAKE_BUILD_TYPE=Release -DBUILD_TESTING=1
cmake --build build
cd -
