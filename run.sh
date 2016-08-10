#!/bin/bash

#ARGS="--blind -g /usr/bin/gringo -c /home/ps/bin/clasp-3.1.0-x86-linux $* xhail.small.lp"
WASP=/home/ps/bin/wasp-1c1d45
WASP=/home/ps/_setup/wasp/build/release/wasp

ARGS="--blind -g /usr/bin/gringo -c $WASP --budget 300 $* xhail_new.lp"

java -jar /usr/local/xhail-0.5.1/xhail.jar $ARGS
