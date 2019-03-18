# Copyright 2019 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "Test package, which uses things exported by osrf_testing_tools_cpp."
AUTHOR = "OSRF"
SECTION = "devel"
ROSDISTRO = "crystal"
LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://package.xml;beginline=10;endline=10;md5=12c26a18c7f493fdc7e8a93b16b7c04f"

DEPENDS = "cmake"
SRC_URI = "https://github.com/ros2-gbp/osrf_testings_tools_cpp-release/archive/release/crystal/test_osrf_testing_tools_cpp/1.1.0-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "69660058f564adacd07daf8fea263e05"
SRC_URI[sha256sum] = "1067dd7000f2588b491c497ab81fc7ace0c5e8be01ecb1ec000479e0a9842e8f"
S = "${WORKDIR}/osrf_testings_tools_cpp-release-release-crystal-test_osrf_testing_tools_cpp-1.1.0-0"

inherit ament
