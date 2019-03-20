# Copyright 2019 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "Test package, which uses things exported by osrf_testing_tools_cpp."
AUTHOR = "OSRF"
SECTION = "devel"
ROSDISTRO = "bouncy"
LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://package.xml;beginline=10;endline=10;md5=12c26a18c7f493fdc7e8a93b16b7c04f"

DEPENDS = "cmake"
SRC_URI = "https://github.com/ros2-gbp/osrf_testings_tools_cpp-release/archive/release/bouncy/test_osrf_testing_tools_cpp/1.0.0-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "b2f1aaf58ac6fa250fddef96dfae5e52"
SRC_URI[sha256sum] = "17b7b7043a0f57bd6c86c1497330d17cb1a4dabd2d8aecea4dce8bc3722b8f4e"
S = "${WORKDIR}/osrf_testings_tools_cpp-release-release-bouncy-test_osrf_testing_tools_cpp-1.0.0-0"


inherit ros
inherit cmake

