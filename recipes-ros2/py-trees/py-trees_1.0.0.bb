# Copyright 2019 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "Pythonic implementation of behaviour trees."
AUTHOR = "OSRF"
SECTION = "devel"
ROSDISTRO = "crystal"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=16;endline=16;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "python3-pydot python3-setuptools"
SRC_URI = "https://github.com/stonier/py_trees-release/archive/release/crystal/py_trees/1.0.0-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "2212adcbe8dc2bd33d0d2441afd36759"
SRC_URI[sha256sum] = "d6d9718074ce0450da38fe8e03037ace1c7cf0fe765e5ec42bdda1d15ff45022"
S = "${WORKDIR}/py_trees-release-release-crystal-py_trees-1.0.0-0"

inherit ament
