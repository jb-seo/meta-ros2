# Copyright 2019 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "The node command for ROS 2 command line tools."
AUTHOR = "OSRF"
SECTION = "devel"
ROSDISTRO = "bouncy"
LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://package.xml;beginline=10;endline=10;md5=12c26a18c7f493fdc7e8a93b16b7c04f"

DEPENDS = "ros2cli"
SRC_URI = "https://github.com/ros2-gbp/ros2cli-release/archive/release/bouncy/${PN}/0.5.4-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "b2f535ab7a4c5f192b42ef67ea732676"
SRC_URI[sha256sum] = "4f2a77a990cc8c6644cfac3c4fee5ff6271d8a51243b8b3873118ba64f1a6990"
S = "${WORKDIR}/ros2cli-release-release-bouncy-${PN}-0.5.4-0"


inherit ros
inherit setuptools3

