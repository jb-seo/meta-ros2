# Copyright 2019 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "The node command for ROS 2 command line tools."
AUTHOR = "OSRF"
SECTION = "devel"
ROSDISTRO = "crystal"
LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://package.xml;beginline=10;endline=10;md5=12c26a18c7f493fdc7e8a93b16b7c04f"

DEPENDS = "ros2cli"
SRC_URI = "https://github.com/ros2-gbp/ros2cli-release/archive/release/crystal/${PN}/0.6.3-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "d3837740a2bb1af3ff1e6c94e99c1e03"
SRC_URI[sha256sum] = "5a98f8f75ece2380b33e4ba7477ff99b3a5cf6916a5c7f12ff9e68a6a4723d19"
S = "${WORKDIR}/ros2cli-release-release-crystal-${PN}-0.6.3-0"

inherit catkin
