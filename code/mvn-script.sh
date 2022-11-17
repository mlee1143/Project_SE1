#!/bin/bash

cd HiLowGame

if [[ $1 == "verify" ]]
then
	../maven/bin/mvn clean verify
elif [[ $1 == "compile" ]]
then
	../maven/bin/mvn clean compile
elif [[ $1 == "test" ]]
then
	../maven/bin/mvn clean test
elif [[ $1 == "run" ]]
then
	../maven/bin/mvn clean javafx:run
fi
