# Copyright 2018 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "Testing tools for C++, and is used in various OSRF projects."
AUTHOR = "OSRF"
SECTION = "devel"
ROSDISTRO = "bouncy"
LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://package.xml;beginline=10;endline=10;md5=12c26a18c7f493fdc7e8a93b16b7c04f"

DEPENDS = "cmake"
SRC_URI = "https://github.com/ros2-gbp/osrf_testings_tools_cpp-release/archive/release/bouncy/osrf_testing_tools_cpp/1.0.0-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "158b1daec95fb7fcabb909077ca0311f"
SRC_URI[sha256sum] = "89963800f07c639411561d77b9fe5a1f3fe845623a354a01b84a4ade36863797"
S = "${WORKDIR}/osrf_testings_tools_cpp-release-release-bouncy-osrf_testing_tools_cpp-1.0.0-0"

inherit catkin
