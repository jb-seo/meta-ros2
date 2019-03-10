# Copyright 2019 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "The msg command for ROS 2 command line tools."
AUTHOR = "OSRF"
SECTION = "devel"
ROSDISTRO = "crystal"
LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://package.xml;beginline=10;endline=10;md5=12c26a18c7f493fdc7e8a93b16b7c04f"

DEPENDS = "ament-index-python ros2cli"
SRC_URI = "https://github.com/ros2-gbp/ros2cli-release/archive/release/crystal/${PN}/0.6.3-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "f67eb1a73acaa1c609d1f6062d2d7ff0"
SRC_URI[sha256sum] = "2f916f28321281cdd792cac534f4b4eb6b983c02eb551e58012c7d2a041442ec"
S = "${WORKDIR}/ros2cli-release-release-crystal-${PN}-0.6.3-0"

inherit catkin
