Checkout this repo
==================
```
git clone --recursive <this-repo>
```

Build C++ library
=================
```
cd thirdparty/Fairy-Stockfish-Lib/
cmake -H. -Bbuild -DCMAKE_BUILD_TYPE=Release
cmake --build build
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
```~/.m2/repository/```

You can check that this library is there with:
```
➜ find ~/.m2/repository/ -name "*.jar" | grep fairy
/home/lakin/.m2/repository/fairystockfish/fairystockfish/0.0.1/fairystockfish-0.0.1.jar
```
