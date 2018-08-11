# Copyright 2018 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "The node command for ROS 2 command line tools."
AUTHOR = "OSRF"
SECTION = "devel"
ROSDISTRO = "bouncy"
LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://package.xml;beginline=10;endline=10;md5=12c26a18c7f493fdc7e8a93b16b7c04f"

DEPENDS = "ros2cli"
SRC_URI = "https://github.com/ros2-gbp/ros2cli-release/archive/release/bouncy/${PN}/0.5.3-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "70077d539364977ed4c3ce7f6e46a80e"
SRC_URI[sha256sum] = "9b3303b63e5f4c8e2e2ff035f3403a4872724188b416c331d146182d05d1e7d5"
S = "${WORKDIR}/ros2cli-release-release-bouncy-${PN}-0.5.3-0"

inherit catkin
