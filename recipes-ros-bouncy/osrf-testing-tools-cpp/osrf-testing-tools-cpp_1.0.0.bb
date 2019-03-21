# Copyright 2019 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "Testing tools for C++, and is used in various OSRF projects."
AUTHOR = "OSRF"
SECTION = "devel"
ROSDISTRO = "bouncy"
LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://package.xml;beginline=10;endline=10;md5=12c26a18c7f493fdc7e8a93b16b7c04f"

DEPENDS = "cmake"
SRC_URI = "https://github.com/ros2-gbp/osrf_testings_tools_cpp-release/archive/release/bouncy/osrf_testing_tools_cpp/1.0.0-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "f8d635e9dba041e6b39a1a267cd1b110"
SRC_URI[sha256sum] = "c0a48eb994360025f79e3ef4dcb19d817b5b51a606a1696d0d7a99bfa83d83c6"
S = "${WORKDIR}/osrf_testings_tools_cpp-release-release-bouncy-osrf_testing_tools_cpp-1.0.0-0"

inherit ros
inherit cmake


