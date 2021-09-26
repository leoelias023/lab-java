# JAVA Lab

## Some commands CLI

```bash
# Compile java inside a directory
javac -d "<diretorio_classes>" src/*.java

# Package classes directory and assets into JAR file
jar -c -v -m <MANIFEST_PATH> -C <BUILD_CLASSES_DIRECTORY> <DIRETORIO_RELATIVO_AO_BUILD>

# Execute jar file using CLI with main class specified in Manifest
java -jar <JAR_PATH> <JAVA_ARGS>
```
