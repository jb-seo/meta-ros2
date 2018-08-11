# Copyright 2018 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "Package containing the Python client."
AUTHOR = "OSRF"
SECTION = "devel"
ROSDISTRO = "bouncy"
LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://package.xml;beginline=10;endline=10;md5=12c26a18c7f493fdc7e8a93b16b7c04f"

DEPENDS = "ament-cmake ament-index-python python-cmake-module rcl rcutils rmw-implementation rmw-implementation-cmake"
SRC_URI = "https://github.com/ros2-gbp/${PN}-release/archive/release/bouncy/${PN}/0.5.3-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "0ca125a0ebee4e9b32bac882d388446f"
SRC_URI[sha256sum] = "3e18e3fd42820debba866ec6083116701b5fdd1b4f16340e63a0334cbbd28d50"
S = "${WORKDIR}/${PN}-release-release-bouncy-${PN}-0.5.3-0"

inherit catkin
