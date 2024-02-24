#!/usr/bin/env bash

CWD=$(pwd)
BUILD_DIR="$CWD/build"

TEST="$CWD/test"
TEST_QUERIES="$TEST/queries"

JVM_INVOCATION=$(which java)

ANTLR4_JAR="/home/d1trieu/antlr-4.13.1-complete.jar"

ENTRYPOINT=Main

TEST_QUERIES=$(find $TEST_QUERIES -type f -name "*.txt")


for f in $TEST_QUERIES;
do
    set -x;
    $JVM_INVOCATION -cp .:$ANTLR4_JAR:$BUILD_DIR $ENTRYPOINT $f
    RET=$?
    set +x;

    if [ $RET -ne 0 ]; then
        echo "ERROR = $RET"
        exit
    fi

done