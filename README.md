Checkout this repo
==================
```
git clone --recursive <this-repo>
```

Build C++ library
=================
Note, you'll need a working C++ compiler for this. In Ubuntu this is:
```
sudo apt install build-essential
```

Then you can build fairy-stockfish and the wrapper library. 

```
cd thirdparty/Fairy-Stockfish-Lib/
cmake -H. -Bbuild -DCMAKE_BUILD_TYPE=Release
cmake --build build
```

This should produce a library, like so:

```
➜ ls build/*.so
build/libfairystockfish.so
```

Build Java Library
==================
In the root dir:
```
./gradlew publishToMavenLocal
```

Confirming the install
======================

This should build and install the library in your local maven repository which is in:
```
~/.m2/repository/
```

You can check that this library is there with:
```
➜ find ~/.m2/repository/ -name "*.jar" | grep fairy
/home/lakin/.m2/repository/org/playstrategy/fairystockfish/0.0.2/fairystockfish-0.0.2-linux-x86_64.jar
/home/lakin/.m2/repository/org/playstrategy/fairystockfish/0.0.2/fairystockfish-0.0.2.jar
```
