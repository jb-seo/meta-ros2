# Copyright 2018 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "The topic command for ROS 2 command line tools."
AUTHOR = "OSRF"
SECTION = "devel"
ROSDISTRO = "bouncy"
LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://package.xml;beginline=10;endline=10;md5=12c26a18c7f493fdc7e8a93b16b7c04f"

DEPENDS = "python3-yaml ros2cli ros2msg"
SRC_URI = "https://github.com/ros2-gbp/ros2cli-release/archive/release/bouncy/${PN}/0.5.3-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "325114c8dfa9af9adf7b3a217916941c"
SRC_URI[sha256sum] = "598fa4744bd62f324113b303168b352e25788455d5aecf2e9f2b5a71eee5d8e9"
S = "${WORKDIR}/ros2cli-release-release-bouncy-${PN}-0.5.3-0"

inherit catkin
