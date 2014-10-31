#!/bin/sh

# ./sbt assembly
./bin/runscala.sh com.wordnik.swagger.codegen.OlsetJavaGenerator http://localhost:9000/api/api-docs ""
