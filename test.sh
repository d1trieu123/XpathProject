#!/usr/bin/env bash

CWD=$(pwd)
BUILD_DIR="$CWD/build"

#SRC="$CWD/src"
#ANTLR_SRC="$SRC/antlr"
#JAVA_SRC="$SRC/java"

TEST="$CWD/test"
TEST_DATA="$TEST/data"
TEST_QUERIES="$TEST/queries"

#JAVA_COMPILER=$(which javac)
#JAVA_COMPILER_FLAGS= -g
JVM_INVOCATION=$(which java)

ANTLR4_JAR="/home/d1trieu/antlr-4.13.1-complete.jar"

ENTRYPOINT=Main

TEST_QUERIES=$(find $TEST_QUERIES -type f -name "*.txt")

set -x;
for f in $TEST_QUERIES;
do

    $JVM_INVOCATION -cp .:$ANTLR4_JAR:$BUILD_DIR $ENTRYPOINT $f
    RET=$?

    if [ $RET -ne 0 ]; then
        echo "ERROR = $RET"
        exit
    fi

done

set +x;