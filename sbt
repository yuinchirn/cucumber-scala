#!/bin/bash

cd `dirname $0`

./.sbt/bin/sbt "$@"
