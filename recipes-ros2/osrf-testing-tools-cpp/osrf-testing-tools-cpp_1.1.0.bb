# Copyright 2019 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "Testing tools for C++, and is used in various OSRF projects."
AUTHOR = "OSRF"
SECTION = "devel"
ROSDISTRO = "crystal"
LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://package.xml;beginline=10;endline=10;md5=12c26a18c7f493fdc7e8a93b16b7c04f"

DEPENDS = "cmake"
SRC_URI = "https://github.com/ros2-gbp/osrf_testings_tools_cpp-release/archive/release/crystal/osrf_testing_tools_cpp/1.1.0-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "716f35c08e31dc56e14f93e237c2f676"
SRC_URI[sha256sum] = "853939b29d8c0e8889459cd6bb22fdd69cba853bfaf2099bd4ae5a1b18ba235b"
S = "${WORKDIR}/osrf_testings_tools_cpp-release-release-crystal-osrf_testing_tools_cpp-1.1.0-0"

inherit catkin
