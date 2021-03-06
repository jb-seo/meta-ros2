# Copyright 2019 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "CMake functions which can discover and enumerate available implementations."
AUTHOR = "OSRF"
SECTION = "devel"
ROSDISTRO = "crystal"
LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://package.xml;beginline=11;endline=11;md5=12c26a18c7f493fdc7e8a93b16b7c04f"

DEPENDS = ""
SRC_URI = "https://github.com/ros2-gbp/rmw-release/archive/release/crystal/rmw_implementation_cmake/0.6.1-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "608860c59cfdb3f86f5a798efc3cc919"
SRC_URI[sha256sum] = "c6dcb8d1d0f673d63c8c2052c684efc7d91a714e6024ebc1e4805915d16b7d9c"
S = "${WORKDIR}/rmw-release-release-crystal-rmw_implementation_cmake-0.6.1-0"

inherit ament
