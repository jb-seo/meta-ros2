# Copyright 2018 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "The msg command for ROS 2 command line tools."
AUTHOR = "OSRF"
SECTION = "devel"
ROSDISTRO = "bouncy"
LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://package.xml;beginline=10;endline=10;md5=12c26a18c7f493fdc7e8a93b16b7c04f"

DEPENDS = "ament-index-python ros2cli"
SRC_URI = "https://github.com/ros2-gbp/ros2cli-release/archive/release/bouncy/${PN}/0.5.3-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "af143516cfef6b736598bec83a7f1905"
SRC_URI[sha256sum] = "c6ed70ce8fcc8662ac2f169d07a0cac5200909420052aa9b8261916fa2882be3"
S = "${WORKDIR}/ros2cli-release-release-bouncy-${PN}-0.5.3-0"

inherit catkin
